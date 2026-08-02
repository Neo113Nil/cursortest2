package io.flutter.plugins;

import D2.d;
import U1.C0081b;
import W1.K;
import X1.f;
import Y1.c0;
import android.util.Log;
import com.startapp.flutter.sdk.StartAppSdkPlugin;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.embedding.engine.FlutterEngine;
import m0.C1111d;
import p0.C1176a;
import x1.l;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.f9102d.a(new AppMetricaPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e3);
        }
        try {
            flutterEngine.f9102d.a(new d());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e4);
        }
        try {
            flutterEngine.f9102d.a(new C1111d());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin gallery_saver_plus, carnegietechnologies.gallery_saver.GallerySaverPlugin", e5);
        }
        try {
            flutterEngine.f9102d.a(new C0081b());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e6);
        }
        try {
            flutterEngine.f9102d.a(new V1.d());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e7);
        }
        try {
            flutterEngine.f9102d.a(new C1176a());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e8);
        }
        try {
            flutterEngine.f9102d.a(new K());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e9);
        }
        try {
            flutterEngine.f9102d.a(new l());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e10);
        }
        try {
            flutterEngine.f9102d.a(new StartAppSdkPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin startapp_sdk, com.startapp.flutter.sdk.StartAppSdkPlugin", e11);
        }
        try {
            flutterEngine.f9102d.a(new f());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e12);
        }
        try {
            flutterEngine.f9102d.a(new c0());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e13);
        }
    }
}
