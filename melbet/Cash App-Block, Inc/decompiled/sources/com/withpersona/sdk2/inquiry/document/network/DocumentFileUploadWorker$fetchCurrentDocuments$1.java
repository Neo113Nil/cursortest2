package com.withpersona.sdk2.inquiry.document.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class DocumentFileUploadWorker$fetchCurrentDocuments$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DocumentFileUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentFileUploadWorker$fetchCurrentDocuments$1(DocumentFileUploadWorker documentFileUploadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = documentFileUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DocumentFileUploadWorker.access$fetchCurrentDocuments(this.this$0, this);
    }
}
