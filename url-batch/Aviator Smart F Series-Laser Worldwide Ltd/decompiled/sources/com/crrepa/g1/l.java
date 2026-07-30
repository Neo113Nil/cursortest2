package com.crrepa.g1;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class l {
    public static String a(String str) {
        byte[] a8 = c.a(str);
        byte b8 = a8[a8.length - 1];
        a8[a8.length - 1] = b8 >= 255 ? (byte) 0 : (byte) (b8 + 1);
        return a(a8);
    }

    public static String a(byte[] bArr) {
        String str = "";
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() <= 1) {
                hexString = (String) TextUtils.concat("0" + hexString);
            }
            str = str + hexString + ":";
        }
        return str.substring(0, str.lastIndexOf(":")).toUpperCase();
    }
}
