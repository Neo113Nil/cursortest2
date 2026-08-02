package com.squareup.cash.treehouse.sqldelight;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SqlDelightBridge$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SqlDelightBridge$Companion$Adapter$GeneratedOutboundService$execute$1(SqlDelightBridge$Companion$Adapter$GeneratedOutboundService sqlDelightBridge$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sqlDelightBridge$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.execute(null, null, 0, this);
    }
}
