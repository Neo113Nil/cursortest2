package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class by1 implements j51, yx1 {
    public final x9 PxuCJdSBwIXG;
    public final od lS5Rgt96tfkO;

    public by1(x9 x9Var, od odVar) {
        this.PxuCJdSBwIXG = x9Var;
        this.lS5Rgt96tfkO = odVar;
    }

    @Override // defpackage.j51
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            e51 e51Var = (e51) list.get(i4);
            float rZjpSjn4zoMv = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var));
            int i68hK7ahKtgp = e51Var.i68hK7ahKtgp(i);
            if (rZjpSjn4zoMv == 0.0f) {
                i3 += i68hK7ahKtgp;
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
                i2 = Math.max(i2, Math.round(i68hK7ahKtgp / rZjpSjn4zoMv));
            }
        }
        return ((list.size() - 1) * POWyO8hTM6YC) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * POWyO8hTM6YC, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            e51 e51Var = (e51) list.get(i3);
            float rZjpSjn4zoMv = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var));
            if (rZjpSjn4zoMv == 0.0f) {
                int min2 = Math.min(e51Var.IXK6ba3ucyzm(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, e51Var.a92UlCVFR9N8(min2));
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            e51 e51Var2 = (e51) list.get(i4);
            float rZjpSjn4zoMv2 = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var2));
            if (rZjpSjn4zoMv2 > 0.0f) {
                i2 = Math.max(i2, e51Var2.a92UlCVFR9N8(round != Integer.MAX_VALUE ? Math.round(round * rZjpSjn4zoMv2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * POWyO8hTM6YC, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            e51 e51Var = (e51) list.get(i3);
            float rZjpSjn4zoMv = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var));
            if (rZjpSjn4zoMv == 0.0f) {
                int min2 = Math.min(e51Var.IXK6ba3ucyzm(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, e51Var.ngxnMNrpiKat(min2));
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            e51 e51Var2 = (e51) list.get(i4);
            float rZjpSjn4zoMv2 = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var2));
            if (rZjpSjn4zoMv2 > 0.0f) {
                i2 = Math.max(i2, e51Var2.ngxnMNrpiKat(round != Integer.MAX_VALUE ? Math.round(round * rZjpSjn4zoMv2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
        int POWyO8hTM6YC = vr0Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            e51 e51Var = (e51) list.get(i4);
            float rZjpSjn4zoMv = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var));
            int IXK6ba3ucyzm = e51Var.IXK6ba3ucyzm(i);
            if (rZjpSjn4zoMv == 0.0f) {
                i3 += IXK6ba3ucyzm;
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
                i2 = Math.max(i2, Math.round(IXK6ba3ucyzm / rZjpSjn4zoMv));
            }
        }
        return ((list.size() - 1) * POWyO8hTM6YC) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.yx1
    public final long Y1f8riQaR6yg(int i, int i2, int i3, boolean z) {
        if (!z) {
            return sr.PxuCJdSBwIXG(i, i2, 0, i3);
        }
        rr.Companion.getClass();
        return qr.lS5Rgt96tfkO(i, i2, 0, i3);
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        return xi0.amuv7NJvPxHu(this, rr.wdg6QnbFHrFF(j), rr.OPXfSBeufaJ8(j), rr.rtx2ld2ELZv4(j), rr.RAsUl2FVSrh6(j), l51Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG()), l51Var, list, new em1[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.yx1
    public final int e9gEMXR7LXtO(em1 em1Var) {
        return em1Var.OPXfSBeufaJ8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by1)) {
            return false;
        }
        by1 by1Var = (by1) obj;
        return this.PxuCJdSBwIXG.equals(by1Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, by1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO.PxuCJdSBwIXG) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    @Override // defpackage.yx1
    public final void lS5Rgt96tfkO(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        this.PxuCJdSBwIXG.rtx2ld2ELZv4(l51Var, i, iArr, l51Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.yx1
    public final int rtx2ld2ELZv4(em1 em1Var) {
        return em1Var.rtx2ld2ELZv4;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.PxuCJdSBwIXG + ", verticalAlignment=" + this.lS5Rgt96tfkO + ')';
    }

    @Override // defpackage.yx1
    public final k51 wdg6QnbFHrFF(em1[] em1VarArr, l51 l51Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return l51Var.jJwa0q7P5wHq(i, i2, q50.rtx2ld2ELZv4, new qy(em1VarArr, this, i2, iArr));
    }
}
