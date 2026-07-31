package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: VectorizedAnimationSpec.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "anim", "Landroidx/compose/animation/core/FloatAnimationSpec;", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "anims", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    private final Animations anims;
    private AnimationVector endVelocityVector;
    private AnimationVector valueVector;
    private AnimationVector velocityVector;

    public VectorizedFloatAnimationSpec(Animations anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.anims = anims;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(final FloatAnimationSpec anim) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int index) {
                return FloatAnimationSpec.this;
            }
        });
        Intrinsics.checkNotNullParameter(anim, "anim");
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = AnimationVectorsKt.newInstance(initialValue);
        }
        AnimationVector animationVector = this.valueVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i = 0; i < size; i++) {
            AnimationVector animationVector2 = this.valueVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.anims.get(i).getValueFromNanos(playTimeNanos, initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.valueVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long playTimeNanos, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = AnimationVectorsKt.newInstance(initialVelocity);
        }
        AnimationVector animationVector = this.velocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i = 0; i < size; i++) {
            AnimationVector animationVector2 = this.velocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.anims.get(i).getVelocityFromNanos(playTimeNanos, initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.velocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getEndVelocity(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = AnimationVectorsKt.newInstance(initialVelocity);
        }
        AnimationVector animationVector = this.endVelocityVector;
        if (animationVector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            animationVector = null;
        }
        int size = animationVector.getSize();
        for (int i = 0; i < size; i++) {
            AnimationVector animationVector2 = this.endVelocityVector;
            if (animationVector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                animationVector2 = null;
            }
            animationVector2.set$animation_core_release(i, this.anims.get(i).getEndVelocity(initialValue.get$animation_core_release(i), targetValue.get$animation_core_release(i), initialVelocity.get$animation_core_release(i)));
        }
        AnimationVector animationVector3 = this.endVelocityVector;
        if (animationVector3 != null) {
            return animationVector3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Iterator it = RangesKt.until(0, initialValue.getSize()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            j = Math.max(j, this.anims.get(nextInt).getDurationNanos(initialValue.get$animation_core_release(nextInt), targetValue.get$animation_core_release(nextInt), initialVelocity.get$animation_core_release(nextInt)));
        }
        return j;
    }
}
