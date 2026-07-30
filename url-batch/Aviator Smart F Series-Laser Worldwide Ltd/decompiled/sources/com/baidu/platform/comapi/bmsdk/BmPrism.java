package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Prism;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;

/* loaded from: classes2.dex */
public class BmPrism extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Prism f8912i;

    public BmPrism() {
        super(23, nativeCreate());
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetAnimateType(long j8, int i8);

    private static native boolean nativeSetBuildingID(long j8, String str);

    private static native boolean nativeSetFloorAnimateType(long j8, int i8);

    private static native boolean nativeSetFloorHeight(long j8, float f8);

    private static native boolean nativeSetHasFloor(long j8, boolean z7);

    private static native boolean nativeSetHeight(long j8, float f8);

    private static native boolean nativeSetIsAnimation(long j8, boolean z7);

    private static native boolean nativeSetIsBuilding(long j8, boolean z7);

    private static native boolean nativeSetIsRoundedCorner(long j8, boolean z7);

    private static native boolean nativeSetLastFloorHeight(long j8, float f8);

    private static native boolean nativeSetRoundedCornerRadius(long j8, float f8);

    private static native boolean nativeSetSurfaceFloorSideStyle(long j8, long j9);

    private static native boolean nativeSetSurfaceFloorTopStyle(long j8, long j9);

    private static native boolean nativeSetSurfaceSideStyle(long j8, long j9);

    private static native boolean nativeSetSurfaceTopStyle(long j8, long j9);

    public void a(Prism prism) {
        this.f8912i = prism;
    }

    public void b(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceFloorTopStyle(this.nativeInstance, bmSurfaceStyle.nativeInstance);
        } else {
            nativeSetSurfaceFloorTopStyle(this.nativeInstance, 0L);
        }
    }

    public boolean c() {
        return nativeClearGeoElements(this.nativeInstance);
    }

    public void d(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceTopStyle(this.nativeInstance, bmSurfaceStyle.nativeInstance);
        } else {
            nativeSetSurfaceTopStyle(this.nativeInstance, 0L);
        }
    }

    public boolean e(boolean z7) {
        return nativeSetHasFloor(this.nativeInstance, z7);
    }

    public boolean f(int i8) {
        return nativeSetFloorAnimateType(this.nativeInstance, i8);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
    }

    public void c(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceSideStyle(this.nativeInstance, bmSurfaceStyle.nativeInstance);
        } else {
            nativeSetSurfaceSideStyle(this.nativeInstance, 0L);
        }
    }

    public boolean e(int i8) {
        return nativeSetAnimateType(this.nativeInstance, i8);
    }

    public boolean f(boolean z7) {
        return nativeSetIsRoundedCorner(this.nativeInstance, z7);
    }

    public void a(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceFloorSideStyle(this.nativeInstance, bmSurfaceStyle.nativeInstance);
        } else {
            nativeSetSurfaceFloorSideStyle(this.nativeInstance, 0L);
        }
    }

    public boolean b(float f8) {
        return nativeSetFloorHeight(this.nativeInstance, f8);
    }

    public boolean d(float f8) {
        return nativeSetLastFloorHeight(this.nativeInstance, f8);
    }

    public boolean e(float f8) {
        return nativeSetRoundedCornerRadius(this.nativeInstance, f8);
    }

    public boolean c(float f8) {
        return nativeSetHeight(this.nativeInstance, f8);
    }

    public boolean d(boolean z7) {
        return nativeSetIsBuilding(this.nativeInstance, z7);
    }

    public boolean a(String str) {
        return nativeSetBuildingID(this.nativeInstance, str);
    }

    public boolean c(boolean z7) {
        return nativeSetIsAnimation(this.nativeInstance, z7);
    }
}
