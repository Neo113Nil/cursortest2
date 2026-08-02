package com.stripe.android.financialconnections.network;

import com.stripe.android.core.networking.ApiRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class FinancialConnectionsRequestExecutor$executeInternal$1 extends ContinuationImpl {
    public ApiRequest L$0;
    public Function1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FinancialConnectionsRequestExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsRequestExecutor$executeInternal$1(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, Continuation continuation) {
        super(continuation);
        this.this$0 = financialConnectionsRequestExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.executeInternal(null, null, this);
    }
}
