package com.squareup.cash.treehouse.navigation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Navigator$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Navigator$Companion$Adapter$GeneratedOutboundService$navigateToUrl$1(Navigator$Companion$Adapter$GeneratedOutboundService navigator$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = navigator$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.navigateToUrl(null, null, this);
    }
}
