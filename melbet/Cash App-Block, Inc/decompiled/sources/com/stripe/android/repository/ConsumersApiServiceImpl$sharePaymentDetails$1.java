package com.stripe.android.repository;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ConsumersApiServiceImpl$sharePaymentDetails$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConsumersApiServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumersApiServiceImpl$sharePaymentDetails$1(ConsumersApiServiceImpl consumersApiServiceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = consumersApiServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4063sharePaymentDetailseH_QyT8 = this.this$0.m4063sharePaymentDetailseH_QyT8(null, null, null, null, null, null, null, this);
        return m4063sharePaymentDetailseH_QyT8 == CoroutineSingletons.COROUTINE_SUSPENDED ? m4063sharePaymentDetailseH_QyT8 : new Result(m4063sharePaymentDetailseH_QyT8);
    }
}
