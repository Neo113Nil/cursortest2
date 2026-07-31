package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class Animatable$runAnimation$2 extends SuspendLambda implements Function1 {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1 $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$runAnimation$2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation continuation) {
        return ((Animatable$runAnimation$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AnimationState animationState;
        Ref$BooleanRef ref$BooleanRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getInternalState().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                final AnimationState copy$default = AnimationStateKt.copy$default(this.this$0.getInternalState(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                Animation<T, V> animation = this.$animation;
                long j = this.$startTime;
                final Animatable<T, V> animatable = this.this$0;
                final Function1 function1 = this.$block;
                Function1 function12 = new Function1() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull AnimationScope<T, V> animate) {
                        Object clampToBounds;
                        Intrinsics.checkNotNullParameter(animate, "$this$animate");
                        SuspendAnimationKt.updateState(animate, animatable.getInternalState());
                        clampToBounds = animatable.clampToBounds(animate.getValue());
                        if (!Intrinsics.areEqual(clampToBounds, animate.getValue())) {
                            animatable.getInternalState().setValue$animation_core_release(clampToBounds);
                            copy$default.setValue$animation_core_release(clampToBounds);
                            Function1 function13 = function1;
                            if (function13 != null) {
                                function13.invoke(animatable);
                            }
                            animate.cancelAnimation();
                            ref$BooleanRef2.element = true;
                            return;
                        }
                        Function1 function14 = function1;
                        if (function14 != null) {
                            function14.invoke(animatable);
                        }
                    }
                };
                this.L$0 = copy$default;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j, function12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animationState = copy$default;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                animationState = (AnimationState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            this.this$0.endAnimation();
            throw e;
        }
    }
}
