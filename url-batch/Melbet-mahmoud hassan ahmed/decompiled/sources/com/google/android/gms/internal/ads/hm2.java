package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hm2 extends mx implements z2.b, np, wc1 {

    /* renamed from: f, reason: collision with root package name */
    private final bw0 f6340f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f6341g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f6342h;

    /* renamed from: j, reason: collision with root package name */
    private final String f6344j;

    /* renamed from: k, reason: collision with root package name */
    private final bm2 f6345k;

    /* renamed from: l, reason: collision with root package name */
    private final in2 f6346l;

    /* renamed from: m, reason: collision with root package name */
    private final po0 f6347m;

    /* renamed from: o, reason: collision with root package name */
    private n31 f6349o;

    /* renamed from: p, reason: collision with root package name */
    protected c41 f6350p;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f6343i = new AtomicBoolean();

    /* renamed from: n, reason: collision with root package name */
    private long f6348n = -1;

    public hm2(bw0 bw0Var, Context context, String str, bm2 bm2Var, in2 in2Var, po0 po0Var) {
        this.f6342h = new FrameLayout(context);
        this.f6340f = bw0Var;
        this.f6341g = context;
        this.f6344j = str;
        this.f6345k = bm2Var;
        this.f6346l = in2Var;
        in2Var.h(this);
        this.f6347m = po0Var;
    }

    static /* bridge */ /* synthetic */ z2.t u6(hm2 hm2Var, c41 c41Var) {
        boolean o7 = c41Var.o();
        int intValue = ((Integer) sw.c().b(m10.f8315u3)).intValue();
        z2.s sVar = new z2.s();
        sVar.f23682d = 50;
        sVar.f23679a = true != o7 ? 0 : intValue;
        sVar.f23680b = true != o7 ? intValue : 0;
        sVar.f23681c = intValue;
        return new z2.t(hm2Var.f6341g, sVar, hm2Var);
    }

    private final synchronized void x6(int i7) {
        if (this.f6343i.compareAndSet(false, true)) {
            c41 c41Var = this.f6350p;
            if (c41Var != null && c41Var.q() != null) {
                this.f6346l.C(this.f6350p.q());
            }
            this.f6346l.i();
            this.f6342h.removeAllViews();
            n31 n31Var = this.f6349o;
            if (n31Var != null) {
                y2.t.c().e(n31Var);
            }
            if (this.f6350p != null) {
                long j7 = -1;
                if (this.f6348n != -1) {
                    j7 = y2.t.a().a() - this.f6348n;
                }
                this.f6350p.p(j7, i7);
            }
            N();
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean B4() {
        return this.f6345k.zza();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void E4(yx yxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean F4(kv kvVar) {
        r3.o.e("loadAd must be called on the main UI thread.");
        y2.t.q();
        if (a3.g2.l(this.f6341g) && kvVar.f7661x == null) {
            io0.d("Failed to load the ad because app ID is missing.");
            this.f6346l.d(dt2.d(4, null, null));
            return false;
        }
        if (B4()) {
            return false;
        }
        this.f6343i = new AtomicBoolean();
        return this.f6345k.a(kvVar, this.f6344j, new fm2(this), new gm2(this));
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void G() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void H() {
        r3.o.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean K0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void K3(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L2(sj0 sj0Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L4(vv vvVar) {
        this.f6345k.k(vvVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        c41 c41Var = this.f6350p;
        if (c41Var != null) {
            c41Var.a();
        }
    }

    @Override // z2.b
    public final void O0() {
        x6(4);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void O1(mh0 mh0Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void R3(pv pvVar) {
        r3.o.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void V() {
        r3.o.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void b6(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c5(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void c6(s00 s00Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized pv e() {
        r3.o.e("getAdSize must be called on the main UI thread.");
        c41 c41Var = this.f6350p;
        if (c41Var == null) {
            return null;
        }
        return os2.a(this.f6341g, Collections.singletonList(c41Var.j()));
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final void f() {
        if (this.f6350p == null) {
            return;
        }
        this.f6348n = y2.t.a().a();
        int h7 = this.f6350p.h();
        if (h7 <= 0) {
            return;
        }
        n31 n31Var = new n31(this.f6340f.e(), y2.t.a());
        this.f6349o = n31Var;
        n31Var.d(h7, new Runnable() { // from class: com.google.android.gms.internal.ads.em2
            @Override // java.lang.Runnable
            public final void run() {
                hm2.this.l();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final Bundle g() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zw h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final ux i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized zy j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void j4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized cz k() {
        return null;
    }

    public final void l() {
        qw.b();
        if (bo0.p()) {
            x6(5);
        } else {
            this.f6340f.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dm2
                @Override // java.lang.Runnable
                public final void run() {
                    hm2.this.n();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        r3.o.e("getAdFrame must be called on the main UI thread.");
        return x3.b.B3(this.f6342h);
    }

    final /* synthetic */ void n() {
        x6(5);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
        this.f6346l.y(wpVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void r4(i20 i20Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String t() {
        return this.f6344j;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v0() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x4(hz hzVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x5(jh0 jh0Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void z5(rx rxVar) {
    }

    @Override // com.google.android.gms.internal.ads.np
    public final void zza() {
        x6(3);
    }
}
