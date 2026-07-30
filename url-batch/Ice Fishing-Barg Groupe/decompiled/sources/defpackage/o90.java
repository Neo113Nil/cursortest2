package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o90 {
    public final v90 PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final long lS5Rgt96tfkO;

    public o90(v90 v90Var, long j, int i, int i2) {
        this.PxuCJdSBwIXG = v90Var;
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
    }

    public final b51 PxuCJdSBwIXG(n90 n90Var, boolean z, int i, int i2, int i3, int i4) {
        if (!n90Var.lS5Rgt96tfkO) {
            return null;
        }
        this.PxuCJdSBwIXG.getClass();
        return null;
    }

    public final n90 lS5Rgt96tfkO(boolean z, int i, long j, qq0 qq0Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (qq0Var == null) {
            return new n90(true, true);
        }
        long j2 = qq0Var.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new n90(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new n90(true, true) : new n90(true, lS5Rgt96tfkO(z, 0, qq0.PxuCJdSBwIXG(rr.rtx2ld2ELZv4(this.lS5Rgt96tfkO), (((int) (j & 4294967295L)) - this.Y1f8riQaR6yg) - i4), new qq0(qq0.PxuCJdSBwIXG(((int) (j2 >> 32)) - this.TSizfFm2Yiuu, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).lS5Rgt96tfkO);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new n90(false, false);
    }
}
