package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fz0 {
    public final ay0 OPXfSBeufaJ8;
    public final int PxuCJdSBwIXG;
    public int QrzZRwfaDlRX = Integer.MIN_VALUE;
    public final Object RAsUl2FVSrh6;
    public final nd TSizfFm2Yiuu;
    public final cw0 Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public final int cpQdD2nAriOS;
    public final int dgRBjINgWbAK;
    public final int e9gEMXR7LXtO;
    public final int[] gPXPFXrUH4XX;
    public final List lS5Rgt96tfkO;
    public boolean r3s1LDPKFs1S;
    public final Object rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    public fz0(int i, List list, nd ndVar, cw0 cw0Var, int i2, int i3, int i4, long j, Object obj, Object obj2, ay0 ay0Var, long j2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = list;
        this.TSizfFm2Yiuu = ndVar;
        this.Y1f8riQaR6yg = cw0Var;
        this.e9gEMXR7LXtO = i4;
        this.a92UlCVFR9N8 = j;
        this.RAsUl2FVSrh6 = obj;
        this.rtx2ld2ELZv4 = obj2;
        this.OPXfSBeufaJ8 = ay0Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            em1 em1Var = (em1) list.get(i7);
            i5 += em1Var.OPXfSBeufaJ8;
            i6 = Math.max(i6, em1Var.rtx2ld2ELZv4);
        }
        this.dgRBjINgWbAK = i5;
        int i8 = i5 + this.e9gEMXR7LXtO;
        this.x50lh2ztY7Y5 = i8 >= 0 ? i8 : 0;
        this.cpQdD2nAriOS = i6;
        this.gPXPFXrUH4XX = new int[this.lS5Rgt96tfkO.size() * 2];
    }

    public final long PxuCJdSBwIXG(int i) {
        if (i == 0 && this.lS5Rgt96tfkO.size() == 0) {
            return this.wdg6QnbFHrFF & 4294967295L;
        }
        int[] iArr = this.gPXPFXrUH4XX;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void TSizfFm2Yiuu(int i, int i2, int i3) {
        this.wdg6QnbFHrFF = i;
        this.QrzZRwfaDlRX = i3;
        List list = this.lS5Rgt96tfkO;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            em1 em1Var = (em1) list.get(i4);
            int i5 = i4 * 2;
            nd ndVar = this.TSizfFm2Yiuu;
            if (ndVar == null) {
                hp0.lS5Rgt96tfkO("null horizontalAlignment when isVertical == true");
                u9.Y1f8riQaR6yg();
                return;
            }
            int PxuCJdSBwIXG = ndVar.PxuCJdSBwIXG(em1Var.rtx2ld2ELZv4, i2, this.Y1f8riQaR6yg);
            int[] iArr = this.gPXPFXrUH4XX;
            iArr[i5] = PxuCJdSBwIXG;
            iArr[i5 + 1] = i;
            i += em1Var.OPXfSBeufaJ8;
        }
    }

    public final void lS5Rgt96tfkO(dm1 dm1Var) {
        gi1 gi1Var = gi1.r3s1LDPKFs1S;
        if (this.QrzZRwfaDlRX == Integer.MIN_VALUE) {
            hp0.PxuCJdSBwIXG("position() should be called first");
        }
        List list = this.lS5Rgt96tfkO;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            em1 em1Var = (em1) list.get(i);
            int i2 = em1Var.OPXfSBeufaJ8;
            long PxuCJdSBwIXG = PxuCJdSBwIXG(i);
            o0.ZbWwgt3aGe7A(this.OPXfSBeufaJ8.PxuCJdSBwIXG.RAsUl2FVSrh6(this.RAsUl2FVSrh6));
            long TSizfFm2Yiuu = wq0.TSizfFm2Yiuu(PxuCJdSBwIXG, this.a92UlCVFR9N8);
            int i3 = fm1.lS5Rgt96tfkO;
            dm1Var.getClass();
            dm1.PxuCJdSBwIXG(dm1Var, em1Var);
            em1Var.hVNtCUZb4tYH(wq0.TSizfFm2Yiuu(TSizfFm2Yiuu, em1Var.x50lh2ztY7Y5), 0.0f, gi1Var);
        }
    }
}
