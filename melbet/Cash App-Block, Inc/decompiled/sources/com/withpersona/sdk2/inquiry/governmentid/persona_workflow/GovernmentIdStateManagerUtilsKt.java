package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.AutoClassificationErrorType;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.DesignVersion;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public abstract class GovernmentIdStateManagerUtilsKt {
    public static final GovernmentIdState autoClassificationFailureState(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, List list, ArrayList arrayList, AutoClassificationErrorType autoClassificationErrorType, GovernmentIdState governmentIdState) {
        String str;
        String str2;
        if (input.designVersion != DesignVersion.K0000) {
            return new GovernmentIdState.AutoClassificationError(reviewImageState.getCurrentPart$government_id_release$1(), reviewImageState.getUploadingIds$government_id_release(), reviewImageState.getParts$government_id_release(), reviewImageState.getPartIndex$government_id_release(), governmentIdState, reviewImageState.getCountryCode$government_id_release(), list, reviewImageState.getCameraProperties(), arrayList, autoClassificationErrorType);
        }
        if (arrayList.size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.first((List) arrayList);
            String str3 = idConfigForCountry.ids.size() == 1 ? ((IdConfig) CollectionsKt.first((List) idConfigForCountry.ids)).idClassKey : null;
            str = idConfigForCountry.countryCode;
            str2 = str3;
        } else {
            str = null;
            str2 = null;
        }
        return new GovernmentIdState.AutoClassificationManualSelect(reviewImageState.getCurrentPart$government_id_release$1(), reviewImageState.getUploadingIds$government_id_release(), reviewImageState.getParts$government_id_release(), reviewImageState.getPartIndex$government_id_release(), governmentIdState, reviewImageState.getCountryCode$government_id_release(), list, new CameraProperties(null, null, null, 0, 31, 0), arrayList, str, str2);
    }

    public static final GovernmentIdState createBackState(SubtreeManager subtreeManager, boolean z) {
        subtreeManager.getClass();
        if (z) {
            return (GovernmentIdState) subtreeManager.getState();
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) subtreeManager.getState();
        if (governmentIdState != null) {
            return governmentIdState.getBackState$government_id_release();
        }
        return null;
    }

    public static final void goBack(SubtreeManager subtreeManager, GovernmentIdWorkflow.Input input, Function1 function1) {
        subtreeManager.getClass();
        input.getClass();
        function1.getClass();
        GovernmentIdState governmentIdState = (GovernmentIdState) subtreeManager.getState();
        GovernmentIdState backState$government_id_release = governmentIdState != null ? governmentIdState.getBackState$government_id_release() : null;
        if (backState$government_id_release != null) {
            backState$government_id_release.didGoBack = true;
            subtreeManager.updateState(backState$government_id_release);
        } else if (input.backStepEnabled) {
            function1.invoke(GovernmentIdWorkflow.Output.Back.INSTANCE);
        } else {
            function1.invoke(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        }
    }

    public static final void handlePermissionChanged(Context context, SubtreeManager subtreeManager, GovernmentIdWorkflow.Input input, boolean z) {
        context.getClass();
        subtreeManager.getClass();
        input.getClass();
        Permission permission = Permission.Camera;
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(permission);
        if (z && ContextUtilsKt.isMicPresent(context)) {
            mutableListOf.add(Permission.RecordAudio);
        }
        ArrayList missingPermissions = PermissionsStateKt.getMissingPermissions(context, mutableListOf);
        if (missingPermissions.isEmpty()) {
            return;
        }
        GovernmentIdState governmentIdState = (GovernmentIdState) subtreeManager.getState();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            subtreeManager.updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, missingPermissions.contains(permission), missingPermissions.contains(Permission.RecordAudio), null, 29695));
        } else if (governmentIdState != null) {
            governmentIdState.deleteAllIds();
            subtreeManager.updateState(new GovernmentIdState.ShowInstructions(governmentIdState.getCountryCode$government_id_release()));
        }
    }

    public static void moveToNextStep$default(GovernmentIdState governmentIdState, SubtreeManager subtreeManager, GovernmentIdWorkflow.Input input, GovernmentId governmentId, IdConfig idConfig, POPMatchingFactory pOPMatchingFactory, CameraProperties cameraProperties, boolean z, List list, int i, String str, int i2) {
        WorkflowState submit;
        WorkflowState workflowState;
        boolean z2 = (i2 & 128) != 0 ? true : z;
        List parts$government_id_release = (i2 & 256) != 0 ? governmentIdState.getParts$government_id_release() : list;
        int partIndex$government_id_release = (i2 & 512) != 0 ? governmentIdState.getPartIndex$government_id_release() : i;
        String countryCode$government_id_release = (i2 & 2048) != 0 ? governmentIdState.getCountryCode$government_id_release() : str;
        governmentIdState.getClass();
        subtreeManager.getClass();
        input.getClass();
        idConfig.getClass();
        pOPMatchingFactory.getClass();
        cameraProperties.getClass();
        parts$government_id_release.getClass();
        VideoCaptureMethod videoCaptureMethod = POPMatchingFactory.videoCaptureMethod(input);
        String str2 = input.fieldKeyIdClass;
        String str3 = input.fieldKeyDocument;
        GovernmentIdState governmentIdState2 = (GovernmentIdState) subtreeManager.getState();
        if (governmentIdState2 != null && governmentIdState2.getClass() == governmentIdState.getClass()) {
            List plus = governmentId != null ? CollectionsKt.plus((Collection) governmentIdState2.getUploadingIds$government_id_release(), (Object) governmentId) : governmentIdState2.getUploadingIds$government_id_release();
            if (partIndex$government_id_release != parts$government_id_release.size()) {
                partIndex$government_id_release++;
            }
            IdPart$SideIdPart idPart$SideIdPart = (IdPart$SideIdPart) CollectionsKt.getOrNull(partIndex$government_id_release, parts$government_id_release);
            if (idPart$SideIdPart == null) {
                List list2 = parts$government_id_release;
                if (idPart$SideIdPart != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                if (videoCaptureMethod == VideoCaptureMethod.Stream && !(governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) && !(governmentIdState2 instanceof GovernmentIdState.ReviewSelectedImage)) {
                    submit = new GovernmentIdState.FinalizeWebRtc((IdPart$SideIdPart) CollectionsKt.last(list2), plus, list2, partIndex$government_id_release, createBackState(subtreeManager, z2), countryCode$government_id_release, idConfig, cameraProperties);
                } else if (videoCaptureMethod != VideoCaptureMethod.Upload || (governmentIdState2 instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState2 instanceof GovernmentIdState.ReviewSelectedImage)) {
                    List list3 = plus;
                    submit = new GovernmentIdState.Submit(idConfig, list3, list2, partIndex$government_id_release, createBackState(subtreeManager, z2), countryCode$government_id_release, new GovernmentIdRequestArguments(list3, str3, str2), null, cameraProperties);
                } else {
                    submit = new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, plus, (IdPart$SideIdPart) CollectionsKt.last(list2), list2, partIndex$government_id_release, createBackState(subtreeManager, z2), countryCode$government_id_release, new GovernmentIdRequestArguments(plus, str3, str2), 3000L, false);
                }
                workflowState = submit;
            } else if (input.enabledCaptureOptionsNativeMobile.size() <= 1 || POPMatchingFactory.isVideoCapture(input)) {
                workflowState = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, plus, new CaptureConfig.IdCaptureConfig(idConfig), GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input, idPart$SideIdPart.side), parts$government_id_release, partIndex$government_id_release, createBackState(subtreeManager, z2), WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, countryCode$government_id_release, null, new GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2(subtreeManager, pOPMatchingFactory, 0), 11776);
            } else {
                workflowState = new GovernmentIdState.ChooseCaptureMethod(idPart$SideIdPart, plus, parts$government_id_release, partIndex$government_id_release, countryCode$government_id_release, new CaptureConfig.IdCaptureConfig(idConfig), createBackState(subtreeManager, z2));
            }
            subtreeManager.updateState(workflowState);
        }
    }

    public static final void onAcceptImageClick(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, SubtreeManager subtreeManager, POPMatchingFactory pOPMatchingFactory, TrackingEventsLogger trackingEventsLogger) {
        input.getClass();
        reviewImageState.getClass();
        subtreeManager.getClass();
        pOPMatchingFactory.getClass();
        trackingEventsLogger.getClass();
        TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CONTINUE, null, 2, null), false, 2, null);
        CaptureConfig captureConfig = reviewImageState.getCaptureConfig();
        if (!(captureConfig instanceof CaptureConfig.AutoClassifyConfig)) {
            if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
                moveToNextStep$default(reviewImageState, subtreeManager, input, reviewImageState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).id, pOPMatchingFactory, reviewImageState.getCameraProperties(), false, null, 0, null, 3968);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        WorkflowState state = subtreeManager.getState();
        GovernmentIdState.ReviewImageState reviewImageState2 = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
        if (reviewImageState2 == null) {
            return;
        }
        subtreeManager.updateState(reviewImageState2.updateSubmittingForAutoClassification(true));
    }

    public static final void runAutoClassificationWorker(GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, SubtreeManager subtreeManager, POPMatchingFactory pOPMatchingFactory, AutoClassifyWorker.Factory factory, Function1 function1) {
        input.getClass();
        reviewImageState.getClass();
        subtreeManager.getClass();
        pOPMatchingFactory.getClass();
        factory.getClass();
        String str = input.sessionToken;
        String str2 = input.inquiryId;
        String str3 = input.fromStep;
        String str4 = input.fromComponent;
        GovernmentId idForReview = reviewImageState.getIdForReview();
        AutoClassifyWorker.SupplementaryData supplementaryData = new AutoClassifyWorker.SupplementaryData();
        long j = input.manualCaptureButtonDelayMs;
        boolean z = input.autoClassificationConfig.extractTextFromImage;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        idForReview.getClass();
        subtreeManager.runningWorker(new AutoClassifyWorker(str, str2, str3, str4, factory.service, idForReview, factory.imageHelper, supplementaryData, j, z), new SelfieWorkflow$$ExternalSyntheticLambda78(subtreeManager, function1, input, reviewImageState, pOPMatchingFactory, 8));
    }
}
