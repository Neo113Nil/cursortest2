package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.secrethq.store.util.BillingDataSource$processRestoredPurchasesList$2", f = "BillingDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BillingDataSource$processRestoredPurchasesList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Void>, Object> {
    final /* synthetic */ List<Purchase> $purchases;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingDataSource$processRestoredPurchasesList$2(List<? extends Purchase> list, BillingDataSource billingDataSource, Continuation<? super BillingDataSource$processRestoredPurchasesList$2> continuation) {
        super(2, continuation);
        this.$purchases = list;
        this.this$0 = billingDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingDataSource$processRestoredPurchasesList$2 billingDataSource$processRestoredPurchasesList$2 = new BillingDataSource$processRestoredPurchasesList$2(this.$purchases, this.this$0, continuation);
        billingDataSource$processRestoredPurchasesList$2.L$0 = obj;
        return billingDataSource$processRestoredPurchasesList$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Void> continuation) {
        return ((BillingDataSource$processRestoredPurchasesList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        boolean isValidIAP;
        boolean isConsumableIAP;
        Function2 function22;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Function2 function23 = null;
        if (this.$purchases.size() == 0) {
            function22 = this.this$0.restoreCallback;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("restoreCallback");
            } else {
                function23 = function22;
            }
            return (Void) function23.invoke(Boxing.boxInt(this.this$0.getBILLING_RESPONSE_RESULT_RESTORE_COMPLETED()), "No products needed to be restored");
        }
        for (Purchase purchase : this.$purchases) {
            for (String str : purchase.getProducts()) {
                BillingDataSource billingDataSource = this.this$0;
                Intrinsics.checkNotNull(str);
                isValidIAP = billingDataSource.isValidIAP(str);
                if (isValidIAP) {
                    isConsumableIAP = this.this$0.isConsumableIAP(str);
                    if (!isConsumableIAP) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, purchase, str, null), 3, null);
                    }
                }
            }
        }
        function2 = this.this$0.restoreCallback;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("restoreCallback");
        } else {
            function23 = function2;
        }
        return (Void) function23.invoke(Boxing.boxInt(this.this$0.getBILLING_RESPONSE_RESULT_RESTORE_COMPLETED()), "All products have been restored");
    }

    /* compiled from: BillingDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.secrethq.store.util.BillingDataSource$processRestoredPurchasesList$2$1", f = "BillingDataSource.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.secrethq.store.util.BillingDataSource$processRestoredPurchasesList$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $productId;
        final /* synthetic */ Purchase $purchase;
        int label;
        final /* synthetic */ BillingDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BillingDataSource billingDataSource, Purchase purchase, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = billingDataSource;
            this.$purchase = purchase;
            this.$productId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$purchase, this.$productId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object processNonConsumablePurchase;
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                processNonConsumablePurchase = this.this$0.processNonConsumablePurchase(this.$purchase, false, this);
                if (processNonConsumablePurchase == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            function2 = this.this$0.restoreCallback;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("restoreCallback");
                function2 = null;
            }
            Integer boxInt = Boxing.boxInt(this.this$0.getBILLING_RESPONSE_RESULT_OK());
            String productId = this.$productId;
            Intrinsics.checkNotNullExpressionValue(productId, "$productId");
            function2.invoke(boxInt, productId);
            return Unit.INSTANCE;
        }
    }
}
