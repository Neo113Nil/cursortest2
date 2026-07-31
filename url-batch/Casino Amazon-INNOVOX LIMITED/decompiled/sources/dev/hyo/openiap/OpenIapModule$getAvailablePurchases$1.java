package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import dev.hyo.openiap.helpers.HelpersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/Purchase;", "options", "Ldev/hyo/openiap/PurchaseOptions;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getAvailablePurchases$1", f = "OpenIapModule.kt", i = {0}, l = {230}, m = "invokeSuspend", n = {"options"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$getAvailablePurchases$1 extends SuspendLambda implements Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$getAvailablePurchases$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$getAvailablePurchases$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$getAvailablePurchases$1 openIapModule$getAvailablePurchases$1 = new OpenIapModule$getAvailablePurchases$1(this.this$0, continuation);
        openIapModule$getAvailablePurchases$1.L$0 = obj;
        return openIapModule$getAvailablePurchases$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PurchaseOptions purchaseOptions, Continuation<? super List<? extends Purchase>> continuation) {
        return ((OpenIapModule$getAvailablePurchases$1) create(purchaseOptions, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getAvailablePurchases$1$1", f = "OpenIapModule.kt", i = {0}, l = {232}, m = "invokeSuspend", n = {"includeSuspended"}, s = {"I$0"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$getAvailablePurchases$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
        final /* synthetic */ PurchaseOptions $options;
        int I$0;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchaseOptions purchaseOptions, OpenIapModule openIapModule, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$options = purchaseOptions;
            this.this$0 = openIapModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$options, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BillingClient billingClient;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PurchaseOptions purchaseOptions = this.$options;
            ?? areEqual = purchaseOptions != null ? Intrinsics.areEqual(purchaseOptions.getIncludeSuspendedAndroid(), Boxing.boxBoolean(true)) : 0;
            billingClient = this.this$0.billingClient;
            this.I$0 = areEqual;
            this.label = 1;
            Object restorePurchases = HelpersKt.restorePurchases(billingClient, areEqual, this);
            return restorePurchases == coroutine_suspended ? coroutine_suspended : restorePurchases;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PurchaseOptions purchaseOptions = (PurchaseOptions) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.L$0 = SpillingKt.nullOutSpilledVariable(purchaseOptions);
        this.label = 1;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(purchaseOptions, this.this$0, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
