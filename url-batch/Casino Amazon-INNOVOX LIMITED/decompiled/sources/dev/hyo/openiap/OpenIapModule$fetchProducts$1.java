package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ProductDetails;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.helpers.HelpersKt;
import dev.hyo.openiap.helpers.ProductManager;
import dev.hyo.openiap.utils.BillingConverters;
import dev.hyo.openiap.utils.ProductExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/FetchProductsResult;", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Ldev/hyo/openiap/ProductRequest;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$fetchProducts$1", f = "OpenIapModule.kt", i = {0}, l = {169}, m = "invokeSuspend", n = {OutcomeEventsTable.COLUMN_NAME_PARAMS}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$fetchProducts$1 extends SuspendLambda implements Function2<ProductRequest, Continuation<? super FetchProductsResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$fetchProducts$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$fetchProducts$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$fetchProducts$1 openIapModule$fetchProducts$1 = new OpenIapModule$fetchProducts$1(this.this$0, continuation);
        openIapModule$fetchProducts$1.L$0 = obj;
        return openIapModule$fetchProducts$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductRequest productRequest, Continuation<? super FetchProductsResult> continuation) {
        return ((OpenIapModule$fetchProducts$1) create(productRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/FetchProductsResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$fetchProducts$1$1", f = "OpenIapModule.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {178, 183, 194, 205}, m = "invokeSuspend", n = {"$this$withContext", "client", "queryType", "$this$withContext", "client", "queryType", "$this$withContext", "client", "queryType", "allProducts", "processedIds", "$this$invokeSuspend_u24lambda_u242", "$i$a$-runCatching-OpenIapModule$fetchProducts$1$1$inAppDetails$1", "$this$withContext", "client", "queryType", "allProducts", "processedIds", "inAppDetails", "$this$invokeSuspend_u24lambda_u243", "$i$a$-runCatching-OpenIapModule$fetchProducts$1$1$subsDetails$1"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$fetchProducts$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchProductsResult>, Object> {
        final /* synthetic */ ProductRequest $params;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* compiled from: OpenIapModule.kt */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: dev.hyo.openiap.OpenIapModule$fetchProducts$1$1$WhenMappings */
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
                try {
                    iArr[ProductQueryType.All.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OpenIapModule openIapModule, ProductRequest productRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
            this.$params = productRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$params, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FetchProductsResult> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x0280, code lost:
        
            if (r0 == r3) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x02db, code lost:
        
            if (r0 == r3) goto L104;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[LOOP:3: B:62:0x0137->B:64:0x013d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BillingClient billingClient;
            ProductManager productManager;
            Object queryProductDetails;
            ProductManager productManager2;
            Object queryProductDetails2;
            ArrayList arrayList;
            Set set;
            ProductQueryType productQueryType;
            ProductManager productManager3;
            Object queryProductDetails3;
            Object m3984constructorimpl;
            Set set2;
            ArrayList arrayList2;
            ProductManager productManager4;
            Object queryProductDetails4;
            Object m3984constructorimpl2;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                billingClient = this.this$0.billingClient;
                if (billingClient == null) {
                    throw OpenIapError.NotPrepared.INSTANCE;
                }
                if (!billingClient.isReady()) {
                    throw OpenIapError.NotPrepared.INSTANCE;
                }
                if (this.$params.getSkus().isEmpty() && this.$params.getType() != ProductQueryType.All) {
                    throw OpenIapError.EmptySkuList.INSTANCE;
                }
                ProductQueryType type = this.$params.getType();
                if (type == null) {
                    type = ProductQueryType.All;
                }
                ProductQueryType productQueryType2 = type;
                int i2 = WhenMappings.$EnumSwitchMapping$0[productQueryType2.ordinal()];
                if (i2 == 1) {
                    productManager = this.this$0.productManager;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType2);
                    this.label = 1;
                    queryProductDetails = HelpersKt.queryProductDetails(billingClient, productManager, this.$params.getSkus(), "inapp", this);
                } else if (i2 == 2) {
                    productManager2 = this.this$0.productManager;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType2);
                    this.label = 2;
                    queryProductDetails2 = HelpersKt.queryProductDetails(billingClient, productManager2, this.$params.getSkus(), "subs", this);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    OpenIapModule openIapModule = this.this$0;
                    ProductRequest productRequest = this.$params;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        productManager3 = openIapModule.productManager;
                        List<String> skus = productRequest.getSkus();
                        this.L$0 = coroutineScope;
                        this.L$1 = billingClient;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType2);
                        this.L$3 = arrayList;
                        this.L$4 = linkedHashSet;
                        this.L$5 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.I$0 = 0;
                        this.label = 3;
                        queryProductDetails3 = HelpersKt.queryProductDetails(billingClient, productManager3, skus, "inapp", this);
                    } catch (Throwable th) {
                        th = th;
                        set = linkedHashSet;
                        productQueryType = productQueryType2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
                        List emptyList = CollectionsKt.emptyList();
                        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                        }
                        List<ProductDetails> list = (List) m3984constructorimpl;
                        while (r12.hasNext()) {
                        }
                        OpenIapModule openIapModule2 = this.this$0;
                        ProductRequest productRequest2 = this.$params;
                        Result.Companion companion3 = Result.INSTANCE;
                        productManager4 = openIapModule2.productManager;
                        List<String> skus2 = productRequest2.getSkus();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType);
                        this.L$3 = arrayList;
                        this.L$4 = set;
                        this.L$5 = SpillingKt.nullOutSpilledVariable(list);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.I$0 = 0;
                        this.label = 4;
                        queryProductDetails4 = HelpersKt.queryProductDetails(billingClient, productManager4, skus2, "subs", this);
                        if (queryProductDetails4 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (queryProductDetails3 != coroutine_suspended) {
                        set = linkedHashSet;
                        productQueryType = productQueryType2;
                        m3984constructorimpl = Result.m3984constructorimpl((List) queryProductDetails3);
                        List emptyList2 = CollectionsKt.emptyList();
                        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                        }
                        List<ProductDetails> list2 = (List) m3984constructorimpl;
                        while (r12.hasNext()) {
                        }
                        OpenIapModule openIapModule22 = this.this$0;
                        ProductRequest productRequest22 = this.$params;
                        Result.Companion companion32 = Result.INSTANCE;
                        productManager4 = openIapModule22.productManager;
                        List<String> skus22 = productRequest22.getSkus();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType);
                        this.L$3 = arrayList;
                        this.L$4 = set;
                        this.L$5 = SpillingKt.nullOutSpilledVariable(list2);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.I$0 = 0;
                        this.label = 4;
                        queryProductDetails4 = HelpersKt.queryProductDetails(billingClient, productManager4, skus22, "subs", this);
                        if (queryProductDetails4 != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                queryProductDetails = obj;
                Iterable iterable = (Iterable) queryProductDetails;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(BillingConverters.INSTANCE.toInAppProduct((ProductDetails) it.next()));
                }
                return new FetchProductsResultProducts(arrayList3);
            }
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                queryProductDetails2 = obj;
                Iterable iterable2 = (Iterable) queryProductDetails2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(BillingConverters.INSTANCE.toSubscriptionProduct((ProductDetails) it2.next()));
                }
                return new FetchProductsResultSubscriptions(arrayList4);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set2 = (Set) this.L$4;
                arrayList2 = (List) this.L$3;
                try {
                    ResultKt.throwOnFailure(obj);
                    queryProductDetails4 = obj;
                    m3984constructorimpl2 = Result.m3984constructorimpl((List) queryProductDetails4);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion4 = Result.INSTANCE;
                    m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th));
                    List emptyList3 = CollectionsKt.emptyList();
                    if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                    }
                    while (r0.hasNext()) {
                    }
                    if (!this.$params.getSkus().isEmpty()) {
                    }
                    return new FetchProductsResultProducts(arrayList2);
                }
                List emptyList32 = CollectionsKt.emptyList();
                if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                    m3984constructorimpl2 = emptyList32;
                }
                for (ProductDetails productDetails : (List) m3984constructorimpl2) {
                    if (!set2.contains(productDetails.getProductId())) {
                        arrayList2.add(ProductExtensionsKt.toProduct(BillingConverters.INSTANCE.toSubscriptionProduct(productDetails)));
                    }
                }
                if (!this.$params.getSkus().isEmpty()) {
                    List list3 = arrayList2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    for (Object obj2 : list3) {
                        linkedHashMap.put(((Product) obj2).getId(), obj2);
                    }
                    List<String> skus3 = this.$params.getSkus();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it3 = skus3.iterator();
                    while (it3.hasNext()) {
                        Product product = (Product) linkedHashMap.get((String) it3.next());
                        if (product != null) {
                            arrayList5.add(product);
                        }
                    }
                    arrayList2 = arrayList5;
                }
                return new FetchProductsResultProducts(arrayList2);
            }
            set = (Set) this.L$4;
            arrayList = (List) this.L$3;
            productQueryType = (ProductQueryType) this.L$2;
            billingClient = (BillingClient) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                queryProductDetails3 = obj;
                m3984constructorimpl = Result.m3984constructorimpl((List) queryProductDetails3);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
                List emptyList22 = CollectionsKt.emptyList();
                if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                }
                List<ProductDetails> list22 = (List) m3984constructorimpl;
                while (r12.hasNext()) {
                }
                OpenIapModule openIapModule222 = this.this$0;
                ProductRequest productRequest222 = this.$params;
                Result.Companion companion322 = Result.INSTANCE;
                productManager4 = openIapModule222.productManager;
                List<String> skus222 = productRequest222.getSkus();
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType);
                this.L$3 = arrayList;
                this.L$4 = set;
                this.L$5 = SpillingKt.nullOutSpilledVariable(list22);
                this.L$6 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.I$0 = 0;
                this.label = 4;
                queryProductDetails4 = HelpersKt.queryProductDetails(billingClient, productManager4, skus222, "subs", this);
                if (queryProductDetails4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            List emptyList222 = CollectionsKt.emptyList();
            if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                m3984constructorimpl = emptyList222;
            }
            List<ProductDetails> list222 = (List) m3984constructorimpl;
            for (ProductDetails productDetails2 : list222) {
                arrayList.add(BillingConverters.INSTANCE.toInAppProduct(productDetails2));
                String productId = productDetails2.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
                set.add(productId);
            }
            OpenIapModule openIapModule2222 = this.this$0;
            ProductRequest productRequest2222 = this.$params;
            try {
                Result.Companion companion3222 = Result.INSTANCE;
                productManager4 = openIapModule2222.productManager;
                List<String> skus2222 = productRequest2222.getSkus();
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient);
                this.L$2 = SpillingKt.nullOutSpilledVariable(productQueryType);
                this.L$3 = arrayList;
                this.L$4 = set;
                this.L$5 = SpillingKt.nullOutSpilledVariable(list222);
                this.L$6 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.I$0 = 0;
                this.label = 4;
                queryProductDetails4 = HelpersKt.queryProductDetails(billingClient, productManager4, skus2222, "subs", this);
            } catch (Throwable th4) {
                th = th4;
                set2 = set;
                arrayList2 = arrayList;
                Result.Companion companion42 = Result.INSTANCE;
                m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th));
                List emptyList322 = CollectionsKt.emptyList();
                if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                }
                while (r0.hasNext()) {
                }
                if (!this.$params.getSkus().isEmpty()) {
                }
                return new FetchProductsResultProducts(arrayList2);
            }
            if (queryProductDetails4 != coroutine_suspended) {
                set2 = set;
                arrayList2 = arrayList;
                m3984constructorimpl2 = Result.m3984constructorimpl((List) queryProductDetails4);
                List emptyList3222 = CollectionsKt.emptyList();
                if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                }
                while (r0.hasNext()) {
                }
                if (!this.$params.getSkus().isEmpty()) {
                }
                return new FetchProductsResultProducts(arrayList2);
            }
            return coroutine_suspended;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductRequest productRequest = (ProductRequest) this.L$0;
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
        this.L$0 = SpillingKt.nullOutSpilledVariable(productRequest);
        this.label = 1;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, productRequest, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
