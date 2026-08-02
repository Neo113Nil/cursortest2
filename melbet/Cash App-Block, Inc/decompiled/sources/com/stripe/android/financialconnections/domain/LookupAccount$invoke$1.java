package com.stripe.android.financialconnections.domain;

import com.stripe.android.model.EmailSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class LookupAccount$invoke$1 extends ContinuationImpl {
    public int I$0;
    public String L$0;
    public String L$1;
    public String L$2;
    public EmailSource L$3;
    public String L$4;
    public LookupAccount L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LookupAccount this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupAccount$invoke$1(LookupAccount lookupAccount, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lookupAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, null, null, null, false, null, null, this);
    }
}
