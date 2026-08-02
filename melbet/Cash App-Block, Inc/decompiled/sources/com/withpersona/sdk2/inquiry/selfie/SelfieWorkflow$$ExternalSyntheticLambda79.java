package com.withpersona.sdk2.inquiry.selfie;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction$OpenBrowser;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda79 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda79(SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = 16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean isRecoverable;
        boolean enqueueVerificationRequestWithRetry$lambda$3;
        int i = this.$r8$classId;
        PermissionRequestWorkflow.PermissionRequestState.RequestDeviceFeature requestDeviceFeature = PermissionRequestWorkflow.PermissionRequestState.RequestDeviceFeature.INSTANCE;
        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
        switch (i) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj2 = updater.state;
                SelfieState.CaptureTransition captureTransition = obj2 instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) obj2 : null;
                SelfieState selfieState = captureTransition != null ? captureTransition.nextState : null;
                if (selfieState != null) {
                    updater.state = selfieState;
                }
                return Unit.INSTANCE;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                ((Throwable) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.setOutput(IntegrationWorkflow.Output.Back.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.setOutput(IntegrationWorkflow.Output.Cancel.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                Object obj3 = updater5.state;
                obj3.getClass();
                updater5.state = new IntegrationWorkflow$State$Starting(IntegrationWorkflow$PendingAction$OpenBrowser.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                isRecoverable = ((InternalErrorInfo.NetworkErrorInfo) obj).isRecoverable();
                return Boolean.valueOf(isRecoverable);
            case 7:
                enqueueVerificationRequestWithRetry$lambda$3 = NetworkUtilsKt.enqueueVerificationRequestWithRetry$lambda$3((InternalErrorInfo.NetworkErrorInfo) obj);
                return Boolean.valueOf(enqueueVerificationRequestWithRetry$lambda$3);
            case 8:
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.state = DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE;
                return Unit.INSTANCE;
            case 9:
                ((WorkflowAction.Updater) obj).state = DeviceFeatureRequestWorkflow.DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE;
                return Unit.INSTANCE;
            case 10:
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                updater7.state = requestDeviceFeature;
                return Unit.INSTANCE;
            case 11:
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                updater8.state = PermissionRequestWorkflow.PermissionRequestState.RequestPermission.INSTANCE;
                return Unit.INSTANCE;
            case 12:
                WorkflowAction.Updater updater9 = (WorkflowAction.Updater) obj;
                updater9.getClass();
                updater9.state = PermissionRequestWorkflow.PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE;
                return Unit.INSTANCE;
            case 13:
                WorkflowAction.Updater updater10 = (WorkflowAction.Updater) obj;
                updater10.getClass();
                updater10.state = PermissionRequestWorkflow.PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE;
                return Unit.INSTANCE;
            case 14:
                ((WorkflowAction.Updater) obj).state = requestDeviceFeature;
                return Unit.INSTANCE;
            case 15:
                ((WorkflowAction.Updater) obj).state = PermissionRequestWorkflow.PermissionRequestState.CheckPermissionRationaleState.INSTANCE;
                return Unit.INSTANCE;
            case 16:
                ((WorkflowAction.Updater) obj).setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
                return Unit.INSTANCE;
            case 17:
                WorkflowAction.Updater updater11 = (WorkflowAction.Updater) obj;
                Object obj4 = updater11.state;
                SelfieState.Capture capture = obj4 instanceof SelfieState.Capture ? (SelfieState.Capture) obj4 : null;
                if (capture == null) {
                    return Unit.INSTANCE;
                }
                updater11.state = SelfieState.Capture.copy$default(capture, null, RecyclerView.DECELERATION_RATE, null, false, SelfieState.FlashState.ReadyToCapture, 8191);
                return Unit.INSTANCE;
            case 18:
                WorkflowAction.Updater updater12 = (WorkflowAction.Updater) obj;
                Object obj5 = updater12.state;
                SelfieState.Capture capture2 = obj5 instanceof SelfieState.Capture ? (SelfieState.Capture) obj5 : null;
                if (capture2 == null) {
                    return Unit.INSTANCE;
                }
                updater12.state = SelfieState.Capture.copy$default(capture2, null, RecyclerView.DECELERATION_RATE, null, false, SelfieState.FlashState.Enabled, 8191);
                return Unit.INSTANCE;
            case 19:
                WorkflowAction.Updater updater13 = (WorkflowAction.Updater) obj;
                Object obj6 = updater13.state;
                SelfieState.CountdownToManualCapture countdownToManualCapture = obj6 instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) obj6 : null;
                if (countdownToManualCapture == null) {
                    return Unit.INSTANCE;
                }
                int i2 = countdownToManualCapture.countDown;
                if (i2 >= 1) {
                    updater13.state = SelfieState.CountdownToManualCapture.copy$default(countdownToManualCapture, i2 - 1, countdownToManualCapture.selfieError, false, 2044);
                }
                return Unit.INSTANCE;
            case 20:
                WorkflowAction.Updater updater14 = (WorkflowAction.Updater) obj;
                updater14.getClass();
                updater14.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
                return Unit.INSTANCE;
            case 21:
                WorkflowAction.Updater updater15 = (WorkflowAction.Updater) obj;
                updater15.getClass();
                updater15.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
                return Unit.INSTANCE;
            case 22:
                WorkflowAction.Updater updater16 = (WorkflowAction.Updater) obj;
                updater16.getClass();
                MaterialAttributes.deleteAllSelfies((SelfieState) updater16.state);
                if (SelfieWorkflowUtilsKt.useCamera((SelfieState) updater16.state)) {
                    updater16.state = new SelfieState.RestartCamera(false, false, SelfieWorkflowUtilsKt.createBackState(updater16, false), ((SelfieState) updater16.state).getCameraFacingMode$selfie_release());
                }
                return Unit.INSTANCE;
            case 23:
                WorkflowAction.Updater updater17 = (WorkflowAction.Updater) obj;
                updater17.getClass();
                updater17.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                return Unit.INSTANCE;
            case 24:
                WorkflowAction.Updater updater18 = (WorkflowAction.Updater) obj;
                updater18.getClass();
                updater18.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                return Unit.INSTANCE;
            case 25:
                WorkflowAction.Updater updater19 = (WorkflowAction.Updater) obj;
                updater19.getClass();
                MaterialAttributes.deleteAllSelfies((SelfieState) updater19.state);
                if (SelfieWorkflowUtilsKt.useCamera((SelfieState) updater19.state)) {
                    updater19.state = new SelfieState.RestartCamera(false, false, SelfieWorkflowUtilsKt.createBackState(updater19, false), ((SelfieState) updater19.state).getCameraFacingMode$selfie_release());
                }
                return Unit.INSTANCE;
            case 26:
                WorkflowAction.Updater updater20 = (WorkflowAction.Updater) obj;
                updater20.getClass();
                SelfieState backState$selfie_release = ((SelfieState) updater20.state).getBackState$selfie_release();
                if (backState$selfie_release != null) {
                    updater20.state = backState$selfie_release;
                } else if (((SelfieWorkflow.Input) updater20.props).backStepEnabled) {
                    updater20.setOutput(SelfieWorkflow.Output.Back.INSTANCE);
                } else {
                    updater20.setOutput(canceled);
                }
                return Unit.INSTANCE;
            case 27:
                WorkflowAction.Updater updater21 = (WorkflowAction.Updater) obj;
                updater21.getClass();
                updater21.setOutput(canceled);
                return Unit.INSTANCE;
            case 28:
                WorkflowAction.Updater updater22 = (WorkflowAction.Updater) obj;
                Object obj7 = updater22.state;
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = obj7 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) obj7 : null;
                if (finalizeLocalVideoCapture == null) {
                    return Unit.INSTANCE;
                }
                updater22.state = SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
                return Unit.INSTANCE;
            default:
                Option option = (Option) obj;
                option.getClass();
                return option.text;
        }
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda79(int i) {
        this.$r8$classId = i;
    }
}
