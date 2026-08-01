package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends d1.k implements c2.v {
    public float C;

    public final long I(boolean z10, long j) {
        int round;
        int g = x2.a.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.C)) <= 0) {
            return 0L;
        }
        if (!z10 || i.e(round, g, j)) {
            return (round << 32) | (g & 4294967295L);
        }
        return 0L;
    }

    public final long J(boolean z10, long j) {
        int round;
        int h10 = x2.a.h(j);
        if (h10 == Integer.MAX_VALUE || (round = Math.round(h10 / this.C)) <= 0) {
            return 0L;
        }
        if (!z10 || i.e(h10, round, j)) {
            return (h10 << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    public final long K(boolean z10, long j) {
        int i3 = x2.a.i(j);
        int round = Math.round(i3 * this.C);
        if (round <= 0) {
            return 0L;
        }
        if (!z10 || i.e(round, i3, j)) {
            return (round << 32) | (i3 & 4294967295L);
        }
        return 0L;
    }

    public final long L(boolean z10, long j) {
        int j3 = x2.a.j(j);
        int round = Math.round(j3 / this.C);
        if (round <= 0) {
            return 0L;
        }
        if (!z10 || i.e(j3, round, j)) {
            return (j3 << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // c2.v
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        long J = J(true, j);
        if (x2.k.a(J, 0L)) {
            J = I(true, j);
            if (x2.k.a(J, 0L)) {
                J = L(true, j);
                if (x2.k.a(J, 0L)) {
                    J = K(true, j);
                    if (x2.k.a(J, 0L)) {
                        J = J(false, j);
                        if (x2.k.a(J, 0L)) {
                            J = I(false, j);
                            if (x2.k.a(J, 0L)) {
                                J = L(false, j);
                                if (x2.k.a(J, 0L)) {
                                    J = K(false, j);
                                    if (x2.k.a(J, 0L)) {
                                        J = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!x2.k.a(J, 0L)) {
            int i3 = (int) (J >> 32);
            int i10 = (int) (J & 4294967295L);
            if (!((i10 >= 0) & (i3 >= 0))) {
                x2.h.a("width and height must be >= 0");
            }
            j = x2.b.g(i3, i3, i10, i10);
        }
        a2.o0 c10 = f0Var.c(j);
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new j(c10, 0));
    }
}
