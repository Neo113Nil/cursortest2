package com.squareup.cash.treehouse.android;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealCashContextService$produceRequestContext$2 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCashContextService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCashContextService$produceRequestContext$2(RealCashContextService realCashContextService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCashContextService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.produceRequestContext(null, null, this);
    }
}
