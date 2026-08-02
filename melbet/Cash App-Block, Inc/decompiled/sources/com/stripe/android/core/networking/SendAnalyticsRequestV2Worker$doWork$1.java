package com.stripe.android.core.networking;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class SendAnalyticsRequestV2Worker$doWork$1 extends ContinuationImpl {
    public int I$0;
    public SendAnalyticsRequestV2Worker L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SendAnalyticsRequestV2Worker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker$doWork$1(SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sendAnalyticsRequestV2Worker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doWork(this);
    }
}
