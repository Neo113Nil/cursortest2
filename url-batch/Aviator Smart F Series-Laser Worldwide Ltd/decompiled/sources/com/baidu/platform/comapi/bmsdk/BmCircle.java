package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Circle;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;
import com.github.mikephil.charting.utils.i;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BmCircle extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Circle f8881i;

    public BmCircle() {
        super(11, nativeCreate());
    }

    private static native boolean nativeAddHoleGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native boolean nativeClearGradientColors(long j8);

    private static native long nativeCreate();

    private static native boolean nativeDelGradientColors(long j8, int i8);

    private static native boolean nativeSetBloomAlpha(long j8, float f8);

    private static native boolean nativeSetBloomBlurTimes(long j8, int i8);

    private static native boolean nativeSetBloomGradientASpeed(long j8, float f8);

    private static native boolean nativeSetBloomWidth(long j8, float f8);

    private static native boolean nativeSetCenter(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetGradientColorWeight(long j8, float f8);

    private static native boolean nativeSetGradientColors(long j8, int i8, int[] iArr, int i9);

    private static native boolean nativeSetGradientRadiusWeight(long j8, float f8);

    private static native boolean nativeSetIsGradientCircle(long j8, boolean z7);

    private static native boolean nativeSetLineBloomDirection(long j8, int i8);

    private static native boolean nativeSetLineBloomMode(long j8, int i8);

    private static native boolean nativeSetLineStyle(long j8, long j9);

    private static native boolean nativeSetPixelRadius(long j8, int i8);

    private static native boolean nativeSetRadius(long j8, double d8);

    private static native boolean nativeSetSurfaceStyle(long j8, long j9);

    private static native boolean nativeSetTrackBy(long j8, int i8);

    public void a(Circle circle) {
        this.f8881i = circle;
    }

    public boolean b(float f8) {
        return nativeSetBloomAlpha(this.nativeInstance, f8);
    }

    public boolean c(boolean z7) {
        return nativeSetIsGradientCircle(this.nativeInstance, z7);
    }

    public boolean d() {
        return nativeClearGradientColors(this.nativeInstance);
    }

    public Circle e() {
        return this.f8881i;
    }

    public boolean f(float f8) {
        return nativeSetGradientRadiusWeight(this.nativeInstance, f8);
    }

    public boolean g(int i8) {
        return nativeSetLineBloomMode(this.nativeInstance, i8);
    }

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return nativeSetCenter(this.nativeInstance, bVar.f8938a, bVar.f8939b, i.DOUBLE_EPSILON);
    }

    public boolean c() {
        return nativeClearGeoElements(this.nativeInstance);
    }

    public boolean d(float f8) {
        return nativeSetBloomWidth(this.nativeInstance, f8);
    }

    public boolean e(float f8) {
        return nativeSetGradientColorWeight(this.nativeInstance, f8);
    }

    public boolean f(int i8) {
        return nativeSetLineBloomDirection(this.nativeInstance, i8);
    }

    public boolean a(double d8) {
        return nativeSetRadius(this.nativeInstance, d8);
    }

    public boolean c(float f8) {
        return nativeSetBloomGradientASpeed(this.nativeInstance, f8);
    }

    public boolean e(int i8) {
        return nativeSetBloomBlurTimes(this.nativeInstance, i8);
    }

    public void a(BmLineStyle bmLineStyle) {
        if (bmLineStyle != null) {
            nativeSetLineStyle(this.nativeInstance, bmLineStyle.nativeInstance);
        } else {
            nativeSetLineStyle(this.nativeInstance, 0L);
        }
    }

    public void a(BmSurfaceStyle bmSurfaceStyle) {
        if (bmSurfaceStyle != null) {
            nativeSetSurfaceStyle(this.nativeInstance, bmSurfaceStyle.nativeInstance);
        } else {
            nativeSetSurfaceStyle(this.nativeInstance, 0L);
        }
    }

    public boolean a(int i8, List<Integer> list) {
        int[] iArr;
        int i9 = 0;
        if (list == null || list.size() <= 0) {
            iArr = null;
        } else {
            iArr = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                iArr[i9] = com.baidu.platform.comapi.bmsdk.style.a.a(it.next().intValue());
                i9++;
            }
        }
        return nativeSetGradientColors(this.nativeInstance, i8, iArr, i9);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddHoleGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
    }
}
