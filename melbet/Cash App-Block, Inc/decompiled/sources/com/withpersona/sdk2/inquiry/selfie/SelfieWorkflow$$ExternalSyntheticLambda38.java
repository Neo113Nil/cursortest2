package com.withpersona.sdk2.inquiry.selfie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentUtilsKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquiryResult;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.logger.LogLevel;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda38 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda38(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        this.$r8$classId = 19;
        this.f$2 = renderContext;
        this.f$0 = selfieWorkflow;
        this.f$1 = waitForWebRtcSetup;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State.UploadState readyToSubmit2;
        List split$default;
        String str;
        int i = this.$r8$classId;
        DocumentsSelectWorker.Output.Cancel cancel = DocumentsSelectWorker.Output.Cancel.INSTANCE;
        DocumentSelectWorker.Output.Cancel cancel2 = DocumentSelectWorker.Output.Cancel.INSTANCE;
        int i2 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj4;
                SelfieAnalyzeWorker.Output output = (SelfieAnalyzeWorker.Output) obj;
                output.getClass();
                break;
            case 1:
                DocumentFile.Remote remote = (DocumentFile.Remote) obj4;
                String str2 = ((DocumentWorkflow.State.UploadState.DeleteFiles) obj3).documentId;
                DocumentFileDeleteWorker.Response response = (DocumentFileDeleteWorker.Response) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj5 = updater.state;
                DocumentWorkflow.State.ReviewCaptures reviewCaptures = obj5 instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) obj5 : null;
                if (reviewCaptures == null) {
                    break;
                } else {
                    ArrayList minus = CollectionsKt.minus(reviewCaptures.documents, remote);
                    if (!minus.isEmpty()) {
                        Iterator it = minus.iterator();
                        while (it.hasNext()) {
                            if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                                readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(str2);
                                DocumentWorkflow.State.UploadState uploadState = readyToSubmit;
                                if (!(response instanceof DocumentFileDeleteWorker.Response.Success)) {
                                    updater.state = DocumentWorkflow.State.ReviewCaptures.copy$default(reviewCaptures, minus, null, uploadState, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
                                } else if (!(response instanceof DocumentFileDeleteWorker.Response.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    updater.setOutput(new DocumentWorkflow.Output.Errored(((DocumentFileDeleteWorker.Response.Error) response).cause));
                                }
                                break;
                            }
                        }
                    }
                    readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str2);
                    DocumentWorkflow.State.UploadState uploadState2 = readyToSubmit;
                    if (!(response instanceof DocumentFileDeleteWorker.Response.Success)) {
                    }
                }
            case 2:
                DocumentFile.Remote remote2 = (DocumentFile.Remote) obj;
                remote2.getClass();
                ((DocumentWorkflow) obj4).onEvent((StatefulWorkflow.RenderContext) obj2, new DocumentWorkflow.Event.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) ((DocumentWorkflow.State) obj3)).documentId, remote2));
                break;
            case 3:
                DocumentWorkflow documentWorkflow = (DocumentWorkflow) obj4;
                DocumentWorkflow.Input input = (DocumentWorkflow.Input) obj3;
                DocumentWorkflow.State state = (DocumentWorkflow.State) obj2;
                DocumentsSelectWorker.Output output2 = (DocumentsSelectWorker.Output) obj;
                output2.getClass();
                if (!(output2 instanceof DocumentsSelectWorker.Output.Success)) {
                    if (!(output2 instanceof DocumentsSelectWorker.Output.Failure)) {
                        if (!output2.equals(cancel)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 4:
                DocumentFileDeleteWorker.Response response2 = (DocumentFileDeleteWorker.Response) obj;
                response2.getClass();
                break;
            case 5:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Iterable) DocumentUtilsKt.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Failure) ((DocumentsSelectWorker.Output) obj4)).absoluteFilePaths), (Collection) ((DocumentWorkflow.State) updater2.state).getDocuments()), ((DocumentWorkflow.Input) obj3).documentFileLimit), ((DocumentWorkflow.State) updater2.state).getDocumentId(), ((DocumentWorkflow.State) updater2.state).getUploadState(), ((DocumentWorkflow) obj2).applicationContext.getString(R.string.pi2_document_error_unable_to_add_file), 116);
                break;
            case 6:
                DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) obj4;
                DocumentWorkflow.Input input2 = (DocumentWorkflow.Input) obj3;
                DocumentWorkflow.State state2 = (DocumentWorkflow.State) obj2;
                DocumentsSelectWorker.Output output3 = (DocumentsSelectWorker.Output) obj;
                output3.getClass();
                SubtreeManager subtreeManager = (SubtreeManager) documentStepStateManager.lastChild;
                DocumentWorkflow.State state3 = (DocumentWorkflow.State) subtreeManager.getState();
                if (state3 != null) {
                    if (!(output3 instanceof DocumentsSelectWorker.Output.Success)) {
                        if (!(output3 instanceof DocumentsSelectWorker.Output.Failure)) {
                            if (!output3.equals(cancel)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                subtreeManager.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                            }
                        } else {
                            subtreeManager.updateState(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Iterable) DocumentUtilsKt.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Failure) output3).absoluteFilePaths), (Collection) state3.getDocuments()), input2.documentFileLimit), state3.getDocumentId(), state3.getUploadState(), documentStepStateManager.applicationContext.getString(R.string.pi2_document_error_unable_to_add_file), 116));
                        }
                    } else {
                        subtreeManager.updateState(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Iterable) DocumentUtilsKt.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Success) output3).absoluteFilePaths), (Collection) state3.getDocuments()), input2.documentFileLimit), state3.getDocumentId(), state3.getUploadState(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE));
                    }
                    break;
                } else {
                    break;
                }
            case 7:
                DocumentStepStateManager documentStepStateManager2 = (DocumentStepStateManager) obj4;
                DocumentFile.Remote remote3 = (DocumentFile.Remote) obj3;
                String str3 = ((DocumentWorkflow.State.UploadState.DeleteFiles) obj2).documentId;
                DocumentFileDeleteWorker.Response response3 = (DocumentFileDeleteWorker.Response) obj;
                response3.getClass();
                SubtreeManager subtreeManager2 = (SubtreeManager) documentStepStateManager2.lastChild;
                WorkflowState state4 = subtreeManager2.getState();
                DocumentWorkflow.State.ReviewCaptures reviewCaptures2 = state4 instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) state4 : null;
                if (reviewCaptures2 == null) {
                    break;
                } else {
                    ArrayList minus2 = CollectionsKt.minus(reviewCaptures2.documents, remote3);
                    if (!minus2.isEmpty()) {
                        Iterator it2 = minus2.iterator();
                        while (it2.hasNext()) {
                            if (((DocumentFile) it2.next()) instanceof DocumentFile.Local) {
                                readyToSubmit2 = new DocumentWorkflow.State.UploadState.UploadFiles(str3);
                                DocumentWorkflow.State.UploadState uploadState3 = readyToSubmit2;
                                if (!(response3 instanceof DocumentFileDeleteWorker.Response.Success)) {
                                    subtreeManager2.updateState(DocumentWorkflow.State.ReviewCaptures.copy$default(reviewCaptures2, minus2, null, uploadState3, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE));
                                } else if (!(response3 instanceof DocumentFileDeleteWorker.Response.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    documentStepStateManager2.setOutput(new DocumentWorkflow.Output.Errored(((DocumentFileDeleteWorker.Response.Error) response3).cause));
                                }
                                break;
                            }
                        }
                    }
                    readyToSubmit2 = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str3);
                    DocumentWorkflow.State.UploadState uploadState32 = readyToSubmit2;
                    if (!(response3 instanceof DocumentFileDeleteWorker.Response.Success)) {
                    }
                }
            case 8:
                GovernmentIdState governmentIdState = (GovernmentIdState) obj4;
                GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) obj3;
                String str4 = (String) obj2;
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Object obj6 = updater3.state;
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = obj6 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) obj6 : null;
                if (chooseCaptureMethod != null) {
                    GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
                    updater3.state = new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod2.currentPart, chooseCaptureMethod2.uploadingIds, chooseCaptureMethod2.captureConfig, governmentIdImage, str4, chooseCaptureMethod.parts, chooseCaptureMethod.partIndex, GovernmentIdWorkflowUtilsKt.createBackState(updater3, true), chooseCaptureMethod2.countryCode);
                    break;
                } else {
                    break;
                }
            case 9:
                GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj4;
                IdPart$SideIdPart idPart$SideIdPart = (IdPart$SideIdPart) obj3;
                GovernmentIdState governmentIdState2 = (GovernmentIdState) obj2;
                DocumentSelectWorker.Output output4 = (DocumentSelectWorker.Output) obj;
                output4.getClass();
                if (!(output4 instanceof DocumentSelectWorker.Output.Success)) {
                    if (!output4.equals(cancel2)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        break;
                    }
                } else {
                    DocumentSelectWorker.Output.Success success = (DocumentSelectWorker.Output.Success) output4;
                    break;
                }
            case 10:
                GovernmentIdWorkflow governmentIdWorkflow2 = (GovernmentIdWorkflow) obj3;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj2;
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                GovernmentIdState backState$government_id_release = ((GovernmentIdState) updater4.state).getBackState$government_id_release();
                SubmitVerificationWorker.Response.Error error = (SubmitVerificationWorker.Response.Error) ((SubmitVerificationWorker.Response) obj4);
                InternalErrorInfo internalErrorInfo = error.cause;
                if ((internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable() && backState$government_id_release != null) {
                    String string2 = governmentIdWorkflow2.applicationContext.getString(R.string.pi2_network_connection_error);
                    string2.getClass();
                    updater4.state = backState$government_id_release.copyWithErrorMessage$government_id_release(string2);
                } else {
                    GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext, new GovernmentIdWorkflow.Output.Error(error.cause), governmentIdWorkflow2.videoCaptureHelper);
                }
                break;
            case 11:
                ((WorkflowAction.Updater) obj).getClass();
                GovernmentIdWorkflowUtilsKt.setOutputForWorkflow((StatefulWorkflow.RenderContext) obj2, (GovernmentIdWorkflow.Output) obj3, ((GovernmentIdWorkflow) obj4).videoCaptureHelper);
                break;
            case 12:
                StatefulWorkflow.RenderContext renderContext2 = (StatefulWorkflow.RenderContext) obj2;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj3;
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                InternalErrorInfo internalErrorInfo2 = ((AutoClassifyWorker.Response.Error) ((AutoClassifyWorker.Response) obj4)).cause;
                GovernmentIdState backState$government_id_release2 = ((GovernmentIdState) updater5.state).getBackState$government_id_release();
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo = internalErrorInfo2 instanceof InternalErrorInfo.NetworkErrorInfo ? (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo2 : null;
                if ((networkErrorInfo != null ? networkErrorInfo.getResponseError() : null) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                    GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext2, new GovernmentIdWorkflow.Output.Error(internalErrorInfo2), pOPMatchingFactory);
                } else if (networkErrorInfo == null || networkErrorInfo.getCode() != 422 || backState$government_id_release2 == null) {
                    GovernmentIdWorkflowUtilsKt.setOutputForWorkflow(renderContext2, new GovernmentIdWorkflow.Output.Error(internalErrorInfo2), pOPMatchingFactory);
                } else {
                    updater5.state = backState$government_id_release2;
                }
                break;
            case 13:
                CaptureRenderer captureRenderer = (CaptureRenderer) obj4;
                GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) obj3;
                CaptureConfig captureConfig = (CaptureConfig) obj2;
                Object obj7 = ((Result) obj).value;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj7);
                if (m4120exceptionOrNullimpl != null) {
                    String message = m4120exceptionOrNullimpl.getMessage();
                    if (message != null && StringsKt.contains((CharSequence) message, (CharSequence) "ENOSPC", false)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 14:
                GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) obj4;
                SubtreeManager subtreeManager3 = (SubtreeManager) governmentIdStepStateManager.lastChild;
                GovernmentIdState governmentIdState3 = (GovernmentIdState) obj3;
                IdPart$SideIdPart idPart$SideIdPart2 = (IdPart$SideIdPart) obj2;
                DocumentSelectWorker.Output output5 = (DocumentSelectWorker.Output) obj;
                output5.getClass();
                if (!(output5 instanceof DocumentSelectWorker.Output.Success)) {
                    if (!output5.equals(cancel2)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        governmentIdStepStateManager.updateState(GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) governmentIdState3, false, null, 447));
                    }
                } else {
                    DocumentSelectWorker.Output.Success success2 = (DocumentSelectWorker.Output.Success) output5;
                    String str5 = success2.absoluteFilePath;
                    String str6 = success2.fileName;
                    GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod3 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState3;
                    GovernmentId.GovernmentIdImage governmentIdImage2 = new GovernmentId.GovernmentIdImage(CollectionsKt__CollectionsJVMKt.listOf(new Frame(str5)), GovernmentIdWorkflowUtilsKt.toGovIdSide(idPart$SideIdPart2.side), GovernmentIdKt.getIdClassKey(chooseCaptureMethod3.captureConfig), GovernmentId.CaptureMethod.UPLOAD);
                    WorkflowState state5 = subtreeManager3.getState();
                    GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod4 = state5 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) state5 : null;
                    if (chooseCaptureMethod4 != null) {
                        governmentIdStepStateManager.updateState(new GovernmentIdState.ReviewSelectedImage(chooseCaptureMethod3.currentPart, chooseCaptureMethod3.uploadingIds, chooseCaptureMethod3.captureConfig, governmentIdImage2, str6, chooseCaptureMethod4.parts, chooseCaptureMethod4.partIndex, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager3, false), chooseCaptureMethod3.countryCode));
                    }
                }
                break;
            case 15:
                InquiryStateManager inquiryStateManager = (InquiryStateManager) obj4;
                String str7 = (String) obj3;
                TransitionStatus.UpdateInquirySession updateInquirySession = (TransitionStatus.UpdateInquirySession) obj2;
                UpdateInquiryResult updateInquiryResult = (UpdateInquiryResult) obj;
                updateInquiryResult.getClass();
                if (!(updateInquiryResult instanceof UpdateInquiryResult.Error)) {
                    if (!updateInquiryResult.equals(UpdateInquiryResult.Success.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        InquiryState inquiryState = (InquiryState) ((SubtreeManager) inquiryStateManager.lastChild).getState();
                        if (inquiryState == null) {
                            break;
                        } else {
                            InquiryState inquiryState2 = updateInquirySession.nextStep;
                            if (inquiryState2 != null) {
                                inquiryStateManager.updateState(inquiryState2);
                            } else {
                                inquiryStateManager.updateState(inquiryState.updateTransitionStatus(new TransitionStatus.CheckingForNextState(updateInquirySession.canReuseWorkflow, 1)));
                            }
                        }
                    }
                } else {
                    inquiryStateManager.setErrorOutput(str7, ((UpdateInquiryResult.Error) updateInquiryResult).cause, null);
                }
                break;
            case 16:
                String str8 = (String) obj3;
                StringBuilder sb = (StringBuilder) obj2;
                split$default = StringsKt__StringsKt.split$default((String) obj, new String[]{","}, false, 4, 2, null);
                String str9 = (String) split$default.get(0);
                String str10 = (String) split$default.get(1);
                if (Intrinsics.areEqual(str9, ((LogLevel) obj4).name())) {
                    if (split$default.size() == 4) {
                        String str11 = (String) split$default.get(2);
                        String str12 = (String) split$default.get(3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str9);
                        sb2.append(",");
                        sb2.append(str10);
                        sb2.append(",");
                        sb2.append(str11);
                        str = Recorder$$ExternalSyntheticOutline2.m(sb2, ",", str12, "\n");
                    } else if (split$default.size() == 3) {
                        String str13 = (String) split$default.get(2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str9);
                        sb3.append(",");
                        sb3.append(str10);
                        sb3.append(",");
                        sb3.append(str8);
                        str = Recorder$$ExternalSyntheticOutline2.m(sb3, ",", str13, "\n");
                    } else {
                        str = "";
                    }
                    sb.append(str);
                }
                break;
            case 17:
                ((WorkflowAction.Updater) obj).getClass();
                ((SelfieWorkflow) obj4).setOutputForWorkflow((StatefulWorkflow.RenderContext) obj2, new SelfieWorkflow.Output.Error(((SubmitVerificationWorker.Response.Error) ((SubmitVerificationWorker.Response) obj3)).cause));
                break;
            case 18:
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.state = ((SelfieWorkflow) obj4).nextState(updater6, (SelfieState.StartCapture) obj3, (Selfie.SelfieImage) obj2);
                break;
            case 19:
                SelfieWorkflow selfieWorkflow2 = (SelfieWorkflow) obj4;
                ((WorkflowAction.Updater) obj).getClass();
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow2, new SelfieWorkflow$$ExternalSyntheticLambda0(selfieWorkflow2, (SelfieState.WaitForWebRtcSetup) obj3)));
                break;
            case 20:
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) obj3;
                SelfieWorkflow.Input input3 = (SelfieWorkflow.Input) obj2;
                SelfieWorkflow selfieWorkflow3 = (SelfieWorkflow) obj4;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                Object obj8 = updater7.state;
                SelfieState.StartCapture startCapture2 = obj8 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) obj8 : null;
                if (startCapture2 != null) {
                    updater7.state = new SelfieState.CountdownToManualCapture(startCapture2.cameraProperties, startCapture2.posesNeeded, System.currentTimeMillis(), startCapture2.autoCaptureSupported, startCapture.startSelfieTimestamp, SelfieWorkflowUtilsKt.createBackState(updater7, false), input3.poseConfigs, startCapture.cameraFacingMode, startCapture.isFlashEnabled);
                    TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieWorkflow3.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.TAKING_PHOTO, "manual", ((Selfie.Pose) CollectionsKt.first(startCapture2.getPosesNeeded())).name(), null, 8, null), false, 2, null);
                    break;
                } else {
                    break;
                }
            case 21:
                SelfieWorkflow.Input input4 = (SelfieWorkflow.Input) obj3;
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(((SelfieWorkflow) obj4).trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, null, null, null, 8, null), false, 2, null);
                updater8.state = new SelfieState.WaitForCameraFeed(SelfieWorkflowUtilsKt.createBackState(updater8, true), input4.orderedPoses, input4.poseConfigs, ((SelfieState.ShowInstructions) obj2).cameraFacingMode);
                break;
            case 22:
                WorkflowAction.Updater updater9 = (WorkflowAction.Updater) obj;
                updater9.getClass();
                updater9.state = ((SelfieWorkflow) obj4).nextState(updater9, (SelfieState.CountdownToManualCapture) obj3, (Selfie.SelfieImage) obj2);
                break;
            case 23:
                WorkflowAction.Updater updater10 = (WorkflowAction.Updater) obj;
                updater10.getClass();
                updater10.state = ((SelfieWorkflow) obj4).nextState(updater10, (SelfieState.Capture) obj3, (Selfie.SelfieImage) obj2);
                break;
            case 24:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj2;
                String str14 = (String) obj;
                str14.getClass();
                Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(str14, Selfie.CaptureMethod.MANUAL, (Selfie.Pose) obj4, System.currentTimeMillis());
                SubtreeManager subtreeManager4 = (SubtreeManager) selfieStepStateManager.lastChild;
                subtreeManager4.updateState(selfieStepStateManager.nextState(subtreeManager4, (SelfieState.Capture) obj3, selfieImage));
                break;
            case 25:
                SelfieStepStateManager selfieStepStateManager2 = (SelfieStepStateManager) obj4;
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) obj3;
                SelfieWorkflow.Input input5 = (SelfieWorkflow.Input) obj2;
                SelfieAnalyzeWorker.Output output6 = (SelfieAnalyzeWorker.Output) obj;
                output6.getClass();
                SubtreeManager subtreeManager5 = (SubtreeManager) selfieStepStateManager2.lastChild;
                WorkflowState state6 = subtreeManager5.getState();
                SelfieState.CountdownToCapture countdownToCapture2 = state6 instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) state6 : null;
                if (countdownToCapture2 != null) {
                    if (!(output6 instanceof SelfieAnalyzeWorker.Output.Detected)) {
                        if (!(output6 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                            if (!(output6 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                subtreeManager5.updateState(new SelfieState.StartCapture(null, countdownToCapture2.poseScore, countdownToCapture2.brightnessInfo, countdownToCapture.posesNeeded, null, countdownToCapture2.startCaptureTimestamp, countdownToCapture2.startSelfieTimestamp, countdownToCapture2.cameraProperties, MaterialAttributes.createBackState(subtreeManager5, false), input5.poseConfigs, countdownToCapture2.cameraFacingMode, countdownToCapture2.isFlashEnabled, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE));
                            }
                        } else {
                            selfieStepStateManager2.setErrorOutput(((SelfieAnalyzeWorker.Output.RuntimeError) output6).error);
                        }
                    }
                    break;
                } else {
                    break;
                }
            case 26:
                SelfieStepStateManager selfieStepStateManager3 = (SelfieStepStateManager) obj4;
                SelfieState.StartCapture startCapture3 = (SelfieState.StartCapture) obj3;
                SelfieWorkflow.Input input6 = (SelfieWorkflow.Input) obj2;
                SelfieAnalyzeWorker.Output output7 = (SelfieAnalyzeWorker.Output) obj;
                output7.getClass();
                SubtreeManager subtreeManager6 = (SubtreeManager) selfieStepStateManager3.lastChild;
                WorkflowState state7 = subtreeManager6.getState();
                SelfieState.StartCapture startCapture4 = state7 instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) state7 : null;
                if (startCapture4 != null) {
                    if (!(output7 instanceof SelfieAnalyzeWorker.Output.Detected)) {
                        if (!(output7 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                            if (!(output7 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output7;
                                SelfieError selfieError = selfieDetectionError.error;
                                SelfieError selfieError2 = SelfieError.FaceDetectionUnsupported;
                                float f = selfieDetectionError.poseScore;
                                SelfieBrightnessInfo selfieBrightnessInfo = selfieDetectionError.brightnessInfo;
                                subtreeManager6.updateState(selfieError == selfieError2 ? SelfieState.StartCapture.copy$default(startCapture4, null, f, selfieBrightnessInfo, false, 16242) : SelfieState.StartCapture.copy$default(startCapture4, selfieError, f, selfieBrightnessInfo, false, 16368));
                            }
                        } else {
                            selfieStepStateManager3.setErrorOutput(((SelfieAnalyzeWorker.Output.RuntimeError) output7).error);
                        }
                    } else {
                        subtreeManager6.updateState(new SelfieState.StartCaptureFaceDetected(startCapture3.startCaptureTimestamp, startCapture3.cameraProperties, startCapture3.startSelfieTimestamp, 1.0f, ((SelfieAnalyzeWorker.Output.Detected) output7).brightnessInfo, startCapture3.posesNeeded, startCapture3.selfies, MaterialAttributes.createBackState(subtreeManager6, false), input6.poseConfigs, startCapture3.autoCaptureSupported, startCapture3.cameraFacingMode, startCapture3.isFlashEnabled));
                    }
                    break;
                } else {
                    break;
                }
            case 27:
                SelfieStepStateManager selfieStepStateManager4 = (SelfieStepStateManager) obj3;
                String str15 = (String) obj;
                str15.getClass();
                Selfie.SelfieImage selfieImage2 = new Selfie.SelfieImage(str15, Selfie.CaptureMethod.MANUAL, (Selfie.Pose) obj4, System.currentTimeMillis());
                SubtreeManager subtreeManager7 = (SubtreeManager) selfieStepStateManager4.lastChild;
                subtreeManager7.updateState(selfieStepStateManager4.nextState(subtreeManager7, (SelfieState.StartCapture) obj2, selfieImage2));
                break;
            case 28:
                SelfieStepStateManager selfieStepStateManager5 = (SelfieStepStateManager) obj4;
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) obj3;
                SelfieWorkflow.Input input7 = (SelfieWorkflow.Input) obj2;
                SelfieAnalyzeWorker.Output output8 = (SelfieAnalyzeWorker.Output) obj;
                output8.getClass();
                if (!(output8 instanceof SelfieAnalyzeWorker.Output.Detected)) {
                    if (!(output8 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                        if (!(output8 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            SubtreeManager subtreeManager8 = (SubtreeManager) selfieStepStateManager5.lastChild;
                            SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError2 = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output8;
                            subtreeManager8.updateState(new SelfieState.StartCapture(selfieDetectionError2.error, selfieDetectionError2.poseScore, selfieDetectionError2.brightnessInfo, startCaptureFaceDetected.posesNeeded, null, startCaptureFaceDetected.startCaptureTimestamp, startCaptureFaceDetected.startSelfieTimestamp, startCaptureFaceDetected.cameraProperties, MaterialAttributes.createBackState(subtreeManager8, false), input7.poseConfigs, startCaptureFaceDetected.cameraFacingMode, startCaptureFaceDetected.isFlashEnabled, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE));
                        }
                    } else {
                        selfieStepStateManager5.setErrorOutput(((SelfieAnalyzeWorker.Output.RuntimeError) output8).error);
                    }
                }
                break;
            default:
                SelfieStepStateManager selfieStepStateManager6 = (SelfieStepStateManager) obj3;
                String str16 = (String) obj;
                str16.getClass();
                Selfie.SelfieImage selfieImage3 = new Selfie.SelfieImage(str16, Selfie.CaptureMethod.MANUAL, (Selfie.Pose) obj4, System.currentTimeMillis());
                SubtreeManager subtreeManager9 = (SubtreeManager) selfieStepStateManager6.lastChild;
                subtreeManager9.updateState(selfieStepStateManager6.nextState(subtreeManager9, (SelfieState.CountdownToManualCapture) obj2, selfieImage3));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda38(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda38(SelfieState.StartCapture startCapture, SelfieWorkflow.Input input, SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = 20;
        this.f$1 = startCapture;
        this.f$2 = input;
        this.f$0 = selfieWorkflow;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda38(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
    }
}
