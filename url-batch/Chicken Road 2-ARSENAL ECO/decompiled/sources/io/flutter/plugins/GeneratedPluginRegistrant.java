package io.flutter.plugins;

import E3.c;
import android.util.Log;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import k2.f;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f603d.a(new JniPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e4);
        }
        try {
            cVar.f603d.a(new JniFlutterPlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e7);
        }
        try {
            cVar.f603d.a(new f());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin onesignal_flutter, com.onesignal.flutter.OneSignalPlugin", e8);
        }
    }
}
