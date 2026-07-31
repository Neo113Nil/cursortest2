package x;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 implements u1.e0, i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f8241a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f8242b;

    public l0(d dVar, y0.d dVar2) {
        this.f8241a = dVar;
        this.f8242b = dVar2;
    }

    @Override // x.i0
    public final int a(u1.l0 l0Var) {
        return l0Var.f7230d;
    }

    @Override // x.i0
    public final void b(int i, int[] iArr, int[] iArr2, w1.n0 n0Var) {
        this.f8241a.c(n0Var, i, iArr, n0Var.getLayoutDirection(), iArr2);
    }

    @Override // x.i0
    public final int c(u1.l0 l0Var) {
        return l0Var.f7231e;
    }

    @Override // x.i0
    public final long d(int i, int i8, int i9, boolean z3) {
        return !z3 ? r2.b.a(i, i8, 0, i9) : m.a.v(i, i8, 0, i9);
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        return v0.b(this, r2.a.j(j7), r2.a.i(j7), r2.a.h(j7), r2.a.g(j7), n0Var.H(this.f8241a.a()), n0Var, list, new u1.l0[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return q6.i.a(this.f8241a, l0Var.f8241a) && this.f8242b.equals(l0Var.f8242b);
    }

    @Override // x.i0
    public final u1.f0 f(u1.l0[] l0VarArr, w1.n0 n0Var, int[] iArr, int i, int i8) {
        return n0Var.e0(i, i8, d6.v.f2327d, new j0.f(l0VarArr, this, i8, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.f8242b.f8697a) + (this.f8241a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f8241a + ", verticalAlignment=" + this.f8242b + ')';
    }
}
