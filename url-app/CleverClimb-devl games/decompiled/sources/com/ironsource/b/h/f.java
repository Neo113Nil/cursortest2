package com.ironsource.b.h;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceAES.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6940a;

    public static synchronized String a(String str, String str2) {
        synchronized (f.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                SecretKeySpec a2 = a(str);
                byte[] bytes = str2.getBytes("UTF8");
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, a2, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(bytes), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public static synchronized String b(String str, String str2) {
        synchronized (f.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                SecretKeySpec a2 = a(str);
                byte[] bArr = new byte[16];
                Arrays.fill(bArr, (byte) 0);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                byte[] decode = Base64.decode(str2, 0);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, a2, ivParameterSpec);
                return new String(cipher.doFinal(decode));
            } catch (Exception e) {
                e.printStackTrace();
                if (f6940a) {
                    return "";
                }
                f6940a = true;
                JSONObject a3 = g.a(false);
                try {
                    a3.put("status", "false");
                    a3.put("reason", 1);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.ironsource.b.b.d.c().a(new com.ironsource.a.b(114, a3), "https://track.atom-data.io");
                return "";
            }
        }
    }

    private static SecretKeySpec a(String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        System.arraycopy(bytes, 0, bArr, 0, bytes.length < bArr.length ? bytes.length : bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
