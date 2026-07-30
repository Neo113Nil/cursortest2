package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qw implements oj1, cc2 {
    public final zh a;
    public final yn b;

    public qw(zh zhVar, yn ynVar) {
        this.a = zhVar;
        this.b = ynVar;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
        int R = h41Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            jj1 jj1Var = (jj1) list.get(i4);
            float E = z71.E(z71.B(jj1Var));
            int e = jj1Var.e(i);
            if (E == 0.0f) {
                i3 += e;
            } else if (E > 0.0f) {
                f += E;
                i2 = Math.max(i2, Math.round(e / E));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        int R = h41Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * R, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            jj1 jj1Var = (jj1) list.get(i3);
            float E = z71.E(z71.B(jj1Var));
            if (E == 0.0f) {
                int min2 = Math.min(jj1Var.e(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, jj1Var.Y(min2));
            } else if (E > 0.0f) {
                f += E;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            jj1 jj1Var2 = (jj1) list.get(i4);
            float E2 = z71.E(z71.B(jj1Var2));
            if (E2 > 0.0f) {
                i2 = Math.max(i2, jj1Var2.Y(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.cc2
    public final void c(int i, int[] iArr, int[] iArr2, qj1 qj1Var) {
        this.a.i(qj1Var, i, iArr, iArr2);
    }

    @Override // defpackage.cc2
    public final long d(int i, int i2, int i3, boolean z) {
        return !z ? v10.a(0, i3, i, i2) : zm3.v(0, i3, i, i2);
    }

    @Override // defpackage.cc2
    public final int e(n12 n12Var) {
        return n12Var.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        return this.a.equals(qwVar.a) && this.b.equals(qwVar.b);
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        return yj1.E(this, u10.i(j), u10.j(j), u10.g(j), u10.h(j), qj1Var.R(this.a.a()), qj1Var, list, new n12[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
        int R = h41Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            jj1 jj1Var = (jj1) list.get(i4);
            float E = z71.E(z71.B(jj1Var));
            int a0 = jj1Var.a0(i);
            if (E == 0.0f) {
                i3 += a0;
            } else if (E > 0.0f) {
                f += E;
                i2 = Math.max(i2, Math.round(a0 / E));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.cc2
    public final int h(n12 n12Var) {
        return n12Var.n;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.oj1
    public final int i(h41 h41Var, List list, int i) {
        int R = h41Var.R(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * R, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            jj1 jj1Var = (jj1) list.get(i3);
            float E = z71.E(z71.B(jj1Var));
            if (E == 0.0f) {
                int min2 = Math.min(jj1Var.e(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, jj1Var.V(min2));
            } else if (E > 0.0f) {
                f += E;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            jj1 jj1Var2 = (jj1) list.get(i4);
            float E2 = z71.E(z71.B(jj1Var2));
            if (E2 > 0.0f) {
                i2 = Math.max(i2, jj1Var2.V(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.cc2
    public final pj1 j(n12[] n12VarArr, qj1 qj1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        pj1 G;
        G = qj1Var.G(i2, i, mi1.c(), new pw(n12VarArr, this, i2, qj1Var, iArr));
        return G;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
