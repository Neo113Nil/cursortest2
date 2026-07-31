package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ProductDetails;
import dev.hyo.openiap.helpers.HelpersKt;
import dev.hyo.openiap.helpers.ProductManager;
import dev.hyo.openiap.utils.BillingConvertersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/ActiveSubscription;", "subscriptionIds", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getActiveSubscriptions$1", f = "OpenIapModule.kt", i = {0}, l = {237}, m = "invokeSuspend", n = {"subscriptionIds"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$getActiveSubscriptions$1 extends SuspendLambda implements Function2<List<? extends String>, Continuation<? super List<? extends ActiveSubscription>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$getActiveSubscriptions$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$getActiveSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$getActiveSubscriptions$1 openIapModule$getActiveSubscriptions$1 = new OpenIapModule$getActiveSubscriptions$1(this.this$0, continuation);
        openIapModule$getActiveSubscriptions$1.L$0 = obj;
        return openIapModule$getActiveSubscriptions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Continuation<? super List<? extends ActiveSubscription>> continuation) {
        return invoke2((List<String>) list, (Continuation<? super List<ActiveSubscription>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Continuation<? super List<ActiveSubscription>> continuation) {
        return ((OpenIapModule$getActiveSubscriptions$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/ActiveSubscription;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$getActiveSubscriptions$1$1", f = "OpenIapModule.kt", i = {1, 1, 1, 1}, l = {238, 258}, m = "invokeSuspend", n = {"androidPurchases", "ids", "filtered", "productIdsNeedingDetails"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$getActiveSubscriptions$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ActiveSubscription>>, Object> {
        final /* synthetic */ List<String> $subscriptionIds;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OpenIapModule openIapModule, List<String> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
            this.$subscriptionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$subscriptionIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ActiveSubscription>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ActiveSubscription>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ActiveSubscription>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:99:0x0052, code lost:
        
            if (r2 == r0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0179  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BillingClient billingClient;
            Object queryPurchases$default;
            Collection collection;
            Collection collection2;
            BillingClient billingClient2;
            ProductManager productManager;
            ProductManager productManager2;
            ProductManager productManager3;
            ActiveSubscription activeSubscription;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                billingClient = this.this$0.billingClient;
                this.label = 1;
                queryPurchases$default = HelpersKt.queryPurchases$default(billingClient, "subs", false, this, 4, null);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection2 = (List) this.L$2;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        e = e;
                        OpenIapLog.INSTANCE.w("Failed to query ProductDetails for missing products: " + e.getMessage(), "OpenIapModule");
                        collection = collection2;
                        Collection<PurchaseAndroid> collection3 = collection;
                        OpenIapModule openIapModule = this.this$0;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
                        while (r3.hasNext()) {
                        }
                        return arrayList;
                    }
                    collection = collection2;
                    Collection<PurchaseAndroid> collection32 = collection;
                    OpenIapModule openIapModule2 = this.this$0;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection32, 10));
                    for (PurchaseAndroid purchaseAndroid : collection32) {
                        productManager3 = openIapModule2.productManager;
                        ProductDetails productDetails = productManager3.get(purchaseAndroid.getProductId());
                        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails != null ? productDetails.getSubscriptionOfferDetails() : null;
                        if (subscriptionOfferDetails == null) {
                            subscriptionOfferDetails = CollectionsKt.emptyList();
                        }
                        if (subscriptionOfferDetails.size() > 1) {
                            OpenIapLog.INSTANCE.w("Multiple offers (" + subscriptionOfferDetails.size() + ") found for " + purchaseAndroid.getProductId() + ", using first basePlanId (may be inaccurate)", "OpenIapModule");
                        }
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails);
                        String basePlanId = subscriptionOfferDetails2 != null ? subscriptionOfferDetails2.getBasePlanId() : null;
                        if (basePlanId != null && purchaseAndroid.getCurrentPlanId() == null) {
                            activeSubscription = BillingConvertersKt.toActiveSubscription(PurchaseAndroid.copy$default(purchaseAndroid, null, basePlanId, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, 0.0d, null, 4194301, null));
                        } else {
                            activeSubscription = BillingConvertersKt.toActiveSubscription(purchaseAndroid);
                        }
                        arrayList2.add(activeSubscription);
                    }
                    return arrayList2;
                }
                ResultKt.throwOnFailure(obj);
                queryPurchases$default = obj;
            }
            Collection arrayList3 = new ArrayList();
            for (Object obj2 : (Iterable) queryPurchases$default) {
                if (obj2 instanceof PurchaseAndroid) {
                    arrayList3.add(obj2);
                }
            }
            Collection collection4 = (List) arrayList3;
            List<String> list = this.$subscriptionIds;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (list.isEmpty()) {
                collection = collection4;
            } else {
                Collection arrayList4 = new ArrayList();
                for (Object obj3 : collection4) {
                    if (list.contains(((PurchaseAndroid) obj3).getProductId())) {
                        arrayList4.add(obj3);
                    }
                }
                collection = (List) arrayList4;
            }
            Collection collection5 = collection;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection5, 10));
            Iterator it = collection5.iterator();
            while (it.hasNext()) {
                arrayList5.add(((PurchaseAndroid) it.next()).getProductId());
            }
            List distinct = CollectionsKt.distinct(arrayList5);
            OpenIapModule openIapModule3 = this.this$0;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : distinct) {
                productManager2 = openIapModule3.productManager;
                if (productManager2.get((String) obj4) == null) {
                    arrayList6.add(obj4);
                }
            }
            ArrayList arrayList7 = arrayList6;
            if (!arrayList7.isEmpty()) {
                try {
                    billingClient2 = this.this$0.billingClient;
                    productManager = this.this$0.productManager;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(collection4);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$2 = collection;
                    this.L$3 = SpillingKt.nullOutSpilledVariable(arrayList7);
                    this.label = 2;
                } catch (Exception e2) {
                    e = e2;
                    collection2 = collection;
                    OpenIapLog.INSTANCE.w("Failed to query ProductDetails for missing products: " + e.getMessage(), "OpenIapModule");
                    collection = collection2;
                    Collection<PurchaseAndroid> collection322 = collection;
                    OpenIapModule openIapModule22 = this.this$0;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection322, 10));
                    while (r3.hasNext()) {
                    }
                    return arrayList22;
                }
                if (HelpersKt.queryProductDetails(billingClient2, productManager, arrayList7, "subs", this) != coroutine_suspended) {
                    collection2 = collection;
                    collection = collection2;
                }
                return coroutine_suspended;
            }
            Collection<PurchaseAndroid> collection3222 = collection;
            OpenIapModule openIapModule222 = this.this$0;
            ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3222, 10));
            while (r3.hasNext()) {
            }
            return arrayList222;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
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
        this.L$0 = SpillingKt.nullOutSpilledVariable(list);
        this.label = 1;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, list, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }
}
