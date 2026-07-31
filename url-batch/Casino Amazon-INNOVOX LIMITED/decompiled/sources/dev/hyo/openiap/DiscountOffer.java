package dev.hyo.openiap;

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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0001PB½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000108J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0018HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003JÌ\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u000fHÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006Q"}, d2 = {"Ldev/hyo/openiap/DiscountOffer;", "", "currency", "", "discountAmountMicrosAndroid", "displayPrice", "formattedDiscountAmountAndroid", "fullPriceMicrosAndroid", "id", "limitedQuantityInfoAndroid", "Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "offerTagsAndroid", "", "offerTokenAndroid", "percentageDiscountAndroid", "", "preorderDetailsAndroid", "Ldev/hyo/openiap/PreorderDetailsAndroid;", "price", "", "purchaseOptionIdAndroid", "rentalDetailsAndroid", "Ldev/hyo/openiap/RentalDetailsAndroid;", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/DiscountOfferType;", "validTimeWindowAndroid", "Ldev/hyo/openiap/ValidTimeWindowAndroid;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/LimitedQuantityInfoAndroid;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ldev/hyo/openiap/PreorderDetailsAndroid;DLjava/lang/String;Ldev/hyo/openiap/RentalDetailsAndroid;Ldev/hyo/openiap/DiscountOfferType;Ldev/hyo/openiap/ValidTimeWindowAndroid;)V", "getCurrency", "()Ljava/lang/String;", "getDiscountAmountMicrosAndroid", "getDisplayPrice", "getFormattedDiscountAmountAndroid", "getFullPriceMicrosAndroid", "getId", "getLimitedQuantityInfoAndroid", "()Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "getOfferTagsAndroid", "()Ljava/util/List;", "getOfferTokenAndroid", "getPercentageDiscountAndroid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreorderDetailsAndroid", "()Ldev/hyo/openiap/PreorderDetailsAndroid;", "getPrice", "()D", "getPurchaseOptionIdAndroid", "getRentalDetailsAndroid", "()Ldev/hyo/openiap/RentalDetailsAndroid;", "getType", "()Ldev/hyo/openiap/DiscountOfferType;", "getValidTimeWindowAndroid", "()Ldev/hyo/openiap/ValidTimeWindowAndroid;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/LimitedQuantityInfoAndroid;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ldev/hyo/openiap/PreorderDetailsAndroid;DLjava/lang/String;Ldev/hyo/openiap/RentalDetailsAndroid;Ldev/hyo/openiap/DiscountOfferType;Ldev/hyo/openiap/ValidTimeWindowAndroid;)Ldev/hyo/openiap/DiscountOffer;", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountOffer {
    private final String currency;
    private final String discountAmountMicrosAndroid;
    private final String displayPrice;
    private final String formattedDiscountAmountAndroid;
    private final String fullPriceMicrosAndroid;
    private final String id;
    private final LimitedQuantityInfoAndroid limitedQuantityInfoAndroid;
    private final List<String> offerTagsAndroid;
    private final String offerTokenAndroid;
    private final Integer percentageDiscountAndroid;
    private final PreorderDetailsAndroid preorderDetailsAndroid;
    private final double price;
    private final String purchaseOptionIdAndroid;
    private final RentalDetailsAndroid rentalDetailsAndroid;
    private final DiscountOfferType type;
    private final ValidTimeWindowAndroid validTimeWindowAndroid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ DiscountOffer copy$default(DiscountOffer discountOffer, String str, String str2, String str3, String str4, String str5, String str6, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, List list, String str7, Integer num, PreorderDetailsAndroid preorderDetailsAndroid, double d, String str8, RentalDetailsAndroid rentalDetailsAndroid, DiscountOfferType discountOfferType, ValidTimeWindowAndroid validTimeWindowAndroid, int i, Object obj) {
        String str9 = (i & 1) != 0 ? discountOffer.currency : str;
        return discountOffer.copy(str9, (i & 2) != 0 ? discountOffer.discountAmountMicrosAndroid : str2, (i & 4) != 0 ? discountOffer.displayPrice : str3, (i & 8) != 0 ? discountOffer.formattedDiscountAmountAndroid : str4, (i & 16) != 0 ? discountOffer.fullPriceMicrosAndroid : str5, (i & 32) != 0 ? discountOffer.id : str6, (i & 64) != 0 ? discountOffer.limitedQuantityInfoAndroid : limitedQuantityInfoAndroid, (i & 128) != 0 ? discountOffer.offerTagsAndroid : list, (i & 256) != 0 ? discountOffer.offerTokenAndroid : str7, (i & 512) != 0 ? discountOffer.percentageDiscountAndroid : num, (i & 1024) != 0 ? discountOffer.preorderDetailsAndroid : preorderDetailsAndroid, (i & 2048) != 0 ? discountOffer.price : d, (i & 4096) != 0 ? discountOffer.purchaseOptionIdAndroid : str8, (i & 8192) != 0 ? discountOffer.rentalDetailsAndroid : rentalDetailsAndroid, (i & 16384) != 0 ? discountOffer.type : discountOfferType, (i & 32768) != 0 ? discountOffer.validTimeWindowAndroid : validTimeWindowAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getPercentageDiscountAndroid() {
        return this.percentageDiscountAndroid;
    }

    /* renamed from: component11, reason: from getter */
    public final PreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPurchaseOptionIdAndroid() {
        return this.purchaseOptionIdAndroid;
    }

    /* renamed from: component14, reason: from getter */
    public final RentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    /* renamed from: component15, reason: from getter */
    public final DiscountOfferType getType() {
        return this.type;
    }

    /* renamed from: component16, reason: from getter */
    public final ValidTimeWindowAndroid getValidTimeWindowAndroid() {
        return this.validTimeWindowAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDiscountAmountMicrosAndroid() {
        return this.discountAmountMicrosAndroid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFormattedDiscountAmountAndroid() {
        return this.formattedDiscountAmountAndroid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFullPriceMicrosAndroid() {
        return this.fullPriceMicrosAndroid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final LimitedQuantityInfoAndroid getLimitedQuantityInfoAndroid() {
        return this.limitedQuantityInfoAndroid;
    }

    public final List<String> component8() {
        return this.offerTagsAndroid;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOfferTokenAndroid() {
        return this.offerTokenAndroid;
    }

    public final DiscountOffer copy(String currency, String discountAmountMicrosAndroid, String displayPrice, String formattedDiscountAmountAndroid, String fullPriceMicrosAndroid, String id, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, List<String> offerTagsAndroid, String offerTokenAndroid, Integer percentageDiscountAndroid, PreorderDetailsAndroid preorderDetailsAndroid, double price, String purchaseOptionIdAndroid, RentalDetailsAndroid rentalDetailsAndroid, DiscountOfferType type, ValidTimeWindowAndroid validTimeWindowAndroid) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DiscountOffer(currency, discountAmountMicrosAndroid, displayPrice, formattedDiscountAmountAndroid, fullPriceMicrosAndroid, id, limitedQuantityInfoAndroid, offerTagsAndroid, offerTokenAndroid, percentageDiscountAndroid, preorderDetailsAndroid, price, purchaseOptionIdAndroid, rentalDetailsAndroid, type, validTimeWindowAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountOffer)) {
            return false;
        }
        DiscountOffer discountOffer = (DiscountOffer) other;
        return Intrinsics.areEqual(this.currency, discountOffer.currency) && Intrinsics.areEqual(this.discountAmountMicrosAndroid, discountOffer.discountAmountMicrosAndroid) && Intrinsics.areEqual(this.displayPrice, discountOffer.displayPrice) && Intrinsics.areEqual(this.formattedDiscountAmountAndroid, discountOffer.formattedDiscountAmountAndroid) && Intrinsics.areEqual(this.fullPriceMicrosAndroid, discountOffer.fullPriceMicrosAndroid) && Intrinsics.areEqual(this.id, discountOffer.id) && Intrinsics.areEqual(this.limitedQuantityInfoAndroid, discountOffer.limitedQuantityInfoAndroid) && Intrinsics.areEqual(this.offerTagsAndroid, discountOffer.offerTagsAndroid) && Intrinsics.areEqual(this.offerTokenAndroid, discountOffer.offerTokenAndroid) && Intrinsics.areEqual(this.percentageDiscountAndroid, discountOffer.percentageDiscountAndroid) && Intrinsics.areEqual(this.preorderDetailsAndroid, discountOffer.preorderDetailsAndroid) && Double.compare(this.price, discountOffer.price) == 0 && Intrinsics.areEqual(this.purchaseOptionIdAndroid, discountOffer.purchaseOptionIdAndroid) && Intrinsics.areEqual(this.rentalDetailsAndroid, discountOffer.rentalDetailsAndroid) && this.type == discountOffer.type && Intrinsics.areEqual(this.validTimeWindowAndroid, discountOffer.validTimeWindowAndroid);
    }

    public int hashCode() {
        int hashCode = this.currency.hashCode() * 31;
        String str = this.discountAmountMicrosAndroid;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.displayPrice.hashCode()) * 31;
        String str2 = this.formattedDiscountAmountAndroid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullPriceMicrosAndroid;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = this.limitedQuantityInfoAndroid;
        int hashCode6 = (hashCode5 + (limitedQuantityInfoAndroid == null ? 0 : limitedQuantityInfoAndroid.hashCode())) * 31;
        List<String> list = this.offerTagsAndroid;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.offerTokenAndroid;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.percentageDiscountAndroid;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        PreorderDetailsAndroid preorderDetailsAndroid = this.preorderDetailsAndroid;
        int hashCode10 = (((hashCode9 + (preorderDetailsAndroid == null ? 0 : preorderDetailsAndroid.hashCode())) * 31) + Double.hashCode(this.price)) * 31;
        String str6 = this.purchaseOptionIdAndroid;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        RentalDetailsAndroid rentalDetailsAndroid = this.rentalDetailsAndroid;
        int hashCode12 = (((hashCode11 + (rentalDetailsAndroid == null ? 0 : rentalDetailsAndroid.hashCode())) * 31) + this.type.hashCode()) * 31;
        ValidTimeWindowAndroid validTimeWindowAndroid = this.validTimeWindowAndroid;
        return hashCode12 + (validTimeWindowAndroid != null ? validTimeWindowAndroid.hashCode() : 0);
    }

    public String toString() {
        return "DiscountOffer(currency=" + this.currency + ", discountAmountMicrosAndroid=" + this.discountAmountMicrosAndroid + ", displayPrice=" + this.displayPrice + ", formattedDiscountAmountAndroid=" + this.formattedDiscountAmountAndroid + ", fullPriceMicrosAndroid=" + this.fullPriceMicrosAndroid + ", id=" + this.id + ", limitedQuantityInfoAndroid=" + this.limitedQuantityInfoAndroid + ", offerTagsAndroid=" + this.offerTagsAndroid + ", offerTokenAndroid=" + this.offerTokenAndroid + ", percentageDiscountAndroid=" + this.percentageDiscountAndroid + ", preorderDetailsAndroid=" + this.preorderDetailsAndroid + ", price=" + this.price + ", purchaseOptionIdAndroid=" + this.purchaseOptionIdAndroid + ", rentalDetailsAndroid=" + this.rentalDetailsAndroid + ", type=" + this.type + ", validTimeWindowAndroid=" + this.validTimeWindowAndroid + ")";
    }

    public DiscountOffer(String currency, String str, String displayPrice, String str2, String str3, String str4, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, List<String> list, String str5, Integer num, PreorderDetailsAndroid preorderDetailsAndroid, double d, String str6, RentalDetailsAndroid rentalDetailsAndroid, DiscountOfferType type, ValidTimeWindowAndroid validTimeWindowAndroid) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(type, "type");
        this.currency = currency;
        this.discountAmountMicrosAndroid = str;
        this.displayPrice = displayPrice;
        this.formattedDiscountAmountAndroid = str2;
        this.fullPriceMicrosAndroid = str3;
        this.id = str4;
        this.limitedQuantityInfoAndroid = limitedQuantityInfoAndroid;
        this.offerTagsAndroid = list;
        this.offerTokenAndroid = str5;
        this.percentageDiscountAndroid = num;
        this.preorderDetailsAndroid = preorderDetailsAndroid;
        this.price = d;
        this.purchaseOptionIdAndroid = str6;
        this.rentalDetailsAndroid = rentalDetailsAndroid;
        this.type = type;
        this.validTimeWindowAndroid = validTimeWindowAndroid;
    }

    public /* synthetic */ DiscountOffer(String str, String str2, String str3, String str4, String str5, String str6, LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, List list, String str7, Integer num, PreorderDetailsAndroid preorderDetailsAndroid, double d, String str8, RentalDetailsAndroid rentalDetailsAndroid, DiscountOfferType discountOfferType, ValidTimeWindowAndroid validTimeWindowAndroid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : limitedQuantityInfoAndroid, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : preorderDetailsAndroid, d, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : rentalDetailsAndroid, discountOfferType, (i & 32768) != 0 ? null : validTimeWindowAndroid);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDiscountAmountMicrosAndroid() {
        return this.discountAmountMicrosAndroid;
    }

    public final String getDisplayPrice() {
        return this.displayPrice;
    }

    public final String getFormattedDiscountAmountAndroid() {
        return this.formattedDiscountAmountAndroid;
    }

    public final String getFullPriceMicrosAndroid() {
        return this.fullPriceMicrosAndroid;
    }

    public final String getId() {
        return this.id;
    }

    public final LimitedQuantityInfoAndroid getLimitedQuantityInfoAndroid() {
        return this.limitedQuantityInfoAndroid;
    }

    public final List<String> getOfferTagsAndroid() {
        return this.offerTagsAndroid;
    }

    public final String getOfferTokenAndroid() {
        return this.offerTokenAndroid;
    }

    public final Integer getPercentageDiscountAndroid() {
        return this.percentageDiscountAndroid;
    }

    public final PreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getPurchaseOptionIdAndroid() {
        return this.purchaseOptionIdAndroid;
    }

    public final RentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    public final DiscountOfferType getType() {
        return this.type;
    }

    public final ValidTimeWindowAndroid getValidTimeWindowAndroid() {
        return this.validTimeWindowAndroid;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/DiscountOffer$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DiscountOffer;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiscountOffer fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            DiscountOfferType discountOfferType;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("currency");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("discountAmountMicrosAndroid");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = json.get("displayPrice");
            String str4 = obj3 instanceof String ? (String) obj3 : null;
            String str5 = str4 == null ? "" : str4;
            Object obj4 = json.get("formattedDiscountAmountAndroid");
            String str6 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("fullPriceMicrosAndroid");
            String str7 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("id");
            String str8 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = json.get("limitedQuantityInfoAndroid");
            Map<String, ? extends Object> map = obj7 instanceof Map ? (Map) obj7 : null;
            LimitedQuantityInfoAndroid fromJson = map != null ? LimitedQuantityInfoAndroid.INSTANCE.fromJson(map) : null;
            Object obj8 = json.get("offerTagsAndroid");
            List list = obj8 instanceof List ? (List) obj8 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj9 : list) {
                    String str9 = obj9 instanceof String ? (String) obj9 : null;
                    if (str9 != null) {
                        arrayList2.add(str9);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Object obj10 = json.get("offerTokenAndroid");
            String str10 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = json.get("percentageDiscountAndroid");
            Number number = obj11 instanceof Number ? (Number) obj11 : null;
            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            Object obj12 = json.get("preorderDetailsAndroid");
            Map<String, ? extends Object> map2 = obj12 instanceof Map ? (Map) obj12 : null;
            PreorderDetailsAndroid fromJson2 = map2 != null ? PreorderDetailsAndroid.INSTANCE.fromJson(map2) : null;
            Object obj13 = json.get("price");
            Number number2 = obj13 instanceof Number ? (Number) obj13 : null;
            double doubleValue = number2 != null ? number2.doubleValue() : 0.0d;
            Object obj14 = json.get("purchaseOptionIdAndroid");
            String str11 = obj14 instanceof String ? (String) obj14 : null;
            Object obj15 = json.get("rentalDetailsAndroid");
            Map<String, ? extends Object> map3 = obj15 instanceof Map ? (Map) obj15 : null;
            RentalDetailsAndroid fromJson3 = map3 != null ? RentalDetailsAndroid.INSTANCE.fromJson(map3) : null;
            Object obj16 = json.get(WebViewManager.EVENT_TYPE_KEY);
            String str12 = obj16 instanceof String ? (String) obj16 : null;
            if (str12 == null || (discountOfferType = DiscountOfferType.INSTANCE.fromJson(str12)) == null) {
                discountOfferType = DiscountOfferType.Introductory;
            }
            DiscountOfferType discountOfferType2 = discountOfferType;
            Object obj17 = json.get("validTimeWindowAndroid");
            Map<String, ? extends Object> map4 = obj17 instanceof Map ? (Map) obj17 : null;
            return new DiscountOffer(str2, str3, str5, str6, str7, str8, fromJson, arrayList, str10, valueOf, fromJson2, doubleValue, str11, fromJson3, discountOfferType2, map4 != null ? ValidTimeWindowAndroid.INSTANCE.fromJson(map4) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[17];
        pairArr[0] = TuplesKt.to("__typename", "DiscountOffer");
        pairArr[1] = TuplesKt.to("currency", this.currency);
        pairArr[2] = TuplesKt.to("discountAmountMicrosAndroid", this.discountAmountMicrosAndroid);
        pairArr[3] = TuplesKt.to("displayPrice", this.displayPrice);
        pairArr[4] = TuplesKt.to("formattedDiscountAmountAndroid", this.formattedDiscountAmountAndroid);
        pairArr[5] = TuplesKt.to("fullPriceMicrosAndroid", this.fullPriceMicrosAndroid);
        pairArr[6] = TuplesKt.to("id", this.id);
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = this.limitedQuantityInfoAndroid;
        pairArr[7] = TuplesKt.to("limitedQuantityInfoAndroid", limitedQuantityInfoAndroid != null ? limitedQuantityInfoAndroid.toJson() : null);
        pairArr[8] = TuplesKt.to("offerTagsAndroid", this.offerTagsAndroid);
        pairArr[9] = TuplesKt.to("offerTokenAndroid", this.offerTokenAndroid);
        pairArr[10] = TuplesKt.to("percentageDiscountAndroid", this.percentageDiscountAndroid);
        PreorderDetailsAndroid preorderDetailsAndroid = this.preorderDetailsAndroid;
        pairArr[11] = TuplesKt.to("preorderDetailsAndroid", preorderDetailsAndroid != null ? preorderDetailsAndroid.toJson() : null);
        pairArr[12] = TuplesKt.to("price", Double.valueOf(this.price));
        pairArr[13] = TuplesKt.to("purchaseOptionIdAndroid", this.purchaseOptionIdAndroid);
        RentalDetailsAndroid rentalDetailsAndroid = this.rentalDetailsAndroid;
        pairArr[14] = TuplesKt.to("rentalDetailsAndroid", rentalDetailsAndroid != null ? rentalDetailsAndroid.toJson() : null);
        pairArr[15] = TuplesKt.to(WebViewManager.EVENT_TYPE_KEY, this.type.toJson());
        ValidTimeWindowAndroid validTimeWindowAndroid = this.validTimeWindowAndroid;
        pairArr[16] = TuplesKt.to("validTimeWindowAndroid", validTimeWindowAndroid != null ? validTimeWindowAndroid.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
