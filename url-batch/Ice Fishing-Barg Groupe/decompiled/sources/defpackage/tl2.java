package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tl2 {
    public static final sl2 Companion = new sl2();
    public static final tl2 e9gEMXR7LXtO = new tl2(0, 0, new Object[0], null);
    public int PxuCJdSBwIXG;
    public final ib0 TSizfFm2Yiuu;
    public Object[] Y1f8riQaR6yg;
    public int lS5Rgt96tfkO;

    public tl2(int i, int i2, Object[] objArr, ib0 ib0Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = ib0Var;
        this.Y1f8riQaR6yg = objArr;
    }

    public static tl2 wdg6QnbFHrFF(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ib0 ib0Var) {
        if (i3 > 30) {
            return new tl2(0, 0, new Object[]{obj, obj2, obj3, obj4}, ib0Var);
        }
        int VhhvGxCb8gfr = th0.VhhvGxCb8gfr(i, i3);
        int VhhvGxCb8gfr2 = th0.VhhvGxCb8gfr(i2, i3);
        if (VhhvGxCb8gfr != VhhvGxCb8gfr2) {
            return new tl2((1 << VhhvGxCb8gfr) | (1 << VhhvGxCb8gfr2), 0, VhhvGxCb8gfr < VhhvGxCb8gfr2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, ib0Var);
        }
        return new tl2(0, 1 << VhhvGxCb8gfr, new Object[]{wdg6QnbFHrFF(i, obj, obj2, i2, obj3, obj4, i3 + 5, ib0Var)}, ib0Var);
    }

    public final tl2 BRwzKIf41E4i(tl2 tl2Var, tl2 tl2Var2, int i, int i2, ib0 ib0Var) {
        ib0 ib0Var2 = this.TSizfFm2Yiuu;
        if (tl2Var2 != null) {
            return (ib0Var2 == ib0Var || tl2Var != tl2Var2) ? XL4ISE6Oc65B(i, tl2Var2, ib0Var) : this;
        }
        Object[] objArr = this.Y1f8riQaR6yg;
        if (objArr.length == 1) {
            return null;
        }
        if (ib0Var2 != ib0Var) {
            return new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO ^ i2, th0.RAsUl2FVSrh6(i, objArr), ib0Var);
        }
        this.Y1f8riQaR6yg = th0.RAsUl2FVSrh6(i, objArr);
        this.lS5Rgt96tfkO ^= i2;
        return this;
    }

    public final int EcgxDIVH5in8(int i) {
        return (this.Y1f8riQaR6yg.length - 1) - Integer.bitCount(this.lS5Rgt96tfkO & (i - 1));
    }

    public final boolean OPXfSBeufaJ8(int i) {
        return (this.lS5Rgt96tfkO & i) != 0;
    }

    public final Object[] PxuCJdSBwIXG(int i, int i2, int i3, Object obj, Object obj2, int i4, ib0 ib0Var) {
        Object obj3 = this.Y1f8riQaR6yg[i];
        tl2 wdg6QnbFHrFF = wdg6QnbFHrFF(obj3 != null ? obj3.hashCode() : 0, obj3, ZbWwgt3aGe7A(i), i3, obj, obj2, i4 + 5, ib0Var);
        int EcgxDIVH5in8 = EcgxDIVH5in8(i2);
        int i5 = EcgxDIVH5in8 + 1;
        Object[] objArr = this.Y1f8riQaR6yg;
        Object[] objArr2 = new Object[objArr.length - 1];
        na.hVNtCUZb4tYH(objArr, objArr2, 0, i, 6);
        na.VzNxmvWisHL1(objArr, objArr2, i, i + 2, i5);
        objArr2[EcgxDIVH5in8 - 1] = wdg6QnbFHrFF;
        na.VzNxmvWisHL1(objArr, objArr2, EcgxDIVH5in8, i5, objArr.length);
        return objArr2;
    }

    public final tl2 QrzZRwfaDlRX(int i, Object obj, Object obj2, int i2, gl1 gl1Var) {
        gl1 gl1Var2;
        tl2 QrzZRwfaDlRX;
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        if (rtx2ld2ELZv4(VhhvGxCb8gfr)) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr);
            return (cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8]) && cs0.wdg6QnbFHrFF(obj2, ZbWwgt3aGe7A(a92UlCVFR9N8))) ? gPXPFXrUH4XX(a92UlCVFR9N8, VhhvGxCb8gfr, gl1Var) : this;
        }
        if (!OPXfSBeufaJ8(VhhvGxCb8gfr)) {
            return this;
        }
        int EcgxDIVH5in8 = EcgxDIVH5in8(VhhvGxCb8gfr);
        tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8);
        if (i2 == 30) {
            yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
            int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
            int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
            int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i3]) || !cs0.wdg6QnbFHrFF(obj2, RfyTYNmI9Srp.ZbWwgt3aGe7A(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        QrzZRwfaDlRX = RfyTYNmI9Srp.dgRBjINgWbAK(i3, gl1Var);
                        break;
                    }
                }
                gl1Var2 = gl1Var;
            }
            QrzZRwfaDlRX = RfyTYNmI9Srp;
            gl1Var2 = gl1Var;
        } else {
            gl1Var2 = gl1Var;
            QrzZRwfaDlRX = RfyTYNmI9Srp.QrzZRwfaDlRX(i, obj, obj2, i2 + 5, gl1Var2);
        }
        return BRwzKIf41E4i(RfyTYNmI9Srp, QrzZRwfaDlRX, EcgxDIVH5in8, VhhvGxCb8gfr, gl1Var2.rtx2ld2ELZv4);
    }

    public final Object RAsUl2FVSrh6(int i, int i2, Object obj) {
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        if (rtx2ld2ELZv4(VhhvGxCb8gfr)) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr);
            if (cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8])) {
                return ZbWwgt3aGe7A(a92UlCVFR9N8);
            }
            return null;
        }
        if (!OPXfSBeufaJ8(VhhvGxCb8gfr)) {
            return null;
        }
        tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8(VhhvGxCb8gfr));
        if (i2 != 30) {
            return RfyTYNmI9Srp.RAsUl2FVSrh6(i, i2 + 5, obj);
        }
        yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
        int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
        int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
        int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return RfyTYNmI9Srp.ZbWwgt3aGe7A(i3);
    }

    public final tl2 RfyTYNmI9Srp(int i) {
        Object obj = this.Y1f8riQaR6yg[i];
        obj.getClass();
        return (tl2) obj;
    }

    public final tl2 S2OOm9zPNm0h(int i, int i2, tl2 tl2Var) {
        Object[] objArr = tl2Var.Y1f8riQaR6yg;
        if (objArr.length != 2 || tl2Var.lS5Rgt96tfkO != 0) {
            Object[] objArr2 = this.Y1f8riQaR6yg;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = tl2Var;
            return new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, copyOf, null);
        }
        if (this.Y1f8riQaR6yg.length == 1) {
            tl2Var.PxuCJdSBwIXG = this.lS5Rgt96tfkO;
            return tl2Var;
        }
        int a92UlCVFR9N8 = a92UlCVFR9N8(i2);
        Object[] objArr3 = this.Y1f8riQaR6yg;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        na.VzNxmvWisHL1(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        na.VzNxmvWisHL1(copyOf2, copyOf2, a92UlCVFR9N8 + 2, a92UlCVFR9N8, i);
        copyOf2[a92UlCVFR9N8] = obj;
        copyOf2[a92UlCVFR9N8 + 1] = obj2;
        return new tl2(this.PxuCJdSBwIXG ^ i2, this.lS5Rgt96tfkO ^ i2, copyOf2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r14.TSizfFm2Yiuu = S2OOm9zPNm0h(r7, r2, (defpackage.tl2) r14.TSizfFm2Yiuu);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final um S9EYkSpbGuxq(int i, int i2, Object obj, Object obj2) {
        um S9EYkSpbGuxq;
        int i3 = 1;
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        int i4 = 8;
        int i5 = 0;
        if (rtx2ld2ELZv4(VhhvGxCb8gfr)) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr);
            if (!cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8])) {
                return new um(i3, i4, new tl2(this.PxuCJdSBwIXG ^ VhhvGxCb8gfr, this.lS5Rgt96tfkO | VhhvGxCb8gfr, PxuCJdSBwIXG(a92UlCVFR9N8, VhhvGxCb8gfr, i, obj, obj2, i2, null), null));
            }
            if (ZbWwgt3aGe7A(a92UlCVFR9N8) != obj2) {
                Object[] objArr = this.Y1f8riQaR6yg;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[a92UlCVFR9N8 + 1] = obj2;
                return new um(i5, i4, new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, copyOf, null));
            }
        } else {
            if (!OPXfSBeufaJ8(VhhvGxCb8gfr)) {
                return new um(i3, i4, new tl2(VhhvGxCb8gfr | this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, th0.Y1f8riQaR6yg(this.Y1f8riQaR6yg, a92UlCVFR9N8(VhhvGxCb8gfr), obj, obj2), null));
            }
            int EcgxDIVH5in8 = EcgxDIVH5in8(VhhvGxCb8gfr);
            tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8);
            if (i2 == 30) {
                yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
                int i6 = BjEWd04qc7Mw.rtx2ld2ELZv4;
                int i7 = BjEWd04qc7Mw.OPXfSBeufaJ8;
                int i8 = BjEWd04qc7Mw.wdg6QnbFHrFF;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == RfyTYNmI9Srp.ZbWwgt3aGe7A(i6)) {
                        S9EYkSpbGuxq = null;
                    } else {
                        Object[] objArr2 = RfyTYNmI9Srp.Y1f8riQaR6yg;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i6 + 1] = obj2;
                        S9EYkSpbGuxq = new um(i5, i4, new tl2(0, 0, copyOf2, null));
                    }
                }
                S9EYkSpbGuxq = new um(i3, i4, new tl2(0, 0, th0.Y1f8riQaR6yg(RfyTYNmI9Srp.Y1f8riQaR6yg, 0, obj, obj2), null));
                break;
            }
            S9EYkSpbGuxq = RfyTYNmI9Srp.S9EYkSpbGuxq(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final boolean TSizfFm2Yiuu(Object obj) {
        yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, this.Y1f8riQaR6yg.length), 2);
        int i = BjEWd04qc7Mw.rtx2ld2ELZv4;
        int i2 = BjEWd04qc7Mw.OPXfSBeufaJ8;
        int i3 = BjEWd04qc7Mw.wdg6QnbFHrFF;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final tl2 VhhvGxCb8gfr(int i, int i2, Object obj) {
        tl2 VhhvGxCb8gfr;
        int VhhvGxCb8gfr2 = 1 << th0.VhhvGxCb8gfr(i, i2);
        if (rtx2ld2ELZv4(VhhvGxCb8gfr2)) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr2);
            if (!cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8])) {
                return this;
            }
            Object[] objArr = this.Y1f8riQaR6yg;
            if (objArr.length != 2) {
                return new tl2(this.PxuCJdSBwIXG ^ VhhvGxCb8gfr2, this.lS5Rgt96tfkO, th0.a92UlCVFR9N8(a92UlCVFR9N8, objArr), null);
            }
        } else {
            if (!OPXfSBeufaJ8(VhhvGxCb8gfr2)) {
                return this;
            }
            int EcgxDIVH5in8 = EcgxDIVH5in8(VhhvGxCb8gfr2);
            tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8);
            if (i2 == 30) {
                yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
                int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
                int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
                int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = RfyTYNmI9Srp.Y1f8riQaR6yg;
                    VhhvGxCb8gfr = objArr2.length == 2 ? null : new tl2(0, 0, th0.a92UlCVFR9N8(i3, objArr2), null);
                }
                VhhvGxCb8gfr = RfyTYNmI9Srp;
                break;
            }
            VhhvGxCb8gfr = RfyTYNmI9Srp.VhhvGxCb8gfr(i, i2 + 5, obj);
            if (VhhvGxCb8gfr != null) {
                return RfyTYNmI9Srp != VhhvGxCb8gfr ? S2OOm9zPNm0h(EcgxDIVH5in8, VhhvGxCb8gfr2, VhhvGxCb8gfr) : this;
            }
            Object[] objArr3 = this.Y1f8riQaR6yg;
            if (objArr3.length != 1) {
                return new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO ^ VhhvGxCb8gfr2, th0.RAsUl2FVSrh6(EcgxDIVH5in8, objArr3), null);
            }
        }
        return null;
    }

    public final tl2 XL4ISE6Oc65B(int i, tl2 tl2Var, ib0 ib0Var) {
        Object[] objArr = this.Y1f8riQaR6yg;
        if (objArr.length == 1 && tl2Var.Y1f8riQaR6yg.length == 2 && tl2Var.lS5Rgt96tfkO == 0) {
            tl2Var.PxuCJdSBwIXG = this.lS5Rgt96tfkO;
            return tl2Var;
        }
        if (this.TSizfFm2Yiuu == ib0Var) {
            objArr[i] = tl2Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = tl2Var;
        return new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, copyOf, ib0Var);
    }

    public final boolean Y1f8riQaR6yg(int i, int i2, Object obj) {
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        if (rtx2ld2ELZv4(VhhvGxCb8gfr)) {
            return cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8(VhhvGxCb8gfr)]);
        }
        if (!OPXfSBeufaJ8(VhhvGxCb8gfr)) {
            return false;
        }
        tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8(VhhvGxCb8gfr));
        return i2 == 30 ? RfyTYNmI9Srp.TSizfFm2Yiuu(obj) : RfyTYNmI9Srp.Y1f8riQaR6yg(i, i2 + 5, obj);
    }

    public final Object ZbWwgt3aGe7A(int i) {
        return this.Y1f8riQaR6yg[i + 1];
    }

    public final int a92UlCVFR9N8(int i) {
        return Integer.bitCount(this.PxuCJdSBwIXG & (i - 1)) * 2;
    }

    public final tl2 cpQdD2nAriOS(tl2 tl2Var, int i, gy gyVar, gl1 gl1Var) {
        Object[] objArr;
        tl2 wdg6QnbFHrFF;
        if (this == tl2Var) {
            gyVar.PxuCJdSBwIXG += lS5Rgt96tfkO();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            ib0 ib0Var = gl1Var.rtx2ld2ELZv4;
            int i3 = tl2Var.lS5Rgt96tfkO;
            Object[] objArr2 = this.Y1f8riQaR6yg;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + tl2Var.Y1f8riQaR6yg.length);
            int length = this.Y1f8riQaR6yg.length;
            yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, tl2Var.Y1f8riQaR6yg.length), 2);
            int i4 = BjEWd04qc7Mw.rtx2ld2ELZv4;
            int i5 = BjEWd04qc7Mw.OPXfSBeufaJ8;
            int i6 = BjEWd04qc7Mw.wdg6QnbFHrFF;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (TSizfFm2Yiuu(tl2Var.Y1f8riQaR6yg[i4])) {
                        gyVar.PxuCJdSBwIXG++;
                    } else {
                        Object[] objArr3 = tl2Var.Y1f8riQaR6yg;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.Y1f8riQaR6yg.length) {
                return length == tl2Var.Y1f8riQaR6yg.length ? tl2Var : length == copyOf.length ? new tl2(0, 0, copyOf, ib0Var) : new tl2(0, 0, Arrays.copyOf(copyOf, length), ib0Var);
            }
        } else {
            int i7 = this.lS5Rgt96tfkO | tl2Var.lS5Rgt96tfkO;
            int i8 = this.PxuCJdSBwIXG;
            int i9 = tl2Var.PxuCJdSBwIXG;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg[a92UlCVFR9N8(lowestOneBit)], tl2Var.Y1f8riQaR6yg[tl2Var.a92UlCVFR9N8(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                gp1.lS5Rgt96tfkO("Check failed.");
            }
            tl2 tl2Var2 = (cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, gl1Var.rtx2ld2ELZv4) && this.PxuCJdSBwIXG == i12 && this.lS5Rgt96tfkO == i7) ? this : new tl2(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = tl2Var2.Y1f8riQaR6yg;
                int length2 = (objArr4.length - 1) - i14;
                if (OPXfSBeufaJ8(lowestOneBit2)) {
                    wdg6QnbFHrFF = RfyTYNmI9Srp(EcgxDIVH5in8(lowestOneBit2));
                    if (tl2Var.OPXfSBeufaJ8(lowestOneBit2)) {
                        wdg6QnbFHrFF = wdg6QnbFHrFF.cpQdD2nAriOS(tl2Var.RfyTYNmI9Srp(tl2Var.EcgxDIVH5in8(lowestOneBit2)), i + 5, gyVar, gl1Var);
                        objArr = objArr4;
                    } else if (tl2Var.rtx2ld2ELZv4(lowestOneBit2)) {
                        int a92UlCVFR9N8 = tl2Var.a92UlCVFR9N8(lowestOneBit2);
                        Object obj = tl2Var.Y1f8riQaR6yg[a92UlCVFR9N8];
                        Object ZbWwgt3aGe7A = tl2Var.ZbWwgt3aGe7A(a92UlCVFR9N8);
                        int i15 = gl1Var.x50lh2ztY7Y5;
                        objArr = objArr4;
                        wdg6QnbFHrFF = wdg6QnbFHrFF.x50lh2ztY7Y5(obj != null ? obj.hashCode() : i2, obj, ZbWwgt3aGe7A, i + 5, gl1Var);
                        if (gl1Var.x50lh2ztY7Y5 == i15) {
                            gyVar.PxuCJdSBwIXG++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (tl2Var.OPXfSBeufaJ8(lowestOneBit2)) {
                        tl2 RfyTYNmI9Srp = tl2Var.RfyTYNmI9Srp(tl2Var.EcgxDIVH5in8(lowestOneBit2));
                        if (rtx2ld2ELZv4(lowestOneBit2)) {
                            int a92UlCVFR9N82 = a92UlCVFR9N8(lowestOneBit2);
                            Object obj2 = this.Y1f8riQaR6yg[a92UlCVFR9N82];
                            int i16 = i + 5;
                            if (RfyTYNmI9Srp.Y1f8riQaR6yg(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                gyVar.PxuCJdSBwIXG++;
                            } else {
                                wdg6QnbFHrFF = RfyTYNmI9Srp.x50lh2ztY7Y5(obj2 != null ? obj2.hashCode() : 0, obj2, ZbWwgt3aGe7A(a92UlCVFR9N82), i16, gl1Var);
                            }
                        }
                        wdg6QnbFHrFF = RfyTYNmI9Srp;
                    } else {
                        int a92UlCVFR9N83 = a92UlCVFR9N8(lowestOneBit2);
                        Object obj3 = this.Y1f8riQaR6yg[a92UlCVFR9N83];
                        Object ZbWwgt3aGe7A2 = ZbWwgt3aGe7A(a92UlCVFR9N83);
                        int a92UlCVFR9N84 = tl2Var.a92UlCVFR9N8(lowestOneBit2);
                        Object obj4 = tl2Var.Y1f8riQaR6yg[a92UlCVFR9N84];
                        wdg6QnbFHrFF = wdg6QnbFHrFF(obj3 != null ? obj3.hashCode() : 0, obj3, ZbWwgt3aGe7A2, obj4 != null ? obj4.hashCode() : 0, obj4, tl2Var.ZbWwgt3aGe7A(a92UlCVFR9N84), i + 5, gl1Var.rtx2ld2ELZv4);
                    }
                }
                objArr[length2] = wdg6QnbFHrFF;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (tl2Var.rtx2ld2ELZv4(lowestOneBit3)) {
                    int a92UlCVFR9N85 = tl2Var.a92UlCVFR9N8(lowestOneBit3);
                    Object[] objArr5 = tl2Var2.Y1f8riQaR6yg;
                    objArr5[i18] = tl2Var.Y1f8riQaR6yg[a92UlCVFR9N85];
                    objArr5[i18 + 1] = tl2Var.ZbWwgt3aGe7A(a92UlCVFR9N85);
                    if (rtx2ld2ELZv4(lowestOneBit3)) {
                        gyVar.PxuCJdSBwIXG++;
                    }
                } else {
                    int a92UlCVFR9N86 = a92UlCVFR9N8(lowestOneBit3);
                    Object[] objArr6 = tl2Var2.Y1f8riQaR6yg;
                    objArr6[i18] = this.Y1f8riQaR6yg[a92UlCVFR9N86];
                    objArr6[i18 + 1] = ZbWwgt3aGe7A(a92UlCVFR9N86);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!e9gEMXR7LXtO(tl2Var2)) {
                return tl2Var.e9gEMXR7LXtO(tl2Var2) ? tl2Var : tl2Var2;
            }
        }
        return this;
    }

    public final tl2 dgRBjINgWbAK(int i, gl1 gl1Var) {
        gl1Var.e9gEMXR7LXtO(gl1Var.x50lh2ztY7Y5 - 1);
        gl1Var.wdg6QnbFHrFF = ZbWwgt3aGe7A(i);
        Object[] objArr = this.Y1f8riQaR6yg;
        if (objArr.length == 2) {
            return null;
        }
        if (this.TSizfFm2Yiuu != gl1Var.rtx2ld2ELZv4) {
            return new tl2(0, 0, th0.a92UlCVFR9N8(i, objArr), gl1Var.rtx2ld2ELZv4);
        }
        this.Y1f8riQaR6yg = th0.a92UlCVFR9N8(i, objArr);
        return this;
    }

    public final boolean e9gEMXR7LXtO(tl2 tl2Var) {
        if (this == tl2Var) {
            return true;
        }
        if (this.lS5Rgt96tfkO == tl2Var.lS5Rgt96tfkO && this.PxuCJdSBwIXG == tl2Var.PxuCJdSBwIXG) {
            int length = this.Y1f8riQaR6yg.length;
            for (int i = 0; i < length; i++) {
                if (this.Y1f8riQaR6yg[i] == tl2Var.Y1f8riQaR6yg[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final tl2 gPXPFXrUH4XX(int i, int i2, gl1 gl1Var) {
        gl1Var.e9gEMXR7LXtO(gl1Var.x50lh2ztY7Y5 - 1);
        gl1Var.wdg6QnbFHrFF = ZbWwgt3aGe7A(i);
        Object[] objArr = this.Y1f8riQaR6yg;
        if (objArr.length == 2) {
            return null;
        }
        if (this.TSizfFm2Yiuu != gl1Var.rtx2ld2ELZv4) {
            return new tl2(i2 ^ this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, th0.a92UlCVFR9N8(i, objArr), gl1Var.rtx2ld2ELZv4);
        }
        this.Y1f8riQaR6yg = th0.a92UlCVFR9N8(i, objArr);
        this.PxuCJdSBwIXG ^= i2;
        return this;
    }

    public final int lS5Rgt96tfkO() {
        if (this.lS5Rgt96tfkO == 0) {
            return this.Y1f8riQaR6yg.length / 2;
        }
        int bitCount = Integer.bitCount(this.PxuCJdSBwIXG);
        int length = this.Y1f8riQaR6yg.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += RfyTYNmI9Srp(i).lS5Rgt96tfkO();
        }
        return bitCount;
    }

    public final tl2 r3s1LDPKFs1S(int i, Object obj, int i2, gl1 gl1Var) {
        tl2 r3s1LDPKFs1S;
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        if (rtx2ld2ELZv4(VhhvGxCb8gfr)) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr);
            if (cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8])) {
                return gPXPFXrUH4XX(a92UlCVFR9N8, VhhvGxCb8gfr, gl1Var);
            }
        } else if (OPXfSBeufaJ8(VhhvGxCb8gfr)) {
            int EcgxDIVH5in8 = EcgxDIVH5in8(VhhvGxCb8gfr);
            tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8);
            if (i2 == 30) {
                yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
                int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
                int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
                int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    r3s1LDPKFs1S = RfyTYNmI9Srp.dgRBjINgWbAK(i3, gl1Var);
                }
                r3s1LDPKFs1S = RfyTYNmI9Srp;
                break;
            }
            r3s1LDPKFs1S = RfyTYNmI9Srp.r3s1LDPKFs1S(i, obj, i2 + 5, gl1Var);
            return BRwzKIf41E4i(RfyTYNmI9Srp, r3s1LDPKFs1S, EcgxDIVH5in8, VhhvGxCb8gfr, gl1Var.rtx2ld2ELZv4);
        }
        return this;
    }

    public final boolean rtx2ld2ELZv4(int i) {
        return (this.PxuCJdSBwIXG & i) != 0;
    }

    public final tl2 x50lh2ztY7Y5(int i, Object obj, Object obj2, int i2, gl1 gl1Var) {
        gl1 gl1Var2;
        tl2 x50lh2ztY7Y5;
        int VhhvGxCb8gfr = 1 << th0.VhhvGxCb8gfr(i, i2);
        boolean rtx2ld2ELZv4 = rtx2ld2ELZv4(VhhvGxCb8gfr);
        ib0 ib0Var = this.TSizfFm2Yiuu;
        if (rtx2ld2ELZv4) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(VhhvGxCb8gfr);
            if (!cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg[a92UlCVFR9N8])) {
                gl1Var.e9gEMXR7LXtO(gl1Var.x50lh2ztY7Y5 + 1);
                ib0 ib0Var2 = gl1Var.rtx2ld2ELZv4;
                if (ib0Var != ib0Var2) {
                    return new tl2(this.PxuCJdSBwIXG ^ VhhvGxCb8gfr, this.lS5Rgt96tfkO | VhhvGxCb8gfr, PxuCJdSBwIXG(a92UlCVFR9N8, VhhvGxCb8gfr, i, obj, obj2, i2, ib0Var2), ib0Var2);
                }
                this.Y1f8riQaR6yg = PxuCJdSBwIXG(a92UlCVFR9N8, VhhvGxCb8gfr, i, obj, obj2, i2, ib0Var2);
                this.PxuCJdSBwIXG ^= VhhvGxCb8gfr;
                this.lS5Rgt96tfkO |= VhhvGxCb8gfr;
                return this;
            }
            gl1Var.wdg6QnbFHrFF = ZbWwgt3aGe7A(a92UlCVFR9N8);
            if (ZbWwgt3aGe7A(a92UlCVFR9N8) == obj2) {
                return this;
            }
            if (ib0Var == gl1Var.rtx2ld2ELZv4) {
                this.Y1f8riQaR6yg[a92UlCVFR9N8 + 1] = obj2;
                return this;
            }
            gl1Var.dgRBjINgWbAK++;
            Object[] objArr = this.Y1f8riQaR6yg;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[a92UlCVFR9N8 + 1] = obj2;
            return new tl2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, copyOf, gl1Var.rtx2ld2ELZv4);
        }
        if (!OPXfSBeufaJ8(VhhvGxCb8gfr)) {
            gl1Var.e9gEMXR7LXtO(gl1Var.x50lh2ztY7Y5 + 1);
            ib0 ib0Var3 = gl1Var.rtx2ld2ELZv4;
            int a92UlCVFR9N82 = a92UlCVFR9N8(VhhvGxCb8gfr);
            Object[] objArr2 = this.Y1f8riQaR6yg;
            if (ib0Var != ib0Var3) {
                return new tl2(this.PxuCJdSBwIXG | VhhvGxCb8gfr, this.lS5Rgt96tfkO, th0.Y1f8riQaR6yg(objArr2, a92UlCVFR9N82, obj, obj2), ib0Var3);
            }
            this.Y1f8riQaR6yg = th0.Y1f8riQaR6yg(objArr2, a92UlCVFR9N82, obj, obj2);
            this.PxuCJdSBwIXG |= VhhvGxCb8gfr;
            return this;
        }
        int EcgxDIVH5in8 = EcgxDIVH5in8(VhhvGxCb8gfr);
        tl2 RfyTYNmI9Srp = RfyTYNmI9Srp(EcgxDIVH5in8);
        if (i2 == 30) {
            yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, RfyTYNmI9Srp.Y1f8riQaR6yg.length), 2);
            int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
            int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
            int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!cs0.wdg6QnbFHrFF(obj, RfyTYNmI9Srp.Y1f8riQaR6yg[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                gl1Var.wdg6QnbFHrFF = RfyTYNmI9Srp.ZbWwgt3aGe7A(i3);
                if (RfyTYNmI9Srp.TSizfFm2Yiuu == gl1Var.rtx2ld2ELZv4) {
                    RfyTYNmI9Srp.Y1f8riQaR6yg[i3 + 1] = obj2;
                    x50lh2ztY7Y5 = RfyTYNmI9Srp;
                } else {
                    gl1Var.dgRBjINgWbAK++;
                    Object[] objArr3 = RfyTYNmI9Srp.Y1f8riQaR6yg;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    x50lh2ztY7Y5 = new tl2(0, 0, copyOf2, gl1Var.rtx2ld2ELZv4);
                }
                gl1Var2 = gl1Var;
            }
            gl1Var.e9gEMXR7LXtO(gl1Var.x50lh2ztY7Y5 + 1);
            x50lh2ztY7Y5 = new tl2(0, 0, th0.Y1f8riQaR6yg(RfyTYNmI9Srp.Y1f8riQaR6yg, 0, obj, obj2), gl1Var.rtx2ld2ELZv4);
            gl1Var2 = gl1Var;
        } else {
            gl1Var2 = gl1Var;
            x50lh2ztY7Y5 = RfyTYNmI9Srp.x50lh2ztY7Y5(i, obj, obj2, i2 + 5, gl1Var2);
        }
        return RfyTYNmI9Srp == x50lh2ztY7Y5 ? this : XL4ISE6Oc65B(EcgxDIVH5in8, x50lh2ztY7Y5, gl1Var2.rtx2ld2ELZv4);
    }
}
