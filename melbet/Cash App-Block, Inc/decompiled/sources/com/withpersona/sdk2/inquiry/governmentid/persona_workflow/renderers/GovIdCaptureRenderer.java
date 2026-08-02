package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers;

import android.content.Context;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final class GovIdCaptureRenderer {
    public final Context applicationContext;
    public final Camera2Controller_Factory_Impl camera2ControllerFactory;
    public final CameraXController_Factory_Impl cameraXControllerFactory;
    public final GovernmentIdAnalyzeWorker_Factory_Impl governmentIdAnalyzeWorkerFactory;
    public final GovernmentIdHintWorker_Factory_Impl governmentIdHintWorkerFactory;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorker_Factory_Impl permissionRequestWorker;
    public final TrackingEventsLogger trackingEventsLogger;
    public final WebRtcWorker.Factory webRtcWorkerFactory;

    public GovIdCaptureRenderer(Context context, GovernmentIdAnalyzeWorker_Factory_Impl governmentIdAnalyzeWorker_Factory_Impl, GovernmentIdHintWorker_Factory_Impl governmentIdHintWorker_Factory_Impl, WebRtcWorker.Factory factory, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, NavigationStateManager navigationStateManager, TrackingEventsLogger trackingEventsLogger, PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl) {
        context.getClass();
        governmentIdAnalyzeWorker_Factory_Impl.getClass();
        governmentIdHintWorker_Factory_Impl.getClass();
        factory.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        navigationStateManager.getClass();
        trackingEventsLogger.getClass();
        permissionRequestWorker_Factory_Impl.getClass();
        this.applicationContext = context;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorker_Factory_Impl;
        this.governmentIdHintWorkerFactory = governmentIdHintWorker_Factory_Impl;
        this.webRtcWorkerFactory = factory;
        this.cameraXControllerFactory = cameraXController_Factory_Impl;
        this.camera2ControllerFactory = camera2Controller_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker_Factory_Impl;
    }

    public final void onCaptureComplete(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, SubtreeManager subtreeManager, CaptureConfig captureConfig, POPMatchingFactory pOPMatchingFactory, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage governmentIdImage) {
        IdConfig idConfig;
        List list;
        List list2;
        TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CAPTURED_PHOTO, GovernmentIdKt.toGovIdCaptureMethod(governmentIdImage.captureMethod), null, 4, null), false, 2, null);
        captureConfig.getClass();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            idConfig = null;
        } else {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            idConfig = ((CaptureConfig.IdCaptureConfig) captureConfig).id;
        }
        pOPMatchingFactory.getClass();
        if (POPMatchingFactory.isVideoCapture(input) && idConfig != null && !input.autoClassificationConfig.isEnabled) {
            Integer num = input.holographicTorchEnabledDurationMs;
            IdPart$SideIdPart currentPart$government_id_release = governmentIdState.getCurrentPart$government_id_release();
            IdPart$SideIdPart idPart$SideIdPart = currentPart$government_id_release != null ? currentPart$government_id_release : null;
            if (num == null || num.intValue() <= 0 || !governmentIdState.getUploadingIds$government_id_release().isEmpty() || idPart$SideIdPart == null) {
                GovernmentIdStateManagerUtilsKt.moveToNextStep$default(governmentIdState, subtreeManager, input, governmentIdImage, idConfig, pOPMatchingFactory, cameraProperties, false, null, 0, null, 3840);
                return;
            } else {
                subtreeManager.updateState(new GovernmentIdState.HolographicTorchDelay(idPart$SideIdPart, governmentIdState.getUploadingIds$government_id_release(), governmentIdState.getParts$government_id_release(), governmentIdState.getPartIndex$government_id_release(), governmentIdState.getBackState$government_id_release(), governmentIdState.getCountryCode$government_id_release(), idConfig, governmentIdImage, cameraProperties, num.intValue()));
                return;
            }
        }
        if (input.shouldSkipReviewScreen && idConfig != null) {
            GovernmentIdStateManagerUtilsKt.moveToNextStep$default(governmentIdState, subtreeManager, input, governmentIdImage, idConfig, pOPMatchingFactory, cameraProperties, false, null, 0, null, 3840);
            return;
        }
        IdPart$SideIdPart currentPart$government_id_release2 = governmentIdState.getCurrentPart$government_id_release();
        if (currentPart$government_id_release2 == null) {
            currentPart$government_id_release2 = null;
        }
        if (currentPart$government_id_release2 == null) {
            return;
        }
        GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(currentPart$government_id_release2, governmentIdState.getUploadingIds$government_id_release(), captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input, currentPart$government_id_release2.side), governmentIdState.getParts$government_id_release(), governmentIdState.getPartIndex$government_id_release(), governmentIdState.getBackState$government_id_release(), WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, governmentIdState.getCountryCode$government_id_release(), null, new GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2(subtreeManager, pOPMatchingFactory, 1), 11776);
        IdPart$SideIdPart currentPart$government_id_release3 = governmentIdState.getCurrentPart$government_id_release();
        IdPart$SideIdPart idPart$SideIdPart2 = currentPart$government_id_release3 != null ? currentPart$government_id_release3 : null;
        if (idPart$SideIdPart2 == null) {
            return;
        }
        GovernmentIdState governmentIdState2 = (GovernmentIdState) subtreeManager.getState();
        if (governmentIdState2 == null || (list = governmentIdState2.getUploadingIds$government_id_release()) == null) {
            list = EmptyList.INSTANCE;
        }
        GovernmentIdState governmentIdState3 = (GovernmentIdState) subtreeManager.getState();
        if (governmentIdState3 == null || (list2 = governmentIdState3.getParts$government_id_release()) == null) {
            list2 = EmptyList.INSTANCE;
        }
        List list3 = list2;
        GovernmentIdState governmentIdState4 = (GovernmentIdState) subtreeManager.getState();
        int partIndex$government_id_release = governmentIdState4 != null ? governmentIdState4.getPartIndex$government_id_release() : 0;
        GovernmentIdState governmentIdState5 = (GovernmentIdState) subtreeManager.getState();
        subtreeManager.updateState(new GovernmentIdState.ReviewCapturedImage(idPart$SideIdPart2, list, captureConfig, governmentIdImage, list3, partIndex$government_id_release, waitForAutocapture, cameraProperties, null, false, governmentIdState5 != null ? governmentIdState5.getCountryCode$government_id_release() : null));
    }
}
