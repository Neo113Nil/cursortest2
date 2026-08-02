package com.withpersona.sdk2.inquiry.governmentid.capture;

import android.content.Context;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
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
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final class CaptureRenderer {
    public final Context applicationContext;
    public final Camera2Controller_Factory_Impl camera2ControllerFactory;
    public final CameraXController_Factory_Impl cameraXControllerFactory;
    public final GovernmentIdAnalyzeWorker_Factory_Impl governmentIdAnalyzeWorkerFactory;
    public final GovernmentIdHintWorker_Factory_Impl governmentIdHintWorkerFactory;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorkflow permissionRequestWorkflow;
    public final TrackingEventsLogger trackingEventsLogger;
    public final WebRtcWorker.Factory webRtcWorkerFactory;

    public CaptureRenderer(Context context, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker_Factory_Impl governmentIdAnalyzeWorker_Factory_Impl, GovernmentIdHintWorker_Factory_Impl governmentIdHintWorker_Factory_Impl, WebRtcWorker.Factory factory, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, NavigationStateManager navigationStateManager, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        permissionRequestWorkflow.getClass();
        governmentIdAnalyzeWorker_Factory_Impl.getClass();
        governmentIdHintWorker_Factory_Impl.getClass();
        factory.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        navigationStateManager.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorker_Factory_Impl;
        this.governmentIdHintWorkerFactory = governmentIdHintWorker_Factory_Impl;
        this.webRtcWorkerFactory = factory;
        this.cameraXControllerFactory = cameraXController_Factory_Impl;
        this.camera2ControllerFactory = camera2Controller_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public final void onCaptureComplete(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, StatefulWorkflow.RenderContext renderContext, CaptureConfig captureConfig, POPMatchingFactory pOPMatchingFactory, CameraProperties cameraProperties, GovernmentId.GovernmentIdImage governmentIdImage) {
        IdConfig idConfig;
        IdPart$SideIdPart idPart$SideIdPart;
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
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
        if (!POPMatchingFactory.isVideoCapture(input) || idConfig == null) {
            if (input.shouldSkipReviewScreen && idConfig != null) {
                GovernmentIdWorkflowUtilsKt.moveToNextStep$default(governmentIdState, renderContext, input, governmentIdImage, idConfig, pOPMatchingFactory, cameraProperties, false, null, 0, null, 3840);
                return;
            }
            IdPart$SideIdPart currentPart$government_id_release = governmentIdState.getCurrentPart$government_id_release();
            idPart$SideIdPart = currentPart$government_id_release != null ? currentPart$government_id_release : null;
            if (idPart$SideIdPart == null) {
                return;
            }
            baseRenderContext.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda78(governmentIdState, captureConfig, governmentIdImage, new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, governmentIdState.getUploadingIds$government_id_release(), captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input, idPart$SideIdPart.side), governmentIdState.getParts$government_id_release(), governmentIdState.getPartIndex$government_id_release(), governmentIdState.getBackState$government_id_release(), WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, governmentIdState.getCountryCode$government_id_release(), null, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext, pOPMatchingFactory, 0), 11776), cameraProperties, 7)));
            return;
        }
        Integer num = input.holographicTorchEnabledDurationMs;
        IdPart$SideIdPart currentPart$government_id_release2 = governmentIdState.getCurrentPart$government_id_release();
        idPart$SideIdPart = currentPart$government_id_release2 != null ? currentPart$government_id_release2 : null;
        if (num == null || num.intValue() <= 0 || !governmentIdState.getUploadingIds$government_id_release().isEmpty() || idPart$SideIdPart == null) {
            GovernmentIdWorkflowUtilsKt.moveToNextStep$default(governmentIdState, renderContext, input, governmentIdImage, idConfig, pOPMatchingFactory, cameraProperties, false, null, 0, null, 3840);
        } else {
            baseRenderContext.getActionSink().send(Workflows.action$default(new SliderKt$$ExternalSyntheticLambda3(governmentIdState, idPart$SideIdPart, idConfig, governmentIdImage, cameraProperties, num, 13)));
        }
    }
}
