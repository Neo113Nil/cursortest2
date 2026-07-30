package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;

    /* renamed from: d1, reason: collision with root package name */
    private final long f246d1;

    /* renamed from: d2, reason: collision with root package name */
    private final long f247d2;
    private final float expectedRoundCut;

    /* renamed from: p0, reason: collision with root package name */
    private final long f248p0;

    /* renamed from: p1, reason: collision with root package name */
    private final long f249p1;

    /* renamed from: p2, reason: collision with root package name */
    private final long f250p2;
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    public /* synthetic */ RoundedCorner(long j8, long j9, long j10, CornerRounding cornerRounding, o oVar) {
        this(j8, j9, j10, cornerRounding);
    }

    private final float calculateActualSmoothingValue(float f8) {
        if (f8 > getExpectedCut()) {
            return this.smoothing;
        }
        float f9 = this.expectedRoundCut;
        if (f8 > f9) {
            return (this.smoothing * (f8 - f9)) / (getExpectedCut() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    /* renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m64computeFlankingCurveoAJzIJU(float f8, float f9, long j8, long j9, long j10, long j11, long j12, float f10) {
        long m51getDirectionDnnuFBc = PointKt.m51getDirectionDnnuFBc(PointKt.m57minusybeJwSQ(j9, j8));
        long m58plusybeJwSQ = PointKt.m58plusybeJwSQ(j8, PointKt.m60timesso9K2fw(PointKt.m60timesso9K2fw(m51getDirectionDnnuFBc, f8), 1 + f9));
        long j13 = j10;
        long m56interpolatedLqxh1s = PointKt.m56interpolatedLqxh1s(j13, PointKt.m48divso9K2fw(PointKt.m58plusybeJwSQ(j10, j11), 2.0f), f9);
        long m58plusybeJwSQ2 = PointKt.m58plusybeJwSQ(j12, PointKt.m60timesso9K2fw(Utils.directionVector(PointKt.m54getXDnnuFBc(m56interpolatedLqxh1s) - PointKt.m54getXDnnuFBc(j12), PointKt.m55getYDnnuFBc(m56interpolatedLqxh1s) - PointKt.m55getYDnnuFBc(j12)), f10));
        FloatFloatPair m65lineIntersectionCBFvKDc = m65lineIntersectionCBFvKDc(j9, m51getDirectionDnnuFBc, m58plusybeJwSQ2, Utils.m75rotate90DnnuFBc(PointKt.m57minusybeJwSQ(m58plusybeJwSQ2, j12)));
        if (m65lineIntersectionCBFvKDc != null) {
            j13 = m65lineIntersectionCBFvKDc.m16unboximpl();
        }
        return new Cubic(m58plusybeJwSQ, PointKt.m48divso9K2fw(PointKt.m58plusybeJwSQ(m58plusybeJwSQ, PointKt.m60timesso9K2fw(j13, 2.0f)), 3.0f), j13, m58plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = f8;
        }
        return roundedCorner.getCubics(f8, f9);
    }

    /* renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m65lineIntersectionCBFvKDc(long j8, long j9, long j10, long j11) {
        long m75rotate90DnnuFBc = Utils.m75rotate90DnnuFBc(j11);
        float m50dotProductybeJwSQ = PointKt.m50dotProductybeJwSQ(j9, m75rotate90DnnuFBc);
        if (Math.abs(m50dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float m50dotProductybeJwSQ2 = PointKt.m50dotProductybeJwSQ(PointKt.m57minusybeJwSQ(j10, j8), m75rotate90DnnuFBc);
        if (Math.abs(m50dotProductybeJwSQ) < Math.abs(m50dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m5boximpl(PointKt.m58plusybeJwSQ(j8, PointKt.m60timesso9K2fw(j9, m50dotProductybeJwSQ2 / m50dotProductybeJwSQ)));
    }

    /* renamed from: getCenter-1ufDz9w, reason: not valid java name */
    public final long m66getCenter1ufDz9w() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    public final List<Cubic> getCubics(float f8) {
        return getCubics$default(this, f8, 0.0f, 2, null);
    }

    /* renamed from: getD1-1ufDz9w, reason: not valid java name */
    public final long m67getD11ufDz9w() {
        return this.f246d1;
    }

    /* renamed from: getD2-1ufDz9w, reason: not valid java name */
    public final long m68getD21ufDz9w() {
        return this.f247d2;
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* renamed from: getP0-1ufDz9w, reason: not valid java name */
    public final long m69getP01ufDz9w() {
        return this.f248p0;
    }

    /* renamed from: getP1-1ufDz9w, reason: not valid java name */
    public final long m70getP11ufDz9w() {
        return this.f249p1;
    }

    /* renamed from: getP2-1ufDz9w, reason: not valid java name */
    public final long m71getP21ufDz9w() {
        return this.f250p2;
    }

    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m72setCenterDnnuFBc(long j8) {
        this.center = j8;
    }

    private RoundedCorner(long j8, long j9, long j10, CornerRounding cornerRounding) {
        this.f248p0 = j8;
        this.f249p1 = j9;
        this.f250p2 = j10;
        this.rounding = cornerRounding;
        long m51getDirectionDnnuFBc = PointKt.m51getDirectionDnnuFBc(PointKt.m57minusybeJwSQ(j8, j9));
        this.f246d1 = m51getDirectionDnnuFBc;
        long m51getDirectionDnnuFBc2 = PointKt.m51getDirectionDnnuFBc(PointKt.m57minusybeJwSQ(j10, j9));
        this.f247d2 = m51getDirectionDnnuFBc2;
        float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
        float m50dotProductybeJwSQ = PointKt.m50dotProductybeJwSQ(m51getDirectionDnnuFBc, m51getDirectionDnnuFBc2);
        this.cosAngle = m50dotProductybeJwSQ;
        float f8 = 1;
        float sqrt = (float) Math.sqrt(f8 - Utils.square(m50dotProductybeJwSQ));
        this.sinAngle = sqrt;
        this.expectedRoundCut = ((double) sqrt) > 0.001d ? (radius * (m50dotProductybeJwSQ + f8)) / sqrt : 0.0f;
        this.center = FloatFloatPair.m8constructorimpl(0.0f, 0.0f);
    }

    public final List<Cubic> getCubics(float f8, float f9) {
        List<Cubic> listOf;
        float min = Math.min(f8, f9);
        float f10 = this.expectedRoundCut;
        if (f10 < 1.0E-4f || min < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j8 = this.f249p1;
            this.center = j8;
            return q.listOf(Cubic.Companion.straightLine(PointKt.m54getXDnnuFBc(j8), PointKt.m55getYDnnuFBc(this.f249p1), PointKt.m54getXDnnuFBc(this.f249p1), PointKt.m55getYDnnuFBc(this.f249p1)));
        }
        float min2 = Math.min(min, f10);
        float calculateActualSmoothingValue = calculateActualSmoothingValue(f8);
        float calculateActualSmoothingValue2 = calculateActualSmoothingValue(f9);
        float f11 = (this.cornerRadius * min2) / this.expectedRoundCut;
        this.center = PointKt.m58plusybeJwSQ(this.f249p1, PointKt.m60timesso9K2fw(PointKt.m51getDirectionDnnuFBc(PointKt.m48divso9K2fw(PointKt.m58plusybeJwSQ(this.f246d1, this.f247d2), 2.0f)), (float) Math.sqrt(Utils.square(f11) + Utils.square(min2))));
        long m58plusybeJwSQ = PointKt.m58plusybeJwSQ(this.f249p1, PointKt.m60timesso9K2fw(this.f246d1, min2));
        long m58plusybeJwSQ2 = PointKt.m58plusybeJwSQ(this.f249p1, PointKt.m60timesso9K2fw(this.f247d2, min2));
        Cubic m64computeFlankingCurveoAJzIJU = m64computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue, this.f249p1, this.f248p0, m58plusybeJwSQ, m58plusybeJwSQ2, this.center, f11);
        Cubic reverse = m64computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue2, this.f249p1, this.f250p2, m58plusybeJwSQ2, m58plusybeJwSQ, this.center, f11).reverse();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Cubic[]{m64computeFlankingCurveoAJzIJU, Cubic.Companion.circularArc(PointKt.m54getXDnnuFBc(this.center), PointKt.m55getYDnnuFBc(this.center), m64computeFlankingCurveoAJzIJU.getAnchor1X(), m64computeFlankingCurveoAJzIJU.getAnchor1Y(), reverse.getAnchor0X(), reverse.getAnchor0Y()), reverse});
        return listOf;
    }

    public /* synthetic */ RoundedCorner(long j8, long j9, long j10, CornerRounding cornerRounding, int i8, o oVar) {
        this(j8, j9, j10, (i8 & 8) != 0 ? null : cornerRounding, null);
    }
}
