package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Arc;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class BmArc extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Arc f8864i;

    public BmArc() {
        super(12, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetCenter(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetClockwise(long j8, boolean z7);

    private static native boolean nativeSetEndRadian(long j8, double d8);

    private static native boolean nativeSetLineStyle(long j8, long j9);

    private static native boolean nativeSetPixelRadius(long j8, int i8);

    private static native boolean nativeSetRadius(long j8, double d8);

    private static native boolean nativeSetStartRadian(long j8, double d8);

    private static native boolean nativeSetTrackBy(long j8, int i8);

    public void a(Arc arc) {
        this.f8864i = arc;
    }

    public boolean b(double d8) {
        return nativeSetRadius(this.nativeInstance, d8);
    }

    public Arc c() {
        return this.f8864i;
    }

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return nativeSetCenter(this.nativeInstance, bVar.f8938a, bVar.f8939b, i.DOUBLE_EPSILON);
    }

    public boolean c(double d8) {
        return nativeSetStartRadian(this.nativeInstance, d8);
    }

    public boolean a(double d8) {
        return nativeSetEndRadian(this.nativeInstance, d8);
    }

    public boolean c(boolean z7) {
        return nativeSetClockwise(this.nativeInstance, z7);
    }

    public void a(BmLineStyle bmLineStyle) {
        if (bmLineStyle != null) {
            nativeSetLineStyle(this.nativeInstance, bmLineStyle.nativeInstance);
        } else {
            nativeSetLineStyle(this.nativeInstance, 0L);
        }
    }
}
