package com.baidu.platform.comapi.walknavi.k;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.github.mikephil.charting.utils.i;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.comapi.h.s.b {

    /* renamed from: a, reason: collision with root package name */
    private Activity f10110a;

    /* renamed from: b, reason: collision with root package name */
    private View f10111b;

    /* renamed from: e, reason: collision with root package name */
    private float f10114e;

    /* renamed from: g, reason: collision with root package name */
    private double f10116g;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.f.a f10112c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10113d = true;

    /* renamed from: f, reason: collision with root package name */
    private int f10115f = -1;

    public a(Activity activity) {
        this.f10111b = null;
        this.f10110a = activity;
        this.f10111b = com.baidu.platform.comapi.h.t.p.a.a(activity, R.layout.wsdk_light_nav_ui_layout, null);
        com.baidu.platform.comapi.walknavi.b.n().e(100);
        t();
    }

    private void s() {
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
        return this.f10111b;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public float i() {
        return this.f10114e;
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
        this.f10113d = true;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void q() {
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void r() {
        this.f10113d = false;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        s();
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        u();
        this.f10110a = null;
    }

    public void t() {
        if (com.baidu.platform.comapi.h.c.b().g()) {
            com.baidu.platform.comapi.walknavi.b.n().t().e().showScaleControl(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().showZoomControls(false);
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setAllGesturesEnabled(true);
            com.baidu.platform.comapi.walknavi.b.n().t().e().getMap().getUiSettings().setOverlookingGesturesEnabled(false);
            a(this.f10110a, com.baidu.platform.comapi.walknavi.b.n().t().e(), 0, 0, 0, 0);
        }
    }

    public void u() {
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
        WalkNaviDisplayOption J;
        com.baidu.platform.comapi.walknavi.k.f.a aVar = this.f10112c;
        if (aVar != null) {
            aVar.b();
        }
        View view = this.f10111b;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                int i8 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (i8 >= viewGroup.getChildCount()) {
                        break;
                    }
                    viewGroup.removeView(viewGroup.getChildAt(i8));
                    i8++;
                }
            }
            this.f10111b = null;
        }
        Activity activity = this.f10110a;
        if (activity != null && !activity.isFinishing() && ((J = com.baidu.platform.comapi.walknavi.b.n().J()) == null || !J.isIsRunInFragment())) {
            this.f10110a.finish();
        }
        com.baidu.platform.comapi.walknavi.b.n().b0();
        this.f10110a = null;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public void a(com.baidu.platform.comapi.walknavi.k.f.a aVar) {
        this.f10112c = aVar;
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void b(Message message) {
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.farAway");
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void c(Bundle bundle) {
        double d8 = i.DOUBLE_EPSILON;
        float f8 = 0.0f;
        try {
            this.f10114e = bundle.getFloat("curSpeed");
            this.f10115f = bundle.getInt("AddDist");
            d8 = BigDecimal.valueOf(bundle.getInt("AddDist") / 1000.0f).setScale(1, 4).doubleValue();
            f8 = bundle.getInt("RouteDist") / 1000.0f;
            float f9 = bundle.getFloat("calorie");
            com.baidu.platform.comapi.h.g.a.b("walk cal:" + f9 + "or:" + bundle.getFloat("calorie"));
            BigDecimal.valueOf((double) f9).setScale(1, 4).doubleValue();
        } catch (Exception e8) {
            com.baidu.platform.comapi.h.g.a.b("exception" + e8.getMessage());
        }
        this.f10116g = d8 / f8;
    }

    @Override // com.baidu.platform.comapi.h.s.b
    public boolean d() {
        return this.f10111b == null || this.f10110a == null;
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
        com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.reRoute");
        if (this.f10113d) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().l().run("[查看全览]按钮点击");
    }
}
