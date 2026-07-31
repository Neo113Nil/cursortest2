package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f611a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ List c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f611a = kVar;
        this.b = billingResult;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007f A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String originalJson;
        String str;
        String originalJson2;
        k kVar = this.f611a;
        BillingResult billingResult = this.b;
        List<Purchase> list = this.c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator<String> it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator<String> it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put(it2.next(), purchaseHistoryRecord);
                }
            }
            List<ProductDetails> list3 = kVar.d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = Intrinsics.areEqual(productType2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? "{}" : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(Intrinsics.areEqual(productType4, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? "{}" : originalJson);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
            }
            kVar.f612a.getBillingInfoSender().sendInfo(arrayList);
            kVar.b.invoke();
            kVar.f.onUpdateFinished();
        }
        k kVar2 = this.f611a;
        kVar2.e.a(kVar2);
    }
}
