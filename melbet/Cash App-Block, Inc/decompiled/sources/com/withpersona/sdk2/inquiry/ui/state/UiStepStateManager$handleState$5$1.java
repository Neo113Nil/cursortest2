package com.withpersona.sdk2.inquiry.ui.state;

import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiStepStateManager$handleState$5$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ ButtonComponent $it;
    public final /* synthetic */ UiState $renderState;
    public final /* synthetic */ UiStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStepStateManager$handleState$5$1(UiStepStateManager uiStepStateManager, UiState uiState, ButtonComponent buttonComponent, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uiStepStateManager;
        this.$renderState = uiState;
        this.$it = buttonComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UiStepStateManager$handleState$5$1(this.this$0, this.$renderState, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UiStepStateManager$handleState$5$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        UiState.Displaying displaying = (UiState.Displaying) this.$renderState;
        ButtonComponent buttonComponent = this.$it;
        Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
        autoSubmitIntervalSeconds.getClass();
        int intValue = autoSubmitIntervalSeconds.intValue();
        String autoSubmitCountdownText = buttonComponent.getAutoSubmitCountdownText();
        if (autoSubmitCountdownText != null) {
            Integer autoSubmitIntervalSeconds2 = buttonComponent.getAutoSubmitIntervalSeconds();
            autoSubmitIntervalSeconds2.getClass();
            str = StringsKt__StringsJVMKt.replace$default(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()));
        } else {
            str = null;
        }
        this.this$0.updateState(UiState.Displaying.copy$default(displaying, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, intValue, str), null, false, null, null, null, false, null, 0, 65471));
        return Unit.INSTANCE;
    }
}
