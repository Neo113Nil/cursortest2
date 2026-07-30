package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e72 {
    public static final d72 Companion = new d72();
    public final jr0 BRwzKIf41E4i;
    public int EcgxDIVH5in8;
    public int OPXfSBeufaJ8;
    public final a72 PxuCJdSBwIXG;
    public int QrzZRwfaDlRX;
    public int RAsUl2FVSrh6;
    public c81 RfyTYNmI9Srp;
    public boolean S2OOm9zPNm0h;
    public int S9EYkSpbGuxq;
    public Object[] TSizfFm2Yiuu;
    public int VhhvGxCb8gfr;
    public final jr0 XL4ISE6Oc65B;
    public ArrayList Y1f8riQaR6yg;
    public b81 ZbWwgt3aGe7A;
    public c81 a92UlCVFR9N8;
    public int cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public HashMap e9gEMXR7LXtO;
    public final jr0 gPXPFXrUH4XX;
    public int[] lS5Rgt96tfkO;
    public int r3s1LDPKFs1S;
    public int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public e72(a72 a72Var) {
        this.PxuCJdSBwIXG = a72Var;
        int[] iArr = a72Var.rtx2ld2ELZv4;
        this.lS5Rgt96tfkO = iArr;
        Object[] objArr = a72Var.wdg6QnbFHrFF;
        this.TSizfFm2Yiuu = objArr;
        this.Y1f8riQaR6yg = a72Var.gPXPFXrUH4XX;
        this.e9gEMXR7LXtO = a72Var.BRwzKIf41E4i;
        this.a92UlCVFR9N8 = a72Var.XL4ISE6Oc65B;
        int i = a72Var.OPXfSBeufaJ8;
        this.RAsUl2FVSrh6 = i;
        this.rtx2ld2ELZv4 = (iArr.length / 5) - i;
        int i2 = a72Var.dgRBjINgWbAK;
        this.dgRBjINgWbAK = i2;
        this.x50lh2ztY7Y5 = objArr.length - i2;
        this.cpQdD2nAriOS = i;
        this.gPXPFXrUH4XX = new jr0();
        this.BRwzKIf41E4i = new jr0();
        this.XL4ISE6Oc65B = new jr0();
        this.S9EYkSpbGuxq = i;
        this.VhhvGxCb8gfr = -1;
    }

    public static void IAToe7bXGz4N(e72 e72Var) {
        int i = e72Var.VhhvGxCb8gfr;
        int XL4ISE6Oc65B = e72Var.XL4ISE6Oc65B(i);
        int[] iArr = e72Var.lS5Rgt96tfkO;
        int i2 = (XL4ISE6Oc65B * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        e72Var.xbgXKYA2cIfu(e72Var.rZjpSjn4zoMv(iArr, i));
    }

    public static int OPXfSBeufaJ8(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final Object BRwzKIf41E4i(int i) {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(i);
        int[] iArr = this.lS5Rgt96tfkO;
        int i2 = (XL4ISE6Oc65B * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            hp.Companion.getClass();
            return fp.lS5Rgt96tfkO;
        }
        return this.TSizfFm2Yiuu[Integer.bitCount(iArr[i2] >> 29) + RAsUl2FVSrh6(iArr, XL4ISE6Oc65B)];
    }

    public final Object BjEWd04qc7Mw(Object obj) {
        if (this.r3s1LDPKFs1S > 0) {
            ZbWwgt3aGe7A(1, this.VhhvGxCb8gfr);
        }
        Object[] objArr = this.TSizfFm2Yiuu;
        int i = this.OPXfSBeufaJ8;
        this.OPXfSBeufaJ8 = i + 1;
        Object obj2 = objArr[rtx2ld2ELZv4(i)];
        if (this.OPXfSBeufaJ8 > this.wdg6QnbFHrFF) {
            mp.PxuCJdSBwIXG("Writing to an invalid slot");
        }
        this.TSizfFm2Yiuu[rtx2ld2ELZv4(this.OPXfSBeufaJ8 - 1)] = obj;
        return obj2;
    }

    public final Object EcgxDIVH5in8(int i) {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(i);
        int[] iArr = this.lS5Rgt96tfkO;
        int i2 = XL4ISE6Oc65B * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.TSizfFm2Yiuu[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void EpkonXwzFgDB(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.x50lh2ztY7Y5;
            int i5 = i + i2;
            aF05bpZJlKEP(i5, i3);
            this.dgRBjINgWbAK = i;
            this.x50lh2ztY7Y5 = i4 + i2;
            Arrays.fill(this.TSizfFm2Yiuu, i, i5, (Object) null);
            int i6 = this.wdg6QnbFHrFF;
            if (i6 >= i) {
                this.wdg6QnbFHrFF = i6 - i2;
            }
        }
    }

    public final boolean J54yh1s3n4Aq(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.Y1f8riQaR6yg;
            jyegZNwi31qc(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e9gEMXR7LXtO;
                int i3 = i + i2;
                int PxuCJdSBwIXG = c72.PxuCJdSBwIXG(this.Y1f8riQaR6yg, i3, QrzZRwfaDlRX() - this.rtx2ld2ELZv4);
                if (PxuCJdSBwIXG >= this.Y1f8riQaR6yg.size()) {
                    PxuCJdSBwIXG--;
                }
                int i4 = PxuCJdSBwIXG + 1;
                int i5 = 0;
                while (PxuCJdSBwIXG >= 0) {
                    nf0 nf0Var = (nf0) this.Y1f8riQaR6yg.get(PxuCJdSBwIXG);
                    int TSizfFm2Yiuu = TSizfFm2Yiuu(nf0Var);
                    if (TSizfFm2Yiuu < i) {
                        break;
                    }
                    if (TSizfFm2Yiuu < i3) {
                        nf0Var.PxuCJdSBwIXG = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = PxuCJdSBwIXG + 1;
                        }
                        i4 = PxuCJdSBwIXG;
                    }
                    PxuCJdSBwIXG--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.Y1f8riQaR6yg.subList(i4, i5).clear();
                }
            }
            this.RAsUl2FVSrh6 = i;
            this.rtx2ld2ELZv4 += i2;
            int i6 = this.cpQdD2nAriOS;
            if (i6 > i) {
                this.cpQdD2nAriOS = Math.max(i, i6 - i2);
            }
            int i7 = this.S9EYkSpbGuxq;
            if (i7 >= this.RAsUl2FVSrh6) {
                this.S9EYkSpbGuxq = i7 - i2;
            }
            int i8 = this.VhhvGxCb8gfr;
            if (i8 >= 0 && (this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i8) * 5) + 1] & 67108864) != 0) {
                xbgXKYA2cIfu(i8);
            }
        }
        return r0;
    }

    public final void POWyO8hTM6YC(int i, Object obj) {
        hp.Companion.getClass();
        i68hK7ahKtgp(i, obj, fp.lS5Rgt96tfkO, false);
    }

    public final vf0 Pf0ThKz3j5YS(int i) {
        nf0 zf8DYfih6EZu;
        HashMap hashMap = this.e9gEMXR7LXtO;
        if (hashMap == null || (zf8DYfih6EZu = zf8DYfih6EZu(i)) == null) {
            return null;
        }
        return (vf0) hashMap.get(zf8DYfih6EZu);
    }

    public final void PxuCJdSBwIXG(int i) {
        if (i < 0) {
            mp.PxuCJdSBwIXG("Cannot seek backwards");
        }
        if (this.r3s1LDPKFs1S > 0) {
            gp1.lS5Rgt96tfkO("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.EcgxDIVH5in8 + i;
        if (i2 < this.VhhvGxCb8gfr || i2 > this.S9EYkSpbGuxq) {
            mp.PxuCJdSBwIXG("Cannot seek outside the current group (" + this.VhhvGxCb8gfr + '-' + this.S9EYkSpbGuxq + ')');
        }
        this.EcgxDIVH5in8 = i2;
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i2));
        this.OPXfSBeufaJ8 = RAsUl2FVSrh6;
        this.wdg6QnbFHrFF = RAsUl2FVSrh6;
    }

    public final int QrzZRwfaDlRX() {
        return this.lS5Rgt96tfkO.length / 5;
    }

    public final int RAsUl2FVSrh6(int[] iArr, int i) {
        if (i >= QrzZRwfaDlRX()) {
            return this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5) + i2 + 1 : i2;
    }

    public final int RfyTYNmI9Srp(int i) {
        return this.lS5Rgt96tfkO[XL4ISE6Oc65B(i) * 5];
    }

    public final void S2OOm9zPNm0h(int i) {
        if (i > 0) {
            int i2 = this.EcgxDIVH5in8;
            jyegZNwi31qc(i2);
            int i3 = this.RAsUl2FVSrh6;
            int i4 = this.rtx2ld2ELZv4;
            int[] iArr = this.lS5Rgt96tfkO;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                na.PsecLrZVVK61(iArr, iArr2, 0, 0, i3 * 5);
                na.PsecLrZVVK61(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.lS5Rgt96tfkO = iArr2;
                i4 = i6;
            }
            int i7 = this.S9EYkSpbGuxq;
            if (i7 >= i3) {
                this.S9EYkSpbGuxq = i7 + i;
            }
            int i8 = i3 + i;
            this.RAsUl2FVSrh6 = i8;
            this.rtx2ld2ELZv4 = i4 - i;
            int OPXfSBeufaJ8 = OPXfSBeufaJ8(i5 > 0 ? a92UlCVFR9N8(i2 + i) : 0, this.cpQdD2nAriOS >= i3 ? this.dgRBjINgWbAK : 0, this.x50lh2ztY7Y5, this.TSizfFm2Yiuu.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.lS5Rgt96tfkO[(i9 * 5) + 4] = OPXfSBeufaJ8;
            }
            int i10 = this.cpQdD2nAriOS;
            if (i10 >= i3) {
                this.cpQdD2nAriOS = i10 + i;
            }
        }
    }

    public final int S9EYkSpbGuxq(int i) {
        return this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i) * 5) + 3];
    }

    public final int TSizfFm2Yiuu(nf0 nf0Var) {
        int i = nf0Var.PxuCJdSBwIXG;
        return i < 0 ? gPXPFXrUH4XX() + i : i;
    }

    public final boolean VhhvGxCb8gfr(int i, int i2) {
        int QrzZRwfaDlRX;
        int S9EYkSpbGuxq;
        if (i2 == this.VhhvGxCb8gfr) {
            QrzZRwfaDlRX = this.S9EYkSpbGuxq;
        } else {
            jr0 jr0Var = this.gPXPFXrUH4XX;
            if (i2 > jr0Var.PxuCJdSBwIXG(0)) {
                S9EYkSpbGuxq = S9EYkSpbGuxq(i2);
            } else {
                int[] iArr = jr0Var.PxuCJdSBwIXG;
                int min = Math.min(iArr.length, jr0Var.lS5Rgt96tfkO);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    S9EYkSpbGuxq = S9EYkSpbGuxq(i2);
                } else {
                    QrzZRwfaDlRX = (QrzZRwfaDlRX() - this.rtx2ld2ELZv4) - this.BRwzKIf41E4i.PxuCJdSBwIXG[i3];
                }
            }
            QrzZRwfaDlRX = S9EYkSpbGuxq + i2;
        }
        return i > i2 && i < QrzZRwfaDlRX;
    }

    public final int XL4ISE6Oc65B(int i) {
        return (this.rtx2ld2ELZv4 * (i < this.RAsUl2FVSrh6 ? 0 : 1)) + i;
    }

    public final void Y1f8riQaR6yg() {
        int i = this.r3s1LDPKFs1S;
        this.r3s1LDPKFs1S = i + 1;
        if (i == 0) {
            this.BRwzKIf41E4i.TSizfFm2Yiuu((QrzZRwfaDlRX() - this.rtx2ld2ELZv4) - this.S9EYkSpbGuxq);
        }
    }

    public final void ZbWwgt3aGe7A(int i, int i2) {
        if (i > 0) {
            aF05bpZJlKEP(this.OPXfSBeufaJ8, i2);
            int i3 = this.dgRBjINgWbAK;
            int i4 = this.x50lh2ztY7Y5;
            if (i4 < i) {
                Object[] objArr = this.TSizfFm2Yiuu;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.TSizfFm2Yiuu = objArr2;
                i4 = i7;
            }
            int i9 = this.wdg6QnbFHrFF;
            if (i9 >= i3) {
                this.wdg6QnbFHrFF = i9 + i;
            }
            this.dgRBjINgWbAK = i3 + i;
            this.x50lh2ztY7Y5 = i4 - i;
        }
    }

    public final int a92UlCVFR9N8(int i) {
        return RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i));
    }

    public final void aF05bpZJlKEP(int i, int i2) {
        int i3 = this.x50lh2ztY7Y5;
        int i4 = this.dgRBjINgWbAK;
        int i5 = this.cpQdD2nAriOS;
        if (i4 != i) {
            Object[] objArr = this.TSizfFm2Yiuu;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, gPXPFXrUH4XX());
        if (i5 != min) {
            int length = this.TSizfFm2Yiuu.length - i3;
            if (min < i5) {
                int XL4ISE6Oc65B = XL4ISE6Oc65B(min);
                int XL4ISE6Oc65B2 = XL4ISE6Oc65B(i5);
                int i7 = this.RAsUl2FVSrh6;
                while (XL4ISE6Oc65B < XL4ISE6Oc65B2) {
                    int i8 = (XL4ISE6Oc65B * 5) + 4;
                    int i9 = this.lS5Rgt96tfkO[i8];
                    if (i9 < 0) {
                        mp.PxuCJdSBwIXG("Unexpected anchor value, expected a positive anchor");
                    }
                    this.lS5Rgt96tfkO[i8] = -((length - i9) + 1);
                    XL4ISE6Oc65B++;
                    if (XL4ISE6Oc65B == i7) {
                        XL4ISE6Oc65B += this.rtx2ld2ELZv4;
                    }
                }
            } else {
                int XL4ISE6Oc65B3 = XL4ISE6Oc65B(i5);
                int XL4ISE6Oc65B4 = XL4ISE6Oc65B(min);
                while (XL4ISE6Oc65B3 < XL4ISE6Oc65B4) {
                    int i10 = (XL4ISE6Oc65B3 * 5) + 4;
                    int i11 = this.lS5Rgt96tfkO[i10];
                    if (i11 >= 0) {
                        mp.PxuCJdSBwIXG("Unexpected anchor value, expected a negative anchor");
                    }
                    this.lS5Rgt96tfkO[i10] = i11 + length + 1;
                    XL4ISE6Oc65B3++;
                    if (XL4ISE6Oc65B3 == this.RAsUl2FVSrh6) {
                        XL4ISE6Oc65B3 += this.rtx2ld2ELZv4;
                    }
                }
            }
            this.cpQdD2nAriOS = min;
        }
        this.dgRBjINgWbAK = i;
    }

    public final int amuv7NJvPxHu(int[] iArr, int i) {
        if (i >= QrzZRwfaDlRX()) {
            return this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5;
        }
        int lS5Rgt96tfkO = c72.lS5Rgt96tfkO(iArr, i);
        return lS5Rgt96tfkO < 0 ? (this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5) + lS5Rgt96tfkO + 1 : lS5Rgt96tfkO;
    }

    public final void cpQdD2nAriOS(int i, int i2, int i3) {
        if (i >= this.RAsUl2FVSrh6) {
            i = -((gPXPFXrUH4XX() - i) + 2);
        }
        while (i3 < i2) {
            this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i3) * 5) + 2] = i;
            int i4 = this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i3) * 5) + 3] + i3;
            cpQdD2nAriOS(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void dgRBjINgWbAK() {
        if (this.r3s1LDPKFs1S <= 0) {
            gp1.lS5Rgt96tfkO("Unbalanced begin/end insert");
        }
        int i = this.r3s1LDPKFs1S - 1;
        this.r3s1LDPKFs1S = i;
        if (i == 0) {
            if (this.XL4ISE6Oc65B.lS5Rgt96tfkO != this.gPXPFXrUH4XX.lS5Rgt96tfkO) {
                mp.PxuCJdSBwIXG("startGroup/endGroup mismatch while inserting");
            }
            this.S9EYkSpbGuxq = (QrzZRwfaDlRX() - this.rtx2ld2ELZv4) - this.BRwzKIf41E4i.lS5Rgt96tfkO();
        }
    }

    public final void e6tOsSdd2EFb(a72 a72Var, int i) {
        if (this.r3s1LDPKFs1S <= 0) {
            mp.PxuCJdSBwIXG("Check failed");
        }
        if (i == 0 && this.EcgxDIVH5in8 == 0 && this.PxuCJdSBwIXG.OPXfSBeufaJ8 == 0) {
            int[] iArr = a72Var.rtx2ld2ELZv4;
            int i2 = iArr[(i * 5) + 3];
            int i3 = a72Var.OPXfSBeufaJ8;
            if (i2 == i3) {
                int[] iArr2 = this.lS5Rgt96tfkO;
                Object[] objArr = this.TSizfFm2Yiuu;
                ArrayList arrayList = this.Y1f8riQaR6yg;
                HashMap hashMap = this.e9gEMXR7LXtO;
                c81 c81Var = this.a92UlCVFR9N8;
                Object[] objArr2 = a72Var.wdg6QnbFHrFF;
                int i4 = a72Var.dgRBjINgWbAK;
                HashMap hashMap2 = a72Var.BRwzKIf41E4i;
                c81 c81Var2 = a72Var.XL4ISE6Oc65B;
                this.lS5Rgt96tfkO = iArr;
                this.TSizfFm2Yiuu = objArr2;
                this.Y1f8riQaR6yg = a72Var.gPXPFXrUH4XX;
                this.RAsUl2FVSrh6 = i3;
                this.rtx2ld2ELZv4 = (iArr.length / 5) - i3;
                this.dgRBjINgWbAK = i4;
                this.x50lh2ztY7Y5 = objArr2.length - i4;
                this.cpQdD2nAriOS = i3;
                this.e9gEMXR7LXtO = hashMap2;
                this.a92UlCVFR9N8 = c81Var2;
                a72Var.rtx2ld2ELZv4 = iArr2;
                a72Var.OPXfSBeufaJ8 = 0;
                a72Var.wdg6QnbFHrFF = objArr;
                a72Var.dgRBjINgWbAK = 0;
                a72Var.gPXPFXrUH4XX = arrayList;
                a72Var.BRwzKIf41E4i = hashMap;
                a72Var.XL4ISE6Oc65B = c81Var;
                return;
            }
        }
        e72 Y1f8riQaR6yg = a72Var.Y1f8riQaR6yg();
        try {
            Companion.getClass();
            d72.PxuCJdSBwIXG(Y1f8riQaR6yg, i, this, true, true, false);
            Y1f8riQaR6yg.e9gEMXR7LXtO(true);
        } catch (Throwable th) {
            Y1f8riQaR6yg.e9gEMXR7LXtO(false);
            throw th;
        }
    }

    public final void e9gEMXR7LXtO(boolean z) {
        this.S2OOm9zPNm0h = true;
        if (z && this.gPXPFXrUH4XX.lS5Rgt96tfkO == 0) {
            jyegZNwi31qc(gPXPFXrUH4XX());
            aF05bpZJlKEP(this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5, this.RAsUl2FVSrh6);
            int i = this.dgRBjINgWbAK;
            Arrays.fill(this.TSizfFm2Yiuu, i, this.x50lh2ztY7Y5 + i, (Object) null);
            ozEBbv0hFTAB();
        }
        int[] iArr = this.lS5Rgt96tfkO;
        int i2 = this.RAsUl2FVSrh6;
        Object[] objArr = this.TSizfFm2Yiuu;
        int i3 = this.dgRBjINgWbAK;
        ArrayList arrayList = this.Y1f8riQaR6yg;
        HashMap hashMap = this.e9gEMXR7LXtO;
        c81 c81Var = this.a92UlCVFR9N8;
        a72 a72Var = this.PxuCJdSBwIXG;
        if (!a72Var.r3s1LDPKFs1S) {
            gp1.PxuCJdSBwIXG("Unexpected writer close()");
        }
        a72Var.r3s1LDPKFs1S = false;
        a72Var.rtx2ld2ELZv4 = iArr;
        a72Var.OPXfSBeufaJ8 = i2;
        a72Var.wdg6QnbFHrFF = objArr;
        a72Var.dgRBjINgWbAK = i3;
        a72Var.gPXPFXrUH4XX = arrayList;
        a72Var.BRwzKIf41E4i = hashMap;
        a72Var.XL4ISE6Oc65B = c81Var;
    }

    public final void gGoUzNp9JO5I() {
        if (this.r3s1LDPKFs1S != 0) {
            mp.PxuCJdSBwIXG("Key must be supplied when inserting");
        }
        hp.Companion.getClass();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        i68hK7ahKtgp(0, jx1Var, jx1Var, false);
    }

    public final int gPXPFXrUH4XX() {
        return QrzZRwfaDlRX() - this.rtx2ld2ELZv4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i68hK7ahKtgp(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.VhhvGxCb8gfr;
        Object[] objArr = this.r3s1LDPKFs1S > 0;
        this.XL4ISE6Oc65B.TSizfFm2Yiuu(this.QrzZRwfaDlRX);
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (objArr == true) {
            int i4 = this.EcgxDIVH5in8;
            int RAsUl2FVSrh6 = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i4));
            S2OOm9zPNm0h(1);
            this.OPXfSBeufaJ8 = RAsUl2FVSrh6;
            this.wdg6QnbFHrFF = RAsUl2FVSrh6;
            int XL4ISE6Oc65B = XL4ISE6Oc65B(i4);
            hp.Companion.getClass();
            int i5 = obj != jx1Var ? 1 : 0;
            int i6 = (z || obj2 == jx1Var) ? 0 : 1;
            int OPXfSBeufaJ8 = OPXfSBeufaJ8(RAsUl2FVSrh6, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.TSizfFm2Yiuu.length);
            if (OPXfSBeufaJ8 >= 0 && this.cpQdD2nAriOS < i4) {
                OPXfSBeufaJ8 = -(((this.TSizfFm2Yiuu.length - this.x50lh2ztY7Y5) - OPXfSBeufaJ8) + 1);
            }
            int[] iArr = this.lS5Rgt96tfkO;
            int i7 = this.VhhvGxCb8gfr;
            int i8 = XL4ISE6Oc65B * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = OPXfSBeufaJ8;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                ZbWwgt3aGe7A(i9, i4);
                Object[] objArr2 = this.TSizfFm2Yiuu;
                int i10 = this.OPXfSBeufaJ8;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.OPXfSBeufaJ8 = i10;
            }
            this.QrzZRwfaDlRX = 0;
            i2 = i4 + 1;
            this.VhhvGxCb8gfr = i4;
            this.EcgxDIVH5in8 = i2;
            if (i3 >= 0) {
                Pf0ThKz3j5YS(i3);
            }
        } else {
            this.gPXPFXrUH4XX.TSizfFm2Yiuu(i3);
            this.BRwzKIf41E4i.TSizfFm2Yiuu((QrzZRwfaDlRX() - this.rtx2ld2ELZv4) - this.S9EYkSpbGuxq);
            int i11 = this.EcgxDIVH5in8;
            int XL4ISE6Oc65B2 = XL4ISE6Oc65B(i11);
            hp.Companion.getClass();
            if (!cs0.wdg6QnbFHrFF(obj2, jx1Var)) {
                if (z) {
                    nxJAScVArhE9(this.EcgxDIVH5in8, obj2);
                } else {
                    wLFCmsViZrNT(obj2);
                }
            }
            this.OPXfSBeufaJ8 = amuv7NJvPxHu(this.lS5Rgt96tfkO, XL4ISE6Oc65B2);
            this.wdg6QnbFHrFF = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(this.EcgxDIVH5in8 + 1));
            int[] iArr2 = this.lS5Rgt96tfkO;
            int i12 = XL4ISE6Oc65B2 * 5;
            this.QrzZRwfaDlRX = iArr2[i12 + 1] & 67108863;
            this.VhhvGxCb8gfr = i11;
            this.EcgxDIVH5in8 = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.S9EYkSpbGuxq = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.lS5Rgt96tfkO;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.na.PsecLrZVVK61(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.na.PsecLrZVVK61(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jyegZNwi31qc(int i) {
        nf0 nf0Var;
        int i2;
        nf0 nf0Var2;
        int i3;
        int i4;
        int i5 = this.rtx2ld2ELZv4;
        int i6 = this.RAsUl2FVSrh6;
        if (i6 != i) {
            if (!this.Y1f8riQaR6yg.isEmpty()) {
                int QrzZRwfaDlRX = QrzZRwfaDlRX() - this.rtx2ld2ELZv4;
                ArrayList arrayList = this.Y1f8riQaR6yg;
                if (i6 < i) {
                    for (int PxuCJdSBwIXG = c72.PxuCJdSBwIXG(arrayList, i6, QrzZRwfaDlRX); PxuCJdSBwIXG < this.Y1f8riQaR6yg.size() && (i3 = (nf0Var2 = (nf0) this.Y1f8riQaR6yg.get(PxuCJdSBwIXG)).PxuCJdSBwIXG) < 0 && (i4 = i3 + QrzZRwfaDlRX) < i; PxuCJdSBwIXG++) {
                        nf0Var2.PxuCJdSBwIXG = i4;
                    }
                } else {
                    for (int PxuCJdSBwIXG2 = c72.PxuCJdSBwIXG(arrayList, i, QrzZRwfaDlRX); PxuCJdSBwIXG2 < this.Y1f8riQaR6yg.size() && (i2 = (nf0Var = (nf0) this.Y1f8riQaR6yg.get(PxuCJdSBwIXG2)).PxuCJdSBwIXG) >= 0; PxuCJdSBwIXG2++) {
                        nf0Var.PxuCJdSBwIXG = -(QrzZRwfaDlRX - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int QrzZRwfaDlRX2 = QrzZRwfaDlRX();
            if (i6 >= QrzZRwfaDlRX2) {
                mp.PxuCJdSBwIXG("Check failed");
            }
            while (i6 < QrzZRwfaDlRX2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.lS5Rgt96tfkO[i7];
                int gPXPFXrUH4XX = i8 > -2 ? i8 : (gPXPFXrUH4XX() + i8) - (-2);
                if (gPXPFXrUH4XX >= i) {
                    gPXPFXrUH4XX = -((gPXPFXrUH4XX() - gPXPFXrUH4XX) - (-2));
                }
                if (gPXPFXrUH4XX != i8) {
                    this.lS5Rgt96tfkO[i7] = gPXPFXrUH4XX;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.RAsUl2FVSrh6 = i;
    }

    public final Object kpCQ9veP6n3I(int i) {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(i);
        int[] iArr = this.lS5Rgt96tfkO;
        if ((iArr[(XL4ISE6Oc65B * 5) + 1] & 1073741824) != 0) {
            return this.TSizfFm2Yiuu[rtx2ld2ELZv4(RAsUl2FVSrh6(iArr, XL4ISE6Oc65B))];
        }
        return null;
    }

    public final nf0 lS5Rgt96tfkO(int i) {
        ArrayList arrayList = this.Y1f8riQaR6yg;
        int e9gEMXR7LXtO = c72.e9gEMXR7LXtO(arrayList, i, gPXPFXrUH4XX());
        if (e9gEMXR7LXtO >= 0) {
            return (nf0) arrayList.get(e9gEMXR7LXtO);
        }
        if (i > this.RAsUl2FVSrh6) {
            i = -(gPXPFXrUH4XX() - i);
        }
        nf0 nf0Var = new nf0(i);
        arrayList.add(-(e9gEMXR7LXtO + 1), nf0Var);
        return nf0Var;
    }

    public final int nLZGh9p8gVSu() {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(this.EcgxDIVH5in8);
        int i = this.EcgxDIVH5in8;
        int[] iArr = this.lS5Rgt96tfkO;
        int i2 = XL4ISE6Oc65B * 5;
        int i3 = iArr[i2 + 3] + i;
        this.EcgxDIVH5in8 = i3;
        this.OPXfSBeufaJ8 = RAsUl2FVSrh6(iArr, XL4ISE6Oc65B(i3));
        int i4 = this.lS5Rgt96tfkO[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void nxJAScVArhE9(int i, Object obj) {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(i);
        int[] iArr = this.lS5Rgt96tfkO;
        if (XL4ISE6Oc65B >= iArr.length || (iArr[(XL4ISE6Oc65B * 5) + 1] & 1073741824) == 0) {
            mp.PxuCJdSBwIXG("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.TSizfFm2Yiuu[rtx2ld2ELZv4(RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B))] = obj;
    }

    public final void ozEBbv0hFTAB() {
        int i;
        b81 b81Var = this.ZbWwgt3aGe7A;
        if (b81Var != null) {
            while (b81Var.lS5Rgt96tfkO != 0) {
                int nxJAScVArhE9 = vi0.nxJAScVArhE9(b81Var);
                int XL4ISE6Oc65B = XL4ISE6Oc65B(nxJAScVArhE9);
                int i2 = nxJAScVArhE9 + 1;
                int S9EYkSpbGuxq = S9EYkSpbGuxq(nxJAScVArhE9) + nxJAScVArhE9;
                while (true) {
                    if (i2 >= S9EYkSpbGuxq) {
                        i = 0;
                        break;
                    } else {
                        if ((this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += S9EYkSpbGuxq(i2);
                    }
                }
                int[] iArr = this.lS5Rgt96tfkO;
                int i3 = (XL4ISE6Oc65B * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int rZjpSjn4zoMv = rZjpSjn4zoMv(iArr, nxJAScVArhE9);
                    if (rZjpSjn4zoMv >= 0) {
                        vi0.rtx2ld2ELZv4(b81Var, rZjpSjn4zoMv);
                    }
                }
            }
        }
    }

    public final boolean pnx5pC0XzaCw(int i) {
        return (this.lS5Rgt96tfkO[(XL4ISE6Oc65B(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Index must be between 0 and size");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r3s1LDPKFs1S(int i, pe0 pe0Var) {
        int i2;
        int i3;
        int i4;
        pe0 pe0Var2 = pe0Var;
        int rZjpSjn4zoMv = rZjpSjn4zoMv(this.lS5Rgt96tfkO, i);
        int gPXPFXrUH4XX = gPXPFXrUH4XX();
        int S9EYkSpbGuxq = S9EYkSpbGuxq(i) + i;
        int i5 = i;
        d81 d81Var = null;
        b81 b81Var = null;
        loop0: while (i5 < S9EYkSpbGuxq) {
            int a92UlCVFR9N8 = a92UlCVFR9N8(i5);
            int i6 = i5 + 1;
            int a92UlCVFR9N82 = a92UlCVFR9N8(i6);
            while (a92UlCVFR9N8 < a92UlCVFR9N82) {
                Object obj = this.TSizfFm2Yiuu[rtx2ld2ELZv4(a92UlCVFR9N8)];
                if (obj instanceof yf0) {
                    yf0 yf0Var = (yf0) obj;
                    if (!(yf0Var instanceof yf0)) {
                        yf0Var = null;
                    }
                    if (yf0Var == null) {
                        mp.lS5Rgt96tfkO("Inconsistent composition");
                        u9.Y1f8riQaR6yg();
                        return;
                    }
                    int i7 = yf0Var.lS5Rgt96tfkO;
                    if (i7 >= 0) {
                        int S9EYkSpbGuxq2 = S9EYkSpbGuxq(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < S9EYkSpbGuxq2 && i9 < i7) {
                            int XL4ISE6Oc65B = XL4ISE6Oc65B(i8);
                            int i10 = rZjpSjn4zoMv;
                            int[] iArr = this.lS5Rgt96tfkO;
                            int i11 = XL4ISE6Oc65B * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < S9EYkSpbGuxq2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            rZjpSjn4zoMv = i10;
                        }
                        i4 = rZjpSjn4zoMv;
                        if (d81Var == null) {
                            int[] iArr2 = gr0.PxuCJdSBwIXG;
                            d81Var = new d81();
                        }
                        if (b81Var == null) {
                            b81Var = new b81();
                        }
                        d81Var.PxuCJdSBwIXG(i8);
                        b81Var.PxuCJdSBwIXG(i8);
                        b81Var.PxuCJdSBwIXG(a92UlCVFR9N8);
                        a92UlCVFR9N8++;
                        rZjpSjn4zoMv = i4;
                    }
                }
                i4 = rZjpSjn4zoMv;
                pe0Var2.rtx2ld2ELZv4(Integer.valueOf(a92UlCVFR9N8), obj);
                a92UlCVFR9N8++;
                rZjpSjn4zoMv = i4;
            }
            int i12 = rZjpSjn4zoMv;
            rZjpSjn4zoMv = i6 < gPXPFXrUH4XX ? rZjpSjn4zoMv(this.lS5Rgt96tfkO, i6) : -1;
            if (rZjpSjn4zoMv != i5) {
                int i13 = i12;
                while (true) {
                    if (b81Var == null || d81Var == null || !d81Var.e9gEMXR7LXtO(i5)) {
                        i2 = gPXPFXrUH4XX;
                    } else {
                        int i14 = b81Var.lS5Rgt96tfkO;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = gPXPFXrUH4XX;
                            int lS5Rgt96tfkO = b81Var.lS5Rgt96tfkO(i18);
                            if (lS5Rgt96tfkO == i5) {
                                int lS5Rgt96tfkO2 = b81Var.lS5Rgt96tfkO(i18 + 1);
                                pe0Var2.rtx2ld2ELZv4(Integer.valueOf(lS5Rgt96tfkO2), this.TSizfFm2Yiuu[rtx2ld2ELZv4(lS5Rgt96tfkO2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                b81Var.e9gEMXR7LXtO(i17, lS5Rgt96tfkO);
                                i17 += 2;
                                b81Var.e9gEMXR7LXtO(i20, b81Var.lS5Rgt96tfkO(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            pe0Var2 = pe0Var;
                            gPXPFXrUH4XX = i19;
                        }
                        i2 = gPXPFXrUH4XX;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = b81Var.lS5Rgt96tfkO) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                u9.XL4ISE6Oc65B("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = b81Var.PxuCJdSBwIXG;
                                    na.PsecLrZVVK61(iArr3, iArr3, i17, i14, i3);
                                }
                                b81Var.lS5Rgt96tfkO -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != rZjpSjn4zoMv) {
                        i5 = i13;
                        gPXPFXrUH4XX = i2;
                        i13 = rZjpSjn4zoMv(this.lS5Rgt96tfkO, i13);
                        pe0Var2 = pe0Var;
                    }
                }
            } else {
                i2 = gPXPFXrUH4XX;
            }
            pe0Var2 = pe0Var;
            i5 = i6;
            gPXPFXrUH4XX = i2;
        }
    }

    public final int rZjpSjn4zoMv(int[] iArr, int i) {
        int i2 = iArr[(XL4ISE6Oc65B(i) * 5) + 2];
        return i2 > -2 ? i2 : (gPXPFXrUH4XX() + i2) - (-2);
    }

    public final int rtx2ld2ELZv4(int i) {
        return (this.x50lh2ztY7Y5 * (i < this.dgRBjINgWbAK ? 0 : 1)) + i;
    }

    public final void ryVscX7ZL4Ux() {
        int i = this.S9EYkSpbGuxq;
        this.EcgxDIVH5in8 = i;
        this.OPXfSBeufaJ8 = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i));
    }

    public final boolean tmVwIGCQF4zR() {
        if (this.r3s1LDPKFs1S != 0) {
            mp.PxuCJdSBwIXG("Cannot remove group while inserting");
        }
        int i = this.EcgxDIVH5in8;
        int i2 = this.OPXfSBeufaJ8;
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i));
        int nLZGh9p8gVSu = nLZGh9p8gVSu();
        Pf0ThKz3j5YS(this.VhhvGxCb8gfr);
        b81 b81Var = this.ZbWwgt3aGe7A;
        if (b81Var != null) {
            while (true) {
                int i3 = b81Var.lS5Rgt96tfkO;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    rc1.RAsUl2FVSrh6("IntList is empty.");
                    return false;
                }
                if (b81Var.PxuCJdSBwIXG[0] < i) {
                    break;
                }
                vi0.nxJAScVArhE9(b81Var);
            }
        }
        boolean J54yh1s3n4Aq = J54yh1s3n4Aq(i, this.EcgxDIVH5in8 - i);
        EpkonXwzFgDB(RAsUl2FVSrh6, this.OPXfSBeufaJ8 - RAsUl2FVSrh6, i - 1);
        this.EcgxDIVH5in8 = i;
        this.OPXfSBeufaJ8 = i2;
        this.QrzZRwfaDlRX -= nLZGh9p8gVSu;
        return J54yh1s3n4Aq;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.EcgxDIVH5in8 + " end=" + this.S9EYkSpbGuxq + " size = " + gPXPFXrUH4XX() + " gap=" + this.RAsUl2FVSrh6 + '-' + (this.RAsUl2FVSrh6 + this.rtx2ld2ELZv4) + ')';
    }

    public final void wLFCmsViZrNT(Object obj) {
        int XL4ISE6Oc65B = XL4ISE6Oc65B(this.EcgxDIVH5in8);
        int i = (XL4ISE6Oc65B * 5) + 1;
        if ((this.lS5Rgt96tfkO[i] & 268435456) == 0) {
            mp.PxuCJdSBwIXG("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.TSizfFm2Yiuu;
        int[] iArr = this.lS5Rgt96tfkO;
        objArr[rtx2ld2ELZv4(Integer.bitCount(iArr[i] >> 29) + RAsUl2FVSrh6(iArr, XL4ISE6Oc65B))] = obj;
    }

    public final void wdg6QnbFHrFF() {
        p81 p81Var;
        boolean z = this.r3s1LDPKFs1S > 0;
        int i = this.EcgxDIVH5in8;
        int i2 = this.S9EYkSpbGuxq;
        int i3 = this.VhhvGxCb8gfr;
        int XL4ISE6Oc65B = XL4ISE6Oc65B(i3);
        int i4 = this.QrzZRwfaDlRX;
        int i5 = i - i3;
        int i6 = XL4ISE6Oc65B * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.lS5Rgt96tfkO[i7] & 1073741824) != 0;
        jr0 jr0Var = this.XL4ISE6Oc65B;
        if (z) {
            c81 c81Var = this.RfyTYNmI9Srp;
            if (c81Var != null && (p81Var = (p81) c81Var.lS5Rgt96tfkO(i3)) != null) {
                Object[] objArr = p81Var.PxuCJdSBwIXG;
                int i8 = p81Var.lS5Rgt96tfkO;
                for (int i9 = 0; i9 < i8; i9++) {
                    BjEWd04qc7Mw(objArr[i9]);
                }
            }
            int[] iArr = this.lS5Rgt96tfkO;
            iArr[i6 + 3] = i5;
            c72.TSizfFm2Yiuu(iArr, XL4ISE6Oc65B, i4);
            int lS5Rgt96tfkO = jr0Var.lS5Rgt96tfkO();
            if (z2) {
                i4 = 1;
            }
            this.QrzZRwfaDlRX = lS5Rgt96tfkO + i4;
            int rZjpSjn4zoMv = rZjpSjn4zoMv(this.lS5Rgt96tfkO, i3);
            this.VhhvGxCb8gfr = rZjpSjn4zoMv;
            int gPXPFXrUH4XX = rZjpSjn4zoMv < 0 ? gPXPFXrUH4XX() : XL4ISE6Oc65B(rZjpSjn4zoMv + 1);
            int RAsUl2FVSrh6 = gPXPFXrUH4XX >= 0 ? RAsUl2FVSrh6(this.lS5Rgt96tfkO, gPXPFXrUH4XX) : 0;
            this.OPXfSBeufaJ8 = RAsUl2FVSrh6;
            this.wdg6QnbFHrFF = RAsUl2FVSrh6;
            return;
        }
        if (i != i2) {
            mp.PxuCJdSBwIXG("Expected to be at the end of a group");
        }
        int[] iArr2 = this.lS5Rgt96tfkO;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        c72.TSizfFm2Yiuu(iArr2, XL4ISE6Oc65B, i4);
        int lS5Rgt96tfkO2 = this.gPXPFXrUH4XX.lS5Rgt96tfkO();
        this.S9EYkSpbGuxq = (QrzZRwfaDlRX() - this.rtx2ld2ELZv4) - this.BRwzKIf41E4i.lS5Rgt96tfkO();
        this.VhhvGxCb8gfr = lS5Rgt96tfkO2;
        int rZjpSjn4zoMv2 = rZjpSjn4zoMv(this.lS5Rgt96tfkO, i3);
        int lS5Rgt96tfkO3 = jr0Var.lS5Rgt96tfkO();
        this.QrzZRwfaDlRX = lS5Rgt96tfkO3;
        if (rZjpSjn4zoMv2 == lS5Rgt96tfkO2) {
            this.QrzZRwfaDlRX = lS5Rgt96tfkO3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (rZjpSjn4zoMv2 != 0 && rZjpSjn4zoMv2 != lS5Rgt96tfkO2 && (i14 != 0 || i13 != 0)) {
                int XL4ISE6Oc65B2 = XL4ISE6Oc65B(rZjpSjn4zoMv2);
                if (i13 != 0) {
                    int[] iArr3 = this.lS5Rgt96tfkO;
                    int i15 = (XL4ISE6Oc65B2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.lS5Rgt96tfkO;
                    c72.TSizfFm2Yiuu(iArr4, XL4ISE6Oc65B2, (iArr4[(XL4ISE6Oc65B2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.lS5Rgt96tfkO;
                if ((iArr5[(XL4ISE6Oc65B2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                rZjpSjn4zoMv2 = rZjpSjn4zoMv(iArr5, rZjpSjn4zoMv2);
            }
        }
        this.QrzZRwfaDlRX += i14;
    }

    public final void x50lh2ztY7Y5(int i) {
        boolean z = false;
        if (!(this.r3s1LDPKFs1S <= 0)) {
            mp.PxuCJdSBwIXG("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.VhhvGxCb8gfr;
        if (i2 != i) {
            if (i >= i2 && i < this.S9EYkSpbGuxq) {
                z = true;
            }
            if (!z) {
                mp.PxuCJdSBwIXG("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.EcgxDIVH5in8;
            int i4 = this.OPXfSBeufaJ8;
            int i5 = this.wdg6QnbFHrFF;
            this.EcgxDIVH5in8 = i;
            gGoUzNp9JO5I();
            this.EcgxDIVH5in8 = i3;
            this.OPXfSBeufaJ8 = i4;
            this.wdg6QnbFHrFF = i5;
        }
    }

    public final void xbgXKYA2cIfu(int i) {
        if (i >= 0) {
            b81 b81Var = this.ZbWwgt3aGe7A;
            if (b81Var == null) {
                b81Var = new b81();
                this.ZbWwgt3aGe7A = b81Var;
            }
            vi0.rtx2ld2ELZv4(b81Var, i);
        }
    }

    public final Object xfACYKDMU6Dj(int i, int i2, Object obj) {
        int amuv7NJvPxHu = amuv7NJvPxHu(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i));
        int RAsUl2FVSrh6 = RAsUl2FVSrh6(this.lS5Rgt96tfkO, XL4ISE6Oc65B(i + 1));
        int i3 = amuv7NJvPxHu + i2;
        if (i3 < amuv7NJvPxHu || i3 >= RAsUl2FVSrh6) {
            mp.PxuCJdSBwIXG("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int rtx2ld2ELZv4 = rtx2ld2ELZv4(i3);
        Object[] objArr = this.TSizfFm2Yiuu;
        Object obj2 = objArr[rtx2ld2ELZv4];
        objArr[rtx2ld2ELZv4] = obj;
        return obj2;
    }

    public final nf0 zf8DYfih6EZu(int i) {
        ArrayList arrayList;
        int e9gEMXR7LXtO;
        if (i < 0 || i >= gPXPFXrUH4XX() || (e9gEMXR7LXtO = c72.e9gEMXR7LXtO((arrayList = this.Y1f8riQaR6yg), i, gPXPFXrUH4XX())) < 0) {
            return null;
        }
        return (nf0) arrayList.get(e9gEMXR7LXtO);
    }
}
