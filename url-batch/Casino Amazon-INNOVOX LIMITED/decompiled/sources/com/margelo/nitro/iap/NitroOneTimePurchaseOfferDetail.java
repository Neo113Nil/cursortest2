package com.margelo.nitro.iap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroOneTimePurchaseOfferDetail.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001AB{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003¢\u0006\u0002\u0010\"J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u009a\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006B"}, d2 = {"Lcom/margelo/nitro/iap/NitroOneTimePurchaseOfferDetail;", "", "discountDisplayInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;", "formattedPrice", "", "fullPriceMicros", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "limitedQuantityInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;", "offerId", "offerTags", "", "offerToken", "preorderDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;", "priceAmountMicros", "priceCurrencyCode", "rentalDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;", "validTimeWindow", "Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;Lcom/margelo/nitro/iap/Variant_NullType_String;[Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;)V", "getDiscountDisplayInfo", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;", "getFormattedPrice", "()Ljava/lang/String;", "getFullPriceMicros", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getLimitedQuantityInfo", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;", "getOfferId", "getOfferTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getOfferToken", "getPreorderDetailsAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;", "getPriceAmountMicros", "getPriceCurrencyCode", "getRentalDetailsAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;", "getValidTimeWindow", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;Lcom/margelo/nitro/iap/Variant_NullType_String;[Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;)Lcom/margelo/nitro/iap/NitroOneTimePurchaseOfferDetail;", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroOneTimePurchaseOfferDetail {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroDiscountDisplayInfoAndroid discountDisplayInfo;
    private final String formattedPrice;
    private final Variant_NullType_String fullPriceMicros;
    private final Variant_NullType_NitroLimitedQuantityInfoAndroid limitedQuantityInfo;
    private final Variant_NullType_String offerId;
    private final String[] offerTags;
    private final String offerToken;
    private final Variant_NullType_NitroPreorderDetailsAndroid preorderDetailsAndroid;
    private final String priceAmountMicros;
    private final String priceCurrencyCode;
    private final Variant_NullType_NitroRentalDetailsAndroid rentalDetailsAndroid;
    private final Variant_NullType_NitroValidTimeWindowAndroid validTimeWindow;

    public static /* synthetic */ NitroOneTimePurchaseOfferDetail copy$default(NitroOneTimePurchaseOfferDetail nitroOneTimePurchaseOfferDetail, Variant_NullType_NitroDiscountDisplayInfoAndroid variant_NullType_NitroDiscountDisplayInfoAndroid, String str, Variant_NullType_String variant_NullType_String, Variant_NullType_NitroLimitedQuantityInfoAndroid variant_NullType_NitroLimitedQuantityInfoAndroid, Variant_NullType_String variant_NullType_String2, String[] strArr, String str2, Variant_NullType_NitroPreorderDetailsAndroid variant_NullType_NitroPreorderDetailsAndroid, String str3, String str4, Variant_NullType_NitroRentalDetailsAndroid variant_NullType_NitroRentalDetailsAndroid, Variant_NullType_NitroValidTimeWindowAndroid variant_NullType_NitroValidTimeWindowAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroDiscountDisplayInfoAndroid = nitroOneTimePurchaseOfferDetail.discountDisplayInfo;
        }
        if ((i & 2) != 0) {
            str = nitroOneTimePurchaseOfferDetail.formattedPrice;
        }
        if ((i & 4) != 0) {
            variant_NullType_String = nitroOneTimePurchaseOfferDetail.fullPriceMicros;
        }
        if ((i & 8) != 0) {
            variant_NullType_NitroLimitedQuantityInfoAndroid = nitroOneTimePurchaseOfferDetail.limitedQuantityInfo;
        }
        if ((i & 16) != 0) {
            variant_NullType_String2 = nitroOneTimePurchaseOfferDetail.offerId;
        }
        if ((i & 32) != 0) {
            strArr = nitroOneTimePurchaseOfferDetail.offerTags;
        }
        if ((i & 64) != 0) {
            str2 = nitroOneTimePurchaseOfferDetail.offerToken;
        }
        if ((i & 128) != 0) {
            variant_NullType_NitroPreorderDetailsAndroid = nitroOneTimePurchaseOfferDetail.preorderDetailsAndroid;
        }
        if ((i & 256) != 0) {
            str3 = nitroOneTimePurchaseOfferDetail.priceAmountMicros;
        }
        if ((i & 512) != 0) {
            str4 = nitroOneTimePurchaseOfferDetail.priceCurrencyCode;
        }
        if ((i & 1024) != 0) {
            variant_NullType_NitroRentalDetailsAndroid = nitroOneTimePurchaseOfferDetail.rentalDetailsAndroid;
        }
        if ((i & 2048) != 0) {
            variant_NullType_NitroValidTimeWindowAndroid = nitroOneTimePurchaseOfferDetail.validTimeWindow;
        }
        Variant_NullType_NitroRentalDetailsAndroid variant_NullType_NitroRentalDetailsAndroid2 = variant_NullType_NitroRentalDetailsAndroid;
        Variant_NullType_NitroValidTimeWindowAndroid variant_NullType_NitroValidTimeWindowAndroid2 = variant_NullType_NitroValidTimeWindowAndroid;
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        Variant_NullType_NitroPreorderDetailsAndroid variant_NullType_NitroPreorderDetailsAndroid2 = variant_NullType_NitroPreorderDetailsAndroid;
        Variant_NullType_String variant_NullType_String3 = variant_NullType_String2;
        String[] strArr2 = strArr;
        return nitroOneTimePurchaseOfferDetail.copy(variant_NullType_NitroDiscountDisplayInfoAndroid, str, variant_NullType_String, variant_NullType_NitroLimitedQuantityInfoAndroid, variant_NullType_String3, strArr2, str7, variant_NullType_NitroPreorderDetailsAndroid2, str5, str6, variant_NullType_NitroRentalDetailsAndroid2, variant_NullType_NitroValidTimeWindowAndroid2);
    }

    @JvmStatic
    private static final NitroOneTimePurchaseOfferDetail fromCpp(Variant_NullType_NitroDiscountDisplayInfoAndroid variant_NullType_NitroDiscountDisplayInfoAndroid, String str, Variant_NullType_String variant_NullType_String, Variant_NullType_NitroLimitedQuantityInfoAndroid variant_NullType_NitroLimitedQuantityInfoAndroid, Variant_NullType_String variant_NullType_String2, String[] strArr, String str2, Variant_NullType_NitroPreorderDetailsAndroid variant_NullType_NitroPreorderDetailsAndroid, String str3, String str4, Variant_NullType_NitroRentalDetailsAndroid variant_NullType_NitroRentalDetailsAndroid, Variant_NullType_NitroValidTimeWindowAndroid variant_NullType_NitroValidTimeWindowAndroid) {
        return INSTANCE.fromCpp(variant_NullType_NitroDiscountDisplayInfoAndroid, str, variant_NullType_String, variant_NullType_NitroLimitedQuantityInfoAndroid, variant_NullType_String2, strArr, str2, variant_NullType_NitroPreorderDetailsAndroid, str3, str4, variant_NullType_NitroRentalDetailsAndroid, variant_NullType_NitroValidTimeWindowAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroDiscountDisplayInfoAndroid getDiscountDisplayInfo() {
        return this.discountDisplayInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* renamed from: component11, reason: from getter */
    public final Variant_NullType_NitroRentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    /* renamed from: component12, reason: from getter */
    public final Variant_NullType_NitroValidTimeWindowAndroid getValidTimeWindow() {
        return this.validTimeWindow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getFullPriceMicros() {
        return this.fullPriceMicros;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_NitroLimitedQuantityInfoAndroid getLimitedQuantityInfo() {
        return this.limitedQuantityInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component6, reason: from getter */
    public final String[] getOfferTags() {
        return this.offerTags;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_NitroPreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final NitroOneTimePurchaseOfferDetail copy(Variant_NullType_NitroDiscountDisplayInfoAndroid discountDisplayInfo, String formattedPrice, Variant_NullType_String fullPriceMicros, Variant_NullType_NitroLimitedQuantityInfoAndroid limitedQuantityInfo, Variant_NullType_String offerId, String[] offerTags, String offerToken, Variant_NullType_NitroPreorderDetailsAndroid preorderDetailsAndroid, String priceAmountMicros, String priceCurrencyCode, Variant_NullType_NitroRentalDetailsAndroid rentalDetailsAndroid, Variant_NullType_NitroValidTimeWindowAndroid validTimeWindow) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new NitroOneTimePurchaseOfferDetail(discountDisplayInfo, formattedPrice, fullPriceMicros, limitedQuantityInfo, offerId, offerTags, offerToken, preorderDetailsAndroid, priceAmountMicros, priceCurrencyCode, rentalDetailsAndroid, validTimeWindow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroOneTimePurchaseOfferDetail)) {
            return false;
        }
        NitroOneTimePurchaseOfferDetail nitroOneTimePurchaseOfferDetail = (NitroOneTimePurchaseOfferDetail) other;
        return Intrinsics.areEqual(this.discountDisplayInfo, nitroOneTimePurchaseOfferDetail.discountDisplayInfo) && Intrinsics.areEqual(this.formattedPrice, nitroOneTimePurchaseOfferDetail.formattedPrice) && Intrinsics.areEqual(this.fullPriceMicros, nitroOneTimePurchaseOfferDetail.fullPriceMicros) && Intrinsics.areEqual(this.limitedQuantityInfo, nitroOneTimePurchaseOfferDetail.limitedQuantityInfo) && Intrinsics.areEqual(this.offerId, nitroOneTimePurchaseOfferDetail.offerId) && Intrinsics.areEqual(this.offerTags, nitroOneTimePurchaseOfferDetail.offerTags) && Intrinsics.areEqual(this.offerToken, nitroOneTimePurchaseOfferDetail.offerToken) && Intrinsics.areEqual(this.preorderDetailsAndroid, nitroOneTimePurchaseOfferDetail.preorderDetailsAndroid) && Intrinsics.areEqual(this.priceAmountMicros, nitroOneTimePurchaseOfferDetail.priceAmountMicros) && Intrinsics.areEqual(this.priceCurrencyCode, nitroOneTimePurchaseOfferDetail.priceCurrencyCode) && Intrinsics.areEqual(this.rentalDetailsAndroid, nitroOneTimePurchaseOfferDetail.rentalDetailsAndroid) && Intrinsics.areEqual(this.validTimeWindow, nitroOneTimePurchaseOfferDetail.validTimeWindow);
    }

    public int hashCode() {
        Variant_NullType_NitroDiscountDisplayInfoAndroid variant_NullType_NitroDiscountDisplayInfoAndroid = this.discountDisplayInfo;
        int hashCode = (((variant_NullType_NitroDiscountDisplayInfoAndroid == null ? 0 : variant_NullType_NitroDiscountDisplayInfoAndroid.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String = this.fullPriceMicros;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_NitroLimitedQuantityInfoAndroid variant_NullType_NitroLimitedQuantityInfoAndroid = this.limitedQuantityInfo;
        int hashCode3 = (hashCode2 + (variant_NullType_NitroLimitedQuantityInfoAndroid == null ? 0 : variant_NullType_NitroLimitedQuantityInfoAndroid.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.offerId;
        int hashCode4 = (((((hashCode3 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31) + Arrays.hashCode(this.offerTags)) * 31) + this.offerToken.hashCode()) * 31;
        Variant_NullType_NitroPreorderDetailsAndroid variant_NullType_NitroPreorderDetailsAndroid = this.preorderDetailsAndroid;
        int hashCode5 = (((((hashCode4 + (variant_NullType_NitroPreorderDetailsAndroid == null ? 0 : variant_NullType_NitroPreorderDetailsAndroid.hashCode())) * 31) + this.priceAmountMicros.hashCode()) * 31) + this.priceCurrencyCode.hashCode()) * 31;
        Variant_NullType_NitroRentalDetailsAndroid variant_NullType_NitroRentalDetailsAndroid = this.rentalDetailsAndroid;
        int hashCode6 = (hashCode5 + (variant_NullType_NitroRentalDetailsAndroid == null ? 0 : variant_NullType_NitroRentalDetailsAndroid.hashCode())) * 31;
        Variant_NullType_NitroValidTimeWindowAndroid variant_NullType_NitroValidTimeWindowAndroid = this.validTimeWindow;
        return hashCode6 + (variant_NullType_NitroValidTimeWindowAndroid != null ? variant_NullType_NitroValidTimeWindowAndroid.hashCode() : 0);
    }

    public String toString() {
        return "NitroOneTimePurchaseOfferDetail(discountDisplayInfo=" + this.discountDisplayInfo + ", formattedPrice=" + this.formattedPrice + ", fullPriceMicros=" + this.fullPriceMicros + ", limitedQuantityInfo=" + this.limitedQuantityInfo + ", offerId=" + this.offerId + ", offerTags=" + Arrays.toString(this.offerTags) + ", offerToken=" + this.offerToken + ", preorderDetailsAndroid=" + this.preorderDetailsAndroid + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", rentalDetailsAndroid=" + this.rentalDetailsAndroid + ", validTimeWindow=" + this.validTimeWindow + ")";
    }

    public NitroOneTimePurchaseOfferDetail(Variant_NullType_NitroDiscountDisplayInfoAndroid variant_NullType_NitroDiscountDisplayInfoAndroid, String formattedPrice, Variant_NullType_String variant_NullType_String, Variant_NullType_NitroLimitedQuantityInfoAndroid variant_NullType_NitroLimitedQuantityInfoAndroid, Variant_NullType_String variant_NullType_String2, String[] offerTags, String offerToken, Variant_NullType_NitroPreorderDetailsAndroid variant_NullType_NitroPreorderDetailsAndroid, String priceAmountMicros, String priceCurrencyCode, Variant_NullType_NitroRentalDetailsAndroid variant_NullType_NitroRentalDetailsAndroid, Variant_NullType_NitroValidTimeWindowAndroid variant_NullType_NitroValidTimeWindowAndroid) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.discountDisplayInfo = variant_NullType_NitroDiscountDisplayInfoAndroid;
        this.formattedPrice = formattedPrice;
        this.fullPriceMicros = variant_NullType_String;
        this.limitedQuantityInfo = variant_NullType_NitroLimitedQuantityInfoAndroid;
        this.offerId = variant_NullType_String2;
        this.offerTags = offerTags;
        this.offerToken = offerToken;
        this.preorderDetailsAndroid = variant_NullType_NitroPreorderDetailsAndroid;
        this.priceAmountMicros = priceAmountMicros;
        this.priceCurrencyCode = priceCurrencyCode;
        this.rentalDetailsAndroid = variant_NullType_NitroRentalDetailsAndroid;
        this.validTimeWindow = variant_NullType_NitroValidTimeWindowAndroid;
    }

    public final Variant_NullType_NitroDiscountDisplayInfoAndroid getDiscountDisplayInfo() {
        return this.discountDisplayInfo;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final Variant_NullType_String getFullPriceMicros() {
        return this.fullPriceMicros;
    }

    public final Variant_NullType_NitroLimitedQuantityInfoAndroid getLimitedQuantityInfo() {
        return this.limitedQuantityInfo;
    }

    public final Variant_NullType_String getOfferId() {
        return this.offerId;
    }

    public final String[] getOfferTags() {
        return this.offerTags;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final Variant_NullType_NitroPreorderDetailsAndroid getPreorderDetailsAndroid() {
        return this.preorderDetailsAndroid;
    }

    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final Variant_NullType_NitroRentalDetailsAndroid getRentalDetailsAndroid() {
        return this.rentalDetailsAndroid;
    }

    public final Variant_NullType_NitroValidTimeWindowAndroid getValidTimeWindow() {
        return this.validTimeWindow;
    }

    /* compiled from: NitroOneTimePurchaseOfferDetail.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/margelo/nitro/iap/NitroOneTimePurchaseOfferDetail$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroOneTimePurchaseOfferDetail;", "discountDisplayInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;", "formattedPrice", "", "fullPriceMicros", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "limitedQuantityInfo", "Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;", "offerId", "offerTags", "", "offerToken", "preorderDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;", "priceAmountMicros", "priceCurrencyCode", "rentalDetailsAndroid", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;", "validTimeWindow", "Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroDiscountDisplayInfoAndroid;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_NitroLimitedQuantityInfoAndroid;Lcom/margelo/nitro/iap/Variant_NullType_String;[Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroPreorderDetailsAndroid;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroRentalDetailsAndroid;Lcom/margelo/nitro/iap/Variant_NullType_NitroValidTimeWindowAndroid;)Lcom/margelo/nitro/iap/NitroOneTimePurchaseOfferDetail;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroOneTimePurchaseOfferDetail fromCpp(Variant_NullType_NitroDiscountDisplayInfoAndroid discountDisplayInfo, String formattedPrice, Variant_NullType_String fullPriceMicros, Variant_NullType_NitroLimitedQuantityInfoAndroid limitedQuantityInfo, Variant_NullType_String offerId, String[] offerTags, String offerToken, Variant_NullType_NitroPreorderDetailsAndroid preorderDetailsAndroid, String priceAmountMicros, String priceCurrencyCode, Variant_NullType_NitroRentalDetailsAndroid rentalDetailsAndroid, Variant_NullType_NitroValidTimeWindowAndroid validTimeWindow) {
            return new NitroOneTimePurchaseOfferDetail(discountDisplayInfo, formattedPrice, fullPriceMicros, limitedQuantityInfo, offerId, offerTags, offerToken, preorderDetailsAndroid, priceAmountMicros, priceCurrencyCode, rentalDetailsAndroid, validTimeWindow);
        }
    }
}
