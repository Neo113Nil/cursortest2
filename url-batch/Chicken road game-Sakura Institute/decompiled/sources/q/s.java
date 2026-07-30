package q;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements p1.f0, j0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f7339a;

    /* renamed from: b, reason: collision with root package name */
    public final s0.e f7340b;

    public s(h hVar, s0.e eVar) {
        this.f7339a = hVar;
        this.f7340b = eVar;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        return c.d(this, m2.a.i(j8), m2.a.j(j8), m2.a.g(j8), m2.a.h(j8), h0Var.K(this.f7339a.a()), h0Var, list, new p1.n0[list.size()], list.size());
    }

    @Override // p1.f0
    public final int b(p1.m mVar, List list, int i7) {
        int K = mVar.K(this.f7339a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            p1.e0 e0Var = (p1.e0) list.get(i10);
            float c4 = c.c(c.b(e0Var));
            int e02 = e0Var.e0(i7);
            if (c4 == 0.0f) {
                i9 += e02;
            } else if (c4 > 0.0f) {
                f9 += c4;
                i8 = Math.max(i8, Math.round(e02 / c4));
            }
        }
        return ((list.size() - 1) * K) + Math.round(i8 * f9) + i9;
    }

    @Override // p1.f0
    public final int c(p1.m mVar, List list, int i7) {
        int K = mVar.K(this.f7339a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * K, i7);
        int size = list.size();
        int i8 = 0;
        float f9 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            p1.e0 e0Var = (p1.e0) list.get(i9);
            float c4 = c.c(c.b(e0Var));
            if (c4 == 0.0f) {
                int min2 = Math.min(e0Var.c(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - min);
                min += min2;
                i8 = Math.max(i8, e0Var.a0(min2));
            } else if (c4 > 0.0f) {
                f9 += c4;
            }
        }
        int round = f9 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - min, 0) / f9);
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p1.e0 e0Var2 = (p1.e0) list.get(i10);
            float c6 = c.c(c.b(e0Var2));
            if (c6 > 0.0f) {
                i8 = Math.max(i8, e0Var2.a0(round != Integer.MAX_VALUE ? Math.round(round * c6) : Integer.MAX_VALUE));
            }
        }
        return i8;
    }

    @Override // q.j0
    public final long d(int i7, int i8, int i9, boolean z8) {
        if (!z8) {
            return r4.a.b(0, i9, i7, i8);
        }
        int min = Math.min(i7, 262142);
        int min2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int l8 = r4.a.l(min2 == Integer.MAX_VALUE ? min : min2);
        return r4.a.b(Math.min(l8, 0), i9 != Integer.MAX_VALUE ? Math.min(l8, i9) : Integer.MAX_VALUE, min, min2);
    }

    @Override // p1.f0
    public final int e(p1.m mVar, List list, int i7) {
        int K = mVar.K(this.f7339a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * K, i7);
        int size = list.size();
        int i8 = 0;
        float f9 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            p1.e0 e0Var = (p1.e0) list.get(i9);
            float c4 = c.c(c.b(e0Var));
            if (c4 == 0.0f) {
                int min2 = Math.min(e0Var.c(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - min);
                min += min2;
                i8 = Math.max(i8, e0Var.d0(min2));
            } else if (c4 > 0.0f) {
                f9 += c4;
            }
        }
        int round = f9 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - min, 0) / f9);
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p1.e0 e0Var2 = (p1.e0) list.get(i10);
            float c6 = c.c(c.b(e0Var2));
            if (c6 > 0.0f) {
                i8 = Math.max(i8, e0Var2.d0(round != Integer.MAX_VALUE ? Math.round(round * c6) : Integer.MAX_VALUE));
            }
        }
        return i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7339a.equals(sVar.f7339a) && this.f7340b.equals(sVar.f7340b);
    }

    @Override // q.j0
    public final p1.g0 f(p1.n0[] n0VarArr, p1.h0 h0Var, int[] iArr, int i7, int i8) {
        return h0Var.C(i8, i7, e6.v.f2827f, new r(n0VarArr, this, i8, h0Var, iArr));
    }

    @Override // p1.f0
    public final int g(p1.m mVar, List list, int i7) {
        int K = mVar.K(this.f7339a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        float f9 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            p1.e0 e0Var = (p1.e0) list.get(i10);
            float c4 = c.c(c.b(e0Var));
            int c6 = e0Var.c(i7);
            if (c4 == 0.0f) {
                i9 += c6;
            } else if (c4 > 0.0f) {
                f9 += c4;
                i8 = Math.max(i8, Math.round(c6 / c4));
            }
        }
        return ((list.size() - 1) * K) + Math.round(i8 * f9) + i9;
    }

    @Override // q.j0
    public final void h(int i7, p1.h0 h0Var, int[] iArr, int[] iArr2) {
        this.f7339a.c(i7, h0Var, iArr, iArr2);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7340b.f8094a) + (this.f7339a.hashCode() * 31);
    }

    @Override // q.j0
    public final int i(p1.n0 n0Var) {
        return n0Var.f7063f;
    }

    @Override // q.j0
    public final int j(p1.n0 n0Var) {
        return n0Var.f7064g;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f7339a + ", horizontalAlignment=" + this.f7340b + ')';
    }
}
