package io.flutter.plugins;

import android.util.Log;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import d0.c;
import s0.J;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f1791d.a(new JniPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e2);
        }
        try {
            cVar.f1791d.a(new JniFlutterPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e3);
        }
        try {
            cVar.f1791d.a(new J());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e4);
        }
    }
}
