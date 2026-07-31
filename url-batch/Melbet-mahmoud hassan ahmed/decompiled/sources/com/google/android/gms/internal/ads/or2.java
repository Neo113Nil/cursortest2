package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class or2 extends oj0 {

    /* renamed from: f, reason: collision with root package name */
    private final er2 f9795f;

    /* renamed from: g, reason: collision with root package name */
    private final tq2 f9796g;

    /* renamed from: h, reason: collision with root package name */
    private final fs2 f9797h;

    /* renamed from: i, reason: collision with root package name */
    private hs1 f9798i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9799j = false;

    public or2(er2 er2Var, tq2 tq2Var, fs2 fs2Var) {
        this.f9795f = er2Var;
        this.f9796g = tq2Var;
        this.f9797h = fs2Var;
    }

    private final synchronized boolean u6() {
        boolean z6;
        hs1 hs1Var = this.f9798i;
        if (hs1Var != null) {
            z6 = hs1Var.j() ? false : true;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void B0(x3.a aVar) {
        r3.o.e("showAd must be called on the main UI thread.");
        if (this.f9798i != null) {
            Activity activity = null;
            if (aVar != null) {
                Object O0 = x3.b.O0(aVar);
                if (O0 instanceof Activity) {
                    activity = (Activity) O0;
                }
            }
            this.f9798i.m(this.f9799j, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void D4(tj0 tj0Var) {
        r3.o.e("loadAd must be called on the main UI thread.");
        String str = tj0Var.f12235g;
        String str2 = (String) sw.c().b(m10.Q3);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e7) {
                y2.t.p().s(e7, "NonagonUtil.isPatternMatched");
            }
        }
        if (u6()) {
            if (!((Boolean) sw.c().b(m10.S3)).booleanValue()) {
                return;
            }
        }
        vq2 vq2Var = new vq2(null);
        this.f9798i = null;
        this.f9795f.i(1);
        this.f9795f.a(tj0Var.f12234f, tj0Var.f12235g, vq2Var, new mr2(this));
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void N3(nj0 nj0Var) {
        r3.o.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f9796g.Z(nj0Var);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void P0(String str) {
        r3.o.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f9797h.f5193b = str;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void Y(x3.a aVar) {
        r3.o.e("pause must be called on the main UI thread.");
        if (this.f9798i != null) {
            this.f9798i.d().U0(aVar == null ? null : (Context) x3.b.O0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void Z5(sj0 sj0Var) {
        r3.o.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f9796g.X(sj0Var);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final Bundle a() {
        r3.o.e("getAdMetadata can only be called from the UI thread.");
        hs1 hs1Var = this.f9798i;
        return hs1Var != null ? hs1Var.h() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void a6(rx rxVar) {
        r3.o.e("setAdMetadataListener can only be called from the UI thread.");
        if (rxVar == null) {
            this.f9796g.z(null);
        } else {
            this.f9796g.z(new nr2(this, rxVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void b() {
        p0(null);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized zy c() {
        if (!((Boolean) sw.c().b(m10.f8222i5)).booleanValue()) {
            return null;
        }
        hs1 hs1Var = this.f9798i;
        if (hs1Var == null) {
            return null;
        }
        return hs1Var.c();
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void f() {
        Y(null);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized String g() {
        hs1 hs1Var = this.f9798i;
        if (hs1Var == null || hs1Var.c() == null) {
            return null;
        }
        return this.f9798i.c().b();
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void h0(String str) {
        r3.o.e("setUserId must be called on the main UI thread.");
        this.f9797h.f5192a = str;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void i() {
        x0(null);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void i3(boolean z6) {
        r3.o.e("setImmersiveMode must be called on the main UI thread.");
        this.f9799j = z6;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final boolean p() {
        r3.o.e("isLoaded must be called on the main UI thread.");
        return u6();
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void p0(x3.a aVar) {
        r3.o.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f9796g.z(null);
        if (this.f9798i != null) {
            if (aVar != null) {
                context = (Context) x3.b.O0(aVar);
            }
            this.f9798i.d().S0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final boolean q() {
        hs1 hs1Var = this.f9798i;
        return hs1Var != null && hs1Var.l();
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void r() {
        B0(null);
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final synchronized void x0(x3.a aVar) {
        r3.o.e("resume must be called on the main UI thread.");
        if (this.f9798i != null) {
            this.f9798i.d().Z0(aVar == null ? null : (Context) x3.b.O0(aVar));
        }
    }
}
