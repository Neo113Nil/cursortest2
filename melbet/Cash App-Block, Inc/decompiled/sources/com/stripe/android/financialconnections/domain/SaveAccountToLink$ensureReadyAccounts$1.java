package com.stripe.android.financialconnections.domain;

import com.stripe.android.model.LinkBrand;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class SaveAccountToLink$ensureReadyAccounts$1 extends ContinuationImpl {
    public LinkBrand L$1;
    public Function2 L$2;
    public Set L$3;
    public Object L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SaveAccountToLink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveAccountToLink$ensureReadyAccounts$1(SaveAccountToLink saveAccountToLink, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = saveAccountToLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.ensureReadyAccounts(false, null, null, null, this);
    }
}
