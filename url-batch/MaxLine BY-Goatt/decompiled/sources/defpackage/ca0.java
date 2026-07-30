package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ca0 {
    default long A(float f) {
        float[] fArr = dq0.a;
        if (p() < 1.03f) {
            return mi2.n(4294967296L, f / p());
        }
        cq0 a = dq0.a(p());
        return mi2.n(4294967296L, a != null ? a.a(f) : f / p());
    }

    default long C(long j) {
        if (j != 9205357640488583168L) {
            return ap.g(r0(Float.intBitsToFloat((int) (j >> 32))), r0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float D(float f) {
        return d() * f;
    }

    default float K(long j) {
        if (!tw2.a(sw2.b(j), 4294967296L)) {
            j21.b("Only Sp can convert to Px");
        }
        float[] fArr = dq0.a;
        if (p() < 1.03f) {
            return p() * sw2.c(j);
        }
        cq0 a = dq0.a(p());
        if (a != null) {
            return a.b(sw2.c(j));
        }
        return p() * sw2.c(j);
    }

    default int R(float f) {
        float D = D(f);
        if (Float.isInfinite(D)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(D);
    }

    default long c0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float D = D(Float.intBitsToFloat((int) (j >> 32)));
        float D2 = D(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(D) << 32) | (Float.floatToRawIntBits(D2) & 4294967295L);
    }

    float d();

    default float g0(long j) {
        if (!tw2.a(sw2.b(j), 4294967296L)) {
            j21.b("Only Sp can convert to Px");
        }
        return D(K(j));
    }

    default long l0(float f) {
        return A(r0(f));
    }

    float p();

    default float p0(int i) {
        return i / d();
    }

    default float r0(float f) {
        return f / d();
    }
}
