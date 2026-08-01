package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: AESUtils.java */
/* loaded from: classes.dex */
public class pvs {

    /* compiled from: AESUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.pvs$pvs, reason: collision with other inner class name */
    static class C0057pvs {
        static final Random pvs = pvs.vG();
    }

    public static JSONObject pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return pvs(jSONObject.toString());
    }

    public static JSONObject pvs(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String icD = icD(str);
                if (!TextUtils.isEmpty(icD)) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, icD);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (Throwable unused) {
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("cypher", 0);
        }
        return jSONObject;
    }

    public static String icD(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String pvs = pvs();
        String pvs2 = pvs(pvs, 32);
        String icD = icD();
        String pvs3 = (pvs2 == null || icD == null) ? null : com.bytedance.sdk.component.Jd.pvs.pvs(str, icD, pvs2);
        StringBuilder sb = new StringBuilder(ExifInterface.GPS_MEASUREMENT_3D);
        sb.append(pvs).append(icD).append(pvs3);
        return sb.toString();
    }

    public static String vG(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String pvs = pvs(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || pvs == null) ? str : com.bytedance.sdk.component.Jd.pvs.icD(str.substring(49), substring, pvs);
    }

    public static String pvs() {
        String pvs = pvs(16);
        if (pvs == null || pvs.length() != 32) {
            return null;
        }
        return pvs;
    }

    public static String pvs(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String icD() {
        String pvs = pvs(8);
        if (pvs == null || pvs.length() != 16) {
            return null;
        }
        return pvs;
    }

    public static String pvs(int i) {
        try {
            byte[] bArr = new byte[i];
            C0057pvs.pvs.nextBytes(bArr);
            return NB.pvs(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random vG() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
