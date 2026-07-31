package dev.hyo.openiap;

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
@DebugMetadata(c = "dev.hyo.openiap.OpenIapViewModel$fetchProducts$1", f = "OpenIapViewModel.kt", i = {0, 0, 0, 0}, l = {30}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "request", "$i$a$-runCatching-OpenIapViewModel$fetchProducts$1$1"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapViewModel$fetchProducts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $skus;
    final /* synthetic */ ProductQueryType $type;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OpenIapViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapViewModel$fetchProducts$1(List<String> list, ProductQueryType productQueryType, OpenIapViewModel openIapViewModel, Continuation<? super OpenIapViewModel$fetchProducts$1> continuation) {
        super(2, continuation);
        this.$skus = list;
        this.$type = productQueryType;
        this.this$0 = openIapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapViewModel$fetchProducts$1 openIapViewModel$fetchProducts$1 = new OpenIapViewModel$fetchProducts$1(this.$skus, this.$type, this.this$0, continuation);
        openIapViewModel$fetchProducts$1.L$0 = obj;
        return openIapViewModel$fetchProducts$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OpenIapViewModel$fetchProducts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapStore openIapStore;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<String> list = this.$skus;
                ProductQueryType productQueryType = this.$type;
                OpenIapViewModel openIapViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                ProductRequest productRequest = new ProductRequest(list, productQueryType);
                openIapStore = openIapViewModel.store;
                Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> fetchProducts = openIapStore.getFetchProducts();
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$2 = SpillingKt.nullOutSpilledVariable(productRequest);
                this.I$0 = 0;
                this.label = 1;
                obj = fetchProducts.invoke(productRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m3984constructorimpl((FetchProductsResult) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
