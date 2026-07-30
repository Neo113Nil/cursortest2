package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.h;

/* loaded from: classes.dex */
public class Cubic {
    public static final Companion Companion = new Companion(null);
    private final float[] points;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Cubic circularArc(float f8, float f9, float f10, float f11, float f12, float f13) {
            float f14 = f10 - f8;
            float f15 = f11 - f9;
            long directionVector = Utils.directionVector(f14, f15);
            float f16 = f12 - f8;
            float f17 = f13 - f9;
            long directionVector2 = Utils.directionVector(f16, f17);
            long m75rotate90DnnuFBc = Utils.m75rotate90DnnuFBc(directionVector);
            long m75rotate90DnnuFBc2 = Utils.m75rotate90DnnuFBc(directionVector2);
            boolean z7 = PointKt.m49dotProduct5P9i7ZU(m75rotate90DnnuFBc, f16, f17) >= 0.0f;
            float m50dotProductybeJwSQ = PointKt.m50dotProductybeJwSQ(directionVector, directionVector2);
            if (m50dotProductybeJwSQ > 0.999f) {
                return straightLine(f10, f11, f12, f13);
            }
            float distance = ((((Utils.distance(f14, f15) * 4.0f) / 3.0f) * (((float) Math.sqrt(2 * r10)) - ((float) Math.sqrt(r5 - (m50dotProductybeJwSQ * m50dotProductybeJwSQ))))) / (1 - m50dotProductybeJwSQ)) * (z7 ? 1.0f : -1.0f);
            return CubicKt.Cubic(f10, f11, (PointKt.m54getXDnnuFBc(m75rotate90DnnuFBc) * distance) + f10, (PointKt.m55getYDnnuFBc(m75rotate90DnnuFBc) * distance) + f11, f12 - (PointKt.m54getXDnnuFBc(m75rotate90DnnuFBc2) * distance), f13 - (PointKt.m55getYDnnuFBc(m75rotate90DnnuFBc2) * distance), f12, f13);
        }

        public final Cubic straightLine(float f8, float f9, float f10, float f11) {
            return CubicKt.Cubic(f8, f9, Utils.interpolate(f8, f10, 0.33333334f), Utils.interpolate(f9, f11, 0.33333334f), Utils.interpolate(f8, f10, 0.6666667f), Utils.interpolate(f9, f11, 0.6666667f), f10, f11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
        }
        if ((i8 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        cubic.calculateBounds$graphics_shapes_release(fArr, z7);
    }

    public static final Cubic circularArc(float f8, float f9, float f10, float f11, float f12, float f13) {
        return Companion.circularArc(f8, f9, f10, f11, f12, f13);
    }

    public static final Cubic straightLine(float f8, float f9, float f10, float f11) {
        return Companion.straightLine(f8, f9, f10, f11);
    }

    private final boolean zeroIsh(float f8) {
        return Math.abs(f8) < 1.0E-4f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c8, code lost:
    
        if (r3 > r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ca, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021f, code lost:
    
        if (r3 > r9) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void calculateBounds$graphics_shapes_release(float[] bounds, boolean z7) {
        float f8;
        float control0Y;
        float f9;
        float m55getYDnnuFBc;
        s.checkNotNullParameter(bounds, "bounds");
        if (zeroLength$graphics_shapes_release()) {
            bounds[0] = getAnchor0X();
            bounds[1] = getAnchor0Y();
            bounds[2] = getAnchor0X();
            bounds[3] = getAnchor0Y();
            return;
        }
        float min = Math.min(getAnchor0X(), getAnchor1X());
        float min2 = Math.min(getAnchor0Y(), getAnchor1Y());
        float max = Math.max(getAnchor0X(), getAnchor1X());
        float max2 = Math.max(getAnchor0Y(), getAnchor1Y());
        if (z7) {
            bounds[0] = Math.min(min, Math.min(getControl0X(), getControl1X()));
            bounds[1] = Math.min(min2, Math.min(getControl0Y(), getControl1Y()));
            bounds[2] = Math.max(max, Math.max(getControl0X(), getControl1X()));
            bounds[3] = Math.max(max2, Math.max(getControl0Y(), getControl1Y()));
            return;
        }
        float f10 = 3;
        float control0X = (((-getAnchor0X()) + (getControl0X() * f10)) - (getControl1X() * f10)) + getAnchor1X();
        float f11 = 2;
        float f12 = 4;
        float anchor0X = ((getAnchor0X() * f11) - (getControl0X() * f12)) + (getControl1X() * f11);
        float control0X2 = (-getAnchor0X()) + getControl0X();
        if (!zeroIsh(control0X)) {
            float f13 = (anchor0X * anchor0X) - ((f12 * control0X) * control0X2);
            if (f13 >= 0.0f) {
                float f14 = -anchor0X;
                double d8 = f13;
                f8 = min2;
                float f15 = control0X * f11;
                float sqrt = (((float) Math.sqrt(d8)) + f14) / f15;
                if (0.0f <= sqrt && sqrt <= 1.0f) {
                    float m54getXDnnuFBc = PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(sqrt));
                    if (m54getXDnnuFBc < min) {
                        min = m54getXDnnuFBc;
                    }
                    if (m54getXDnnuFBc > max) {
                        max = m54getXDnnuFBc;
                    }
                }
                float sqrt2 = (f14 - ((float) Math.sqrt(d8))) / f15;
                if (0.0f <= sqrt2 && sqrt2 <= 1.0f) {
                    float m54getXDnnuFBc2 = PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(sqrt2));
                    if (m54getXDnnuFBc2 < min) {
                        min = m54getXDnnuFBc2;
                    }
                    if (m54getXDnnuFBc2 > max) {
                        max = m54getXDnnuFBc2;
                    }
                }
                control0Y = (((-getAnchor0Y()) + (getControl0Y() * f10)) - (f10 * getControl1Y())) + getAnchor1Y();
                float anchor0Y = ((getAnchor0Y() * f11) - (getControl0Y() * f12)) + (getControl1Y() * f11);
                float control0Y2 = (-getAnchor0Y()) + getControl0Y();
                if (zeroIsh(control0Y)) {
                    float f16 = (anchor0Y * anchor0Y) - ((f12 * control0Y) * control0Y2);
                    if (f16 >= 0.0f) {
                        float f17 = -anchor0Y;
                        double d9 = f16;
                        float f18 = f11 * control0Y;
                        float sqrt3 = (((float) Math.sqrt(d9)) + f17) / f18;
                        if (0.0f > sqrt3 || sqrt3 > 1.0f) {
                            f9 = f8;
                        } else {
                            float m55getYDnnuFBc2 = PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(sqrt3));
                            f9 = m55getYDnnuFBc2 < f8 ? m55getYDnnuFBc2 : f8;
                            if (m55getYDnnuFBc2 > max2) {
                                max2 = m55getYDnnuFBc2;
                            }
                        }
                        float sqrt4 = (f17 - ((float) Math.sqrt(d9))) / f18;
                        if (0.0f <= sqrt4 && sqrt4 <= 1.0f) {
                            m55getYDnnuFBc = PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(sqrt4));
                            if (m55getYDnnuFBc < f9) {
                                f9 = m55getYDnnuFBc;
                            }
                        }
                    }
                    f9 = f8;
                } else {
                    if (anchor0Y != 0.0f) {
                        float f19 = (f11 * control0Y2) / ((-2) * anchor0Y);
                        if (0.0f <= f19 && f19 <= 1.0f) {
                            m55getYDnnuFBc = PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(f19));
                            f9 = m55getYDnnuFBc < f8 ? m55getYDnnuFBc : f8;
                        }
                    }
                    f9 = f8;
                }
                bounds[0] = min;
                bounds[1] = f9;
                bounds[2] = max;
                bounds[3] = max2;
            }
        } else if (anchor0X != 0.0f) {
            float f20 = (control0X2 * f11) / ((-2) * anchor0X);
            if (0.0f <= f20 && f20 <= 1.0f) {
                float m54getXDnnuFBc3 = PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release(f20));
                if (m54getXDnnuFBc3 < min) {
                    min = m54getXDnnuFBc3;
                }
                if (m54getXDnnuFBc3 > max) {
                    max = m54getXDnnuFBc3;
                }
            }
        }
        f8 = min2;
        control0Y = (((-getAnchor0Y()) + (getControl0Y() * f10)) - (f10 * getControl1Y())) + getAnchor1Y();
        float anchor0Y2 = ((getAnchor0Y() * f11) - (getControl0Y() * f12)) + (getControl1Y() * f11);
        float control0Y22 = (-getAnchor0Y()) + getControl0Y();
        if (zeroIsh(control0Y)) {
        }
        bounds[0] = min;
        bounds[1] = f9;
        bounds[2] = max;
        bounds[3] = max2;
    }

    public final Cubic div(float f8) {
        return times(1.0f / f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) obj).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    public final float[] getPoints$graphics_shapes_release() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Cubic plus(Cubic o8) {
        s.checkNotNullParameter(o8, "o");
        float[] fArr = new float[8];
        for (int i8 = 0; i8 < 8; i8++) {
            fArr[i8] = this.points[i8] + o8.points[i8];
        }
        return new Cubic(fArr);
    }

    /* renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m42pointOnCurveOOQOV4g$graphics_shapes_release(float f8) {
        float f9 = 1 - f8;
        float f10 = f9 * f9 * f9;
        float f11 = 3 * f8;
        float f12 = f11 * f9 * f9;
        float f13 = f11 * f8 * f9;
        float f14 = f8 * f8 * f8;
        return FloatFloatPair.m8constructorimpl((getAnchor0X() * f10) + (getControl0X() * f12) + (getControl1X() * f13) + (getAnchor1X() * f14), (getAnchor0Y() * f10) + (getControl0Y() * f12) + (getControl1Y() * f13) + (getAnchor1Y() * f14));
    }

    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final Pair<Cubic, Cubic> split(float f8) {
        float f9 = 1 - f8;
        long m42pointOnCurveOOQOV4g$graphics_shapes_release = m42pointOnCurveOOQOV4g$graphics_shapes_release(f8);
        float f10 = f9 * f9;
        float f11 = 2 * f9 * f8;
        float f12 = f8 * f8;
        return h.to(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f9) + (getControl0X() * f8), (getAnchor0Y() * f9) + (getControl0Y() * f8), (getAnchor0X() * f10) + (getControl0X() * f11) + (getControl1X() * f12), (getAnchor0Y() * f10) + (getControl0Y() * f11) + (getControl1Y() * f12), PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release), (getControl0X() * f10) + (getControl1X() * f11) + (getAnchor1X() * f12), (getControl0Y() * f10) + (getControl1Y() * f11) + (getAnchor1Y() * f12), (getControl1X() * f9) + (getAnchor1X() * f8), (getControl1Y() * f9) + (getAnchor1Y() * f8), getAnchor1X(), getAnchor1Y()));
    }

    public final Cubic times(float f8) {
        float[] fArr = new float[8];
        for (int i8 = 0; i8 < 8; i8++) {
            fArr[i8] = this.points[i8] * f8;
        }
        return new Cubic(fArr);
    }

    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    public final Cubic transformed(PointTransformer f8) {
        s.checkNotNullParameter(f8, "f");
        MutableCubic mutableCubic = new MutableCubic();
        k.copyInto$default(this.points, mutableCubic.getPoints$graphics_shapes_release(), 0, 0, 0, 14, (Object) null);
        mutableCubic.transform(f8);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes_release() {
        return Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f;
    }

    public /* synthetic */ Cubic(long j8, long j9, long j10, long j11, o oVar) {
        this(j8, j9, j10, j11);
    }

    public final Cubic div(int i8) {
        return div(i8);
    }

    public final Cubic times(int i8) {
        return times(i8);
    }

    public Cubic(float[] points) {
        s.checkNotNullParameter(points, "points");
        this.points = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8".toString());
        }
    }

    public /* synthetic */ Cubic(float[] fArr, int i8, o oVar) {
        this((i8 & 1) != 0 ? new float[8] : fArr);
    }

    private Cubic(long j8, long j9, long j10, long j11) {
        this(new float[]{PointKt.m54getXDnnuFBc(j8), PointKt.m55getYDnnuFBc(j8), PointKt.m54getXDnnuFBc(j9), PointKt.m55getYDnnuFBc(j9), PointKt.m54getXDnnuFBc(j10), PointKt.m55getYDnnuFBc(j10), PointKt.m54getXDnnuFBc(j11), PointKt.m55getYDnnuFBc(j11)});
    }
}
