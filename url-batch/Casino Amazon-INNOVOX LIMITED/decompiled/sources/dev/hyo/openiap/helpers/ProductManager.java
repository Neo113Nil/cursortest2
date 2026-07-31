package dev.hyo.openiap.helpers;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: ProductManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Ldev/hyo/openiap/helpers/ProductManager;", "", "<init>", "()V", "cache", "", "", "Lcom/android/billingclient/api/ProductDetails;", "get", "productId", "putAll", "", "details", "", "clear", "getOrQuery", "", "client", "Lcom/android/billingclient/api/BillingClient;", "productIds", "productType", "(Lcom/android/billingclient/api/BillingClient;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductManager {
    public static final int $stable = 8;
    private final Map<String, ProductDetails> cache = new LinkedHashMap();

    public final ProductDetails get(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return this.cache.get(productId);
    }

    public final void putAll(Collection<ProductDetails> details) {
        Intrinsics.checkNotNullParameter(details, "details");
        for (ProductDetails productDetails : details) {
            this.cache.put(productDetails.getProductId(), productDetails);
        }
    }

    public final void clear() {
        this.cache.clear();
    }

    public final Object getOrQuery(BillingClient billingClient, final List<String> list, String str, Continuation<? super List<ProductDetails>> continuation) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> list2 = list;
        for (String str2 : CollectionsKt.distinct(list2)) {
            ProductDetails productDetails = this.cache.get(str2);
            if (productDetails == null) {
                Boxing.boxBoolean(arrayList.add(str2));
            } else if (Intrinsics.areEqual(str, "inapp")) {
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    Boxing.boxBoolean(arrayList2.add(productDetails));
                } else {
                    OpenIapLog.INSTANCE.w("Cached ProductDetails for '" + str2 + "' has incomplete data, will re-query", "ProductManager");
                    arrayList.add(str2);
                    this.cache.remove(str2);
                }
            } else {
                if (Intrinsics.areEqual(str, "subs")) {
                    List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                    if (subscriptionOfferDetails != null && !subscriptionOfferDetails.isEmpty()) {
                    }
                    OpenIapLog.INSTANCE.w("Cached ProductDetails for '" + str2 + "' has incomplete data, will re-query", "ProductManager");
                    arrayList.add(str2);
                    this.cache.remove(str2);
                }
                Boxing.boxBoolean(arrayList2.add(productDetails));
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(str).build());
            }
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList4).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: dev.hyo.openiap.helpers.ProductManager$getOrQuery$3$1
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult result) {
                    Map map;
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (billingResult.getResponseCode() != 0) {
                        CancellableContinuation<List<ProductDetails>> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m3984constructorimpl(ResultKt.createFailure(OpenIapError.QueryProduct.INSTANCE)));
                        return;
                    }
                    List<ProductDetails> productDetailsList = result.getProductDetailsList();
                    if (productDetailsList == null) {
                        productDetailsList = CollectionsKt.emptyList();
                    }
                    this.putAll(productDetailsList);
                    CancellableContinuation<List<ProductDetails>> cancellableContinuation2 = cancellableContinuationImpl2;
                    List<String> list3 = list;
                    ProductManager productManager = this;
                    ArrayList arrayList5 = new ArrayList();
                    for (String str3 : list3) {
                        map = productManager.cache;
                        ProductDetails productDetails2 = (ProductDetails) map.get(str3);
                        if (productDetails2 != null) {
                            arrayList5.add(productDetails2);
                        }
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m3984constructorimpl(arrayList5));
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            ProductDetails productDetails2 = this.cache.get((String) it2.next());
            if (productDetails2 != null) {
                arrayList5.add(productDetails2);
            }
        }
        return arrayList5;
    }
}
