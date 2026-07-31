package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;

/* loaded from: classes.dex */
public class SafeBase64 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14498a = "SafeBase64";

    public static byte[] decode(byte[] bArr, int i4) {
        try {
            return Base64.decode(bArr, i4);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message0 : " + e4.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i4) {
        try {
            return Base64.encode(bArr, i4);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message3 : " + e4.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i4) {
        try {
            return Base64.encodeToString(bArr, i4);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message5 : " + e4.getMessage());
            return "";
        }
    }

    public static String encodeToString(byte[] bArr, int i4, int i5, int i6) {
        try {
            return Base64.encodeToString(bArr, i4, i5, i6);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message6 : " + e4.getMessage());
            return "";
        }
    }

    public static byte[] decode(byte[] bArr, int i4, int i5, int i6) {
        try {
            return Base64.decode(bArr, i4, i5, i6);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message1 : " + e4.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int i4, int i5, int i6) {
        try {
            return Base64.encode(bArr, i4, i5, i6);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message4 : " + e4.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decode(String str, int i4) {
        try {
            return Base64.decode(str, i4);
        } catch (Exception e4) {
            Log.e(f14498a, e4.getClass().getSimpleName() + " , message2 : " + e4.getMessage());
            return new byte[0];
        }
    }
}
