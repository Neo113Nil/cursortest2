package com.squareup.cash.taptopay.backend.real;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentRequest$CardData$AndroidCardData;
import com.squareup.protos.common.Money;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealTapToPayRepository$createPayment$1 extends ContinuationImpl {
    public Money L$1;
    public String L$2;
    public String L$3;
    public CreatePaymentRequest$CardData$AndroidCardData L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTapToPayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTapToPayRepository$createPayment$1(RealTapToPayRepository realTapToPayRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTapToPayRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createPayment(null, null, null, null, this);
    }
}
