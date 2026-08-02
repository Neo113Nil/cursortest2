package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentCreateWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentCreateWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "dev/chrisbanes/haze/Pool", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentCreateWorker implements Worker<Response>, WorkflowWorker {
    public final String documentKind;
    public final String fieldKeyDocument;
    public final int fileLimit;
    public final DocumentService service;
    public final String sessionToken;

    public abstract class Response {

        public final class Error extends Response {
            public final InternalErrorInfo.NetworkErrorInfo cause;

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
            public final String documentId;

            public Success(String str) {
                this.documentId = str;
            }
        }
    }

    public DocumentCreateWorker(String str, DocumentService documentService, String str2, int i, String str3) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentKind = str2;
        this.fileLimit = i;
        this.fieldKeyDocument = str3;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (!(worker instanceof DocumentCreateWorker)) {
            return false;
        }
        DocumentCreateWorker documentCreateWorker = (DocumentCreateWorker) worker;
        return Intrinsics.areEqual(this.sessionToken, documentCreateWorker.sessionToken) && Intrinsics.areEqual(this.fieldKeyDocument, documentCreateWorker.fieldKeyDocument);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new DocumentCreateWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof DocumentCreateWorker)) {
            return false;
        }
        DocumentCreateWorker documentCreateWorker = (DocumentCreateWorker) workflowWorker;
        return Intrinsics.areEqual(this.sessionToken, documentCreateWorker.sessionToken) && Intrinsics.areEqual(this.fieldKeyDocument, documentCreateWorker.fieldKeyDocument);
    }
}
