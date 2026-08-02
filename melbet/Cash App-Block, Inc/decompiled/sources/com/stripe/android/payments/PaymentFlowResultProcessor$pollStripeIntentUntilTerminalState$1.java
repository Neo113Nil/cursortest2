package com.stripe.android.payments;

import com.stripe.android.core.networking.ApiRequest;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public String L$1;
    public ApiRequest.Options L$2;
    public Ref$ObjectRef L$4;
    public Ref$ObjectRef L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentFlowResultProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFlowResultProcessor$pollStripeIntentUntilTerminalState$1(PaymentFlowResultProcessor paymentFlowResultProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentFlowResultProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4051access$pollStripeIntentUntilTerminalStateyxL6bBk = PaymentFlowResultProcessor.m4051access$pollStripeIntentUntilTerminalStateyxL6bBk(this.this$0, null, null, null, 0L, this);
        return m4051access$pollStripeIntentUntilTerminalStateyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4051access$pollStripeIntentUntilTerminalStateyxL6bBk : new Result(m4051access$pollStripeIntentUntilTerminalStateyxL6bBk);
    }
}
