package com.youappi.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

/* loaded from: classes2.dex */
public class i {
    public static String a(String str) {
        return "https://optout.youappi.com?userid={userid}".replace("{userid}", str);
    }

    public static Bitmap b(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }
}
