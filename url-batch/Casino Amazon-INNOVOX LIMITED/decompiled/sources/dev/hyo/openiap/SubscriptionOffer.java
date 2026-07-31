package dev.hyo.openiap;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0001[Bá\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010@J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010+J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010+J\t\u0010O\u001a\u00020\u0017HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010S\u001a\u00020\u001dHÆ\u0003Jð\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001¢\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020\rHÖ\u0001J\t\u0010Z\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010,\u001a\u0004\b4\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006\\"}, d2 = {"Ldev/hyo/openiap/SubscriptionOffer;", "", "basePlanIdAndroid", "", "currency", "displayPrice", "id", "installmentPlanDetailsAndroid", "Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;", "keyIdentifierIOS", "localizedPriceIOS", "nonceIOS", "numberOfPeriodsIOS", "", "offerTagsAndroid", "", "offerTokenAndroid", "paymentMode", "Ldev/hyo/openiap/PaymentMode;", TypedValues.Cycle.S_WAVE_PERIOD, "Ldev/hyo/openiap/SubscriptionPeriod;", "periodCount", "price", "", "pricingPhasesAndroid", "Ldev/hyo/openiap/PricingPhasesAndroid;", "signatureIOS", "timestampIOS", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/DiscountOfferType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/PaymentMode;Ldev/hyo/openiap/SubscriptionPeriod;Ljava/lang/Integer;DLdev/hyo/openiap/PricingPhasesAndroid;Ljava/lang/String;Ljava/lang/Double;Ldev/hyo/openiap/DiscountOfferType;)V", "getBasePlanIdAndroid", "()Ljava/lang/String;", "getCurrency", "getDisplayPrice", "getId", "getInstallmentPlanDetailsAndroid", "()Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;", "getKeyIdentifierIOS", "getLocalizedPriceIOS", "getNonceIOS", "getNumberOfPeriodsIOS", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferTagsAndroid", "()Ljava/util/List;", "getOfferTokenAndroid", "getPaymentMode", "()Ldev/hyo/openiap/PaymentMode;", "getPeriod", "()Ldev/hyo/openiap/SubscriptionPeriod;", "getPeriodCount", "getPrice", "()D", "getPricingPhasesAndroid", "()Ldev/hyo/openiap/PricingPhasesAndroid;", "getSignatureIOS", "getTimestampIOS", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getType", "()Ldev/hyo/openiap/DiscountOfferType;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/PaymentMode;Ldev/hyo/openiap/SubscriptionPeriod;Ljava/lang/Integer;DLdev/hyo/openiap/PricingPhasesAndroid;Ljava/lang/String;Ljava/lang/Double;Ldev/hyo/openiap/DiscountOfferType;)Ldev/hyo/openiap/SubscriptionOffer;", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionOffer {
    private final String basePlanIdAndroid;
    private final String currency;
    private final String displayPrice;
    private final String id;
    private final InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid;
    private final String keyIdentifierIOS;
    private final String localizedPriceIOS;
    private final String nonceIOS;
    private final Integer numberOfPeriodsIOS;
    private final List<String> offerTagsAndroid;
    private final String offerTokenAndroid;
    private final PaymentMode paymentMode;
    private final SubscriptionPeriod period;
    private final Integer periodCount;
    private final double price;
    private final PricingPhasesAndroid pricingPhasesAndroid;
    private final String signatureIOS;
    private final Double timestampIOS;
    private final DiscountOfferType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ SubscriptionOffer copy$default(SubscriptionOffer subscriptionOffer, String str, String str2, String str3, String str4, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str5, String str6, String str7, Integer num, List list, String str8, PaymentMode paymentMode, SubscriptionPeriod subscriptionPeriod, Integer num2, double d, PricingPhasesAndroid pricingPhasesAndroid, String str9, Double d2, DiscountOfferType discountOfferType, int i, Object obj) {
        DiscountOfferType discountOfferType2;
        Double d3;
        String str10 = (i & 1) != 0 ? subscriptionOffer.basePlanIdAndroid : str;
        String str11 = (i & 2) != 0 ? subscriptionOffer.currency : str2;
        String str12 = (i & 4) != 0 ? subscriptionOffer.displayPrice : str3;
        String str13 = (i & 8) != 0 ? subscriptionOffer.id : str4;
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid2 = (i & 16) != 0 ? subscriptionOffer.installmentPlanDetailsAndroid : installmentPlanDetailsAndroid;
        String str14 = (i & 32) != 0 ? subscriptionOffer.keyIdentifierIOS : str5;
        String str15 = (i & 64) != 0 ? subscriptionOffer.localizedPriceIOS : str6;
        String str16 = (i & 128) != 0 ? subscriptionOffer.nonceIOS : str7;
        Integer num3 = (i & 256) != 0 ? subscriptionOffer.numberOfPeriodsIOS : num;
        List list2 = (i & 512) != 0 ? subscriptionOffer.offerTagsAndroid : list;
        String str17 = (i & 1024) != 0 ? subscriptionOffer.offerTokenAndroid : str8;
        PaymentMode paymentMode2 = (i & 2048) != 0 ? subscriptionOffer.paymentMode : paymentMode;
        SubscriptionPeriod subscriptionPeriod2 = (i & 4096) != 0 ? subscriptionOffer.period : subscriptionPeriod;
        Integer num4 = (i & 8192) != 0 ? subscriptionOffer.periodCount : num2;
        String str18 = str10;
        double d4 = (i & 16384) != 0 ? subscriptionOffer.price : d;
        PricingPhasesAndroid pricingPhasesAndroid2 = (i & 32768) != 0 ? subscriptionOffer.pricingPhasesAndroid : pricingPhasesAndroid;
        String str19 = (i & 65536) != 0 ? subscriptionOffer.signatureIOS : str9;
        PricingPhasesAndroid pricingPhasesAndroid3 = pricingPhasesAndroid2;
        Double d5 = (i & 131072) != 0 ? subscriptionOffer.timestampIOS : d2;
        if ((i & 262144) != 0) {
            d3 = d5;
            discountOfferType2 = subscriptionOffer.type;
        } else {
            discountOfferType2 = discountOfferType;
            d3 = d5;
        }
        return subscriptionOffer.copy(str18, str11, str12, str13, installmentPlanDetailsAndroid2, str14, str15, str16, num3, list2, str17, paymentMode2, subscriptionPeriod2, num4, d4, pricingPhasesAndroid3, str19, d3, discountOfferType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    public final List<String> component10() {
        return this.offerTagsAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOfferTokenAndroid() {
        return this.offerTokenAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final PaymentMode getPaymentMode() {
        return this.paymentMode;
    }

    /* renamed from: component13, reason: from getter */
    public final SubscriptionPeriod getPeriod() {
        return this.period;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    /* renamed from: component15, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component16, reason: from getter */
    public final PricingPhasesAndroid getPricingPhasesAndroid() {
        return this.pricingPhasesAndroid;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSignatureIOS() {
        return this.signatureIOS;
    }

    /* renamed from: component18, reason: from getter */
    public final Double getTimestampIOS() {
        return this.timestampIOS;
    }

    /* renamed from: component19, reason: from getter */
    public final DiscountOfferType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component5, reason: from getter */
    public final InstallmentPlanDetailsAndroid getInstallmentPlanDetailsAndroid() {
        return this.installmentPlanDetailsAndroid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKeyIdentifierIOS() {
        return this.keyIdentifierIOS;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLocalizedPriceIOS() {
        return this.localizedPriceIOS;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNonceIOS() {
        return this.nonceIOS;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getNumberOfPeriodsIOS() {
        return this.numberOfPeriodsIOS;
    }

    public final SubscriptionOffer copy(String basePlanIdAndroid, String currency, String displayPrice, String id, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String keyIdentifierIOS, String localizedPriceIOS, String nonceIOS, Integer numberOfPeriodsIOS, List<String> offerTagsAndroid, String offerTokenAndroid, PaymentMode paymentMode, SubscriptionPeriod period, Integer periodCount, double price, PricingPhasesAndroid pricingPhasesAndroid, String signatureIOS, Double timestampIOS, DiscountOfferType type) {
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SubscriptionOffer(basePlanIdAndroid, currency, displayPrice, id, installmentPlanDetailsAndroid, keyIdentifierIOS, localizedPriceIOS, nonceIOS, numberOfPeriodsIOS, offerTagsAndroid, offerTokenAndroid, paymentMode, period, periodCount, price, pricingPhasesAndroid, signatureIOS, timestampIOS, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionOffer)) {
            return false;
        }
        SubscriptionOffer subscriptionOffer = (SubscriptionOffer) other;
        return Intrinsics.areEqual(this.basePlanIdAndroid, subscriptionOffer.basePlanIdAndroid) && Intrinsics.areEqual(this.currency, subscriptionOffer.currency) && Intrinsics.areEqual(this.displayPrice, subscriptionOffer.displayPrice) && Intrinsics.areEqual(this.id, subscriptionOffer.id) && Intrinsics.areEqual(this.installmentPlanDetailsAndroid, subscriptionOffer.installmentPlanDetailsAndroid) && Intrinsics.areEqual(this.keyIdentifierIOS, subscriptionOffer.keyIdentifierIOS) && Intrinsics.areEqual(this.localizedPriceIOS, subscriptionOffer.localizedPriceIOS) && Intrinsics.areEqual(this.nonceIOS, subscriptionOffer.nonceIOS) && Intrinsics.areEqual(this.numberOfPeriodsIOS, subscriptionOffer.numberOfPeriodsIOS) && Intrinsics.areEqual(this.offerTagsAndroid, subscriptionOffer.offerTagsAndroid) && Intrinsics.areEqual(this.offerTokenAndroid, subscriptionOffer.offerTokenAndroid) && this.paymentMode == subscriptionOffer.paymentMode && Intrinsics.areEqual(this.period, subscriptionOffer.period) && Intrinsics.areEqual(this.periodCount, subscriptionOffer.periodCount) && Double.compare(this.price, subscriptionOffer.price) == 0 && Intrinsics.areEqual(this.pricingPhasesAndroid, subscriptionOffer.pricingPhasesAndroid) && Intrinsics.areEqual(this.signatureIOS, subscriptionOffer.signatureIOS) && Intrinsics.areEqual((Object) this.timestampIOS, (Object) subscriptionOffer.timestampIOS) && this.type == subscriptionOffer.type;
    }

    public int hashCode() {
        String str = this.basePlanIdAndroid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.displayPrice.hashCode()) * 31) + this.id.hashCode()) * 31;
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = this.installmentPlanDetailsAndroid;
        int hashCode3 = (hashCode2 + (installmentPlanDetailsAndroid == null ? 0 : installmentPlanDetailsAndroid.hashCode())) * 31;
        String str3 = this.keyIdentifierIOS;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localizedPriceIOS;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nonceIOS;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.numberOfPeriodsIOS;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.offerTagsAndroid;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.offerTokenAndroid;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PaymentMode paymentMode = this.paymentMode;
        int hashCode10 = (hashCode9 + (paymentMode == null ? 0 : paymentMode.hashCode())) * 31;
        SubscriptionPeriod subscriptionPeriod = this.period;
        int hashCode11 = (hashCode10 + (subscriptionPeriod == null ? 0 : subscriptionPeriod.hashCode())) * 31;
        Integer num2 = this.periodCount;
        int hashCode12 = (((hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31) + Double.hashCode(this.price)) * 31;
        PricingPhasesAndroid pricingPhasesAndroid = this.pricingPhasesAndroid;
        int hashCode13 = (hashCode12 + (pricingPhasesAndroid == null ? 0 : pricingPhasesAndroid.hashCode())) * 31;
        String str7 = this.signatureIOS;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.timestampIOS;
        return ((hashCode14 + (d != null ? d.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SubscriptionOffer(basePlanIdAndroid=" + this.basePlanIdAndroid + ", currency=" + this.currency + ", displayPrice=" + this.displayPrice + ", id=" + this.id + ", installmentPlanDetailsAndroid=" + this.installmentPlanDetailsAndroid + ", keyIdentifierIOS=" + this.keyIdentifierIOS + ", localizedPriceIOS=" + this.localizedPriceIOS + ", nonceIOS=" + this.nonceIOS + ", numberOfPeriodsIOS=" + this.numberOfPeriodsIOS + ", offerTagsAndroid=" + this.offerTagsAndroid + ", offerTokenAndroid=" + this.offerTokenAndroid + ", paymentMode=" + this.paymentMode + ", period=" + this.period + ", periodCount=" + this.periodCount + ", price=" + this.price + ", pricingPhasesAndroid=" + this.pricingPhasesAndroid + ", signatureIOS=" + this.signatureIOS + ", timestampIOS=" + this.timestampIOS + ", type=" + this.type + ")";
    }

    public SubscriptionOffer(String str, String str2, String displayPrice, String id, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str3, String str4, String str5, Integer num, List<String> list, String str6, PaymentMode paymentMode, SubscriptionPeriod subscriptionPeriod, Integer num2, double d, PricingPhasesAndroid pricingPhasesAndroid, String str7, Double d2, DiscountOfferType type) {
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.basePlanIdAndroid = str;
        this.currency = str2;
        this.displayPrice = displayPrice;
        this.id = id;
        this.installmentPlanDetailsAndroid = installmentPlanDetailsAndroid;
        this.keyIdentifierIOS = str3;
        this.localizedPriceIOS = str4;
        this.nonceIOS = str5;
        this.numberOfPeriodsIOS = num;
        this.offerTagsAndroid = list;
        this.offerTokenAndroid = str6;
        this.paymentMode = paymentMode;
        this.period = subscriptionPeriod;
        this.periodCount = num2;
        this.price = d;
        this.pricingPhasesAndroid = pricingPhasesAndroid;
        this.signatureIOS = str7;
        this.timestampIOS = d2;
        this.type = type;
    }

    public /* synthetic */ SubscriptionOffer(String str, String str2, String str3, String str4, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str5, String str6, String str7, Integer num, List list, String str8, PaymentMode paymentMode, SubscriptionPeriod subscriptionPeriod, Integer num2, double d, PricingPhasesAndroid pricingPhasesAndroid, String str9, Double d2, DiscountOfferType discountOfferType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : installmentPlanDetailsAndroid, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : paymentMode, (i & 4096) != 0 ? null : subscriptionPeriod, (i & 8192) != 0 ? null : num2, d, (32768 & i) != 0 ? null : pricingPhasesAndroid, (65536 & i) != 0 ? null : str9, (i & 131072) != 0 ? null : d2, discountOfferType);
    }

    public final String getBasePlanIdAndroid() {
        return this.basePlanIdAndroid;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    public final String getId() {
        return this.id;
    }

    public final InstallmentPlanDetailsAndroid getInstallmentPlanDetailsAndroid() {
        return this.installmentPlanDetailsAndroid;
    }

    public final String getKeyIdentifierIOS() {
        return this.keyIdentifierIOS;
    }

    public final String getLocalizedPriceIOS() {
        return this.localizedPriceIOS;
    }

    public final String getNonceIOS() {
        return this.nonceIOS;
    }

    public final Integer getNumberOfPeriodsIOS() {
        return this.numberOfPeriodsIOS;
    }

    public final List<String> getOfferTagsAndroid() {
        return this.offerTagsAndroid;
    }

    public final String getOfferTokenAndroid() {
        return this.offerTokenAndroid;
    }

    public final PaymentMode getPaymentMode() {
        return this.paymentMode;
    }

    public final SubscriptionPeriod getPeriod() {
        return this.period;
    }

    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final PricingPhasesAndroid getPricingPhasesAndroid() {
        return this.pricingPhasesAndroid;
    }

    public final String getSignatureIOS() {
        return this.signatureIOS;
    }

    public final Double getTimestampIOS() {
        return this.timestampIOS;
    }

    public final DiscountOfferType getType() {
        return this.type;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionOffer$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionOffer;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionOffer fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            DiscountOfferType discountOfferType;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("basePlanIdAndroid");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("currency");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("displayPrice");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            String str4 = str3 == null ? "" : str3;
            Object obj4 = json.get("id");
            String str5 = obj4 instanceof String ? (String) obj4 : null;
            String str6 = str5 == null ? "" : str5;
            Object obj5 = json.get("installmentPlanDetailsAndroid");
            Map<String, ? extends Object> map = obj5 instanceof Map ? (Map) obj5 : null;
            InstallmentPlanDetailsAndroid fromJson = map != null ? InstallmentPlanDetailsAndroid.INSTANCE.fromJson(map) : null;
            Object obj6 = json.get("keyIdentifierIOS");
            String str7 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("localizedPriceIOS");
            String str8 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = json.get("nonceIOS");
            String str9 = obj8 instanceof String ? (String) obj8 : null;
            Object obj9 = json.get("numberOfPeriodsIOS");
            Number number = obj9 instanceof Number ? (Number) obj9 : null;
            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            Object obj10 = json.get("offerTagsAndroid");
            List list = obj10 instanceof List ? (List) obj10 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj11 : list) {
                    String str10 = obj11 instanceof String ? (String) obj11 : null;
                    if (str10 != null) {
                        arrayList2.add(str10);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj12 = json.get("offerTokenAndroid");
            String str11 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = json.get("paymentMode");
            String str12 = obj13 instanceof String ? (String) obj13 : null;
            PaymentMode fromJson2 = str12 != null ? PaymentMode.INSTANCE.fromJson(str12) : null;
            Object obj14 = json.get(TypedValues.Cycle.S_WAVE_PERIOD);
            Map<String, ? extends Object> map2 = obj14 instanceof Map ? (Map) obj14 : null;
            SubscriptionPeriod fromJson3 = map2 != null ? SubscriptionPeriod.INSTANCE.fromJson(map2) : null;
            Object obj15 = json.get("periodCount");
            Number number2 = obj15 instanceof Number ? (Number) obj15 : null;
            Integer valueOf2 = number2 != null ? Integer.valueOf(number2.intValue()) : null;
            Object obj16 = json.get("price");
            Number number3 = obj16 instanceof Number ? (Number) obj16 : null;
            double doubleValue = number3 != null ? number3.doubleValue() : 0.0d;
            Object obj17 = json.get("pricingPhasesAndroid");
            Map<String, ? extends Object> map3 = obj17 instanceof Map ? (Map) obj17 : null;
            PricingPhasesAndroid fromJson4 = map3 != null ? PricingPhasesAndroid.INSTANCE.fromJson(map3) : null;
            Object obj18 = json.get("signatureIOS");
            String str13 = obj18 instanceof String ? (String) obj18 : null;
            Object obj19 = json.get("timestampIOS");
            Number number4 = obj19 instanceof Number ? (Number) obj19 : null;
            Double valueOf3 = number4 != null ? Double.valueOf(number4.doubleValue()) : null;
            Object obj20 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str14 = obj20 instanceof String ? (String) obj20 : null;
            if (str14 == null || (discountOfferType = DiscountOfferType.INSTANCE.fromJson(str14)) == null) {
                discountOfferType = DiscountOfferType.Introductory;
            }
            return new SubscriptionOffer(str, str2, str4, str6, fromJson, str7, str8, str9, valueOf, arrayList, str11, fromJson2, fromJson3, valueOf2, doubleValue, fromJson4, str13, valueOf3, discountOfferType);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[20];
        pairArr[0] = TuplesKt.to("__typename", "SubscriptionOffer");
        pairArr[1] = TuplesKt.to("basePlanIdAndroid", this.basePlanIdAndroid);
        pairArr[2] = TuplesKt.to("currency", this.currency);
        pairArr[3] = TuplesKt.to("displayPrice", this.displayPrice);
        pairArr[4] = TuplesKt.to("id", this.id);
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = this.installmentPlanDetailsAndroid;
        pairArr[5] = TuplesKt.to("installmentPlanDetailsAndroid", installmentPlanDetailsAndroid != null ? installmentPlanDetailsAndroid.toJson() : null);
        pairArr[6] = TuplesKt.to("keyIdentifierIOS", this.keyIdentifierIOS);
        pairArr[7] = TuplesKt.to("localizedPriceIOS", this.localizedPriceIOS);
        pairArr[8] = TuplesKt.to("nonceIOS", this.nonceIOS);
        pairArr[9] = TuplesKt.to("numberOfPeriodsIOS", this.numberOfPeriodsIOS);
        pairArr[10] = TuplesKt.to("offerTagsAndroid", this.offerTagsAndroid);
        pairArr[11] = TuplesKt.to("offerTokenAndroid", this.offerTokenAndroid);
        PaymentMode paymentMode = this.paymentMode;
        pairArr[12] = TuplesKt.to("paymentMode", paymentMode != null ? paymentMode.toJson() : null);
        SubscriptionPeriod subscriptionPeriod = this.period;
        pairArr[13] = TuplesKt.to(TypedValues.Cycle.S_WAVE_PERIOD, subscriptionPeriod != null ? subscriptionPeriod.toJson() : null);
        pairArr[14] = TuplesKt.to("periodCount", this.periodCount);
        pairArr[15] = TuplesKt.to("price", Double.valueOf(this.price));
        PricingPhasesAndroid pricingPhasesAndroid = this.pricingPhasesAndroid;
        pairArr[16] = TuplesKt.to("pricingPhasesAndroid", pricingPhasesAndroid != null ? pricingPhasesAndroid.toJson() : null);
        pairArr[17] = TuplesKt.to("signatureIOS", this.signatureIOS);
        pairArr[18] = TuplesKt.to("timestampIOS", this.timestampIOS);
        pairArr[19] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
