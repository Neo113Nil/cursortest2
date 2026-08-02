package io.flutter.plugins;

import A0.e;
import B0.N;
import C0.g;
import D0.i0;
import android.util.Log;
import b.InterfaceC0163a;
import h0.p;
import j0.C0250a;
import k0.C0253a;
import n0.c;

@InterfaceC0163a
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f3266d.a(new C0250a());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e2);
        }
        try {
            cVar.f3266d.a(new C0253a());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e3);
        }
        try {
            cVar.f3266d.a(new e());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e4);
        }
        try {
            cVar.f3266d.a(new N());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e5);
        }
        try {
            cVar.f3266d.a(new p());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e6);
        }
        try {
            cVar.f3266d.a(new g());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e7);
        }
        try {
            cVar.f3266d.a(new i0());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e8);
        }
    }
}
