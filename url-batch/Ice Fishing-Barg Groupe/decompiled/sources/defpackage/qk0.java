package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qk0 {
    public int RAsUl2FVSrh6;
    public long TSizfFm2Yiuu;
    public final es1 Y1f8riQaR6yg;
    public int rtx2ld2ELZv4;
    public int PxuCJdSBwIXG = 4096;
    public final ArrayList lS5Rgt96tfkO = new ArrayList();
    public fj0[] e9gEMXR7LXtO = new fj0[8];
    public int a92UlCVFR9N8 = 7;

    public qk0(pl0 pl0Var) {
        this.Y1f8riQaR6yg = new es1(pl0Var);
    }

    public final void PxuCJdSBwIXG(fj0 fj0Var) {
        this.lS5Rgt96tfkO.add(fj0Var);
        long TSizfFm2Yiuu = this.TSizfFm2Yiuu + fj0Var.lS5Rgt96tfkO.TSizfFm2Yiuu() + fj0Var.PxuCJdSBwIXG.TSizfFm2Yiuu();
        this.TSizfFm2Yiuu = TSizfFm2Yiuu;
        if (TSizfFm2Yiuu <= 262144) {
            return;
        }
        u9.S9EYkSpbGuxq("header byte count limit of 262144 exceeded");
    }

    public final ah TSizfFm2Yiuu(int i) {
        if (i >= 0) {
            fj0[] fj0VarArr = sk0.PxuCJdSBwIXG;
            if (i <= fj0VarArr.length - 1) {
                return fj0VarArr[i].PxuCJdSBwIXG;
            }
        }
        int length = this.a92UlCVFR9N8 + 1 + (i - sk0.PxuCJdSBwIXG.length);
        if (length >= 0) {
            fj0[] fj0VarArr2 = this.e9gEMXR7LXtO;
            if (length < fj0VarArr2.length) {
                fj0 fj0Var = fj0VarArr2[length];
                fj0Var.getClass();
                return fj0Var.PxuCJdSBwIXG;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void Y1f8riQaR6yg(fj0 fj0Var) {
        PxuCJdSBwIXG(fj0Var);
        int i = fj0Var.TSizfFm2Yiuu;
        int i2 = this.PxuCJdSBwIXG;
        if (i > i2) {
            na.v6yxfmkxNKhL(0, r7.length, null, this.e9gEMXR7LXtO);
            this.a92UlCVFR9N8 = this.e9gEMXR7LXtO.length - 1;
            this.RAsUl2FVSrh6 = 0;
            this.rtx2ld2ELZv4 = 0;
            return;
        }
        lS5Rgt96tfkO((this.rtx2ld2ELZv4 + i) - i2);
        int i3 = this.RAsUl2FVSrh6 + 1;
        fj0[] fj0VarArr = this.e9gEMXR7LXtO;
        if (i3 > fj0VarArr.length) {
            fj0[] fj0VarArr2 = new fj0[fj0VarArr.length * 2];
            System.arraycopy(fj0VarArr, 0, fj0VarArr2, fj0VarArr.length, fj0VarArr.length);
            this.a92UlCVFR9N8 = this.e9gEMXR7LXtO.length - 1;
            this.e9gEMXR7LXtO = fj0VarArr2;
        }
        int i4 = this.a92UlCVFR9N8;
        this.a92UlCVFR9N8 = i4 - 1;
        this.e9gEMXR7LXtO[i4] = fj0Var;
        this.RAsUl2FVSrh6++;
        this.rtx2ld2ELZv4 += i;
    }

    public final int a92UlCVFR9N8(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte readByte = this.Y1f8riQaR6yg.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            i4++;
            long j2 = (readByte & Byte.MAX_VALUE) << i5;
            if (j2 > 2147483647L - j) {
                u9.S9EYkSpbGuxq("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((readByte & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        u9.S9EYkSpbGuxq("HPACK integer overflow");
        return 0;
    }

    public final ah e9gEMXR7LXtO() {
        es1 es1Var = this.Y1f8riQaR6yg;
        byte readByte = es1Var.readByte();
        byte[] bArr = kv2.PxuCJdSBwIXG;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long a92UlCVFR9N8 = a92UlCVFR9N8(i, 127);
        if (this.TSizfFm2Yiuu + a92UlCVFR9N8 > 262144) {
            u9.S9EYkSpbGuxq("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return es1Var.x50lh2ztY7Y5(a92UlCVFR9N8);
        }
        yf yfVar = new yf();
        int[] iArr = mm0.PxuCJdSBwIXG;
        es1Var.getClass();
        lm0 lm0Var = mm0.TSizfFm2Yiuu;
        lm0 lm0Var2 = lm0Var;
        int i3 = 0;
        for (long j = 0; j < a92UlCVFR9N8; j++) {
            byte readByte2 = es1Var.readByte();
            byte[] bArr2 = kv2.PxuCJdSBwIXG;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                lm0[] lm0VarArr = (lm0[]) lm0Var2.wdg6QnbFHrFF;
                lm0VarArr.getClass();
                lm0Var2 = lm0VarArr[(i2 >>> (i3 - 8)) & 255];
                lm0Var2.getClass();
                if (((lm0[]) lm0Var2.wdg6QnbFHrFF) == null) {
                    yfVar.Pf0ThKz3j5YS(lm0Var2.rtx2ld2ELZv4);
                    i3 -= lm0Var2.OPXfSBeufaJ8;
                    lm0Var2 = lm0Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            lm0[] lm0VarArr2 = (lm0[]) lm0Var2.wdg6QnbFHrFF;
            lm0VarArr2.getClass();
            lm0 lm0Var3 = lm0VarArr2[(i2 << (8 - i3)) & 255];
            lm0Var3.getClass();
            int i4 = lm0Var3.OPXfSBeufaJ8;
            if (((lm0[]) lm0Var3.wdg6QnbFHrFF) != null || i4 > i3) {
                break;
            }
            yfVar.Pf0ThKz3j5YS(lm0Var3.rtx2ld2ELZv4);
            i3 -= i4;
            lm0Var2 = lm0Var;
        }
        return yfVar.x50lh2ztY7Y5(yfVar.OPXfSBeufaJ8);
    }

    public final int lS5Rgt96tfkO(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e9gEMXR7LXtO.length;
            while (true) {
                length--;
                i2 = this.a92UlCVFR9N8;
                if (length < i2 || i <= 0) {
                    break;
                }
                fj0 fj0Var = this.e9gEMXR7LXtO[length];
                fj0Var.getClass();
                int i4 = fj0Var.TSizfFm2Yiuu;
                i -= i4;
                this.rtx2ld2ELZv4 -= i4;
                this.RAsUl2FVSrh6--;
                i3++;
            }
            fj0[] fj0VarArr = this.e9gEMXR7LXtO;
            System.arraycopy(fj0VarArr, i2 + 1, fj0VarArr, i2 + 1 + i3, this.RAsUl2FVSrh6);
            this.a92UlCVFR9N8 += i3;
        }
        return i3;
    }
}
