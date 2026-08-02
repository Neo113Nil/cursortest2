package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BillingDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.secrethq.store.util.BillingDataSource", f = "BillingDataSource.kt", i = {0, 0, 0}, l = {687}, m = "processNonConsumablePurchase", n = {"this", "purchase", "wasPending"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
final class BillingDataSource$processNonConsumablePurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BillingDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingDataSource$processNonConsumablePurchase$1(BillingDataSource billingDataSource, Continuation<? super BillingDataSource$processNonConsumablePurchase$1> continuation) {
        super(continuation);
        this.this$0 = billingDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processNonConsumablePurchase;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processNonConsumablePurchase = this.this$0.processNonConsumablePurchase(null, false, this);
        return processNonConsumablePurchase;
    }
}
