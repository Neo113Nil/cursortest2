package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: FloatAnimationSpec.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", IronSourceConstants.EVENTS_DURATION, POBCTAOverlayData.KEY_CTA_DELAY, "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "", "playTime", "clampPlayTime", "(J)J", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getDurationNanos", "(FFF)J", "getVelocityFromNanos", "I", "getDuration", "()I", "getDelay", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    private final int delay;
    private final int duration;
    private final Easing easing;

    public FloatTweenSpec(int i, int i2, Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.duration = i;
        this.delay = i2;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long clampPlayTime = clampPlayTime(playTimeNanos / 1000000);
        int i = this.duration;
        return VectorConvertersKt.lerp(initialValue, targetValue, this.easing.transform(RangesKt.coerceIn(i == 0 ? 1.0f : clampPlayTime / i, 0.0f, 1.0f)));
    }

    private final long clampPlayTime(long playTime) {
        return RangesKt.coerceIn(playTime - this.delay, 0L, this.duration);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long clampPlayTime = clampPlayTime(playTimeNanos / 1000000);
        if (clampPlayTime < 0) {
            return 0.0f;
        }
        if (clampPlayTime == 0) {
            return initialVelocity;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, initialValue, targetValue, initialVelocity) - getValueFromNanos((clampPlayTime - 1) * 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }
}
