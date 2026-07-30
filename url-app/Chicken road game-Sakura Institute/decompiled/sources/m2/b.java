package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface b {
    default float G(long j8) {
        float c4;
        float m8;
        if (!n.a(m.b(j8), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = n2.b.f6499a;
        if (m() >= 1.03f) {
            n2.a a3 = n2.b.a(m());
            c4 = m.c(j8);
            if (a3 != null) {
                return a3.b(c4);
            }
            m8 = m();
        } else {
            c4 = m.c(j8);
            m8 = m();
        }
        return m8 * c4;
    }

    default int K(float f9) {
        float y4 = y(f9);
        if (Float.isInfinite(y4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(y4);
    }

    default long U(long j8) {
        if (j8 != 9205357640488583168L) {
            return v0.d.a(y(Float.intBitsToFloat((int) (j8 >> 32))), y(Float.intBitsToFloat((int) (j8 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float X(long j8) {
        if (n.a(m.b(j8), 4294967296L)) {
            return y(G(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    float a();

    default long g0(float f9) {
        return w(l0(f9));
    }

    default float k0(int i7) {
        return i7 / a();
    }

    default float l0(float f9) {
        return f9 / a();
    }

    float m();

    default long w(float f9) {
        float[] fArr = n2.b.f6499a;
        if (m() < 1.03f) {
            return r4.a.O(4294967296L, f9 / m());
        }
        n2.a a3 = n2.b.a(m());
        return r4.a.O(4294967296L, a3 != null ? a3.a(f9) : f9 / m());
    }

    default long x(long j8) {
        if (j8 != 9205357640488583168L) {
            return a.a.b(l0(y0.f.d(j8)), l0(y0.f.b(j8)));
        }
        return 9205357640488583168L;
    }

    default float y(float f9) {
        return a() * f9;
    }
}
