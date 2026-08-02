package com.squareup.cash.wallet.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$complete$1 extends ContinuationImpl {
    public Function1 L$1;
    public Flow$Type L$3;
    public BlockersData L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardSchemePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$complete$1(CardSchemePresenter cardSchemePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardSchemePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.complete(null, null, null, this);
    }
}
