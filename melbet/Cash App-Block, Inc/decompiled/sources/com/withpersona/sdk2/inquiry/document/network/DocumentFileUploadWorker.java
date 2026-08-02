package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RealFileHelper;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadWorker$Response;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Response", "Builder", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentFileUploadWorker implements Worker<Response>, WorkflowWorker {
    public final String documentId;
    public final RealFileHelper fileHelper;
    public final boolean isSingleFileLimit;
    public final DocumentFile.Local localDocument;
    public final DocumentService service;
    public final ContextScope serviceCoroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.Job$default()));
    public final String sessionToken;

    public abstract class Response {

        public final class DocumentUploadError extends Response {
            public final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public DocumentUploadError(GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse) {
                documentErrorResponse.getClass();
                this.cause = documentErrorResponse;
            }
        }

        public final class NetworkError extends Response {
            public final InternalErrorInfo.NetworkErrorInfo cause;

            public NetworkError(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                this.cause = networkErrorInfo;
            }
        }

        public final class ProgressUpdate extends Response {
            public final int progressPercentage;

            public ProgressUpdate(int i) {
                this.progressPercentage = i;
            }
        }

        public final class Success extends Response {
            public final DocumentFile.Remote newRemoteDocument;
            public final DocumentFile.Local oldLocalDocument;

            public Success(DocumentFile.Local local, DocumentFile.Remote remote) {
                local.getClass();
                this.oldLocalDocument = local;
                this.newRemoteDocument = remote;
            }
        }
    }

    public DocumentFileUploadWorker(String str, DocumentService documentService, String str2, DocumentFile.Local local, RealFileHelper realFileHelper, boolean z) {
        this.sessionToken = str;
        this.service = documentService;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = realFileHelper;
        this.isSingleFileLimit = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchCurrentDocuments(DocumentFileUploadWorker documentFileUploadWorker, ContinuationImpl continuationImpl) {
        DocumentFileUploadWorker$fetchCurrentDocuments$1 documentFileUploadWorker$fetchCurrentDocuments$1;
        int i;
        NetworkCallResult networkCallResult;
        if (continuationImpl instanceof DocumentFileUploadWorker$fetchCurrentDocuments$1) {
            documentFileUploadWorker$fetchCurrentDocuments$1 = (DocumentFileUploadWorker$fetchCurrentDocuments$1) continuationImpl;
            int i2 = documentFileUploadWorker$fetchCurrentDocuments$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                documentFileUploadWorker$fetchCurrentDocuments$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = documentFileUploadWorker$fetchCurrentDocuments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentFileUploadWorker$fetchCurrentDocuments$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    WebRtcWorker$run$1.AnonymousClass1 anonymousClass1 = new WebRtcWorker$run$1.AnonymousClass1(documentFileUploadWorker, continuation, 10);
                    documentFileUploadWorker$fetchCurrentDocuments$1.label = 1;
                    obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, documentFileUploadWorker$fetchCurrentDocuments$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                networkCallResult = (NetworkCallResult) obj;
                if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                    if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                    if (createDocumentResponse != null) {
                        return createDocumentResponse.included;
                    }
                }
                return null;
            }
        }
        documentFileUploadWorker$fetchCurrentDocuments$1 = new DocumentFileUploadWorker$fetchCurrentDocuments$1(documentFileUploadWorker, continuationImpl);
        Object obj2 = documentFileUploadWorker$fetchCurrentDocuments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentFileUploadWorker$fetchCurrentDocuments$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        networkCallResult = (NetworkCallResult) obj2;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
        }
        return null;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        if (!(worker instanceof DocumentFileUploadWorker)) {
            return false;
        }
        DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) worker;
        return Intrinsics.areEqual(this.sessionToken, documentFileUploadWorker.sessionToken) && Intrinsics.areEqual(this.localDocument, documentFileUploadWorker.localDocument);
    }

    @Override // com.squareup.workflow1.Worker
    public final Flow run() {
        return new SafeFlow(new Logger$log$1(this, (Continuation) null, 15));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        if (!(workflowWorker instanceof DocumentFileUploadWorker)) {
            return false;
        }
        DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) workflowWorker;
        return Intrinsics.areEqual(this.sessionToken, documentFileUploadWorker.sessionToken) && Intrinsics.areEqual(this.localDocument, documentFileUploadWorker.localDocument);
    }
}
