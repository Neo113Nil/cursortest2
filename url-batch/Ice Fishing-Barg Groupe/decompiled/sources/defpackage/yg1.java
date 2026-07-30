package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yg1 extends nh1 {
    public static final yg1 TSizfFm2Yiuu = new yg1(1, 0, 2);

    @Override // defpackage.nh1
    public final void PxuCJdSBwIXG(of0 of0Var, r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        int[] iArr;
        nf0 nf0Var;
        int TSizfFm2Yiuu2;
        int TSizfFm2Yiuu3 = of0Var.TSizfFm2Yiuu(0);
        if (e72Var.r3s1LDPKFs1S != 0) {
            mp.PxuCJdSBwIXG("Cannot move a group while inserting");
        }
        if (TSizfFm2Yiuu3 < 0) {
            mp.PxuCJdSBwIXG("Parameter offset is out of bounds");
        }
        if (TSizfFm2Yiuu3 == 0) {
            return;
        }
        int i = e72Var.EcgxDIVH5in8;
        int i2 = e72Var.VhhvGxCb8gfr;
        int i3 = e72Var.S9EYkSpbGuxq;
        int i4 = i;
        while (true) {
            iArr = e72Var.lS5Rgt96tfkO;
            if (TSizfFm2Yiuu3 <= 0) {
                break;
            }
            i4 += iArr[(e72Var.XL4ISE6Oc65B(i4) * 5) + 3];
            if (i4 > i3) {
                mp.PxuCJdSBwIXG("Parameter offset is out of bounds");
            }
            TSizfFm2Yiuu3--;
        }
        int i5 = iArr[(e72Var.XL4ISE6Oc65B(i4) * 5) + 3];
        int RAsUl2FVSrh6 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(e72Var.EcgxDIVH5in8));
        int RAsUl2FVSrh62 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i4));
        int i6 = i4 + i5;
        int RAsUl2FVSrh63 = e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(i6));
        int i7 = RAsUl2FVSrh63 - RAsUl2FVSrh62;
        e72Var.ZbWwgt3aGe7A(i7, Math.max(e72Var.EcgxDIVH5in8 - 1, 0));
        e72Var.S2OOm9zPNm0h(i5);
        int[] iArr2 = e72Var.lS5Rgt96tfkO;
        int XL4ISE6Oc65B = e72Var.XL4ISE6Oc65B(i6) * 5;
        na.PsecLrZVVK61(iArr2, iArr2, e72Var.XL4ISE6Oc65B(i) * 5, XL4ISE6Oc65B, (i5 * 5) + XL4ISE6Oc65B);
        if (i7 > 0) {
            Object[] objArr = e72Var.TSizfFm2Yiuu;
            int rtx2ld2ELZv4 = e72Var.rtx2ld2ELZv4(RAsUl2FVSrh62 + i7);
            System.arraycopy(objArr, rtx2ld2ELZv4, objArr, RAsUl2FVSrh6, e72Var.rtx2ld2ELZv4(RAsUl2FVSrh63 + i7) - rtx2ld2ELZv4);
        }
        int i8 = RAsUl2FVSrh62 + i7;
        int i9 = i8 - RAsUl2FVSrh6;
        int i10 = e72Var.dgRBjINgWbAK;
        int i11 = e72Var.x50lh2ztY7Y5;
        int length = e72Var.TSizfFm2Yiuu.length;
        int i12 = e72Var.cpQdD2nAriOS;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int XL4ISE6Oc65B2 = e72Var.XL4ISE6Oc65B(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(XL4ISE6Oc65B2 * 5) + 4] = e72.OPXfSBeufaJ8(e72.OPXfSBeufaJ8(e72Var.RAsUl2FVSrh6(iArr2, XL4ISE6Oc65B2) - i15, i12 < XL4ISE6Oc65B2 ? 0 : i10, i11, length), e72Var.dgRBjINgWbAK, e72Var.x50lh2ztY7Y5, e72Var.TSizfFm2Yiuu.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int gPXPFXrUH4XX = e72Var.gPXPFXrUH4XX();
        int PxuCJdSBwIXG = c72.PxuCJdSBwIXG(e72Var.Y1f8riQaR6yg, i6, gPXPFXrUH4XX);
        ArrayList arrayList = new ArrayList();
        if (PxuCJdSBwIXG >= 0) {
            while (PxuCJdSBwIXG < e72Var.Y1f8riQaR6yg.size() && (TSizfFm2Yiuu2 = e72Var.TSizfFm2Yiuu((nf0Var = (nf0) e72Var.Y1f8riQaR6yg.get(PxuCJdSBwIXG)))) >= i6 && TSizfFm2Yiuu2 < i16) {
                arrayList.add(nf0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            nf0 nf0Var2 = (nf0) arrayList.get(i18);
            int TSizfFm2Yiuu4 = e72Var.TSizfFm2Yiuu(nf0Var2) + i17;
            if (TSizfFm2Yiuu4 >= e72Var.RAsUl2FVSrh6) {
                nf0Var2.PxuCJdSBwIXG = -(gPXPFXrUH4XX - TSizfFm2Yiuu4);
            } else {
                nf0Var2.PxuCJdSBwIXG = TSizfFm2Yiuu4;
            }
            e72Var.Y1f8riQaR6yg.add(c72.PxuCJdSBwIXG(e72Var.Y1f8riQaR6yg, TSizfFm2Yiuu4, gPXPFXrUH4XX), nf0Var2);
        }
        if (e72Var.J54yh1s3n4Aq(i6, i5)) {
            mp.PxuCJdSBwIXG("Unexpectedly removed anchors");
        }
        e72Var.cpQdD2nAriOS(i2, e72Var.S9EYkSpbGuxq, i);
        if (i7 > 0) {
            e72Var.EpkonXwzFgDB(i8, i7, i6 - 1);
        }
    }
}
