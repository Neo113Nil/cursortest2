package com.aiming.mdt.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.aiming.mdt.utils.ʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0284 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Charset f825 = Charset.forName("UTF-8");

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static byte[] m977(String str, byte[] bArr) {
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m978(String str) {
        byte[] m977 = m977("MD5", str.getBytes(f825));
        StringBuilder sb = new StringBuilder(m977.length << 1);
        for (byte b2 : m977) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
