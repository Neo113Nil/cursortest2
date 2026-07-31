package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface c {
    default float E(long j7) {
        float c8;
        float i;
        if (!p.a(n.b(j7), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = s2.b.f6691a;
        if (i() >= 1.03f) {
            s2.a a8 = s2.b.a(i());
            c8 = n.c(j7);
            if (a8 != null) {
                return a8.b(c8);
            }
            i = i();
        } else {
            c8 = n.c(j7);
            i = i();
        }
        return i * c8;
    }

    default int H(float f6) {
        float u7 = u(f6);
        if (Float.isInfinite(u7)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(u7);
    }

    default long O(long j7) {
        if (j7 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float u7 = u(Float.intBitsToFloat((int) (j7 >> 32)));
        float u8 = u(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        return (Float.floatToRawIntBits(u8) & 4294967295L) | (Float.floatToRawIntBits(u7) << 32);
    }

    default float R(long j7) {
        if (!p.a(n.b(j7), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return u(E(j7));
    }

    default long V(float f6) {
        return s(c0(f6));
    }

    default float a0(int i) {
        return i / b();
    }

    float b();

    default float c0(float f6) {
        return f6 / b();
    }

    float i();

    default long s(float f6) {
        float[] fArr = s2.b.f6691a;
        if (i() < 1.03f) {
            return o.d0(4294967296L, f6 / i());
        }
        s2.a a8 = s2.b.a(i());
        return o.d0(4294967296L, a8 != null ? a8.a(f6) : f6 / i());
    }

    default float u(float f6) {
        return b() * f6;
    }
}
