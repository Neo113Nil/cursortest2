package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Animatable.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B/\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ]\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\u0011\u001a\u00028\u00002 \u0010\u0014\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJe\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u0011\u001a\u00028\u00002\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R+\u00105\u001a\u0002012\u0006\u00102\u001a\u0002018F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010\u001c\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010J\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010GR\u0011\u0010\f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bK\u0010;R\u0011\u0010N\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bO\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "", "value", "createVector", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "block", "Landroidx/compose/animation/core/AnimationResult;", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "()V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Animatable<T, V extends AnimationVector> {
    private final SpringSpec defaultSpringSpec;
    private final AnimationState internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning;
    private AnimationVector lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final AnimationVector negativeInfinityBounds;
    private final AnimationVector positiveInfinityBounds;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final MutableState targetValue;
    private final TwoWayConverter typeConverter;
    private AnimationVector upperBoundVector;
    private final Object visibilityThreshold;

    public Animatable(Object obj, TwoWayConverter typeConverter, Object obj2) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = obj2;
        this.internalState = new AnimationState(typeConverter, obj, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec(0.0f, 0.0f, obj2, 3, null);
        AnimationVector createVector = createVector(obj, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = createVector;
        AnimationVector createVector2 = createVector(obj, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = createVector2;
        this.lowerBoundVector = createVector;
        this.upperBoundVector = createVector2;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }

    public final TwoWayConverter getTypeConverter() {
        return this.typeConverter;
    }

    /* renamed from: getInternalState$animation_core_release, reason: from getter */
    public final AnimationState getInternalState() {
        return this.internalState;
    }

    public final Object getValue() {
        return this.internalState.getValue();
    }

    public final AnimationVector getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final Object getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(Object obj) {
        this.targetValue.setValue(obj);
    }

    public final Object getTargetValue() {
        return this.targetValue.getValue();
    }

    private final AnimationVector createVector(Object obj, float f) {
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(obj);
        int size = animationVector.getSize();
        for (int i = 0; i < size; i++) {
            animationVector.set$animation_core_release(i, f);
        }
        return animationVector;
    }

    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i, Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, function1, continuation);
    }

    public final Object animateTo(Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), obj, obj2), obj2, function1, continuation);
    }

    private final Object runAnimation(Animation animation, Object obj, Function1 function1, Continuation continuation) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, obj, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clampToBounds(Object value) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(value);
        int size = animationVector.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (animationVector.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || animationVector.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                animationVector.set$animation_core_release(i, RangesKt.coerceIn(animationVector.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
                z = true;
            }
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(animationVector) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    public final Object snapTo(Object obj, Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, obj, null), continuation, 1, null);
        return mutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : Unit.INSTANCE;
    }

    public final Object stop(Continuation continuation) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), continuation, 1, null);
        return mutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : Unit.INSTANCE;
    }

    public final State asState() {
        return this.internalState;
    }
}
