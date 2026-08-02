package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ SelfieState.WaitForWebRtcSetup f$1;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda0(SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, SelfieWorkflow selfieWorkflow, WebRtcWorker.Response response, SelfieWorkflow.Input input, StatefulWorkflow.RenderContext renderContext) {
        this.f$1 = waitForWebRtcSetup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SelfieState.WaitForWebRtcSetup waitForWebRtcSetup = this.f$1;
        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
        switch (i) {
            case 0:
                updater.getClass();
                updater.state = new SelfieState.RestartCamera(false, false, SelfieWorkflowUtilsKt.createBackState(updater, false), waitForWebRtcSetup.cameraFacingMode);
                break;
            default:
                updater.getClass();
                CameraProperties cameraProperties = waitForWebRtcSetup.cameraProperties;
                cameraProperties.size.getWidth();
                cameraProperties.size.getHeight();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda0(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        this.f$1 = waitForWebRtcSetup;
    }
}
