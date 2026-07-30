package q;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0.g f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7326b;

    public p(s0.g gVar, boolean z8) {
        this.f7325a = gVar;
        this.f7326b = z8;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        boolean isEmpty = list.isEmpty();
        e6.v vVar = e6.v.f2827f;
        if (isEmpty) {
            return h0Var.C(m2.a.j(j8), m2.a.i(j8), vVar, l.f7301i);
        }
        long a3 = this.f7326b ? j8 : m2.a.a(j8, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            p1.e0 e0Var = (p1.e0) list.get(0);
            e0Var.g();
            p1.n0 b9 = e0Var.b(a3);
            int max = Math.max(m2.a.j(j8), b9.f7063f);
            int max2 = Math.max(m2.a.i(j8), b9.f7064g);
            return h0Var.C(max, max2, vVar, new o(b9, e0Var, h0Var, max, max2, this));
        }
        p1.n0[] n0VarArr = new p1.n0[list.size()];
        r6.t tVar = new r6.t();
        tVar.f7966f = m2.a.j(j8);
        r6.t tVar2 = new r6.t();
        tVar2.f7966f = m2.a.i(j8);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            p1.e0 e0Var2 = (p1.e0) list.get(i7);
            e0Var2.g();
            p1.n0 b10 = e0Var2.b(a3);
            n0VarArr[i7] = b10;
            tVar.f7966f = Math.max(tVar.f7966f, b10.f7063f);
            tVar2.f7966f = Math.max(tVar2.f7966f, b10.f7064g);
        }
        return h0Var.C(tVar.f7966f, tVar2.f7966f, vVar, new d0.m0(n0VarArr, list, h0Var, tVar, tVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f7325a.equals(pVar.f7325a) && this.f7326b == pVar.f7326b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7326b) + (this.f7325a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f7325a + ", propagateMinConstraints=" + this.f7326b + ')';
    }
}
