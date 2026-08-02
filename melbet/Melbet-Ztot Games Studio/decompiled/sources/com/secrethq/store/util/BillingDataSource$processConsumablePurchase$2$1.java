package com.secrethq.store.util;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.secrethq.store.util.BillingDataSource$processConsumablePurchase$2$1", f = "BillingDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BillingDataSource$processConsumablePurchase$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $wasPending;
    int label;
    final /* synthetic */ BillingDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingDataSource$processConsumablePurchase$2$1(boolean z, BillingDataSource billingDataSource, Continuation<? super BillingDataSource$processConsumablePurchase$2$1> continuation) {
        super(2, continuation);
        this.$wasPending = z;
        this.this$0 = billingDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingDataSource$processConsumablePurchase$2$1(this.$wasPending, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingDataSource$processConsumablePurchase$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        Function2 function22;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function2 function23 = null;
        if (this.$wasPending) {
            function22 = this.this$0.pendingCallback;
            if (function22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pendingCallback");
            } else {
                function23 = function22;
            }
            function23.invoke(Boxing.boxInt(this.this$0.getBILLING_RESPONSE_RESULT_OK()), "Purchase successful.");
        } else {
            function2 = this.this$0.callback;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
            } else {
                function23 = function2;
            }
            function23.invoke(Boxing.boxInt(this.this$0.getBILLING_RESPONSE_RESULT_OK()), "Purchase successful.");
        }
        return Unit.INSTANCE;
    }
}
