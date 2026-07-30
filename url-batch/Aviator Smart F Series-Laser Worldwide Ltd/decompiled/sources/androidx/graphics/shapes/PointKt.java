package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class PointKt {
    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m45clockwiseybeJwSQ(long j8, long j9) {
        return (m54getXDnnuFBc(j8) * m55getYDnnuFBc(j9)) - (m55getYDnnuFBc(j8) * m54getXDnnuFBc(j9)) > 0.0f;
    }

    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m46copy5P9i7ZU(long j8, float f8, float f9) {
        return FloatFloatPair.m8constructorimpl(f8, f9);
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m47copy5P9i7ZU$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Float.intBitsToFloat((int) (j8 >> 32));
        }
        if ((i8 & 2) != 0) {
            f9 = Float.intBitsToFloat((int) (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & j8));
        }
        return m46copy5P9i7ZU(j8, f8, f9);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m48divso9K2fw(long j8, float f8) {
        return FloatFloatPair.m8constructorimpl(m54getXDnnuFBc(j8) / f8, m55getYDnnuFBc(j8) / f8);
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m49dotProduct5P9i7ZU(long j8, float f8, float f9) {
        return (m54getXDnnuFBc(j8) * f8) + (m55getYDnnuFBc(j8) * f9);
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m50dotProductybeJwSQ(long j8, long j9) {
        return (m54getXDnnuFBc(j8) * m54getXDnnuFBc(j9)) + (m55getYDnnuFBc(j8) * m55getYDnnuFBc(j9));
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m51getDirectionDnnuFBc(long j8) {
        float m52getDistanceDnnuFBc = m52getDistanceDnnuFBc(j8);
        if (m52getDistanceDnnuFBc > 0.0f) {
            return m48divso9K2fw(j8, m52getDistanceDnnuFBc);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector".toString());
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m52getDistanceDnnuFBc(long j8) {
        return (float) Math.sqrt((m54getXDnnuFBc(j8) * m54getXDnnuFBc(j8)) + (m55getYDnnuFBc(j8) * m55getYDnnuFBc(j8)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m53getDistanceSquaredDnnuFBc(long j8) {
        return (m54getXDnnuFBc(j8) * m54getXDnnuFBc(j8)) + (m55getYDnnuFBc(j8) * m55getYDnnuFBc(j8));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m54getXDnnuFBc(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m55getYDnnuFBc(long j8) {
        return Float.intBitsToFloat((int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m56interpolatedLqxh1s(long j8, long j9, float f8) {
        return FloatFloatPair.m8constructorimpl(Utils.interpolate(m54getXDnnuFBc(j8), m54getXDnnuFBc(j9), f8), Utils.interpolate(m55getYDnnuFBc(j8), m55getYDnnuFBc(j9), f8));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m57minusybeJwSQ(long j8, long j9) {
        return FloatFloatPair.m8constructorimpl(m54getXDnnuFBc(j8) - m54getXDnnuFBc(j9), m55getYDnnuFBc(j8) - m55getYDnnuFBc(j9));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m58plusybeJwSQ(long j8, long j9) {
        return FloatFloatPair.m8constructorimpl(m54getXDnnuFBc(j8) + m54getXDnnuFBc(j9), m55getYDnnuFBc(j8) + m55getYDnnuFBc(j9));
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m59remso9K2fw(long j8, float f8) {
        return FloatFloatPair.m8constructorimpl(m54getXDnnuFBc(j8) % f8, m55getYDnnuFBc(j8) % f8);
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m60timesso9K2fw(long j8, float f8) {
        return FloatFloatPair.m8constructorimpl(m54getXDnnuFBc(j8) * f8, m55getYDnnuFBc(j8) * f8);
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m61transformedso9K2fw(long j8, PointTransformer f8) {
        s.checkNotNullParameter(f8, "f");
        long mo63transformXgqJiTY = f8.mo63transformXgqJiTY(m54getXDnnuFBc(j8), m55getYDnnuFBc(j8));
        return FloatFloatPair.m8constructorimpl(Float.intBitsToFloat((int) (mo63transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (mo63transformXgqJiTY & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m62unaryMinusDnnuFBc(long j8) {
        return FloatFloatPair.m8constructorimpl(-m54getXDnnuFBc(j8), -m55getYDnnuFBc(j8));
    }
}
