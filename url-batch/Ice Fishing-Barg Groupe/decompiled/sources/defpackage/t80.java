package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t80 implements m80 {
    public final int PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final z30 lS5Rgt96tfkO;

    public t80(int i, int i2, z30 z30Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z30Var;
        this.TSizfFm2Yiuu = i * 1000000;
        this.Y1f8riQaR6yg = i2 * 1000000;
    }

    @Override // defpackage.m80
    public final float TSizfFm2Yiuu(long j, float f, float f2, float f3) {
        long j2 = j - this.Y1f8riQaR6yg;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.TSizfFm2Yiuu;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (lS5Rgt96tfkO(j4, f, f2, f3) - lS5Rgt96tfkO(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.m80
    public final long Y1f8riQaR6yg(float f, float f2, float f3) {
        return this.Y1f8riQaR6yg + this.TSizfFm2Yiuu;
    }

    @Override // defpackage.m80
    public final float lS5Rgt96tfkO(long j, float f, float f2, float f3) {
        long j2 = j - this.Y1f8riQaR6yg;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.TSizfFm2Yiuu;
        if (j2 > j3) {
            j2 = j3;
        }
        float lS5Rgt96tfkO = this.lS5Rgt96tfkO.lS5Rgt96tfkO(this.PxuCJdSBwIXG == 0 ? 1.0f : j2 / j3);
        return (f2 * lS5Rgt96tfkO) + ((1.0f - lS5Rgt96tfkO) * f);
    }
}
