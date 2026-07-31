package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jo2<R extends ea1<AdT>, AdT extends v61> implements ep2<R, AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final ep2<R, AdT> f7197a;

    /* renamed from: b, reason: collision with root package name */
    private final ep2<R, oo2<R, AdT>> f7198b;

    /* renamed from: c, reason: collision with root package name */
    private final qu2<R, AdT> f7199c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7200d;

    /* renamed from: e, reason: collision with root package name */
    private R f7201e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f7202f;

    public jo2(ep2<R, AdT> ep2Var, ep2<R, oo2<R, AdT>> ep2Var2, qu2<R, AdT> qu2Var, String str, Executor executor) {
        this.f7197a = ep2Var;
        this.f7198b = ep2Var2;
        this.f7199c = qu2Var;
        this.f7200d = str;
        this.f7202f = executor;
    }

    private final cc3<AdT> f(cu2<R, AdT> cu2Var, fp2 fp2Var) {
        R r7 = cu2Var.f3950a;
        this.f7201e = r7;
        if (cu2Var.f3952c != null) {
            if (r7.d() != null) {
                cu2Var.f3952c.f().q(cu2Var.f3950a.d());
            }
            return rb3.i(cu2Var.f3952c);
        }
        r7.a().k(cu2Var.f3951b);
        return ((to2) this.f7197a).c(fp2Var, null, cu2Var.f3950a);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    public final /* bridge */ /* synthetic */ cc3 a(fp2 fp2Var, dp2 dp2Var, Object obj) {
        return e(fp2Var, dp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.ep2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized R g() {
        return this.f7201e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 c(fp2 fp2Var, io2 io2Var, dp2 dp2Var, ea1 ea1Var, oo2 oo2Var) {
        if (oo2Var != null) {
            io2 io2Var2 = new io2(io2Var.f6721a, io2Var.f6722b, io2Var.f6723c, io2Var.f6724d, io2Var.f6725e, io2Var.f6726f, oo2Var.f9757a);
            if (oo2Var.f9759c != null) {
                this.f7201e = null;
                this.f7199c.e(io2Var2);
                return f(oo2Var.f9759c, fp2Var);
            }
            cc3<nu2<R, AdT>> a7 = this.f7199c.a(io2Var2);
            if (a7 != null) {
                this.f7201e = null;
                return rb3.n(a7, new xa3() { // from class: com.google.android.gms.internal.ads.fo2
                    @Override // com.google.android.gms.internal.ads.xa3
                    public final cc3 c(Object obj) {
                        return jo2.this.d((nu2) obj);
                    }
                }, this.f7202f);
            }
            this.f7199c.e(io2Var2);
            fp2Var = new fp2(fp2Var.f5172b, oo2Var.f9758b);
        }
        cc3 c7 = ((to2) this.f7197a).c(fp2Var, dp2Var, ea1Var);
        this.f7201e = ea1Var;
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ cc3 d(nu2 nu2Var) {
        Object obj;
        if (nu2Var == null || nu2Var.f9340a == null || (obj = nu2Var.f9341b) == null) {
            throw new fz1(1, "Empty prefetch");
        }
        or F = ur.F();
        mr F2 = nr.F();
        F2.u(2);
        F2.s(rr.H());
        F.r(F2);
        nu2Var.f9340a.f3950a.a().c().C(F.o());
        return f(nu2Var.f9340a, ((io2) obj).f6722b);
    }

    public final synchronized cc3<AdT> e(final fp2 fp2Var, final dp2<R> dp2Var, R r7) {
        ca1<R> a7 = dp2Var.a(fp2Var.f5172b);
        a7.o(new ko2(this.f7200d));
        final R f7 = a7.f();
        f7.e();
        f7.e();
        kv kvVar = f7.e().f7618d;
        if (kvVar.f7661x == null && kvVar.C == null) {
            ks2 e7 = f7.e();
            final io2 io2Var = new io2(dp2Var, fp2Var, e7.f7618d, e7.f7620f, this.f7202f, e7.f7624j, null);
            return rb3.n(ib3.E(((po2) this.f7198b).c(fp2Var, dp2Var, f7)), new xa3() { // from class: com.google.android.gms.internal.ads.go2
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return jo2.this.c(fp2Var, io2Var, dp2Var, f7, (oo2) obj);
                }
            }, this.f7202f);
        }
        this.f7201e = f7;
        return ((to2) this.f7197a).c(fp2Var, dp2Var, f7);
    }
}
