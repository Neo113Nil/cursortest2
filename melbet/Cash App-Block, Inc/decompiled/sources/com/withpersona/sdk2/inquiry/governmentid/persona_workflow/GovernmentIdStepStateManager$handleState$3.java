package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class GovernmentIdStepStateManager$handleState$3 extends SuspendLambda implements Function1 {
    public final /* synthetic */ GovernmentIdStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdStepStateManager$handleState$3(GovernmentIdStepStateManager governmentIdStepStateManager, Continuation continuation) {
        super(1, continuation);
        this.this$0 = governmentIdStepStateManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GovernmentIdStepStateManager$handleState$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((GovernmentIdStepStateManager$handleState$3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.this$0.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
        return Unit.INSTANCE;
    }
}
