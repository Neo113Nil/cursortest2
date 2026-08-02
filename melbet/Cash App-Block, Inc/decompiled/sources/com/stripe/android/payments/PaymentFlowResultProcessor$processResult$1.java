package com.stripe.android.payments;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentFlowResultProcessor$processResult$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowResultProcessor$processResult$1(PaymentFlowResultProcessor paymentFlowResultProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4053processResultgIAlus = this.this$0.m4053processResultgIAlus(null, this);
        return m4053processResultgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m4053processResultgIAlus : new Result(m4053processResultgIAlus);
    }
}
