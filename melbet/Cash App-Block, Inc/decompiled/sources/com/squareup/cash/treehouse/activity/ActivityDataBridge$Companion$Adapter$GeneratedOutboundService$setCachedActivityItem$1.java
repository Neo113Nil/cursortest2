package com.squareup.cash.treehouse.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityDataBridge$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDataBridge$Companion$Adapter$GeneratedOutboundService$setCachedActivityItem$1(ActivityDataBridge$Companion$Adapter$GeneratedOutboundService activityDataBridge$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = activityDataBridge$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setCachedActivityItem((ByteString) null, this);
    }
}
