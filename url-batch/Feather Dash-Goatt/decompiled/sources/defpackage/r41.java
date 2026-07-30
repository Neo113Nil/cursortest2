package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r41 implements vk0, o41 {
    public final g9 a;
    public final jd b;

    public r41(g9 g9Var, jd jdVar) {
        this.a = g9Var;
        this.b = jdVar;
    }

    @Override // defpackage.o41
    public final void a(int i, int[] iArr, int[] iArr2, ej0 ej0Var) {
        this.a.m(ej0Var, i, iArr, ej0Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.o41
    public final wk0 b(zw0[] zw0VarArr, ej0 ej0Var, int[] iArr, int i, int i2) {
        return xk0.q(ej0Var, i, i2, new vr(zw0VarArr, this, i2, iArr));
    }

    @Override // defpackage.o41
    public final long c(int i, int i2, int i3, boolean z) {
        return !z ? nm.a(i, i2, 0, i3) : la0.E(i, i2, 0, i3);
    }

    @Override // defpackage.o41
    public final int d(zw0 zw0Var) {
        return zw0Var.e;
    }

    @Override // defpackage.o41
    public final int e(zw0 zw0Var) {
        return zw0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r41)) {
            return false;
        }
        r41 r41Var = (r41) obj;
        return this.a.equals(r41Var.a) && this.b.equals(r41Var.b);
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        return gb0.E(this, mm.j(j), mm.i(j), mm.h(j), mm.g(j), ej0Var.H(this.a.a()), ej0Var, list, new zw0[list.size()], list.size());
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
