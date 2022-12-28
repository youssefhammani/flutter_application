package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin facebook_audience_network, com.dsi.facebook_audience_network.FacebookAudienceNetworkPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.iori.flutter_applovin_max.FlutterApplovinMaxPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_applovin_max, dev.iori.flutter_applovin_max.FlutterApplovinMaxPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.amolg.flutterbarcodescanner.FlutterBarcodeScannerPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_barcode_scanner, com.amolg.flutterbarcodescanner.FlutterBarcodeScannerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.metamorfosis_labs.flutter_ironsource_x.FlutterIronsource_xPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_ironsource_x, com.metamorfosis_labs.flutter_ironsource_x.FlutterIronsource_xPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.bruno.native_admob_flutter.NativeAdmobFlutterPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin native_admob_flutter, com.bruno.native_admob_flutter.NativeAdmobFlutterPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new pl.ukaszapps.soundpool.SoundpoolPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin soundpool, pl.ukaszapps.soundpool.SoundpoolPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.rebeloid.unity_ads.UnityAdsPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin unity_ads_plugin, com.rebeloid.unity_ads.UnityAdsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
  }
}
