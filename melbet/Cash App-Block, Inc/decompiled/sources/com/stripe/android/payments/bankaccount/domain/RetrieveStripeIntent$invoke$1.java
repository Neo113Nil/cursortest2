package com.stripe.android.payments.bankaccount.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RetrieveStripeIntent$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Payload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrieveStripeIntent$invoke$1(Payload payload, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = payload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4315invokeBWLJW6A = this.this$0.m4315invokeBWLJW6A(null, null, null, this);
        return m4315invokeBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED ? m4315invokeBWLJW6A : new Result(m4315invokeBWLJW6A);
    }
}
