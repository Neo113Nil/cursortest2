package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fc2 implements oj1, cc2 {
    public final xh a;
    public final zn b;

    public fc2(xh xhVar, zn znVar) {
        this.a = xhVar;
        this.b = znVar;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
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
                int min2 = Math.min(jj1Var.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, jj1Var.e(min2));
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
                i2 = Math.max(i2, jj1Var2.e(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
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
            int Y = jj1Var.Y(i);
            if (E == 0.0f) {
                i3 += Y;
            } else if (E > 0.0f) {
                f += E;
                i2 = Math.max(i2, Math.round(Y / E));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.cc2
    public final void c(int i, int[] iArr, int[] iArr2, qj1 qj1Var) {
        this.a.f(qj1Var, i, iArr, qj1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.cc2
    public final long d(int i, int i2, int i3, boolean z) {
        return !z ? v10.a(i, i2, 0, i3) : zm3.w(i, i2, 0, i3);
    }

    @Override // defpackage.cc2
    public final int e(n12 n12Var) {
        return n12Var.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc2)) {
            return false;
        }
        fc2 fc2Var = (fc2) obj;
        return this.a.equals(fc2Var.a) && Intrinsics.b(this.b, fc2Var.b);
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        return yj1.E(this, u10.j(j), u10.i(j), u10.h(j), u10.g(j), qj1Var.R(this.a.a()), qj1Var, list, new n12[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
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
                int min2 = Math.min(jj1Var.Y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, jj1Var.a0(min2));
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
                i2 = Math.max(i2, jj1Var2.a0(round != Integer.MAX_VALUE ? Math.round(round * E2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.cc2
    public final int h(n12 n12Var) {
        return n12Var.m;
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
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            jj1 jj1Var = (jj1) list.get(i4);
            float E = z71.E(z71.B(jj1Var));
            int V = jj1Var.V(i);
            if (E == 0.0f) {
                i3 += V;
            } else if (E > 0.0f) {
                f += E;
                i2 = Math.max(i2, Math.round(V / E));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.cc2
    public final pj1 j(n12[] n12VarArr, qj1 qj1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        pj1 G;
        G = qj1Var.G(i, i2, mi1.c(), new w5(n12VarArr, this, i2, iArr));
        return G;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
