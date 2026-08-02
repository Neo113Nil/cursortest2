package com.squareup.cash.treehouse.discover;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService$getDetailsPage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService$getDetailsPage$1(DiscoverDataBridge$Companion$Adapter$GeneratedOutboundService discoverDataBridge$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = discoverDataBridge$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getDetailsPage(null, this);
    }
}
