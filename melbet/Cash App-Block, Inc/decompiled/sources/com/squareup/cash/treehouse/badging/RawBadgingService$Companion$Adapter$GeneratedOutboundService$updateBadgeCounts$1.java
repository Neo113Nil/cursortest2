package com.squareup.cash.treehouse.badging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RawBadgingService$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawBadgingService$Companion$Adapter$GeneratedOutboundService$updateBadgeCounts$1(RawBadgingService$Companion$Adapter$GeneratedOutboundService rawBadgingService$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rawBadgingService$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateBadgeCounts(null, this);
    }
}
