package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import dev.hyo.openiap.helpers.HelpersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getAvailableItems$2", f = "OpenIapModule.kt", i = {0}, l = {1091}, m = "invokeSuspend", n = {"billingType"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$getAvailableItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
    final /* synthetic */ ProductQueryType $type;
    Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$getAvailableItems$2(ProductQueryType productQueryType, OpenIapModule openIapModule, Continuation<? super OpenIapModule$getAvailableItems$2> continuation) {
        super(2, continuation);
        this.$type = productQueryType;
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$getAvailableItems$2(this.$type, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
        return ((OpenIapModule$getAvailableItems$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

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
        String str = this.$type == ProductQueryType.Subs ? "subs" : "inapp";
        billingClient = this.this$0.billingClient;
        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
        this.label = 1;
        Object queryPurchases$default = HelpersKt.queryPurchases$default(billingClient, str, false, this, 4, null);
        return queryPurchases$default == coroutine_suspended ? coroutine_suspended : queryPurchases$default;
    }
}
