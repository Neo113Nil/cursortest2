package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Point.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\n\u0010\n\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a&\u0010\u000e\u001a\u00020\u000f*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001a\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005\u001a\u001a\u0010&\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005\u001a+\u0010(\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u0010+\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010*\u001a'\u0010-\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010\u0019\u001a'\u0010/\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a&\u00101\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u00102\u001a\u000203H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0080\u0002ø\u0001\u0000¢\u0006\u0004\b7\u0010#\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005*\f\b\u0000\u00108\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"x", "", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "getX-DnnuFBc", "(J)F", "y", "getY-DnnuFBc", "interpolate", ViewProps.START, "stop", "fraction", "interpolate-dLqxh1s", "(JJF)J", "clockwise", "", "other", "clockwise-ybeJwSQ", "(JJ)Z", "copy", "copy-5P9i7ZU", "(JFF)J", "div", "operand", "div-so9K2fw", "(JF)J", "dotProduct", "dotProduct-ybeJwSQ", "(JJ)F", "otherX", "otherY", "dotProduct-5P9i7ZU", "(JFF)F", "getDirection", "getDirection-DnnuFBc", "(J)J", "getDistance", "getDistance-DnnuFBc", "getDistanceSquared", "getDistanceSquared-DnnuFBc", "minus", "minus-ybeJwSQ", "(JJ)J", "plus", "plus-ybeJwSQ", "rem", "rem-so9K2fw", "times", "times-so9K2fw", "transformed", "f", "Landroidx/graphics/shapes/PointTransformer;", "transformed-so9K2fw", "(JLandroidx/graphics/shapes/PointTransformer;)J", "unaryMinus", "unaryMinus-DnnuFBc", "Point", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointKt {
    /* renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m3211copy5P9i7ZU(long j, float f, float f2) {
        return FloatFloatPair.m13constructorimpl(f, f2);
    }

    /* renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m3217getDistanceDnnuFBc(long j) {
        return (float) Math.sqrt((m3219getXDnnuFBc(j) * m3219getXDnnuFBc(j)) + (m3220getYDnnuFBc(j) * m3220getYDnnuFBc(j)));
    }

    /* renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m3218getDistanceSquaredDnnuFBc(long j) {
        return (m3219getXDnnuFBc(j) * m3219getXDnnuFBc(j)) + (m3220getYDnnuFBc(j) * m3220getYDnnuFBc(j));
    }

    /* renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m3215dotProductybeJwSQ(long j, long j2) {
        return (m3219getXDnnuFBc(j) * m3219getXDnnuFBc(j2)) + (m3220getYDnnuFBc(j) * m3220getYDnnuFBc(j2));
    }

    /* renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m3214dotProduct5P9i7ZU(long j, float f, float f2) {
        return (m3219getXDnnuFBc(j) * f) + (m3220getYDnnuFBc(j) * f2);
    }

    /* renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m3210clockwiseybeJwSQ(long j, long j2) {
        return (m3219getXDnnuFBc(j) * m3220getYDnnuFBc(j2)) - (m3220getYDnnuFBc(j) * m3219getXDnnuFBc(j2)) > 0.0f;
    }

    /* renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m3216getDirectionDnnuFBc(long j) {
        float m3217getDistanceDnnuFBc = m3217getDistanceDnnuFBc(j);
        if (m3217getDistanceDnnuFBc <= 0.0f) {
            throw new IllegalArgumentException("Can't get the direction of a 0-length vector".toString());
        }
        return m3213divso9K2fw(j, m3217getDistanceDnnuFBc);
    }

    /* renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m3227unaryMinusDnnuFBc(long j) {
        return FloatFloatPair.m13constructorimpl(-m3219getXDnnuFBc(j), -m3220getYDnnuFBc(j));
    }

    /* renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m3222minusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m13constructorimpl(m3219getXDnnuFBc(j) - m3219getXDnnuFBc(j2), m3220getYDnnuFBc(j) - m3220getYDnnuFBc(j2));
    }

    /* renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m3223plusybeJwSQ(long j, long j2) {
        return FloatFloatPair.m13constructorimpl(m3219getXDnnuFBc(j) + m3219getXDnnuFBc(j2), m3220getYDnnuFBc(j) + m3220getYDnnuFBc(j2));
    }

    /* renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m3225timesso9K2fw(long j, float f) {
        return FloatFloatPair.m13constructorimpl(m3219getXDnnuFBc(j) * f, m3220getYDnnuFBc(j) * f);
    }

    /* renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m3213divso9K2fw(long j, float f) {
        return FloatFloatPair.m13constructorimpl(m3219getXDnnuFBc(j) / f, m3220getYDnnuFBc(j) / f);
    }

    /* renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m3224remso9K2fw(long j, float f) {
        return FloatFloatPair.m13constructorimpl(m3219getXDnnuFBc(j) % f, m3220getYDnnuFBc(j) % f);
    }

    /* renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m3221interpolatedLqxh1s(long j, long j2, float f) {
        return FloatFloatPair.m13constructorimpl(Utils.interpolate(m3219getXDnnuFBc(j), m3219getXDnnuFBc(j2), f), Utils.interpolate(m3220getYDnnuFBc(j), m3220getYDnnuFBc(j2), f));
    }

    /* renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m3226transformedso9K2fw(long j, PointTransformer f) {
        Intrinsics.checkNotNullParameter(f, "f");
        long mo3228transformXgqJiTY = f.mo3228transformXgqJiTY(m3219getXDnnuFBc(j), m3220getYDnnuFBc(j));
        return FloatFloatPair.m13constructorimpl(Float.intBitsToFloat((int) (mo3228transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (mo3228transformXgqJiTY & 4294967295L)));
    }

    /* renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m3219getXDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m3220getYDnnuFBc(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m3212copy5P9i7ZU$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m3211copy5P9i7ZU(j, f, f2);
    }
}
