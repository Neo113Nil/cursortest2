package com.squareup.cash.wallet.views;

import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TakeUntil$collectSafely$2.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$3$emit$1(TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(false, (Continuation) this);
    }
}
