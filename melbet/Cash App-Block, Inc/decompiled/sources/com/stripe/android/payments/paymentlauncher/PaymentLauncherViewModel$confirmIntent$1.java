package com.stripe.android.payments.paymentlauncher;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentLauncherViewModel$confirmIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$confirmIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4060access$confirmIntent0E7RQCE = PaymentLauncherViewModel.m4060access$confirmIntent0E7RQCE(this.this$0, null, null, this);
        return m4060access$confirmIntent0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m4060access$confirmIntent0E7RQCE : new Result(m4060access$confirmIntent0E7RQCE);
    }
}
