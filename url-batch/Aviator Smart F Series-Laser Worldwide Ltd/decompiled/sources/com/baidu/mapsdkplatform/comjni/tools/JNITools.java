package com.baidu.mapsdkplatform.comjni.tools;

/* loaded from: classes2.dex */
public class JNITools {
    public static native boolean CoordinateEncryptEx(float f8, float f9, String str, Object obj);

    public static native boolean CoordinateEncryptMc(double d8, double d9, Object obj);

    public static native void GetDistanceByMC(Object obj);

    public static native String GetToken();

    public static native boolean TransGeoStr2ComplexPt(Object obj);

    public static native boolean TransGeoStr2Pt(Object obj);

    public static native void TransNodeStr2Pt(Object obj);

    public static native double[] baiduToGcj(double d8, double d9);

    public static native byte[] decryptPNKD(byte[] bArr);

    public static native double[] gcjToBaidu(double d8, double d9);

    public static native String getAESSaltKey(String str);

    public static native String getAESViKey(String str);

    public static native String getDeviceIDAESIvKey(String str);

    public static native String getDeviceIDAESSaltKey(String str);

    public static native String getLicenseAESIvKey(String str, String str2);

    public static native String getLicenseAESSaltKey(String str, String str2);

    public static native String getProjectionPt(String str);

    public static native int initClass(Object obj, int i8);

    public static native void openLogEnable(boolean z7, int i8);

    public static native double[] wgsToBaidu(double d8, double d9);
}
