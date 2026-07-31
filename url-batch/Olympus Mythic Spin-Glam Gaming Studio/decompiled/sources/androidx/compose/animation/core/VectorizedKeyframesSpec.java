package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VectorizedAnimationSpec.kt */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ-\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001dR\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "keyframes", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "delayMillis", "(Ljava/util/Map;II)V", "getDelayMillis", "()I", "getDurationMillis", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "value", "(Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    private final int delayMillis;
    private final int durationMillis;
    private final Map keyframes;
    private AnimationVector valueVector;
    private AnimationVector velocityVector;

    public VectorizedKeyframesSpec(Map keyframes, int i, int i2) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        this.keyframes = keyframes;
        this.durationMillis = i;
        this.delayMillis = i2;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        long clampPlayTime;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        int i = (int) clampPlayTime;
        if (this.keyframes.containsKey(Integer.valueOf(i))) {
            return (AnimationVector) ((Pair) MapsKt.getValue(this.keyframes, Integer.valueOf(i))).getFirst();
        }
        if (i >= getDurationMillis()) {
            return targetValue;
        }
        if (i <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        int i2 = 0;
        AnimationVector animationVector = initialValue;
        int i3 = 0;
        for (Map.Entry entry : this.keyframes.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Pair pair = (Pair) entry.getValue();
            if (i > intValue && intValue >= i3) {
                animationVector = (AnimationVector) pair.getFirst();
                linearEasing = (Easing) pair.getSecond();
                i3 = intValue;
            } else if (i < intValue && intValue <= durationMillis) {
                targetValue = (AnimationVector) pair.getFirst();
                durationMillis = intValue;
            }
        }
        float transform = linearEasing.transform((i - i3) / (durationMillis - i3));
        init(initialValue);
        int size = animationVector.getSize();
        while (true) {
            AnimationVector animationVector2 = null;
            if (i2 >= size) {
                break;
            }
            AnimationVector animationVector3 = this.valueVector;
            if (animationVector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            } else {
                animationVector2 = animationVector3;
            }
            animationVector2.set$animation_core_release(i2, VectorConvertersKt.lerp(animationVector.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), transform));
            i2++;
        }
        AnimationVector animationVector4 = this.valueVector;
        if (animationVector4 != null) {
            return animationVector4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    private final void init(AnimationVector value) {
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.newInstance(value);
            this.velocityVector = AnimationVectorsKt.newInstance(value);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        long clampPlayTime;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / 1000000);
        if (clampPlayTime <= 0) {
            return initialVelocity;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, initialValue, targetValue, initialVelocity);
        init(initialValue);
        int size = valueFromMillis.getSize();
        int i = 0;
        while (true) {
            AnimationVector animationVector = null;
            if (i >= size) {
                break;
            }
            AnimationVector animationVector2 = this.velocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                animationVector = animationVector2;
            }
            animationVector.set$animation_core_release(i, (valueFromMillis.get$animation_core_release(i) - valueFromMillis2.get$animation_core_release(i)) * 1000.0f);
            i++;
        }
        AnimationVector animationVector3 = this.velocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
