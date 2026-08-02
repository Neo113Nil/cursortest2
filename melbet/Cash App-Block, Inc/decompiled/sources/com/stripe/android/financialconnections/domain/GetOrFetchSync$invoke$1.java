package com.stripe.android.financialconnections.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class GetOrFetchSync$invoke$1 extends ContinuationImpl {
    public GetOrFetchSync L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetOrFetchSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchSync$invoke$1(GetOrFetchSync getOrFetchSync, Continuation continuation) {
        super(continuation);
        this.this$0 = getOrFetchSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, false, this);
    }
}
