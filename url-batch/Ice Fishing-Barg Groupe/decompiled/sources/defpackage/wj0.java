package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wj0 {
    public final bw0 PxuCJdSBwIXG;
    public boolean TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public boolean e9gEMXR7LXtO;
    public boolean lS5Rgt96tfkO;
    public final p81 a92UlCVFR9N8 = new p81();
    public final ud1 RAsUl2FVSrh6 = new ud1();
    public final h81 rtx2ld2ELZv4 = new h81(10);

    public wj0(bw0 bw0Var) {
        this.PxuCJdSBwIXG = bw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void PxuCJdSBwIXG(long j, List list, boolean z) {
        h81 h81Var;
        long[] jArr;
        long[] jArr2;
        int i;
        hd1 hd1Var;
        hd1 hd1Var2;
        int size = list.size();
        ud1 ud1Var = this.RAsUl2FVSrh6;
        ud1 ud1Var2 = ud1Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            h81Var = this.rtx2ld2ELZv4;
            if (i2 >= size) {
                break;
            }
            m61 m61Var = (m61) list.get(i2);
            if (m61Var.S9EYkSpbGuxq) {
                m61Var.EcgxDIVH5in8 = new i1(5, this, m61Var);
                if (z2) {
                    f91 f91Var = ud1Var2.PxuCJdSBwIXG;
                    ?? r14 = f91Var.rtx2ld2ELZv4;
                    int i3 = f91Var.wdg6QnbFHrFF;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            hd1Var2 = 0;
                            break;
                        }
                        hd1Var2 = r14[i4];
                        if (cs0.wdg6QnbFHrFF(((hd1) hd1Var2).TSizfFm2Yiuu, m61Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    hd1Var = hd1Var2;
                    if (hd1Var != null) {
                        hd1Var.OPXfSBeufaJ8 = true;
                        hd1Var.Y1f8riQaR6yg.lS5Rgt96tfkO(j);
                        if (z) {
                            Object Y1f8riQaR6yg = h81Var.Y1f8riQaR6yg(j);
                            if (Y1f8riQaR6yg == null) {
                                Y1f8riQaR6yg = new p81();
                                h81Var.a92UlCVFR9N8(j, Y1f8riQaR6yg);
                            }
                            ((p81) Y1f8riQaR6yg).PxuCJdSBwIXG(hd1Var);
                        }
                        ud1Var2 = hd1Var;
                    } else {
                        z2 = false;
                    }
                }
                hd1Var = new hd1(m61Var);
                hd1Var.Y1f8riQaR6yg.lS5Rgt96tfkO(j);
                if (z) {
                    Object Y1f8riQaR6yg2 = h81Var.Y1f8riQaR6yg(j);
                    if (Y1f8riQaR6yg2 == null) {
                        Y1f8riQaR6yg2 = new p81();
                        h81Var.a92UlCVFR9N8(j, Y1f8riQaR6yg2);
                    }
                    ((p81) Y1f8riQaR6yg2).PxuCJdSBwIXG(hd1Var);
                }
                ud1Var2.PxuCJdSBwIXG.lS5Rgt96tfkO(hd1Var);
                ud1Var2 = hd1Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = h81Var.lS5Rgt96tfkO;
            Object[] objArr = h81Var.TSizfFm2Yiuu;
            long[] jArr4 = h81Var.PxuCJdSBwIXG;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                p81 p81Var = (p81) objArr[i9];
                                f91 f91Var2 = ud1Var.PxuCJdSBwIXG;
                                i = i6;
                                Object[] objArr2 = f91Var2.rtx2ld2ELZv4;
                                int i10 = f91Var2.wdg6QnbFHrFF;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((hd1) objArr2[i11]).a92UlCVFR9N8(j3, p81Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        h81Var.PxuCJdSBwIXG();
    }

    public final void TSizfFm2Yiuu() {
        if (this.lS5Rgt96tfkO) {
            this.TSizfFm2Yiuu = true;
            return;
        }
        ud1 ud1Var = this.RAsUl2FVSrh6;
        f91 f91Var = ud1Var.PxuCJdSBwIXG;
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i = f91Var.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            ((hd1) objArr[i2]).TSizfFm2Yiuu();
        }
        if (this.Y1f8riQaR6yg) {
            this.Y1f8riQaR6yg = true;
        } else {
            ud1Var.PxuCJdSBwIXG.RAsUl2FVSrh6();
        }
    }

    public final void Y1f8riQaR6yg(m61 m61Var) {
        if (this.lS5Rgt96tfkO) {
            this.e9gEMXR7LXtO = true;
            this.a92UlCVFR9N8.PxuCJdSBwIXG(m61Var);
            return;
        }
        ud1 ud1Var = this.RAsUl2FVSrh6;
        p81 p81Var = ud1Var.lS5Rgt96tfkO;
        p81Var.Y1f8riQaR6yg();
        p81Var.PxuCJdSBwIXG(ud1Var);
        while (p81Var.OPXfSBeufaJ8()) {
            ud1 ud1Var2 = (ud1) p81Var.dgRBjINgWbAK(p81Var.lS5Rgt96tfkO - 1);
            int i = 0;
            while (true) {
                f91 f91Var = ud1Var2.PxuCJdSBwIXG;
                if (i < f91Var.wdg6QnbFHrFF) {
                    hd1 hd1Var = (hd1) f91Var.rtx2ld2ELZv4[i];
                    if (cs0.wdg6QnbFHrFF(hd1Var.TSizfFm2Yiuu, m61Var)) {
                        ud1Var2.PxuCJdSBwIXG.wdg6QnbFHrFF(hd1Var);
                        hd1Var.TSizfFm2Yiuu();
                    } else {
                        p81Var.PxuCJdSBwIXG(hd1Var);
                        i++;
                    }
                }
            }
        }
    }

    public final boolean lS5Rgt96tfkO(op0 op0Var, boolean z) {
        p31 p31Var = (p31) op0Var.OPXfSBeufaJ8;
        bw0 bw0Var = this.PxuCJdSBwIXG;
        ud1 ud1Var = this.RAsUl2FVSrh6;
        boolean PxuCJdSBwIXG = ud1Var.PxuCJdSBwIXG(p31Var, bw0Var, op0Var, z);
        f91 f91Var = ud1Var.PxuCJdSBwIXG;
        if (!PxuCJdSBwIXG) {
            return false;
        }
        boolean z2 = true;
        this.lS5Rgt96tfkO = true;
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        int i = f91Var.wdg6QnbFHrFF;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((hd1) objArr[i2]).e9gEMXR7LXtO(op0Var, z) || z3;
        }
        Object[] objArr2 = f91Var.rtx2ld2ELZv4;
        int i3 = f91Var.wdg6QnbFHrFF;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((hd1) objArr2[i4]).Y1f8riQaR6yg(op0Var) || z4;
        }
        ud1Var.lS5Rgt96tfkO(op0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.lS5Rgt96tfkO = false;
        if (this.e9gEMXR7LXtO) {
            this.e9gEMXR7LXtO = false;
            p81 p81Var = this.a92UlCVFR9N8;
            int i5 = p81Var.lS5Rgt96tfkO;
            for (int i6 = 0; i6 < i5; i6++) {
                Y1f8riQaR6yg((m61) p81Var.a92UlCVFR9N8(i6));
            }
            p81Var.Y1f8riQaR6yg();
        }
        if (this.TSizfFm2Yiuu) {
            this.TSizfFm2Yiuu = false;
            TSizfFm2Yiuu();
        }
        if (this.Y1f8riQaR6yg) {
            this.Y1f8riQaR6yg = false;
            ud1Var.PxuCJdSBwIXG.RAsUl2FVSrh6();
        }
        return z2;
    }
}
