package com.squareup.cash.wallet.presenters;

import com.squareup.cash.wallet.presenters.PresenterEvents;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardSchemePresenter$toHeroModule$3$1$1$emit$1 extends ContinuationImpl {
    public int I$0;
    public PresenterEvents.ExecuteCopy L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardSchemePresenter$toHeroModule$3$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$toHeroModule$3$1$1$emit$1(CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = cardSchemePresenter$toHeroModule$3$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((PresenterEvents.ExecuteCopy) null, (Continuation) this);
    }
}
