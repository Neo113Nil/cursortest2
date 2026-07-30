package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ez0 implements k51 {
    public final int BRwzKIf41E4i;
    public final hy OPXfSBeufaJ8;
    public final fz0 PxuCJdSBwIXG;
    public final th1 QrzZRwfaDlRX;
    public final boolean RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final int cpQdD2nAriOS;
    public final List dgRBjINgWbAK;
    public final k51 e9gEMXR7LXtO;
    public final int gPXPFXrUH4XX;
    public final int lS5Rgt96tfkO;
    public final int r3s1LDPKFs1S;
    public final ru rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    public ez0(fz0 fz0Var, int i, boolean z, float f, k51 k51Var, float f2, boolean z2, ru ruVar, hy hyVar, long j, List list, int i2, int i3, int i4, th1 th1Var, int i5, int i6) {
        this.PxuCJdSBwIXG = fz0Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = f;
        this.e9gEMXR7LXtO = k51Var;
        this.a92UlCVFR9N8 = f2;
        this.RAsUl2FVSrh6 = z2;
        this.rtx2ld2ELZv4 = ruVar;
        this.OPXfSBeufaJ8 = hyVar;
        this.wdg6QnbFHrFF = j;
        this.dgRBjINgWbAK = list;
        this.x50lh2ztY7Y5 = i2;
        this.cpQdD2nAriOS = i3;
        this.r3s1LDPKFs1S = i4;
        this.QrzZRwfaDlRX = th1Var;
        this.gPXPFXrUH4XX = i5;
        this.BRwzKIf41E4i = i6;
    }

    @Override // defpackage.k51
    public final Map PxuCJdSBwIXG() {
        return this.e9gEMXR7LXtO.PxuCJdSBwIXG();
    }

    public final long RAsUl2FVSrh6() {
        k51 k51Var = this.e9gEMXR7LXtO;
        return (k51Var.e9gEMXR7LXtO() << 32) | (k51Var.TSizfFm2Yiuu() & 4294967295L);
    }

    @Override // defpackage.k51
    public final int TSizfFm2Yiuu() {
        return this.e9gEMXR7LXtO.TSizfFm2Yiuu();
    }

    @Override // defpackage.k51
    public final le0 Y1f8riQaR6yg() {
        return this.e9gEMXR7LXtO.Y1f8riQaR6yg();
    }

    public final ez0 a92UlCVFR9N8(int i, boolean z) {
        fz0 fz0Var;
        if (this.RAsUl2FVSrh6) {
            return null;
        }
        List list = this.dgRBjINgWbAK;
        if (list.isEmpty() || (fz0Var = this.PxuCJdSBwIXG) == null) {
            return null;
        }
        int i2 = fz0Var.x50lh2ztY7Y5;
        int i3 = this.lS5Rgt96tfkO - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        fz0 fz0Var2 = (fz0) zk.MDTGUQSX7PXD(list);
        fz0 fz0Var3 = (fz0) zk.kRWHK87H9qm4(list);
        if (fz0Var2.r3s1LDPKFs1S || fz0Var3.r3s1LDPKFs1S) {
            return null;
        }
        int i4 = fz0Var2.wdg6QnbFHrFF;
        int i5 = this.cpQdD2nAriOS;
        int i6 = this.x50lh2ztY7Y5;
        if (i < 0) {
            if (Math.min((i4 + fz0Var2.x50lh2ztY7Y5) - i6, (fz0Var3.wdg6QnbFHrFF + fz0Var3.x50lh2ztY7Y5) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - fz0Var3.wdg6QnbFHrFF) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            fz0 fz0Var4 = (fz0) list.get(i7);
            fz0Var4.getClass();
            int[] iArr = fz0Var4.gPXPFXrUH4XX;
            if (!fz0Var4.r3s1LDPKFs1S) {
                fz0Var4.wdg6QnbFHrFF += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = fz0Var4.lS5Rgt96tfkO.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        o0.ZbWwgt3aGe7A(fz0Var4.OPXfSBeufaJ8.PxuCJdSBwIXG.RAsUl2FVSrh6(fz0Var4.RAsUl2FVSrh6));
                    }
                }
            }
        }
        return new ez0(this.PxuCJdSBwIXG, i3, this.TSizfFm2Yiuu || i > 0, i, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, list, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i);
    }

    @Override // defpackage.k51
    public final int e9gEMXR7LXtO() {
        return this.e9gEMXR7LXtO.e9gEMXR7LXtO();
    }

    @Override // defpackage.k51
    public final void lS5Rgt96tfkO() {
        this.e9gEMXR7LXtO.lS5Rgt96tfkO();
    }
}
