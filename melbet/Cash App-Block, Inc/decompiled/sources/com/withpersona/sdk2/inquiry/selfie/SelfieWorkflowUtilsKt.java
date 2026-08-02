package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class SelfieWorkflowUtilsKt {
    public static final SelfieState createBackState(WorkflowAction.Updater updater, boolean z) {
        updater.getClass();
        Object obj = updater.state;
        return z ? (SelfieState) obj : ((SelfieState) obj).getBackState$selfie_release();
    }

    public static final void goBack(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getClass();
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(26)));
    }

    public static final void handlePermissionChanged(Context context, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow.Input input, boolean z) {
        context.getClass();
        renderContext.getClass();
        input.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Permission.Camera);
        if (z && ContextUtilsKt.isMicPresent(context) && input.videoCaptureConfig.recordAudio) {
            mutableListOf.add(Permission.RecordAudio);
        }
        ArrayList missingPermissions = PermissionsStateKt.getMissingPermissions(context, mutableListOf);
        if (missingPermissions.isEmpty()) {
            return;
        }
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new TextStreamsKt$$ExternalSyntheticLambda0(12, missingPermissions)));
    }

    public static final SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides(SelfieWorkflow.Input input) {
        input.getClass();
        NextStep.Selfie.AssetConfig assetConfig = input.assetConfig;
        NextStep.Selfie.AssetConfig.RecordPage recordPage = assetConfig.getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = assetConfig.getRecordPage();
        return new SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    public static final SelfieState reviewStateIfNeeded(WorkflowAction.Updater updater, List list, String str, CameraProperties cameraProperties, long j, SelfieState selfieState) {
        boolean z;
        updater.getClass();
        list.getClass();
        cameraProperties.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage) {
                PoseConfigs poseConfigs = ((SelfieWorkflow.Input) updater.props).poseConfigs;
                Selfie.Pose pose = ((Selfie.SelfieImage) selfie).pose;
                poseConfigs.getClass();
                pose.getClass();
                PoseConfig poseConfig = (PoseConfig) poseConfigs.poseConfigs.get(pose);
                if (poseConfig == null) {
                    poseConfig = PoseConfig.Default;
                }
                z = poseConfig.allowReview;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        Object obj2 = updater.state;
        return !isEmpty ? new SelfieState.ReviewCaptures(list, arrayList, str, cameraProperties, j, selfieState, ((SelfieState) obj2).getCameraFacingMode$selfie_release()) : new SelfieState.Submit(list, str, cameraProperties, j, selfieState, ((SelfieState) obj2).getCameraFacingMode$selfie_release());
    }

    public static final SelfieWorkflow.Screen.CameraScreen.Overlay to(SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay) {
        overlay.getClass();
        switch (overlay.ordinal()) {
            case 0:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            case 1:
            case 2:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CENTER;
            case 3:
            case 4:
            case 5:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_LEFT;
            case 6:
            case 7:
            case 8:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_RIGHT;
            case 9:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.FINALIZING;
            case 10:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            case 11:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final SelfiePoseType toSelfiePoseType(Selfie.Pose pose) {
        pose.getClass();
        int ordinal = pose.ordinal();
        if (ordinal == 0) {
            return SelfiePoseType.CENTER;
        }
        if (ordinal == 1) {
            return SelfiePoseType.LEFT;
        }
        if (ordinal == 2) {
            return SelfiePoseType.RIGHT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final boolean useCamera(SelfieState selfieState) {
        selfieState.getClass();
        if ((selfieState instanceof SelfieState.Capture) || (selfieState instanceof SelfieState.CaptureTransition) || (selfieState instanceof SelfieState.CountdownToCapture) || (selfieState instanceof SelfieState.CountdownToManualCapture) || (selfieState instanceof SelfieState.ShowPoseHint) || (selfieState instanceof SelfieState.StartCapture) || (selfieState instanceof SelfieState.StartCaptureFaceDetected) || (selfieState instanceof SelfieState.WaitForCameraFeed) || (selfieState instanceof SelfieState.WaitForWebRtcSetup) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished) || (selfieState instanceof SelfieState.FinalizeLocalVideoCapture)) {
            return true;
        }
        if ((selfieState instanceof SelfieState.ShowInstructions) || (selfieState instanceof SelfieState.RestartCamera) || (selfieState instanceof SelfieState.ReviewCaptures) || (selfieState instanceof SelfieState.Submit)) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }
}
