package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.VelocityKt;
import com.ironsource.X3;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: VelocityTracker.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Velocity;", "getImpulseVelocity-9UxMQ8M", "()J", "getImpulseVelocity", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "getLsq2VelocityEstimate", "()Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "calculateVelocity-9UxMQ8M", "calculateVelocity", "", "Landroidx/compose/ui/input/pointer/util/PointAtTime;", "samples", "[Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "index", "I", "", "useImpulse", "Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VelocityTracker {
    private int index;
    private final PointAtTime[] samples;
    private final boolean useImpulse;

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i = 0; i < 20; i++) {
            pointAtTimeArr[i] = null;
        }
        this.samples = pointAtTimeArr;
        this.useImpulse = true;
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m1920addPositionUv8p0NA(long timeMillis, long position) {
        int i = (this.index + 1) % 20;
        this.index = i;
        this.samples[i] = new PointAtTime(position, timeMillis, null);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m1921calculateVelocity9UxMQ8M() {
        if (this.useImpulse) {
            return m1919getImpulseVelocity9UxMQ8M();
        }
        long pixelsPerSecond = getLsq2VelocityEstimate().getPixelsPerSecond();
        return VelocityKt.Velocity(Offset.m1297getXimpl(pixelsPerSecond), Offset.m1298getYimpl(pixelsPerSecond));
    }

    /* renamed from: getImpulseVelocity-9UxMQ8M, reason: not valid java name */
    private final long m1919getImpulseVelocity9UxMQ8M() {
        PointAtTime pointAtTime = this.samples[this.index];
        if (pointAtTime == null) {
            return VelocityKt.Velocity(0.0f, 0.0f);
        }
        ImpulseCalculator impulseCalculator = new ImpulseCalculator();
        ImpulseCalculator impulseCalculator2 = new ImpulseCalculator();
        int i = this.index;
        int i2 = 0;
        do {
            i = (i + 1) % 20;
            PointAtTime pointAtTime2 = this.samples[i];
            if (pointAtTime2 != null) {
                long time = pointAtTime.getTime() - pointAtTime2.getTime();
                long abs = Math.abs(pointAtTime2.getTime() - pointAtTime.getTime());
                if (time <= 100) {
                    if (abs > 40) {
                        impulseCalculator.reset();
                        impulseCalculator2.reset();
                    }
                    long j = -time;
                    impulseCalculator.addPosition(j, Offset.m1297getXimpl(pointAtTime2.getPoint()));
                    impulseCalculator2.addPosition(j, Offset.m1298getYimpl(pointAtTime2.getPoint()));
                    i2++;
                }
            }
            if (i == this.index) {
                break;
            }
        } while (i2 < 20);
        if (i2 < 3) {
            return VelocityKt.Velocity(0.0f, 0.0f);
        }
        return VelocityKt.Velocity(impulseCalculator.getVelocity(), impulseCalculator2.getVelocity());
    }

    private final VelocityEstimate getLsq2VelocityEstimate() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.index;
        PointAtTime pointAtTime = this.samples[i];
        if (pointAtTime == null) {
            return VelocityEstimate.INSTANCE.getNone();
        }
        int i2 = 0;
        PointAtTime pointAtTime2 = pointAtTime;
        while (true) {
            PointAtTime pointAtTime3 = this.samples[i];
            if (pointAtTime3 != null) {
                float time = pointAtTime.getTime() - pointAtTime3.getTime();
                float abs = Math.abs(pointAtTime3.getTime() - pointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                long point = pointAtTime3.getPoint();
                arrayList.add(Float.valueOf(Offset.m1297getXimpl(point)));
                arrayList2.add(Float.valueOf(Offset.m1298getYimpl(point)));
                arrayList3.add(Float.valueOf(-time));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    pointAtTime2 = pointAtTime3;
                    break;
                }
                pointAtTime2 = pointAtTime3;
            } else {
                break;
            }
        }
        if (i2 >= 3) {
            try {
                PolynomialFit polyFitLeastSquares = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList, 2);
                PolynomialFit polyFitLeastSquares2 = VelocityTrackerKt.polyFitLeastSquares(arrayList3, arrayList2, 2);
                float f = 1000;
                return new VelocityEstimate(OffsetKt.Offset(((Number) polyFitLeastSquares.getCoefficients().get(1)).floatValue() * f, ((Number) polyFitLeastSquares2.getCoefficients().get(1)).floatValue() * f), polyFitLeastSquares.getConfidence() * polyFitLeastSquares2.getConfidence(), pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m1301minusMKHz9U(pointAtTime.getPoint(), pointAtTime2.getPoint()), null);
            } catch (IllegalArgumentException unused) {
                return VelocityEstimate.INSTANCE.getNone();
            }
        }
        return new VelocityEstimate(Offset.INSTANCE.m1308getZeroF1C5BW0(), 1.0f, pointAtTime.getTime() - pointAtTime2.getTime(), Offset.m1301minusMKHz9U(pointAtTime.getPoint(), pointAtTime2.getPoint()), null);
    }
}
