package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rk0 {
    public final yf PxuCJdSBwIXG;
    public int RAsUl2FVSrh6;
    public boolean TSizfFm2Yiuu;
    public int rtx2ld2ELZv4;
    public int lS5Rgt96tfkO = Integer.MAX_VALUE;
    public int Y1f8riQaR6yg = 4096;
    public fj0[] e9gEMXR7LXtO = new fj0[8];
    public int a92UlCVFR9N8 = 7;

    public rk0(yf yfVar) {
        this.PxuCJdSBwIXG = yfVar;
    }

    public final void PxuCJdSBwIXG(int i) {
        int i2;
        if (i > 0) {
            int length = this.e9gEMXR7LXtO.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.a92UlCVFR9N8;
                if (length < i2 || i <= 0) {
                    break;
                }
                fj0 fj0Var = this.e9gEMXR7LXtO[length];
                fj0Var.getClass();
                i -= fj0Var.TSizfFm2Yiuu;
                int i4 = this.rtx2ld2ELZv4;
                fj0 fj0Var2 = this.e9gEMXR7LXtO[length];
                fj0Var2.getClass();
                this.rtx2ld2ELZv4 = i4 - fj0Var2.TSizfFm2Yiuu;
                this.RAsUl2FVSrh6--;
                i3++;
                length--;
            }
            fj0[] fj0VarArr = this.e9gEMXR7LXtO;
            int i5 = i2 + 1;
            System.arraycopy(fj0VarArr, i5, fj0VarArr, i5 + i3, this.RAsUl2FVSrh6);
            fj0[] fj0VarArr2 = this.e9gEMXR7LXtO;
            int i6 = this.a92UlCVFR9N8 + 1;
            Arrays.fill(fj0VarArr2, i6, i6 + i3, (Object) null);
            this.a92UlCVFR9N8 += i3;
        }
    }

    public final void TSizfFm2Yiuu(ah ahVar) {
        ahVar.getClass();
        int[] iArr = mm0.PxuCJdSBwIXG;
        int TSizfFm2Yiuu = ahVar.TSizfFm2Yiuu();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < TSizfFm2Yiuu; i++) {
            byte a92UlCVFR9N8 = ahVar.a92UlCVFR9N8(i);
            byte[] bArr = kv2.PxuCJdSBwIXG;
            j2 += mm0.lS5Rgt96tfkO[a92UlCVFR9N8 & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int TSizfFm2Yiuu2 = ahVar.TSizfFm2Yiuu();
        yf yfVar = this.PxuCJdSBwIXG;
        if (i2 >= TSizfFm2Yiuu2) {
            e9gEMXR7LXtO(ahVar.TSizfFm2Yiuu(), 127, 0);
            yfVar.nLZGh9p8gVSu(ahVar);
            return;
        }
        yf yfVar2 = new yf();
        int[] iArr2 = mm0.PxuCJdSBwIXG;
        int TSizfFm2Yiuu3 = ahVar.TSizfFm2Yiuu();
        int i3 = 0;
        for (int i4 = 0; i4 < TSizfFm2Yiuu3; i4++) {
            byte a92UlCVFR9N82 = ahVar.a92UlCVFR9N8(i4);
            byte[] bArr2 = kv2.PxuCJdSBwIXG;
            int i5 = a92UlCVFR9N82 & 255;
            int i6 = mm0.PxuCJdSBwIXG[i5];
            byte b = mm0.lS5Rgt96tfkO[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                yfVar2.Pf0ThKz3j5YS((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            yfVar2.Pf0ThKz3j5YS((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ah x50lh2ztY7Y5 = yfVar2.x50lh2ztY7Y5(yfVar2.OPXfSBeufaJ8);
        e9gEMXR7LXtO(x50lh2ztY7Y5.TSizfFm2Yiuu(), 127, 128);
        yfVar.nLZGh9p8gVSu(x50lh2ztY7Y5);
    }

    public final void Y1f8riQaR6yg(ArrayList arrayList) {
        int i;
        int i2;
        if (this.TSizfFm2Yiuu) {
            int i3 = this.lS5Rgt96tfkO;
            if (i3 < this.Y1f8riQaR6yg) {
                e9gEMXR7LXtO(i3, 31, 32);
            }
            this.TSizfFm2Yiuu = false;
            this.lS5Rgt96tfkO = Integer.MAX_VALUE;
            e9gEMXR7LXtO(this.Y1f8riQaR6yg, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            fj0 fj0Var = (fj0) arrayList.get(i4);
            ah dgRBjINgWbAK = fj0Var.PxuCJdSBwIXG.dgRBjINgWbAK();
            ah ahVar = fj0Var.lS5Rgt96tfkO;
            Integer num = (Integer) sk0.lS5Rgt96tfkO.get(dgRBjINgWbAK);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    fj0[] fj0VarArr = sk0.PxuCJdSBwIXG;
                    if (cs0.wdg6QnbFHrFF(fj0VarArr[intValue].lS5Rgt96tfkO, ahVar)) {
                        i = i2;
                    } else if (cs0.wdg6QnbFHrFF(fj0VarArr[i2].lS5Rgt96tfkO, ahVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.a92UlCVFR9N8 + 1;
                int length = this.e9gEMXR7LXtO.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    fj0 fj0Var2 = this.e9gEMXR7LXtO[i5];
                    fj0Var2.getClass();
                    if (cs0.wdg6QnbFHrFF(fj0Var2.PxuCJdSBwIXG, dgRBjINgWbAK)) {
                        fj0 fj0Var3 = this.e9gEMXR7LXtO[i5];
                        fj0Var3.getClass();
                        if (cs0.wdg6QnbFHrFF(fj0Var3.lS5Rgt96tfkO, ahVar)) {
                            i2 = sk0.PxuCJdSBwIXG.length + (i5 - this.a92UlCVFR9N8);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.a92UlCVFR9N8) + sk0.PxuCJdSBwIXG.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e9gEMXR7LXtO(i2, 127, 128);
            } else if (i == -1) {
                this.PxuCJdSBwIXG.Pf0ThKz3j5YS(64);
                TSizfFm2Yiuu(dgRBjINgWbAK);
                TSizfFm2Yiuu(ahVar);
                lS5Rgt96tfkO(fj0Var);
            } else {
                ah ahVar2 = fj0.Y1f8riQaR6yg;
                dgRBjINgWbAK.getClass();
                ahVar2.getClass();
                if (!dgRBjINgWbAK.RAsUl2FVSrh6(ahVar2.TSizfFm2Yiuu(), ahVar2) || cs0.wdg6QnbFHrFF(fj0.OPXfSBeufaJ8, dgRBjINgWbAK)) {
                    e9gEMXR7LXtO(i, 63, 64);
                    TSizfFm2Yiuu(ahVar);
                    lS5Rgt96tfkO(fj0Var);
                } else {
                    e9gEMXR7LXtO(i, 15, 0);
                    TSizfFm2Yiuu(ahVar);
                }
            }
        }
    }

    public final void e9gEMXR7LXtO(int i, int i2, int i3) {
        yf yfVar = this.PxuCJdSBwIXG;
        if (i < i2) {
            yfVar.Pf0ThKz3j5YS(i | i3);
            return;
        }
        yfVar.Pf0ThKz3j5YS(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            yfVar.Pf0ThKz3j5YS(128 | (i4 & 127));
            i4 >>>= 7;
        }
        yfVar.Pf0ThKz3j5YS(i4);
    }

    public final void lS5Rgt96tfkO(fj0 fj0Var) {
        int i = fj0Var.TSizfFm2Yiuu;
        int i2 = this.Y1f8riQaR6yg;
        if (i > i2) {
            fj0[] fj0VarArr = this.e9gEMXR7LXtO;
            na.v6yxfmkxNKhL(0, fj0VarArr.length, null, fj0VarArr);
            this.a92UlCVFR9N8 = this.e9gEMXR7LXtO.length - 1;
            this.RAsUl2FVSrh6 = 0;
            this.rtx2ld2ELZv4 = 0;
            return;
        }
        PxuCJdSBwIXG((this.rtx2ld2ELZv4 + i) - i2);
        int i3 = this.RAsUl2FVSrh6 + 1;
        fj0[] fj0VarArr2 = this.e9gEMXR7LXtO;
        if (i3 > fj0VarArr2.length) {
            fj0[] fj0VarArr3 = new fj0[fj0VarArr2.length * 2];
            System.arraycopy(fj0VarArr2, 0, fj0VarArr3, fj0VarArr2.length, fj0VarArr2.length);
            this.a92UlCVFR9N8 = this.e9gEMXR7LXtO.length - 1;
            this.e9gEMXR7LXtO = fj0VarArr3;
        }
        int i4 = this.a92UlCVFR9N8;
        this.a92UlCVFR9N8 = i4 - 1;
        this.e9gEMXR7LXtO[i4] = fj0Var;
        this.RAsUl2FVSrh6++;
        this.rtx2ld2ELZv4 += i;
    }
}
