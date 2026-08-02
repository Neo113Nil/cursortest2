package com.stripe.android.uicore.elements.bottomsheet;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class StripeBottomSheetState$awaitDismissal$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeBottomSheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeBottomSheetState$awaitDismissal$1(StripeBottomSheetState stripeBottomSheetState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = stripeBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitDismissal(this);
    }
}
