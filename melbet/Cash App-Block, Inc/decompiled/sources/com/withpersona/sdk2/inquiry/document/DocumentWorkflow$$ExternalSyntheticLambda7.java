package com.withpersona.sdk2.inquiry.document;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentWorkflow$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DocumentWorkflow$$ExternalSyntheticLambda7(GovernmentIdWorkflow governmentIdWorkflow) {
        this.$r8$classId = 6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.$r8$classId;
        final int i2 = 0;
        GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
        final int i3 = 1;
        switch (i) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.state = ((DocumentWorkflow.State) updater.state).copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                break;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = ((DocumentWorkflow.State) updater2.state).copyWithUploadOptions$document_release(true);
                break;
            case 2:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.state = ((DocumentWorkflow.State) updater3.state).copyWithUploadOptions$document_release(false);
                break;
            case 3:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                DocumentWorkflow.State state = (DocumentWorkflow.State) updater4.state;
                if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                    updater4.state = DocumentWorkflow.State.ReviewCaptures.copy$default((DocumentWorkflow.State.ReviewCaptures) state, null, null, null, null, false, 127);
                }
                break;
            case 4:
                ((DocumentFile.Remote) obj).getClass();
                break;
            case 5:
                ((Throwable) obj).getClass();
                break;
            case 6:
                ((WorkflowAction.Updater) obj).setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
                break;
            case 7:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
                break;
            case 8:
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                ((GovernmentIdState) updater6.state).deleteAllIds();
                updater6.state = new GovernmentIdState.ShowInstructions(((GovernmentIdState) updater6.state).getCountryCode$government_id_release());
                break;
            case 9:
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                updater7.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                break;
            case 10:
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                updater8.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                break;
            case 11:
                WorkflowAction.Updater updater9 = (WorkflowAction.Updater) obj;
                updater9.getClass();
                GovernmentIdState governmentIdState = (GovernmentIdState) updater9.state;
                if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
                    updater9.state = GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, false, false, null, 30719);
                }
                break;
            case 12:
                WorkflowAction.Updater updater10 = (WorkflowAction.Updater) obj;
                updater10.getClass();
                GovernmentIdState governmentIdState2 = (GovernmentIdState) updater10.state;
                if (governmentIdState2 instanceof GovernmentIdState.WaitForAutocapture) {
                    updater10.state = GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState2, null, null, null, false, false, null, 31743);
                }
                break;
            case 13:
                WorkflowAction.Updater updater11 = (WorkflowAction.Updater) obj;
                updater11.getClass();
                updater11.setOutput(canceled);
                break;
            case 14:
                WorkflowAction.Updater updater12 = (WorkflowAction.Updater) obj;
                updater12.getClass();
                GovernmentIdState backState$government_id_release = ((GovernmentIdState) updater12.state).getBackState$government_id_release();
                if (backState$government_id_release != null) {
                    backState$government_id_release.didGoBack = true;
                    updater12.state = backState$government_id_release;
                } else if (((GovernmentIdWorkflow.Input) updater12.props).backStepEnabled) {
                    updater12.setOutput(GovernmentIdWorkflow.Output.Back.INSTANCE);
                } else {
                    updater12.setOutput(canceled);
                }
                break;
            case 15:
                WorkflowAction.Updater updater13 = (WorkflowAction.Updater) obj;
                updater13.getClass();
                updater13.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
                break;
            case 16:
                WorkflowAction.Updater updater14 = (WorkflowAction.Updater) obj;
                updater14.getClass();
                Object obj2 = updater14.state;
                GovernmentIdState.ReviewImageState reviewImageState = obj2 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj2 : null;
                if (reviewImageState != null) {
                    updater14.state = reviewImageState.updateSubmittingForAutoClassification(true);
                    break;
                } else {
                    break;
                }
            case 17:
                WorkflowAction.Updater updater15 = (WorkflowAction.Updater) obj;
                updater15.getClass();
                Object obj3 = updater15.state;
                GovernmentIdState.AutoClassificationError autoClassificationError = obj3 instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) obj3 : null;
                if (autoClassificationError != null) {
                    ArrayList arrayList = autoClassificationError.idConfigsForCountry;
                    if (arrayList.size() == 1) {
                        IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.first((List) arrayList);
                        str2 = idConfigForCountry.ids.size() == 1 ? ((IdConfig) CollectionsKt.first((List) idConfigForCountry.ids)).idClassKey : null;
                        str = idConfigForCountry.countryCode;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    updater15.state = new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.currentPart, autoClassificationError.uploadingIds, autoClassificationError.parts, autoClassificationError.partIndex, GovernmentIdWorkflowUtilsKt.createBackState(updater15, true), autoClassificationError.countryCode, autoClassificationError.captureFrames, new CameraProperties(null, null, null, 0, 31, 0), arrayList, str, str2);
                    break;
                } else {
                    break;
                }
            case 18:
                WorkflowAction.Updater updater16 = (WorkflowAction.Updater) obj;
                updater16.getClass();
                updater16.setOutput(canceled);
                break;
            case 19:
                WorkflowAction.Updater updater17 = (WorkflowAction.Updater) obj;
                updater17.getClass();
                updater17.setOutput(canceled);
                break;
            case 20:
                WorkflowAction.Updater updater18 = (WorkflowAction.Updater) obj;
                updater18.getClass();
                updater18.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
                break;
            case 21:
                WorkflowAction.Updater updater19 = (WorkflowAction.Updater) obj;
                updater19.getClass();
                updater19.state = new GovernmentIdState.ShowInstructions(((GovernmentIdState) updater19.state).getCountryCode$government_id_release());
                break;
            case 22:
                WorkflowAction.Updater updater20 = (WorkflowAction.Updater) obj;
                updater20.getClass();
                GovernmentIdState governmentIdState3 = (GovernmentIdState) updater20.state;
                if (governmentIdState3 instanceof GovernmentIdState.WaitForAutocapture) {
                    updater20.state = GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState3, null, null, null, false, false, null, 32255);
                }
                break;
            case 23:
                final Hint hint = (Hint) obj;
                break;
            case 24:
                final Hint hint2 = (Hint) obj;
                break;
            case 25:
                ((Throwable) obj).getClass();
                break;
            case 26:
                ((Throwable) obj).getClass();
                break;
            case 27:
                WorkflowAction.Updater updater21 = (WorkflowAction.Updater) obj;
                updater21.getClass();
                updater21.setOutput(canceled);
                break;
            case 28:
                ((Throwable) obj).getClass();
                break;
            default:
                WorkflowAction.Updater updater22 = (WorkflowAction.Updater) obj;
                Object obj4 = updater22.state;
                GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = obj4 instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) obj4 : null;
                if (finalizeLocalVideoCapture != null) {
                    updater22.state = GovernmentIdState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DocumentWorkflow$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }
}
