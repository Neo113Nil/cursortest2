package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BillingDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.secrethq.store.util.BillingDataSource", f = "BillingDataSource.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {569, 590}, m = "acknowledgePurchase", n = {"this", "purchaseToken", "params", "trial", "this", "purchaseToken", "params", "trial", "response"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class BillingDataSource$acknowledgePurchase$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingDataSource$acknowledgePurchase$1(BillingDataSource billingDataSource, Continuation<? super BillingDataSource$acknowledgePurchase$1> continuation) {
        super(continuation);
        this.this$0 = billingDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.acknowledgePurchase(null, this);
    }
}
