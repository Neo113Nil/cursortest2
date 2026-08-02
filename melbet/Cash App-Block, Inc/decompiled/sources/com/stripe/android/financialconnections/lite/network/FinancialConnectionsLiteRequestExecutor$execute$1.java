package com.stripe.android.financialconnections.lite.network;

import com.squareup.scannerview.TextSetter;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsLiteRequestExecutor$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextSetter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsLiteRequestExecutor$execute$1(TextSetter textSetter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textSetter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object m3980execute0E7RQCE = this.this$0.m3980execute0E7RQCE(null, null, this);
        return m3980execute0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? m3980execute0E7RQCE : new Result(m3980execute0E7RQCE);
    }
}
