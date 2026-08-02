package com.stripe.android.payments.bankaccount.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class AttachFinancialConnectionsSession$forPaymentIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AttachFinancialConnectionsSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachFinancialConnectionsSession$forPaymentIntent$1(AttachFinancialConnectionsSession attachFinancialConnectionsSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = attachFinancialConnectionsSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4056forPaymentIntentyxL6bBk = this.this$0.m4056forPaymentIntentyxL6bBk(null, null, null, null, this);
        return m4056forPaymentIntentyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4056forPaymentIntentyxL6bBk : new Result(m4056forPaymentIntentyxL6bBk);
    }
}
