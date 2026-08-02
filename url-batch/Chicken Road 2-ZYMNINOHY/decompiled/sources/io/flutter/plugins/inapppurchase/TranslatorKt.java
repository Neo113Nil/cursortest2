package io.flutter.plugins.inapppurchase;

import E1.B;
import E1.C0025a;
import E1.C0026b;
import E1.C0031g;
import E1.C0037m;
import E1.C0038n;
import E1.C0039o;
import E1.C0040p;
import E1.C0041q;
import E1.C0042s;
import E1.C0043t;
import E1.C0045v;
import E1.C0049z;
import E1.D;
import E1.E;
import E1.r;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import d3.k;
import d3.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TranslatorKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PlatformProductType.values().length];
            try {
                iArr[PlatformProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlatformBillingClientFeature.values().length];
            try {
                iArr2[PlatformBillingClientFeature.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlatformBillingClientFeature.BILLING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlatformBillingClientFeature.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlatformBillingClientFeature.IN_APP_MESSAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlatformBillingClientFeature.PRICE_CHANGE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PlatformBillingClientFeature.PRODUCT_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PlatformBillingClientFeature.SUBSCRIPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PlatformBillingClientFeature.SUBSCRIPTIONS_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlatformReplacementMode.values().length];
            try {
                iArr3[PlatformReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PlatformReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PlatformReplacementMode.DEFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PlatformReplacementMode.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PlatformReplacementMode.WITH_TIME_PRORATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final PlatformAlternativeBillingOnlyReportingDetailsResponse fromAlternativeBillingOnlyReportingDetails(C0037m result, C0026b c0026b) {
        String str;
        i.e(result, "result");
        PlatformBillingResult fromBillingResult = fromBillingResult(result);
        if (c0026b == null || (str = c0026b.f572a) == null) {
            str = "";
        }
        return new PlatformAlternativeBillingOnlyReportingDetailsResponse(fromBillingResult, str);
    }

    public static final PlatformBillingConfigResponse fromBillingConfig(C0037m result, C0031g c0031g) {
        String str;
        i.e(result, "result");
        PlatformBillingResult fromBillingResult = fromBillingResult(result);
        if (c0031g == null || (str = c0031g.f616a) == null) {
            str = "";
        }
        return new PlatformBillingConfigResponse(fromBillingResult, str);
    }

    public static final PlatformBillingResponse fromBillingResponseCode(int i4) {
        if (i4 == 12) {
            return PlatformBillingResponse.NETWORK_ERROR;
        }
        switch (i4) {
            case -2:
                return PlatformBillingResponse.FEATURE_NOT_SUPPORTED;
            case -1:
                return PlatformBillingResponse.SERVICE_DISCONNECTED;
            case 0:
                return PlatformBillingResponse.OK;
            case 1:
                return PlatformBillingResponse.USER_CANCELED;
            case 2:
                return PlatformBillingResponse.SERVICE_UNAVAILABLE;
            case 3:
                return PlatformBillingResponse.BILLING_UNAVAILABLE;
            case 4:
                return PlatformBillingResponse.ITEM_UNAVAILABLE;
            case 5:
                return PlatformBillingResponse.DEVELOPER_ERROR;
            case 6:
                return PlatformBillingResponse.ERROR;
            case 7:
                return PlatformBillingResponse.ITEM_ALREADY_OWNED;
            case 8:
                return PlatformBillingResponse.ITEM_NOT_OWNED;
            default:
                return PlatformBillingResponse.ERROR;
        }
    }

    public static final PlatformBillingResult fromBillingResult(C0037m billingResult) {
        i.e(billingResult, "billingResult");
        PlatformBillingResponse fromBillingResponseCode = fromBillingResponseCode(billingResult.f633a);
        String str = billingResult.f635c;
        i.d(str, "getDebugMessage(...)");
        return new PlatformBillingResult(fromBillingResponseCode, str, billingResult.f634b);
    }

    public static final PlatformInstallmentPlanDetails fromInstallmentPlanDetails(C0039o c0039o) {
        if (c0039o == null) {
            return null;
        }
        return new PlatformInstallmentPlanDetails(c0039o.f637a, c0039o.f638b);
    }

    public static final PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails(C0040p c0040p) {
        if (c0040p == null) {
            return null;
        }
        long j4 = c0040p.f640b;
        String str = c0040p.f639a;
        i.d(str, "getFormattedPrice(...)");
        String str2 = c0040p.f641c;
        i.d(str2, "getPriceCurrencyCode(...)");
        return new PlatformOneTimePurchaseOfferDetails(j4, str, str2);
    }

    public static final List<PlatformOneTimePurchaseOfferDetails> fromOneTimePurchaseOfferDetailsList(List<C0040p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails = fromOneTimePurchaseOfferDetails((C0040p) it.next());
            if (fromOneTimePurchaseOfferDetails != null) {
                arrayList.add(fromOneTimePurchaseOfferDetails);
            }
        }
        return arrayList;
    }

    public static final PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate(C0045v c0045v) {
        JSONArray optJSONArray;
        if (c0045v == null) {
            return null;
        }
        JSONObject jSONObject = c0045v.f670a;
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("productIds") && (optJSONArray = jSONObject.optJSONArray("productIds")) != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList.add(optJSONArray.optString(i4));
            }
        }
        String optString = jSONObject.optString("purchaseToken");
        i.d(optString, "getPurchaseToken(...)");
        return new PlatformPendingPurchaseUpdate(arrayList, optString);
    }

    public static final PlatformPricingPhase fromPricingPhase(C0041q pricingPhase) {
        i.e(pricingPhase, "pricingPhase");
        long j4 = pricingPhase.f650e;
        PlatformRecurrenceMode platformRecurrenceMode = toPlatformRecurrenceMode(pricingPhase.f651f);
        long j5 = pricingPhase.f647b;
        String str = pricingPhase.f649d;
        i.d(str, "getBillingPeriod(...)");
        String str2 = pricingPhase.f646a;
        i.d(str2, "getFormattedPrice(...)");
        String str3 = pricingPhase.f648c;
        i.d(str3, "getPriceCurrencyCode(...)");
        return new PlatformPricingPhase(j4, platformRecurrenceMode, j5, str, str2, str3);
    }

    public static final List<PlatformPricingPhase> fromPricingPhases(r pricingPhases) {
        i.e(pricingPhases, "pricingPhases");
        ArrayList arrayList = pricingPhases.f652a;
        i.d(arrayList, "getPricingPhaseList(...)");
        ArrayList arrayList2 = new ArrayList(k.Y(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0041q c0041q = (C0041q) obj;
            i.b(c0041q);
            arrayList2.add(fromPricingPhase(c0041q));
        }
        return arrayList2;
    }

    public static final PlatformProductDetails fromProductDetail(C0043t detail) {
        i.e(detail, "detail");
        String str = detail.f665g;
        i.d(str, "getDescription(...)");
        String str2 = detail.f664f;
        i.d(str2, "getName(...)");
        String str3 = detail.f661c;
        i.d(str3, "getProductId(...)");
        String str4 = detail.f662d;
        i.d(str4, "getProductType(...)");
        PlatformProductType platformProductType = toPlatformProductType(str4);
        String str5 = detail.f663e;
        i.d(str5, "getTitle(...)");
        return new PlatformProductDetails(str, str2, str3, platformProductType, str5, fromOneTimePurchaseOfferDetails(detail.a()), fromOneTimePurchaseOfferDetailsList(detail.f669k), fromSubscriptionOfferDetailsList(detail.f668j));
    }

    public static final List<PlatformProductDetails> fromProductDetailsList(List<C0043t> list) {
        if (list == null) {
            return q.f8333a;
        }
        ArrayList arrayList = new ArrayList(k.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromProductDetail((C0043t) it.next()));
        }
        return arrayList;
    }

    public static final PlatformPurchase fromPurchase(Purchase purchase) {
        i.e(purchase, "purchase");
        JSONObject jSONObject = purchase.f5747c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        C0025a c0025a = (optString == null && optString2 == null) ? null : new C0025a(optString, optString2, 0);
        PlatformAccountIdentifiers platformAccountIdentifiers = c0025a != null ? new PlatformAccountIdentifiers(c0025a.f563b, c0025a.f564c) : null;
        JSONObject optJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
        C0045v c0045v = optJSONObject == null ? null : new C0045v(optJSONObject);
        PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate = c0045v != null ? fromPendingPurchaseUpdate(c0045v) : null;
        String optString3 = jSONObject.optString("orderId");
        String str = TextUtils.isEmpty(optString3) ? null : optString3;
        String optString4 = jSONObject.optString("packageName");
        i.d(optString4, "getPackageName(...)");
        long optLong = jSONObject.optLong("purchaseTime");
        String b4 = purchase.b();
        i.d(b4, "getPurchaseToken(...)");
        String str2 = purchase.f5746b;
        i.d(str2, "getSignature(...)");
        ArrayList a3 = purchase.a();
        boolean optBoolean = jSONObject.optBoolean("autoRenewing");
        String str3 = purchase.f5745a;
        i.d(str3, "getOriginalJson(...)");
        String optString5 = jSONObject.optString("developerPayload");
        i.d(optString5, "getDeveloperPayload(...)");
        return new PlatformPurchase(str, optString4, optLong, b4, str2, a3, optBoolean, str3, optString5, jSONObject.optBoolean("acknowledged", true), jSONObject.optInt("quantity", 1), toPlatformPurchaseState(jSONObject.optInt("purchaseState", 1) == 4 ? 2 : 1), platformAccountIdentifiers, fromPendingPurchaseUpdate);
    }

    public static final PlatformPurchaseHistoryRecord fromPurchaseHistoryRecord(PurchaseHistoryRecord purchaseHistoryRecord) {
        i.e(purchaseHistoryRecord, "purchaseHistoryRecord");
        throw null;
    }

    public static final List<PlatformPurchaseHistoryRecord> fromPurchaseHistoryRecordList(List<? extends PurchaseHistoryRecord> list) {
        if (list == null) {
            return q.f8333a;
        }
        ArrayList arrayList = new ArrayList(k.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            arrayList.add(fromPurchaseHistoryRecord(null));
        }
        return arrayList;
    }

    public static final List<PlatformPurchase> fromPurchasesList(List<? extends Purchase> list) {
        if (list == null) {
            return q.f8333a;
        }
        ArrayList arrayList = new ArrayList(k.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPurchase((Purchase) it.next()));
        }
        return arrayList;
    }

    public static final PlatformSubscriptionOfferDetails fromSubscriptionOfferDetails(C0042s subscriptionOfferDetails) {
        i.e(subscriptionOfferDetails, "subscriptionOfferDetails");
        String str = subscriptionOfferDetails.f653a;
        i.d(str, "getBasePlanId(...)");
        String str2 = subscriptionOfferDetails.f654b;
        String str3 = subscriptionOfferDetails.f655c;
        i.d(str3, "getOfferToken(...)");
        ArrayList arrayList = subscriptionOfferDetails.f657e;
        i.d(arrayList, "getOfferTags(...)");
        r rVar = subscriptionOfferDetails.f656d;
        i.d(rVar, "getPricingPhases(...)");
        return new PlatformSubscriptionOfferDetails(str, str2, str3, arrayList, fromPricingPhases(rVar), fromInstallmentPlanDetails(subscriptionOfferDetails.f658f));
    }

    public static final List<PlatformSubscriptionOfferDetails> fromSubscriptionOfferDetailsList(List<C0042s> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(k.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromSubscriptionOfferDetails((C0042s) it.next()));
        }
        return arrayList;
    }

    public static final PlatformUnfetchedProduct fromUnfetchedProduct(B unfetchedProduct) {
        i.e(unfetchedProduct, "unfetchedProduct");
        String str = unfetchedProduct.f481b;
        i.d(str, "getProductId(...)");
        return new PlatformUnfetchedProduct(str);
    }

    public static final List<PlatformUnfetchedProduct> fromUnfetchedProductList(List<B> list) {
        if (list == null) {
            return q.f8333a;
        }
        ArrayList arrayList = new ArrayList(k.Y(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fromUnfetchedProduct((B) it.next()));
        }
        return arrayList;
    }

    public static final PlatformUserChoiceDetails fromUserChoiceDetails(E userChoiceDetails) {
        i.e(userChoiceDetails, "userChoiceDetails");
        JSONObject jSONObject = userChoiceDetails.f487a;
        String optString = jSONObject.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            optString = null;
        }
        String optString2 = jSONObject.optString("externalTransactionToken");
        i.d(optString2, "getExternalTransactionToken(...)");
        ArrayList arrayList = userChoiceDetails.f488b;
        i.d(arrayList, "getProducts(...)");
        return new PlatformUserChoiceDetails(optString, optString2, fromUserChoiceProductsList(arrayList));
    }

    public static final PlatformUserChoiceProduct fromUserChoiceProduct(D product) {
        i.e(product, "product");
        String str = product.f484a;
        i.d(str, "getId(...)");
        String str2 = product.f486c;
        String str3 = product.f485b;
        i.d(str3, "getType(...)");
        return new PlatformUserChoiceProduct(str, str2, toPlatformProductType(str3));
    }

    public static final List<PlatformUserChoiceProduct> fromUserChoiceProductsList(List<? extends D> productsList) {
        i.e(productsList, "productsList");
        ArrayList arrayList = new ArrayList(k.Y(productsList));
        Iterator<T> it = productsList.iterator();
        while (it.hasNext()) {
            arrayList.add(fromUserChoiceProduct((D) it.next()));
        }
        return arrayList;
    }

    public static final String toBillingClientFeature(PlatformBillingClientFeature feature) {
        i.e(feature, "feature");
        switch (WhenMappings.$EnumSwitchMapping$1[feature.ordinal()]) {
            case 1:
                return "jjj";
            case 2:
                return "ggg";
            case 3:
                return "kkk";
            case 4:
                return "bbb";
            case 5:
                return "priceChangeConfirmation";
            case 6:
                return "fff";
            case 7:
                return "subscriptions";
            case 8:
                return "subscriptionsUpdate";
            default:
                throw new G1.a();
        }
    }

    public static final C0038n toPendingPurchasesParams(PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        boolean z = false;
        if (platformPendingPurchasesParams != null && platformPendingPurchasesParams.getEnablePrepaidPlans()) {
            z = true;
        }
        return new C0038n(z);
    }

    public static final PlatformProductType toPlatformProductType(String typeString) {
        i.e(typeString, "typeString");
        return typeString.equals("inapp") ? PlatformProductType.INAPP : typeString.equals("subs") ? PlatformProductType.SUBS : PlatformProductType.INAPP;
    }

    public static final PlatformPurchaseState toPlatformPurchaseState(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? PlatformPurchaseState.UNSPECIFIED : PlatformPurchaseState.PENDING : PlatformPurchaseState.PURCHASED : PlatformPurchaseState.UNSPECIFIED;
    }

    public static final PlatformRecurrenceMode toPlatformRecurrenceMode(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? PlatformRecurrenceMode.NON_RECURRING : PlatformRecurrenceMode.NON_RECURRING : PlatformRecurrenceMode.FINITE_RECURRING : PlatformRecurrenceMode.INFINITE_RECURRING;
    }

    public static final C0049z toProduct(PlatformQueryProduct platformProduct) {
        i.e(platformProduct, "platformProduct");
        C0025a c0025a = new C0025a();
        c0025a.f563b = platformProduct.getProductId();
        c0025a.f564c = toProductTypeString(platformProduct.getProductType());
        return c0025a.a();
    }

    public static final List<C0049z> toProductList(List<PlatformQueryProduct> platformProducts) {
        i.e(platformProducts, "platformProducts");
        ArrayList arrayList = new ArrayList(k.Y(platformProducts));
        Iterator<T> it = platformProducts.iterator();
        while (it.hasNext()) {
            arrayList.add(toProduct((PlatformQueryProduct) it.next()));
        }
        return arrayList;
    }

    public static final String toProductTypeString(PlatformProductType type) {
        i.e(type, "type");
        int i4 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i4 == 1) {
            return "inapp";
        }
        if (i4 == 2) {
            return "subs";
        }
        throw new G1.a();
    }

    public static final int toReplacementMode(PlatformReplacementMode replacementMode) {
        i.e(replacementMode, "replacementMode");
        switch (WhenMappings.$EnumSwitchMapping$2[replacementMode.ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 3;
            case 5:
                return 1;
            case 6:
                return 0;
            default:
                throw new G1.a();
        }
    }
}
