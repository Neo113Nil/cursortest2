package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ba extends zl0 implements ad0 {
    public float s;

    public final long A0(long j, boolean z) {
        int round;
        int h = mm.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h / this.s)) <= 0) {
            return 0L;
        }
        if (!z || p4.L(j, h, round)) {
            return (h << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long B0(long j, boolean z) {
        int i = mm.i(j);
        int round = Math.round(i * this.s);
        if (round <= 0) {
            return 0L;
        }
        if (!z || p4.L(j, round, i)) {
            return (round << 32) | (i & 4294967295L);
        }
        return 0L;
    }

    public final long C0(long j, boolean z) {
        int j2 = mm.j(j);
        int round = Math.round(j2 / this.s);
        if (round <= 0) {
            return 0L;
        }
        if (!z || p4.L(j, j2, round)) {
            return (j2 << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        long A0 = A0(j, true);
        if (ba0.a(A0, 0L)) {
            A0 = z0(j, true);
            if (ba0.a(A0, 0L)) {
                A0 = C0(j, true);
                if (ba0.a(A0, 0L)) {
                    A0 = B0(j, true);
                    if (ba0.a(A0, 0L)) {
                        A0 = A0(j, false);
                        if (ba0.a(A0, 0L)) {
                            A0 = z0(j, false);
                            if (ba0.a(A0, 0L)) {
                                A0 = C0(j, false);
                                if (ba0.a(A0, 0L)) {
                                    A0 = B0(j, false);
                                    if (ba0.a(A0, 0L)) {
                                        A0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!ba0.a(A0, 0L)) {
            int i = (int) (A0 >> 32);
            int i2 = (int) (4294967295L & A0);
            if (!((i >= 0) & (i2 >= 0))) {
                q80.a("width and height must be >= 0");
            }
            j = nm.g(i, i, i2, i2);
        }
        zw0 c = qk0Var.c(j);
        return xk0.q(ej0Var, c.d, c.e, new aa(c, 0));
    }

    public final long z0(long j, boolean z) {
        int round;
        int g = mm.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.s)) <= 0) {
            return 0L;
        }
        if (!z || p4.L(j, round, g)) {
            return (round << 32) | (g & 4294967295L);
        }
        return 0L;
    }
}
