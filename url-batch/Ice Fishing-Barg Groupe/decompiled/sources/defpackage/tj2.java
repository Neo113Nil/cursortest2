package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tj2 {
    public final int PxuCJdSBwIXG;
    public long RAsUl2FVSrh6 = Long.MIN_VALUE;
    public final e9gEMXR7LXtO TSizfFm2Yiuu;
    public tj2 Y1f8riQaR6yg;
    public long a92UlCVFR9N8;
    public long e9gEMXR7LXtO;
    public final tb lS5Rgt96tfkO;
    public final /* synthetic */ uj2 rtx2ld2ELZv4;

    public tj2(uj2 uj2Var, int i, tb tbVar, e9gEMXR7LXtO e9gemxr7lxto) {
        this.rtx2ld2ELZv4 = uj2Var;
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = tbVar;
        this.TSizfFm2Yiuu = e9gemxr7lxto;
    }

    public final void PxuCJdSBwIXG(long j, long j2, long j3, long j4, float[] fArr) {
        hu1 hu1Var;
        hu1 hu1Var2;
        long j5 = this.rtx2ld2ELZv4.a92UlCVFR9N8;
        tb tbVar = this.lS5Rgt96tfkO;
        pd1 POWyO8hTM6YC = zv.POWyO8hTM6YC(tbVar, 2);
        vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(tbVar);
        boolean EpkonXwzFgDB = zf8DYfih6EZu.EpkonXwzFgDB();
        kd1 kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu;
        if (EpkonXwzFgDB) {
            if (kd1Var.Y1f8riQaR6yg != POWyO8hTM6YC) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = POWyO8hTM6YC.wdg6QnbFHrFF;
                pd1 pd1Var = kd1Var.Y1f8riQaR6yg;
                pd1Var.getClass();
                hu1Var = new hu1(vi0.wLFCmsViZrNT(pd1Var.BjEWd04qc7Mw(POWyO8hTM6YC, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, tbVar);
            } else {
                hu1Var = new hu1(j, j2, j3, j4, j5, fArr, tbVar);
            }
            hu1Var2 = hu1Var;
        } else {
            hu1Var2 = null;
        }
        if (hu1Var2 == null) {
            return;
        }
        this.TSizfFm2Yiuu.OPXfSBeufaJ8(hu1Var2);
    }

    public final void lS5Rgt96tfkO() {
        uj2 uj2Var = this.rtx2ld2ELZv4;
        c81 c81Var = uj2Var.PxuCJdSBwIXG;
        int i = this.PxuCJdSBwIXG;
        tj2 tj2Var = (tj2) c81Var.RAsUl2FVSrh6(i);
        if (tj2Var != null) {
            if (tj2Var == this) {
                tj2 tj2Var2 = this.Y1f8riQaR6yg;
                this.Y1f8riQaR6yg = null;
                if (tj2Var2 == null) {
                    vw0 zf8DYfih6EZu = zv.zf8DYfih6EZu(this.lS5Rgt96tfkO.rtx2ld2ELZv4);
                    if (zf8DYfih6EZu.r3s1LDPKFs1S) {
                        ((r1) yw0.PxuCJdSBwIXG(zf8DYfih6EZu)).getRectManager().lS5Rgt96tfkO.e9gEMXR7LXtO(zf8DYfih6EZu.OPXfSBeufaJ8, false);
                        return;
                    }
                    return;
                }
                int Y1f8riQaR6yg = c81Var.Y1f8riQaR6yg(i);
                Object[] objArr = c81Var.TSizfFm2Yiuu;
                Object obj = objArr[Y1f8riQaR6yg];
                c81Var.lS5Rgt96tfkO[Y1f8riQaR6yg] = i;
                objArr[Y1f8riQaR6yg] = tj2Var2;
                return;
            }
            int Y1f8riQaR6yg2 = c81Var.Y1f8riQaR6yg(i);
            Object[] objArr2 = c81Var.TSizfFm2Yiuu;
            Object obj2 = objArr2[Y1f8riQaR6yg2];
            c81Var.lS5Rgt96tfkO[Y1f8riQaR6yg2] = i;
            objArr2[Y1f8riQaR6yg2] = tj2Var;
            while (true) {
                tj2 tj2Var3 = tj2Var.Y1f8riQaR6yg;
                if (tj2Var3 == null) {
                    break;
                }
                if (tj2Var3 == this) {
                    tj2Var.Y1f8riQaR6yg = this.Y1f8riQaR6yg;
                    this.Y1f8riQaR6yg = null;
                    return;
                }
                tj2Var = tj2Var3;
            }
        }
        tj2 tj2Var4 = uj2Var.lS5Rgt96tfkO;
        if (tj2Var4 == this) {
            uj2Var.lS5Rgt96tfkO = tj2Var4.Y1f8riQaR6yg;
            this.Y1f8riQaR6yg = null;
            return;
        }
        tj2 tj2Var5 = tj2Var4 != null ? tj2Var4.Y1f8riQaR6yg : null;
        while (true) {
            tj2 tj2Var6 = tj2Var4;
            tj2Var4 = tj2Var5;
            if (tj2Var4 == null) {
                return;
            }
            if (tj2Var4 == this) {
                if (tj2Var6 != null) {
                    tj2Var6.Y1f8riQaR6yg = tj2Var4.Y1f8riQaR6yg;
                }
                this.Y1f8riQaR6yg = null;
                return;
            }
            tj2Var5 = tj2Var4.Y1f8riQaR6yg;
        }
    }
}
