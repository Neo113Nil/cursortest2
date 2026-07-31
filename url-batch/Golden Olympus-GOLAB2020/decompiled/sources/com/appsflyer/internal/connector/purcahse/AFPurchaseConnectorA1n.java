package com.appsflyer.internal.connector.purcahse;

import android.graphics.ImageFormat;
import android.os.Process;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.Store;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.appsflyer.api.models.PricingPhases;
import com.appsflyer.api.models.SubscriptionOfferDetails;
import com.appsflyer.exceptions.WrongProductTypeException;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1r;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.g;

@Metadata
/* loaded from: classes.dex */
public final class AFPurchaseConnectorA1n implements ProductDetailsResponseListener {
    private final AFPurchaseConnectorA1r.AFPurchaseConnectorA1x InAppPurchaseEvent;
    private final boolean getOneTimePurchaseOfferDetails;
    private final List<Purchase> getQuantity;
    private final String toJsonMap;

    @Metadata
    /* renamed from: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1n$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<ProductDetails, CharSequence> {
        public static final AnonymousClass2 getOneTimePurchaseOfferDetails = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: InAppPurchaseEvent, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(ProductDetails productDetails) {
            Intrinsics.checkNotNullParameter(productDetails, "");
            String productId = productDetails.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "");
            return productId;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFPurchaseConnectorA1n(String str, AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x, List<? extends Purchase> list, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFPurchaseConnectorA1x, "");
        this.toJsonMap = str;
        this.InAppPurchaseEvent = aFPurchaseConnectorA1x;
        this.getQuantity = list;
        this.getOneTimePurchaseOfferDetails = z4;
    }

    private final Map<String, ProductDetails> InAppPurchaseEvent(List<ProductDetails> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ProductDetails productDetails : list) {
            if (Intrinsics.areEqual(productDetails.getProductType(), this.toJsonMap)) {
                String productId = productDetails.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId, "");
                linkedHashMap.put(productId, productDetails);
            } else {
                String str = "[PurchaseConnector]: expected Product type of " + this.toJsonMap + ", but received " + productDetails.getProductType();
                AFLogger.afErrorLog(str, new WrongProductTypeException(str));
            }
        }
        return linkedHashMap;
    }

    private final Map<Purchase, Map<String, ProductDetails>> getOneTimePurchaseOfferDetails(List<ProductDetails> list) {
        List<String> products;
        Map<String, ProductDetails> InAppPurchaseEvent = InAppPurchaseEvent(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Purchase> list2 = this.getQuantity;
        if (list2 != null) {
            for (Purchase purchase : list2) {
                if (purchase != null && (products = purchase.getProducts()) != null) {
                    Intrinsics.checkNotNullExpressionValue(products, "");
                    for (String str : products) {
                        if (InAppPurchaseEvent.containsKey(str)) {
                            if (linkedHashMap.containsKey(purchase)) {
                                Object obj = linkedHashMap.get(purchase);
                                Intrinsics.checkNotNull(obj);
                                Intrinsics.checkNotNullExpressionValue(str, "");
                                ProductDetails productDetails = InAppPurchaseEvent.get(str);
                                Intrinsics.checkNotNull(productDetails);
                                ((Map) obj).put(str, productDetails);
                            } else {
                                ProductDetails productDetails2 = InAppPurchaseEvent.get(str);
                                Intrinsics.checkNotNull(productDetails2);
                                linkedHashMap.put(purchase, MapsKt.mutableMapOf(TuplesKt.to(str, productDetails2)));
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final SubscriptionOfferDetails getPackageName(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        String basePlanId = subscriptionOfferDetails.getBasePlanId();
        Intrinsics.checkNotNullExpressionValue(basePlanId, "");
        String offerId = subscriptionOfferDetails.getOfferId();
        List<String> offerTags = subscriptionOfferDetails.getOfferTags();
        Intrinsics.checkNotNullExpressionValue(offerTags, "");
        String offerToken = subscriptionOfferDetails.getOfferToken();
        Intrinsics.checkNotNullExpressionValue(offerToken, "");
        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "");
        List<ProductDetails.PricingPhase> list = pricingPhaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDetails.PricingPhase pricingPhase : list) {
            Intrinsics.checkNotNullExpressionValue(pricingPhase, "");
            arrayList.add(toJsonMap(pricingPhase));
        }
        return new SubscriptionOfferDetails(basePlanId, offerId, offerTags, offerToken, arrayList);
    }

    private final OneTimePurchaseOfferDetails toJsonMap(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "");
        long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "");
        return new OneTimePurchaseOfferDetails(formattedPrice, priceAmountMicros, priceCurrencyCode);
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
                AFLogger.afDebugLog("[PurchaseConnector]: Received the following Product details:\n\ttype: " + this.toJsonMap + "\n\tProduct Ids: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, AnonymousClass2.getOneTimePurchaseOfferDetails, 30, null));
                Map<Purchase, Map<String, ProductDetails>> oneTimePurchaseOfferDetails = getOneTimePurchaseOfferDetails(list);
                if (oneTimePurchaseOfferDetails.isEmpty()) {
                    return;
                }
                if (!Intrinsics.areEqual("subs", this.toJsonMap)) {
                    this.InAppPurchaseEvent.toJsonMap(InAppPurchaseEvent(oneTimePurchaseOfferDetails));
                    return;
                }
                List<SubscriptionPurchaseEvent> jsonMap = toJsonMap(oneTimePurchaseOfferDetails);
                if (this.getOneTimePurchaseOfferDetails) {
                    this.InAppPurchaseEvent.getOneTimePurchaseOfferDetails(jsonMap);
                } else {
                    this.InAppPurchaseEvent.getQuantity(jsonMap);
                }
            }
        } catch (Throwable th) {
            try {
                Object[] objArr = {th};
                Map map = AFPurchaseConnectorA1w.PurchaseClientCompanion;
                Object obj = map.get(-1174844903);
                if (obj == null) {
                    obj = ((Class) AFPurchaseConnectorA1w.getQuantity(70 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) + 70, (char) (ImageFormat.getBitsPerPixel(0) + 1))).getMethod("getQuantity", Throwable.class);
                    map.put(-1174844903, obj);
                }
                ((Method) obj).invoke(null, objArr);
                Object[] objArr2 = {th};
                Object obj2 = map.get(595644357);
                if (obj2 == null) {
                    obj2 = ((Class) AFPurchaseConnectorA1w.getQuantity((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 69, 69 - MotionEvent.axisFromString(""), (char) ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("getPackageName", Throwable.class);
                    map.put(595644357, obj2);
                }
                ((Method) obj2).invoke(null, objArr2);
                AFLogger.afErrorLog("[PurchaseConnector]: Failed to log new purchase", th, true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public /* synthetic */ AFPurchaseConnectorA1n(String str, AFPurchaseConnectorA1r.AFPurchaseConnectorA1x aFPurchaseConnectorA1x, List list, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aFPurchaseConnectorA1x, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? false : z4);
    }

    private final PricingPhases toJsonMap(ProductDetails.PricingPhase pricingPhase) {
        int billingCycleCount = pricingPhase.getBillingCycleCount();
        String billingPeriod = pricingPhase.getBillingPeriod();
        Intrinsics.checkNotNullExpressionValue(billingPeriod, "");
        String formattedPrice = pricingPhase.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "");
        long priceAmountMicros = pricingPhase.getPriceAmountMicros();
        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "");
        return new PricingPhases(billingCycleCount, billingPeriod, formattedPrice, priceAmountMicros, priceCurrencyCode, pricingPhase.getRecurrenceMode());
    }

    private final List<InAppPurchaseEvent> InAppPurchaseEvent(Map<Purchase, ? extends Map<String, ProductDetails>> map) {
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Purchase, ? extends Map<String, ProductDetails>> entry : map.entrySet()) {
            Purchase key = entry.getKey();
            key.getPurchaseTime();
            Set<Map.Entry<String, ProductDetails>> entrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = ((ProductDetails) entry2.getValue()).getOneTimePurchaseOfferDetails();
                if (oneTimePurchaseOfferDetails2 != null) {
                    Intrinsics.checkNotNullExpressionValue(oneTimePurchaseOfferDetails2, "");
                    oneTimePurchaseOfferDetails = toJsonMap(oneTimePurchaseOfferDetails2);
                } else {
                    oneTimePurchaseOfferDetails = null;
                }
                Pair pair = TuplesKt.to(key2, oneTimePurchaseOfferDetails);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> products = key.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "");
            String purchaseToken = key.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "");
            Store store = Store.GOOGLE;
            long purchaseTime = key.getPurchaseTime();
            String packageName = key.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            arrayList.add(new InAppPurchaseEvent(products, purchaseToken, store, purchaseTime, packageName, key.getQuantity(), linkedHashMap));
        }
        return arrayList;
    }

    private final List<SubscriptionPurchaseEvent> toJsonMap(Map<Purchase, ? extends Map<String, ProductDetails>> map) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry<Purchase, ? extends Map<String, ProductDetails>> entry : map.entrySet()) {
            Purchase key = entry.getKey();
            Set<Map.Entry<String, ProductDetails>> entrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entrySet, 10)), 16));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = ((ProductDetails) entry2.getValue()).getSubscriptionOfferDetails();
                if (subscriptionOfferDetails != null) {
                    Intrinsics.checkNotNullExpressionValue(subscriptionOfferDetails, "");
                    List<ProductDetails.SubscriptionOfferDetails> list = subscriptionOfferDetails;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : list) {
                        Intrinsics.checkNotNullExpressionValue(subscriptionOfferDetails2, "");
                        arrayList.add(getPackageName(subscriptionOfferDetails2));
                    }
                } else {
                    arrayList = null;
                }
                Pair pair = TuplesKt.to(key2, arrayList);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> products = key.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "");
            String purchaseToken = key.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "");
            arrayList2.add(new SubscriptionPurchaseEvent(products, purchaseToken, Store.GOOGLE, key.getPurchaseTime(), linkedHashMap));
        }
        return arrayList2;
    }
}
