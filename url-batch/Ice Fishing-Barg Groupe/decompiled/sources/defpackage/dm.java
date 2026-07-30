package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dm implements j51, yx1 {
    public final z9 PxuCJdSBwIXG;
    public final nd lS5Rgt96tfkO;

    public dm(z9 z9Var, nd ndVar) {
        this.PxuCJdSBwIXG = z9Var;
        this.lS5Rgt96tfkO = ndVar;
    }

    @Override // defpackage.j51
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
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
                int min2 = Math.min(e51Var.a92UlCVFR9N8(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, e51Var.i68hK7ahKtgp(min2));
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
                i2 = Math.max(i2, e51Var2.i68hK7ahKtgp(round != Integer.MAX_VALUE ? Math.round(round * rZjpSjn4zoMv2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
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
            int a92UlCVFR9N8 = e51Var.a92UlCVFR9N8(i);
            if (rZjpSjn4zoMv == 0.0f) {
                i3 += a92UlCVFR9N8;
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
                i2 = Math.max(i2, Math.round(a92UlCVFR9N8 / rZjpSjn4zoMv));
            }
        }
        return ((list.size() - 1) * POWyO8hTM6YC) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
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
            int ngxnMNrpiKat = e51Var.ngxnMNrpiKat(i);
            if (rZjpSjn4zoMv == 0.0f) {
                i3 += ngxnMNrpiKat;
            } else if (rZjpSjn4zoMv > 0.0f) {
                f += rZjpSjn4zoMv;
                i2 = Math.max(i2, Math.round(ngxnMNrpiKat / rZjpSjn4zoMv));
            }
        }
        return ((list.size() - 1) * POWyO8hTM6YC) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
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
                int min2 = Math.min(e51Var.a92UlCVFR9N8(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, e51Var.IXK6ba3ucyzm(min2));
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
                i2 = Math.max(i2, e51Var2.IXK6ba3ucyzm(round != Integer.MAX_VALUE ? Math.round(round * rZjpSjn4zoMv2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.yx1
    public final long Y1f8riQaR6yg(int i, int i2, int i3, boolean z) {
        if (!z) {
            return sr.PxuCJdSBwIXG(0, i3, i, i2);
        }
        rr.Companion.getClass();
        return qr.PxuCJdSBwIXG(0, i3, i, i2);
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        return xi0.amuv7NJvPxHu(this, rr.OPXfSBeufaJ8(j), rr.wdg6QnbFHrFF(j), rr.RAsUl2FVSrh6(j), rr.rtx2ld2ELZv4(j), l51Var.POWyO8hTM6YC(this.PxuCJdSBwIXG.PxuCJdSBwIXG()), l51Var, list, new em1[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.yx1
    public final int e9gEMXR7LXtO(em1 em1Var) {
        return em1Var.rtx2ld2ELZv4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return this.PxuCJdSBwIXG.equals(dmVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(dmVar.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO.PxuCJdSBwIXG) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    @Override // defpackage.yx1
    public final void lS5Rgt96tfkO(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        this.PxuCJdSBwIXG.wdg6QnbFHrFF(i, l51Var, iArr, iArr2);
    }

    @Override // defpackage.yx1
    public final int rtx2ld2ELZv4(em1 em1Var) {
        return em1Var.OPXfSBeufaJ8;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.PxuCJdSBwIXG + ", horizontalAlignment=" + this.lS5Rgt96tfkO + ')';
    }

    @Override // defpackage.yx1
    public final k51 wdg6QnbFHrFF(final em1[] em1VarArr, final l51 l51Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return l51Var.jJwa0q7P5wHq(i2, i, q50.rtx2ld2ELZv4, new le0() { // from class: cm
            @Override // defpackage.le0
            public final Object OPXfSBeufaJ8(Object obj) {
                dm1 dm1Var = (dm1) obj;
                em1[] em1VarArr2 = em1VarArr;
                int length = em1VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    em1 em1Var = em1VarArr2[i6];
                    em1Var.getClass();
                    em1Var.wdg6QnbFHrFF();
                    dm1.RAsUl2FVSrh6(dm1Var, em1Var, this.lS5Rgt96tfkO.PxuCJdSBwIXG(em1Var.rtx2ld2ELZv4, i2, l51Var.getLayoutDirection()), iArr[i7]);
                    i6++;
                    i7++;
                }
                return no2.PxuCJdSBwIXG;
            }
        });
    }
}
