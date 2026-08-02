package com.squareup.cash.wallet.views;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1(Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2 hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
