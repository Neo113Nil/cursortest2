package x;

import java.util.List;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n implements u1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.e f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8250b;

    public n(y0.e eVar, boolean z3) {
        this.f8249a = eVar;
        this.f8250b = z3;
    }

    @Override // u1.e0
    public final u1.f0 e(final w1.n0 n0Var, final List list, long j7) {
        boolean isEmpty = list.isEmpty();
        d6.v vVar = d6.v.f2327d;
        if (isEmpty) {
            return n0Var.e0(r2.a.j(j7), r2.a.i(j7), vVar, new s1(23));
        }
        long j8 = this.f8250b ? j7 : j7 & (-8589934589L);
        if (list.size() == 1) {
            final u1.d0 d0Var = (u1.d0) list.get(0);
            d0Var.g();
            final u1.l0 e8 = d0Var.e(j8);
            final int max = Math.max(r2.a.j(j7), e8.f7230d);
            final int max2 = Math.max(r2.a.i(j7), e8.f7231e);
            return n0Var.e0(max, max2, vVar, new p6.c() { // from class: x.l
                @Override // p6.c
                public final Object i(Object obj) {
                    k.b((u1.k0) obj, u1.l0.this, d0Var, n0Var.getLayoutDirection(), max, max2, this.f8249a);
                    return c6.m.f1757a;
                }
            });
        }
        final u1.l0[] l0VarArr = new u1.l0[list.size()];
        final q6.q qVar = new q6.q();
        qVar.f6203d = r2.a.j(j7);
        final q6.q qVar2 = new q6.q();
        qVar2.f6203d = r2.a.i(j7);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u1.d0 d0Var2 = (u1.d0) list.get(i);
            d0Var2.g();
            u1.l0 e9 = d0Var2.e(j8);
            l0VarArr[i] = e9;
            qVar.f6203d = Math.max(qVar.f6203d, e9.f7230d);
            qVar2.f6203d = Math.max(qVar2.f6203d, e9.f7231e);
        }
        return n0Var.e0(qVar.f6203d, qVar2.f6203d, vVar, new p6.c() { // from class: x.m
            @Override // p6.c
            public final Object i(Object obj) {
                u1.k0 k0Var = (u1.k0) obj;
                u1.l0[] l0VarArr2 = l0VarArr;
                int length = l0VarArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i8;
                    u1.l0 l0Var = l0VarArr2[i9];
                    q6.i.c(l0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    k.b(k0Var, l0Var, (u1.d0) list.get(i10), n0Var.getLayoutDirection(), qVar.f6203d, qVar2.f6203d, this.f8249a);
                    i9++;
                    i8 = i10 + 1;
                }
                return c6.m.f1757a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f8249a.equals(nVar.f8249a) && this.f8250b == nVar.f8250b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8250b) + (this.f8249a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f8249a + ", propagateMinConstraints=" + this.f8250b + ')';
    }
}
