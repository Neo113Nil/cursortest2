package com.squareup.cash.ui.qrcodes.widget;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CashQrWidget$provideGlance$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashQrWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashQrWidget$provideGlance$1(CashQrWidget cashQrWidget, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashQrWidget;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.provideGlance(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
