package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mu0 {
    public xu1 a;
    public float b = 1.0f;
    public vc0 c = vc0.d;

    public abstract void a(float f);

    public final void b(ld0 ld0Var, long j, float f) {
        zf zfVar = ld0Var.d;
        if (this.b != f) {
            a(f);
            this.b = f;
        }
        vc0 layoutDirection = ld0Var.getLayoutDirection();
        if (this.c != layoutDirection) {
            this.c = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (zfVar.x() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (zfVar.x() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((s40) zfVar.e.e).t(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    d(ld0Var);
                }
            } finally {
                ((s40) zfVar.e.e).t(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long c();

    public abstract void d(hu huVar);
}
