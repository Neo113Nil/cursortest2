package com.withpersona.sdk2.inquiry.document.step;

import com.plaid.internal.EnumC0170g;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentStepStateManager$$ExternalSyntheticLambda19 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DocumentStepStateManager f$0;

    public /* synthetic */ DocumentStepStateManager$$ExternalSyntheticLambda19(DocumentStepStateManager documentStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = documentStepStateManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
        DocumentStepStateManager documentStepStateManager = this.f$0;
        switch (i) {
            case 0:
                DocumentSubmitWorker.Response response = (DocumentSubmitWorker.Response) obj;
                response.getClass();
                if (response.equals(DocumentSubmitWorker.Response.Success.INSTANCE)) {
                    documentStepStateManager.setOutput(DocumentWorkflow.Output.Finished.INSTANCE);
                } else if (!(response instanceof DocumentSubmitWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    documentStepStateManager.setOutput(new DocumentWorkflow.Output.Errored(((DocumentSubmitWorker.Response.Error) response).cause));
                }
                break;
            case 1:
                DocumentLoadWorker.Response response2 = (DocumentLoadWorker.Response) obj;
                response2.getClass();
                SubtreeManager subtreeManager = (SubtreeManager) documentStepStateManager.lastChild;
                WorkflowState state = subtreeManager.getState();
                DocumentWorkflow.State.ReviewCaptures reviewCaptures = state instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) state : null;
                if (reviewCaptures == null) {
                    break;
                } else {
                    if (response2 instanceof DocumentLoadWorker.Response.Success) {
                        DocumentWorkflow.State.UploadState.ReadyToSubmit readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.documentId);
                        List list = ((DocumentLoadWorker.Response.Success) response2).documents;
                        List list2 = reviewCaptures.documents;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (obj2 instanceof DocumentFile.Local) {
                                arrayList.add(obj2);
                            }
                        }
                        subtreeManager.updateState(DocumentWorkflow.State.ReviewCaptures.copy$default(reviewCaptures, CollectionsKt.plus((Iterable) arrayList, (Collection) list), null, readyToSubmit, null, false, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE));
                    } else if (!(response2 instanceof DocumentLoadWorker.Response.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        documentStepStateManager.setOutput(new DocumentWorkflow.Output.Errored(((DocumentLoadWorker.Response.Error) response2).cause));
                    }
                    break;
                }
            case 2:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, selectDocument);
                break;
            case 3:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, selectPhotoFromLibrary);
                break;
            case 4:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, takePhoto);
                break;
            case 5:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, DocumentWorkflow.Event.OpenUploadOptions.INSTANCE);
                break;
            case 6:
                DocumentCreateWorker.Response response3 = (DocumentCreateWorker.Response) obj;
                response3.getClass();
                SubtreeManager subtreeManager2 = (SubtreeManager) documentStepStateManager.lastChild;
                DocumentWorkflow.State state2 = (DocumentWorkflow.State) subtreeManager2.getState();
                if (state2 == null) {
                    break;
                } else {
                    if (response3 instanceof DocumentCreateWorker.Response.Success) {
                        String str = ((DocumentCreateWorker.Response.Success) response3).documentId;
                        subtreeManager2.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state2, new DocumentWorkflow.State.UploadState.ReadyToSubmit(str), str, null, null, 12));
                    } else if (!(response3 instanceof DocumentCreateWorker.Response.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((DocumentCreateWorker.Response.Error) response3).cause;
                        if (!networkErrorInfo.isRecoverable()) {
                            documentStepStateManager.setOutput(new DocumentWorkflow.Output.Errored(networkErrorInfo));
                        }
                    }
                    break;
                }
            case 7:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, selectDocument);
                break;
            case 8:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, selectPhotoFromLibrary);
                break;
            case 9:
                ((UiComponent) obj).getClass();
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, takePhoto);
                break;
            default:
                DocumentWorkflow.State state3 = (DocumentWorkflow.State) obj;
                if (state3 == null) {
                    break;
                } else {
                    JobKt.launch$default((ContextScope) documentStepStateManager.parent, Dispatchers.Unconfined, null, new InquiryViewModel.AnonymousClass1(documentStepStateManager, state3, null, 18), 2);
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
