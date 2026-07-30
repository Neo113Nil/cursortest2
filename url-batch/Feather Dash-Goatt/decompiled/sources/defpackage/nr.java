package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface nr {
    default float A(long j) {
        if (!xh1.a(wh1.b(j), 4294967296L)) {
            q80.b("Only Sp can convert to Px");
        }
        float[] fArr = r20.a;
        if (f() < 1.03f) {
            return f() * wh1.c(j);
        }
        q20 a = r20.a(f());
        if (a != null) {
            return a.b(wh1.c(j));
        }
        return f() * wh1.c(j);
    }

    default int H(float f) {
        float s = s(f);
        if (Float.isInfinite(s)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(s);
    }

    default long Q(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float s = s(Float.intBitsToFloat((int) (j >> 32)));
        float s2 = s(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(s) << 32) | (Float.floatToRawIntBits(s2) & 4294967295L);
    }

    default float U(long j) {
        if (!xh1.a(wh1.b(j), 4294967296L)) {
            q80.b("Only Sp can convert to Px");
        }
        return s(A(j));
    }

    default long a0(float f) {
        return p(k0(f));
    }

    float f();

    default float i0(int i) {
        return i / k();
    }

    float k();

    default float k0(float f) {
        return f / k();
    }

    default long p(float f) {
        float[] fArr = r20.a;
        if (f() < 1.03f) {
            return t80.E(f / f(), 4294967296L);
        }
        q20 a = r20.a(f());
        return t80.E(a != null ? a.a(f) : f / f(), 4294967296L);
    }

    default float s(float f) {
        return k() * f;
    }
}
