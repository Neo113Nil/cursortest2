package com.stripe.android.repository;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ConsumersApiServiceImpl$createPaymentDetails$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConsumersApiServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumersApiServiceImpl$createPaymentDetails$1(ConsumersApiServiceImpl consumersApiServiceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = consumersApiServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4061createPaymentDetailsyxL6bBk = this.this$0.m4061createPaymentDetailsyxL6bBk(null, null, null, null, this);
        return m4061createPaymentDetailsyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4061createPaymentDetailsyxL6bBk : new Result(m4061createPaymentDetailsyxL6bBk);
    }
}
