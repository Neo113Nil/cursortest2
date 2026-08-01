package io.flutter.plugins;

import B.t;
import F.c;
import S.d;
import android.util.Log;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f226d.a(new d());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e2);
        }
        try {
            cVar.f226d.a(new t());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e3);
        }
    }
}
