package dev.hyo.openiap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001BB\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010-J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J¡\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006C"}, d2 = {"Ldev/hyo/openiap/ProductAndroidOneTimePurchaseOfferDetail;", "", "discountDisplayInfo", "Ldev/hyo/openiap/DiscountDisplayInfoAndroid;", "formattedPrice", "", "fullPriceMicros", "limitedQuantityInfo", "Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "offerId", "offerTags", "", "offerToken", "preorderDetailsAndroid", "Ldev/hyo/openiap/PreorderDetailsAndroid;", "priceAmountMicros", "priceCurrencyCode", "purchaseOptionId", "rentalDetailsAndroid", "Ldev/hyo/openiap/RentalDetailsAndroid;", "validTimeWindow", "Ldev/hyo/openiap/ValidTimeWindowAndroid;", "<init>", "(Ldev/hyo/openiap/DiscountDisplayInfoAndroid;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/LimitedQuantityInfoAndroid;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/PreorderDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/RentalDetailsAndroid;Ldev/hyo/openiap/ValidTimeWindowAndroid;)V", "getDiscountDisplayInfo", "()Ldev/hyo/openiap/DiscountDisplayInfoAndroid;", "getFormattedPrice", "()Ljava/lang/String;", "getFullPriceMicros", "getLimitedQuantityInfo", "()Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "getOfferId", "getOfferTags", "()Ljava/util/List;", "getOfferToken", "getPreorderDetailsAndroid", "()Ldev/hyo/openiap/PreorderDetailsAndroid;", "getPriceAmountMicros", "getPriceCurrencyCode", "getPurchaseOptionId", "getRentalDetailsAndroid", "()Ldev/hyo/openiap/RentalDetailsAndroid;", "getValidTimeWindow", "()Ldev/hyo/openiap/ValidTimeWindowAndroid;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductAndroidOneTimePurchaseOfferDetail {
    private final DiscountDisplayInfoAndroid discountDisplayInfo;
    private final String formattedPrice;
    private final String fullPriceMicros;
    private final LimitedQuantityInfoAndroid limitedQuantityInfo;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final PreorderDetailsAndroid preorderDetailsAndroid;
    private final String priceAmountMicros;
    private final String priceCurrencyCode;
    private final String purchaseOptionId;
    private final RentalDetailsAndroid rentalDetailsAndroid;
    private final ValidTimeWindowAndroid validTimeWindow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ProductAndroidOneTimePurchaseOfferDetail copy$default(ProductAndroidOneTimePurchaseOfferDetail productAndroidOneTimePurchaseOfferDetail, DiscountDisplayInfoAndroid discountDisplayInfoAndroid, String str, String str2, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, String str3, List list, String str4, PreorderDetailsAndroid preorderDetailsAndroid, String str5, String str6, String str7, RentalDetailsAndroid rentalDetailsAndroid, ValidTimeWindowAndroid validTimeWindowAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            discountDisplayInfoAndroid = productAndroidOneTimePurchaseOfferDetail.discountDisplayInfo;
        }
        return productAndroidOneTimePurchaseOfferDetail.copy(discountDisplayInfoAndroid, (i & 2) != 0 ? productAndroidOneTimePurchaseOfferDetail.formattedPrice : str, (i & 4) != 0 ? productAndroidOneTimePurchaseOfferDetail.fullPriceMicros : str2, (i & 8) != 0 ? productAndroidOneTimePurchaseOfferDetail.limitedQuantityInfo : limitedQuantityInfoAndroid, (i & 16) != 0 ? productAndroidOneTimePurchaseOfferDetail.offerId : str3, (i & 32) != 0 ? productAndroidOneTimePurchaseOfferDetail.offerTags : list, (i & 64) != 0 ? productAndroidOneTimePurchaseOfferDetail.offerToken : str4, (i & 128) != 0 ? productAndroidOneTimePurchaseOfferDetail.preorderDetailsAndroid : preorderDetailsAndroid, (i & 256) != 0 ? productAndroidOneTimePurchaseOfferDetail.priceAmountMicros : str5, (i & 512) != 0 ? productAndroidOneTimePurchaseOfferDetail.priceCurrencyCode : str6, (i & 1024) != 0 ? productAndroidOneTimePurchaseOfferDetail.purchaseOptionId : str7, (i & 2048) != 0 ? productAndroidOneTimePurchaseOfferDetail.rentalDetailsAndroid : rentalDetailsAndroid, (i & 4096) != 0 ? productAndroidOneTimePurchaseOfferDetail.validTimeWindow : validTimeWindowAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final DiscountDisplayInfoAndroid getDiscountDisplayInfo() {
        return this.discountDisplayInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPurchaseOptionId() {
        return this.purchaseOptionId;
    }

    /* renamed from: component12, reason: from getter */
    public final RentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    /* renamed from: component13, reason: from getter */
    public final ValidTimeWindowAndroid getValidTimeWindow() {
        return this.validTimeWindow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFullPriceMicros() {
        return this.fullPriceMicros;
    }

    /* renamed from: component4, reason: from getter */
    public final LimitedQuantityInfoAndroid getLimitedQuantityInfo() {
        return this.limitedQuantityInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> component6() {
        return this.offerTags;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component8, reason: from getter */
    public final PreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final ProductAndroidOneTimePurchaseOfferDetail copy(DiscountDisplayInfoAndroid discountDisplayInfo, String formattedPrice, String fullPriceMicros, LimitedQuantityInfoAndroid limitedQuantityInfo, String offerId, List<String> offerTags, String offerToken, PreorderDetailsAndroid preorderDetailsAndroid, String priceAmountMicros, String priceCurrencyCode, String purchaseOptionId, RentalDetailsAndroid rentalDetailsAndroid, ValidTimeWindowAndroid validTimeWindow) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new ProductAndroidOneTimePurchaseOfferDetail(discountDisplayInfo, formattedPrice, fullPriceMicros, limitedQuantityInfo, offerId, offerTags, offerToken, preorderDetailsAndroid, priceAmountMicros, priceCurrencyCode, purchaseOptionId, rentalDetailsAndroid, validTimeWindow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductAndroidOneTimePurchaseOfferDetail)) {
            return false;
        }
        ProductAndroidOneTimePurchaseOfferDetail productAndroidOneTimePurchaseOfferDetail = (ProductAndroidOneTimePurchaseOfferDetail) other;
        return Intrinsics.areEqual(this.discountDisplayInfo, productAndroidOneTimePurchaseOfferDetail.discountDisplayInfo) && Intrinsics.areEqual(this.formattedPrice, productAndroidOneTimePurchaseOfferDetail.formattedPrice) && Intrinsics.areEqual(this.fullPriceMicros, productAndroidOneTimePurchaseOfferDetail.fullPriceMicros) && Intrinsics.areEqual(this.limitedQuantityInfo, productAndroidOneTimePurchaseOfferDetail.limitedQuantityInfo) && Intrinsics.areEqual(this.offerId, productAndroidOneTimePurchaseOfferDetail.offerId) && Intrinsics.areEqual(this.offerTags, productAndroidOneTimePurchaseOfferDetail.offerTags) && Intrinsics.areEqual(this.offerToken, productAndroidOneTimePurchaseOfferDetail.offerToken) && Intrinsics.areEqual(this.preorderDetailsAndroid, productAndroidOneTimePurchaseOfferDetail.preorderDetailsAndroid) && Intrinsics.areEqual(this.priceAmountMicros, productAndroidOneTimePurchaseOfferDetail.priceAmountMicros) && Intrinsics.areEqual(this.priceCurrencyCode, productAndroidOneTimePurchaseOfferDetail.priceCurrencyCode) && Intrinsics.areEqual(this.purchaseOptionId, productAndroidOneTimePurchaseOfferDetail.purchaseOptionId) && Intrinsics.areEqual(this.rentalDetailsAndroid, productAndroidOneTimePurchaseOfferDetail.rentalDetailsAndroid) && Intrinsics.areEqual(this.validTimeWindow, productAndroidOneTimePurchaseOfferDetail.validTimeWindow);
    }

    public int hashCode() {
        DiscountDisplayInfoAndroid discountDisplayInfoAndroid = this.discountDisplayInfo;
        int hashCode = (((discountDisplayInfoAndroid == null ? 0 : discountDisplayInfoAndroid.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31;
        String str = this.fullPriceMicros;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = this.limitedQuantityInfo;
        int hashCode3 = (hashCode2 + (limitedQuantityInfoAndroid == null ? 0 : limitedQuantityInfoAndroid.hashCode())) * 31;
        String str2 = this.offerId;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PreorderDetailsAndroid preorderDetailsAndroid = this.preorderDetailsAndroid;
        int hashCode5 = (((((hashCode4 + (preorderDetailsAndroid == null ? 0 : preorderDetailsAndroid.hashCode())) * 31) + this.priceAmountMicros.hashCode()) * 31) + this.priceCurrencyCode.hashCode()) * 31;
        String str3 = this.purchaseOptionId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RentalDetailsAndroid rentalDetailsAndroid = this.rentalDetailsAndroid;
        int hashCode7 = (hashCode6 + (rentalDetailsAndroid == null ? 0 : rentalDetailsAndroid.hashCode())) * 31;
        ValidTimeWindowAndroid validTimeWindowAndroid = this.validTimeWindow;
        return hashCode7 + (validTimeWindowAndroid != null ? validTimeWindowAndroid.hashCode() : 0);
    }

    public String toString() {
        return "ProductAndroidOneTimePurchaseOfferDetail(discountDisplayInfo=" + this.discountDisplayInfo + ", formattedPrice=" + this.formattedPrice + ", fullPriceMicros=" + this.fullPriceMicros + ", limitedQuantityInfo=" + this.limitedQuantityInfo + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", preorderDetailsAndroid=" + this.preorderDetailsAndroid + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", purchaseOptionId=" + this.purchaseOptionId + ", rentalDetailsAndroid=" + this.rentalDetailsAndroid + ", validTimeWindow=" + this.validTimeWindow + ")";
    }

    public ProductAndroidOneTimePurchaseOfferDetail(DiscountDisplayInfoAndroid discountDisplayInfoAndroid, String formattedPrice, String str, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, String str2, List<String> offerTags, String offerToken, PreorderDetailsAndroid preorderDetailsAndroid, String priceAmountMicros, String priceCurrencyCode, String str3, RentalDetailsAndroid rentalDetailsAndroid, ValidTimeWindowAndroid validTimeWindowAndroid) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.discountDisplayInfo = discountDisplayInfoAndroid;
        this.formattedPrice = formattedPrice;
        this.fullPriceMicros = str;
        this.limitedQuantityInfo = limitedQuantityInfoAndroid;
        this.offerId = str2;
        this.offerTags = offerTags;
        this.offerToken = offerToken;
        this.preorderDetailsAndroid = preorderDetailsAndroid;
        this.priceAmountMicros = priceAmountMicros;
        this.priceCurrencyCode = priceCurrencyCode;
        this.purchaseOptionId = str3;
        this.rentalDetailsAndroid = rentalDetailsAndroid;
        this.validTimeWindow = validTimeWindowAndroid;
    }

    public /* synthetic */ ProductAndroidOneTimePurchaseOfferDetail(DiscountDisplayInfoAndroid discountDisplayInfoAndroid, String str, String str2, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, String str3, List list, String str4, PreorderDetailsAndroid preorderDetailsAndroid, String str5, String str6, String str7, RentalDetailsAndroid rentalDetailsAndroid, ValidTimeWindowAndroid validTimeWindowAndroid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : discountDisplayInfoAndroid, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : limitedQuantityInfoAndroid, (i & 16) != 0 ? null : str3, list, str4, (i & 128) != 0 ? null : preorderDetailsAndroid, str5, str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : rentalDetailsAndroid, (i & 4096) != 0 ? null : validTimeWindowAndroid);
    }

    public final DiscountDisplayInfoAndroid getDiscountDisplayInfo() {
        return this.discountDisplayInfo;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getFullPriceMicros() {
        return this.fullPriceMicros;
    }

    public final LimitedQuantityInfoAndroid getLimitedQuantityInfo() {
        return this.limitedQuantityInfo;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final PreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final String getPurchaseOptionId() {
        return this.purchaseOptionId;
    }

    public final RentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    public final ValidTimeWindowAndroid getValidTimeWindow() {
        return this.validTimeWindow;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductAndroidOneTimePurchaseOfferDetail$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductAndroidOneTimePurchaseOfferDetail;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductAndroidOneTimePurchaseOfferDetail fromJson(Map<String, ? extends Object> json) {
            ArrayList emptyList;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("discountDisplayInfo");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            DiscountDisplayInfoAndroid fromJson = map != null ? DiscountDisplayInfoAndroid.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("formattedPrice");
            String str = obj2 instanceof String ? (String) obj2 : null;
            String str2 = str == null ? "" : str;
            Object obj3 = json.get("fullPriceMicros");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("limitedQuantityInfo");
            Map<String, ? extends Object> map2 = obj4 instanceof Map ? (Map) obj4 : null;
            LimitedQuantityInfoAndroid fromJson2 = map2 != null ? LimitedQuantityInfoAndroid.INSTANCE.fromJson(map2) : null;
            Object obj5 = json.get("offerId");
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("offerTags");
            List list = obj6 instanceof List ? (List) obj6 : null;
            if (list == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : list) {
                    String str5 = obj7 instanceof String ? (String) obj7 : null;
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                emptyList = arrayList;
            }
            List list2 = emptyList;
            Object obj8 = json.get("offerToken");
            String str6 = obj8 instanceof String ? (String) obj8 : null;
            String str7 = str6 == null ? "" : str6;
            Object obj9 = json.get("preorderDetailsAndroid");
            Map<String, ? extends Object> map3 = obj9 instanceof Map ? (Map) obj9 : null;
            PreorderDetailsAndroid fromJson3 = map3 != null ? PreorderDetailsAndroid.INSTANCE.fromJson(map3) : null;
            Object obj10 = json.get("priceAmountMicros");
            String str8 = obj10 instanceof String ? (String) obj10 : null;
            String str9 = str8 == null ? "" : str8;
            Object obj11 = json.get("priceCurrencyCode");
            String str10 = obj11 instanceof String ? (String) obj11 : null;
            String str11 = str10 == null ? "" : str10;
            Object obj12 = json.get("purchaseOptionId");
            String str12 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = json.get("rentalDetailsAndroid");
            Map<String, ? extends Object> map4 = obj13 instanceof Map ? (Map) obj13 : null;
            RentalDetailsAndroid fromJson4 = map4 != null ? RentalDetailsAndroid.INSTANCE.fromJson(map4) : null;
            Object obj14 = json.get("validTimeWindow");
            Map<String, ? extends Object> map5 = obj14 instanceof Map ? (Map) obj14 : null;
            return new ProductAndroidOneTimePurchaseOfferDetail(fromJson, str2, str3, fromJson2, str4, list2, str7, fromJson3, str9, str11, str12, fromJson4, map5 != null ? ValidTimeWindowAndroid.INSTANCE.fromJson(map5) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[14];
        pairArr[0] = TuplesKt.to("__typename", "ProductAndroidOneTimePurchaseOfferDetail");
        DiscountDisplayInfoAndroid discountDisplayInfoAndroid = this.discountDisplayInfo;
        pairArr[1] = TuplesKt.to("discountDisplayInfo", discountDisplayInfoAndroid != null ? discountDisplayInfoAndroid.toJson() : null);
        pairArr[2] = TuplesKt.to("formattedPrice", this.formattedPrice);
        pairArr[3] = TuplesKt.to("fullPriceMicros", this.fullPriceMicros);
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = this.limitedQuantityInfo;
        pairArr[4] = TuplesKt.to("limitedQuantityInfo", limitedQuantityInfoAndroid != null ? limitedQuantityInfoAndroid.toJson() : null);
        pairArr[5] = TuplesKt.to("offerId", this.offerId);
        pairArr[6] = TuplesKt.to("offerTags", this.offerTags);
        pairArr[7] = TuplesKt.to("offerToken", this.offerToken);
        PreorderDetailsAndroid preorderDetailsAndroid = this.preorderDetailsAndroid;
        pairArr[8] = TuplesKt.to("preorderDetailsAndroid", preorderDetailsAndroid != null ? preorderDetailsAndroid.toJson() : null);
        pairArr[9] = TuplesKt.to("priceAmountMicros", this.priceAmountMicros);
        pairArr[10] = TuplesKt.to("priceCurrencyCode", this.priceCurrencyCode);
        pairArr[11] = TuplesKt.to("purchaseOptionId", this.purchaseOptionId);
        RentalDetailsAndroid rentalDetailsAndroid = this.rentalDetailsAndroid;
        pairArr[12] = TuplesKt.to("rentalDetailsAndroid", rentalDetailsAndroid != null ? rentalDetailsAndroid.toJson() : null);
        ValidTimeWindowAndroid validTimeWindowAndroid = this.validTimeWindow;
        pairArr[13] = TuplesKt.to("validTimeWindow", validTimeWindowAndroid != null ? validTimeWindowAndroid.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
