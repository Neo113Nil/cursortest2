package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Polygon;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;

/* loaded from: classes2.dex */
public class BmPolygon extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Polygon f8911i;

    public BmPolygon() {
        super(10, nativeCreate());
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeAddHoleGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetBloomAlpha(long j8, float f8);

    private static native boolean nativeSetBloomBlurTimes(long j8, int i8);

    private static native boolean nativeSetBloomGradientASpeed(long j8, float f8);

    private static native boolean nativeSetBloomWidth(long j8, float f8);

    private static native boolean nativeSetDrawFullscreenMaskFlag(long j8, boolean z7);

    private static native boolean nativeSetJointType(long j8, int i8);

    private static native boolean nativeSetLineBloomDirection(long j8, int i8);

    private static native boolean nativeSetLineBloomMode(long j8, int i8);

    private static native boolean nativeSetSurfaceStyle(long j8, long j9);

    private static native boolean nativeSetThin(long j8, int i8);

    private static native boolean nativeSetThinFactor(long j8, float f8);

    public void a(Polygon polygon) {
        this.f8911i = polygon;
    }

    public boolean b(BmGeoElement bmGeoElement) {
        return nativeAddHoleGeoElement(getNativeInstance(), bmGeoElement.getNativeInstance());
    }

    public boolean c() {
        return nativeClearGeoElements(getNativeInstance());
    }

    public Polygon d() {
        return this.f8911i;
    }

    public boolean e(float f8) {
        return nativeSetThinFactor(getNativeInstance(), f8);
    }

    public boolean f(int i8) {
        return nativeSetJointType(getNativeInstance(), i8);
    }

    public boolean g(int i8) {
        return nativeSetLineBloomDirection(getNativeInstance(), i8);
    }

    public boolean h(int i8) {
        return nativeSetLineBloomMode(getNativeInstance(), i8);
    }

    public boolean i(int i8) {
        return nativeSetThin(getNativeInstance(), i8);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddGeoElement(getNativeInstance(), bmGeoElement.getNativeInstance());
    }

    public boolean b(float f8) {
        return nativeSetBloomAlpha(getNativeInstance(), f8);
    }

    public boolean c(float f8) {
        return nativeSetBloomGradientASpeed(getNativeInstance(), f8);
    }

    public boolean d(float f8) {
        return nativeSetBloomWidth(getNativeInstance(), f8);
    }

    public boolean e(int i8) {
        return nativeSetBloomBlurTimes(getNativeInstance(), i8);
    }

    public void a(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceStyle(getNativeInstance(), bmSurfaceStyle.getNativeInstance());
        } else {
            nativeSetSurfaceStyle(getNativeInstance(), 0L);
        }
    }
}
