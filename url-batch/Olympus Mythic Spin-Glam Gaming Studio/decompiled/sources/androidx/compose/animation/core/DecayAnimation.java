package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Animation.kt */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u001a\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "initialValueVector", "Landroidx/compose/animation/core/AnimationVector;", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "endVelocity", "targetValue", "getTargetValue", "durationNanos", "J", "getDurationNanos", "()J", "", "isInfinite", "Z", "()Z", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    private final VectorizedDecayAnimationSpec animationSpec;
    private final long durationNanos;
    private final AnimationVector endVelocity;
    private final Object initialValue;
    private final AnimationVector initialValueVector;
    private final AnimationVector initialVelocityVector;
    private final boolean isInfinite;
    private final Object targetValue;
    private final TwoWayConverter typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec animationSpec, TwoWayConverter typeConverter, Object obj, AnimationVector initialVelocityVector) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = obj;
        AnimationVector animationVector = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this.initialValueVector = animationVector;
        this.initialVelocityVector = AnimationVectorsKt.copy(initialVelocityVector);
        this.targetValue = getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(animationVector, initialVelocityVector));
        this.durationNanos = animationSpec.getDurationNanos(animationVector, initialVelocityVector);
        AnimationVector copy = AnimationVectorsKt.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), animationVector, initialVelocityVector));
        this.endVelocity = copy;
        int size = copy.getSize();
        for (int i = 0; i < size; i++) {
            AnimationVector animationVector2 = this.endVelocity;
            animationVector2.set$animation_core_release(i, RangesKt.coerceIn(animationVector2.get$animation_core_release(i), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public Object getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: isInfinite, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(DecayAnimationSpec animationSpec, TwoWayConverter typeConverter, Object obj, AnimationVector initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, obj, initialVelocityVector);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
    }

    @Override // androidx.compose.animation.core.Animation
    public Object getValueFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(playTimeNanos, this.initialValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public AnimationVector getVelocityVectorFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            return this.animationSpec.getVelocityFromNanos(playTimeNanos, this.initialValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }
}
