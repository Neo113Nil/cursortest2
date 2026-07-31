package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qn2 extends mx implements z2.q, np {

    /* renamed from: f, reason: collision with root package name */
    private final bw0 f10763f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f10764g;

    /* renamed from: i, reason: collision with root package name */
    private final String f10766i;

    /* renamed from: j, reason: collision with root package name */
    private final kn2 f10767j;

    /* renamed from: k, reason: collision with root package name */
    private final in2 f10768k;

    /* renamed from: m, reason: collision with root package name */
    private n31 f10770m;

    /* renamed from: n, reason: collision with root package name */
    protected m41 f10771n;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f10765h = new AtomicBoolean();

    /* renamed from: l, reason: collision with root package name */
    private long f10769l = -1;

    public qn2(bw0 bw0Var, Context context, String str, kn2 kn2Var, in2 in2Var) {
        this.f10763f = bw0Var;
        this.f10764g = context;
        this.f10766i = str;
        this.f10767j = kn2Var;
        this.f10768k = in2Var;
        in2Var.m(this);
    }

    private final synchronized void t6(int i7) {
        if (this.f10765h.compareAndSet(false, true)) {
            this.f10768k.i();
            n31 n31Var = this.f10770m;
            if (n31Var != null) {
                y2.t.c().e(n31Var);
            }
            if (this.f10771n != null) {
                long j7 = -1;
                if (this.f10769l != -1) {
                    j7 = y2.t.a().a() - this.f10769l;
                }
                this.f10771n.k(j7, i7);
            }
            N();
        }
    }

    @Override // z2.q
    public final void B3() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean B4() {
        return this.f10767j.zza();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
    }

    @Override // z2.q
    public final void E(int i7) {
        int i8;
        int i9 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i9 == 0) {
            t6(2);
            return;
        }
        if (i9 == 1) {
            i8 = 4;
        } else if (i9 == 2) {
            t6(3);
            return;
        } else if (i9 != 3) {
            return;
        } else {
            i8 = 6;
        }
        t6(i8);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void E4(yx yxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean F4(kv kvVar) {
        r3.o.e("loadAd must be called on the main UI thread.");
        y2.t.q();
        if (a3.g2.l(this.f10764g) && kvVar.f7661x == null) {
            io0.d("Failed to load the ad because app ID is missing.");
            this.f10768k.d(dt2.d(4, null, null));
            return false;
        }
        if (B4()) {
            return false;
        }
        this.f10765h = new AtomicBoolean();
        return this.f10767j.a(kvVar, this.f10766i, new on2(this), new pn2(this));
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
        this.f10767j.k(vvVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        m41 m41Var = this.f10771n;
        if (m41Var != null) {
            m41Var.a();
        }
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

    @Override // z2.q
    public final synchronized void a() {
        if (this.f10771n == null) {
            return;
        }
        this.f10769l = y2.t.a().a();
        int h7 = this.f10771n.h();
        if (h7 <= 0) {
            return;
        }
        n31 n31Var = new n31(this.f10763f.e(), y2.t.a());
        this.f10770m = n31Var;
        n31Var.d(h7, new Runnable() { // from class: com.google.android.gms.internal.ads.nn2
            @Override // java.lang.Runnable
            public final void run() {
                qn2.this.n();
            }
        });
    }

    @Override // z2.q
    public final synchronized void b() {
        m41 m41Var = this.f10771n;
        if (m41Var != null) {
            m41Var.k(y2.t.a().a() - this.f10769l, 1);
        }
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
        return null;
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

    @Override // z2.q
    public final void k6() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        return null;
    }

    public final void n() {
        this.f10763f.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mn2
            @Override // java.lang.Runnable
            public final void run() {
                qn2.this.o();
            }
        });
    }

    final /* synthetic */ void o() {
        t6(5);
    }

    @Override // z2.q
    public final void o4() {
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
        this.f10768k.y(wpVar);
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
        return this.f10766i;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void v0() {
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
        t6(3);
    }
}
