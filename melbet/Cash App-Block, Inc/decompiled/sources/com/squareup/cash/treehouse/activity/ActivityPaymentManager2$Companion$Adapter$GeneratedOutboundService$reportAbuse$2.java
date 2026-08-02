package com.squareup.cash.treehouse.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService$reportAbuse$2(ActivityPaymentManager2$Companion$Adapter$GeneratedOutboundService activityPaymentManager2$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = activityPaymentManager2$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.reportAbuse(null, null, null, null, null, this);
    }
}
