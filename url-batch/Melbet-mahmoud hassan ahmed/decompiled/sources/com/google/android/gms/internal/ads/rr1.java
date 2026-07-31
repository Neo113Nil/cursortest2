package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rr1 {

    /* renamed from: a, reason: collision with root package name */
    private final lr1 f11354a;

    /* renamed from: b, reason: collision with root package name */
    private final y2.a f11355b;

    /* renamed from: c, reason: collision with root package name */
    private final ru0 f11356c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f11357d;

    /* renamed from: e, reason: collision with root package name */
    private final wv1 f11358e;

    /* renamed from: f, reason: collision with root package name */
    private final xw2 f11359f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f11360g;

    /* renamed from: h, reason: collision with root package name */
    private final gb f11361h;

    /* renamed from: i, reason: collision with root package name */
    private final po0 f11362i;

    /* renamed from: j, reason: collision with root package name */
    private final i80 f11363j;

    /* renamed from: k, reason: collision with root package name */
    private final o42 f11364k;

    /* renamed from: l, reason: collision with root package name */
    private final cy2 f11365l;

    /* renamed from: m, reason: collision with root package name */
    private cc3<eu0> f11366m;

    rr1(or1 or1Var) {
        Context context;
        Executor executor;
        gb gbVar;
        po0 po0Var;
        y2.a aVar;
        ru0 ru0Var;
        o42 o42Var;
        cy2 cy2Var;
        wv1 wv1Var;
        xw2 xw2Var;
        context = or1Var.f9787c;
        this.f11357d = context;
        executor = or1Var.f9791g;
        this.f11360g = executor;
        gbVar = or1Var.f9792h;
        this.f11361h = gbVar;
        po0Var = or1Var.f9793i;
        this.f11362i = po0Var;
        aVar = or1Var.f9785a;
        this.f11355b = aVar;
        this.f11354a = new lr1(null);
        ru0Var = or1Var.f9786b;
        this.f11356c = ru0Var;
        this.f11363j = new i80();
        o42Var = or1Var.f9790f;
        this.f11364k = o42Var;
        cy2Var = or1Var.f9794j;
        this.f11365l = cy2Var;
        wv1Var = or1Var.f9788d;
        this.f11358e = wv1Var;
        xw2Var = or1Var.f9789e;
        this.f11359f = xw2Var;
    }

    final /* synthetic */ eu0 a(eu0 eu0Var) {
        eu0Var.G0("/result", this.f11363j);
        tv0 E0 = eu0Var.E0();
        lr1 lr1Var = this.f11354a;
        E0.V(null, lr1Var, lr1Var, lr1Var, lr1Var, false, null, new y2.b(this.f11357d, null, null), null, null, this.f11364k, this.f11365l, this.f11358e, this.f11359f, null, null);
        return eu0Var;
    }

    final /* synthetic */ cc3 c(String str, JSONObject jSONObject, eu0 eu0Var) {
        return this.f11363j.b(eu0Var, str, jSONObject);
    }

    public final synchronized cc3<JSONObject> d(final String str, final JSONObject jSONObject) {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return rb3.i(null);
        }
        return rb3.n(cc3Var, new xa3() { // from class: com.google.android.gms.internal.ads.er1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rr1.this.c(str, jSONObject, (eu0) obj);
            }
        }, this.f11360g);
    }

    public final synchronized void e(rr2 rr2Var, ur2 ur2Var) {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return;
        }
        rb3.r(cc3Var, new jr1(this, rr2Var, ur2Var), this.f11360g);
    }

    public final synchronized void f() {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return;
        }
        rb3.r(cc3Var, new fr1(this), this.f11360g);
        this.f11366m = null;
    }

    public final synchronized void g(String str, Map<String, ?> map) {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return;
        }
        rb3.r(cc3Var, new ir1(this, "sendMessageToNativeJs", map), this.f11360g);
    }

    public final synchronized void h() {
        final Context context = this.f11357d;
        final po0 po0Var = this.f11362i;
        final String str = (String) sw.c().b(m10.f8275p2);
        final gb gbVar = this.f11361h;
        final y2.a aVar = this.f11355b;
        cc3<eu0> m7 = rb3.m(rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.ou0
            @Override // com.google.android.gms.internal.ads.wa3
            public final cc3 zza() {
                Context context2 = context;
                gb gbVar2 = gbVar;
                po0 po0Var2 = po0Var;
                y2.a aVar2 = aVar;
                String str2 = str;
                y2.t.A();
                eu0 a7 = ru0.a(context2, vv0.a(), "", false, false, gbVar2, null, po0Var2, null, null, aVar2, ar.a(), null, null);
                final ap0 g7 = ap0.g(a7);
                a7.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.mu0
                    @Override // com.google.android.gms.internal.ads.rv0
                    public final void c(boolean z6) {
                        ap0.this.h();
                    }
                });
                a7.loadUrl(str2);
                return g7;
            }
        }, wo0.f13898e), new e43() { // from class: com.google.android.gms.internal.ads.dr1
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                eu0 eu0Var = (eu0) obj;
                rr1.this.a(eu0Var);
                return eu0Var;
            }
        }, this.f11360g);
        this.f11366m = m7;
        zo0.a(m7, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, t70<Object> t70Var) {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return;
        }
        rb3.r(cc3Var, new gr1(this, str, t70Var), this.f11360g);
    }

    public final <T> void j(WeakReference<T> weakReference, String str, t70<T> t70Var) {
        i(str, new qr1(this, weakReference, str, t70Var, null));
    }

    public final synchronized void k(String str, t70<Object> t70Var) {
        cc3<eu0> cc3Var = this.f11366m;
        if (cc3Var == null) {
            return;
        }
        rb3.r(cc3Var, new hr1(this, str, t70Var), this.f11360g);
    }
}
