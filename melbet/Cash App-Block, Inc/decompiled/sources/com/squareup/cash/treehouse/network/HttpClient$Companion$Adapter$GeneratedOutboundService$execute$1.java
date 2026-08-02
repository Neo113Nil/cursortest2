package com.squareup.cash.treehouse.network;

import com.squareup.cash.treehouse.network.HttpClient$Companion$Adapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpClient$Companion$Adapter.GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$Companion$Adapter$GeneratedOutboundService$execute$1(HttpClient$Companion$Adapter.GeneratedOutboundService generatedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = generatedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.execute(null, this);
    }
}
