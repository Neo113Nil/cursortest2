package com.stripe.android.payments.bankaccount.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class CreateFinancialConnectionsSession$forSetupIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFinancialConnectionsSession$forSetupIntent$1(o0 o0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m4267forSetupIntenthUnOzRk = this.this$0.m4267forSetupIntenthUnOzRk(null, null, null, null, null, this);
        return m4267forSetupIntenthUnOzRk == CoroutineSingletons.COROUTINE_SUSPENDED ? m4267forSetupIntenthUnOzRk : new Result(m4267forSetupIntenthUnOzRk);
    }
}
