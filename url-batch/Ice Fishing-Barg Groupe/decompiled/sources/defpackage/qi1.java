package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qi1 {
    public j4 PxuCJdSBwIXG;
    public float TSizfFm2Yiuu = 1.0f;
    public cw0 Y1f8riQaR6yg = cw0.rtx2ld2ELZv4;
    public jl lS5Rgt96tfkO;

    public abstract void PxuCJdSBwIXG(float f);

    public final void TSizfFm2Yiuu(xw0 xw0Var, long j, float f, jl jlVar) {
        ji jiVar = xw0Var.rtx2ld2ELZv4;
        if (this.TSizfFm2Yiuu != f) {
            PxuCJdSBwIXG(f);
            this.TSizfFm2Yiuu = f;
        }
        if (!cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, jlVar)) {
            lS5Rgt96tfkO(jlVar);
            this.lS5Rgt96tfkO = jlVar;
        }
        cw0 layoutDirection = xw0Var.getLayoutDirection();
        if (this.Y1f8riQaR6yg != layoutDirection) {
            this.Y1f8riQaR6yg = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).RAsUl2FVSrh6(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e9gEMXR7LXtO(xw0Var);
                }
            } finally {
                ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).RAsUl2FVSrh6(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long Y1f8riQaR6yg();

    public abstract void e9gEMXR7LXtO(xw0 xw0Var);

    public abstract void lS5Rgt96tfkO(jl jlVar);
}
