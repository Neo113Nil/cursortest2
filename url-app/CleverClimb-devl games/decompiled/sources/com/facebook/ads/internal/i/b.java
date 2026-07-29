package com.facebook.ads.internal.i;

import android.os.Build;
import android.support.v4.os.EnvironmentCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5152a = "b";

    b() {
    }

    static String a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "is_emu", String.valueOf(b()));
        return jSONObject.toString();
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    private static boolean b() {
        return Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }
}
