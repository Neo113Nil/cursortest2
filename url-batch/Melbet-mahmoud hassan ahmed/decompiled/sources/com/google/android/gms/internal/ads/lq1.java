package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lq1 {

    /* renamed from: a, reason: collision with root package name */
    private final ks2 f8046a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f8047b;

    /* renamed from: c, reason: collision with root package name */
    private final et1 f8048c;

    /* renamed from: d, reason: collision with root package name */
    private final yr1 f8049d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f8050e;

    /* renamed from: f, reason: collision with root package name */
    private final wv1 f8051f;

    /* renamed from: g, reason: collision with root package name */
    private final xw2 f8052g;

    /* renamed from: h, reason: collision with root package name */
    private final cy2 f8053h;

    /* renamed from: i, reason: collision with root package name */
    private final o42 f8054i;

    public lq1(ks2 ks2Var, Executor executor, et1 et1Var, Context context, wv1 wv1Var, xw2 xw2Var, cy2 cy2Var, o42 o42Var, yr1 yr1Var) {
        this.f8046a = ks2Var;
        this.f8047b = executor;
        this.f8048c = et1Var;
        this.f8050e = context;
        this.f8051f = wv1Var;
        this.f8052g = xw2Var;
        this.f8053h = cy2Var;
        this.f8054i = o42Var;
        this.f8049d = yr1Var;
    }

    private final void h(eu0 eu0Var) {
        i(eu0Var);
        eu0Var.G0("/video", s70.f11704l);
        eu0Var.G0("/videoMeta", s70.f11705m);
        eu0Var.G0("/precache", new us0());
        eu0Var.G0("/delayPageLoaded", s70.f11708p);
        eu0Var.G0("/instrument", s70.f11706n);
        eu0Var.G0("/log", s70.f11699g);
        eu0Var.G0("/click", s70.a(null));
        if (this.f8046a.f7616b != null) {
            eu0Var.E0().u0(true);
            eu0Var.G0("/open", new f80(null, null, null, null, null));
        } else {
            eu0Var.E0().u0(false);
        }
        if (y2.t.o().z(eu0Var.getContext())) {
            eu0Var.G0("/logScionEvent", new z70(eu0Var.getContext()));
        }
    }

    private static final void i(eu0 eu0Var) {
        eu0Var.G0("/videoClicked", s70.f11700h);
        eu0Var.E0().T0(true);
        if (((Boolean) sw.c().b(m10.f8291r2)).booleanValue()) {
            eu0Var.G0("/getNativeAdViewSignals", s70.f11711s);
        }
        eu0Var.G0("/getNativeClickMeta", s70.f11712t);
    }

    public final cc3<eu0> a(final JSONObject jSONObject) {
        return rb3.n(rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.dq1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return lq1.this.e(obj);
            }
        }, this.f8047b), new xa3() { // from class: com.google.android.gms.internal.ads.fq1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return lq1.this.c(jSONObject, (eu0) obj);
            }
        }, this.f8047b);
    }

    public final cc3<eu0> b(final String str, final String str2, final rr2 rr2Var, final ur2 ur2Var, final pv pvVar) {
        return rb3.n(rb3.i(null), new xa3() { // from class: com.google.android.gms.internal.ads.eq1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return lq1.this.d(pvVar, rr2Var, ur2Var, str, str2, obj);
            }
        }, this.f8047b);
    }

    final /* synthetic */ cc3 c(JSONObject jSONObject, final eu0 eu0Var) {
        final ap0 g7 = ap0.g(eu0Var);
        eu0Var.h0(this.f8046a.f7616b != null ? vv0.d() : vv0.e());
        eu0Var.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.aq1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                lq1.this.f(eu0Var, g7, z6);
            }
        });
        eu0Var.b1("google.afma.nativeAds.renderVideo", jSONObject);
        return g7;
    }

    final /* synthetic */ cc3 d(pv pvVar, rr2 rr2Var, ur2 ur2Var, String str, String str2, Object obj) {
        final eu0 a7 = this.f8048c.a(pvVar, rr2Var, ur2Var);
        final ap0 g7 = ap0.g(a7);
        if (this.f8046a.f7616b != null) {
            h(a7);
            a7.h0(vv0.d());
        } else {
            vr1 b7 = this.f8049d.b();
            a7.E0().V(b7, b7, b7, b7, b7, false, null, new y2.b(this.f8050e, null, null), null, null, this.f8054i, this.f8053h, this.f8051f, this.f8052g, null, b7);
            i(a7);
        }
        a7.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.bq1
            @Override // com.google.android.gms.internal.ads.rv0
            public final void c(boolean z6) {
                lq1.this.g(a7, g7, z6);
            }
        });
        a7.S(str, str2, null);
        return g7;
    }

    final /* synthetic */ cc3 e(Object obj) {
        eu0 a7 = this.f8048c.a(pv.h(), null, null);
        final ap0 g7 = ap0.g(a7);
        h(a7);
        a7.E0().Y0(new sv0() { // from class: com.google.android.gms.internal.ads.cq1
            @Override // com.google.android.gms.internal.ads.sv0
            public final void zza() {
                ap0.this.h();
            }
        });
        a7.loadUrl((String) sw.c().b(m10.f8283q2));
        return g7;
    }

    final /* synthetic */ void f(eu0 eu0Var, ap0 ap0Var, boolean z6) {
        if (this.f8046a.f7615a != null && eu0Var.p() != null) {
            eu0Var.p().w6(this.f8046a.f7615a);
        }
        ap0Var.h();
    }

    final /* synthetic */ void g(eu0 eu0Var, ap0 ap0Var, boolean z6) {
        if (!z6) {
            ap0Var.f(new u82(1, "Html video Web View failed to load."));
            return;
        }
        if (this.f8046a.f7615a != null && eu0Var.p() != null) {
            eu0Var.p().w6(this.f8046a.f7615a);
        }
        ap0Var.h();
    }
}
