package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedVisibility.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ MutableState<Boolean> $isAnimationVisible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, MutableState<Boolean> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$childTransition = transition;
        this.$isAnimationVisible = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Transition<EnterExitState> transition = this.$childTransition;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Boolean mo4828invoke() {
                    Object currentState = transition.getCurrentState();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(currentState == enterExitState || transition.getTargetState() == enterExitState);
                }
            });
            final MutableState<Boolean> mutableState = this.$isAnimationVisible;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation continuation) {
                    MutableState.this.setValue(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
