package x2;

import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c {
    default long H(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float n10 = n(Float.intBitsToFloat((int) (j >> 32)));
        float n11 = n(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(n11) & 4294967295L) | (Float.floatToRawIntBits(n10) << 32);
    }

    default float I(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return n(w(j));
    }

    default long N(float f3) {
        return l(T(f3));
    }

    default float S(int i3) {
        return i3 / g();
    }

    default float T(float f3) {
        return f3 / g();
    }

    float d();

    float g();

    default long l(float f3) {
        float[] fArr = y2.b.f10575a;
        if (d() < 1.03f) {
            return v.d(4294967296L, f3 / d());
        }
        y2.a a9 = y2.b.a(d());
        return v.d(4294967296L, a9 != null ? a9.a(f3) : f3 / d());
    }

    default long m(long j) {
        if (j != 9205357640488583168L) {
            return a.a.c(T(Float.intBitsToFloat((int) (j >> 32))), T(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float n(float f3) {
        return g() * f3;
    }

    default float w(long j) {
        float c10;
        float d10;
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = y2.b.f10575a;
        if (d() >= 1.03f) {
            y2.a a9 = y2.b.a(d());
            c10 = n.c(j);
            if (a9 != null) {
                return a9.b(c10);
            }
            d10 = d();
        } else {
            c10 = n.c(j);
            d10 = d();
        }
        return d10 * c10;
    }

    default int y(float f3) {
        float n10 = n(f3);
        if (Float.isInfinite(n10)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(n10);
    }
}
