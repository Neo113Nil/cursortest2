package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzza {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            int i4 = b4 & 255;
            sb.append("0123456789abcdef".charAt(i4 / 16));
            sb.append("0123456789abcdef".charAt(i4 % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                int digit = Character.digit(str.charAt(i5), 16);
                int digit2 = Character.digit(str.charAt(i5 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i4] = (byte) ((digit << 4) + digit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
