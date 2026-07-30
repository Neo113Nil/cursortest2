package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface hu extends nr {
    static void R(hu huVar, t5 t5Var, long j, long j2, long j3, float f, md mdVar, int i, int i2) {
        long height = (i2 & 4) != 0 ? (t5Var.a.getHeight() & 4294967295L) | (t5Var.a.getWidth() << 32) : j;
        huVar.e(t5Var, 0L, height, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? height : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : mdVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void T(hu huVar, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = huVar.N();
        }
        huVar.j(f, j, j2);
    }

    static /* synthetic */ void V(hu huVar, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        huVar.I(j, j4, (i & 4) != 0 ? l0(huVar.x(), j4) : j3, uy.q, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void g0(hu huVar, long j, float f, float f2, long j2, long j3, ze1 ze1Var, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        huVar.d(j, f, f2, j4, (i & 32) != 0 ? l0(huVar.x(), j4) : j3, ze1Var);
    }

    static long l0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void m0(hu huVar, c6 c6Var, op opVar, float f, ze1 ze1Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        p4 p4Var = ze1Var;
        if ((i & 8) != 0) {
            p4Var = uy.q;
        }
        huVar.b0(c6Var, opVar, f2, p4Var, (i & 32) != 0 ? 3 : 0);
    }

    void I(long j, long j2, long j3, p4 p4Var, int i);

    void L(long j, long j2, long j3, float f, int i);

    default long N() {
        return t90.q(v().i());
    }

    void b0(c6 c6Var, op opVar, float f, p4 p4Var, int i);

    void d(long j, float f, float f2, long j2, long j3, ze1 ze1Var);

    void e(t5 t5Var, long j, long j2, long j3, long j4, float f, md mdVar, int i);

    vc0 getLayoutDirection();

    void j(float f, long j, long j2);

    void o(long j, long j2, long j3, long j4, p4 p4Var);

    void u(xf1 xf1Var, long j, p4 p4Var);

    i8 v();

    default long x() {
        return v().i();
    }
}
