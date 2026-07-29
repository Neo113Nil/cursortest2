package com.aiming.mdt.utils;

import com.umeng.commonsdk.proguard.ao;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.aiming.mdt.utils.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0283 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static byte[] f824 = {119, 30, -72, 6, -96, 35, -124, 81, -44, 5, ao.m, -88, -123, 51, 12, 21};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static byte[] m974(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(f824, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static byte[] m975(String str) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(f824, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bytes);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static byte[] m976(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(f824, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr);
    }
}
