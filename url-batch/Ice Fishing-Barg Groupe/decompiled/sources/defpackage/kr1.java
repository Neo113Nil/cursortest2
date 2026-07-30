package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kr1 {
    public static final String PxuCJdSBwIXG(kr1 kr1Var, ah ahVar, ah[] ahVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        kr1Var.getClass();
        int TSizfFm2Yiuu = ahVar.TSizfFm2Yiuu();
        int i5 = 0;
        while (i5 < TSizfFm2Yiuu) {
            int i6 = (i5 + TSizfFm2Yiuu) / 2;
            while (i6 > -1 && ahVar.a92UlCVFR9N8(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (ahVar.a92UlCVFR9N8(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte a92UlCVFR9N8 = ahVarArr[i10].a92UlCVFR9N8(i11);
                    byte[] bArr = kv2.PxuCJdSBwIXG;
                    int i13 = a92UlCVFR9N8 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte a92UlCVFR9N82 = ahVar.a92UlCVFR9N8(i7 + i12);
                byte[] bArr2 = kv2.PxuCJdSBwIXG;
                i4 = i3 - (a92UlCVFR9N82 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (ahVarArr[i10].TSizfFm2Yiuu() != i11) {
                    z2 = z;
                } else {
                    if (i10 == ahVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int TSizfFm2Yiuu2 = ahVarArr[i10].TSizfFm2Yiuu() - i11;
                    int length = ahVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        TSizfFm2Yiuu2 += ahVarArr[i15].TSizfFm2Yiuu();
                    }
                    if (TSizfFm2Yiuu2 >= i14) {
                        if (TSizfFm2Yiuu2 <= i14) {
                            return ahVar.wdg6QnbFHrFF(i7, i9 + i7).OPXfSBeufaJ8(pj.PxuCJdSBwIXG);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            TSizfFm2Yiuu = i6;
        }
        return null;
    }
}
