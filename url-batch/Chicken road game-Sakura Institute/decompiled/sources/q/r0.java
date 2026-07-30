package q;

import g0.g1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7337a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f7338b;

    public r0(c0 c0Var, String str) {
        this.f7337a = str;
        this.f7338b = g0.d.J(c0Var, g0.t0.f3903k);
    }

    @Override // q.s0
    public final int a(m2.b bVar, m2.k kVar) {
        return e().f7265a;
    }

    @Override // q.s0
    public final int b(m2.b bVar) {
        return e().f7268d;
    }

    @Override // q.s0
    public final int c(m2.b bVar, m2.k kVar) {
        return e().f7267c;
    }

    @Override // q.s0
    public final int d(m2.b bVar) {
        return e().f7266b;
    }

    public final c0 e() {
        return (c0) this.f7338b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            return r6.k.a(e(), ((r0) obj).e());
        }
        return false;
    }

    public final void f(c0 c0Var) {
        this.f7338b.setValue(c0Var);
    }

    public final int hashCode() {
        return this.f7337a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7337a);
        sb.append("(left=");
        sb.append(e().f7265a);
        sb.append(", top=");
        sb.append(e().f7266b);
        sb.append(", right=");
        sb.append(e().f7267c);
        sb.append(", bottom=");
        return a0.m.l(sb, e().f7268d, ')');
    }
}
