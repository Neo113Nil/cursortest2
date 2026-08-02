package com.stripe.android.financialconnections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class GetCachedAccounts$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetCachedAccounts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAccounts$invoke$1(GetCachedAccounts getCachedAccounts, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getCachedAccounts;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(this);
    }
}
