package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uj2 {
    public final c81 PxuCJdSBwIXG;
    public float[] RAsUl2FVSrh6;
    public long TSizfFm2Yiuu;
    public long Y1f8riQaR6yg;
    public long a92UlCVFR9N8;
    public long e9gEMXR7LXtO;
    public tj2 lS5Rgt96tfkO;

    public uj2() {
        c81 c81Var = uq0.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = new c81();
        this.TSizfFm2Yiuu = -1L;
        wq0.Companion.getClass();
        this.Y1f8riQaR6yg = 0L;
        this.e9gEMXR7LXtO = 0L;
    }

    public final void PxuCJdSBwIXG(tj2 tj2Var, long j, long j2, float[] fArr, long j3) {
        long j4 = tj2Var.RAsUl2FVSrh6;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            tj2Var.RAsUl2FVSrh6 = j3;
            tj2Var.PxuCJdSBwIXG(tj2Var.e9gEMXR7LXtO, tj2Var.a92UlCVFR9N8, j, j2, fArr);
        }
    }

    public final boolean lS5Rgt96tfkO(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (wq0.PxuCJdSBwIXG(j2, this.Y1f8riQaR6yg)) {
            z = false;
        } else {
            this.Y1f8riQaR6yg = j2;
            z = true;
        }
        if (!wq0.PxuCJdSBwIXG(j, this.e9gEMXR7LXtO)) {
            this.e9gEMXR7LXtO = j;
            z = true;
        }
        if (fArr != null) {
            this.RAsUl2FVSrh6 = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.a92UlCVFR9N8) {
            return z;
        }
        this.a92UlCVFR9N8 = j3;
        return true;
    }
}
