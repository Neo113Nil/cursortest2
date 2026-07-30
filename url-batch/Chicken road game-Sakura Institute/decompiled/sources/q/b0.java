package q;

import d0.t1;
import g0.g1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 implements p1.r, q1.c, q1.f {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f7254a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f7255b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f7256c;

    public b0(s0 s0Var) {
        this.f7254a = s0Var;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f7255b = g0.d.J(s0Var, t0Var);
        this.f7256c = g0.d.J(s0Var, t0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return r6.k.a(((b0) obj).f7254a, this.f7254a);
        }
        return false;
    }

    @Override // p1.r
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        g1 g1Var = this.f7255b;
        int a3 = ((s0) g1Var.getValue()).a(h0Var, h0Var.getLayoutDirection());
        int d8 = ((s0) g1Var.getValue()).d(h0Var);
        int c4 = ((s0) g1Var.getValue()).c(h0Var, h0Var.getLayoutDirection()) + a3;
        int b9 = ((s0) g1Var.getValue()).b(h0Var) + d8;
        p1.n0 b10 = e0Var.b(r4.a.M(-c4, -b9, j8));
        return h0Var.C(r4.a.w(j8, b10.f7063f + c4), r4.a.v(j8, b10.f7064g + b9), e6.v.f2827f, new t1(b10, a3, d8, 1));
    }

    @Override // q1.c
    public final void g(q1.g gVar) {
        s0 s0Var = (s0) gVar.g(w0.f7372a);
        s0 s0Var2 = this.f7254a;
        this.f7255b.setValue(new w(s0Var2, s0Var));
        this.f7256c.setValue(new p0(s0Var, s0Var2));
    }

    @Override // q1.f
    public final q1.h getKey() {
        return w0.f7372a;
    }

    @Override // q1.f
    public final Object getValue() {
        return (s0) this.f7256c.getValue();
    }

    public final int hashCode() {
        return this.f7254a.hashCode();
    }
}
