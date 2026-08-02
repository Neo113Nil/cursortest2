package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdStepStateManager f$0;

    public /* synthetic */ GovernmentIdStepStateManager$$ExternalSyntheticLambda0(GovernmentIdStepStateManager governmentIdStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdStepStateManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
        GovernmentIdStepStateManager governmentIdStepStateManager = this.f$0;
        switch (i) {
            case 0:
                governmentIdStepStateManager.goBack();
                break;
            case 1:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 2:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 3:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 4:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 5:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 6:
                governmentIdStepStateManager.goBack();
                break;
            case 7:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 8:
                WorkflowState state = ((SubtreeManager) governmentIdStepStateManager.lastChild).getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
                if (waitForAutocapture != null) {
                    governmentIdStepStateManager.videoCaptureHelper.getClass();
                    governmentIdStepStateManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
            case 9:
                WorkflowState state2 = ((SubtreeManager) governmentIdStepStateManager.lastChild).getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state2 : null;
                if (waitForAutocapture2 != null) {
                    governmentIdStepStateManager.videoCaptureHelper.getClass();
                    governmentIdStepStateManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
            case 10:
                WorkflowState state3 = ((SubtreeManager) governmentIdStepStateManager.lastChild).getState();
                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = state3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state3 : null;
                if (waitForAutocapture3 != null) {
                    governmentIdStepStateManager.videoCaptureHelper.getClass();
                    governmentIdStepStateManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, null, WebRtcState.Disconnected, null, false, false, null, 32639));
                }
                break;
            case 11:
                governmentIdStepStateManager.setOutput(canceled);
                break;
            case 12:
                governmentIdStepStateManager.goBack();
                break;
            case 13:
                governmentIdStepStateManager.goBack();
                break;
            default:
                governmentIdStepStateManager.setOutput(canceled);
                break;
        }
        return Unit.INSTANCE;
    }
}
