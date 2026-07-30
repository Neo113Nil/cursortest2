package q;

import g0.g1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7243a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7244b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f7245c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f7246d;

    public a(String str, int i7) {
        this.f7243a = i7;
        this.f7244b = str;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f7245c = g0.d.J(v2.c.f9101e, t0Var);
        this.f7246d = g0.d.J(Boolean.TRUE, t0Var);
    }

    @Override // q.s0
    public final int a(m2.b bVar, m2.k kVar) {
        return e().f9102a;
    }

    @Override // q.s0
    public final int b(m2.b bVar) {
        return e().f9105d;
    }

    @Override // q.s0
    public final int c(m2.b bVar, m2.k kVar) {
        return e().f9104c;
    }

    @Override // q.s0
    public final int d(m2.b bVar) {
        return e().f9103b;
    }

    public final v2.c e() {
        return (v2.c) this.f7245c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f7243a == ((a) obj).f7243a;
        }
        return false;
    }

    public final void f(b3.t0 t0Var, int i7) {
        int i8 = this.f7243a;
        if (i7 == 0 || (i7 & i8) != 0) {
            this.f7245c.setValue(t0Var.f1367a.f(i8));
            this.f7246d.setValue(Boolean.valueOf(t0Var.f1367a.o(i8)));
        }
    }

    public final int hashCode() {
        return this.f7243a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7244b);
        sb.append('(');
        sb.append(e().f9102a);
        sb.append(", ");
        sb.append(e().f9103b);
        sb.append(", ");
        sb.append(e().f9104c);
        sb.append(", ");
        return a0.m.l(sb, e().f9105d, ')');
    }
}
