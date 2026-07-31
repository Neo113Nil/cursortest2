package B;

import a0.C0238c;
import x.EnumC1187E;
import x.p0;

/* loaded from: classes.dex */
public final class X implements x.Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f333b;

    public X(a0 a0Var, boolean z3) {
        this.f332a = a0Var;
        this.f333b = z3;
    }

    @Override // x.Z
    public final void a() {
        a0 a0Var = this.f332a;
        a0Var.f356o.setValue(null);
        a0Var.f357p.setValue(null);
        a0Var.p(true);
    }

    @Override // x.Z
    public final void b() {
        a0 a0Var = this.f332a;
        a0Var.f356o.setValue(null);
        a0Var.f357p.setValue(null);
        a0Var.p(true);
    }

    @Override // x.Z
    public final void d(long j3) {
        a0 a0Var = this.f332a;
        long h3 = C0238c.h(a0Var.f355n, j3);
        a0Var.f355n = h3;
        a0Var.f357p.setValue(new C0238c(C0238c.h(a0Var.f353l, h3)));
        I0.z j4 = a0Var.j();
        C0238c g3 = a0Var.g();
        f2.j.c(g3);
        r rVar = C0017s.f444g;
        a0.a(a0Var, j4, g3.f4722a, false, this.f333b, rVar, true);
        a0Var.p(false);
    }

    @Override // x.Z
    public final void e() {
        p0 d3;
        boolean z3 = this.f333b;
        EnumC1187E enumC1187E = z3 ? EnumC1187E.f9941e : EnumC1187E.f9942f;
        a0 a0Var = this.f332a;
        a0Var.f356o.setValue(enumC1187E);
        long i3 = a0Var.i(z3);
        float f3 = F.f278a;
        long e3 = l0.c.e(C0238c.d(i3), C0238c.e(i3) - 1.0f);
        x.Q q3 = a0Var.f345d;
        if (q3 == null || (d3 = q3.d()) == null) {
            return;
        }
        long e4 = d3.e(e3);
        a0Var.f353l = e4;
        a0Var.f357p.setValue(new C0238c(e4));
        a0Var.f355n = 0L;
        a0Var.f358q = -1;
        x.Q q4 = a0Var.f345d;
        if (q4 != null) {
            q4.f9991q.setValue(Boolean.TRUE);
        }
        a0Var.p(false);
    }

    @Override // x.Z
    public final void onCancel() {
    }

    @Override // x.Z
    public final void c(long j3) {
    }
}
