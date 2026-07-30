package com.baidu.platform.comapi.b.c;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.comapi.h.s.b {

    /* renamed from: a, reason: collision with root package name */
    private Activity f8781a;

    /* renamed from: b, reason: collision with root package name */
    private View f8782b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8784d;

    /* renamed from: f, reason: collision with root package name */
    private double f8786f;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.f.a f8783c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f8785e = -1;

    public d(Activity activity) {
        this.f8782b = null;
        this.f8781a = activity;
        this.f8782b = com.baidu.platform.comapi.h.t.p.a.a(activity, R.layout.wsdk_light_bike_ui_layout, null);
        com.baidu.platform.comapi.walknavi.b.n().e(100);
        u();
    }

    private void t() {
        com.baidu.platform.comapi.walknavi.b.n().B().a(this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().a(this);
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void b() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void d(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void e(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int f() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int g() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public View h() {
        return this.f8782b;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public float i() {
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int j() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int k() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public Handler l() {
        return null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public int m() {
        return 0;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void n() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void o() {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onFinalEnd(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onIndoorEnd(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void onNaviLocationUpdate() {
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void onRoutePlanStart() {
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void onRoutePlanSuccess() {
        com.baidu.platform.comapi.walknavi.b.n().s().b();
        com.baidu.platform.comapi.walknavi.b.n().s().y();
        com.baidu.platform.comapi.walknavi.b.n().T();
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void p() {
        this.f8784d = true;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void q() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void r() {
        this.f8784d = false;
        u();
        com.baidu.platform.comapi.walknavi.b.n().l().run("[查看全览]按钮点击");
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        t();
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        v();
        this.f8781a = null;
    }

    public void s() {
        com.baidu.platform.comapi.walknavi.k.f.a aVar = this.f8783c;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void u() {
        com.baidu.platform.comapi.walknavi.b.n().t().e().showScaleControl(false);
        com.baidu.platform.comapi.walknavi.b.n().t().e().showZoomControls(false);
        com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setAllGesturesEnabled(true);
        com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setOverlookingGesturesEnabled(false);
        a(this.f8781a, com.baidu.platform.comapi.walknavi.b.n().t().e(), 0, 0, 0, 0);
    }

    public void v() {
        com.baidu.platform.comapi.walknavi.b.n().B().b(this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().b(this);
    }

    @Override // com.baidu.platform.comapi.h.n.f
    public void a(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void b(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void c(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void d(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void e(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void f(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void b(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void c(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void d(Message message) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void e() {
        BikeNaviDisplayOption e8;
        s();
        View view = this.f8782b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f8782b = null;
        }
        Activity activity = this.f8781a;
        if (activity != null && !activity.isFinishing() && ((e8 = com.baidu.platform.comapi.walknavi.b.n().e()) == null || !e8.isIsRunInFragment())) {
            this.f8781a.finish();
        }
        com.baidu.platform.comapi.walknavi.b.n().a0();
        this.f8781a = null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(com.baidu.platform.comapi.walknavi.k.f.a aVar) {
        this.f8783c = aVar;
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void b(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.farAway");
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void c(Bundle bundle) {
        try {
            BigDecimal.valueOf((bundle.getFloat("curSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            BigDecimal.valueOf((bundle.getFloat("maxSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            BigDecimal.valueOf((bundle.getFloat("avgSpeed") * 3600.0f) / 1000.0f).setScale(1, 4).doubleValue();
            this.f8785e = bundle.getInt("AddDist");
            double doubleValue = BigDecimal.valueOf(bundle.getInt("AddDist") / 1000.0f).setScale(1, 4).doubleValue();
            double doubleValue2 = BigDecimal.valueOf(bundle.getInt("RouteDist") / 1000.0f).setScale(1, 4).doubleValue();
            BigDecimal.valueOf(bundle.getFloat("realDistance")).setScale(1, 4).doubleValue();
            bundle.getLong("secTime");
            float f8 = bundle.getFloat("calorie");
            com.baidu.platform.comapi.h.g.a.b("bike cal:" + f8 + "or:" + bundle.getFloat("calorie"));
            BigDecimal.valueOf((double) f8).setScale(1, 4).doubleValue();
            bundle.getFloat("altidiff");
            bundle.getFloat("altitude");
            this.f8786f = doubleValue / doubleValue2;
        } catch (Exception unused) {
        }
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public boolean d() {
        return this.f8782b == null || this.f8781a == null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(String str) {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(boolean z7) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(byte[] bArr) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void a(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("BikeNaviPG.reRoute");
        com.baidu.platform.comapi.h.g.a.c("yang13", "call onReRouteComplete");
        if (this.f8784d) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().l().run("[查看全览]按钮点击");
    }
}
