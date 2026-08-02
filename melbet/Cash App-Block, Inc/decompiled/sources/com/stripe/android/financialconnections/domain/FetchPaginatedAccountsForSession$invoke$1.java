package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class FetchPaginatedAccountsForSession$invoke$1 extends ContinuationImpl {
    public FinancialConnectionsSession L$0;
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Payload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPaginatedAccountsForSession$invoke$1(Payload payload, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = payload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, this);
    }
}
