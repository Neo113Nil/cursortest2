package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qh1 {
    public static void PxuCJdSBwIXG(long j, yf yfVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ah) arrayList4.get(i8)).TSizfFm2Yiuu() < i7) {
                u9.XL4ISE6Oc65B("Failed requirement.");
                return;
            }
        }
        ah ahVar = (ah) arrayList.get(i2);
        ah ahVar2 = (ah) arrayList4.get(i3 - 1);
        if (i7 == ahVar.TSizfFm2Yiuu()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ah ahVar3 = (ah) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            ahVar = ahVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (ahVar.a92UlCVFR9N8(i7) == ahVar2.a92UlCVFR9N8(i7)) {
            int min = Math.min(ahVar.TSizfFm2Yiuu(), ahVar2.TSizfFm2Yiuu());
            int i10 = 0;
            for (int i11 = i7; i11 < min && ahVar.a92UlCVFR9N8(i11) == ahVar2.a92UlCVFR9N8(i11); i11++) {
                i10++;
            }
            long j3 = (yfVar.OPXfSBeufaJ8 / 4) + j + 2 + i10 + 1;
            yfVar.i68hK7ahKtgp(-i10);
            yfVar.i68hK7ahKtgp(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                yfVar.i68hK7ahKtgp(ahVar.a92UlCVFR9N8(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ah) arrayList4.get(i4)).TSizfFm2Yiuu()) {
                    yfVar.i68hK7ahKtgp(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    u9.rtx2ld2ELZv4("Check failed.");
                    return;
                }
            }
            yf yfVar2 = new yf();
            yfVar.i68hK7ahKtgp(((int) ((yfVar2.OPXfSBeufaJ8 / 4) + j3)) * (-1));
            PxuCJdSBwIXG(j3, yfVar2, i12, arrayList4, i4, i3, arrayList5);
            yfVar.ryVscX7ZL4Ux(yfVar2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ah) arrayList4.get(i14 - 1)).a92UlCVFR9N8(i7) != ((ah) arrayList4.get(i14)).a92UlCVFR9N8(i7)) {
                i13++;
            }
        }
        long j4 = (yfVar.OPXfSBeufaJ8 / 4) + j + 2 + (i13 * 2);
        yfVar.i68hK7ahKtgp(i13);
        yfVar.i68hK7ahKtgp(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int a92UlCVFR9N8 = ((ah) arrayList4.get(i15)).a92UlCVFR9N8(i7);
            if (i15 == i4 || a92UlCVFR9N8 != ((ah) arrayList4.get(i15 - 1)).a92UlCVFR9N8(i7)) {
                yfVar.i68hK7ahKtgp(a92UlCVFR9N8 & 255);
            }
        }
        yf yfVar3 = new yf();
        int i16 = i4;
        while (i16 < i3) {
            byte a92UlCVFR9N82 = ((ah) arrayList4.get(i16)).a92UlCVFR9N8(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (a92UlCVFR9N82 != ((ah) arrayList4.get(i18)).a92UlCVFR9N8(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((ah) arrayList4.get(i16)).TSizfFm2Yiuu()) {
                yfVar.i68hK7ahKtgp(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                yfVar.i68hK7ahKtgp(((int) ((yfVar3.OPXfSBeufaJ8 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                PxuCJdSBwIXG(j2, yfVar3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        yfVar.ryVscX7ZL4Ux(yfVar3);
    }
}
