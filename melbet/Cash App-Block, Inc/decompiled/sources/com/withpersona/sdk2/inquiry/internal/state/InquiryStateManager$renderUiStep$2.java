package com.withpersona.sdk2.inquiry.internal.state;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryStateManager$renderUiStep$2 extends SuspendLambda implements Function1 {
    public int label;
    public final /* synthetic */ InquiryStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryStateManager$renderUiStep$2(InquiryStateManager inquiryStateManager, Continuation continuation) {
        super(1, continuation);
        this.this$0 = inquiryStateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InquiryStateManager$renderUiStep$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InquiryStateManager$renderUiStep$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            if (JobKt.delay(2000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        InquiryStateManager inquiryStateManager = this.this$0;
        WorkflowState state = ((SubtreeManager) inquiryStateManager.lastChild).getState();
        InquiryState.UiStepRunning uiStepRunning = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
        if (uiStepRunning == null) {
            return Unit.INSTANCE;
        }
        inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, null, null, false, 983039));
        return Unit.INSTANCE;
    }
}
