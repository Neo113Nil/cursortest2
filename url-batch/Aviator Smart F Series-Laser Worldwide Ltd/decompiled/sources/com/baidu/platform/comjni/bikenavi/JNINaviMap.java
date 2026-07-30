package com.baidu.platform.comjni.bikenavi;

/* loaded from: classes2.dex */
public class JNINaviMap {
    public native boolean convertGeoPoint2ScrPt(long j8, int[] iArr, int[] iArr2);

    public native boolean convertGeoPoint2ScrPt4Ar(long j8, int[] iArr, int[] iArr2);

    public native boolean convertScrPt2GeoPoint(long j8, int[] iArr, int[] iArr2);

    public native void dragMap(long j8, int i8, int i9, int i10, int i11, long j9, long j10);

    public native float getRouteDirection(long j8);

    public native boolean initExtMap(long j8, long j9);

    public native boolean move2ScreenPoint(long j8, int i8, int i9, int i10);

    public native boolean resetBackgroundColor(long j8);

    public native boolean resetMapStatusLimits(long j8);

    public native boolean setArMapStatusLimits(long j8);

    public native boolean setBackgroundTransparent(long j8);

    public native void setExtDefaultLevel(long j8, float f8);

    public native void setExtDefaultOverlooking(long j8, float f8);

    public native void setExtRotateMode(long j8, int i8);

    public native boolean setLevel(long j8, float f8);

    public native void setRouteMargin(long j8, float f8, float f9, float f10, float f11);

    public native boolean showBaseLayers(long j8, boolean z7);

    public native boolean showLayer(long j8, int i8, boolean z7);

    public native void uninitExtMap(long j8);

    public native boolean updataBaseLayers(long j8);

    public native boolean updateLayer(long j8, int i8);
}
