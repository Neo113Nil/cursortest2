package x;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q implements u1.e0, i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f8266a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.c f8267b;

    public q(h hVar, y0.c cVar) {
        this.f8266a = hVar;
        this.f8267b = cVar;
    }

    @Override // x.i0
    public final int a(u1.l0 l0Var) {
        return l0Var.f7231e;
    }

    @Override // x.i0
    public final void b(int i, int[] iArr, int[] iArr2, w1.n0 n0Var) {
        this.f8266a.b(n0Var, i, iArr, iArr2);
    }

    @Override // x.i0
    public final int c(u1.l0 l0Var) {
        return l0Var.f7230d;
    }

    @Override // x.i0
    public final long d(int i, int i8, int i9, boolean z3) {
        return !z3 ? r2.b.a(0, i9, i, i8) : m.a.u(0, i9, i, i8);
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        return v0.b(this, r2.a.i(j7), r2.a.j(j7), r2.a.g(j7), r2.a.h(j7), n0Var.H(this.f8266a.a()), n0Var, list, new u1.l0[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return q6.i.a(this.f8266a, qVar.f8266a) && this.f8267b.equals(qVar.f8267b);
    }

    @Override // x.i0
    public final u1.f0 f(final u1.l0[] l0VarArr, final w1.n0 n0Var, final int[] iArr, int i, final int i8) {
        return n0Var.e0(i8, i, d6.v.f2327d, new p6.c() { // from class: x.p
            @Override // p6.c
            public final Object i(Object obj) {
                u1.k0 k0Var = (u1.k0) obj;
                u1.l0[] l0VarArr2 = l0VarArr;
                int length = l0VarArr2.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    u1.l0 l0Var = l0VarArr2[i9];
                    int i11 = i10 + 1;
                    q6.i.b(l0Var);
                    Object g3 = l0Var.g();
                    j0 j0Var = g3 instanceof j0 ? (j0) g3 : null;
                    r2.l layoutDirection = n0Var.getLayoutDirection();
                    t tVar = j0Var != null ? j0Var.f8231c : null;
                    int i12 = i8;
                    u1.k0.g(k0Var, l0Var, tVar != null ? tVar.a(i12 - l0Var.f7230d, layoutDirection) : this.f8267b.a(0, i12 - l0Var.f7230d, layoutDirection), iArr[i10]);
                    i9++;
                    i10 = i11;
                }
                return c6.m.f1757a;
            }
        });
    }

    public final int hashCode() {
        return Float.hashCode(this.f8267b.f8696a) + (this.f8266a.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f8266a + ", horizontalAlignment=" + this.f8267b + ')';
    }
}
