package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.stripe3ds2.transaction.StripeTransaction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class Stripe3ds2TransactionViewModel$begin3ds2Auth$1 extends ContinuationImpl {
    public int I$0;
    public Stripe3ds2Fingerprint L$0;
    public StripeTransaction L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$begin3ds2Auth$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.begin3ds2Auth(null, this);
    }
}
