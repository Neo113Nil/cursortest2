package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {434}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Transition$animateTo$1$1 extends SuspendLambda implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1(Transition<S> transition, Continuation continuation) {
        super(2, continuation);
        this.this$0 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, continuation);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((Transition$animateTo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            final float durationScale = SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
            final Transition<S> transition = this.this$0;
            function1 = new Function1() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Number) obj2).longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    if (transition.isSeeking()) {
                        return;
                    }
                    transition.onFrame$animation_core_release(j, durationScale);
                }
            };
            this.L$0 = coroutineScope;
            this.label = 1;
        } while (MonotonicFrameClockKt.withFrameNanos(function1, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
