package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vl1 extends rZjpSjn4zoMv implements Collection, fu0 {
    public Object[] OPXfSBeufaJ8;
    public int QrzZRwfaDlRX;
    public Object[] cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public Object[] r3s1LDPKFs1S;
    public tmVwIGCQF4zR rtx2ld2ELZv4;
    public Object[] wdg6QnbFHrFF;
    public ib0 x50lh2ztY7Y5 = new ib0(6);

    public vl1(tmVwIGCQF4zR tmvwigcqf4zr, Object[] objArr, Object[] objArr2, int i) {
        this.rtx2ld2ELZv4 = tmvwigcqf4zr;
        this.OPXfSBeufaJ8 = objArr;
        this.wdg6QnbFHrFF = objArr2;
        this.dgRBjINgWbAK = i;
        this.cpQdD2nAriOS = objArr;
        this.r3s1LDPKFs1S = objArr2;
        this.QrzZRwfaDlRX = tmvwigcqf4zr.PxuCJdSBwIXG();
    }

    public static void Y1f8riQaR6yg(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void BRwzKIf41E4i(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.cpQdD2nAriOS = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.r3s1LDPKFs1S = objArr;
            this.QrzZRwfaDlRX = i;
            this.dgRBjINgWbAK = i2;
            return;
        }
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
        objArr.getClass();
        Object[] gPXPFXrUH4XX = gPXPFXrUH4XX(objArr, i2, i, hqMwxkFaipxD);
        gPXPFXrUH4XX.getClass();
        Object obj = hqMwxkFaipxD.PxuCJdSBwIXG;
        obj.getClass();
        this.r3s1LDPKFs1S = (Object[]) obj;
        this.QrzZRwfaDlRX = i;
        if (gPXPFXrUH4XX[1] == null) {
            this.cpQdD2nAriOS = (Object[]) gPXPFXrUH4XX[0];
            this.dgRBjINgWbAK = i2 - 5;
        } else {
            this.cpQdD2nAriOS = gPXPFXrUH4XX;
            this.dgRBjINgWbAK = i2;
        }
    }

    public final void EcgxDIVH5in8(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.QrzZRwfaDlRX;
        int i2 = i >> 5;
        int i3 = this.dgRBjINgWbAK;
        if (i2 > (1 << i3)) {
            this.cpQdD2nAriOS = S9EYkSpbGuxq(this.dgRBjINgWbAK + 5, r3s1LDPKFs1S(objArr), objArr2);
            this.r3s1LDPKFs1S = objArr3;
            this.dgRBjINgWbAK += 5;
            this.QrzZRwfaDlRX++;
            return;
        }
        if (objArr == null) {
            this.cpQdD2nAriOS = objArr2;
            this.r3s1LDPKFs1S = objArr3;
            this.QrzZRwfaDlRX = i + 1;
        } else {
            this.cpQdD2nAriOS = S9EYkSpbGuxq(i3, objArr, objArr2);
            this.r3s1LDPKFs1S = objArr3;
            this.QrzZRwfaDlRX++;
        }
    }

    public final Object[] IAToe7bXGz4N(Object[] objArr, int i, int i2, HqMwxkFaipxD hqMwxkFaipxD) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        if (i == 0) {
            Object obj = objArr[ryVscX7ZL4Ux];
            Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
            na.VzNxmvWisHL1(objArr, dgRBjINgWbAK, ryVscX7ZL4Ux, ryVscX7ZL4Ux + 1, 32);
            dgRBjINgWbAK[31] = hqMwxkFaipxD.PxuCJdSBwIXG;
            hqMwxkFaipxD.PxuCJdSBwIXG = obj;
            return dgRBjINgWbAK;
        }
        int ryVscX7ZL4Ux2 = objArr[31] == null ? ki0.ryVscX7ZL4Ux(jyegZNwi31qc() - 1, i) : 31;
        Object[] dgRBjINgWbAK2 = dgRBjINgWbAK(objArr);
        int i3 = i - 5;
        int i4 = ryVscX7ZL4Ux + 1;
        if (i4 <= ryVscX7ZL4Ux2) {
            while (true) {
                Object obj2 = dgRBjINgWbAK2[ryVscX7ZL4Ux2];
                obj2.getClass();
                dgRBjINgWbAK2[ryVscX7ZL4Ux2] = IAToe7bXGz4N((Object[]) obj2, i3, 0, hqMwxkFaipxD);
                if (ryVscX7ZL4Ux2 == i4) {
                    break;
                }
                ryVscX7ZL4Ux2--;
            }
        }
        Object obj3 = dgRBjINgWbAK2[ryVscX7ZL4Ux];
        obj3.getClass();
        dgRBjINgWbAK2[ryVscX7ZL4Ux] = IAToe7bXGz4N((Object[]) obj3, i3, i2, hqMwxkFaipxD);
        return dgRBjINgWbAK2;
    }

    public final boolean OPXfSBeufaJ8(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.x50lh2ztY7Y5;
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final int PxuCJdSBwIXG() {
        return this.QrzZRwfaDlRX;
    }

    public final Object[] QrzZRwfaDlRX(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            gp1.PxuCJdSBwIXG("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i, i2);
        Object obj = objArr[ryVscX7ZL4Ux];
        obj.getClass();
        Object QrzZRwfaDlRX = QrzZRwfaDlRX((Object[]) obj, i, i2 - 5);
        if (ryVscX7ZL4Ux < 31) {
            int i3 = ryVscX7ZL4Ux + 1;
            if (objArr[i3] != null) {
                if (OPXfSBeufaJ8(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] cpQdD2nAriOS = cpQdD2nAriOS();
                na.VzNxmvWisHL1(objArr, cpQdD2nAriOS, 0, 0, i3);
                objArr = cpQdD2nAriOS;
            }
        }
        if (QrzZRwfaDlRX == objArr[ryVscX7ZL4Ux]) {
            return objArr;
        }
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        dgRBjINgWbAK[ryVscX7ZL4Ux] = QrzZRwfaDlRX;
        return dgRBjINgWbAK;
    }

    public final Object[] RAsUl2FVSrh6(Object[] objArr, int i, int i2, Object obj, HqMwxkFaipxD hqMwxkFaipxD) {
        Object obj2;
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        if (i == 0) {
            hqMwxkFaipxD.PxuCJdSBwIXG = objArr[31];
            Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
            na.VzNxmvWisHL1(objArr, dgRBjINgWbAK, ryVscX7ZL4Ux + 1, ryVscX7ZL4Ux, 31);
            dgRBjINgWbAK[ryVscX7ZL4Ux] = obj;
            return dgRBjINgWbAK;
        }
        Object[] dgRBjINgWbAK2 = dgRBjINgWbAK(objArr);
        int i3 = i - 5;
        Object obj3 = dgRBjINgWbAK2[ryVscX7ZL4Ux];
        obj3.getClass();
        dgRBjINgWbAK2[ryVscX7ZL4Ux] = RAsUl2FVSrh6((Object[]) obj3, i3, i2, obj, hqMwxkFaipxD);
        while (true) {
            ryVscX7ZL4Ux++;
            if (ryVscX7ZL4Ux >= 32 || (obj2 = dgRBjINgWbAK2[ryVscX7ZL4Ux]) == null) {
                break;
            }
            dgRBjINgWbAK2[ryVscX7ZL4Ux] = RAsUl2FVSrh6((Object[]) obj2, i3, 0, hqMwxkFaipxD.PxuCJdSBwIXG, hqMwxkFaipxD);
        }
        return dgRBjINgWbAK2;
    }

    public final Object[] RfyTYNmI9Srp(Object[] objArr, int i, Object[][] objArr2) {
        ZbWwgt3aGe7A zbWwgt3aGe7A = new ZbWwgt3aGe7A(objArr2);
        int i2 = i >> 5;
        int i3 = this.dgRBjINgWbAK;
        Object[] XL4ISE6Oc65B = i2 < (1 << i3) ? XL4ISE6Oc65B(objArr, i, i3, zbWwgt3aGe7A) : dgRBjINgWbAK(objArr);
        while (zbWwgt3aGe7A.hasNext()) {
            this.dgRBjINgWbAK += 5;
            XL4ISE6Oc65B = r3s1LDPKFs1S(XL4ISE6Oc65B);
            int i4 = this.dgRBjINgWbAK;
            XL4ISE6Oc65B(XL4ISE6Oc65B, 1 << i4, i4, zbWwgt3aGe7A);
        }
        return XL4ISE6Oc65B;
    }

    public final int S2OOm9zPNm0h(le0 le0Var, Object[] objArr, int i, HqMwxkFaipxD hqMwxkFaipxD) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) le0Var.OPXfSBeufaJ8(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = dgRBjINgWbAK(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        hqMwxkFaipxD.PxuCJdSBwIXG = objArr2;
        return i2;
    }

    public final Object[] S9EYkSpbGuxq(int i, Object[] objArr, Object[] objArr2) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(PxuCJdSBwIXG() - 1, i);
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        if (i == 5) {
            dgRBjINgWbAK[ryVscX7ZL4Ux] = objArr2;
            return dgRBjINgWbAK;
        }
        dgRBjINgWbAK[ryVscX7ZL4Ux] = S9EYkSpbGuxq(i - 5, (Object[]) dgRBjINgWbAK[ryVscX7ZL4Ux], objArr2);
        return dgRBjINgWbAK;
    }

    public final tmVwIGCQF4zR TSizfFm2Yiuu() {
        tmVwIGCQF4zR ul1Var;
        Object[] objArr = this.cpQdD2nAriOS;
        if (objArr == this.OPXfSBeufaJ8 && this.r3s1LDPKFs1S == this.wdg6QnbFHrFF) {
            ul1Var = this.rtx2ld2ELZv4;
        } else {
            this.x50lh2ztY7Y5 = new ib0(6);
            this.OPXfSBeufaJ8 = objArr;
            Object[] objArr2 = this.r3s1LDPKFs1S;
            this.wdg6QnbFHrFF = objArr2;
            if (objArr != null) {
                ul1Var = new ul1(objArr, objArr2, this.QrzZRwfaDlRX, this.dgRBjINgWbAK);
            } else if (objArr2.length == 0) {
                g72.Companion.getClass();
                ul1Var = g72.OPXfSBeufaJ8;
            } else {
                ul1Var = new g72(Arrays.copyOf(objArr2, this.QrzZRwfaDlRX));
            }
        }
        this.rtx2ld2ELZv4 = ul1Var;
        return ul1Var;
    }

    public final int VhhvGxCb8gfr(le0 le0Var, Object[] objArr, int i, int i2, HqMwxkFaipxD hqMwxkFaipxD, ArrayList arrayList, ArrayList arrayList2) {
        if (OPXfSBeufaJ8(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = hqMwxkFaipxD.PxuCJdSBwIXG;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) le0Var.OPXfSBeufaJ8(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : cpQdD2nAriOS();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        hqMwxkFaipxD.PxuCJdSBwIXG = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] XL4ISE6Oc65B(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            gp1.PxuCJdSBwIXG("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            gp1.PxuCJdSBwIXG("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i, i2);
        int i3 = i2 - 5;
        dgRBjINgWbAK[ryVscX7ZL4Ux] = XL4ISE6Oc65B((Object[]) dgRBjINgWbAK[ryVscX7ZL4Ux], i, i3, it);
        while (true) {
            ryVscX7ZL4Ux++;
            if (ryVscX7ZL4Ux >= 32 || !it.hasNext()) {
                break;
            }
            dgRBjINgWbAK[ryVscX7ZL4Ux] = XL4ISE6Oc65B((Object[]) dgRBjINgWbAK[ryVscX7ZL4Ux], 0, i3, it);
        }
        return dgRBjINgWbAK;
    }

    public final int ZbWwgt3aGe7A(le0 le0Var, int i, HqMwxkFaipxD hqMwxkFaipxD) {
        int S2OOm9zPNm0h = S2OOm9zPNm0h(le0Var, this.r3s1LDPKFs1S, i, hqMwxkFaipxD);
        Object obj = hqMwxkFaipxD.PxuCJdSBwIXG;
        if (S2OOm9zPNm0h == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, S2OOm9zPNm0h, i, (Object) null);
        this.r3s1LDPKFs1S = objArr;
        this.QrzZRwfaDlRX -= i - S2OOm9zPNm0h;
        return S2OOm9zPNm0h;
    }

    public final void a92UlCVFR9N8(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.cpQdD2nAriOS == null) {
            u9.rtx2ld2ELZv4("root is null");
            return;
        }
        int i4 = i >> 5;
        jyegZNwi31qc wdg6QnbFHrFF = wdg6QnbFHrFF(jyegZNwi31qc() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (wdg6QnbFHrFF.rtx2ld2ELZv4 - 1 != i4) {
            Object[] objArr4 = (Object[]) wdg6QnbFHrFF.previous();
            na.VzNxmvWisHL1(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = x50lh2ztY7Y5(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) wdg6QnbFHrFF.previous();
        int jyegZNwi31qc = i3 - (((jyegZNwi31qc() >> 5) - 1) - i4);
        if (jyegZNwi31qc < i3) {
            objArr2 = objArr[jyegZNwi31qc];
            objArr2.getClass();
        }
        kpCQ9veP6n3I(collection, i, objArr5, 32, objArr, jyegZNwi31qc, objArr2);
    }

    public final Object[] aF05bpZJlKEP(Object[] objArr, int i, int i2, Object obj, HqMwxkFaipxD hqMwxkFaipxD) {
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2, i);
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        if (i != 0) {
            Object obj2 = dgRBjINgWbAK[ryVscX7ZL4Ux];
            obj2.getClass();
            dgRBjINgWbAK[ryVscX7ZL4Ux] = aF05bpZJlKEP((Object[]) obj2, i - 5, i2, obj, hqMwxkFaipxD);
            return dgRBjINgWbAK;
        }
        if (dgRBjINgWbAK != objArr) {
            ((AbstractList) this).modCount++;
        }
        hqMwxkFaipxD.PxuCJdSBwIXG = dgRBjINgWbAK[ryVscX7ZL4Ux];
        dgRBjINgWbAK[ryVscX7ZL4Ux] = obj;
        return dgRBjINgWbAK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        sj0.cpQdD2nAriOS(i, PxuCJdSBwIXG());
        if (i == PxuCJdSBwIXG()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int jyegZNwi31qc = jyegZNwi31qc();
        if (i >= jyegZNwi31qc) {
            rtx2ld2ELZv4(this.cpQdD2nAriOS, i - jyegZNwi31qc, obj);
            return;
        }
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
        Object[] objArr = this.cpQdD2nAriOS;
        objArr.getClass();
        rtx2ld2ELZv4(RAsUl2FVSrh6(objArr, this.dgRBjINgWbAK, i, obj, hqMwxkFaipxD), 0, hqMwxkFaipxD.PxuCJdSBwIXG);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] cpQdD2nAriOS;
        sj0.cpQdD2nAriOS(i, this.QrzZRwfaDlRX);
        if (i == this.QrzZRwfaDlRX) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.QrzZRwfaDlRX - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.r3s1LDPKFs1S;
            Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
            na.VzNxmvWisHL1(objArr, dgRBjINgWbAK, size2 + 1, i3, rZjpSjn4zoMv());
            Y1f8riQaR6yg(dgRBjINgWbAK, i3, collection.iterator());
            this.r3s1LDPKFs1S = dgRBjINgWbAK;
            this.QrzZRwfaDlRX = collection.size() + this.QrzZRwfaDlRX;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int rZjpSjn4zoMv = rZjpSjn4zoMv();
        int size3 = collection.size() + this.QrzZRwfaDlRX;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= jyegZNwi31qc()) {
            cpQdD2nAriOS = cpQdD2nAriOS();
            collection2 = collection;
            kpCQ9veP6n3I(collection2, i, this.r3s1LDPKFs1S, rZjpSjn4zoMv, objArr2, size, cpQdD2nAriOS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.r3s1LDPKFs1S;
            if (size3 > rZjpSjn4zoMv) {
                int i4 = size3 - rZjpSjn4zoMv;
                Object[] x50lh2ztY7Y5 = x50lh2ztY7Y5(i4, objArr3);
                a92UlCVFR9N8(collection2, i, i4, objArr2, size, x50lh2ztY7Y5);
                objArr2 = objArr2;
                cpQdD2nAriOS = x50lh2ztY7Y5;
            } else {
                cpQdD2nAriOS = cpQdD2nAriOS();
                int i5 = rZjpSjn4zoMv - size3;
                na.VzNxmvWisHL1(objArr3, cpQdD2nAriOS, 0, i5, rZjpSjn4zoMv);
                int i6 = 32 - i5;
                Object[] x50lh2ztY7Y52 = x50lh2ztY7Y5(i6, this.r3s1LDPKFs1S);
                int i7 = size - 1;
                objArr2[i7] = x50lh2ztY7Y52;
                a92UlCVFR9N8(collection2, i, i6, objArr2, i7, x50lh2ztY7Y52);
                collection2 = collection2;
            }
        }
        this.cpQdD2nAriOS = RfyTYNmI9Srp(this.cpQdD2nAriOS, i2, objArr2);
        this.r3s1LDPKFs1S = cpQdD2nAriOS;
        this.QrzZRwfaDlRX = collection2.size() + this.QrzZRwfaDlRX;
        return true;
    }

    public final Object[] cpQdD2nAriOS() {
        Object[] objArr = new Object[33];
        objArr[32] = this.x50lh2ztY7Y5;
        return objArr;
    }

    public final Object[] dgRBjINgWbAK(Object[] objArr) {
        if (objArr == null) {
            return cpQdD2nAriOS();
        }
        if (OPXfSBeufaJ8(objArr)) {
            return objArr;
        }
        Object[] cpQdD2nAriOS = cpQdD2nAriOS();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        na.hVNtCUZb4tYH(objArr, cpQdD2nAriOS, 0, length, 6);
        return cpQdD2nAriOS;
    }

    public final Object e6tOsSdd2EFb(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.QrzZRwfaDlRX - i;
        Object[] objArr2 = this.r3s1LDPKFs1S;
        if (i4 == 1) {
            Object obj = objArr2[0];
            BRwzKIf41E4i(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr2);
        na.VzNxmvWisHL1(objArr2, dgRBjINgWbAK, i3, i3 + 1, i4);
        dgRBjINgWbAK[i4 - 1] = null;
        this.cpQdD2nAriOS = objArr;
        this.r3s1LDPKFs1S = dgRBjINgWbAK;
        this.QrzZRwfaDlRX = (i + i4) - 1;
        this.dgRBjINgWbAK = i2;
        return obj2;
    }

    public final int e9gEMXR7LXtO() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] gPXPFXrUH4XX(Object[] objArr, int i, int i2, HqMwxkFaipxD hqMwxkFaipxD) {
        Object[] gPXPFXrUH4XX;
        int ryVscX7ZL4Ux = ki0.ryVscX7ZL4Ux(i2 - 1, i);
        if (i == 5) {
            hqMwxkFaipxD.PxuCJdSBwIXG = objArr[ryVscX7ZL4Ux];
            gPXPFXrUH4XX = null;
        } else {
            Object obj = objArr[ryVscX7ZL4Ux];
            obj.getClass();
            gPXPFXrUH4XX = gPXPFXrUH4XX((Object[]) obj, i - 5, i2, hqMwxkFaipxD);
        }
        if (gPXPFXrUH4XX == null && ryVscX7ZL4Ux == 0) {
            return null;
        }
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        dgRBjINgWbAK[ryVscX7ZL4Ux] = gPXPFXrUH4XX;
        return dgRBjINgWbAK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sj0.x50lh2ztY7Y5(i, PxuCJdSBwIXG());
        if (jyegZNwi31qc() <= i) {
            objArr = this.r3s1LDPKFs1S;
        } else {
            Object[] objArr2 = this.cpQdD2nAriOS;
            objArr2.getClass();
            for (int i2 = this.dgRBjINgWbAK; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[ki0.ryVscX7ZL4Ux(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int jyegZNwi31qc() {
        int i = this.QrzZRwfaDlRX;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final void kpCQ9veP6n3I(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] cpQdD2nAriOS;
        if (i3 < 1) {
            gp1.PxuCJdSBwIXG("requires at least one nullBuffer");
        }
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(objArr);
        objArr2[0] = dgRBjINgWbAK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            na.VzNxmvWisHL1(dgRBjINgWbAK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                cpQdD2nAriOS = dgRBjINgWbAK;
            } else {
                cpQdD2nAriOS = cpQdD2nAriOS();
                i3--;
                objArr2[i3] = cpQdD2nAriOS;
            }
            int i7 = i2 - i6;
            na.VzNxmvWisHL1(dgRBjINgWbAK, objArr3, 0, i7, i2);
            na.VzNxmvWisHL1(dgRBjINgWbAK, cpQdD2nAriOS, size + 1, i4, i7);
            objArr3 = cpQdD2nAriOS;
        }
        Iterator it = collection.iterator();
        Y1f8riQaR6yg(dgRBjINgWbAK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] cpQdD2nAriOS2 = cpQdD2nAriOS();
            Y1f8riQaR6yg(cpQdD2nAriOS2, 0, it);
            objArr2[i8] = cpQdD2nAriOS2;
        }
        Y1f8riQaR6yg(objArr3, 0, it);
    }

    @Override // defpackage.rZjpSjn4zoMv
    public final Object lS5Rgt96tfkO(int i) {
        sj0.x50lh2ztY7Y5(i, PxuCJdSBwIXG());
        ((AbstractList) this).modCount++;
        int jyegZNwi31qc = jyegZNwi31qc();
        if (i >= jyegZNwi31qc) {
            return e6tOsSdd2EFb(this.cpQdD2nAriOS, jyegZNwi31qc, this.dgRBjINgWbAK, i - jyegZNwi31qc);
        }
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(this.r3s1LDPKFs1S[0]);
        Object[] objArr = this.cpQdD2nAriOS;
        objArr.getClass();
        e6tOsSdd2EFb(IAToe7bXGz4N(objArr, this.dgRBjINgWbAK, i, hqMwxkFaipxD), jyegZNwi31qc, this.dgRBjINgWbAK, 0);
        return hqMwxkFaipxD.PxuCJdSBwIXG;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        sj0.cpQdD2nAriOS(i, this.QrzZRwfaDlRX);
        return new xl1(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (ZbWwgt3aGe7A(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean pnx5pC0XzaCw(le0 le0Var) {
        int i;
        le0 le0Var2 = le0Var;
        int rZjpSjn4zoMv = rZjpSjn4zoMv();
        Object[] objArr = null;
        HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
        boolean z = false;
        if (this.cpQdD2nAriOS != null) {
            jyegZNwi31qc wdg6QnbFHrFF = wdg6QnbFHrFF(0);
            int i2 = 32;
            while (i2 == 32 && wdg6QnbFHrFF.hasNext()) {
                i2 = S2OOm9zPNm0h(le0Var2, (Object[]) wdg6QnbFHrFF.next(), 32, hqMwxkFaipxD);
            }
            if (i2 == 32) {
                int ZbWwgt3aGe7A = ZbWwgt3aGe7A(le0Var2, rZjpSjn4zoMv, hqMwxkFaipxD);
                if (ZbWwgt3aGe7A == 0) {
                    BRwzKIf41E4i(this.cpQdD2nAriOS, this.QrzZRwfaDlRX, this.dgRBjINgWbAK);
                }
            } else {
                int i3 = (wdg6QnbFHrFF.rtx2ld2ELZv4 - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (wdg6QnbFHrFF.hasNext()) {
                    i4 = VhhvGxCb8gfr(le0Var2, (Object[]) wdg6QnbFHrFF.next(), 32, i4, hqMwxkFaipxD, arrayList2, arrayList);
                    le0Var2 = le0Var;
                }
                int VhhvGxCb8gfr = VhhvGxCb8gfr(le0Var, this.r3s1LDPKFs1S, rZjpSjn4zoMv, i4, hqMwxkFaipxD, arrayList2, arrayList);
                Object obj = hqMwxkFaipxD.PxuCJdSBwIXG;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, VhhvGxCb8gfr, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.cpQdD2nAriOS;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = XL4ISE6Oc65B(objArr3, i3, this.dgRBjINgWbAK, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    gp1.PxuCJdSBwIXG("invalid size");
                }
                if (size == 0) {
                    this.dgRBjINgWbAK = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.dgRBjINgWbAK;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.dgRBjINgWbAK = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = QrzZRwfaDlRX(objArr3, i5, i);
                }
                this.cpQdD2nAriOS = objArr;
                this.r3s1LDPKFs1S = objArr2;
                this.QrzZRwfaDlRX = size + VhhvGxCb8gfr;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] r3s1LDPKFs1S(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.x50lh2ztY7Y5;
        return objArr;
    }

    public final int rZjpSjn4zoMv() {
        int i = this.QrzZRwfaDlRX;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return pnx5pC0XzaCw(new ozEBbv0hFTAB(1, collection));
    }

    public final void rtx2ld2ELZv4(Object[] objArr, int i, Object obj) {
        int rZjpSjn4zoMv = rZjpSjn4zoMv();
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(this.r3s1LDPKFs1S);
        Object[] objArr2 = this.r3s1LDPKFs1S;
        if (rZjpSjn4zoMv >= 32) {
            Object obj2 = objArr2[31];
            na.VzNxmvWisHL1(objArr2, dgRBjINgWbAK, i + 1, i, 31);
            dgRBjINgWbAK[i] = obj;
            EcgxDIVH5in8(objArr, dgRBjINgWbAK, r3s1LDPKFs1S(obj2));
            return;
        }
        na.VzNxmvWisHL1(objArr2, dgRBjINgWbAK, i + 1, i, rZjpSjn4zoMv);
        dgRBjINgWbAK[i] = obj;
        this.cpQdD2nAriOS = objArr;
        this.r3s1LDPKFs1S = dgRBjINgWbAK;
        this.QrzZRwfaDlRX++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        sj0.x50lh2ztY7Y5(i, PxuCJdSBwIXG());
        if (jyegZNwi31qc() > i) {
            HqMwxkFaipxD hqMwxkFaipxD = new HqMwxkFaipxD(null);
            Object[] objArr = this.cpQdD2nAriOS;
            objArr.getClass();
            this.cpQdD2nAriOS = aF05bpZJlKEP(objArr, this.dgRBjINgWbAK, i, obj, hqMwxkFaipxD);
            return hqMwxkFaipxD.PxuCJdSBwIXG;
        }
        Object[] dgRBjINgWbAK = dgRBjINgWbAK(this.r3s1LDPKFs1S);
        if (dgRBjINgWbAK != this.r3s1LDPKFs1S) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = dgRBjINgWbAK[i2];
        dgRBjINgWbAK[i2] = obj;
        this.r3s1LDPKFs1S = dgRBjINgWbAK;
        return obj2;
    }

    public final jyegZNwi31qc wdg6QnbFHrFF(int i) {
        Object[] objArr = this.cpQdD2nAriOS;
        if (objArr == null) {
            u9.rtx2ld2ELZv4("Invalid root");
            return null;
        }
        int jyegZNwi31qc = jyegZNwi31qc() >> 5;
        sj0.cpQdD2nAriOS(i, jyegZNwi31qc);
        int i2 = this.dgRBjINgWbAK;
        return i2 == 0 ? new zf(i, objArr) : new rl2(objArr, i, jyegZNwi31qc, i2 / 5);
    }

    public final Object[] x50lh2ztY7Y5(int i, Object[] objArr) {
        if (OPXfSBeufaJ8(objArr)) {
            na.VzNxmvWisHL1(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] cpQdD2nAriOS = cpQdD2nAriOS();
        na.VzNxmvWisHL1(objArr, cpQdD2nAriOS, i, 0, 32 - i);
        return cpQdD2nAriOS;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int rZjpSjn4zoMv = rZjpSjn4zoMv();
        if (rZjpSjn4zoMv < 32) {
            Object[] dgRBjINgWbAK = dgRBjINgWbAK(this.r3s1LDPKFs1S);
            dgRBjINgWbAK[rZjpSjn4zoMv] = obj;
            this.r3s1LDPKFs1S = dgRBjINgWbAK;
            this.QrzZRwfaDlRX = PxuCJdSBwIXG() + 1;
        } else {
            EcgxDIVH5in8(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, r3s1LDPKFs1S(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int rZjpSjn4zoMv = rZjpSjn4zoMv();
        Iterator it = collection.iterator();
        if (32 - rZjpSjn4zoMv >= collection.size()) {
            Object[] dgRBjINgWbAK = dgRBjINgWbAK(this.r3s1LDPKFs1S);
            Y1f8riQaR6yg(dgRBjINgWbAK, rZjpSjn4zoMv, it);
            this.r3s1LDPKFs1S = dgRBjINgWbAK;
            this.QrzZRwfaDlRX = collection.size() + this.QrzZRwfaDlRX;
            return true;
        }
        int size = ((collection.size() + rZjpSjn4zoMv) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] dgRBjINgWbAK2 = dgRBjINgWbAK(this.r3s1LDPKFs1S);
        Y1f8riQaR6yg(dgRBjINgWbAK2, rZjpSjn4zoMv, it);
        objArr[0] = dgRBjINgWbAK2;
        for (int i = 1; i < size; i++) {
            Object[] cpQdD2nAriOS = cpQdD2nAriOS();
            Y1f8riQaR6yg(cpQdD2nAriOS, 0, it);
            objArr[i] = cpQdD2nAriOS;
        }
        this.cpQdD2nAriOS = RfyTYNmI9Srp(this.cpQdD2nAriOS, jyegZNwi31qc(), objArr);
        Object[] cpQdD2nAriOS2 = cpQdD2nAriOS();
        Y1f8riQaR6yg(cpQdD2nAriOS2, 0, it);
        this.r3s1LDPKFs1S = cpQdD2nAriOS2;
        this.QrzZRwfaDlRX = collection.size() + this.QrzZRwfaDlRX;
        return true;
    }
}
