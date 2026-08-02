package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4058perform3ds2AuthenticationRequestyxL6bBk = this.this$0.m4058perform3ds2AuthenticationRequestyxL6bBk(null, null, null, 0, this);
        return m4058perform3ds2AuthenticationRequestyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4058perform3ds2AuthenticationRequestyxL6bBk : new Result(m4058perform3ds2AuthenticationRequestyxL6bBk);
    }
}
