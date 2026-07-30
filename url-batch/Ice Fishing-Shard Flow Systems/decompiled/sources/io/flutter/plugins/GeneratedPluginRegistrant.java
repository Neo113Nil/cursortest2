package io.flutter.plugins;

import M2.f;
import android.util.Log;
import b4.C0277d;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import e4.C0375a;
import f4.b;
import i4.C0547c;
import x4.C1009d;
import y4.K;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(C0547c c0547c) {
        try {
            c0547c.f5504d.a(new C0277d());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin advertising_id, com.os.operando.advertisingid.AdvertisingIdPlugin", e7);
        }
        try {
            c0547c.f5504d.a(new C0375a());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin android_play_install_referrer, de.lschmierer.android_play_install_referrer.AndroidPlayInstallReferrerPlugin", e8);
        }
        try {
            c0547c.f5504d.a(new AppsflyerSdkPlugin());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", e9);
        }
        try {
            c0547c.f5504d.a(new b());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e10);
        }
        try {
            c0547c.f5504d.a(new C1009d());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e11);
        }
        try {
            c0547c.f5504d.a(new InAppWebViewFlutterPlugin());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e12);
        }
        try {
            c0547c.f5504d.a(new JniPlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e13);
        }
        try {
            c0547c.f5504d.a(new JniFlutterPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e14);
        }
        try {
            c0547c.f5504d.a(new f());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin onesignal_flutter, com.onesignal.flutter.OneSignalPlugin", e15);
        }
        try {
            c0547c.f5504d.a(new K());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e16);
        }
        try {
            c0547c.f5504d.a(new z4.f());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e17);
        }
    }
}
