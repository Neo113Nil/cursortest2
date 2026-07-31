package B;

import I.C0156j0;
import a0.C0238c;
import j0.C0554b;
import j0.InterfaceC0553a;
import x.EnumC1187E;
import x.p0;

/* loaded from: classes.dex */
public final class W implements x.Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f331b;

    public /* synthetic */ W(a0 a0Var, int i3) {
        this.f330a = i3;
        this.f331b = a0Var;
    }

    @Override // x.Z
    public final void a() {
        switch (this.f330a) {
            case 0:
                a0 a0Var = this.f331b;
                a0Var.f356o.setValue(null);
                a0Var.f357p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // x.Z
    public final void b() {
        switch (this.f330a) {
            case 0:
                a0 a0Var = this.f331b;
                a0Var.f356o.setValue(null);
                a0Var.f357p.setValue(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [e2.c, f2.k] */
    @Override // x.Z
    public final void c(long j3) {
        p0 d3;
        p0 d4;
        p0 d5;
        switch (this.f330a) {
            case 0:
                a0 a0Var = this.f331b;
                long i3 = a0Var.i(true);
                float f3 = F.f278a;
                long e3 = l0.c.e(C0238c.d(i3), C0238c.e(i3) - 1.0f);
                x.Q q3 = a0Var.f345d;
                if (q3 != null && (d3 = q3.d()) != null) {
                    long e4 = d3.e(e3);
                    a0Var.f353l = e4;
                    a0Var.f357p.setValue(new C0238c(e4));
                    a0Var.f355n = 0L;
                    a0Var.f356o.setValue(EnumC1187E.f9940d);
                    a0Var.p(false);
                    break;
                }
                break;
            default:
                a0 a0Var2 = this.f331b;
                if (a0Var2.h()) {
                    C0156j0 c0156j0 = a0Var2.f356o;
                    if (((EnumC1187E) c0156j0.getValue()) == null) {
                        c0156j0.setValue(EnumC1187E.f9942f);
                        a0Var2.f358q = -1;
                        a0Var2.k();
                        x.Q q4 = a0Var2.f345d;
                        if (q4 == null || (d5 = q4.d()) == null || !d5.c(j3)) {
                            x.Q q5 = a0Var2.f345d;
                            if (q5 != null && (d4 = q5.d()) != null) {
                                int a3 = a0Var2.f343b.a(d4.b(j3, true));
                                I0.z c2 = a0.c(a0Var2.j().f3097a, O2.l.J(a3, a3));
                                a0Var2.f(false);
                                InterfaceC0553a interfaceC0553a = a0Var2.f349h;
                                if (interfaceC0553a != null) {
                                    ((C0554b) interfaceC0553a).a();
                                }
                                a0Var2.f344c.n(c2);
                            }
                        } else if (a0Var2.j().f3097a.f596a.length() != 0) {
                            a0Var2.f(false);
                            a0Var2.f354m = Integer.valueOf((int) (a0.a(a0Var2, I0.z.a(a0Var2.j(), null, C0.J.f567b, 5), j3, true, false, C0017s.f442e, true) >> 32));
                        }
                        a0Var2.n(x.F.f9944d);
                        a0Var2.f353l = j3;
                        a0Var2.f357p.setValue(new C0238c(j3));
                        a0Var2.f355n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [e2.c, f2.k] */
    @Override // x.Z
    public final void d(long j3) {
        p0 d3;
        InterfaceC0553a interfaceC0553a;
        p0 d4;
        switch (this.f330a) {
            case 0:
                a0 a0Var = this.f331b;
                a0Var.f355n = C0238c.h(a0Var.f355n, j3);
                x.Q q3 = a0Var.f345d;
                if (q3 != null && (d3 = q3.d()) != null) {
                    a0Var.f357p.setValue(new C0238c(C0238c.h(a0Var.f353l, a0Var.f355n)));
                    I0.t tVar = a0Var.f343b;
                    C0238c g3 = a0Var.g();
                    f2.j.c(g3);
                    int a3 = tVar.a(d3.b(g3.f4722a, true));
                    long J3 = O2.l.J(a3, a3);
                    if (!C0.J.a(J3, a0Var.j().f3098b)) {
                        x.Q q4 = a0Var.f345d;
                        if ((q4 == null || ((Boolean) q4.f9991q.getValue()).booleanValue()) && (interfaceC0553a = a0Var.f349h) != null) {
                            ((C0554b) interfaceC0553a).a();
                        }
                        a0Var.f344c.n(a0.c(a0Var.j().f3097a, J3));
                        break;
                    }
                }
                break;
            default:
                a0 a0Var2 = this.f331b;
                if (a0Var2.h() && a0Var2.j().f3097a.f596a.length() != 0) {
                    a0Var2.f355n = C0238c.h(a0Var2.f355n, j3);
                    x.Q q5 = a0Var2.f345d;
                    if (q5 != null && (d4 = q5.d()) != null) {
                        a0Var2.f357p.setValue(new C0238c(C0238c.h(a0Var2.f353l, a0Var2.f355n)));
                        Integer num = a0Var2.f354m;
                        r rVar = C0017s.f442e;
                        if (num == null) {
                            C0238c g4 = a0Var2.g();
                            f2.j.c(g4);
                            if (!d4.c(g4.f4722a)) {
                                int a4 = a0Var2.f343b.a(d4.b(a0Var2.f353l, true));
                                I0.t tVar2 = a0Var2.f343b;
                                C0238c g5 = a0Var2.g();
                                f2.j.c(g5);
                                if (a4 == tVar2.a(d4.b(g5.f4722a, true))) {
                                    rVar = C0017s.f441d;
                                }
                                I0.z j4 = a0Var2.j();
                                C0238c g6 = a0Var2.g();
                                f2.j.c(g6);
                                a0.a(a0Var2, j4, g6.f4722a, false, false, rVar, true);
                                int i3 = C0.J.f568c;
                            }
                        }
                        Integer num2 = a0Var2.f354m;
                        int intValue = num2 != null ? num2.intValue() : d4.b(a0Var2.f353l, false);
                        C0238c g7 = a0Var2.g();
                        f2.j.c(g7);
                        int b3 = d4.b(g7.f4722a, false);
                        if (a0Var2.f354m != null || intValue != b3) {
                            I0.z j5 = a0Var2.j();
                            C0238c g8 = a0Var2.g();
                            f2.j.c(g8);
                            a0.a(a0Var2, j5, g8.f4722a, false, false, rVar, true);
                            int i32 = C0.J.f568c;
                        }
                    }
                    a0Var2.p(false);
                    break;
                }
                break;
        }
    }

    @Override // x.Z
    public final void e() {
        int i3 = this.f330a;
    }

    public void i() {
        a0 a0Var = this.f331b;
        a0Var.f356o.setValue(null);
        a0Var.f357p.setValue(null);
        a0Var.p(true);
        a0Var.f354m = null;
        boolean b3 = C0.J.b(a0Var.j().f3098b);
        a0Var.n(b3 ? x.F.f9946f : x.F.f9945e);
        x.Q q3 = a0Var.f345d;
        if (q3 != null) {
            q3.f9987m.setValue(Boolean.valueOf(!b3 && O2.d.W(a0Var, true)));
        }
        x.Q q4 = a0Var.f345d;
        if (q4 != null) {
            q4.f9988n.setValue(Boolean.valueOf(!b3 && O2.d.W(a0Var, false)));
        }
        x.Q q5 = a0Var.f345d;
        if (q5 == null) {
            return;
        }
        q5.f9989o.setValue(Boolean.valueOf(b3 && O2.d.W(a0Var, true)));
    }

    @Override // x.Z
    public final void onCancel() {
        switch (this.f330a) {
            case 0:
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
