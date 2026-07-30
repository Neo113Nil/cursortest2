package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.mapapi.map.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BmBaseLine extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Polyline f8865i;

    /* renamed from: j, reason: collision with root package name */
    private List<BmGeoElement> f8866j;

    private BmBaseLine() {
        super(7, 0L);
        this.f8866j = new ArrayList();
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native boolean nativeDeleteGeoElement(long j8, long j9);

    private static native boolean nativeSetBloomAlpha(long j8, float f8);

    private static native boolean nativeSetBloomBlurTimes(long j8, int i8);

    private static native boolean nativeSetBloomGradientASpeed(long j8, float f8);

    private static native boolean nativeSetBloomWidth(long j8, float f8);

    private static native boolean nativeSetCollisionBehavior(long j8, int i8);

    private static native boolean nativeSetCollisionTagId(long j8, int i8);

    private static native boolean nativeSetEndCapType(long j8, int i8);

    private static native boolean nativeSetGeoElement(long j8, long j9);

    private static native boolean nativeSetHighPrecision(long j8, boolean z7);

    private static native boolean nativeSetJointType(long j8, int i8);

    private static native boolean nativeSetLineBloomDirection(long j8, int i8);

    private static native boolean nativeSetLineBloomMode(long j8, int i8);

    private static native boolean nativeSetLineDirectionCrossType(long j8, int i8);

    private static native boolean nativeSetSmooth(long j8, int i8);

    private static native boolean nativeSetSmoothFactor(long j8, float f8);

    private static native boolean nativeSetStartCapType(long j8, int i8);

    private static native boolean nativeSetThin(long j8, int i8);

    private static native boolean nativeSetThinFactor(long j8, float f8);

    public void a(Polyline polyline) {
        this.f8865i = polyline;
    }

    public boolean b(BmGeoElement bmGeoElement) {
        boolean nativeDeleteGeoElement = nativeDeleteGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
        try {
            bmGeoElement.close();
        } catch (Exception unused) {
            Log.e("BmGeoElement", "BmGeoElement close failed");
        }
        return nativeDeleteGeoElement;
    }

    public boolean c() {
        List<BmGeoElement> list = this.f8866j;
        if (list != null) {
            Iterator<BmGeoElement> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().close();
                } catch (Exception unused) {
                    Log.e("BmGeoElement", "BmGeoElement close failed");
                }
            }
            this.f8866j.clear();
        }
        return nativeClearGeoElements(getNativeInstance());
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmDrawItem, com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        List<BmGeoElement> list = this.f8866j;
        if (list != null) {
            Iterator<BmGeoElement> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().close();
                } catch (Exception unused) {
                    Log.e("BmGeoElement", "BmGeoElement close failed");
                }
            }
            this.f8866j.clear();
            this.f8866j = null;
        }
    }

    public Polyline d() {
        return this.f8865i;
    }

    public boolean e(float f8) {
        return nativeSetSmoothFactor(getNativeInstance(), f8);
    }

    public boolean f(float f8) {
        return nativeSetThinFactor(getNativeInstance(), f8);
    }

    public boolean g(int i8) {
        return nativeSetJointType(getNativeInstance(), i8);
    }

    public boolean h(int i8) {
        return nativeSetLineBloomDirection(getNativeInstance(), i8);
    }

    public boolean i(int i8) {
        return nativeSetLineBloomMode(getNativeInstance(), i8);
    }

    public boolean j(int i8) {
        return nativeSetLineDirectionCrossType(getNativeInstance(), i8);
    }

    public boolean k(int i8) {
        return nativeSetSmooth(getNativeInstance(), i8);
    }

    public boolean l(int i8) {
        return nativeSetStartCapType(getNativeInstance(), i8);
    }

    public boolean m(int i8) {
        return nativeSetThin(getNativeInstance(), i8);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        List<BmGeoElement> list = this.f8866j;
        if (list != null) {
            list.add(bmGeoElement);
        }
        return nativeAddGeoElement(getNativeInstance(), bmGeoElement.getNativeInstance());
    }

    public boolean d(float f8) {
        return nativeSetBloomWidth(getNativeInstance(), f8);
    }

    public boolean e(int i8) {
        return nativeSetBloomBlurTimes(getNativeInstance(), i8);
    }

    public boolean f(int i8) {
        return nativeSetEndCapType(getNativeInstance(), i8);
    }

    protected BmBaseLine(int i8, long j8) {
        super(i8, j8);
        this.f8866j = new ArrayList();
    }

    public boolean b(float f8) {
        return nativeSetBloomAlpha(getNativeInstance(), f8);
    }

    public boolean c(float f8) {
        return nativeSetBloomGradientASpeed(getNativeInstance(), f8);
    }

    public boolean c(boolean z7) {
        return nativeSetHighPrecision(getNativeInstance(), z7);
    }
}
