package com.bytedance.sdk.component.fb;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.B5;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class zmn {
    private static String zmn;

    public static String zmn(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(zmn)) {
                zmn = zmn(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(zmn);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes(B5.O)), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String zmn(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(B5.O)), 0);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String fs(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(decode));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String fs(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(zmn)) {
                zmn = zmn(AESEncrypter.DEFAULT_ALGORITHM);
            }
            Cipher cipher = Cipher.getInstance(zmn);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(decode));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String zmn(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(zmn(str.getBytes(), iArr));
    }

    public static byte[] zmn(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ iArr[i % iArr.length]);
        }
        return bArr2;
    }
}
