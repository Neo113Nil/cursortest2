package com.squareup.cash.support.chat.presenters;

import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTabProvider$setup$lambda$0$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPresenter$models$lambda$55$$inlined$filterIsInstance$1$2$1(RealTabProvider$setup$lambda$0$$inlined$map$1$2 realTabProvider$setup$lambda$0$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realTabProvider$setup$lambda$0$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
