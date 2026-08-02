package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db2.activity.CashActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTransactionBodyResolver$getTransaction$1 extends ContinuationImpl {
    public String L$0;
    public ZiplineHistoryDataJavaScripter L$1;
    public CashActivity L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTransactionBodyResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransactionBodyResolver$getTransaction$1(RealTransactionBodyResolver realTransactionBodyResolver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTransactionBodyResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getTransaction(null, this);
    }
}
