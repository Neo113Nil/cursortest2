package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda23 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieWorkflow f$0;
    public final /* synthetic */ SelfieWorkflow.Input f$1;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda23(SelfieWorkflow selfieWorkflow, SelfieWorkflow.Input input, int i) {
        this.$r8$classId = i;
        this.f$0 = selfieWorkflow;
        this.f$1 = input;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object countdownToCapture;
        int i = this.$r8$classId;
        SelfieWorkflow.Input input = this.f$1;
        SelfieWorkflow selfieWorkflow = this.f$0;
        switch (i) {
            case 0:
                ((Unit) obj).getClass();
                return Workflows.action$default(selfieWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda23(selfieWorkflow, input, 1));
            default:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj2 = updater.state;
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = obj2 instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) obj2 : null;
                if (startCaptureFaceDetected == null) {
                    return Unit.INSTANCE;
                }
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieWorkflow.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.COUNTDOWN_STARTED, "auto", startCaptureFaceDetected.getCurrentPose().name(), null, 8, null), false, 2, null);
                if (input.designVersion == DesignVersion.K0000 && startCaptureFaceDetected.getCurrentPose() == Selfie.Pose.Center && !startCaptureFaceDetected.selfies.isEmpty()) {
                    List list = startCaptureFaceDetected.posesNeeded;
                    List list2 = startCaptureFaceDetected.selfies;
                    long j = startCaptureFaceDetected.startCaptureTimestamp;
                    CameraProperties cameraProperties = startCaptureFaceDetected.cameraProperties;
                    long j2 = startCaptureFaceDetected.startSelfieTimestamp;
                    SelfieState createBackState = SelfieWorkflowUtilsKt.createBackState(updater, false);
                    countdownToCapture = new SelfieState.Capture(startCaptureFaceDetected.poseScore, 8193, j, j2, startCaptureFaceDetected.cameraFacingMode, cameraProperties, startCaptureFaceDetected.brightnessInfo, (SelfieError) null, input.poseConfigs, createBackState, list2, list, startCaptureFaceDetected.autoCaptureSupported, startCaptureFaceDetected.isFlashEnabled);
                } else {
                    countdownToCapture = new SelfieState.CountdownToCapture(startCaptureFaceDetected.startCaptureTimestamp, startCaptureFaceDetected.cameraProperties, startCaptureFaceDetected.startSelfieTimestamp, startCaptureFaceDetected.poseScore, startCaptureFaceDetected.brightnessInfo, startCaptureFaceDetected.posesNeeded, startCaptureFaceDetected.selfies, SelfieWorkflowUtilsKt.createBackState(updater, false), input.poseConfigs, startCaptureFaceDetected.autoCaptureSupported, startCaptureFaceDetected.cameraFacingMode, startCaptureFaceDetected.isFlashEnabled);
                }
                updater.state = countdownToCapture;
                return Unit.INSTANCE;
        }
    }
}
