package com.withpersona.sdk2.inquiry.internal.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class InquiryApiHelper$makeInquiryCallWithRetry$1 extends ContinuationImpl {
    public Ref$ObjectRef L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InquiryApiHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryApiHelper$makeInquiryCallWithRetry$1(InquiryApiHelper inquiryApiHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inquiryApiHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.makeInquiryCallWithRetry(null, this);
    }
}
