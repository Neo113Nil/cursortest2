package com.squareup.cash.support.backend.real;

import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealSupportTransactionService$toSupportTransaction$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSupportTransactionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportTransactionService$toSupportTransaction$2(RealSupportTransactionService realSupportTransactionService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSupportTransactionService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.toSupportTransaction((PaymentHistoryInputsRow) null, this);
    }
}
