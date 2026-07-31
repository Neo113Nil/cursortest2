package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class sb2 extends mx implements od1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f11771f;

    /* renamed from: g, reason: collision with root package name */
    private final wn2 f11772g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11773h;

    /* renamed from: i, reason: collision with root package name */
    private final lc2 f11774i;

    /* renamed from: j, reason: collision with root package name */
    private pv f11775j;

    /* renamed from: k, reason: collision with root package name */
    private final is2 f11776k;

    /* renamed from: l, reason: collision with root package name */
    private t41 f11777l;

    public sb2(Context context, pv pvVar, String str, wn2 wn2Var, lc2 lc2Var) {
        this.f11771f = context;
        this.f11772g = wn2Var;
        this.f11775j = pvVar;
        this.f11773h = str;
        this.f11774i = lc2Var;
        this.f11776k = wn2Var.g();
        wn2Var.n(this);
    }

    private final synchronized void u6(pv pvVar) {
        this.f11776k.G(pvVar);
        this.f11776k.L(this.f11775j.f10389s);
    }

    private final synchronized boolean v6(kv kvVar) {
        r3.o.e("loadAd must be called on the main UI thread.");
        y2.t.q();
        if (!a3.g2.l(this.f11771f) || kvVar.f7661x != null) {
            zs2.a(this.f11771f, kvVar.f7648k);
            return this.f11772g.a(kvVar, this.f11773h, null, new rb2(this));
        }
        io0.d("Failed to load the ad because app ID is missing.");
        lc2 lc2Var = this.f11774i;
        if (lc2Var != null) {
            lc2Var.d(dt2.d(4, null, null));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean B4() {
        return this.f11772g.zza();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void E4(yx yxVar) {
        r3.o.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f11776k.o(yxVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized boolean F4(kv kvVar) {
        u6(this.f11775j);
        return v6(kvVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void G() {
        r3.o.e("recordManualImpression must be called on the main UI thread.");
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            t41Var.m();
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void H() {
        r3.o.e("resume must be called on the main UI thread.");
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            t41Var.d().Z0(null);
        }
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
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
        r3.o.e("setAppEventListener must be called on the main UI thread.");
        this.f11774i.C(uxVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void N() {
        r3.o.e("destroy must be called on the main UI thread.");
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            t41Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void O1(mh0 mh0Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void R3(pv pvVar) {
        r3.o.e("setAdSize must be called on the main UI thread.");
        this.f11776k.G(pvVar);
        this.f11775j = pvVar;
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            t41Var.n(this.f11772g.c(), pvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void V() {
        r3.o.e("pause must be called on the main UI thread.");
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            t41Var.d().U0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
        r3.o.e("setAdListener must be called on the main UI thread.");
        this.f11772g.m(wwVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void b6(boolean z6) {
        r3.o.e("setManualImpressionsEnabled must be called from the main thread.");
        this.f11776k.M(z6);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c5(x3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void c6(s00 s00Var) {
        r3.o.e("setVideoOptions must be called on the main UI thread.");
        this.f11776k.e(s00Var);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized pv e() {
        r3.o.e("getAdSize must be called on the main UI thread.");
        t41 t41Var = this.f11777l;
        if (t41Var != null) {
            return os2.a(this.f11771f, Collections.singletonList(t41Var.k()));
        }
        return this.f11776k.v();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final Bundle g() {
        r3.o.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zw h() {
        return this.f11774i.a();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final ux i() {
        return this.f11774i.b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized zy j() {
        if (!((Boolean) sw.c().b(m10.f8222i5)).booleanValue()) {
            return null;
        }
        t41 t41Var = this.f11777l;
        if (t41Var == null) {
            return null;
        }
        return t41Var.c();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void j4(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized cz k() {
        r3.o.e("getVideoController must be called from the main thread.");
        t41 t41Var = this.f11777l;
        if (t41Var == null) {
            return null;
        }
        return t41Var.j();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void l1(String str) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        r3.o.e("destroy must be called on the main UI thread.");
        return x3.b.B3(this.f11772g.c());
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String p() {
        t41 t41Var = this.f11777l;
        if (t41Var == null || t41Var.c() == null) {
            return null;
        }
        return this.f11777l.c().b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String q() {
        t41 t41Var = this.f11777l;
        if (t41Var == null || t41Var.c() == null) {
            return null;
        }
        return this.f11777l.c().b();
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized void r4(i20 i20Var) {
        r3.o.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f11772g.o(i20Var);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
        r3.o.e("setPaidEventListener must be called on the main UI thread.");
        this.f11774i.z(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final synchronized String t() {
        return this.f11773h;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v0() {
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
        r3.o.e("setAdListener must be called on the main UI thread.");
        this.f11774i.f(zwVar);
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

    @Override // com.google.android.gms.internal.ads.od1
    public final synchronized void zza() {
        if (!this.f11772g.p()) {
            this.f11772g.l();
            return;
        }
        pv v6 = this.f11776k.v();
        t41 t41Var = this.f11777l;
        if (t41Var != null && t41Var.l() != null && this.f11776k.m()) {
            v6 = os2.a(this.f11771f, Collections.singletonList(this.f11777l.l()));
        }
        u6(v6);
        try {
            v6(this.f11776k.t());
        } catch (RemoteException unused) {
            io0.g("Failed to refresh the banner ad.");
        }
    }
}
