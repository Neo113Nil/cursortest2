package com.my.tracker.obfuscated;

import java.security.MessageDigest;

/* renamed from: com.my.tracker.obfuscated.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1617c0 {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b4 : digest) {
                sb.append(String.format("%02X", Byte.valueOf(b4)));
            }
            return sb.toString().toLowerCase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
