package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: SuspendAnimation.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a}\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0013\u001aw\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u001c\u001as\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010!\u001aM\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000e\"\b\b\u0002\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "frameTimeNanos", "durationScale", "anim", "doAnimationFrameWithScale", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "doAnimationFrame", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SuspendAnimationKt {
    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f4, animationSpec, function2, continuation);
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        Object animate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f), Boxing.boxFloat(f2), Boxing.boxFloat(f3), animationSpec, function2, continuation);
        return animate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : Unit.INSTANCE;
    }

    public static final Object animateDecay(float f, float f2, FloatDecayAnimationSpec floatDecayAnimationSpec, final Function2 function2, Continuation continuation) {
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0L, new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                Function2.this.invoke(animate.getValue(), Float.valueOf(((AnimationVector1D) animate.getVelocityVector()).getValue()));
            }
        }, continuation, 2, null);
        return animate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : Unit.INSTANCE;
    }

    public static final Object animate(final TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, final Function2 function2, Continuation continuation) {
        AnimationVector newInstance;
        if (obj3 == null || (newInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(obj3)) == null) {
            newInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(obj));
        }
        Object animate$default = animate$default(new AnimationState(twoWayConverter, obj, newInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, newInstance), 0L, new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                invoke((AnimationScope<Object, AnimationVector>) obj4);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AnimationScope<Object, AnimationVector> animate) {
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                Function2.this.invoke(animate.getValue(), twoWayConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
            }
        }, continuation, 2, null);
        return animate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, function1, continuation);
    }

    public static final Object animateTo(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, Continuation continuation) {
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), obj, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return animate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, continuation);
    }

    public static final Object animateDecay(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, Continuation continuation) {
        Object animate = animate(animationState, new DecayAnimation(decayAnimationSpec, animationState.getTypeConverter(), animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return animate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[Catch: CancellationException -> 0x0045, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0045, blocks: (B:13:0x0041, B:16:0x00e6, B:18:0x00f3), top: B:12:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animate(final AnimationState animationState, final Animation animation, long j, final Function1 function1, Continuation continuation) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42;
        Object coroutine_suspended;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Function1 function12;
        AnimationState animationState2;
        AnimationScope animationScope;
        AnimationScope animationScope2;
        T t;
        Function1 function13;
        Function1 function14;
        Animation animation2;
        final AnimationState animationState3 = animationState;
        Animation animation3 = animation;
        if (continuation instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuation;
            int i2 = suspendAnimationKt$animate$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label = i2 - Integer.MIN_VALUE;
                suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                Object obj = suspendAnimationKt$animate$42.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = suspendAnimationKt$animate$42.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Object valueFromNanos = animation3.getValueFromNanos(0L);
                    final AnimationVector velocityVectorFromNanos = animation3.getVelocityVectorFromNanos(0L);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        if (j == Long.MIN_VALUE) {
                            final float durationScale = getDurationScale(suspendAnimationKt$animate$42.getContext());
                            Function1 function15 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke(((Number) obj2).longValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
                                public final void invoke(long j2) {
                                    Ref$ObjectRef<AnimationScope<Object, AnimationVector>> ref$ObjectRef3 = ref$ObjectRef2;
                                    Object obj2 = valueFromNanos;
                                    TwoWayConverter typeConverter = animation.getTypeConverter();
                                    AnimationVector animationVector = velocityVectorFromNanos;
                                    Object targetValue = animation.getTargetValue();
                                    final AnimationState<Object, AnimationVector> animationState4 = animationState;
                                    ?? animationScope3 = new AnimationScope(obj2, typeConverter, animationVector, j2, targetValue, j2, true, new Function0() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m131invoke() {
                                            animationState4.setRunning$animation_core_release(false);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                            m131invoke();
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    SuspendAnimationKt.doAnimationFrameWithScale(animationScope3, j2, durationScale, animation, animationState, function1);
                                    ref$ObjectRef3.element = animationScope3;
                                }
                            };
                            suspendAnimationKt$animate$42.L$0 = animationState3;
                            suspendAnimationKt$animate$42.L$1 = animation3;
                            function12 = function1;
                            suspendAnimationKt$animate$42.L$2 = function12;
                            suspendAnimationKt$animate$42.L$3 = ref$ObjectRef2;
                            suspendAnimationKt$animate$42.label = 1;
                            if (callWithFrameNanos(animation3, function15, suspendAnimationKt$animate$42) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            function12 = function1;
                            try {
                                ?? animationScope3 = new AnimationScope(valueFromNanos, animation.getTypeConverter(), velocityVectorFromNanos, j, animation.getTargetValue(), j, true, new Function0() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m132invoke() {
                                        animationState3.setRunning$animation_core_release(false);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                        m132invoke();
                                        return Unit.INSTANCE;
                                    }
                                });
                                ref$ObjectRef2 = ref$ObjectRef2;
                                doAnimationFrameWithScale(animationScope3, j, getDurationScale(suspendAnimationKt$animate$42.getContext()), animation, animationState, function1);
                                ref$ObjectRef2.element = animationScope3;
                            } catch (CancellationException e) {
                                e = e;
                                ref$ObjectRef2 = ref$ObjectRef2;
                                ref$ObjectRef = ref$ObjectRef2;
                                animationScope = (AnimationScope) ref$ObjectRef.element;
                                if (animationScope != null) {
                                    animationScope.setRunning$animation_core_release(false);
                                }
                                animationScope2 = (AnimationScope) ref$ObjectRef.element;
                                if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                                    animationState3.setRunning$animation_core_release(false);
                                }
                                throw e;
                            }
                        }
                        animationState2 = animationState3;
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (CancellationException e2) {
                        e = e2;
                    }
                } else {
                    if (i == 1) {
                        ref$ObjectRef = (Ref$ObjectRef) suspendAnimationKt$animate$42.L$3;
                        function14 = (Function1) suspendAnimationKt$animate$42.L$2;
                        animation2 = (Animation) suspendAnimationKt$animate$42.L$1;
                        animationState2 = (AnimationState) suspendAnimationKt$animate$42.L$0;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$ObjectRef = (Ref$ObjectRef) suspendAnimationKt$animate$42.L$3;
                        function14 = (Function1) suspendAnimationKt$animate$42.L$2;
                        animation2 = (Animation) suspendAnimationKt$animate$42.L$1;
                        animationState2 = (AnimationState) suspendAnimationKt$animate$42.L$0;
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        function12 = function14;
                        animation3 = animation2;
                    } catch (CancellationException e3) {
                        e = e3;
                        animationState3 = animationState2;
                        animationScope = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope != null) {
                        }
                        animationScope2 = (AnimationScope) ref$ObjectRef.element;
                        if (animationScope2 != null) {
                            animationState3.setRunning$animation_core_release(false);
                        }
                        throw e;
                    }
                }
                do {
                    t = ref$ObjectRef.element;
                    Intrinsics.checkNotNull(t);
                    if (!((AnimationScope) t).isRunning()) {
                        final float durationScale2 = getDurationScale(suspendAnimationKt$animate$42.getContext());
                        final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                        final Animation animation4 = animation3;
                        final AnimationState animationState4 = animationState2;
                        final Function1 function16 = function12;
                        function13 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke(((Number) obj2).longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j2) {
                                AnimationScope<Object, AnimationVector> animationScope4 = ref$ObjectRef3.element;
                                Intrinsics.checkNotNull(animationScope4);
                                SuspendAnimationKt.doAnimationFrameWithScale(animationScope4, j2, durationScale2, animation4, animationState4, function16);
                            }
                        };
                        suspendAnimationKt$animate$42.L$0 = animationState2;
                        suspendAnimationKt$animate$42.L$1 = animation3;
                        suspendAnimationKt$animate$42.L$2 = function12;
                        suspendAnimationKt$animate$42.L$3 = ref$ObjectRef;
                        suspendAnimationKt$animate$42.label = 2;
                    } else {
                        return Unit.INSTANCE;
                    }
                } while (callWithFrameNanos(animation3, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuation);
        suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        Object obj2 = suspendAnimationKt$animate$42.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = suspendAnimationKt$animate$42.label;
        if (i != 0) {
        }
        do {
            t = ref$ObjectRef.element;
            Intrinsics.checkNotNull(t);
            if (!((AnimationScope) t).isRunning()) {
            }
        } while (callWithFrameNanos(animation3, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                public final void invoke(@NotNull AnimationScope animationScope) {
                    Intrinsics.checkNotNullParameter(animationScope, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    private static final Object callWithFrameNanos(Animation animation, final Function1 function1, Continuation continuation) {
        if (animation.getIsInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final Object invoke(long j) {
                return Function1.this.invoke(Long.valueOf(j));
            }
        }, continuation);
    }

    public static final float getDurationScale(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void updateState(AnimationScope animationScope, AnimationState state) {
        Intrinsics.checkNotNullParameter(animationScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        state.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(state.getVelocityVector(), animationScope.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(animationScope.isRunning());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doAnimationFrameWithScale(AnimationScope animationScope, long j, float f, Animation animation, AnimationState animationState, Function1 function1) {
        long startTimeNanos;
        if (f == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = (long) ((j - animationScope.getStartTimeNanos()) / f);
        }
        doAnimationFrame(animationScope, j, startTimeNanos, animation, animationState, function1);
    }

    private static final void doAnimationFrame(AnimationScope animationScope, long j, long j2, Animation animation, AnimationState animationState, Function1 function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }
}
