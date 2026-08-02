package com.stripe.android.core.networking;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class DefaultAnalyticsRequestV2Executor$enqueue$1 extends ContinuationImpl {
    public AnalyticsRequestV2 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultAnalyticsRequestV2Executor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestV2Executor$enqueue$1(DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultAnalyticsRequestV2Executor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.enqueue(null, this);
    }
}
