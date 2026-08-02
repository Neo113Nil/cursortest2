package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.secrethq.store.util.BillingDataSource$restorePreviousIAPs$1$1", f = "BillingDataSource.kt", i = {}, l = {834}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BillingDataSource$restorePreviousIAPs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Purchase> $purchasesList;
    int label;
    final /* synthetic */ BillingDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingDataSource$restorePreviousIAPs$1$1(BillingDataSource billingDataSource, List<Purchase> list, Continuation<? super BillingDataSource$restorePreviousIAPs$1$1> continuation) {
        super(2, continuation);
        this.this$0 = billingDataSource;
        this.$purchasesList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingDataSource$restorePreviousIAPs$1$1(this.this$0, this.$purchasesList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingDataSource$restorePreviousIAPs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processRestoredPurchasesList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BillingDataSource billingDataSource = this.this$0;
            List<Purchase> purchasesList = this.$purchasesList;
            Intrinsics.checkNotNullExpressionValue(purchasesList, "$purchasesList");
            this.label = 1;
            processRestoredPurchasesList = billingDataSource.processRestoredPurchasesList(purchasesList, this);
            if (processRestoredPurchasesList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
