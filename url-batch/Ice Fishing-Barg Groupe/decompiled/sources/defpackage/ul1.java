package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ul1 extends tmVwIGCQF4zR {
    public final Object[] OPXfSBeufaJ8;
    public final int dgRBjINgWbAK;
    public final Object[] rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public ul1(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.rtx2ld2ELZv4 = objArr;
        this.OPXfSBeufaJ8 = objArr2;
        this.wdg6QnbFHrFF = i;
        this.dgRBjINgWbAK = i2;
        if (!(PxuCJdSBwIXG() > 32)) {
            gp1.PxuCJdSBwIXG("Trie-based persistent vector should have at least 33 elements, got " + PxuCJdSBwIXG());
        }
        int length = objArr2.length;
    }

    public static Object[] BRwzKIf41E4i(int i, int i2, Object obj, Object[] objArr) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[ryVscX7ZL4Ux] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[ryVscX7ZL4Ux];
        obj2.getClass();
        copyOf[ryVscX7ZL4Ux] = BRwzKIf41E4i(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    public static Object[] OPXfSBeufaJ8(Object[] objArr, int i, int i2, Object obj, HqMwxkFaipxD hqMwxkFaipxD) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        if (i == 0) {
            Object[] copyOf = ryVscX7ZL4Ux == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            na.VzNxmvWisHL1(objArr, copyOf, ryVscX7ZL4Ux + 1, ryVscX7ZL4Ux, 31);
            hqMwxkFaipxD.PxuCJdSBwIXG = objArr[31];
            copyOf[ryVscX7ZL4Ux] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[ryVscX7ZL4Ux];
        obj2.getClass();
        copyOf2[ryVscX7ZL4Ux] = OPXfSBeufaJ8((Object[]) obj2, i3, i2, obj, hqMwxkFaipxD);
        while (true) {
            ryVscX7ZL4Ux++;
            if (ryVscX7ZL4Ux >= 32 || copyOf2[ryVscX7ZL4Ux] == null) {
                break;
            }
            Object obj3 = objArr[ryVscX7ZL4Ux];
            obj3.getClass();
            copyOf2[ryVscX7ZL4Ux] = OPXfSBeufaJ8((Object[]) obj3, i3, 0, hqMwxkFaipxD.PxuCJdSBwIXG, hqMwxkFaipxD);
        }
        return copyOf2;
    }

    public static Object[] dgRBjINgWbAK(Object[] objArr, int i, int i2, HqMwxkFaipxD hqMwxkFaipxD) {
        Object[] dgRBjINgWbAK;
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        if (i == 5) {
            hqMwxkFaipxD.PxuCJdSBwIXG = objArr[ryVscX7ZL4Ux];
            dgRBjINgWbAK = null;
        } else {
            Object obj = objArr[ryVscX7ZL4Ux];
            obj.getClass();
            dgRBjINgWbAK = dgRBjINgWbAK((Object[]) obj, i - 5, i2, hqMwxkFaipxD);
        }
        if (dgRBjINgWbAK == null && ryVscX7ZL4Ux == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[ryVscX7ZL4Ux] = dgRBjINgWbAK;
        return copyOf;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    public final tmVwIGCQF4zR QrzZRwfaDlRX(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.wdg6QnbFHrFF - i;
        if (i4 != 1) {
            Object[] objArr2 = this.OPXfSBeufaJ8;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                na.VzNxmvWisHL1(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new ul1(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new g72(objArr);
        }
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr, i2, i - 1, hqMwxkFaipxD);
        dgRBjINgWbAK.getClass();
        Object obj = hqMwxkFaipxD.PxuCJdSBwIXG;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (dgRBjINgWbAK[1] != null) {
            return new ul1(dgRBjINgWbAK, objArr3, i, i2);
        }
        Object obj2 = dgRBjINgWbAK[0];
        obj2.getClass();
        return new ul1((Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR RAsUl2FVSrh6(int i) {
        sj0.x50lh2ztY7Y5(i, PxuCJdSBwIXG());
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        int i2 = this.dgRBjINgWbAK;
        Object[] objArr = this.rtx2ld2ELZv4;
        return i >= gPXPFXrUH4XX ? QrzZRwfaDlRX(objArr, gPXPFXrUH4XX, i2, i - gPXPFXrUH4XX) : QrzZRwfaDlRX(r3s1LDPKFs1S(objArr, i2, i, new HqMwxkFaipxD(this.OPXfSBeufaJ8[0])), gPXPFXrUH4XX, i2, 0);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR TSizfFm2Yiuu(Object obj) {
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        int i = this.wdg6QnbFHrFF;
        int i2 = i - gPXPFXrUH4XX;
        Object[] objArr = this.rtx2ld2ELZv4;
        Object[] objArr2 = this.OPXfSBeufaJ8;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new ul1(objArr, copyOf, i + 1, this.dgRBjINgWbAK);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return x50lh2ztY7Y5(objArr, objArr2, objArr3);
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR a92UlCVFR9N8(ozEBbv0hFTAB ozebbv0hftab) {
        vl1 vl1Var = new vl1(this, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.dgRBjINgWbAK);
        vl1Var.pnx5pC0XzaCw(ozebbv0hftab);
        return vl1Var.TSizfFm2Yiuu();
    }

    public final Object[] cpQdD2nAriOS(int i, Object[] objArr, Object[] objArr2) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(PxuCJdSBwIXG() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[ryVscX7ZL4Ux] = objArr2;
            return copyOf;
        }
        copyOf[ryVscX7ZL4Ux] = cpQdD2nAriOS(i - 5, (Object[]) copyOf[ryVscX7ZL4Ux], objArr2);
        return copyOf;
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final vl1 e9gEMXR7LXtO() {
        return new vl1(this, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.dgRBjINgWbAK);
    }

    public final int gPXPFXrUH4XX() {
        return (this.wdg6QnbFHrFF - 1) & (-32);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sj0.x50lh2ztY7Y5(i, PxuCJdSBwIXG());
        if (gPXPFXrUH4XX() <= i) {
            objArr = this.OPXfSBeufaJ8;
        } else {
            Object[] objArr2 = this.rtx2ld2ELZv4;
            for (int i2 = this.dgRBjINgWbAK; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ki0.ryVscX7ZL4Ux(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR lS5Rgt96tfkO(int i, Object obj) {
        int i2 = this.wdg6QnbFHrFF;
        sj0.cpQdD2nAriOS(i, i2);
        if (i == i2) {
            return TSizfFm2Yiuu(obj);
        }
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        Object[] objArr = this.rtx2ld2ELZv4;
        if (i >= gPXPFXrUH4XX) {
            return wdg6QnbFHrFF(objArr, i - gPXPFXrUH4XX, obj);
        }
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
        return wdg6QnbFHrFF(OPXfSBeufaJ8(objArr, this.dgRBjINgWbAK, i, obj, hqMwxkFaipxD), 0, hqMwxkFaipxD.PxuCJdSBwIXG);
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final ListIterator listIterator(int i) {
        sj0.cpQdD2nAriOS(i, this.wdg6QnbFHrFF);
        return new wl1(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, i, this.wdg6QnbFHrFF, (this.dgRBjINgWbAK / 5) + 1);
    }

    public final Object[] r3s1LDPKFs1S(Object[] objArr, int i, int i2, HqMwxkFaipxD hqMwxkFaipxD) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        if (i == 0) {
            Object[] copyOf = ryVscX7ZL4Ux == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            na.VzNxmvWisHL1(objArr, copyOf, ryVscX7ZL4Ux, ryVscX7ZL4Ux + 1, 32);
            copyOf[31] = hqMwxkFaipxD.PxuCJdSBwIXG;
            hqMwxkFaipxD.PxuCJdSBwIXG = objArr[ryVscX7ZL4Ux];
            return copyOf;
        }
        int ryVscX7ZL4Ux2 = objArr[31] == null ? ki0.ryVscX7ZL4Ux(gPXPFXrUH4XX() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = ryVscX7ZL4Ux + 1;
        if (i4 <= ryVscX7ZL4Ux2) {
            while (true) {
                Object obj = copyOf2[ryVscX7ZL4Ux2];
                obj.getClass();
                copyOf2[ryVscX7ZL4Ux2] = r3s1LDPKFs1S((Object[]) obj, i3, 0, hqMwxkFaipxD);
                if (ryVscX7ZL4Ux2 == i4) {
                    break;
                }
                ryVscX7ZL4Ux2--;
            }
        }
        Object obj2 = copyOf2[ryVscX7ZL4Ux];
        obj2.getClass();
        copyOf2[ryVscX7ZL4Ux] = r3s1LDPKFs1S((Object[]) obj2, i3, i2, hqMwxkFaipxD);
        return copyOf2;
    }

    @Override // defpackage.tmVwIGCQF4zR
    public final tmVwIGCQF4zR rtx2ld2ELZv4(int i, Object obj) {
        int i2 = this.wdg6QnbFHrFF;
        sj0.x50lh2ztY7Y5(i, i2);
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        Object[] objArr = this.rtx2ld2ELZv4;
        Object[] objArr2 = this.OPXfSBeufaJ8;
        int i3 = this.dgRBjINgWbAK;
        if (gPXPFXrUH4XX > i) {
            return new ul1(BRwzKIf41E4i(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new ul1(objArr, copyOf, i2, i3);
    }

    public final ul1 wdg6QnbFHrFF(Object[] objArr, int i, Object obj) {
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        int i2 = this.wdg6QnbFHrFF;
        int i3 = i2 - gPXPFXrUH4XX;
        Object[] objArr2 = this.OPXfSBeufaJ8;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            na.VzNxmvWisHL1(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new ul1(objArr, copyOf, i2 + 1, this.dgRBjINgWbAK);
        }
        Object obj2 = objArr2[31];
        na.VzNxmvWisHL1(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return x50lh2ztY7Y5(objArr, copyOf, objArr3);
    }

    public final ul1 x50lh2ztY7Y5(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.wdg6QnbFHrFF;
        int i2 = i >> 5;
        int i3 = this.dgRBjINgWbAK;
        if (i2 <= (1 << i3)) {
            return new ul1(cpQdD2nAriOS(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ul1(cpQdD2nAriOS(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }
}
