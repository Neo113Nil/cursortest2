package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Animation.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u000b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010&\u001a\u00020\u00108VX\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010,\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "initialValue", "targetValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "getTargetValue", "initialValueVector", "Landroidx/compose/animation/core/AnimationVector;", "targetValueVector", "durationNanos", "J", "getDurationNanos", "()J", "endVelocity", "", "isInfinite", "()Z", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    private final VectorizedAnimationSpec animationSpec;
    private final long durationNanos;
    private final AnimationVector endVelocity;
    private final Object initialValue;
    private final AnimationVector initialValueVector;
    private final AnimationVector initialVelocityVector;
    private final Object targetValue;
    private final AnimationVector targetValueVector;
    private final TwoWayConverter typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec animationSpec, TwoWayConverter typeConverter, Object obj, Object obj2, AnimationVector animationVector) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = obj;
        this.targetValue = obj2;
        AnimationVector animationVector2 = (AnimationVector) getTypeConverter().getConvertToVector().invoke(obj);
        this.initialValueVector = animationVector2;
        AnimationVector animationVector3 = (AnimationVector) getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.targetValueVector = animationVector3;
        AnimationVector newInstance = (animationVector == null || (newInstance = AnimationVectorsKt.copy(animationVector)) == null) ? AnimationVectorsKt.newInstance((AnimationVector) getTypeConverter().getConvertToVector().invoke(obj)) : newInstance;
        this.initialVelocityVector = newInstance;
        this.durationNanos = animationSpec.getDurationNanos(animationVector2, animationVector3, newInstance);
        this.endVelocity = animationSpec.getEndVelocity(animationVector2, animationVector3, newInstance);
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    public final Object getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public Object getTargetValue() {
        return this.targetValue;
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, twoWayConverter, obj, obj2, (i & 16) != 0 ? null : animationVector);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter typeConverter, Object obj, Object obj2, AnimationVector animationVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, obj, obj2, animationVector);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: isInfinite */
    public boolean getIsInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public Object getValueFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            return getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector));
        }
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.Animation
    public AnimationVector getVelocityVectorFromNanos(long playTimeNanos) {
        if (!isFinishedFromNanos(playTimeNanos)) {
            return this.animationSpec.getVelocityFromNanos(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this.endVelocity;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms";
    }
}
