package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdStepStateManager f$0;

    public /* synthetic */ GovernmentIdStepStateManager$$ExternalSyntheticLambda1(GovernmentIdStepStateManager governmentIdStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdStepStateManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        GovernmentIdStepStateManager governmentIdStepStateManager = this.f$0;
        switch (i) {
            case 0:
                GovernmentIdWorkflow.Output output = (GovernmentIdWorkflow.Output) obj;
                output.getClass();
                governmentIdStepStateManager.setOutput(output);
                break;
            case 1:
                GovernmentIdWorkflow.Output output2 = (GovernmentIdWorkflow.Output) obj;
                output2.getClass();
                governmentIdStepStateManager.setOutput(output2);
                break;
            case 2:
                GovernmentIdWorkflow.Output output3 = (GovernmentIdWorkflow.Output) obj;
                output3.getClass();
                governmentIdStepStateManager.setOutput(output3);
                break;
            case 3:
                GovernmentIdWorkflow.Output output4 = (GovernmentIdWorkflow.Output) obj;
                output4.getClass();
                governmentIdStepStateManager.setOutput(output4);
                break;
            case 4:
                GovernmentIdWorkflow.Output output5 = (GovernmentIdWorkflow.Output) obj;
                output5.getClass();
                governmentIdStepStateManager.setOutput(output5);
                break;
            case 5:
                GovernmentIdWorkflow.Output output6 = (GovernmentIdWorkflow.Output) obj;
                output6.getClass();
                governmentIdStepStateManager.setOutput(output6);
                break;
            case 6:
                GovernmentIdWorkflow.Output output7 = (GovernmentIdWorkflow.Output) obj;
                output7.getClass();
                governmentIdStepStateManager.setOutput(output7);
                break;
            case 7:
                GovernmentIdWorkflow.Output output8 = (GovernmentIdWorkflow.Output) obj;
                output8.getClass();
                governmentIdStepStateManager.setOutput(output8);
                break;
            default:
                GovernmentIdState governmentIdState = (GovernmentIdState) obj;
                if (governmentIdState != null) {
                    JobKt.launch$default((ContextScope) governmentIdStepStateManager.parent, Dispatchers.Unconfined, null, new TransitionWorker$run$1(governmentIdStepStateManager, governmentIdState, null, 5), 2);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
