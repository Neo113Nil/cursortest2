package io.flutter.plugins;

import W3.e;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import com.mediadevkit.fvp.FvpPlugin;
import com.startapp.flutter.sdk.StartAppSdkPlugin;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new AppMetricaPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add(new FvpPlugin());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin fvp, com.mediadevkit.fvp.FvpPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add(new InAppPurchasePlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new JniPlugin());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add(new JniFlutterPlugin());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new StartAppSdkPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin startapp_sdk, com.startapp.flutter.sdk.StartAppSdkPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e13);
        }
    }
}
