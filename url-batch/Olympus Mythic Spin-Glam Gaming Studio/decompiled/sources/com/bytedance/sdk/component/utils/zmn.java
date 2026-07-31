package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {

    /* renamed from: com.bytedance.sdk.component.utils.zmn$zmn, reason: collision with other inner class name */
    static class C0136zmn {
        static final Random zmn = zmn.zn();
    }

    public static JSONObject zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return zmn(jSONObject.toString());
    }

    public static JSONObject zmn(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String fs = fs(str);
                if (!TextUtils.isEmpty(fs)) {
                    jSONObject.put("message", fs);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (Throwable unused) {
            jSONObject.put("message", str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static String fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String zmn = zmn();
        String zmn2 = zmn(zmn, 32);
        String fs = fs();
        return 3 + zmn + fs + ((zmn2 == null || fs == null) ? null : com.bytedance.sdk.component.fb.zmn.zmn(str, fs, zmn2));
    }

    public static String zn(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String zmn = zmn(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || zmn == null) ? str : com.bytedance.sdk.component.fb.zmn.fs(str.substring(49), substring, zmn);
    }

    public static String zmn() {
        String zmn = zmn(16);
        if (zmn == null || zmn.length() != 32) {
            return null;
        }
        return zmn;
    }

    public static String zmn(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String fs() {
        String zmn = zmn(8);
        if (zmn == null || zmn.length() != 16) {
            return null;
        }
        return zmn;
    }

    public static String zmn(int i) {
        try {
            byte[] bArr = new byte[i];
            C0136zmn.zmn.nextBytes(bArr);
            return btk.zmn(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random zn() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
