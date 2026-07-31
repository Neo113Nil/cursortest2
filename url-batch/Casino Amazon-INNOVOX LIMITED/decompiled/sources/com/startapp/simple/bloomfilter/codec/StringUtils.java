package com.startapp.simple.bloomfilter.codec;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class StringUtils {
    private static byte[] getBytes(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] getBytesUtf8(String str) {
        return getBytes(str, Charsets.UTF_8);
    }

    private static String newString(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static String newStringUtf8(byte[] bArr) {
        return newString(bArr, Charsets.UTF_8);
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
