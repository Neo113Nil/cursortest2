package dev.hyo.openiap.helpers;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import dev.hyo.openiap.ErrorCode;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.Purchase;
import dev.hyo.openiap.PurchaseError;
import dev.hyo.openiap.RequestPurchaseAndroidProps;
import dev.hyo.openiap.RequestPurchaseProps;
import dev.hyo.openiap.RequestSubscriptionAndroidProps;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import dev.hyo.openiap.utils.BillingConverters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: Helpers.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\u00020\t2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@¢\u0006\u0002\u0010\u0007\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0080@¢\u0006\u0002\u0010\u0011\u001a0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0080@¢\u0006\u0002\u0010\u0015\u001a<\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0080@¢\u0006\u0002\u0010\u001b\u001a\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0000\u001a\f\u0010\u001f\u001a\u00020\t*\u00020 H\u0000¨\u0006!"}, d2 = {"onPurchaseUpdated", "Ldev/hyo/openiap/Purchase;", "addListener", "Lkotlin/Function1;", "Ldev/hyo/openiap/listener/OpenIapPurchaseUpdateListener;", "", "removeListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPurchaseError", "Ldev/hyo/openiap/PurchaseError;", "Ldev/hyo/openiap/listener/OpenIapPurchaseErrorListener;", "restorePurchases", "", "client", "Lcom/android/billingclient/api/BillingClient;", "includeSuspended", "", "(Lcom/android/billingclient/api/BillingClient;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "productType", "", "(Lcom/android/billingclient/api/BillingClient;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProductDetails", "Lcom/android/billingclient/api/ProductDetails;", "productManager", "Ldev/hyo/openiap/helpers/ProductManager;", "skus", "(Lcom/android/billingclient/api/BillingClient;Ldev/hyo/openiap/helpers/ProductManager;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toAndroidPurchaseArgs", "Ldev/hyo/openiap/helpers/AndroidPurchaseArgs;", "Ldev/hyo/openiap/RequestPurchaseProps;", "toPurchaseError", "Ldev/hyo/openiap/OpenIapError;", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HelpersKt {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object restorePurchases(BillingClient billingClient, boolean z, Continuation<? super List<? extends Purchase>> continuation) {
        HelpersKt$restorePurchases$1 helpersKt$restorePurchases$1;
        int i;
        BillingClient billingClient2;
        Collection collection;
        Object obj;
        boolean z2;
        List list;
        List list2;
        if (continuation instanceof HelpersKt$restorePurchases$1) {
            helpersKt$restorePurchases$1 = (HelpersKt$restorePurchases$1) continuation;
            if ((helpersKt$restorePurchases$1.label & Integer.MIN_VALUE) != 0) {
                helpersKt$restorePurchases$1.label -= Integer.MIN_VALUE;
                Object obj2 = helpersKt$restorePurchases$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = helpersKt$restorePurchases$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (billingClient == null) {
                        return CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = arrayList;
                    helpersKt$restorePurchases$1.L$0 = billingClient;
                    helpersKt$restorePurchases$1.L$1 = arrayList;
                    helpersKt$restorePurchases$1.L$2 = arrayList2;
                    helpersKt$restorePurchases$1.Z$0 = z;
                    helpersKt$restorePurchases$1.label = 1;
                    Object queryPurchases = queryPurchases(billingClient, "inapp", false, helpersKt$restorePurchases$1);
                    if (queryPurchases != coroutine_suspended) {
                        billingClient2 = billingClient;
                        collection = arrayList2;
                        obj = queryPurchases;
                        z2 = z;
                        list = arrayList;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = helpersKt$restorePurchases$1.Z$0;
                    list2 = (Collection) helpersKt$restorePurchases$1.L$2;
                    list = (List) helpersKt$restorePurchases$1.L$1;
                    ResultKt.throwOnFailure(obj2);
                    CollectionsKt.addAll(list2, (Iterable) obj2);
                    return list;
                }
                boolean z4 = helpersKt$restorePurchases$1.Z$0;
                collection = (Collection) helpersKt$restorePurchases$1.L$2;
                List list3 = (List) helpersKt$restorePurchases$1.L$1;
                billingClient2 = (BillingClient) helpersKt$restorePurchases$1.L$0;
                ResultKt.throwOnFailure(obj2);
                z2 = z4;
                list = list3;
                obj = obj2;
                CollectionsKt.addAll(collection, (Iterable) obj);
                list2 = list;
                helpersKt$restorePurchases$1.L$0 = SpillingKt.nullOutSpilledVariable(billingClient2);
                helpersKt$restorePurchases$1.L$1 = list;
                helpersKt$restorePurchases$1.L$2 = list2;
                helpersKt$restorePurchases$1.Z$0 = z2;
                helpersKt$restorePurchases$1.label = 2;
                obj2 = queryPurchases(billingClient2, "subs", z2, helpersKt$restorePurchases$1);
            }
        }
        helpersKt$restorePurchases$1 = new HelpersKt$restorePurchases$1(continuation);
        Object obj22 = helpersKt$restorePurchases$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = helpersKt$restorePurchases$1.label;
        if (i != 0) {
        }
        CollectionsKt.addAll(collection, (Iterable) obj);
        list2 = list;
        helpersKt$restorePurchases$1.L$0 = SpillingKt.nullOutSpilledVariable(billingClient2);
        helpersKt$restorePurchases$1.L$1 = list;
        helpersKt$restorePurchases$1.L$2 = list2;
        helpersKt$restorePurchases$1.Z$0 = z2;
        helpersKt$restorePurchases$1.label = 2;
        obj22 = queryPurchases(billingClient2, "subs", z2, helpersKt$restorePurchases$1);
    }

    public static /* synthetic */ Object restorePurchases$default(BillingClient billingClient, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return restorePurchases(billingClient, z, continuation);
    }

    public static /* synthetic */ Object queryPurchases$default(BillingClient billingClient, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return queryPurchases(billingClient, str, z, continuation);
    }

    public static final Object queryProductDetails(BillingClient billingClient, ProductManager productManager, List<String> list, String str, Continuation<? super List<ProductDetails>> continuation) {
        if (billingClient == null) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        if (!billingClient.isReady()) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        return productManager.getOrQuery(billingClient, list, str, continuation);
    }

    public static final AndroidPurchaseArgs toAndroidPurchaseArgs(RequestPurchaseProps requestPurchaseProps) {
        Intrinsics.checkNotNullParameter(requestPurchaseProps, "<this>");
        RequestPurchaseProps.Request request = requestPurchaseProps.getRequest();
        if (request instanceof RequestPurchaseProps.Request.Purchase) {
            RequestPurchaseProps.Request.Purchase purchase = (RequestPurchaseProps.Request.Purchase) request;
            RequestPurchaseAndroidProps google = purchase.getValue().getGoogle();
            if (google == null && (google = purchase.getValue().getAndroid()) == null) {
                throw new IllegalArgumentException("Google purchase parameters are required (use 'google' field)");
            }
            return new AndroidPurchaseArgs(google.getSkus(), google.isOfferPersonalized(), google.getObfuscatedAccountId(), google.getObfuscatedProfileId(), google.getOfferToken(), null, null, null, null, google.getDeveloperBillingOption(), requestPurchaseProps.getType(), requestPurchaseProps.getUseAlternativeBilling());
        }
        if (!(request instanceof RequestPurchaseProps.Request.Subscription)) {
            throw new NoWhenBranchMatchedException();
        }
        RequestPurchaseProps.Request.Subscription subscription = (RequestPurchaseProps.Request.Subscription) request;
        RequestSubscriptionAndroidProps google2 = subscription.getValue().getGoogle();
        if (google2 == null && (google2 = subscription.getValue().getAndroid()) == null) {
            throw new IllegalArgumentException("Google subscription parameters are required (use 'google' field)");
        }
        return new AndroidPurchaseArgs(google2.getSkus(), google2.isOfferPersonalized(), google2.getObfuscatedAccountId(), google2.getObfuscatedProfileId(), null, google2.getPurchaseToken(), google2.getReplacementMode(), google2.getSubscriptionOffers(), google2.getSubscriptionProductReplacementParams(), google2.getDeveloperBillingOption(), requestPurchaseProps.getType(), requestPurchaseProps.getUseAlternativeBilling());
    }

    public static final PurchaseError toPurchaseError(OpenIapError openIapError) {
        Object m3984constructorimpl;
        String sku;
        Intrinsics.checkNotNullParameter(openIapError, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ErrorCode.INSTANCE.fromJson(openIapError.getCode()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3987exceptionOrNullimpl(m3984constructorimpl) != null) {
            m3984constructorimpl = ErrorCode.Unknown;
        }
        ErrorCode errorCode = (ErrorCode) m3984constructorimpl;
        if (openIapError instanceof OpenIapError.ProductNotFound) {
            sku = ((OpenIapError.ProductNotFound) openIapError).getProductId();
        } else {
            sku = openIapError instanceof OpenIapError.SkuNotFound ? ((OpenIapError.SkuNotFound) openIapError).getSku() : null;
        }
        return new PurchaseError(errorCode, openIapError.getMessage(), sku);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [dev.hyo.openiap.helpers.HelpersKt$onPurchaseUpdated$2$listener$1, java.lang.Object] */
    public static final Object onPurchaseUpdated(Function1<? super OpenIapPurchaseUpdateListener, Unit> function1, final Function1<? super OpenIapPurchaseUpdateListener, Unit> function12, Continuation<? super Purchase> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final ?? r2 = new OpenIapPurchaseUpdateListener() { // from class: dev.hyo.openiap.helpers.HelpersKt$onPurchaseUpdated$2$listener$1
            @Override // dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener
            public void onPurchaseUpdated(Purchase purchase) {
                Intrinsics.checkNotNullParameter(purchase, "purchase");
                function12.invoke(this);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<Purchase> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m3984constructorimpl(purchase));
                }
            }
        };
        function1.invoke(r2);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: dev.hyo.openiap.helpers.HelpersKt$onPurchaseUpdated$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                function12.invoke(r2);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [dev.hyo.openiap.helpers.HelpersKt$onPurchaseError$2$listener$1, java.lang.Object] */
    public static final Object onPurchaseError(Function1<? super OpenIapPurchaseErrorListener, Unit> function1, final Function1<? super OpenIapPurchaseErrorListener, Unit> function12, Continuation<? super PurchaseError> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final ?? r2 = new OpenIapPurchaseErrorListener() { // from class: dev.hyo.openiap.helpers.HelpersKt$onPurchaseError$2$listener$1
            @Override // dev.hyo.openiap.listener.OpenIapPurchaseErrorListener
            public void onPurchaseError(OpenIapError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                function12.invoke(this);
                if (cancellableContinuationImpl2.isActive()) {
                    CancellableContinuation<PurchaseError> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m3984constructorimpl(HelpersKt.toPurchaseError(error)));
                }
            }
        };
        function1.invoke(r2);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: dev.hyo.openiap.helpers.HelpersKt$onPurchaseError$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                function12.invoke(r2);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object queryPurchases(BillingClient billingClient, final String str, boolean z, Continuation<? super List<? extends Purchase>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (billingClient == null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(CollectionsKt.emptyList()));
        } else {
            QueryPurchasesParams.Builder productType = QueryPurchasesParams.newBuilder().setProductType(str);
            Intrinsics.checkNotNullExpressionValue(productType, "setProductType(...)");
            if (Intrinsics.areEqual(str, "subs") && z) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m3984constructorimpl(productType.getClass().getMethod("setIncludeSuspended", Boolean.TYPE).invoke(productType, Boxing.boxBoolean(true)));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    Result.m3984constructorimpl(ResultKt.createFailure(th));
                }
            }
            QueryPurchasesParams build = productType.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            billingClient.queryPurchasesAsync(build, new PurchasesResponseListener() { // from class: dev.hyo.openiap.helpers.HelpersKt$queryPurchases$2$2
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult result, List<com.android.billingclient.api.Purchase> purchaseList) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
                    if (result.getResponseCode() == 0) {
                        List<com.android.billingclient.api.Purchase> list = purchaseList;
                        String str2 = str;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (com.android.billingclient.api.Purchase purchase : list) {
                            BillingConverters billingConverters = BillingConverters.INSTANCE;
                            Intrinsics.checkNotNull(purchase);
                            arrayList.add(billingConverters.toPurchase(purchase, str2, null));
                        }
                        CancellableContinuation<List<? extends Purchase>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m3984constructorimpl(arrayList));
                        return;
                    }
                    CancellableContinuation<List<? extends Purchase>> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion5 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m3984constructorimpl(CollectionsKt.emptyList()));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
