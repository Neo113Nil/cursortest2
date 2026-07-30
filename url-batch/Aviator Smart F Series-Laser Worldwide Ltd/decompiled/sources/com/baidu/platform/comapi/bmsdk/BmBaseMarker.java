package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BmBaseMarker extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private double f8867i;

    /* renamed from: j, reason: collision with root package name */
    private double f8868j;

    /* renamed from: k, reason: collision with root package name */
    private double f8869k;

    /* renamed from: l, reason: collision with root package name */
    private int f8870l;

    /* renamed from: m, reason: collision with root package name */
    private int f8871m;

    /* renamed from: n, reason: collision with root package name */
    private int f8872n;

    /* renamed from: o, reason: collision with root package name */
    private float f8873o;

    /* renamed from: p, reason: collision with root package name */
    private float f8874p;

    /* renamed from: q, reason: collision with root package name */
    private float f8875q;

    /* renamed from: r, reason: collision with root package name */
    private float f8876r;

    /* renamed from: s, reason: collision with root package name */
    private String f8877s;

    /* renamed from: t, reason: collision with root package name */
    private String f8878t;

    /* renamed from: u, reason: collision with root package name */
    private String f8879u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<BmRichView> f8880v;

    private BmBaseMarker() {
        super(3, 0L);
        this.f8867i = i.DOUBLE_EPSILON;
        this.f8868j = i.DOUBLE_EPSILON;
        this.f8869k = i.DOUBLE_EPSILON;
        this.f8870l = 0;
        this.f8871m = 0;
        this.f8872n = 0;
        this.f8873o = 0.0f;
        this.f8874p = 1.0f;
        this.f8875q = 1.0f;
        this.f8876r = 1.0f;
        this.f8877s = "";
        this.f8878t = "";
        this.f8879u = "";
        this.f8880v = new ArrayList<>();
    }

    private static native boolean nativeAddRichView(long j8, long j9);

    private static native boolean nativeClearRichViews(long j8);

    private static native boolean nativeRemoveRichView(long j8, long j9);

    private static native boolean nativeSetAnchorX(long j8, float f8);

    private static native boolean nativeSetAnchorY(long j8, float f8);

    private static native boolean nativeSetBuildingId(long j8, String str);

    private static native boolean nativeSetCollisionBehavior(long j8, int i8);

    private static native boolean nativeSetCollisionPriority(long j8, int i8);

    private static native boolean nativeSetDrawFullscreenMaskFlag(long j8, boolean z7);

    private static native boolean nativeSetFixX(long j8, int i8);

    private static native boolean nativeSetFixY(long j8, int i8);

    private static native boolean nativeSetFloorId(long j8, String str);

    private static native boolean nativeSetFollowMapRotateAxis(long j8, int i8);

    private static native boolean nativeSetHeight(long j8, int i8);

    private static native boolean nativeSetId(long j8, String str);

    private static native boolean nativeSetIsFix(long j8, int i8);

    private static native boolean nativeSetLocated(long j8, int i8);

    private static native boolean nativeSetOffsetX(long j8, int i8, int i9);

    private static native boolean nativeSetOffsetY(long j8, int i8, int i9);

    private static native boolean nativeSetPerspective(long j8, int i8);

    private static native boolean nativeSetRotate(long j8, float f8);

    private static native boolean nativeSetRotateFeature(long j8, int i8);

    private static native boolean nativeSetScale(long j8, float f8);

    private static native boolean nativeSetScaleX(long j8, float f8);

    private static native boolean nativeSetScaleY(long j8, float f8);

    private static native boolean nativeSetTrackBy(long j8, int i8);

    private static native boolean nativeSetWidth(long j8, int i8);

    private static native boolean nativeSetX(long j8, double d8);

    private static native boolean nativeSetXYZ(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetY(long j8, double d8);

    private static native boolean nativeSetZ(long j8, double d8);

    public boolean a(b bVar) {
        this.f8867i = bVar.f8938a;
        this.f8868j = bVar.f8939b;
        this.f8869k = bVar.f8940c;
        return nativeSetXYZ(getNativeInstance(), this.f8867i, this.f8868j, this.f8869k);
    }

    public boolean b(float f8) {
        return nativeSetAnchorX(getNativeInstance(), f8);
    }

    public boolean c(float f8) {
        return nativeSetAnchorY(getNativeInstance(), f8);
    }

    public boolean d(float f8) {
        this.f8873o = f8;
        return nativeSetRotate(getNativeInstance(), f8);
    }

    public boolean e(float f8) {
        this.f8874p = f8;
        this.f8875q = f8;
        return nativeSetScale(getNativeInstance(), f8);
    }

    public boolean f(float f8) {
        this.f8874p = f8;
        return nativeSetScaleX(getNativeInstance(), f8);
    }

    public boolean g(int i8) {
        return nativeSetFixX(getNativeInstance(), i8);
    }

    public boolean h(int i8) {
        return nativeSetFixY(getNativeInstance(), i8);
    }

    public boolean i(int i8) {
        return nativeSetFollowMapRotateAxis(getNativeInstance(), i8);
    }

    public boolean j(int i8) {
        return nativeSetIsFix(getNativeInstance(), i8);
    }

    public boolean k(int i8) {
        this.f8870l = i8;
        return nativeSetLocated(getNativeInstance(), i8);
    }

    public boolean l(int i8) {
        return a(i8, d.NO_SCALE_DPI);
    }

    public boolean m(int i8) {
        return b(i8, d.NO_SCALE_DPI);
    }

    public boolean n(int i8) {
        return nativeSetPerspective(getNativeInstance(), i8);
    }

    public boolean b(int i8, d dVar) {
        this.f8872n = i8;
        return nativeSetOffsetY(getNativeInstance(), i8, dVar.a());
    }

    public boolean c() {
        this.f8880v.clear();
        return nativeClearRichViews(getNativeInstance());
    }

    public boolean e(int i8) {
        return nativeSetCollisionBehavior(getNativeInstance(), i8);
    }

    public boolean f(int i8) {
        long nativeInstance = getNativeInstance();
        if (i8 < 0) {
            i8 = 0;
        }
        return nativeSetCollisionPriority(nativeInstance, i8);
    }

    public boolean g(float f8) {
        this.f8875q = f8;
        return nativeSetScaleY(getNativeInstance(), f8);
    }

    protected BmBaseMarker(int i8, long j8) {
        super(i8, j8);
        this.f8867i = i.DOUBLE_EPSILON;
        this.f8868j = i.DOUBLE_EPSILON;
        this.f8869k = i.DOUBLE_EPSILON;
        this.f8870l = 0;
        this.f8871m = 0;
        this.f8872n = 0;
        this.f8873o = 0.0f;
        this.f8874p = 1.0f;
        this.f8875q = 1.0f;
        this.f8876r = 1.0f;
        this.f8877s = "";
        this.f8878t = "";
        this.f8879u = "";
        this.f8880v = new ArrayList<>();
    }

    public boolean b(BmRichView bmRichView) {
        this.f8880v.remove(bmRichView);
        return nativeRemoveRichView(getNativeInstance(), bmRichView.getNativeInstance());
    }

    public boolean a(int i8, d dVar) {
        this.f8871m = i8;
        return nativeSetOffsetX(getNativeInstance(), i8, dVar.a());
    }

    public BmBaseUI b(long j8) {
        if (j8 == 0) {
            return null;
        }
        Iterator<BmRichView> it = this.f8880v.iterator();
        while (it.hasNext()) {
            BmBaseUI a8 = it.next().a(j8);
            if (a8 != null) {
                return a8;
            }
        }
        return null;
    }

    public boolean a(BmRichView bmRichView) {
        this.f8880v.add(bmRichView);
        return nativeAddRichView(getNativeInstance(), bmRichView.getNativeInstance());
    }

    public boolean a(String str) {
        return nativeSetId(getNativeInstance(), str);
    }
}
