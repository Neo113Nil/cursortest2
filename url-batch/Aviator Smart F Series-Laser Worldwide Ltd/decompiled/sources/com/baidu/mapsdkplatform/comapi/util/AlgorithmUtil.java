package com.baidu.mapsdkplatform.comapi.util;

import android.text.TextUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class AlgorithmUtil {
    private AlgorithmUtil() {
    }

    private static byte[] a(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("ASCII"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    private static byte[] b(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(2, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    private static byte[] c(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    private static byte[] d(String str, String str2, byte[] bArr) {
        if (str2 == null) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(str.getBytes()));
        int length = bArr.length;
        while (length % 16 != 0) {
            length++;
        }
        byte[] bArr2 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 < bArr.length) {
                bArr2[i8] = bArr[i8];
            } else {
                bArr2[i8] = 0;
            }
        }
        return cipher.doFinal(bArr2);
    }

    public static byte[] getDecryptCBCInfo(String str, String str2, byte[] bArr) {
        return b(str, str2, bArr);
    }

    public static byte[] getDecryptInfo(String str, String str2, byte[] bArr) {
        return c(str, str2, bArr);
    }

    public static byte[] getUrlNeedInfo(String str, String str2, byte[] bArr) {
        return a(str, str2, bArr);
    }

    public static byte[] setUrlNeedInfo(String str, String str2, byte[] bArr) {
        return d(str, str2, bArr);
    }
}
