package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x90 implements yx1 {
    public final x9 PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final bv Y1f8riQaR6yg;
    public final v90 a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final z9 lS5Rgt96tfkO;

    public x90(x9 x9Var, z9 z9Var, float f, bv bvVar, float f2, v90 v90Var) {
        this.PxuCJdSBwIXG = x9Var;
        this.lS5Rgt96tfkO = z9Var;
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = bvVar;
        this.e9gEMXR7LXtO = f2;
        this.a92UlCVFR9N8 = v90Var;
    }

    public static int PxuCJdSBwIXG(List list, int i, int i2, int i3, v90 v90Var) {
        boolean z;
        boolean z2;
        long PxuCJdSBwIXG = qq0.PxuCJdSBwIXG(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            o90 o90Var = new o90(v90Var, sr.PxuCJdSBwIXG(0, i, 0, Integer.MAX_VALUE), i2, i3);
            e51 e51Var = (e51) zk.qYgDo2Ye5PY7(0, list);
            int ngxnMNrpiKat = e51Var != null ? e51Var.ngxnMNrpiKat(i) : 0;
            int i68hK7ahKtgp = e51Var != null ? e51Var.i68hK7ahKtgp(ngxnMNrpiKat) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (o90Var.lS5Rgt96tfkO(z3, 0, qq0.PxuCJdSBwIXG(i, Integer.MAX_VALUE), e51Var == null ? null : new qq0(qq0.PxuCJdSBwIXG(i68hK7ahKtgp, ngxnMNrpiKat)), 0, 0, 0, false, false).lS5Rgt96tfkO) {
                v90Var.getClass();
                PxuCJdSBwIXG = PxuCJdSBwIXG;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - i68hK7ahKtgp;
                    int i13 = i9 + 1;
                    int max = Math.max(i8, ngxnMNrpiKat);
                    e51 e51Var2 = (e51) zk.qYgDo2Ye5PY7(i13, list);
                    ngxnMNrpiKat = e51Var2 != null ? e51Var2.ngxnMNrpiKat(i) : 0;
                    int i68hK7ahKtgp2 = e51Var2 != null ? e51Var2.i68hK7ahKtgp(ngxnMNrpiKat) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = i68hK7ahKtgp2;
                    n90 lS5Rgt96tfkO = o90Var.lS5Rgt96tfkO(z2, i14, qq0.PxuCJdSBwIXG(i12, i4), e51Var2 == null ? null : new qq0(qq0.PxuCJdSBwIXG(i68hK7ahKtgp2, ngxnMNrpiKat)), i15, i5, max, false, false);
                    if (lS5Rgt96tfkO.PxuCJdSBwIXG) {
                        int i17 = max + i3 + i5;
                        o90Var.PxuCJdSBwIXG(lS5Rgt96tfkO, e51Var2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (lS5Rgt96tfkO.lS5Rgt96tfkO) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        i68hK7ahKtgp = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        i68hK7ahKtgp = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = max;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                PxuCJdSBwIXG = qq0.PxuCJdSBwIXG(i5 - i3, i10);
            }
        }
        return (int) (PxuCJdSBwIXG >> 32);
    }

    @Override // defpackage.yx1
    public final long Y1f8riQaR6yg(int i, int i2, int i3, boolean z) {
        by1 by1Var = ay1.PxuCJdSBwIXG;
        if (!z) {
            return sr.PxuCJdSBwIXG(i, i2, 0, i3);
        }
        rr.Companion.getClass();
        return qr.lS5Rgt96tfkO(i, i2, 0, i3);
    }

    @Override // defpackage.yx1
    public final int e9gEMXR7LXtO(em1 em1Var) {
        return em1Var.D0aTLcX6Uhyo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return this.PxuCJdSBwIXG.equals(x90Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(x90Var.lS5Rgt96tfkO) && k10.lS5Rgt96tfkO(this.TSizfFm2Yiuu, x90Var.TSizfFm2Yiuu) && this.Y1f8riQaR6yg.equals(x90Var.Y1f8riQaR6yg) && k10.lS5Rgt96tfkO(this.e9gEMXR7LXtO, x90Var.e9gEMXR7LXtO) && cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, x90Var.a92UlCVFR9N8);
    }

    public final int hashCode() {
        return this.a92UlCVFR9N8.hashCode() + o0.lS5Rgt96tfkO(Integer.MAX_VALUE, o0.lS5Rgt96tfkO(Integer.MAX_VALUE, o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(-1.0f, o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, (this.lS5Rgt96tfkO.hashCode() + ((this.PxuCJdSBwIXG.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // defpackage.yx1
    public final void lS5Rgt96tfkO(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        this.PxuCJdSBwIXG.rtx2ld2ELZv4(l51Var, i, iArr, l51Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.yx1
    public final int rtx2ld2ELZv4(em1 em1Var) {
        return em1Var.JTxCbbCwomzt();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.PxuCJdSBwIXG + ", verticalArrangement=" + this.lS5Rgt96tfkO + ", mainAxisSpacing=" + ((Object) k10.TSizfFm2Yiuu(this.TSizfFm2Yiuu)) + ", crossAxisAlignment=" + this.Y1f8riQaR6yg + ", crossAxisArrangementSpacing=" + ((Object) k10.TSizfFm2Yiuu(this.e9gEMXR7LXtO)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.a92UlCVFR9N8 + ')';
    }

    @Override // defpackage.yx1
    public final k51 wdg6QnbFHrFF(final em1[] em1VarArr, l51 l51Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final cw0 cw0Var = cw0.rtx2ld2ELZv4;
        return l51Var.jJwa0q7P5wHq(i, i2, q50.rtx2ld2ELZv4, new le0() { // from class: w90
            @Override // defpackage.le0
            public final Object OPXfSBeufaJ8(Object obj) {
                dm1 dm1Var = (dm1) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    em1 em1Var = em1VarArr[i8];
                    em1Var.getClass();
                    em1Var.wdg6QnbFHrFF();
                    bv bvVar = this.Y1f8riQaR6yg;
                    dm1.RAsUl2FVSrh6(dm1Var, em1Var, iArr[i8 - i7], Math.round((1.0f - 1.0f) * ((i2 - em1Var.D0aTLcX6Uhyo()) / 2.0f)) + i6);
                }
                return no2.PxuCJdSBwIXG;
            }
        });
    }
}
