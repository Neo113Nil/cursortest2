package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ii1 {
    public final en0 a;
    public hi1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public ii1() {
        en0 en0Var = r90.a;
        this.a = new en0();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(hi1 hi1Var, long j, long j2, float[] fArr, long j3) {
        long j4 = hi1Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            hi1Var.g = j3;
            hi1Var.a(hi1Var.e, hi1Var.f, j, j2, fArr);
        }
    }
}
