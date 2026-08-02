package com.stripe.android.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class ConsumersApiServiceImpl$signUp$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConsumersApiServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumersApiServiceImpl$signUp$1(ConsumersApiServiceImpl consumersApiServiceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = consumersApiServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4064signUp0E7RQCE = this.this$0.m4064signUp0E7RQCE(null, null, this);
        return m4064signUp0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m4064signUp0E7RQCE : new Result(m4064signUp0E7RQCE);
    }
}
