package com.squareup.cash.wallet.presenters;

import com.squareup.protos.cash.postcard.CardModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$handleAction$1 extends ContinuationImpl {
    public CardModule.CardElementAction L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardSchemePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$handleAction$1(CardSchemePresenter cardSchemePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardSchemePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleAction(null, null, null, this);
    }
}
