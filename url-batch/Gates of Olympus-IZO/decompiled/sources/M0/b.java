package M0;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public interface b {
    default long C(long j3) {
        if (j3 != 9205357640488583168L) {
            return I2.d.h(F(Float.intBitsToFloat((int) (j3 >> 32))), F(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long D(float f3) {
        float[] fArr = N0.b.f2849a;
        if (!(p() >= 1.03f)) {
            return AbstractC0157a.N(4294967296L, f3 / p());
        }
        N0.a a3 = N0.b.a(p());
        return AbstractC0157a.N(4294967296L, a3 != null ? a3.a(f3) : f3 / p());
    }

    default float F(float f3) {
        return a() * f3;
    }

    default float G(long j3) {
        if (m.a(l.b(j3), 4294967296L)) {
            return F(a0(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long R(float f3) {
        return D(c0(f3));
    }

    default float Z(int i3) {
        return i3 / a();
    }

    float a();

    default float a0(long j3) {
        if (!m.a(l.b(j3), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = N0.b.f2849a;
        if (p() < 1.03f) {
            return p() * l.c(j3);
        }
        N0.a a3 = N0.b.a(p());
        float c3 = l.c(j3);
        return a3 == null ? p() * c3 : a3.b(c3);
    }

    default float c0(float f3) {
        return f3 / a();
    }

    default int k(float f3) {
        float F3 = F(f3);
        if (Float.isInfinite(F3)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(F3);
    }

    float p();
}
