package com.stripe.android.financialconnections.domain;

import com.squareup.scannerview.TextSetter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class SelectNetworkedAccounts$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextSetter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectNetworkedAccounts$invoke$1(TextSetter textSetter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = textSetter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, null, this);
    }
}
