package com.baidu.platform.comapi.util;

import com.baidu.platform.comjni.JNIBaseApi;

/* loaded from: classes2.dex */
public final class URLEncodeUtils extends JNIBaseApi {
    public static String generateSign(int i8, String str) {
        return i8 == 1 ? nativeMD5Sign(str) : i8 == 2 ? nativeWebSign(str) : i8 == 3 ? nativeOperSign(str) : "";
    }

    public static String getMD5String(String str) {
        return MD5.getMD5String(str);
    }

    public static String getUrlParamsSign(String str) {
        return nativeGetUrlParamsSign(str);
    }

    private static native String nativeGetUrlParamsSign(String str);

    private static native String nativeMD5Sign(String str);

    private static native String nativeOperSign(String str);

    private static native String nativeUrlEncode(String str);

    private static native String nativeWebSign(String str);

    public static String urlEncode(String str) {
        return nativeUrlEncode(str);
    }
}
