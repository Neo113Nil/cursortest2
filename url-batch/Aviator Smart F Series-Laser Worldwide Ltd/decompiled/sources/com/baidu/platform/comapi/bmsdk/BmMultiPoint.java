package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.MultiPoint;
import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class BmMultiPoint extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private MultiPoint f8906i;

    /* renamed from: j, reason: collision with root package name */
    private BmDrawableResource f8907j;

    /* renamed from: k, reason: collision with root package name */
    private int f8908k;

    public BmMultiPoint() {
        super(24, nativeCreate());
        this.f8908k = -1;
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetAnchorX(long j8, float f8);

    private static native boolean nativeSetAnchorY(long j8, float f8);

    private static native boolean nativeSetDrawableResource(long j8, long j9);

    private static native boolean nativeSetHeight(long j8, double d8);

    private static native boolean nativeSetPosition(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetWidth(long j8, double d8);

    public void a(MultiPoint multiPoint) {
        this.f8906i = multiPoint;
    }

    public boolean b(double d8) {
        return nativeSetWidth(this.nativeInstance, d8);
    }

    public boolean c() {
        return nativeClearGeoElements(this.nativeInstance);
    }

    public int d() {
        return this.f8908k;
    }

    public MultiPoint e() {
        return this.f8906i;
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
    }

    public boolean b(float f8) {
        return nativeSetAnchorX(this.nativeInstance, f8);
    }

    public boolean c(float f8) {
        return nativeSetAnchorY(this.nativeInstance, f8);
    }

    public void e(int i8) {
        this.f8908k = i8;
    }

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return nativeSetPosition(this.nativeInstance, bVar.f8938a, bVar.f8939b, i.DOUBLE_EPSILON);
    }

    public boolean a(double d8) {
        return nativeSetHeight(this.nativeInstance, d8);
    }

    public boolean a(BmDrawableResource bmDrawableResource) {
        this.f8907j = bmDrawableResource;
        if (bmDrawableResource != null) {
            return nativeSetDrawableResource(this.nativeInstance, bmDrawableResource.getNativeInstance());
        }
        return nativeSetDrawableResource(this.nativeInstance, 0L);
    }
}
