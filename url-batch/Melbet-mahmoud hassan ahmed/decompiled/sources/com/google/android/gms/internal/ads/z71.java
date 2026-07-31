package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z71<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p02 f14992a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f14993b;

    /* renamed from: c, reason: collision with root package name */
    private final nw2 f14994c;

    /* renamed from: d, reason: collision with root package name */
    private final j11 f14995d;

    /* renamed from: e, reason: collision with root package name */
    private final w82<T> f14996e;

    /* renamed from: f, reason: collision with root package name */
    private final fg1 f14997f;

    /* renamed from: g, reason: collision with root package name */
    private ds2 f14998g;

    /* renamed from: h, reason: collision with root package name */
    private final u12 f14999h;

    /* renamed from: i, reason: collision with root package name */
    private final aa1 f15000i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f15001j;

    /* renamed from: k, reason: collision with root package name */
    private final h12 f15002k;

    /* renamed from: l, reason: collision with root package name */
    private final f52 f15003l;

    z71(p02 p02Var, ks2 ks2Var, nw2 nw2Var, j11 j11Var, w82<T> w82Var, fg1 fg1Var, ds2 ds2Var, u12 u12Var, aa1 aa1Var, Executor executor, h12 h12Var, f52 f52Var) {
        this.f14992a = p02Var;
        this.f14993b = ks2Var;
        this.f14994c = nw2Var;
        this.f14995d = j11Var;
        this.f14996e = w82Var;
        this.f14997f = fg1Var;
        this.f14998g = ds2Var;
        this.f14999h = u12Var;
        this.f15000i = aa1Var;
        this.f15001j = executor;
        this.f15002k = h12Var;
        this.f15003l = f52Var;
    }

    public final cv a(Throwable th) {
        return dt2.b(th, this.f15003l);
    }

    public final fg1 c() {
        return this.f14997f;
    }

    final /* synthetic */ ds2 d(ds2 ds2Var) {
        this.f14995d.a(ds2Var);
        return ds2Var;
    }

    public final cc3<vi0> e(final au2 au2Var) {
        rv2 a7 = this.f14994c.b(gw2.GET_CACHE_KEY, this.f15000i.c()).f(new xa3() { // from class: com.google.android.gms.internal.ads.v71
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return z71.this.f(au2Var, (vi0) obj);
            }
        }).a();
        rb3.r(a7, new x71(this), this.f15001j);
        return a7;
    }

    final /* synthetic */ cc3 f(au2 au2Var, vi0 vi0Var) {
        vi0Var.f13409n = au2Var;
        return this.f14999h.a(vi0Var);
    }

    public final cc3<Void> g(vi0 vi0Var) {
        rv2 a7 = this.f14994c.b(gw2.NOTIFY_CACHE_HIT, this.f14999h.f(vi0Var)).a();
        rb3.r(a7, new y71(this), this.f15001j);
        return a7;
    }

    public final cc3<T> h(cc3<ds2> cc3Var) {
        dw2 f7 = this.f14994c.b(gw2.RENDERER, cc3Var).e(new pv2() { // from class: com.google.android.gms.internal.ads.u71
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                ds2 ds2Var = (ds2) obj;
                z71.this.d(ds2Var);
                return ds2Var;
            }
        }).f(this.f14996e);
        if (!((Boolean) sw.c().b(m10.V3)).booleanValue()) {
            f7 = f7.i(((Integer) sw.c().b(m10.W3)).intValue(), TimeUnit.SECONDS);
        }
        return f7.a();
    }

    public final cc3<ds2> i() {
        kv kvVar = this.f14993b.f7618d;
        if (kvVar.C == null && kvVar.f7661x == null) {
            return j(this.f15000i.c());
        }
        nw2 nw2Var = this.f14994c;
        return wv2.c(this.f14992a.c(), gw2.SERVER_TRANSACTION, nw2Var).a();
    }

    public final cc3<ds2> j(cc3<vi0> cc3Var) {
        dw2 f7;
        ds2 ds2Var = this.f14998g;
        if (ds2Var != null) {
            nw2 nw2Var = this.f14994c;
            f7 = wv2.c(rb3.i(ds2Var), gw2.SERVER_TRANSACTION, nw2Var);
        } else {
            y2.t.d().j();
            dw2<I> b7 = this.f14994c.b(gw2.SERVER_TRANSACTION, cc3Var);
            final h12 h12Var = this.f15002k;
            f7 = b7.f(new xa3() { // from class: com.google.android.gms.internal.ads.w71
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return h12.this.a((vi0) obj);
                }
            });
        }
        return f7.a();
    }

    public final void k(ds2 ds2Var) {
        this.f14998g = ds2Var;
    }
}
