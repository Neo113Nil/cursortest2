package dev.hyo.openiap;

import dev.hyo.openiap.RequestPurchaseProps;
import dev.hyo.openiap.store.OpenIapStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapViewModel$requestPurchase$1", f = "OpenIapViewModel.kt", i = {0, 0, 0, 0}, l = {80}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "props", "$i$a$-runCatching-OpenIapViewModel$requestPurchase$1$1"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapViewModel$requestPurchase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $skus;
    final /* synthetic */ ProductQueryType $type;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OpenIapViewModel this$0;

    /* compiled from: OpenIapViewModel.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductQueryType.values().length];
            try {
                iArr[ProductQueryType.InApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductQueryType.Subs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapViewModel$requestPurchase$1(ProductQueryType productQueryType, List<String> list, OpenIapViewModel openIapViewModel, Continuation<? super OpenIapViewModel$requestPurchase$1> continuation) {
        super(2, continuation);
        this.$type = productQueryType;
        this.$skus = list;
        this.this$0 = openIapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapViewModel$requestPurchase$1 openIapViewModel$requestPurchase$1 = new OpenIapViewModel$requestPurchase$1(this.$type, this.$skus, this.this$0, continuation);
        openIapViewModel$requestPurchase$1.L$0 = obj;
        return openIapViewModel$requestPurchase$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OpenIapViewModel$requestPurchase$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RequestPurchaseProps requestPurchaseProps;
        OpenIapStore openIapStore;
        Object invoke;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProductQueryType productQueryType = this.$type;
                List<String> list = this.$skus;
                OpenIapViewModel openIapViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[productQueryType.ordinal()];
                if (i2 == 1) {
                    requestPurchaseProps = new RequestPurchaseProps(new RequestPurchaseProps.Request.Purchase(new RequestPurchasePropsByPlatforms(new RequestPurchaseAndroidProps(null, null, null, null, null, list, 17, null), null, null, null, 14, null)), productQueryType, null, 4, null);
                } else if (i2 == 2) {
                    requestPurchaseProps = new RequestPurchaseProps(new RequestPurchaseProps.Request.Subscription(new RequestSubscriptionPropsByPlatforms(new RequestSubscriptionAndroidProps(null, null, null, null, null, null, list, null, null, 257, null), null, null, null, 14, null)), productQueryType, null, 4, null);
                } else {
                    throw new IllegalArgumentException("type must be InApp or Subs");
                }
                openIapStore = openIapViewModel.store;
                Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResult>, Object> requestPurchase = openIapStore.getRequestPurchase();
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$2 = SpillingKt.nullOutSpilledVariable(requestPurchaseProps);
                this.I$0 = 0;
                this.label = 1;
                invoke = requestPurchase.invoke(requestPurchaseProps, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                invoke = obj;
            }
            Result.m3984constructorimpl((RequestPurchaseResult) invoke);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
