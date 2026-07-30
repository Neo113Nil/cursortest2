package com.baidu.bbalbscesium.m;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static String a(byte[] bArr, String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (z7) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, boolean z7) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z7);
        } catch (NoSuchAlgorithmException e8) {
            throw new RuntimeException(e8);
        }
    }
}
