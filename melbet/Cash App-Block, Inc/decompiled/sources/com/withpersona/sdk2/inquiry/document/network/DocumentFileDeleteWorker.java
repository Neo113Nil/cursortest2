package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileDeleteWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "Destructured", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentFileDeleteWorker implements Worker<Response>, WorkflowWorker {
    public final DocumentFile.Remote remoteDocument;
    public final DocumentService service;
    public final String sessionToken;

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                networkErrorInfo.getClass();
                this.cause = networkErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        public final class Success extends Response {
            public static final Success INSTANCE = new Success();
        }
    }

    public DocumentFileDeleteWorker(String str, DocumentService documentService, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = documentService;
        this.remoteDocument = remote;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (!(worker instanceof DocumentFileDeleteWorker)) {
            return false;
        }
        DocumentFileDeleteWorker documentFileDeleteWorker = (DocumentFileDeleteWorker) worker;
        return Intrinsics.areEqual(this.sessionToken, documentFileDeleteWorker.sessionToken) && this.remoteDocument.equals(documentFileDeleteWorker.remoteDocument);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new DocumentFileDeleteWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof DocumentFileDeleteWorker)) {
            return false;
        }
        DocumentFileDeleteWorker documentFileDeleteWorker = (DocumentFileDeleteWorker) workflowWorker;
        return Intrinsics.areEqual(this.sessionToken, documentFileDeleteWorker.sessionToken) && this.remoteDocument.equals(documentFileDeleteWorker.remoteDocument);
    }
}
