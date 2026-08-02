package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentLoadWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "net/idrnd/face/iad/capture/internal/o0", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentLoadWorker implements Worker<Response>, WorkflowWorker {
    public final String documentId;
    public final DocumentService service;
    public final String sessionToken;

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                networkErrorInfo.getClass();
                this.cause = networkErrorInfo;
            }
        }

        public final class Success extends Response {
            public final List documents;

            public Success(List list) {
                list.getClass();
                this.documents = list;
            }
        }
    }

    public DocumentLoadWorker(String str, DocumentService documentService, String str2) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentId = str2;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (!(worker instanceof DocumentLoadWorker)) {
            return false;
        }
        DocumentLoadWorker documentLoadWorker = (DocumentLoadWorker) worker;
        return Intrinsics.areEqual(this.sessionToken, documentLoadWorker.sessionToken) && Intrinsics.areEqual(this.documentId, documentLoadWorker.documentId);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new DocumentLoadWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof DocumentLoadWorker)) {
            return false;
        }
        DocumentLoadWorker documentLoadWorker = (DocumentLoadWorker) workflowWorker;
        return Intrinsics.areEqual(this.sessionToken, documentLoadWorker.sessionToken) && Intrinsics.areEqual(this.documentId, documentLoadWorker.documentId);
    }
}
