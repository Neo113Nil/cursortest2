package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DocumentFileUploadWorker$run$1$1$emit$1 extends ContinuationImpl {
    public DocumentFileUploadWorker.Response L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentFileUploadWorker$run$1$1$emit$1(FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((DocumentFileUploadWorker.Response) null, (Continuation) this);
    }
}
