package com.squareup.cash.work.service.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealBrandDetailsService$fetchBrandDetails$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBrandDetailsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBrandDetailsService$fetchBrandDetails$1(RealBrandDetailsService realBrandDetailsService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBrandDetailsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchBrandDetails(null, this);
    }
}
