package com.squareup.cash.treehouse.network.prefetch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PrefetchClient$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchClient$Companion$Adapter$GeneratedOutboundService$awaitResponse$1(PrefetchClient$Companion$Adapter$GeneratedOutboundService prefetchClient$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = prefetchClient$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitResponse(null, this);
    }
}
