package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlingCalculator.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "", "friction", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(FLandroidx/compose/ui/unit/Density;)V", "computeDeceleration", "(Landroidx/compose/ui/unit/Density;)F", "velocity", "", "getSplineDeceleration", "(F)D", "", "flingDuration", "(F)J", "flingDistance", "(F)F", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "flingInfo", "(F)Landroidx/compose/animation/FlingCalculator$FlingInfo;", "F", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "magicPhysicalCoefficient", "FlingInfo", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlingCalculator {
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    public FlingCalculator(float f, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.friction = f;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        float computeDeceleration;
        computeDeceleration = FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
        return computeDeceleration;
    }

    private final double getSplineDeceleration(float velocity) {
        return AndroidFlingSpline.INSTANCE.deceleration(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final long flingDuration(float velocity) {
        float f;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = FlingCalculatorKt.DecelerationRate;
        return (long) (Math.exp(splineDeceleration / (f - 1.0d)) * 1000.0d);
    }

    public final float flingDistance(float velocity) {
        float f;
        float f2;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = FlingCalculatorKt.DecelerationRate;
        double d = f - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f2 = FlingCalculatorKt.DecelerationRate;
        return (float) (d2 * Math.exp((f2 / d) * splineDeceleration));
    }

    public final FlingInfo flingInfo(float velocity) {
        float f;
        float f2;
        double splineDeceleration = getSplineDeceleration(velocity);
        f = FlingCalculatorKt.DecelerationRate;
        double d = f - 1.0d;
        double d2 = this.friction * this.magicPhysicalCoefficient;
        f2 = FlingCalculatorKt.DecelerationRate;
        return new FlingInfo(velocity, (float) (d2 * Math.exp((f2 / d) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d) * 1000.0d));
    }

    /* compiled from: FlingCalculator.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "", "initialVelocity", "distance", "", IronSourceConstants.EVENTS_DURATION, "<init>", "(FFJ)V", "time", X3.i.L, "(J)F", "velocity", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getInitialVelocity", "()F", "getDistance", "J", "getDuration", "()J", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class FlingInfo {
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.initialVelocity), (Object) Float.valueOf(flingInfo.initialVelocity)) && Intrinsics.areEqual((Object) Float.valueOf(this.distance), (Object) Float.valueOf(flingInfo.distance)) && this.duration == flingInfo.duration;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public final float position(long time) {
            long j = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getDistanceCoefficient();
        }

        public final float velocity(long time) {
            long j = this.duration;
            return (((AndroidFlingSpline.INSTANCE.flingPosition(j > 0 ? time / j : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }
    }
}
