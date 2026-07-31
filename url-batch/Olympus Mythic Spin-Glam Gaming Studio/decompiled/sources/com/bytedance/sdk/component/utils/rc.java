package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public class rc {
    private static final byte[] zmn = zmn("VP8X");

    private static byte[] zmn(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean zmn(byte[] bArr, int i) {
        boolean zmn2;
        int i2;
        try {
            zmn2 = zmn(bArr, i + 12, zmn);
            i2 = i + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i2) {
            return false;
        }
        return zmn2 && ((bArr[i2] & 2) == 2);
    }

    private static boolean zmn(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
