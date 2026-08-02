package com.withpersona.sdk2.inquiry.ui.state;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiStepStateManager$handleState$6$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ UiState.Displaying.AutoSubmit $it;
    public final /* synthetic */ UiState $renderState;
    public int label;
    public final /* synthetic */ UiStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStepStateManager$handleState$6$1(UiState.Displaying.AutoSubmit autoSubmit, UiStepStateManager uiStepStateManager, UiState uiState, Continuation continuation) {
        super(1, continuation);
        this.$it = autoSubmit;
        this.this$0 = uiStepStateManager;
        this.$renderState = uiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UiStepStateManager$handleState$6$1(this.$it, this.this$0, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UiStepStateManager$handleState$6$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            if (JobKt.delay(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        UiState.Displaying.AutoSubmit autoSubmit = this.$it;
        int i2 = autoSubmit.countdown - 1;
        UiState.Displaying displaying = (UiState.Displaying) this.$renderState;
        AutoSubmitableComponent autoSubmitableComponent = autoSubmit.component;
        String autoSubmitCountdownText = autoSubmitableComponent.getAutoSubmitCountdownText();
        this.this$0.updateState(UiState.Displaying.copy$default(displaying, null, null, null, null, new UiState.Displaying.AutoSubmit(autoSubmitableComponent, i2, autoSubmitCountdownText != null ? StringsKt__StringsJVMKt.replace$default(autoSubmitCountdownText, "{time}", String.valueOf(i2)) : null), null, false, null, null, null, false, null, 0, 65471));
        return Unit.INSTANCE;
    }
}
