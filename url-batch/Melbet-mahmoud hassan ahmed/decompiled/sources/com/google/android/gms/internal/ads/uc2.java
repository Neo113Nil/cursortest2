package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class uc2 extends mx {

    /* renamed from: f, reason: collision with root package name */
    private final pv f12735f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f12736g;

    /* renamed from: h, reason: collision with root package name */
    private final sp2 f12737h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12738i;

    /* renamed from: j, reason: collision with root package name */
    private final lc2 f12739j;

    /* renamed from: k, reason: collision with root package name */
    private final tq2 f12740k;

    /* renamed from: l, reason: collision with root package name */
    private ij1 f12741l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12742m = ((Boolean) sw.c().b(m10.f8326w0)).booleanValue();

    public uc2(Context context, pv pvVar, String str, sp2 sp2Var, lc2 lc2Var, tq2 tq2Var) {
        this.f12735f = pvVar;
        this.f12738i = str;
        this.f12736g = context;
        this.f12737h = sp2Var;
        this.f12739j = lc2Var;
        this.f12740k = tq2Var;
    }

    private final synchronized boolean u6() {
        boolean z6;
        ij1 ij1Var = this.f12741l;
        if (ij1Var != null) {
            z6 = ij1Var.h() ? false : true;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean B4() {
        return this.f12737h.zza();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
        this.f12739j.E(byVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void E4(yx yxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean F4(kv kvVar) {
        r3.o.e("loadAd must be called on the main UI thread.");
        y2.t.q();
        if (a3.g2.l(this.f12736g) && kvVar.f7661x == null) {
            io0.d("Failed to load the ad because app ID is missing.");
            lc2 lc2Var = this.f12739j;
            if (lc2Var != null) {
                lc2Var.d(dt2.d(4, null, null));
            }
            return false;
        }
        if (u6()) {
            return false;
        }
        zs2.a(this.f12736g, kvVar.f7648k);
        this.f12741l = null;
        return this.f12737h.a(kvVar, this.f12738i, new lp2(this.f12735f), new tc2(this));
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void H() {
        r3.o.e("resume must be called on the main UI thread.");
        ij1 ij1Var = this.f12741l;
        if (ij1Var != null) {
            ij1Var.d().Z0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean K0() {
        r3.o.e("isLoaded must be called on the main UI thread.");
        return u6();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void K3(boolean z6) {
        r3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f12742m = z6;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L2(sj0 sj0Var) {
        this.f12740k.X(sj0Var);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L4(vv vvVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
        r3.o.e("setAppEventListener must be called on the main UI thread.");
        this.f12739j.C(uxVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        ij1 ij1Var = this.f12741l;
        if (ij1Var != null) {
            ij1Var.d().S0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void O1(mh0 mh0Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void R3(pv pvVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void V() {
        r3.o.e("pause must be called on the main UI thread.");
        ij1 ij1Var = this.f12741l;
        if (ij1Var != null) {
            ij1Var.d().U0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b6(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void c5(x3.a aVar) {
        if (this.f12741l == null) {
            io0.g("Interstitial can not be shown before loaded.");
            this.f12739j.M0(dt2.d(9, null, null));
        } else {
            this.f12741l.i(this.f12742m, (Activity) x3.b.O0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c6(s00 s00Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final pv e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final Bundle g() {
        r3.o.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zw h() {
        return this.f12739j.a();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final ux i() {
        return this.f12739j.b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized zy j() {
        if (!((Boolean) sw.c().b(m10.f8222i5)).booleanValue()) {
            return null;
        }
        ij1 ij1Var = this.f12741l;
        if (ij1Var == null) {
            return null;
        }
        return ij1Var.c();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void j4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final cz k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String p() {
        ij1 ij1Var = this.f12741l;
        if (ij1Var == null || ij1Var.c() == null) {
            return null;
        }
        return this.f12741l.c().b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String q() {
        ij1 ij1Var = this.f12741l;
        if (ij1Var == null || ij1Var.c() == null) {
            return null;
        }
        return this.f12741l.c().b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
        this.f12739j.y(dxVar);
        F4(kvVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void r4(i20 i20Var) {
        r3.o.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f12737h.h(i20Var);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
        r3.o.e("setPaidEventListener must be called on the main UI thread.");
        this.f12739j.z(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String t() {
        return this.f12738i;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void v0() {
        r3.o.e("showInterstitial must be called on the main UI thread.");
        ij1 ij1Var = this.f12741l;
        if (ij1Var != null) {
            ij1Var.i(this.f12742m, null);
        } else {
            io0.g("Interstitial can not be shown before loaded.");
            this.f12739j.M0(dt2.d(9, null, null));
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
        r3.o.e("setAdListener must be called on the main UI thread.");
        this.f12739j.f(zwVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x4(hz hzVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void x5(jh0 jh0Var) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void z5(rx rxVar) {
        r3.o.e("setAdMetadataListener must be called on the main UI thread.");
    }
}
