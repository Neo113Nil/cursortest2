package com.baidu.ar.marker;

/* loaded from: classes.dex */
public interface IMarkerDataProvider {
    float[] getGPS();

    float[] getGravityDirection();

    String getSessionId();

    String getUserId();

    String getVersion();

    void queryFrameResult(int i8, String str);

    void setLocationData(boolean z7, Object obj);

    void setLocationPoints(int i8, double[] dArr);

    void setLocationTransforms(float[] fArr);

    void setVpasState(int i8, int i9, float f8);

    void setVpsLocation(float f8, float f9);

    void transDataFromJNI(byte[] bArr);
}
