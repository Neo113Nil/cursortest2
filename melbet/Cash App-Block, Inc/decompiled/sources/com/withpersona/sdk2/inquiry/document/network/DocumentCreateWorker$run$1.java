package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class DocumentCreateWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DocumentCreateWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCreateWorker$run$1(DocumentCreateWorker documentCreateWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = documentCreateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentCreateWorker$run$1 documentCreateWorker$run$1 = new DocumentCreateWorker$run$1(this.this$0, continuation);
        documentCreateWorker$run$1.L$0 = obj;
        return documentCreateWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentCreateWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r1.emit(r3, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r1.emit(r4, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r14 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            DocumentCreateWorker documentCreateWorker = this.this$0;
            DocumentService documentService = documentCreateWorker.service;
            String str = documentCreateWorker.sessionToken;
            String str2 = documentCreateWorker.documentKind;
            int i2 = documentCreateWorker.fileLimit;
            String str3 = documentCreateWorker.fieldKeyDocument;
            str2.getClass();
            str3.getClass();
            CreateDocumentRequest createDocumentRequest = new CreateDocumentRequest(new CreateDocumentRequest.Data("document", new CreateDocumentRequest.Attributes(str2, i2)), new CreateDocumentRequest.Meta(str3));
            this.L$0 = flowCollector;
            this.label = 1;
            obj = documentService.createDocument(str, createDocumentRequest, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (response.rawResponse.isSuccessful) {
            Object obj2 = response.body;
            obj2.getClass();
            DocumentCreateWorker.Response.Success success = new DocumentCreateWorker.Response.Success(((CreateDocumentResponse) obj2).data.id);
            this.L$0 = null;
            this.label = 2;
        } else {
            DocumentCreateWorker.Response.Error error = new DocumentCreateWorker.Response.Error(NetworkUtilsKt.toErrorInfo(response));
            this.L$0 = null;
            this.label = 3;
        }
    }
}
