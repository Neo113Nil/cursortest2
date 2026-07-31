package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class po2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, oo2<R, AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final tt2 f10319a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10320b;

    /* renamed from: c, reason: collision with root package name */
    private final nb3<Void> f10321c = new no2(this);

    public po2(tt2 tt2Var, Executor executor) {
        this.f10319a = tt2Var;
        this.f10320b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ cc3 a(fp2 fp2Var, dp2 dp2Var, Object obj) {
        return c(fp2Var, dp2Var, null);
    }

    final /* synthetic */ cc3 b(ea1 ea1Var, yo2 yo2Var) {
        du2 du2Var = yo2Var.f14766b;
        vi0 vi0Var = yo2Var.f14765a;
        cu2<?, ?> c7 = du2Var != null ? this.f10319a.c(du2Var) : null;
        if (du2Var == null) {
            return rb3.i(null);
        }
        if (c7 != null && vi0Var != null) {
            rb3.r(ea1Var.a().g(vi0Var), this.f10321c, this.f10320b);
        }
        return rb3.i(new oo2(du2Var, vi0Var, c7));
    }

    public final cc3<oo2<R, AdT>> c(fp2 fp2Var, dp2<R> dp2Var, final R r7) {
        return rb3.f(rb3.n(ib3.E(new zo2(this.f10319a, r7, this.f10320b).c()), new xa3() { // from class: com.google.android.gms.internal.ads.lo2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return po2.this.b(r7, (yo2) obj);
            }
        }, this.f10320b), Exception.class, new mo2(this), this.f10320b);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ Object g() {
        return null;
    }
}
