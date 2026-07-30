package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class d72 {
    /* JADX WARN: Multi-variable type inference failed */
    public static List PxuCJdSBwIXG(e72 e72Var, int i, e72 e72Var2, boolean z, boolean z2, boolean z3) {
        p50 p50Var;
        boolean z4;
        int i2;
        int i3;
        int S9EYkSpbGuxq = e72Var.S9EYkSpbGuxq(i);
        int i4 = i + S9EYkSpbGuxq;
        int a92UlCVFR9N8 = e72Var.a92UlCVFR9N8(i);
        int a92UlCVFR9N82 = e72Var.a92UlCVFR9N8(i4);
        int i5 = a92UlCVFR9N82 - a92UlCVFR9N8;
        boolean z5 = i >= 0 && (e72Var.lS5Rgt96tfkO[(e72Var.XL4ISE6Oc65B(i) * 5) + 1] & 201326592) != 0;
        e72Var2.S2OOm9zPNm0h(S9EYkSpbGuxq);
        e72Var2.ZbWwgt3aGe7A(i5, e72Var2.EcgxDIVH5in8);
        if (e72Var.RAsUl2FVSrh6 < i4) {
            e72Var.jyegZNwi31qc(i4);
        }
        if (e72Var.dgRBjINgWbAK < a92UlCVFR9N82) {
            e72Var.aF05bpZJlKEP(a92UlCVFR9N82, i4);
        }
        int[] iArr = e72Var2.lS5Rgt96tfkO;
        int i6 = e72Var2.EcgxDIVH5in8;
        int i7 = i6 * 5;
        na.PsecLrZVVK61(e72Var.lS5Rgt96tfkO, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = e72Var2.TSizfFm2Yiuu;
        int i8 = e72Var2.OPXfSBeufaJ8;
        System.arraycopy(e72Var.TSizfFm2Yiuu, a92UlCVFR9N8, objArr, i8, i5);
        int i9 = e72Var2.VhhvGxCb8gfr;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + S9EYkSpbGuxq;
        int RAsUl2FVSrh6 = i8 - e72Var2.RAsUl2FVSrh6(iArr, i6);
        int i12 = e72Var2.cpQdD2nAriOS;
        int i13 = e72Var2.x50lh2ztY7Y5;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int RAsUl2FVSrh62 = e72Var2.RAsUl2FVSrh6(iArr, i15) + RAsUl2FVSrh6;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = e72Var2.dgRBjINgWbAK;
            }
            iArr2[(i15 * 5) + 4] = e72.OPXfSBeufaJ8(RAsUl2FVSrh62, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        e72Var2.cpQdD2nAriOS = i14;
        int PxuCJdSBwIXG = c72.PxuCJdSBwIXG(e72Var.Y1f8riQaR6yg, i, e72Var.gPXPFXrUH4XX());
        int PxuCJdSBwIXG2 = c72.PxuCJdSBwIXG(e72Var.Y1f8riQaR6yg, i4, e72Var.gPXPFXrUH4XX());
        if (PxuCJdSBwIXG < PxuCJdSBwIXG2) {
            ArrayList arrayList = e72Var.Y1f8riQaR6yg;
            ArrayList arrayList2 = new ArrayList(PxuCJdSBwIXG2 - PxuCJdSBwIXG);
            for (int i17 = PxuCJdSBwIXG; i17 < PxuCJdSBwIXG2; i17++) {
                nf0 nf0Var = (nf0) arrayList.get(i17);
                nf0Var.PxuCJdSBwIXG += i10;
                arrayList2.add(nf0Var);
            }
            e72Var2.Y1f8riQaR6yg.addAll(c72.PxuCJdSBwIXG(e72Var2.Y1f8riQaR6yg, e72Var2.EcgxDIVH5in8, e72Var2.gPXPFXrUH4XX()), arrayList2);
            arrayList.subList(PxuCJdSBwIXG, PxuCJdSBwIXG2).clear();
            p50Var = arrayList2;
        } else {
            p50Var = p50.rtx2ld2ELZv4;
        }
        if (!p50Var.isEmpty()) {
            HashMap hashMap = e72Var.e9gEMXR7LXtO;
            HashMap hashMap2 = e72Var2.e9gEMXR7LXtO;
            if (hashMap != null && hashMap2 != null) {
                int size = p50Var.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = e72Var2.VhhvGxCb8gfr;
        e72Var2.Pf0ThKz3j5YS(i9);
        int rZjpSjn4zoMv = e72Var.rZjpSjn4zoMv(e72Var.lS5Rgt96tfkO, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = rZjpSjn4zoMv >= 0;
            if (z7) {
                e72Var.gGoUzNp9JO5I();
                e72Var.PxuCJdSBwIXG(rZjpSjn4zoMv - e72Var.EcgxDIVH5in8);
                e72Var.gGoUzNp9JO5I();
            }
            e72Var.PxuCJdSBwIXG(i - e72Var.EcgxDIVH5in8);
            boolean tmVwIGCQF4zR = e72Var.tmVwIGCQF4zR();
            if (z7) {
                e72Var.ryVscX7ZL4Ux();
                e72Var.wdg6QnbFHrFF();
                e72Var.ryVscX7ZL4Ux();
                e72Var.wdg6QnbFHrFF();
            }
            z4 = tmVwIGCQF4zR;
        } else {
            boolean J54yh1s3n4Aq = e72Var.J54yh1s3n4Aq(i, S9EYkSpbGuxq);
            e72Var.EpkonXwzFgDB(a92UlCVFR9N8, i5, i - 1);
            z4 = J54yh1s3n4Aq;
        }
        if (z4) {
            mp.PxuCJdSBwIXG("Unexpectedly removed anchors");
        }
        int i20 = e72Var2.QrzZRwfaDlRX;
        int i21 = iArr3[i7 + 1];
        e72Var2.QrzZRwfaDlRX = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            e72Var2.EcgxDIVH5in8 = i11;
            e72Var2.OPXfSBeufaJ8 = i8 + i5;
        }
        if (z6) {
            e72Var2.xbgXKYA2cIfu(i9);
        }
        return p50Var;
    }
}
