package io.flutter.plugins;

import A0.d;
import B0.O;
import android.util.Log;
import e0.C0126e;
import l0.c;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f2778d.a(new C0126e());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin flutter_custom_tabs_android, com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin", e2);
        }
        try {
            cVar.f2778d.a(new d());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e3);
        }
        try {
            cVar.f2778d.a(new O());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e4);
        }
    }
}
