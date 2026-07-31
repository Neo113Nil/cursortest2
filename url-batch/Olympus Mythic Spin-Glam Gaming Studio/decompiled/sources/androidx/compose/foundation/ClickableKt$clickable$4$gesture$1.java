package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ClickableKt$clickable$4$gesture$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ State<Function0> $delayPressInteraction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<Function0> $onClickState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$clickable$4$gesture$1(boolean z, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends Function0> state, State<? extends Function0> state2, Continuation continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
        this.$delayPressInteraction = state;
        this.$onClickState = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ClickableKt$clickable$4$gesture$1 clickableKt$clickable$4$gesture$1 = new ClickableKt$clickable$4$gesture$1(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, continuation);
        clickableKt$clickable$4$gesture$1.L$0 = obj;
        return clickableKt$clickable$4$gesture$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((ClickableKt$clickable$4$gesture$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Clickable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3 {
        final /* synthetic */ State<Function0> $delayPressInteraction;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends Function0> state, Continuation continuation) {
            super(3, continuation);
            this.$enabled = z;
            this.$interactionSource = mutableInteractionSource;
            this.$pressedInteraction = mutableState;
            this.$delayPressInteraction = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m176invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (Continuation) obj3);
        }

        @Nullable
        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m176invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, continuation);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (this.$enabled) {
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    MutableState<PressInteraction.Press> mutableState = this.$pressedInteraction;
                    State<Function0> state = this.$delayPressInteraction;
                    this.label = 1;
                    if (ClickableKt.m175handlePressInteractionEPk0efs(pressGestureScope, j, mutableInteractionSource, mutableState, state, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, null);
            final boolean z = this.$enabled;
            final State<Function0> state = this.$onClickState;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m177invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m177invokek4lQ0M(long j) {
                    if (z) {
                        ((Function0) state.getValue()).mo4828invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, function1, this) == coroutine_suspended) {
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
