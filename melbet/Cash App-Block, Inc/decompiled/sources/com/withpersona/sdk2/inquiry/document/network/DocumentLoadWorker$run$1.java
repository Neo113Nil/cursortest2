package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileData;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class DocumentLoadWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ DocumentLoadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentLoadWorker$run$1(DocumentLoadWorker documentLoadWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = documentLoadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentLoadWorker$run$1 documentLoadWorker$run$1 = new DocumentLoadWorker$run$1(this.this$0, continuation);
        documentLoadWorker$run$1.L$0 = obj;
        return documentLoadWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentLoadWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f6, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r2.emit(r4, r16) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        r4 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
    
        if (r6 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object enqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        ?? r9;
        List list;
        DocumentFileData.RemoteDocumentFile remoteDocumentFile;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            WebRtcWorker$run$1.AnonymousClass1 anonymousClass1 = new WebRtcWorker$run$1.AnonymousClass1(this.this$0, continuation, 11);
            this.L$0 = flowCollector;
            this.label = 1;
            enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                NetworkCallResult networkCallResult2 = this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    DocumentLoadWorker.Response.Error error = new DocumentLoadWorker.Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            enqueueRetriableRequestWithRetry = obj;
        }
        networkCallResult = (NetworkCallResult) enqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            NetworkCallResult.Success success = (NetworkCallResult.Success) networkCallResult;
            CreateDocumentResponse createDocumentResponse = (CreateDocumentResponse) success.getResponse();
            if (createDocumentResponse != null) {
                List<DocumentFileData> list2 = createDocumentResponse.included;
                if (list2 != null) {
                    r9 = new ArrayList();
                    for (DocumentFileData documentFileData : list2) {
                        DocumentFileData.Attributes attributes = documentFileData.attributes;
                        DocumentFile.Remote remote = (attributes == null || (list = attributes.originals) == null || (remoteDocumentFile = (DocumentFileData.RemoteDocumentFile) CollectionsKt.first(list)) == null) ? null : new DocumentFile.Remote(null, remoteDocumentFile.filename, remoteDocumentFile.url, documentFileData.id);
                        if (remote != null) {
                            r9.add(remote);
                        }
                    }
                } else {
                    r9 = EmptyList.INSTANCE;
                }
                DocumentLoadWorker.Response.Success success2 = new DocumentLoadWorker.Response.Success(r9);
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 2;
            } else {
                DocumentLoadWorker.Response.Error error2 = new DocumentLoadWorker.Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null", false, null, 8, null));
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 3;
            }
            networkCallResult = networkCallResult2;
            flowCollector = flowCollector2;
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
        }
        return Unit.INSTANCE;
    }
}
