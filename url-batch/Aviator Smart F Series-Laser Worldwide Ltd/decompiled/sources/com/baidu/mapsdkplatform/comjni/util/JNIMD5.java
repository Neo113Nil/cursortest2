package com.baidu.mapsdkplatform.comjni.util;

/* loaded from: classes2.dex */
public class JNIMD5 {
    public static native String decodeCoordHash(String str);

    public static native String encodeCoordHash(double d8, double d9);

    public static native String encodeUrlParamsValue(String str);

    public static native String getSignMD5String(String str);

    public static native String getSignMD5StringUTF8(String str);

    public static native String getUrlNeedInfo();
}
