package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealCreateInstantDebitsResult$invoke$1 extends ContinuationImpl {
    public String L$2;
    public ElementsSessionContext.BillingDetails L$3;
    public ConsumerPaymentDetails.BankAccount L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCreateInstantDebitsResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCreateInstantDebitsResult$invoke$1(RealCreateInstantDebitsResult realCreateInstantDebitsResult, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCreateInstantDebitsResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(null, this);
    }
}
