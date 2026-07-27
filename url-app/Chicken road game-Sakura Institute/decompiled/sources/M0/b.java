package M0;

/* loaded from: classes.dex */
public interface b {
    default long E(long j4) {
        if (j4 != 9205357640488583168L) {
            return u3.l.N(L(Float.intBitsToFloat((int) (j4 >> 32))), L(Float.intBitsToFloat((int) (j4 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long I(float f4) {
        float[] fArr = N0.b.f3613a;
        if (!(q() >= 1.03f)) {
            return u3.l.p0(f4 / q(), 4294967296L);
        }
        N0.a a4 = N0.b.a(q());
        return u3.l.p0(a4 != null ? a4.a(f4) : f4 / q(), 4294967296L);
    }

    default long J(long j4) {
        if (j4 != 9205357640488583168L) {
            return M1.a.d(k0(Y.f.d(j4)), k0(Y.f.b(j4)));
        }
        return 9205357640488583168L;
    }

    default float L(float f4) {
        return e() * f4;
    }

    default float M(long j4) {
        if (n.a(m.b(j4), 4294967296L)) {
            return L(j0(j4));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long a0(float f4) {
        return I(k0(f4));
    }

    float e();

    default int h0(long j4) {
        return Math.round(M(j4));
    }

    default float i0(int i2) {
        return i2 / e();
    }

    default float j0(long j4) {
        if (!n.a(m.b(j4), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = N0.b.f3613a;
        if (q() < 1.03f) {
            return q() * m.c(j4);
        }
        N0.a a4 = N0.b.a(q());
        float c4 = m.c(j4);
        return a4 == null ? q() * c4 : a4.b(c4);
    }

    default float k0(float f4) {
        return f4 / e();
    }

    default int l(float f4) {
        float L3 = L(f4);
        if (Float.isInfinite(L3)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(L3);
    }

    float q();
}
