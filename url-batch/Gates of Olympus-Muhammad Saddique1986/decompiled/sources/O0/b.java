package O0;

import a.AbstractC0235a;
import a0.C0241f;

/* loaded from: classes.dex */
public interface b {
    default long E(long j3) {
        if (j3 != 9205357640488583168L) {
            return AbstractC0235a.e(J(Float.intBitsToFloat((int) (j3 >> 32))), J(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long G(float f3) {
        float[] fArr = P0.b.f3914a;
        if (!(r() >= 1.03f)) {
            return O2.l.q0(4294967296L, f3 / r());
        }
        P0.a a3 = P0.b.a(r());
        return O2.l.q0(4294967296L, a3 != null ? a3.a(f3) : f3 / r());
    }

    default long H(long j3) {
        if (j3 != 9205357640488583168L) {
            return AbstractC0235a.d(d0(C0241f.d(j3)), d0(C0241f.b(j3)));
        }
        return 9205357640488583168L;
    }

    default float J(float f3) {
        return a() * f3;
    }

    default float K(long j3) {
        if (n.a(m.b(j3), 4294967296L)) {
            return J(b0(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long T(float f3) {
        return G(d0(f3));
    }

    default float Y(int i3) {
        return i3 / a();
    }

    float a();

    default float b0(long j3) {
        if (!n.a(m.b(j3), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = P0.b.f3914a;
        if (r() < 1.03f) {
            return r() * m.c(j3);
        }
        P0.a a3 = P0.b.a(r());
        float c2 = m.c(j3);
        return a3 == null ? r() * c2 : a3.b(c2);
    }

    default float d0(float f3) {
        return f3 / a();
    }

    default int l(float f3) {
        float J3 = J(f3);
        if (Float.isInfinite(J3)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(J3);
    }

    float r();
}
