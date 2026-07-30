package com.baidu.platform.comapi.wnplatform.walkmap;

import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comjni.bikenavi.JNINaviMap;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private JNINaviMap f10556a;

    public d() {
        this.f10556a = null;
        this.f10556a = new JNINaviMap();
    }

    public boolean a(int i8) {
        return this.f10556a.showLayer(a(), i8, false);
    }

    public float b() {
        return this.f10556a.getRouteDirection(a());
    }

    public void c() {
        this.f10556a = null;
    }

    public boolean d() {
        return this.f10556a.resetBackgroundColor(a());
    }

    public boolean e() {
        return this.f10556a.resetMapStatusLimits(a());
    }

    public void f() {
        this.f10556a.uninitExtMap(a());
    }

    public boolean g() {
        return this.f10556a.updataBaseLayers(a());
    }

    public boolean a(boolean z7) {
        return this.f10556a.showBaseLayers(a(), z7);
    }

    public void b(int i8) {
        this.f10556a.setExtRotateMode(a(), i8);
    }

    public boolean c(int i8) {
        return this.f10556a.showLayer(a(), i8, true);
    }

    public boolean a(int[] iArr, int[] iArr2) {
        return this.f10556a.convertScrPt2GeoPoint(a(), iArr, iArr2);
    }

    public void a(float f8) {
        this.f10556a.setExtDefaultLevel(a(), f8);
    }

    public void a(OverLookingMode overLookingMode) {
        this.f10556a.setExtDefaultOverlooking(a(), overLookingMode.getValue());
    }

    public boolean a(long j8, float f8) {
        boolean initExtMap = this.f10556a.initExtMap(a(), j8);
        if (initExtMap) {
            this.f10556a.setExtDefaultLevel(a(), f8);
            this.f10556a.setExtDefaultOverlooking(a(), 0.0f);
            this.f10556a.setExtRotateMode(a(), 0);
        }
        return initExtMap;
    }

    private long a() {
        return com.baidu.platform.comapi.walknavi.b.n().i().d();
    }
}
