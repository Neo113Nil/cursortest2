package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentUtilsKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.governmentid.AutoClassificationErrorType;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$12;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda78 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda78(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.AutoClassificationResult autoClassificationResult, POPMatchingFactory pOPMatchingFactory) {
        this.$r8$classId = 5;
        this.f$4 = renderContext;
        this.f$0 = input;
        this.f$1 = reviewImageState;
        this.f$2 = autoClassificationResult;
        this.f$3 = pOPMatchingFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DocumentWorkflow.State.UploadState readyToSubmit;
        List list;
        int i = this.$r8$classId;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                SelfieAnalyzeWorker.Output output = (SelfieAnalyzeWorker.Output) obj6;
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) obj3;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj2;
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj5;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj4;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj7 = updater.state;
                SelfieState.StartCapture startCapture2 = obj7 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) obj7 : null;
                if (startCapture2 != null) {
                    if (!(output instanceof SelfieAnalyzeWorker.Output.Detected)) {
                        if (!(output instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                            if (!(output instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output;
                                SelfieError selfieError = selfieDetectionError.error;
                                SelfieError selfieError2 = SelfieError.FaceDetectionUnsupported;
                                float f = selfieDetectionError.poseScore;
                                SelfieBrightnessInfo selfieBrightnessInfo = selfieDetectionError.brightnessInfo;
                                updater.state = selfieError == selfieError2 ? SelfieState.StartCapture.copy$default(startCapture2, null, f, selfieBrightnessInfo, false, 16242) : SelfieState.StartCapture.copy$default(startCapture2, selfieError, f, selfieBrightnessInfo, false, 16368);
                            }
                        } else {
                            selfieWorkflow.setErrorOutput(renderContext, ((SelfieAnalyzeWorker.Output.RuntimeError) output).error);
                        }
                    } else {
                        updater.state = new SelfieState.StartCaptureFaceDetected(startCapture.startCaptureTimestamp, startCapture.cameraProperties, startCapture.startSelfieTimestamp, 1.0f, ((SelfieAnalyzeWorker.Output.Detected) output).brightnessInfo, startCapture.posesNeeded, startCapture.selfies, SelfieWorkflowUtilsKt.createBackState(updater, false), input.poseConfigs, startCapture.autoCaptureSupported, startCapture.cameraFacingMode, startCapture.isFlashEnabled);
                    }
                    break;
                } else {
                    break;
                }
            case 1:
                String str = (String) obj6;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                MutableState mutableState = (MutableState) obj4;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                if (((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                    str = ((Boolean) mutableState.getValue()).booleanValue() ? str2 : str3;
                }
                SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str);
                break;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                CardModelView cardModelView = new CardModelView(context, null);
                cardModelView.setAlpha(RecyclerView.DECELERATION_RATE);
                cardModelView.updateTextureState((CardTextureState) obj6, (CardModelView) obj3);
                cardModelView.setOnError(new AlertBannerKt$$ExternalSyntheticLambda2(16, (Function0) obj2));
                BaseModelView.setCameraPosition$default(cardModelView, 0.0d, 0.0d, 8.87d, 3, null);
                cardModelView.setCameraFov(25.0d);
                cardModelView.setOnFirstFrame(new HeroCardViewKt$$ExternalSyntheticLambda9(6, (Function0) obj5, cardModelView, (Function0) obj4));
                break;
            case 3:
                DocumentWorkflow.State.UploadState.UploadFiles uploadFiles = (DocumentWorkflow.State.UploadState.UploadFiles) obj3;
                String str4 = uploadFiles.documentId;
                DocumentFileUploadWorker.Response response = (DocumentFileUploadWorker.Response) obj2;
                DocumentWorkflow documentWorkflow = (DocumentWorkflow) obj5;
                DocumentWorkflow.Input input2 = (DocumentWorkflow.Input) obj4;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                ArrayList minus = CollectionsKt.minus(((DocumentWorkflow.State) updater2.state).getDocuments(), (DocumentFile.Local) obj6);
                if (!minus.isEmpty()) {
                    Iterator it = minus.iterator();
                    while (it.hasNext()) {
                        if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                            readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(str4);
                            DocumentWorkflow.State.UploadState uploadState = readyToSubmit;
                            GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((DocumentFileUploadWorker.Response.DocumentUploadError) response).cause;
                            String str5 = uploadFiles.documentId;
                            DocumentWorkflow.State.CaptureState captureState = DocumentWorkflow.State.CaptureState.None;
                            updater2.state = new DocumentWorkflow.State.ReviewCaptures(minus, str5, uploadState, documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, DocumentUtilsKt.toMessage(documentErrorResponse, documentWorkflow.applicationContext, input2), 80);
                            break;
                        }
                    }
                }
                readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str4);
                DocumentWorkflow.State.UploadState uploadState2 = readyToSubmit;
                GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse2 = ((DocumentFileUploadWorker.Response.DocumentUploadError) response).cause;
                String str52 = uploadFiles.documentId;
                DocumentWorkflow.State.CaptureState captureState2 = DocumentWorkflow.State.CaptureState.None;
                updater2.state = new DocumentWorkflow.State.ReviewCaptures(minus, str52, uploadState2, documentErrorResponse2 instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, DocumentUtilsKt.toMessage(documentErrorResponse2, documentWorkflow.applicationContext, input2), 80);
            case 4:
                GovernmentIdState governmentIdState = (GovernmentIdState) obj6;
                GovernmentIdWorkflow.Input input3 = (GovernmentIdWorkflow.Input) obj3;
                CaptureConfig captureConfig = (CaptureConfig) obj2;
                StatefulWorkflow.RenderContext renderContext2 = (StatefulWorkflow.RenderContext) obj4;
                GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj5;
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Object obj8 = updater3.state;
                GovernmentIdState governmentIdState2 = obj8 instanceof GovernmentIdState ? (GovernmentIdState) obj8 : null;
                if (governmentIdState2 != null) {
                    GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
                    GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(reviewCapturedImage.currentPart, ((GovernmentIdState) obj8).getUploadingIds$government_id_release(), captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState((GovernmentIdWorkflow.Input) updater3.props, reviewCapturedImage.currentPart.side), governmentIdState2.getParts$government_id_release(), governmentIdState2.getPartIndex$government_id_release(), GovernmentIdWorkflowUtilsKt.createBackState(updater3, false), WebRtcState.Disconnected, input3.videoCaptureConfig.webRtcJwt, null, false, false, reviewCapturedImage.countryCode, null, new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext2, governmentIdWorkflow, 7), 11776);
                    waitForAutocapture.didGoBack = true;
                    updater3.state = waitForAutocapture;
                    break;
                } else {
                    break;
                }
            case 5:
                StatefulWorkflow.RenderContext renderContext3 = (StatefulWorkflow.RenderContext) obj4;
                GovernmentIdWorkflow.Input input4 = (GovernmentIdWorkflow.Input) obj6;
                GovernmentIdState.ReviewImageState reviewImageState = (GovernmentIdState.ReviewImageState) obj3;
                AutoClassifyWorker.AutoClassificationResult autoClassificationResult = (AutoClassifyWorker.AutoClassificationResult) obj2;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj5;
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                Object obj9 = updater4.state;
                GovernmentIdState.ReviewImageState reviewImageState2 = obj9 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj9 : null;
                if (reviewImageState2 != null) {
                    updater4.state = reviewImageState2.updateSubmittingForAutoClassification(false);
                    GovernmentId idForReview = reviewImageState.getIdForReview();
                    IdConfig idConfig = ((AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess) autoClassificationResult).idConfig;
                    GovernmentIdWorkflowUtilsKt.moveToNextStep$default(reviewImageState2, renderContext3, input4, idForReview, idConfig, pOPMatchingFactory, reviewImageState.getCameraProperties(), false, idConfig.parts, 0, null, 3200);
                    break;
                } else {
                    break;
                }
            case 6:
                GovernmentIdState.CountdownToCapture countdownToCapture = (GovernmentIdState.CountdownToCapture) obj6;
                GovernmentIdWorkflow.Input input5 = (GovernmentIdWorkflow.Input) obj3;
                Throwable th = (Throwable) obj2;
                StatefulWorkflow.RenderContext renderContext4 = (StatefulWorkflow.RenderContext) obj4;
                POPMatchingFactory pOPMatchingFactory2 = (POPMatchingFactory) obj5;
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                Object obj10 = updater5.state;
                GovernmentIdState.CountdownToCapture countdownToCapture2 = obj10 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) obj10 : null;
                if (countdownToCapture2 != null) {
                    IdPart$SideIdPart idPart$SideIdPart = countdownToCapture.currentPart;
                    updater5.state = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, countdownToCapture.uploadingIds, countdownToCapture.captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState((GovernmentIdWorkflow.Input) updater5.props, idPart$SideIdPart.side), countdownToCapture2.parts, countdownToCapture2.partIndex, GovernmentIdWorkflowUtilsKt.createBackState(updater5, false), WebRtcState.Disconnected, input5.videoCaptureConfig.webRtcJwt, th, false, false, countdownToCapture2.countryCode, null, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext4, pOPMatchingFactory2, 4), 11264);
                    break;
                } else {
                    break;
                }
            case 7:
                CaptureConfig captureConfig2 = (CaptureConfig) obj3;
                GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) obj2;
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = (GovernmentIdState.WaitForAutocapture) obj5;
                CameraProperties cameraProperties = (CameraProperties) obj4;
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                IdPart$SideIdPart currentPart$government_id_release = ((GovernmentIdState) obj6).getCurrentPart$government_id_release();
                IdPart$SideIdPart idPart$SideIdPart2 = currentPart$government_id_release != null ? currentPart$government_id_release : null;
                if (idPart$SideIdPart2 != null) {
                    updater6.state = new GovernmentIdState.ReviewCapturedImage(idPart$SideIdPart2, ((GovernmentIdState) updater6.state).getUploadingIds$government_id_release(), captureConfig2, governmentIdImage, ((GovernmentIdState) updater6.state).getParts$government_id_release(), ((GovernmentIdState) updater6.state).getPartIndex$government_id_release(), waitForAutocapture2, cameraProperties, null, false, ((GovernmentIdState) updater6.state).getCountryCode$government_id_release());
                    break;
                } else {
                    break;
                }
            case 8:
                SubtreeManager subtreeManager = (SubtreeManager) obj6;
                Function1 function1 = (Function1) obj3;
                GovernmentIdWorkflow.Input input6 = (GovernmentIdWorkflow.Input) obj2;
                GovernmentIdState.ReviewImageState reviewImageState3 = (GovernmentIdState.ReviewImageState) obj5;
                POPMatchingFactory pOPMatchingFactory3 = (POPMatchingFactory) obj4;
                AutoClassifyWorker.Response response2 = (AutoClassifyWorker.Response) obj;
                response2.getClass();
                if (!(response2 instanceof AutoClassifyWorker.Response.Error)) {
                    if (!(response2 instanceof AutoClassifyWorker.Response.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        AutoClassifyWorker.AutoClassificationResult autoClassificationResult2 = ((AutoClassifyWorker.Response.Success) response2).autoClassificationResult;
                        if (!(autoClassificationResult2 instanceof AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess)) {
                            if (!(autoClassificationResult2 instanceof AutoClassifyWorker.AutoClassificationResult.IdTypeRejected)) {
                                if (!(autoClassificationResult2 instanceof AutoClassifyWorker.AutoClassificationResult.UnableToClassify)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    WorkflowState state = subtreeManager.getState();
                                    GovernmentIdState.ReviewImageState reviewImageState4 = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
                                    if (reviewImageState4 == null) {
                                        break;
                                    } else {
                                        subtreeManager.updateState(GovernmentIdStateManagerUtilsKt.autoClassificationFailureState(input6, reviewImageState4, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.UnableToClassify, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager, false)));
                                    }
                                }
                            } else {
                                WorkflowState state2 = subtreeManager.getState();
                                GovernmentIdState.ReviewImageState reviewImageState5 = state2 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state2 : null;
                                if (reviewImageState5 == null) {
                                    break;
                                } else {
                                    subtreeManager.updateState(GovernmentIdStateManagerUtilsKt.autoClassificationFailureState(input6, reviewImageState5, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.IdTypeRejected, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager, false)));
                                }
                            }
                        } else {
                            WorkflowState state3 = subtreeManager.getState();
                            GovernmentIdState.ReviewImageState reviewImageState6 = state3 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state3 : null;
                            if (reviewImageState6 == null) {
                                break;
                            } else {
                                subtreeManager.updateState(reviewImageState6.updateSubmittingForAutoClassification(false));
                                GovernmentId idForReview2 = reviewImageState3.getIdForReview();
                                IdConfig idConfig2 = ((AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess) autoClassificationResult2).idConfig;
                                GovernmentIdStateManagerUtilsKt.moveToNextStep$default(reviewImageState6, subtreeManager, input6, idForReview2, idConfig2, pOPMatchingFactory3, reviewImageState3.getCameraProperties(), false, idConfig2.parts, 0, null, 3200);
                            }
                        }
                    }
                } else {
                    InternalErrorInfo internalErrorInfo = ((AutoClassifyWorker.Response.Error) response2).cause;
                    GovernmentIdState governmentIdState3 = (GovernmentIdState) subtreeManager.getState();
                    GovernmentIdState backState$government_id_release = governmentIdState3 != null ? governmentIdState3.getBackState$government_id_release() : null;
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo : null;
                    if ((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                        function1.invoke(new GovernmentIdWorkflow.Output.Error(internalErrorInfo));
                    } else if (networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState$government_id_release == null) {
                        function1.invoke(new GovernmentIdWorkflow.Output.Error(internalErrorInfo));
                    } else {
                        subtreeManager.updateState(backState$government_id_release);
                    }
                }
                break;
            case 9:
                GovIdCaptureRenderer govIdCaptureRenderer = (GovIdCaptureRenderer) obj6;
                SubtreeManager subtreeManager2 = (SubtreeManager) obj3;
                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = (GovernmentIdState.WaitForAutocapture) obj2;
                CaptureConfig captureConfig3 = (CaptureConfig) obj5;
                GovernmentIdStepStateManager$renderScreen$12 governmentIdStepStateManager$renderScreen$12 = (GovernmentIdStepStateManager$renderScreen$12) obj4;
                Object obj11 = ((Result) obj).value;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj11);
                if (m4120exceptionOrNullimpl == null) {
                    GovernmentId.GovernmentIdImage governmentIdImage2 = (GovernmentId.GovernmentIdImage) obj11;
                    TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(govIdCaptureRenderer.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, null, 4, null), false, 2, null);
                    WorkflowState state4 = subtreeManager2.getState();
                    GovernmentIdState.WaitForAutocapture waitForAutocapture4 = state4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state4 : null;
                    if (waitForAutocapture4 != null) {
                        IdPart$SideIdPart idPart$SideIdPart3 = waitForAutocapture3.currentPart;
                        GovernmentIdState governmentIdState4 = (GovernmentIdState) subtreeManager2.getState();
                        if (governmentIdState4 == null || (list = governmentIdState4.getUploadingIds$government_id_release()) == null) {
                            list = EmptyList.INSTANCE;
                        }
                        subtreeManager2.updateState(new GovernmentIdState.CountdownToCapture(idPart$SideIdPart3, list, captureConfig3, governmentIdImage2, waitForAutocapture4.parts, waitForAutocapture4.partIndex, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager2, false), waitForAutocapture4.countryCode, waitForAutocapture4.hint));
                    }
                } else {
                    String message = m4120exceptionOrNullimpl.getMessage();
                    if (message != null && StringsKt.contains((CharSequence) message, (CharSequence) "ENOSPC", false)) {
                        governmentIdStepStateManager$renderScreen$12.send(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
                    } else if (waitForAutocapture3.manualCapture == Screen.CameraScreen.ManualCapture.Hidden) {
                        subtreeManager2.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture3, Screen.CameraScreen.ManualCapture.Enabled, null, null, false, false, null, 32759));
                    }
                }
                break;
            case 10:
                SelfieAnalyzeWorker.Output output2 = (SelfieAnalyzeWorker.Output) obj6;
                SelfieWorkflow selfieWorkflow2 = (SelfieWorkflow) obj5;
                StatefulWorkflow.RenderContext renderContext5 = (StatefulWorkflow.RenderContext) obj4;
                SelfieState.CountdownToCapture countdownToCapture3 = (SelfieState.CountdownToCapture) obj3;
                SelfieWorkflow.Input input7 = (SelfieWorkflow.Input) obj2;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                Object obj12 = updater7.state;
                SelfieState.CountdownToCapture countdownToCapture4 = obj12 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) obj12 : null;
                if (countdownToCapture4 != null) {
                    if (!(output2 instanceof SelfieAnalyzeWorker.Output.Detected)) {
                        if (!(output2 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                            if (!(output2 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                updater7.state = new SelfieState.StartCapture(null, countdownToCapture4.poseScore, countdownToCapture4.brightnessInfo, countdownToCapture3.posesNeeded, countdownToCapture3.selfies, countdownToCapture4.startCaptureTimestamp, countdownToCapture4.startSelfieTimestamp, countdownToCapture4.cameraProperties, SelfieWorkflowUtilsKt.createBackState(updater7, false), input7.poseConfigs, countdownToCapture4.cameraFacingMode, countdownToCapture4.isFlashEnabled, 131);
                            }
                        } else {
                            selfieWorkflow2.setErrorOutput(renderContext5, ((SelfieAnalyzeWorker.Output.RuntimeError) output2).error);
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                SelfieAnalyzeWorker.Output output3 = (SelfieAnalyzeWorker.Output) obj6;
                SelfieWorkflow selfieWorkflow3 = (SelfieWorkflow) obj5;
                StatefulWorkflow.RenderContext renderContext6 = (StatefulWorkflow.RenderContext) obj4;
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) obj3;
                SelfieWorkflow.Input input8 = (SelfieWorkflow.Input) obj2;
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                if (!(output3 instanceof SelfieAnalyzeWorker.Output.Detected)) {
                    if (!(output3 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                        if (!(output3 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError2 = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output3;
                            updater8.state = new SelfieState.StartCapture(selfieDetectionError2.error, selfieDetectionError2.poseScore, selfieDetectionError2.brightnessInfo, startCaptureFaceDetected.posesNeeded, startCaptureFaceDetected.selfies, startCaptureFaceDetected.startCaptureTimestamp, startCaptureFaceDetected.startSelfieTimestamp, startCaptureFaceDetected.cameraProperties, SelfieWorkflowUtilsKt.createBackState(updater8, false), input8.poseConfigs, startCaptureFaceDetected.cameraFacingMode, startCaptureFaceDetected.isFlashEnabled, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
                        }
                    } else {
                        selfieWorkflow3.setErrorOutput(renderContext6, ((SelfieAnalyzeWorker.Output.RuntimeError) output3).error);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda78(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, Object obj, StatefulWorkflow.RenderContext renderContext, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = governmentIdState;
        this.f$1 = input;
        this.f$2 = obj;
        this.f$4 = renderContext;
        this.f$3 = obj2;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda78(SelfieAnalyzeWorker.Output output, SelfieWorkflow selfieWorkflow, StatefulWorkflow.RenderContext renderContext, SelfieState selfieState, SelfieWorkflow.Input input, int i) {
        this.$r8$classId = i;
        this.f$0 = output;
        this.f$3 = selfieWorkflow;
        this.f$4 = renderContext;
        this.f$1 = selfieState;
        this.f$2 = input;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda78(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }
}
