package com.baidu.mapsdkplatform.comjni.util;

/* loaded from: classes2.dex */
public class AppMD5 {
    public static String decodeCoordHash(String str) {
        return JNIMD5.decodeCoordHash(str);
    }

    public static String encodeCoordHash(double d8, double d9) {
        return JNIMD5.encodeCoordHash(d8, d9);
    }

    public static String encodeUrlParamsValue(String str) {
        return JNIMD5.encodeUrlParamsValue(str);
    }

    public static String getSignMD5String(String str) {
        return JNIMD5.getSignMD5String(str);
    }

    public static String getSignMD5StringUTF8(String str) {
        return JNIMD5.getSignMD5StringUTF8(str);
    }

    public static String getUrlNeedInfo() {
        return JNIMD5.getUrlNeedInfo();
    }
}
