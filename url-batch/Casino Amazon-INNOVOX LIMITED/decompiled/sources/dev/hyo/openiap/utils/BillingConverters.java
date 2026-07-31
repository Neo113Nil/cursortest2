package dev.hyo.openiap.utils;

import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import dev.hyo.openiap.DiscountAmountAndroid;
import dev.hyo.openiap.DiscountDisplayInfoAndroid;
import dev.hyo.openiap.DiscountOffer;
import dev.hyo.openiap.DiscountOfferType;
import dev.hyo.openiap.IapPlatform;
import dev.hyo.openiap.IapStore;
import dev.hyo.openiap.InstallmentPlanDetailsAndroid;
import dev.hyo.openiap.LimitedQuantityInfoAndroid;
import dev.hyo.openiap.PaymentMode;
import dev.hyo.openiap.PendingPurchaseUpdateAndroid;
import dev.hyo.openiap.PreorderDetailsAndroid;
import dev.hyo.openiap.PricingPhaseAndroid;
import dev.hyo.openiap.PricingPhasesAndroid;
import dev.hyo.openiap.ProductAndroid;
import dev.hyo.openiap.ProductAndroidOneTimePurchaseOfferDetail;
import dev.hyo.openiap.ProductStatusAndroid;
import dev.hyo.openiap.ProductSubscriptionAndroid;
import dev.hyo.openiap.ProductSubscriptionAndroidOfferDetails;
import dev.hyo.openiap.ProductType;
import dev.hyo.openiap.PurchaseAndroid;
import dev.hyo.openiap.PurchaseState;
import dev.hyo.openiap.RentalDetailsAndroid;
import dev.hyo.openiap.SubscriptionOffer;
import dev.hyo.openiap.SubscriptionPeriod;
import dev.hyo.openiap.SubscriptionPeriodUnit;
import dev.hyo.openiap.ValidTimeWindowAndroid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: BillingConverters.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0002J\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002J\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u0014H\u0002J\n\u0010\u001d\u001a\u00020\u001e*\u00020\u0006J\n\u0010\u001f\u001a\u00020 *\u00020\u0006J\u001e\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f¨\u0006&"}, d2 = {"Ldev/hyo/openiap/utils/BillingConverters;", "", "<init>", "()V", "getProductStatus", "Ldev/hyo/openiap/ProductStatusAndroid;", "Lcom/android/billingclient/api/ProductDetails;", "toOfferDetail", "Ldev/hyo/openiap/ProductAndroidOneTimePurchaseOfferDetail;", "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "toDiscountOffer", "Ldev/hyo/openiap/DiscountOffer;", "parseBillingPeriod", "Ldev/hyo/openiap/SubscriptionPeriod;", "billingPeriod", "", "findBasePricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "offers", "", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "determinePaymentMode", "Ldev/hyo/openiap/PaymentMode;", "recurrenceMode", "", "priceAmountMicros", "", "toSubscriptionOffer", "Ldev/hyo/openiap/SubscriptionOffer;", "toInAppProduct", "Ldev/hyo/openiap/ProductAndroid;", "toSubscriptionProduct", "Ldev/hyo/openiap/ProductSubscriptionAndroid;", "toPurchase", "Ldev/hyo/openiap/PurchaseAndroid;", "Lcom/android/billingclient/api/Purchase;", "productType", "basePlanId", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingConverters {
    public static final int $stable = 0;
    public static final BillingConverters INSTANCE = new BillingConverters();

    private BillingConverters() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ProductStatusAndroid getProductStatus(ProductDetails productDetails) {
        Object m3984constructorimpl;
        Integer num;
        ProductStatusAndroid productStatusAndroid;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object invoke = productDetails.getClass().getMethod("getProductStatus", new Class[0]).invoke(productDetails, new Object[0]);
            num = invoke instanceof Integer ? (Integer) invoke : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (num != null && num.intValue() == 0) {
            productStatusAndroid = ProductStatusAndroid.Ok;
            m3984constructorimpl = Result.m3984constructorimpl(productStatusAndroid);
            return (ProductStatusAndroid) (Result.m3990isFailureimpl(m3984constructorimpl) ? null : m3984constructorimpl);
        }
        if (num.intValue() == 1) {
            productStatusAndroid = ProductStatusAndroid.NotFound;
            m3984constructorimpl = Result.m3984constructorimpl(productStatusAndroid);
            return (ProductStatusAndroid) (Result.m3990isFailureimpl(m3984constructorimpl) ? null : m3984constructorimpl);
        }
        if (num != null && num.intValue() == 2) {
            productStatusAndroid = ProductStatusAndroid.NoOffersAvailable;
            m3984constructorimpl = Result.m3984constructorimpl(productStatusAndroid);
            return (ProductStatusAndroid) (Result.m3990isFailureimpl(m3984constructorimpl) ? null : m3984constructorimpl);
        }
        productStatusAndroid = ProductStatusAndroid.Unknown;
        m3984constructorimpl = Result.m3984constructorimpl(productStatusAndroid);
        return (ProductStatusAndroid) (Result.m3990isFailureimpl(m3984constructorimpl) ? null : m3984constructorimpl);
    }

    private final ProductAndroidOneTimePurchaseOfferDetail toOfferDetail(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        Object m3984constructorimpl;
        Object m3984constructorimpl2;
        DiscountDisplayInfoAndroid discountDisplayInfoAndroid;
        DiscountAmountAndroid discountAmountAndroid;
        Object m3984constructorimpl3;
        Object m3984constructorimpl4;
        RentalDetailsAndroid rentalDetailsAndroid;
        Object m3984constructorimpl5;
        Object m3984constructorimpl6;
        Object m3984constructorimpl7;
        Object m3984constructorimpl8;
        Object m3984constructorimpl9;
        ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo discountDisplayInfo = oneTimePurchaseOfferDetails.getDiscountDisplayInfo();
        if (discountDisplayInfo != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(discountDisplayInfo.getPercentageDiscount());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                m3984constructorimpl = null;
            }
            Integer num = (Integer) m3984constructorimpl;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount discountAmount = discountDisplayInfo.getDiscountAmount();
                if (discountAmount != null) {
                    String valueOf = String.valueOf(discountAmount.getDiscountAmountMicros());
                    String formattedDiscountAmount = discountAmount.getFormattedDiscountAmount();
                    Intrinsics.checkNotNullExpressionValue(formattedDiscountAmount, "getFormattedDiscountAmount(...)");
                    discountAmountAndroid = new DiscountAmountAndroid(valueOf, formattedDiscountAmount);
                } else {
                    discountAmountAndroid = null;
                }
                m3984constructorimpl2 = Result.m3984constructorimpl(discountAmountAndroid);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                m3984constructorimpl2 = null;
            }
            discountDisplayInfoAndroid = new DiscountDisplayInfoAndroid((DiscountAmountAndroid) m3984constructorimpl2, num);
        } else {
            discountDisplayInfoAndroid = null;
        }
        ProductDetails.OneTimePurchaseOfferDetails.ValidTimeWindow validTimeWindow = oneTimePurchaseOfferDetails.getValidTimeWindow();
        ValidTimeWindowAndroid validTimeWindowAndroid = validTimeWindow != null ? new ValidTimeWindowAndroid(String.valueOf(validTimeWindow.getEndTimeMillis()), String.valueOf(validTimeWindow.getStartTimeMillis())) : null;
        ProductDetails.OneTimePurchaseOfferDetails.LimitedQuantityInfo limitedQuantityInfo = oneTimePurchaseOfferDetails.getLimitedQuantityInfo();
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = limitedQuantityInfo != null ? new LimitedQuantityInfoAndroid(limitedQuantityInfo.getMaximumQuantity(), limitedQuantityInfo.getRemainingQuantity()) : null;
        try {
            Result.Companion companion5 = Result.INSTANCE;
            m3984constructorimpl3 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getPreorderDetails());
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m3984constructorimpl3 = Result.m3984constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl3)) {
            m3984constructorimpl3 = null;
        }
        ProductDetails.OneTimePurchaseOfferDetails.PreorderDetails preorderDetails = (ProductDetails.OneTimePurchaseOfferDetails.PreorderDetails) m3984constructorimpl3;
        PreorderDetailsAndroid preorderDetailsAndroid = preorderDetails != null ? new PreorderDetailsAndroid(String.valueOf(preorderDetails.getPreorderPresaleEndTimeMillis()), String.valueOf(preorderDetails.getPreorderReleaseTimeMillis())) : null;
        try {
            Result.Companion companion7 = Result.INSTANCE;
            m3984constructorimpl4 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getRentalDetails());
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.INSTANCE;
            m3984constructorimpl4 = Result.m3984constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl4)) {
            m3984constructorimpl4 = null;
        }
        ProductDetails.OneTimePurchaseOfferDetails.RentalDetails rentalDetails = (ProductDetails.OneTimePurchaseOfferDetails.RentalDetails) m3984constructorimpl4;
        if (rentalDetails != null) {
            String rentalPeriod = rentalDetails.getRentalPeriod();
            Intrinsics.checkNotNullExpressionValue(rentalPeriod, "getRentalPeriod(...)");
            try {
                Result.Companion companion9 = Result.INSTANCE;
                m3984constructorimpl9 = Result.m3984constructorimpl(rentalDetails.getRentalExpirationPeriod());
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m3984constructorimpl9 = Result.m3984constructorimpl(ResultKt.createFailure(th5));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl9)) {
                m3984constructorimpl9 = null;
            }
            rentalDetailsAndroid = new RentalDetailsAndroid((String) m3984constructorimpl9, rentalPeriod);
        } else {
            rentalDetailsAndroid = null;
        }
        try {
            Result.Companion companion11 = Result.INSTANCE;
            m3984constructorimpl5 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getPurchaseOptionId());
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.INSTANCE;
            m3984constructorimpl5 = Result.m3984constructorimpl(ResultKt.createFailure(th6));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl5)) {
            m3984constructorimpl5 = null;
        }
        String str = (String) m3984constructorimpl5;
        try {
            Result.Companion companion13 = Result.INSTANCE;
            m3984constructorimpl6 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getOfferId());
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.INSTANCE;
            m3984constructorimpl6 = Result.m3984constructorimpl(ResultKt.createFailure(th7));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl6)) {
            m3984constructorimpl6 = null;
        }
        String str2 = (String) m3984constructorimpl6;
        String offerToken = oneTimePurchaseOfferDetails.getOfferToken();
        if (offerToken == null) {
            offerToken = "";
        }
        String str3 = offerToken;
        try {
            Result.Companion companion15 = Result.INSTANCE;
            List<String> offerTags = oneTimePurchaseOfferDetails.getOfferTags();
            if (offerTags == null) {
                offerTags = CollectionsKt.emptyList();
            }
            m3984constructorimpl7 = Result.m3984constructorimpl(offerTags);
        } catch (Throwable th8) {
            Result.Companion companion16 = Result.INSTANCE;
            m3984constructorimpl7 = Result.m3984constructorimpl(ResultKt.createFailure(th8));
        }
        if (Result.m3987exceptionOrNullimpl(m3984constructorimpl7) != null) {
            m3984constructorimpl7 = CollectionsKt.emptyList();
        }
        List list = (List) m3984constructorimpl7;
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        String valueOf2 = String.valueOf(oneTimePurchaseOfferDetails.getPriceAmountMicros());
        try {
            Result.Companion companion17 = Result.INSTANCE;
            Long fullPriceMicros = oneTimePurchaseOfferDetails.getFullPriceMicros();
            m3984constructorimpl8 = Result.m3984constructorimpl(fullPriceMicros != null ? fullPriceMicros.toString() : null);
        } catch (Throwable th9) {
            Result.Companion companion18 = Result.INSTANCE;
            m3984constructorimpl8 = Result.m3984constructorimpl(ResultKt.createFailure(th9));
        }
        return new ProductAndroidOneTimePurchaseOfferDetail(discountDisplayInfoAndroid, formattedPrice, (String) (Result.m3990isFailureimpl(m3984constructorimpl8) ? null : m3984constructorimpl8), limitedQuantityInfoAndroid, str2, list, str3, preorderDetailsAndroid, valueOf2, priceCurrencyCode, str, rentalDetailsAndroid, validTimeWindowAndroid);
    }

    private final DiscountOffer toDiscountOffer(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        Object m3984constructorimpl;
        Object m3984constructorimpl2;
        Object m3984constructorimpl3;
        Object m3984constructorimpl4;
        Object m3984constructorimpl5;
        Object m3984constructorimpl6;
        Object m3984constructorimpl7;
        Object m3984constructorimpl8;
        RentalDetailsAndroid rentalDetailsAndroid;
        Object m3984constructorimpl9;
        Object m3984constructorimpl10;
        ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount discountAmount;
        ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo.DiscountAmount discountAmount2;
        ProductDetails.OneTimePurchaseOfferDetails.DiscountDisplayInfo discountDisplayInfo = oneTimePurchaseOfferDetails.getDiscountDisplayInfo();
        try {
            Result.Companion companion = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getOfferId());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            m3984constructorimpl = null;
        }
        String str = (String) m3984constructorimpl;
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "getFormattedPrice(...)");
        double priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros() / 1000000.0d;
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "getPriceCurrencyCode(...)");
        DiscountOfferType discountOfferType = DiscountOfferType.OneTime;
        String offerToken = oneTimePurchaseOfferDetails.getOfferToken();
        try {
            Result.Companion companion3 = Result.INSTANCE;
            List<String> offerTags = oneTimePurchaseOfferDetails.getOfferTags();
            if (offerTags == null) {
                offerTags = CollectionsKt.emptyList();
            }
            m3984constructorimpl2 = Result.m3984constructorimpl(offerTags);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3987exceptionOrNullimpl(m3984constructorimpl2) != null) {
            m3984constructorimpl2 = CollectionsKt.emptyList();
        }
        List list = (List) m3984constructorimpl2;
        try {
            Result.Companion companion5 = Result.INSTANCE;
            Long fullPriceMicros = oneTimePurchaseOfferDetails.getFullPriceMicros();
            m3984constructorimpl3 = Result.m3984constructorimpl(fullPriceMicros != null ? fullPriceMicros.toString() : null);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m3984constructorimpl3 = Result.m3984constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl3)) {
            m3984constructorimpl3 = null;
        }
        String str2 = (String) m3984constructorimpl3;
        try {
            Result.Companion companion7 = Result.INSTANCE;
            m3984constructorimpl4 = Result.m3984constructorimpl(discountDisplayInfo != null ? discountDisplayInfo.getPercentageDiscount() : null);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.INSTANCE;
            m3984constructorimpl4 = Result.m3984constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl4)) {
            m3984constructorimpl4 = null;
        }
        Integer num = (Integer) m3984constructorimpl4;
        try {
            Result.Companion companion9 = Result.INSTANCE;
            m3984constructorimpl5 = Result.m3984constructorimpl((discountDisplayInfo == null || (discountAmount2 = discountDisplayInfo.getDiscountAmount()) == null) ? null : Long.valueOf(discountAmount2.getDiscountAmountMicros()).toString());
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.INSTANCE;
            m3984constructorimpl5 = Result.m3984constructorimpl(ResultKt.createFailure(th5));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl5)) {
            m3984constructorimpl5 = null;
        }
        String str3 = (String) m3984constructorimpl5;
        try {
            Result.Companion companion11 = Result.INSTANCE;
            m3984constructorimpl6 = Result.m3984constructorimpl((discountDisplayInfo == null || (discountAmount = discountDisplayInfo.getDiscountAmount()) == null) ? null : discountAmount.getFormattedDiscountAmount());
        } catch (Throwable th6) {
            Result.Companion companion12 = Result.INSTANCE;
            m3984constructorimpl6 = Result.m3984constructorimpl(ResultKt.createFailure(th6));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl6)) {
            m3984constructorimpl6 = null;
        }
        String str4 = (String) m3984constructorimpl6;
        ProductDetails.OneTimePurchaseOfferDetails.ValidTimeWindow validTimeWindow = oneTimePurchaseOfferDetails.getValidTimeWindow();
        ValidTimeWindowAndroid validTimeWindowAndroid = validTimeWindow != null ? new ValidTimeWindowAndroid(String.valueOf(validTimeWindow.getEndTimeMillis()), String.valueOf(validTimeWindow.getStartTimeMillis())) : null;
        ProductDetails.OneTimePurchaseOfferDetails.LimitedQuantityInfo limitedQuantityInfo = oneTimePurchaseOfferDetails.getLimitedQuantityInfo();
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = limitedQuantityInfo != null ? new LimitedQuantityInfoAndroid(limitedQuantityInfo.getMaximumQuantity(), limitedQuantityInfo.getRemainingQuantity()) : null;
        try {
            Result.Companion companion13 = Result.INSTANCE;
            m3984constructorimpl7 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getPreorderDetails());
        } catch (Throwable th7) {
            Result.Companion companion14 = Result.INSTANCE;
            m3984constructorimpl7 = Result.m3984constructorimpl(ResultKt.createFailure(th7));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl7)) {
            m3984constructorimpl7 = null;
        }
        ProductDetails.OneTimePurchaseOfferDetails.PreorderDetails preorderDetails = (ProductDetails.OneTimePurchaseOfferDetails.PreorderDetails) m3984constructorimpl7;
        PreorderDetailsAndroid preorderDetailsAndroid = preorderDetails != null ? new PreorderDetailsAndroid(String.valueOf(preorderDetails.getPreorderPresaleEndTimeMillis()), String.valueOf(preorderDetails.getPreorderReleaseTimeMillis())) : null;
        try {
            Result.Companion companion15 = Result.INSTANCE;
            m3984constructorimpl8 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getRentalDetails());
        } catch (Throwable th8) {
            Result.Companion companion16 = Result.INSTANCE;
            m3984constructorimpl8 = Result.m3984constructorimpl(ResultKt.createFailure(th8));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl8)) {
            m3984constructorimpl8 = null;
        }
        ProductDetails.OneTimePurchaseOfferDetails.RentalDetails rentalDetails = (ProductDetails.OneTimePurchaseOfferDetails.RentalDetails) m3984constructorimpl8;
        if (rentalDetails != null) {
            String rentalPeriod = rentalDetails.getRentalPeriod();
            Intrinsics.checkNotNullExpressionValue(rentalPeriod, "getRentalPeriod(...)");
            try {
                Result.Companion companion17 = Result.INSTANCE;
                m3984constructorimpl10 = Result.m3984constructorimpl(rentalDetails.getRentalExpirationPeriod());
            } catch (Throwable th9) {
                Result.Companion companion18 = Result.INSTANCE;
                m3984constructorimpl10 = Result.m3984constructorimpl(ResultKt.createFailure(th9));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl10)) {
                m3984constructorimpl10 = null;
            }
            rentalDetailsAndroid = new RentalDetailsAndroid((String) m3984constructorimpl10, rentalPeriod);
        } else {
            rentalDetailsAndroid = null;
        }
        try {
            Result.Companion companion19 = Result.INSTANCE;
            m3984constructorimpl9 = Result.m3984constructorimpl(oneTimePurchaseOfferDetails.getPurchaseOptionId());
        } catch (Throwable th10) {
            Result.Companion companion20 = Result.INSTANCE;
            m3984constructorimpl9 = Result.m3984constructorimpl(ResultKt.createFailure(th10));
        }
        return new DiscountOffer(priceCurrencyCode, str3, formattedPrice, str4, str2, str, limitedQuantityInfoAndroid, list, offerToken, num, preorderDetailsAndroid, priceAmountMicros, (String) (Result.m3990isFailureimpl(m3984constructorimpl9) ? null : m3984constructorimpl9), rentalDetailsAndroid, discountOfferType, validTimeWindowAndroid);
    }

    private final SubscriptionPeriod parseBillingPeriod(String billingPeriod) {
        MatchResult find$default;
        Integer intOrNull;
        SubscriptionPeriodUnit subscriptionPeriodUnit;
        String str = billingPeriod;
        if (str.length() == 0 || (find$default = Regex.find$default(new Regex("P(\\d+)([DWMY])"), str, 0, 2, null)) == null || (intOrNull = StringsKt.toIntOrNull(find$default.getGroupValues().get(1))) == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        String str2 = find$default.getGroupValues().get(2);
        int hashCode = str2.hashCode();
        if (hashCode == 68) {
            if (str2.equals("D")) {
                subscriptionPeriodUnit = SubscriptionPeriodUnit.Day;
            }
            subscriptionPeriodUnit = SubscriptionPeriodUnit.Unknown;
        } else if (hashCode == 77) {
            if (str2.equals("M")) {
                subscriptionPeriodUnit = SubscriptionPeriodUnit.Month;
            }
            subscriptionPeriodUnit = SubscriptionPeriodUnit.Unknown;
        } else if (hashCode != 87) {
            if (hashCode == 89 && str2.equals("Y")) {
                subscriptionPeriodUnit = SubscriptionPeriodUnit.Year;
            }
            subscriptionPeriodUnit = SubscriptionPeriodUnit.Unknown;
        } else {
            if (str2.equals("W")) {
                subscriptionPeriodUnit = SubscriptionPeriodUnit.Week;
            }
            subscriptionPeriodUnit = SubscriptionPeriodUnit.Unknown;
        }
        return new SubscriptionPeriod(subscriptionPeriodUnit, intValue);
    }

    private final ProductDetails.PricingPhase findBasePricingPhase(List<ProductDetails.SubscriptionOfferDetails> offers) {
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        ProductDetails.PricingPhase pricingPhase;
        Iterator<ProductDetails.SubscriptionOfferDetails> it = offers.iterator();
        do {
            Object obj = null;
            if (it.hasNext()) {
                List<ProductDetails.PricingPhase> pricingPhaseList2 = it.next().getPricingPhases().getPricingPhaseList();
                Intrinsics.checkNotNullExpressionValue(pricingPhaseList2, "getPricingPhaseList(...)");
                Iterator<T> it2 = pricingPhaseList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((ProductDetails.PricingPhase) next).getRecurrenceMode() == 1) {
                        obj = next;
                        break;
                    }
                }
                pricingPhase = (ProductDetails.PricingPhase) obj;
            } else {
                ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) offers);
                if (subscriptionOfferDetails == null || (pricingPhases = subscriptionOfferDetails.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) {
                    return null;
                }
                return (ProductDetails.PricingPhase) CollectionsKt.lastOrNull((List) pricingPhaseList);
            }
        } while (pricingPhase == null);
        return pricingPhase;
    }

    private final PaymentMode determinePaymentMode(int recurrenceMode, long priceAmountMicros) {
        if (priceAmountMicros == 0) {
            return PaymentMode.FreeTrial;
        }
        if (recurrenceMode == 3) {
            return PaymentMode.PayUpFront;
        }
        if (recurrenceMode == 2) {
            return PaymentMode.PayAsYouGo;
        }
        if (recurrenceMode == 1) {
            return PaymentMode.PayAsYouGo;
        }
        return PaymentMode.Unknown;
    }

    private final SubscriptionOffer toSubscriptionOffer(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        DiscountOfferType discountOfferType;
        Object m3984constructorimpl;
        String billingPeriod;
        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "getPricingPhaseList(...)");
        ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List) pricingPhaseList);
        String formattedPrice = pricingPhase != null ? pricingPhase.getFormattedPrice() : null;
        String str = formattedPrice == null ? "" : formattedPrice;
        String priceCurrencyCode = pricingPhase != null ? pricingPhase.getPriceCurrencyCode() : null;
        String str2 = priceCurrencyCode == null ? "" : priceCurrencyCode;
        double priceAmountMicros = pricingPhase != null ? pricingPhase.getPriceAmountMicros() / 1000000.0d : 0.0d;
        SubscriptionPeriod parseBillingPeriod = (pricingPhase == null || (billingPeriod = pricingPhase.getBillingPeriod()) == null) ? null : INSTANCE.parseBillingPeriod(billingPeriod);
        PaymentMode determinePaymentMode = pricingPhase != null ? INSTANCE.determinePaymentMode(pricingPhase.getRecurrenceMode(), pricingPhase.getPriceAmountMicros()) : null;
        if (subscriptionOfferDetails.getOfferId() == null && pricingPhase != null && pricingPhase.getPriceAmountMicros() == 0) {
            discountOfferType = DiscountOfferType.Introductory;
        } else {
            discountOfferType = subscriptionOfferDetails.getOfferId() != null ? DiscountOfferType.Promotional : DiscountOfferType.Introductory;
        }
        DiscountOfferType discountOfferType2 = discountOfferType;
        try {
            Result.Companion companion = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(subscriptionOfferDetails.getInstallmentPlanDetails());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            m3984constructorimpl = null;
        }
        ProductDetails.InstallmentPlanDetails installmentPlanDetails = (ProductDetails.InstallmentPlanDetails) m3984constructorimpl;
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = installmentPlanDetails != null ? new InstallmentPlanDetailsAndroid(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount(), installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount()) : null;
        String offerId = subscriptionOfferDetails.getOfferId();
        if (offerId == null) {
            offerId = subscriptionOfferDetails.getBasePlanId();
            Intrinsics.checkNotNullExpressionValue(offerId, "getBasePlanId(...)");
        }
        String str3 = offerId;
        Integer valueOf = pricingPhase != null ? Integer.valueOf(pricingPhase.getBillingCycleCount()) : null;
        String basePlanId = subscriptionOfferDetails.getBasePlanId();
        String offerToken = subscriptionOfferDetails.getOfferToken();
        List<String> offerTags = subscriptionOfferDetails.getOfferTags();
        List<ProductDetails.PricingPhase> pricingPhaseList2 = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList2, "getPricingPhaseList(...)");
        List<ProductDetails.PricingPhase> list = pricingPhaseList2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDetails.PricingPhase pricingPhase2 : list) {
            int billingCycleCount = pricingPhase2.getBillingCycleCount();
            String billingPeriod2 = pricingPhase2.getBillingPeriod();
            Intrinsics.checkNotNullExpressionValue(billingPeriod2, "getBillingPeriod(...)");
            String formattedPrice2 = pricingPhase2.getFormattedPrice();
            Intrinsics.checkNotNullExpressionValue(formattedPrice2, "getFormattedPrice(...)");
            String valueOf2 = String.valueOf(pricingPhase2.getPriceAmountMicros());
            String priceCurrencyCode2 = pricingPhase2.getPriceCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(priceCurrencyCode2, "getPriceCurrencyCode(...)");
            arrayList.add(new PricingPhaseAndroid(billingCycleCount, billingPeriod2, formattedPrice2, valueOf2, priceCurrencyCode2, pricingPhase2.getRecurrenceMode()));
        }
        return new SubscriptionOffer(basePlanId, str2, str, str3, installmentPlanDetailsAndroid, null, null, null, null, offerTags, offerToken, determinePaymentMode, parseBillingPeriod, valueOf, priceAmountMicros, new PricingPhasesAndroid(arrayList), null, null, discountOfferType2, 197088, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProductAndroid toInAppProduct(ProductDetails productDetails) {
        Object m3984constructorimpl;
        List list;
        ArrayList listOf;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(productDetails.getOneTimePurchaseOfferDetailsList());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        ArrayList arrayList = null;
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            m3984constructorimpl = null;
        }
        List list2 = (List) m3984constructorimpl;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
        String formattedPrice = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getFormattedPrice() : null;
        String str = formattedPrice == null ? "" : formattedPrice;
        String priceCurrencyCode = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceCurrencyCode() : null;
        String str2 = priceCurrencyCode == null ? "" : priceCurrencyCode;
        long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
        List list3 = list2;
        if (!list3.isEmpty()) {
            List<ProductDetails.OneTimePurchaseOfferDetails> list4 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 : list4) {
                BillingConverters billingConverters = INSTANCE;
                Intrinsics.checkNotNull(oneTimePurchaseOfferDetails2);
                arrayList2.add(billingConverters.toOfferDetail(oneTimePurchaseOfferDetails2));
            }
            listOf = arrayList2;
        } else if (oneTimePurchaseOfferDetails != null) {
            listOf = CollectionsKt.listOf(INSTANCE.toOfferDetail(oneTimePurchaseOfferDetails));
        } else {
            list = null;
            if (list3.isEmpty()) {
                List<ProductDetails.OneTimePurchaseOfferDetails> list5 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                for (ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3 : list5) {
                    BillingConverters billingConverters2 = INSTANCE;
                    Intrinsics.checkNotNull(oneTimePurchaseOfferDetails3);
                    arrayList3.add(billingConverters2.toDiscountOffer(oneTimePurchaseOfferDetails3));
                }
                arrayList = arrayList3;
            } else if (oneTimePurchaseOfferDetails != null) {
                arrayList = CollectionsKt.listOf(INSTANCE.toDiscountOffer(oneTimePurchaseOfferDetails));
            }
            String description = productDetails.getDescription();
            String description2 = productDetails.getDescription();
            Intrinsics.checkNotNullExpressionValue(description2, "getDescription(...)");
            String name = productDetails.getName();
            String productId = productDetails.getProductId();
            Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
            String name2 = productDetails.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            IapPlatform iapPlatform = IapPlatform.Android;
            Double valueOf = Double.valueOf(priceAmountMicros / 1000000.0d);
            ProductStatusAndroid productStatus = getProductStatus(productDetails);
            String title = productDetails.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
            return new ProductAndroid(str2, description, description2, arrayList, name, str, productId, name2, list, iapPlatform, valueOf, productStatus, null, null, title, ProductType.InApp);
        }
        list = listOf;
        if (list3.isEmpty()) {
        }
        String description3 = productDetails.getDescription();
        String description22 = productDetails.getDescription();
        Intrinsics.checkNotNullExpressionValue(description22, "getDescription(...)");
        String name3 = productDetails.getName();
        String productId2 = productDetails.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId2, "getProductId(...)");
        String name22 = productDetails.getName();
        Intrinsics.checkNotNullExpressionValue(name22, "getName(...)");
        IapPlatform iapPlatform2 = IapPlatform.Android;
        Double valueOf2 = Double.valueOf(priceAmountMicros / 1000000.0d);
        ProductStatusAndroid productStatus2 = getProductStatus(productDetails);
        String title2 = productDetails.getTitle();
        Intrinsics.checkNotNullExpressionValue(title2, "getTitle(...)");
        return new ProductAndroid(str2, description3, description22, arrayList, name3, str, productId2, name22, list, iapPlatform2, valueOf2, productStatus2, null, null, title2, ProductType.InApp);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProductSubscriptionAndroid toSubscriptionProduct(ProductDetails productDetails) {
        Object m3984constructorimpl;
        List list;
        ArrayList listOf;
        List list2;
        ArrayList listOf2;
        Object m3984constructorimpl2;
        Intrinsics.checkNotNullParameter(productDetails, "<this>");
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails == null) {
            subscriptionOfferDetails = CollectionsKt.emptyList();
        }
        ProductDetails.PricingPhase findBasePricingPhase = findBasePricingPhase(subscriptionOfferDetails);
        String formattedPrice = findBasePricingPhase != null ? findBasePricingPhase.getFormattedPrice() : null;
        String str = formattedPrice == null ? "" : formattedPrice;
        String priceCurrencyCode = findBasePricingPhase != null ? findBasePricingPhase.getPriceCurrencyCode() : null;
        String str2 = priceCurrencyCode == null ? "" : priceCurrencyCode;
        List<ProductDetails.SubscriptionOfferDetails> list3 = subscriptionOfferDetails;
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : list3) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m3984constructorimpl2 = Result.m3984constructorimpl(subscriptionOfferDetails2.getInstallmentPlanDetails());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
                m3984constructorimpl2 = null;
            }
            ProductDetails.InstallmentPlanDetails installmentPlanDetails = (ProductDetails.InstallmentPlanDetails) m3984constructorimpl2;
            InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = installmentPlanDetails != null ? new InstallmentPlanDetailsAndroid(installmentPlanDetails.getInstallmentPlanCommitmentPaymentsCount(), installmentPlanDetails.getSubsequentInstallmentPlanCommitmentPaymentsCount()) : null;
            String basePlanId = subscriptionOfferDetails2.getBasePlanId();
            Intrinsics.checkNotNullExpressionValue(basePlanId, "getBasePlanId(...)");
            String offerId = subscriptionOfferDetails2.getOfferId();
            List<String> offerTags = subscriptionOfferDetails2.getOfferTags();
            Intrinsics.checkNotNullExpressionValue(offerTags, "getOfferTags(...)");
            String offerToken = subscriptionOfferDetails2.getOfferToken();
            Intrinsics.checkNotNullExpressionValue(offerToken, "getOfferToken(...)");
            List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList();
            Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "getPricingPhaseList(...)");
            List<ProductDetails.PricingPhase> list4 = pricingPhaseList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, i));
            for (ProductDetails.PricingPhase pricingPhase : list4) {
                int billingCycleCount = pricingPhase.getBillingCycleCount();
                String billingPeriod = pricingPhase.getBillingPeriod();
                Intrinsics.checkNotNullExpressionValue(billingPeriod, "getBillingPeriod(...)");
                String formattedPrice2 = pricingPhase.getFormattedPrice();
                List<String> list5 = offerTags;
                Intrinsics.checkNotNullExpressionValue(formattedPrice2, "getFormattedPrice(...)");
                String valueOf = String.valueOf(pricingPhase.getPriceAmountMicros());
                String priceCurrencyCode2 = pricingPhase.getPriceCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(priceCurrencyCode2, "getPriceCurrencyCode(...)");
                arrayList2.add(new PricingPhaseAndroid(billingCycleCount, billingPeriod, formattedPrice2, valueOf, priceCurrencyCode2, pricingPhase.getRecurrenceMode()));
                offerTags = list5;
            }
            arrayList.add(new ProductSubscriptionAndroidOfferDetails(basePlanId, installmentPlanDetailsAndroid, offerId, offerTags, offerToken, new PricingPhasesAndroid(arrayList2)));
            i = 10;
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails3 : list3) {
            BillingConverters billingConverters = INSTANCE;
            Intrinsics.checkNotNull(subscriptionOfferDetails3);
            arrayList4.add(billingConverters.toSubscriptionOffer(subscriptionOfferDetails3));
        }
        ArrayList arrayList5 = arrayList4;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(productDetails.getOneTimePurchaseOfferDetailsList());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl)) {
            m3984constructorimpl = null;
        }
        List list6 = (List) m3984constructorimpl;
        if (list6 == null) {
            list6 = CollectionsKt.emptyList();
        }
        List list7 = list6;
        if (!list7.isEmpty()) {
            List<ProductDetails.OneTimePurchaseOfferDetails> list8 = list6;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
            for (ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails : list8) {
                BillingConverters billingConverters2 = INSTANCE;
                Intrinsics.checkNotNull(oneTimePurchaseOfferDetails);
                arrayList6.add(billingConverters2.toOfferDetail(oneTimePurchaseOfferDetails));
            }
            listOf = arrayList6;
        } else {
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
            if (oneTimePurchaseOfferDetails2 == null) {
                list = null;
                if (list7.isEmpty()) {
                    List<ProductDetails.OneTimePurchaseOfferDetails> list9 = list6;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
                    for (ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails3 : list9) {
                        BillingConverters billingConverters3 = INSTANCE;
                        Intrinsics.checkNotNull(oneTimePurchaseOfferDetails3);
                        arrayList7.add(billingConverters3.toDiscountOffer(oneTimePurchaseOfferDetails3));
                    }
                    listOf2 = arrayList7;
                } else {
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails4 = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails4 == null) {
                        list2 = null;
                        String description = productDetails.getDescription();
                        String description2 = productDetails.getDescription();
                        Intrinsics.checkNotNullExpressionValue(description2, "getDescription(...)");
                        String name = productDetails.getName();
                        String productId = productDetails.getProductId();
                        Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
                        String name2 = productDetails.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        IapPlatform iapPlatform = IapPlatform.Android;
                        Double valueOf2 = findBasePricingPhase != null ? Double.valueOf(findBasePricingPhase.getPriceAmountMicros() / 1000000.0d) : null;
                        ProductStatusAndroid productStatus = getProductStatus(productDetails);
                        String title = productDetails.getTitle();
                        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                        return new ProductSubscriptionAndroid(str2, description, description2, list2, name, str, productId, name2, list, iapPlatform, valueOf2, productStatus, arrayList3, arrayList5, title, ProductType.Subs);
                    }
                    listOf2 = CollectionsKt.listOf(INSTANCE.toDiscountOffer(oneTimePurchaseOfferDetails4));
                }
                list2 = listOf2;
                String description3 = productDetails.getDescription();
                String description22 = productDetails.getDescription();
                Intrinsics.checkNotNullExpressionValue(description22, "getDescription(...)");
                String name3 = productDetails.getName();
                String productId2 = productDetails.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId2, "getProductId(...)");
                String name22 = productDetails.getName();
                Intrinsics.checkNotNullExpressionValue(name22, "getName(...)");
                IapPlatform iapPlatform2 = IapPlatform.Android;
                if (findBasePricingPhase != null) {
                }
                ProductStatusAndroid productStatus2 = getProductStatus(productDetails);
                String title2 = productDetails.getTitle();
                Intrinsics.checkNotNullExpressionValue(title2, "getTitle(...)");
                return new ProductSubscriptionAndroid(str2, description3, description22, list2, name3, str, productId2, name22, list, iapPlatform2, valueOf2, productStatus2, arrayList3, arrayList5, title2, ProductType.Subs);
            }
            listOf = CollectionsKt.listOf(INSTANCE.toOfferDetail(oneTimePurchaseOfferDetails2));
        }
        list = listOf;
        if (list7.isEmpty()) {
        }
        list2 = listOf2;
        String description32 = productDetails.getDescription();
        String description222 = productDetails.getDescription();
        Intrinsics.checkNotNullExpressionValue(description222, "getDescription(...)");
        String name32 = productDetails.getName();
        String productId22 = productDetails.getProductId();
        Intrinsics.checkNotNullExpressionValue(productId22, "getProductId(...)");
        String name222 = productDetails.getName();
        Intrinsics.checkNotNullExpressionValue(name222, "getName(...)");
        IapPlatform iapPlatform22 = IapPlatform.Android;
        if (findBasePricingPhase != null) {
        }
        ProductStatusAndroid productStatus22 = getProductStatus(productDetails);
        String title22 = productDetails.getTitle();
        Intrinsics.checkNotNullExpressionValue(title22, "getTitle(...)");
        return new ProductSubscriptionAndroid(str2, description32, description222, list2, name32, str, productId22, name222, list, iapPlatform22, valueOf2, productStatus22, arrayList3, arrayList5, title22, ProductType.Subs);
    }

    public static /* synthetic */ PurchaseAndroid toPurchase$default(BillingConverters billingConverters, Purchase purchase, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return billingConverters.toPurchase(purchase, str, str2);
    }

    public final PurchaseAndroid toPurchase(Purchase purchase, String productType, String str) {
        Object m3984constructorimpl;
        Boolean bool;
        Object m3984constructorimpl2;
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid;
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        Intrinsics.checkNotNullParameter(productType, "productType");
        PurchaseState fromBillingState = BillingConvertersKt.fromBillingState(PurchaseState.INSTANCE, purchase.getPurchaseState());
        if (Intrinsics.areEqual(productType, "subs")) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Object invoke = purchase.getClass().getMethod("isSuspended", new Class[0]).invoke(purchase, new Object[0]);
                m3984constructorimpl = Result.m3984constructorimpl(invoke instanceof Boolean ? (Boolean) invoke : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3990isFailureimpl(m3984constructorimpl)) {
                m3984constructorimpl = null;
            }
            bool = (Boolean) m3984constructorimpl;
        } else {
            bool = null;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            m3984constructorimpl2 = Result.m3984constructorimpl(purchase.getPendingPurchaseUpdate());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m3984constructorimpl2 = Result.m3984constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3990isFailureimpl(m3984constructorimpl2)) {
            m3984constructorimpl2 = null;
        }
        Purchase.PendingPurchaseUpdate pendingPurchaseUpdate = (Purchase.PendingPurchaseUpdate) m3984constructorimpl2;
        if (pendingPurchaseUpdate != null) {
            List<String> products = pendingPurchaseUpdate.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
            String purchaseToken = pendingPurchaseUpdate.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
            pendingPurchaseUpdateAndroid = new PendingPurchaseUpdateAndroid(products, purchaseToken);
        } else {
            pendingPurchaseUpdateAndroid = null;
        }
        boolean isAutoRenewing = purchase.isAutoRenewing();
        String originalJson = purchase.getOriginalJson();
        String developerPayload = purchase.getDeveloperPayload();
        String orderId = purchase.getOrderId();
        if (orderId == null) {
            orderId = purchase.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(orderId, "getPurchaseToken(...)");
        }
        String str2 = orderId;
        List<String> products2 = purchase.getProducts();
        boolean isAcknowledged = purchase.isAcknowledged();
        boolean isAutoRenewing2 = purchase.isAutoRenewing();
        AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
        String obfuscatedAccountId = accountIdentifiers != null ? accountIdentifiers.getObfuscatedAccountId() : null;
        AccountIdentifiers accountIdentifiers2 = purchase.getAccountIdentifiers();
        String obfuscatedProfileId = accountIdentifiers2 != null ? accountIdentifiers2.getObfuscatedProfileId() : null;
        String packageName = purchase.getPackageName();
        IapPlatform iapPlatform = IapPlatform.Android;
        List<String> products3 = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products3, "getProducts(...)");
        String str3 = (String) CollectionsKt.firstOrNull((List) products3);
        if (str3 == null) {
            str3 = "";
        }
        return new PurchaseAndroid(Boolean.valueOf(isAutoRenewing), str, originalJson, developerPayload, str2, products2, Boolean.valueOf(isAcknowledged), isAutoRenewing2, bool, obfuscatedAccountId, obfuscatedProfileId, packageName, pendingPurchaseUpdateAndroid, iapPlatform, str3, fromBillingState, purchase.getPurchaseToken(), purchase.getQuantity(), purchase.getSignature(), IapStore.Google, purchase.getPurchaseTime(), purchase.getOrderId());
    }
}
