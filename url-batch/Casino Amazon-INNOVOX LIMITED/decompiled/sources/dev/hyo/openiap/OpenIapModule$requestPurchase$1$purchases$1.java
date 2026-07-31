package dev.hyo.openiap;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.helpers.AndroidPurchaseArgs;
import dev.hyo.openiap.helpers.HelpersKt;
import dev.hyo.openiap.helpers.ProductManager;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$requestPurchase$1$purchases$1", f = "OpenIapModule.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {732, 758, 783, 1818}, m = "invokeSuspend", n = {"$this$withContext", "client", "activity", "$this$withContext", "client", "activity", "isAvailable", "$this$withContext", "client", "activity", "isAvailable", "dialogSuccess", "$this$withContext", "androidArgs", "activity", "client", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "I$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$requestPurchase$1$purchases$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
    final /* synthetic */ RequestPurchaseProps $props;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$requestPurchase$1$purchases$1(OpenIapModule openIapModule, RequestPurchaseProps requestPurchaseProps, Continuation<? super OpenIapModule$requestPurchase$1$purchases$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
        this.$props = requestPurchaseProps;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$requestPurchase$1$purchases$1 openIapModule$requestPurchase$1$purchases$1 = new OpenIapModule$requestPurchase$1$purchases$1(this.this$0, this.$props, continuation);
        openIapModule$requestPurchase$1$purchases$1.L$0 = obj;
        return openIapModule$requestPurchase$1$purchases$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
        return ((OpenIapModule$requestPurchase$1$purchases$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01de A[Catch: Exception -> 0x0076, TryCatch #7 {Exception -> 0x0076, blocks: (B:14:0x004b, B:16:0x01da, B:18:0x01de, B:20:0x0283, B:21:0x028f, B:23:0x0295, B:30:0x02aa, B:33:0x02b4, B:36:0x005c, B:38:0x017a, B:40:0x0182, B:41:0x018e, B:43:0x0194, B:50:0x01a9, B:53:0x01b3, B:55:0x01b8, B:60:0x006c, B:62:0x0104, B:64:0x010c, B:65:0x012c, B:67:0x0132, B:74:0x0147, B:77:0x0151, B:79:0x0156, B:109:0x00eb, B:69:0x0138, B:45:0x019a, B:25:0x029b), top: B:2:0x001d, inners: #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0283 A[Catch: Exception -> 0x0076, TryCatch #7 {Exception -> 0x0076, blocks: (B:14:0x004b, B:16:0x01da, B:18:0x01de, B:20:0x0283, B:21:0x028f, B:23:0x0295, B:30:0x02aa, B:33:0x02b4, B:36:0x005c, B:38:0x017a, B:40:0x0182, B:41:0x018e, B:43:0x0194, B:50:0x01a9, B:53:0x01b3, B:55:0x01b8, B:60:0x006c, B:62:0x0104, B:64:0x010c, B:65:0x012c, B:67:0x0132, B:74:0x0147, B:77:0x0151, B:79:0x0156, B:109:0x00eb, B:69:0x0138, B:45:0x019a, B:25:0x029b), top: B:2:0x001d, inners: #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0182 A[Catch: Exception -> 0x0076, TryCatch #7 {Exception -> 0x0076, blocks: (B:14:0x004b, B:16:0x01da, B:18:0x01de, B:20:0x0283, B:21:0x028f, B:23:0x0295, B:30:0x02aa, B:33:0x02b4, B:36:0x005c, B:38:0x017a, B:40:0x0182, B:41:0x018e, B:43:0x0194, B:50:0x01a9, B:53:0x01b3, B:55:0x01b8, B:60:0x006c, B:62:0x0104, B:64:0x010c, B:65:0x012c, B:67:0x0132, B:74:0x0147, B:77:0x0151, B:79:0x0156, B:109:0x00eb, B:69:0x0138, B:45:0x019a, B:25:0x029b), top: B:2:0x001d, inners: #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b8 A[Catch: Exception -> 0x0076, TryCatch #7 {Exception -> 0x0076, blocks: (B:14:0x004b, B:16:0x01da, B:18:0x01de, B:20:0x0283, B:21:0x028f, B:23:0x0295, B:30:0x02aa, B:33:0x02b4, B:36:0x005c, B:38:0x017a, B:40:0x0182, B:41:0x018e, B:43:0x0194, B:50:0x01a9, B:53:0x01b3, B:55:0x01b8, B:60:0x006c, B:62:0x0104, B:64:0x010c, B:65:0x012c, B:67:0x0132, B:74:0x0147, B:77:0x0151, B:79:0x0156, B:109:0x00eb, B:69:0x0138, B:45:0x019a, B:25:0x029b), top: B:2:0x001d, inners: #3, #4, #6 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Set<OpenIapPurchaseErrorListener> set;
        AlternativeBillingMode alternativeBillingMode;
        WeakReference weakReference;
        Activity activity;
        final BillingClient billingClient;
        Set<OpenIapPurchaseErrorListener> set2;
        Object obj2;
        Set<OpenIapPurchaseErrorListener> set3;
        Function1 function1;
        ProductManager productManager;
        Set<OpenIapPurchaseErrorListener> set4;
        Set<OpenIapPurchaseErrorListener> set5;
        BillingClient billingClient2;
        Set<OpenIapPurchaseErrorListener> set6;
        WeakReference weakReference2;
        Activity activity2;
        Object checkAlternativeBillingAvailability;
        Set<OpenIapPurchaseErrorListener> set7;
        Object showAlternativeBillingInformationDialog;
        BillingClient billingClient3;
        boolean z;
        Set<OpenIapPurchaseErrorListener> set8;
        boolean booleanValue;
        Object createAlternativeBillingReportingToken;
        Set<OpenIapPurchaseErrorListener> set9;
        String str;
        Set<OpenIapPurchaseErrorListener> set10;
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                alternativeBillingMode = this.this$0.alternativeBillingMode;
                if (alternativeBillingMode == AlternativeBillingMode.ALTERNATIVE_ONLY) {
                    OpenIapLog.INSTANCE.d("=== ALTERNATIVE BILLING ONLY MODE ===", "OpenIapModule");
                    billingClient2 = this.this$0.billingClient;
                    if (billingClient2 != null && billingClient2.isReady()) {
                        weakReference2 = this.this$0.currentActivityRef;
                        if (weakReference2 == null || (activity2 = (Activity) weakReference2.get()) == null) {
                            activity2 = this.this$0.fallbackActivity;
                        }
                        if (activity2 == null) {
                            OpenIapError.MissingCurrentActivity missingCurrentActivity = OpenIapError.MissingCurrentActivity.INSTANCE;
                            set7 = this.this$0.purchaseErrorListeners;
                            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener : set7) {
                                try {
                                    Result.Companion companion = Result.INSTANCE;
                                    openIapPurchaseErrorListener.onPurchaseError(missingCurrentActivity);
                                    Result.m3984constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    Result.m3984constructorimpl(ResultKt.createFailure(th));
                                }
                            }
                            return CollectionsKt.emptyList();
                        }
                        this.L$0 = coroutineScope;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient2);
                        this.L$2 = activity2;
                        this.label = 1;
                        checkAlternativeBillingAvailability = this.this$0.checkAlternativeBillingAvailability(this);
                        if (checkAlternativeBillingAvailability == coroutine_suspended) {
                        }
                    } else {
                        OpenIapError.NotPrepared notPrepared = OpenIapError.NotPrepared.INSTANCE;
                        set6 = this.this$0.purchaseErrorListeners;
                        for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener2 : set6) {
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                openIapPurchaseErrorListener2.onPurchaseError(notPrepared);
                                Result.m3984constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th2) {
                                Result.Companion companion4 = Result.INSTANCE;
                                Result.m3984constructorimpl(ResultKt.createFailure(th2));
                            }
                        }
                        return CollectionsKt.emptyList();
                    }
                } else {
                    final AndroidPurchaseArgs androidPurchaseArgs = HelpersKt.toAndroidPurchaseArgs(this.$props);
                    weakReference = this.this$0.currentActivityRef;
                    if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                        activity = this.this$0.fallbackActivity;
                    }
                    final Activity activity3 = activity;
                    if (activity3 != null) {
                        billingClient = this.this$0.billingClient;
                        if (billingClient == null || !billingClient.isReady()) {
                            OpenIapError.NotPrepared notPrepared2 = OpenIapError.NotPrepared.INSTANCE;
                            set2 = this.this$0.purchaseErrorListeners;
                            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener3 : set2) {
                                try {
                                    Result.Companion companion5 = Result.INSTANCE;
                                    openIapPurchaseErrorListener3.onPurchaseError(notPrepared2);
                                    Result.m3984constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th3) {
                                    Result.Companion companion6 = Result.INSTANCE;
                                    Result.m3984constructorimpl(ResultKt.createFailure(th3));
                                }
                            }
                            return CollectionsKt.emptyList();
                        }
                        if (androidPurchaseArgs.getSkus().isEmpty()) {
                            OpenIapError.EmptySkuList emptySkuList = OpenIapError.EmptySkuList.INSTANCE;
                            set4 = this.this$0.purchaseErrorListeners;
                            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener4 : set4) {
                                try {
                                    Result.Companion companion7 = Result.INSTANCE;
                                    openIapPurchaseErrorListener4.onPurchaseError(emptySkuList);
                                    Result.m3984constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th4) {
                                    Result.Companion companion8 = Result.INSTANCE;
                                    Result.m3984constructorimpl(ResultKt.createFailure(th4));
                                }
                            }
                            return CollectionsKt.emptyList();
                        }
                        final OpenIapModule openIapModule = this.this$0;
                        this.L$0 = coroutineScope;
                        this.L$1 = androidPurchaseArgs;
                        this.L$2 = activity3;
                        this.L$3 = billingClient;
                        this.L$4 = openIapModule;
                        this.I$0 = 0;
                        this.label = 4;
                        OpenIapModule$requestPurchase$1$purchases$1 openIapModule$requestPurchase$1$purchases$1 = this;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$requestPurchase$1$purchases$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        openIapModule.currentPurchaseCallback = new Function1<Result<? extends List<? extends Purchase>>, Unit>() { // from class: dev.hyo.openiap.OpenIapModule$requestPurchase$1$purchases$1$10$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends List<? extends Purchase>> result) {
                                m3900invoke(result.getValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m3900invoke(Object obj3) {
                                if (cancellableContinuationImpl2.isActive()) {
                                    CancellableContinuation<List<? extends Purchase>> cancellableContinuation = cancellableContinuationImpl2;
                                    List emptyList = CollectionsKt.emptyList();
                                    if (Result.m3990isFailureimpl(obj3)) {
                                        obj3 = emptyList;
                                    }
                                    Result.Companion companion9 = Result.INSTANCE;
                                    cancellableContinuation.resumeWith(Result.m3984constructorimpl(obj3));
                                }
                            }
                        };
                        String str2 = androidPurchaseArgs.getType() == ProductQueryType.Subs ? "subs" : "inapp";
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (String str3 : androidPurchaseArgs.getSkus()) {
                            productManager = openIapModule.productManager;
                            ProductDetails productDetails = productManager.get(str3);
                            if (productDetails != null) {
                                ProductDetails productDetails2 = Intrinsics.areEqual(productDetails.getProductType(), str2) ? productDetails : null;
                                if (productDetails2 != null) {
                                    linkedHashMap.put(str3, productDetails2);
                                    Unit unit = Unit.INSTANCE;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }
                        List<String> skus = androidPurchaseArgs.getSkus();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : skus) {
                            if (!linkedHashMap.containsKey((String) obj3)) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            List<String> skus2 = androidPurchaseArgs.getSkus();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it = skus2.iterator();
                            while (it.hasNext()) {
                                ProductDetails productDetails3 = (ProductDetails) linkedHashMap.get((String) it.next());
                                if (productDetails3 != null) {
                                    arrayList3.add(productDetails3);
                                }
                            }
                            ArrayList arrayList4 = arrayList3;
                            if (arrayList4.size() == androidPurchaseArgs.getSkus().size()) {
                                invokeSuspend$lambda$31$buildAndLaunch(androidPurchaseArgs, openIapModule, coroutineScope, billingClient, activity3, arrayList4);
                            } else {
                                Iterator<T> it2 = androidPurchaseArgs.getSkus().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    Object next = it2.next();
                                    if (!linkedHashMap.containsKey((String) next)) {
                                        obj2 = next;
                                        break;
                                    }
                                }
                                String str4 = (String) obj2;
                                OpenIapError.SkuNotFound skuNotFound = new OpenIapError.SkuNotFound(str4 != null ? str4 : "");
                                set3 = openIapModule.purchaseErrorListeners;
                                for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener5 : set3) {
                                    try {
                                        Result.Companion companion9 = Result.INSTANCE;
                                        openIapPurchaseErrorListener5.onPurchaseError(skuNotFound);
                                        Result.m3984constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th5) {
                                        Result.Companion companion10 = Result.INSTANCE;
                                        Result.m3984constructorimpl(ResultKt.createFailure(th5));
                                    }
                                }
                                function1 = openIapModule.currentPurchaseCallback;
                                if (function1 != null) {
                                    Result.Companion companion11 = Result.INSTANCE;
                                    function1.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                        } else {
                            ArrayList arrayList5 = arrayList2;
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it3.next()).setProductType(str2).build());
                            }
                            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList6).build();
                            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                            billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: dev.hyo.openiap.OpenIapModule$requestPurchase$1$purchases$1$10$5
                                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                                public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult result) {
                                    Set<OpenIapPurchaseErrorListener> set11;
                                    Function1 function12;
                                    ProductManager productManager2;
                                    Object obj4;
                                    Set<OpenIapPurchaseErrorListener> set12;
                                    Function1 function13;
                                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    List<ProductDetails> productDetailsList = result.getProductDetailsList();
                                    Intrinsics.checkNotNullExpressionValue(productDetailsList, "getProductDetailsList(...)");
                                    if (billingResult.getResponseCode() == 0) {
                                        List<ProductDetails> list = productDetailsList;
                                        if (!list.isEmpty()) {
                                            productManager2 = OpenIapModule.this.productManager;
                                            productManager2.putAll(list);
                                            for (ProductDetails productDetails4 : productDetailsList) {
                                                linkedHashMap.put(productDetails4.getProductId(), productDetails4);
                                            }
                                            List<String> skus3 = androidPurchaseArgs.getSkus();
                                            Map<String, ProductDetails> map = linkedHashMap;
                                            ArrayList arrayList7 = new ArrayList();
                                            Iterator<T> it4 = skus3.iterator();
                                            while (it4.hasNext()) {
                                                ProductDetails productDetails5 = map.get((String) it4.next());
                                                if (productDetails5 != null) {
                                                    arrayList7.add(productDetails5);
                                                }
                                            }
                                            ArrayList arrayList8 = arrayList7;
                                            if (arrayList8.size() != androidPurchaseArgs.getSkus().size()) {
                                                List<String> skus4 = androidPurchaseArgs.getSkus();
                                                Map<String, ProductDetails> map2 = linkedHashMap;
                                                Iterator<T> it5 = skus4.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        obj4 = it5.next();
                                                        if (!map2.containsKey((String) obj4)) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj4 = null;
                                                        break;
                                                    }
                                                }
                                                String str5 = (String) obj4;
                                                if (str5 == null) {
                                                    str5 = "";
                                                }
                                                OpenIapError.SkuNotFound skuNotFound2 = new OpenIapError.SkuNotFound(str5);
                                                set12 = OpenIapModule.this.purchaseErrorListeners;
                                                for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener6 : set12) {
                                                    try {
                                                        Result.Companion companion12 = Result.INSTANCE;
                                                        openIapPurchaseErrorListener6.onPurchaseError(skuNotFound2);
                                                        Result.m3984constructorimpl(Unit.INSTANCE);
                                                    } catch (Throwable th6) {
                                                        Result.Companion companion13 = Result.INSTANCE;
                                                        Result.m3984constructorimpl(ResultKt.createFailure(th6));
                                                    }
                                                }
                                                function13 = OpenIapModule.this.currentPurchaseCallback;
                                                if (function13 != null) {
                                                    Result.Companion companion14 = Result.INSTANCE;
                                                    function13.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                                                    return;
                                                }
                                                return;
                                            }
                                            OpenIapModule$requestPurchase$1$purchases$1.invokeSuspend$lambda$31$buildAndLaunch(androidPurchaseArgs, OpenIapModule.this, coroutineScope, billingClient, activity3, arrayList8);
                                            return;
                                        }
                                    }
                                    OpenIapError.QueryProduct queryProduct = OpenIapError.QueryProduct.INSTANCE;
                                    set11 = OpenIapModule.this.purchaseErrorListeners;
                                    for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener7 : set11) {
                                        try {
                                            Result.Companion companion15 = Result.INSTANCE;
                                            openIapPurchaseErrorListener7.onPurchaseError(queryProduct);
                                            Result.m3984constructorimpl(Unit.INSTANCE);
                                        } catch (Throwable th7) {
                                            Result.Companion companion16 = Result.INSTANCE;
                                            Result.m3984constructorimpl(ResultKt.createFailure(th7));
                                        }
                                    }
                                    function12 = OpenIapModule.this.currentPurchaseCallback;
                                    if (function12 != null) {
                                        Result.Companion companion17 = Result.INSTANCE;
                                        function12.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                                    }
                                }
                            });
                        }
                        Object result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(openIapModule$requestPurchase$1$purchases$1);
                        }
                        if (result != coroutine_suspended) {
                            return result;
                        }
                    } else {
                        OpenIapError.MissingCurrentActivity missingCurrentActivity2 = OpenIapError.MissingCurrentActivity.INSTANCE;
                        set5 = this.this$0.purchaseErrorListeners;
                        for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener6 : set5) {
                            try {
                                Result.Companion companion12 = Result.INSTANCE;
                                openIapPurchaseErrorListener6.onPurchaseError(missingCurrentActivity2);
                                Result.m3984constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th6) {
                                Result.Companion companion13 = Result.INSTANCE;
                                Result.m3984constructorimpl(ResultKt.createFailure(th6));
                            }
                        }
                        return CollectionsKt.emptyList();
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                Activity activity4 = (Activity) this.L$2;
                BillingClient billingClient4 = (BillingClient) this.L$1;
                ResultKt.throwOnFailure(obj);
                activity2 = activity4;
                billingClient2 = billingClient4;
                checkAlternativeBillingAvailability = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    createAlternativeBillingReportingToken = obj;
                    str = (String) createAlternativeBillingReportingToken;
                    if (str == null) {
                        OpenIapLog.INSTANCE.d("✓ Alternative billing token created: " + str, "OpenIapModule");
                        OpenIapLog.INSTANCE.d("", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("============================================================", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("NEXT STEPS (PRODUCTION IMPLEMENTATION REQUIRED)", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("============================================================", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("This token must be used to report the transaction to Google Play.", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("Required implementation:", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("1. Process payment through YOUR alternative payment system", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("2. After successful payment, send this token to your backend:", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("   Token: " + str, "OpenIapModule");
                        OpenIapLog.INSTANCE.d("3. Backend reports to Google Play Developer API within 24 hours:", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("   POST https://androidpublisher.googleapis.com/androidpublisher/v3/", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("        applications/{packageName}/externalTransactions", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("   Body: { externalTransactionToken: \"" + str + "\", ... }", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("See: https://developer.android.com/google/play/billing/alternative/reporting", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("============================================================", "OpenIapModule");
                        OpenIapLog.INSTANCE.d("=== END ALTERNATIVE BILLING ONLY MODE ===", "OpenIapModule");
                        return CollectionsKt.emptyList();
                    }
                    OpenIapError.PurchaseFailed purchaseFailed = OpenIapError.PurchaseFailed.INSTANCE;
                    set10 = this.this$0.purchaseErrorListeners;
                    for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener7 : set10) {
                        try {
                            Result.Companion companion14 = Result.INSTANCE;
                            openIapPurchaseErrorListener7.onPurchaseError(purchaseFailed);
                            Result.m3984constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th7) {
                            Result.Companion companion15 = Result.INSTANCE;
                            Result.m3984constructorimpl(ResultKt.createFailure(th7));
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                z = this.Z$0;
                activity2 = (Activity) this.L$2;
                BillingClient billingClient5 = (BillingClient) this.L$1;
                ResultKt.throwOnFailure(obj);
                billingClient3 = billingClient5;
                showAlternativeBillingInformationDialog = obj;
                booleanValue = ((Boolean) showAlternativeBillingInformationDialog).booleanValue();
                if (booleanValue) {
                    OpenIapError.UserCancelled userCancelled = OpenIapError.UserCancelled.INSTANCE;
                    set9 = this.this$0.purchaseErrorListeners;
                    for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener8 : set9) {
                        try {
                            Result.Companion companion16 = Result.INSTANCE;
                            openIapPurchaseErrorListener8.onPurchaseError(userCancelled);
                            Result.m3984constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th8) {
                            Result.Companion companion17 = Result.INSTANCE;
                            Result.m3984constructorimpl(ResultKt.createFailure(th8));
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                this.L$0 = coroutineScope;
                this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient3);
                this.L$2 = SpillingKt.nullOutSpilledVariable(activity2);
                this.Z$0 = z;
                this.Z$1 = booleanValue;
                this.label = 3;
                createAlternativeBillingReportingToken = this.this$0.createAlternativeBillingReportingToken(this);
                if (createAlternativeBillingReportingToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (String) createAlternativeBillingReportingToken;
                if (str == null) {
                }
            }
            boolean booleanValue2 = ((Boolean) checkAlternativeBillingAvailability).booleanValue();
            if (!booleanValue2) {
                OpenIapLog.e$default(OpenIapLog.INSTANCE, "Alternative billing is not available for this user/app", null, "OpenIapModule", 2, null);
                OpenIapError.AlternativeBillingUnavailable alternativeBillingUnavailable = new OpenIapError.AlternativeBillingUnavailable("Alternative Billing Unavailable\n\nPossible causes:\n1. User is not in an eligible country\n2. App not enrolled in Alternative Billing program\n3. Play Console setup incomplete\n\nTo enable Alternative Billing:\n• Enroll app in Google Play Console\n• Wait for Google approval\n• Test with license tester accounts\n\nCurrent mode: ALTERNATIVE_ONLY\nLibrary: Billing 8.1.0");
                set8 = this.this$0.purchaseErrorListeners;
                for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener9 : set8) {
                    try {
                        Result.Companion companion18 = Result.INSTANCE;
                        openIapPurchaseErrorListener9.onPurchaseError(alternativeBillingUnavailable);
                        Result.m3984constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th9) {
                        Result.Companion companion19 = Result.INSTANCE;
                        Result.m3984constructorimpl(ResultKt.createFailure(th9));
                    }
                }
                return CollectionsKt.emptyList();
            }
            this.L$0 = coroutineScope;
            this.L$1 = SpillingKt.nullOutSpilledVariable(billingClient2);
            this.L$2 = SpillingKt.nullOutSpilledVariable(activity2);
            this.Z$0 = booleanValue2;
            this.label = 2;
            showAlternativeBillingInformationDialog = this.this$0.showAlternativeBillingInformationDialog(activity2, this);
            if (showAlternativeBillingInformationDialog == coroutine_suspended) {
                return coroutine_suspended;
            }
            billingClient3 = billingClient2;
            z = booleanValue2;
            booleanValue = ((Boolean) showAlternativeBillingInformationDialog).booleanValue();
            if (booleanValue) {
            }
        } catch (Exception e) {
            OpenIapLog.INSTANCE.e("Alternative billing only flow failed: " + e.getMessage(), e, "OpenIapModule");
            OpenIapError.FeatureNotSupported featureNotSupported = OpenIapError.FeatureNotSupported.INSTANCE;
            set = this.this$0.purchaseErrorListeners;
            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener10 : set) {
                try {
                    Result.Companion companion20 = Result.INSTANCE;
                    openIapPurchaseErrorListener10.onPurchaseError(featureNotSupported);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th10) {
                    Result.Companion companion21 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th10));
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void invokeSuspend$lambda$31$buildAndLaunch(AndroidPurchaseArgs androidPurchaseArgs, OpenIapModule openIapModule, CoroutineScope coroutineScope, BillingClient billingClient, Activity activity, List<ProductDetails> list) {
        OpenIapError.UserCancelled userCancelled;
        Set<OpenIapPurchaseErrorListener> set;
        Function1 function1;
        String purchaseToken;
        Iterator it;
        int i;
        String offerToken;
        ArrayList emptyList;
        Set<OpenIapPurchaseErrorListener> set2;
        Function1 function12;
        Set<OpenIapPurchaseErrorListener> set3;
        Function1 function13;
        ArrayList emptyList2;
        ArrayList emptyList3;
        String str;
        String str2;
        String str3;
        Set<OpenIapPurchaseErrorListener> set4;
        Function1 function14;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        AndroidSubscriptionOfferInput androidSubscriptionOfferInput;
        String offerToken2;
        Set<OpenIapPurchaseErrorListener> set5;
        Function1 function15;
        ArrayList<BillingFlowParams.ProductDetailsParams> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (androidPurchaseArgs.getType() == ProductQueryType.InApp && (offerToken2 = androidPurchaseArgs.getOfferToken()) != null && offerToken2.length() != 0 && androidPurchaseArgs.getSkus().size() > 1) {
            OpenIapLog.INSTANCE.w("offerToken requires a single SKU. Provided SKUs: " + androidPurchaseArgs.getSkus(), "OpenIapModule");
            OpenIapError.SkuOfferMismatch skuOfferMismatch = OpenIapError.SkuOfferMismatch.INSTANCE;
            set5 = openIapModule.purchaseErrorListeners;
            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener : set5) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    openIapPurchaseErrorListener.onPurchaseError(skuOfferMismatch);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th));
                }
            }
            function15 = openIapModule.currentPurchaseCallback;
            if (function15 != null) {
                Result.Companion companion3 = Result.INSTANCE;
                function15.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                return;
            }
            return;
        }
        if (androidPurchaseArgs.getType() == ProductQueryType.Subs) {
            List<AndroidSubscriptionOfferInput> subscriptionOffers = androidPurchaseArgs.getSubscriptionOffers();
            if (subscriptionOffers == null) {
                subscriptionOffers = CollectionsKt.emptyList();
            }
            for (AndroidSubscriptionOfferInput androidSubscriptionOfferInput2 : subscriptionOffers) {
                if (androidSubscriptionOfferInput2.getOfferToken().length() > 0) {
                    OpenIapLog.INSTANCE.d("Adding offer token for SKU " + androidSubscriptionOfferInput2.getSku() + ": " + androidSubscriptionOfferInput2.getOfferToken(), "OpenIapModule");
                    String sku = androidSubscriptionOfferInput2.getSku();
                    Object obj = linkedHashMap.get(sku);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(sku, obj);
                    }
                    ((List) obj).add(androidSubscriptionOfferInput2.getOfferToken());
                }
            }
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            ProductDetails productDetails = (ProductDetails) it2.next();
            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
            Intrinsics.checkNotNullExpressionValue(productDetails2, "setProductDetails(...)");
            if (androidPurchaseArgs.getType() == ProductQueryType.Subs) {
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
                if (subscriptionOfferDetails2 == null) {
                    it = it2;
                    emptyList2 = CollectionsKt.emptyList();
                } else {
                    List<ProductDetails.SubscriptionOfferDetails> list2 = subscriptionOfferDetails2;
                    it = it2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails3 = (ProductDetails.SubscriptionOfferDetails) it3.next();
                        arrayList2.add(subscriptionOfferDetails3.getBasePlanId() + StringUtils.PROCESS_POSTFIX_DELIMITER + subscriptionOfferDetails3.getOfferToken());
                    }
                    emptyList2 = arrayList2;
                }
                i = i3;
                OpenIapLog.INSTANCE.d("Available offers for " + productDetails.getProductId() + ": " + emptyList2, "OpenIapModule");
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails4 = productDetails.getSubscriptionOfferDetails();
                if (subscriptionOfferDetails4 == null) {
                    emptyList3 = CollectionsKt.emptyList();
                } else {
                    List<ProductDetails.SubscriptionOfferDetails> list3 = subscriptionOfferDetails4;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((ProductDetails.SubscriptionOfferDetails) it4.next()).getOfferToken());
                    }
                    emptyList3 = arrayList3;
                }
                List list4 = (List) linkedHashMap.get(productDetails.getProductId());
                String str4 = (list4 == null || list4.isEmpty()) ? null : (String) list4.remove(0);
                List<AndroidSubscriptionOfferInput> subscriptionOffers2 = androidPurchaseArgs.getSubscriptionOffers();
                if (subscriptionOffers2 != null && (androidSubscriptionOfferInput = (AndroidSubscriptionOfferInput) CollectionsKt.getOrNull(subscriptionOffers2, i2)) != null) {
                    if (!Intrinsics.areEqual(androidSubscriptionOfferInput.getSku(), productDetails.getProductId())) {
                        androidSubscriptionOfferInput = null;
                    }
                    if (androidSubscriptionOfferInput != null) {
                        str = androidSubscriptionOfferInput.getOfferToken();
                        if (str4 == null) {
                            str2 = str4;
                        } else if (str == null) {
                            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails5 = productDetails.getSubscriptionOfferDetails();
                            str2 = (subscriptionOfferDetails5 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails5)) == null) ? null : subscriptionOfferDetails.getOfferToken();
                        } else {
                            str2 = str;
                        }
                        OpenIapLog.INSTANCE.d("Resolved offer token for " + productDetails.getProductId() + ": " + str2, "OpenIapModule");
                        str3 = str2;
                        if (str3 != null || str3.length() == 0 || (!emptyList3.isEmpty() && !emptyList3.contains(str2))) {
                            OpenIapLog.INSTANCE.w("Invalid offer token: " + str2 + " not in " + emptyList3, "OpenIapModule");
                            OpenIapError.SkuOfferMismatch skuOfferMismatch2 = OpenIapError.SkuOfferMismatch.INSTANCE;
                            set4 = openIapModule.purchaseErrorListeners;
                            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener2 : set4) {
                                try {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    openIapPurchaseErrorListener2.onPurchaseError(skuOfferMismatch2);
                                    Result.m3984constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th2) {
                                    Result.Companion companion5 = Result.INSTANCE;
                                    Result.m3984constructorimpl(ResultKt.createFailure(th2));
                                }
                            }
                            function14 = openIapModule.currentPurchaseCallback;
                            if (function14 == null) {
                                Result.Companion companion6 = Result.INSTANCE;
                                function14.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                                return;
                            }
                            return;
                        }
                        productDetails2.setOfferToken(str2);
                        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams = androidPurchaseArgs.getSubscriptionProductReplacementParams();
                        if (subscriptionProductReplacementParams != null && (Intrinsics.areEqual(subscriptionProductReplacementParams.getOldProductId(), productDetails.getProductId()) || androidPurchaseArgs.getSkus().size() == 1)) {
                            openIapModule.applySubscriptionProductReplacementParams(productDetails2, subscriptionProductReplacementParams);
                        }
                    }
                }
                str = null;
                if (str4 == null) {
                }
                OpenIapLog.INSTANCE.d("Resolved offer token for " + productDetails.getProductId() + ": " + str2, "OpenIapModule");
                str3 = str2;
                if (str3 != null) {
                }
                OpenIapLog.INSTANCE.w("Invalid offer token: " + str2 + " not in " + emptyList3, "OpenIapModule");
                OpenIapError.SkuOfferMismatch skuOfferMismatch22 = OpenIapError.SkuOfferMismatch.INSTANCE;
                set4 = openIapModule.purchaseErrorListeners;
                while (r3.hasNext()) {
                }
                function14 = openIapModule.currentPurchaseCallback;
                if (function14 == null) {
                }
            } else {
                it = it2;
                i = i3;
                if (androidPurchaseArgs.getType() == ProductQueryType.InApp && (offerToken = androidPurchaseArgs.getOfferToken()) != null && offerToken.length() != 0) {
                    OpenIapLog.INSTANCE.d("Setting offer token for one-time product " + productDetails.getProductId() + ": " + androidPurchaseArgs.getOfferToken(), "OpenIapModule");
                    List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetails.getOneTimePurchaseOfferDetailsList();
                    if (oneTimePurchaseOfferDetailsList != null) {
                        List<ProductDetails.OneTimePurchaseOfferDetails> list5 = oneTimePurchaseOfferDetailsList;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                        Iterator<T> it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((ProductDetails.OneTimePurchaseOfferDetails) it5.next()).getOfferToken());
                        }
                        emptyList = arrayList4;
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    if (emptyList.isEmpty()) {
                        OpenIapLog.INSTANCE.w("No one-time purchase offers available for " + productDetails.getProductId() + ", but offerToken was provided: " + androidPurchaseArgs.getOfferToken(), "OpenIapModule");
                        OpenIapError.SkuOfferMismatch skuOfferMismatch3 = OpenIapError.SkuOfferMismatch.INSTANCE;
                        set2 = openIapModule.purchaseErrorListeners;
                        for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener3 : set2) {
                            try {
                                Result.Companion companion7 = Result.INSTANCE;
                                openIapPurchaseErrorListener3.onPurchaseError(skuOfferMismatch3);
                                Result.m3984constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th3) {
                                Result.Companion companion8 = Result.INSTANCE;
                                Result.m3984constructorimpl(ResultKt.createFailure(th3));
                            }
                        }
                        function12 = openIapModule.currentPurchaseCallback;
                        if (function12 != null) {
                            Result.Companion companion9 = Result.INSTANCE;
                            function12.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                            return;
                        }
                        return;
                    }
                    if (!emptyList.contains(androidPurchaseArgs.getOfferToken())) {
                        OpenIapLog.INSTANCE.w("Invalid one-time offer token: " + androidPurchaseArgs.getOfferToken() + " not in " + emptyList, "OpenIapModule");
                        OpenIapError.SkuOfferMismatch skuOfferMismatch4 = OpenIapError.SkuOfferMismatch.INSTANCE;
                        set3 = openIapModule.purchaseErrorListeners;
                        for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener4 : set3) {
                            try {
                                Result.Companion companion10 = Result.INSTANCE;
                                openIapPurchaseErrorListener4.onPurchaseError(skuOfferMismatch4);
                                Result.m3984constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th4) {
                                Result.Companion companion11 = Result.INSTANCE;
                                Result.m3984constructorimpl(ResultKt.createFailure(th4));
                            }
                        }
                        function13 = openIapModule.currentPurchaseCallback;
                        if (function13 != null) {
                            Result.Companion companion12 = Result.INSTANCE;
                            function13.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
                            return;
                        }
                        return;
                    }
                    productDetails2.setOfferToken(androidPurchaseArgs.getOfferToken());
                }
            }
            arrayList.add(productDetails2.build());
            it2 = it;
            i2 = i;
        }
        BillingFlowParams.Builder isOfferPersonalized = BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).setIsOfferPersonalized(Intrinsics.areEqual((Object) androidPurchaseArgs.isOfferPersonalized(), (Object) true));
        Intrinsics.checkNotNullExpressionValue(isOfferPersonalized, "setIsOfferPersonalized(...)");
        String obfuscatedAccountId = androidPurchaseArgs.getObfuscatedAccountId();
        if (obfuscatedAccountId != null) {
            isOfferPersonalized.setObfuscatedAccountId(obfuscatedAccountId);
        }
        if (Intrinsics.areEqual((Object) androidPurchaseArgs.getUseAlternativeBilling(), (Object) true)) {
            OpenIapLog.INSTANCE.d("=== PURCHASE WITH ALTERNATIVE BILLING ===", "OpenIapModule");
            OpenIapLog.INSTANCE.d("useAlternativeBilling flag: true", "OpenIapModule");
            OpenIapLog.INSTANCE.d("Products: " + androidPurchaseArgs.getSkus(), "OpenIapModule");
            OpenIapLog.INSTANCE.d("Note: Alternative billing was configured during BillingClient initialization", "OpenIapModule");
            OpenIapLog.INSTANCE.d("If alternative billing is not working, check:", "OpenIapModule");
            OpenIapLog.INSTANCE.d("1. Google Play Console alternative billing setup", "OpenIapModule");
            OpenIapLog.INSTANCE.d("2. App enrollment in alternative billing program", "OpenIapModule");
            OpenIapLog.INSTANCE.d("3. Billing Library version (6.2+ required)", "OpenIapModule");
            OpenIapLog.INSTANCE.d("==========================================", "OpenIapModule");
        }
        if (androidPurchaseArgs.getType() == ProductQueryType.Subs && (purchaseToken = androidPurchaseArgs.getPurchaseToken()) != null && !StringsKt.isBlank(purchaseToken)) {
            OpenIapLog.INSTANCE.d("=== Subscription Upgrade Flow ===", "OpenIapModule");
            OpenIapLog.INSTANCE.d("  - Old Token: " + StringsKt.take(androidPurchaseArgs.getPurchaseToken(), 10) + "...", "OpenIapModule");
            OpenIapLog.INSTANCE.d("  - Target SKUs: " + androidPurchaseArgs.getSkus(), "OpenIapModule");
            OpenIapLog.INSTANCE.d("  - Replacement mode: " + androidPurchaseArgs.getReplacementMode(), "OpenIapModule");
            OpenIapLog.INSTANCE.d("  - Product Details Count: " + arrayList.size(), "OpenIapModule");
            int i4 = 0;
            for (BillingFlowParams.ProductDetailsParams productDetailsParams : arrayList) {
                OpenIapLog.INSTANCE.d("  - Product[" + i4 + "]: SKU=" + list.get(i4).getProductId() + ", offerToken=...", "OpenIapModule");
                i4++;
            }
            BillingFlowParams.SubscriptionUpdateParams.Builder oldPurchaseToken = BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(androidPurchaseArgs.getPurchaseToken());
            Intrinsics.checkNotNullExpressionValue(oldPurchaseToken, "setOldPurchaseToken(...)");
            Integer replacementMode = androidPurchaseArgs.getReplacementMode();
            int intValue = replacementMode != null ? replacementMode.intValue() : 5;
            oldPurchaseToken.setSubscriptionReplacementMode(intValue);
            OpenIapLog.INSTANCE.d("  - Final replacement mode: " + intValue, "OpenIapModule");
            BillingFlowParams.SubscriptionUpdateParams build = oldPurchaseToken.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            isOfferPersonalized.setSubscriptionUpdateParams(build);
            OpenIapLog.INSTANCE.d("=== Subscription Update Params Set ===", "OpenIapModule");
        } else {
            String obfuscatedProfileId = androidPurchaseArgs.getObfuscatedProfileId();
            if (obfuscatedProfileId != null) {
                OpenIapLog.INSTANCE.d("Setting obfuscatedProfileId for new purchase", "OpenIapModule");
                isOfferPersonalized.setObfuscatedProfileId(obfuscatedProfileId);
            }
        }
        DeveloperBillingOptionParamsAndroid developerBillingOption = androidPurchaseArgs.getDeveloperBillingOption();
        if (developerBillingOption != null) {
            openIapModule.applyDeveloperBillingOption(isOfferPersonalized, developerBillingOption);
        }
        BillingResult launchBillingFlow = billingClient.launchBillingFlow(activity, isOfferPersonalized.build());
        Intrinsics.checkNotNullExpressionValue(launchBillingFlow, "launchBillingFlow(...)");
        OpenIapLog.INSTANCE.d("launchBillingFlow result: " + launchBillingFlow.getResponseCode() + " - " + launchBillingFlow.getDebugMessage(), "OpenIapModule");
        if (launchBillingFlow.getResponseCode() != 0) {
            int responseCode = launchBillingFlow.getResponseCode();
            if (responseCode == 1) {
                userCancelled = OpenIapError.UserCancelled.INSTANCE;
            } else if (responseCode == 5) {
                OpenIapLog.INSTANCE.w("DEVELOPER_ERROR: Invalid arguments. Check if subscriptions are in the same group.", "OpenIapModule");
                userCancelled = OpenIapError.PurchaseFailed.INSTANCE;
            } else {
                userCancelled = OpenIapError.PurchaseFailed.INSTANCE;
            }
            OpenIapError openIapError = userCancelled;
            set = openIapModule.purchaseErrorListeners;
            for (OpenIapPurchaseErrorListener openIapPurchaseErrorListener5 : set) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    openIapPurchaseErrorListener5.onPurchaseError(openIapError);
                    Result.m3984constructorimpl(Unit.INSTANCE);
                } catch (Throwable th5) {
                    Result.Companion companion14 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th5));
                }
            }
            function1 = openIapModule.currentPurchaseCallback;
            if (function1 != null) {
                Result.Companion companion15 = Result.INSTANCE;
                function1.invoke(Result.m3983boximpl(Result.m3984constructorimpl(CollectionsKt.emptyList())));
            }
        }
    }
}
