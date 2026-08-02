package com.squareup.cash.treehouse.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OffersRepositoryService$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersRepositoryService$Companion$Adapter$GeneratedOutboundService$saveSheetPreload$1(OffersRepositoryService$Companion$Adapter$GeneratedOutboundService offersRepositoryService$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = offersRepositoryService$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.saveSheetPreload(null, this);
    }
}
