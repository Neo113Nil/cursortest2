package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z62 {
    public int OPXfSBeufaJ8;
    public final a72 PxuCJdSBwIXG;
    public int RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public Object[] Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public int cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final int e9gEMXR7LXtO;
    public final int[] lS5Rgt96tfkO;
    public boolean r3s1LDPKFs1S;
    public int rtx2ld2ELZv4;
    public final jr0 wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public z62(a72 a72Var) {
        this.PxuCJdSBwIXG = a72Var;
        this.lS5Rgt96tfkO = a72Var.rtx2ld2ELZv4;
        int i = a72Var.OPXfSBeufaJ8;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = a72Var.wdg6QnbFHrFF;
        this.e9gEMXR7LXtO = a72Var.dgRBjINgWbAK;
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = -1;
        this.wdg6QnbFHrFF = new jr0();
    }

    public final int BRwzKIf41E4i(int i) {
        return this.lS5Rgt96tfkO[(i * 5) + 2];
    }

    public final void EcgxDIVH5in8() {
        if (!(this.dgRBjINgWbAK == 0)) {
            mp.PxuCJdSBwIXG("Cannot skip the enclosing group while in an empty region");
        }
        this.RAsUl2FVSrh6 = this.rtx2ld2ELZv4;
        this.x50lh2ztY7Y5 = 0;
        this.cpQdD2nAriOS = 0;
    }

    public final int OPXfSBeufaJ8(int i) {
        return this.lS5Rgt96tfkO[i * 5];
    }

    public final nf0 PxuCJdSBwIXG(int i) {
        ArrayList arrayList = this.PxuCJdSBwIXG.gPXPFXrUH4XX;
        int e9gEMXR7LXtO = c72.e9gEMXR7LXtO(arrayList, i, this.TSizfFm2Yiuu);
        if (e9gEMXR7LXtO >= 0) {
            return (nf0) arrayList.get(e9gEMXR7LXtO);
        }
        nf0 nf0Var = new nf0(i);
        arrayList.add(-(e9gEMXR7LXtO + 1), nf0Var);
        return nf0Var;
    }

    public final int QrzZRwfaDlRX(int i) {
        return this.lS5Rgt96tfkO[(i * 5) + 1] & 67108863;
    }

    public final int RAsUl2FVSrh6() {
        int i = this.RAsUl2FVSrh6;
        if (i >= this.rtx2ld2ELZv4) {
            return 0;
        }
        return this.lS5Rgt96tfkO[i * 5];
    }

    public final int RfyTYNmI9Srp() {
        if (this.dgRBjINgWbAK != 0) {
            mp.PxuCJdSBwIXG("Cannot skip while in an empty region");
        }
        int i = this.RAsUl2FVSrh6;
        int i2 = i * 5;
        int[] iArr = this.lS5Rgt96tfkO;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.RAsUl2FVSrh6 = iArr[i2 + 3] + i;
        return i4;
    }

    public final void S9EYkSpbGuxq() {
        if (this.dgRBjINgWbAK <= 0) {
            int i = this.OPXfSBeufaJ8;
            int i2 = this.RAsUl2FVSrh6;
            int i3 = i2 * 5;
            int[] iArr = this.lS5Rgt96tfkO;
            if (iArr[i3 + 2] != i) {
                gp1.PxuCJdSBwIXG("Invalid slot table detected");
            }
            int i4 = this.x50lh2ztY7Y5;
            int i5 = this.cpQdD2nAriOS;
            jr0 jr0Var = this.wdg6QnbFHrFF;
            if (i4 == 0 && i5 == 0) {
                jr0Var.TSizfFm2Yiuu(-1);
            } else {
                jr0Var.TSizfFm2Yiuu(i4);
            }
            this.OPXfSBeufaJ8 = i2;
            this.rtx2ld2ELZv4 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.RAsUl2FVSrh6 = i6;
            this.x50lh2ztY7Y5 = c72.lS5Rgt96tfkO(iArr, i2);
            this.cpQdD2nAriOS = i2 >= this.TSizfFm2Yiuu + (-1) ? this.e9gEMXR7LXtO : iArr[(i6 * 5) + 4];
        }
    }

    public final void TSizfFm2Yiuu() {
        this.a92UlCVFR9N8 = true;
        if (this.PxuCJdSBwIXG.x50lh2ztY7Y5 <= 0) {
            mp.PxuCJdSBwIXG("Unexpected reader close()");
        }
        r0.x50lh2ztY7Y5--;
        this.Y1f8riQaR6yg = new Object[0];
    }

    public final void XL4ISE6Oc65B(int i) {
        if (this.dgRBjINgWbAK != 0) {
            mp.PxuCJdSBwIXG("Cannot reposition while in an empty region");
        }
        this.RAsUl2FVSrh6 = i;
        int[] iArr = this.lS5Rgt96tfkO;
        int i2 = this.TSizfFm2Yiuu;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.OPXfSBeufaJ8) {
            this.OPXfSBeufaJ8 = i3;
            if (i3 < 0) {
                this.rtx2ld2ELZv4 = i2;
            } else {
                this.rtx2ld2ELZv4 = iArr[(i3 * 5) + 3] + i3;
            }
            this.x50lh2ztY7Y5 = 0;
            this.cpQdD2nAriOS = 0;
        }
    }

    public final boolean Y1f8riQaR6yg(int i) {
        return (this.lS5Rgt96tfkO[(i * 5) + 1] & 67108864) != 0;
    }

    public final Object a92UlCVFR9N8() {
        int i = this.RAsUl2FVSrh6;
        if (i < this.rtx2ld2ELZv4) {
            return lS5Rgt96tfkO(this.lS5Rgt96tfkO, i);
        }
        return 0;
    }

    public final Object cpQdD2nAriOS() {
        int i;
        if (this.dgRBjINgWbAK > 0 || (i = this.x50lh2ztY7Y5) >= this.cpQdD2nAriOS) {
            this.r3s1LDPKFs1S = false;
            hp.Companion.getClass();
            return fp.lS5Rgt96tfkO;
        }
        this.r3s1LDPKFs1S = true;
        Object[] objArr = this.Y1f8riQaR6yg;
        this.x50lh2ztY7Y5 = i + 1;
        return objArr[i];
    }

    public final boolean dgRBjINgWbAK(int i) {
        return (this.lS5Rgt96tfkO[(i * 5) + 1] & 536870912) != 0;
    }

    public final void e9gEMXR7LXtO() {
        if (this.dgRBjINgWbAK == 0) {
            if (this.RAsUl2FVSrh6 != this.rtx2ld2ELZv4) {
                mp.PxuCJdSBwIXG("endGroup() not called at the end of a group");
            }
            int i = (this.OPXfSBeufaJ8 * 5) + 2;
            int[] iArr = this.lS5Rgt96tfkO;
            int i2 = iArr[i];
            this.OPXfSBeufaJ8 = i2;
            int i3 = this.TSizfFm2Yiuu;
            this.rtx2ld2ELZv4 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int lS5Rgt96tfkO = this.wdg6QnbFHrFF.lS5Rgt96tfkO();
            if (lS5Rgt96tfkO < 0) {
                this.x50lh2ztY7Y5 = 0;
                this.cpQdD2nAriOS = 0;
            } else {
                this.x50lh2ztY7Y5 = lS5Rgt96tfkO;
                this.cpQdD2nAriOS = i2 >= i3 + (-1) ? this.e9gEMXR7LXtO : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object gPXPFXrUH4XX(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.Y1f8riQaR6yg[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final Object lS5Rgt96tfkO(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.Y1f8riQaR6yg[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        hp.Companion.getClass();
        return fp.lS5Rgt96tfkO;
    }

    public final Object r3s1LDPKFs1S(int i) {
        int i2 = i * 5;
        int[] iArr = this.lS5Rgt96tfkO;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 == 0) {
            return null;
        }
        if (i3 != 0) {
            return this.Y1f8riQaR6yg[iArr[i2 + 4]];
        }
        hp.Companion.getClass();
        return fp.lS5Rgt96tfkO;
    }

    public final Object rtx2ld2ELZv4(int i, int i2) {
        int[] iArr = this.lS5Rgt96tfkO;
        int lS5Rgt96tfkO = c72.lS5Rgt96tfkO(iArr, i);
        int i3 = i + 1;
        int i4 = lS5Rgt96tfkO + i2;
        if (i4 < (i3 < this.TSizfFm2Yiuu ? iArr[(i3 * 5) + 4] : this.e9gEMXR7LXtO)) {
            return this.Y1f8riQaR6yg[i4];
        }
        hp.Companion.getClass();
        return fp.lS5Rgt96tfkO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append(", key=");
        sb.append(RAsUl2FVSrh6());
        sb.append(", parent=");
        sb.append(this.OPXfSBeufaJ8);
        sb.append(", end=");
        return o0.r3s1LDPKFs1S(sb, this.rtx2ld2ELZv4, ')');
    }

    public final boolean wdg6QnbFHrFF(int i) {
        return (this.lS5Rgt96tfkO[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean x50lh2ztY7Y5(int i) {
        return (this.lS5Rgt96tfkO[(i * 5) + 1] & 1073741824) != 0;
    }
}
