package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 implements w.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f161b;

    public /* synthetic */ u0(x0 x0Var, int i7) {
        this.f160a = i7;
        this.f161b = x0Var;
    }

    @Override // w.n0
    public final void a() {
        switch (this.f160a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = this.f161b;
                x0Var.f189o.setValue(null);
                x0Var.f190p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // w.n0
    public final void b() {
        switch (this.f160a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = this.f161b;
                x0Var.f189o.setValue(null);
                x0Var.f190p.setValue(null);
                break;
        }
    }

    @Override // w.n0
    public final void c(long j8) {
        w.z0 d8;
        long j9;
        w.z0 d9;
        w.z0 d10;
        switch (this.f160a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = this.f161b;
                long i7 = x0Var.i(true);
                float f9 = g0.f70a;
                long a3 = u3.r.a(y0.c.d(i7), y0.c.e(i7) - 1.0f);
                w.j0 j0Var = x0Var.f178d;
                if (j0Var != null && (d8 = j0Var.d()) != null) {
                    long e9 = d8.e(a3);
                    x0Var.f186l = e9;
                    x0Var.f190p.setValue(new y0.c(e9));
                    x0Var.f188n = 0L;
                    x0Var.f189o.setValue(w.z.f9467f);
                    x0Var.p(false);
                    break;
                }
                break;
            default:
                x0 x0Var2 = this.f161b;
                g0.g1 g1Var = x0Var2.f189o;
                if (x0Var2.h() && ((w.z) g1Var.getValue()) == null) {
                    g1Var.setValue(w.z.f9469h);
                    x0Var2.f191q = -1;
                    x0Var2.k();
                    w.j0 j0Var2 = x0Var2.f178d;
                    if (j0Var2 == null || (d10 = j0Var2.d()) == null || !d10.c(j8)) {
                        j9 = j8;
                        w.j0 j0Var3 = x0Var2.f178d;
                        if (j0Var3 != null && (d9 = j0Var3.d()) != null) {
                            int a9 = x0Var2.f176b.a(d9.b(j9, true));
                            g2.w c4 = x0.c(x0Var2.j().f4065a, r4.a.h(a9, a9));
                            x0Var2.f(false);
                            h1.a aVar = x0Var2.f182h;
                            if (aVar != null) {
                                ((h1.b) aVar).a();
                            }
                            x0Var2.f177c.f(c4);
                        }
                    } else if (x0Var2.j().f4065a.f373f.length() != 0) {
                        x0Var2.f(false);
                        j9 = j8;
                        x0Var2.f187m = Integer.valueOf((int) (x0.a(x0Var2, g2.w.a(x0Var2.j(), null, a2.j0.f406b, 5), j9, true, false, t.f142e, true) >> 32));
                    }
                    x0Var2.n(w.a0.f9183f);
                    x0Var2.f186l = j9;
                    x0Var2.f190p.setValue(new y0.c(j9));
                    x0Var2.f188n = 0L;
                    break;
                }
                break;
        }
    }

    @Override // w.n0
    public final void d() {
        int i7 = this.f160a;
    }

    @Override // w.n0
    public final void e(long j8) {
        w.z0 d8;
        h1.a aVar;
        w.z0 d9;
        switch (this.f160a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x0 x0Var = this.f161b;
                x0Var.f188n = y0.c.h(x0Var.f188n, j8);
                w.j0 j0Var = x0Var.f178d;
                if (j0Var != null && (d8 = j0Var.d()) != null) {
                    x0Var.f190p.setValue(new y0.c(y0.c.h(x0Var.f186l, x0Var.f188n)));
                    g2.q qVar = x0Var.f176b;
                    y0.c g9 = x0Var.g();
                    r6.k.c(g9);
                    int a3 = qVar.a(d8.b(g9.f9778a, true));
                    long h3 = r4.a.h(a3, a3);
                    if (!a2.j0.a(h3, x0Var.j().f4066b)) {
                        w.j0 j0Var2 = x0Var.f178d;
                        if ((j0Var2 == null || ((Boolean) j0Var2.f9271q.getValue()).booleanValue()) && (aVar = x0Var.f182h) != null) {
                            ((h1.b) aVar).a();
                        }
                        x0Var.f177c.f(x0.c(x0Var.j().f4065a, h3));
                        break;
                    }
                }
                break;
            default:
                s sVar = t.f142e;
                x0 x0Var2 = this.f161b;
                if (x0Var2.h() && x0Var2.j().f4065a.f373f.length() != 0) {
                    x0Var2.f188n = y0.c.h(x0Var2.f188n, j8);
                    w.j0 j0Var3 = x0Var2.f178d;
                    if (j0Var3 != null && (d9 = j0Var3.d()) != null) {
                        x0Var2.f190p.setValue(new y0.c(y0.c.h(x0Var2.f186l, x0Var2.f188n)));
                        if (x0Var2.f187m == null) {
                            y0.c g10 = x0Var2.g();
                            r6.k.c(g10);
                            if (!d9.c(g10.f9778a)) {
                                int a9 = x0Var2.f176b.a(d9.b(x0Var2.f186l, true));
                                g2.q qVar2 = x0Var2.f176b;
                                y0.c g11 = x0Var2.g();
                                r6.k.c(g11);
                                if (a9 == qVar2.a(d9.b(g11.f9778a, true))) {
                                    sVar = t.f141d;
                                }
                                g2.w j9 = x0Var2.j();
                                y0.c g12 = x0Var2.g();
                                r6.k.c(g12);
                                x0.a(x0Var2, j9, g12.f9778a, false, false, sVar, true);
                                int i7 = a2.j0.f407c;
                            }
                        }
                        Integer num = x0Var2.f187m;
                        int intValue = num != null ? num.intValue() : d9.b(x0Var2.f186l, false);
                        y0.c g13 = x0Var2.g();
                        r6.k.c(g13);
                        int b9 = d9.b(g13.f9778a, false);
                        if (x0Var2.f187m != null || intValue != b9) {
                            g2.w j10 = x0Var2.j();
                            y0.c g14 = x0Var2.g();
                            r6.k.c(g14);
                            x0.a(x0Var2, j10, g14.f9778a, false, false, sVar, true);
                            int i72 = a2.j0.f407c;
                        }
                    }
                    x0Var2.p(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        x0 x0Var = this.f161b;
        x0Var.f189o.setValue(null);
        x0Var.f190p.setValue(null);
        x0Var.p(true);
        x0Var.f187m = null;
        boolean b9 = a2.j0.b(x0Var.j().f4066b);
        x0Var.n(b9 ? w.a0.f9185h : w.a0.f9184g);
        w.j0 j0Var = x0Var.f178d;
        if (j0Var != null) {
            j0Var.f9267m.setValue(Boolean.valueOf(!b9 && a8.d.M(x0Var, true)));
        }
        w.j0 j0Var2 = x0Var.f178d;
        if (j0Var2 != null) {
            j0Var2.f9268n.setValue(Boolean.valueOf(!b9 && a8.d.M(x0Var, false)));
        }
        w.j0 j0Var3 = x0Var.f178d;
        if (j0Var3 == null) {
            return;
        }
        j0Var3.f9269o.setValue(Boolean.valueOf(b9 && a8.d.M(x0Var, true)));
    }

    @Override // w.n0
    public final void onCancel() {
        switch (this.f160a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
