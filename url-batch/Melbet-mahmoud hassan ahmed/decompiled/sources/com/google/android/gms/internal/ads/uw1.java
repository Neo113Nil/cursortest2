package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uw1 implements td1, yu, va1, qb1, rb1, lc1, ya1, fe, ow2 {

    /* renamed from: f, reason: collision with root package name */
    private final List<Object> f13001f;

    /* renamed from: g, reason: collision with root package name */
    private final iw1 f13002g;

    /* renamed from: h, reason: collision with root package name */
    private long f13003h;

    public uw1(iw1 iw1Var, bw0 bw0Var) {
        this.f13002g = iw1Var;
        this.f13001f = Collections.singletonList(bw0Var);
    }

    private final void C(Class<?> cls, String str, Object... objArr) {
        iw1 iw1Var = this.f13002g;
        List<Object> list = this.f13001f;
        String simpleName = cls.getSimpleName();
        iw1Var.a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        C(yu.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void a(gw2 gw2Var, String str) {
        C(fw2.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void b(gw2 gw2Var, String str) {
        C(fw2.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.fe
    public final void c(String str, String str2) {
        C(fe.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        C(ya1.class, "onAdFailedToLoad", Integer.valueOf(cvVar.f3954f), cvVar.f3955g, cvVar.f3956h);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void e() {
        C(va1.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void f(Context context) {
        C(rb1.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void h(mj0 mj0Var, String str, String str2) {
        C(va1.class, "onRewarded", mj0Var, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void i() {
        C(va1.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        C(qb1.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        long a7 = y2.t.a().a();
        long j7 = this.f13003h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(a7 - j7);
        a3.r1.k(sb.toString());
        C(lc1.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void n() {
        C(va1.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void o() {
        C(va1.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
        this.f13003h = y2.t.a().a();
        C(td1.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void r(Context context) {
        C(rb1.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void s(gw2 gw2Var, String str) {
        C(fw2.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void t() {
        C(va1.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void y(Context context) {
        C(rb1.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void z(gw2 gw2Var, String str, Throwable th) {
        C(fw2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }
}
