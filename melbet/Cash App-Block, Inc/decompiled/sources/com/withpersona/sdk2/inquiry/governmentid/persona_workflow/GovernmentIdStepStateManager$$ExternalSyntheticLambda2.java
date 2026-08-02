package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdWorkflow.Input f$0;
    public final /* synthetic */ GovernmentIdState f$1;
    public final /* synthetic */ GovernmentIdStepStateManager f$2;

    public /* synthetic */ GovernmentIdStepStateManager$$ExternalSyntheticLambda2(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, GovernmentIdStepStateManager governmentIdStepStateManager) {
        this.$r8$classId = 1;
        this.f$2 = governmentIdStepStateManager;
        this.f$1 = governmentIdState;
        this.f$0 = input;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdStepStateManager governmentIdStepStateManager = this.f$2;
        GovernmentIdState governmentIdState = this.f$1;
        GovernmentIdWorkflow.Input input = this.f$0;
        switch (i) {
            case 0:
                GovernmentIdStateManagerUtilsKt.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, (SubtreeManager) governmentIdStepStateManager.lastChild, governmentIdStepStateManager.videoCaptureHelper, governmentIdStepStateManager.trackingEventsLogger);
                break;
            case 1:
                SubtreeManager subtreeManager = (SubtreeManager) governmentIdStepStateManager.lastChild;
                WorkflowState state = subtreeManager.getState();
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = state instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) state : null;
                if (chooseCaptureMethod != null) {
                    GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
                    IdPart$SideIdPart idPart$SideIdPart = chooseCaptureMethod2.currentPart;
                    governmentIdStepStateManager.updateState(new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, chooseCaptureMethod2.uploadingIds, chooseCaptureMethod2.captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input, idPart$SideIdPart.side), chooseCaptureMethod.parts, chooseCaptureMethod.partIndex, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager, false), WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, chooseCaptureMethod2.countryCode, null, new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager, 10), 11776));
                    break;
                } else {
                    break;
                }
            default:
                GovernmentIdStateManagerUtilsKt.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, (SubtreeManager) governmentIdStepStateManager.lastChild, governmentIdStepStateManager.videoCaptureHelper, governmentIdStepStateManager.trackingEventsLogger);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GovernmentIdStepStateManager$$ExternalSyntheticLambda2(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, GovernmentIdStepStateManager governmentIdStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = input;
        this.f$1 = governmentIdState;
        this.f$2 = governmentIdStepStateManager;
    }
}
