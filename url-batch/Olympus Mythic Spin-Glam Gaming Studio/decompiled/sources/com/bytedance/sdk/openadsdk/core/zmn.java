package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* loaded from: classes5.dex */
public final class zmn {
    private static final String zmn = zn();
    private static final String fs = kgc.fb().fb();

    public static String zmn() {
        return new String(Base64.decode(zmn, 0)).substring(2);
    }

    public static String fs() {
        return new String(Base64.decode(fs, 0)).substring(2);
    }

    private static String zn() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i = 23; i >= 0; i--) {
            cArr2[23 - i] = (char) (cArr[i] ^ 255);
        }
        return new String(cArr2);
    }
}
