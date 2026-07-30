package com.moyoung.dafit.module.common.utils;

import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
public class e0 {
    private e0() {
    }

    public static int rgb565(@ColorInt int i8) {
        String binaryString = Integer.toBinaryString(i8);
        return toInt(binaryString.substring(8, 13) + binaryString.substring(16, 22) + binaryString.substring(24, 29));
    }

    public static byte toByte(char c8) {
        return (byte) "0123456789abcdef".indexOf(c8);
    }

    public static int toInt(String str) {
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (toByte(str.charAt(i9)) > 0) {
                i8 = (int) (i8 + Math.pow(2.0d, (length - i9) - 1));
            }
        }
        return i8;
    }
}
