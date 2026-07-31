package com.margelo.nitro.iap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroRequestPurchaseAndroid.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J~\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lcom/margelo/nitro/iap/NitroRequestPurchaseAndroid;", "", "skus", "", "", "obfuscatedAccountId", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "obfuscatedProfileId", "isOfferPersonalized", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerToken", "subscriptionOffers", "Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;", "replacementMode", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "purchaseToken", "subscriptionProductReplacementParams", "Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;", "<init>", "([Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;)V", "getSkus", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getObfuscatedAccountId", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getObfuscatedProfileId", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getOfferToken", "getSubscriptionOffers", "()Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;", "getReplacementMode", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getPurchaseToken", "getSubscriptionProductReplacementParams", "()Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "([Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;)Lcom/margelo/nitro/iap/NitroRequestPurchaseAndroid;", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroRequestPurchaseAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean isOfferPersonalized;
    private final Variant_NullType_String obfuscatedAccountId;
    private final Variant_NullType_String obfuscatedProfileId;
    private final Variant_NullType_String offerToken;
    private final Variant_NullType_String purchaseToken;
    private final Variant_NullType_Double replacementMode;
    private final String[] skus;
    private final Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers;
    private final Variant_NullType_SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams;

    public static /* synthetic */ NitroRequestPurchaseAndroid copy$default(NitroRequestPurchaseAndroid nitroRequestPurchaseAndroid, String[] strArr, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_Array_AndroidSubscriptionOfferInput_ variant_NullType_Array_AndroidSubscriptionOfferInput_, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String4, Variant_NullType_SubscriptionProductReplacementParamsAndroid variant_NullType_SubscriptionProductReplacementParamsAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = nitroRequestPurchaseAndroid.skus;
        }
        if ((i & 2) != 0) {
            variant_NullType_String = nitroRequestPurchaseAndroid.obfuscatedAccountId;
        }
        if ((i & 4) != 0) {
            variant_NullType_String2 = nitroRequestPurchaseAndroid.obfuscatedProfileId;
        }
        if ((i & 8) != 0) {
            variant_NullType_Boolean = nitroRequestPurchaseAndroid.isOfferPersonalized;
        }
        if ((i & 16) != 0) {
            variant_NullType_String3 = nitroRequestPurchaseAndroid.offerToken;
        }
        if ((i & 32) != 0) {
            variant_NullType_Array_AndroidSubscriptionOfferInput_ = nitroRequestPurchaseAndroid.subscriptionOffers;
        }
        if ((i & 64) != 0) {
            variant_NullType_Double = nitroRequestPurchaseAndroid.replacementMode;
        }
        if ((i & 128) != 0) {
            variant_NullType_String4 = nitroRequestPurchaseAndroid.purchaseToken;
        }
        if ((i & 256) != 0) {
            variant_NullType_SubscriptionProductReplacementParamsAndroid = nitroRequestPurchaseAndroid.subscriptionProductReplacementParams;
        }
        Variant_NullType_String variant_NullType_String5 = variant_NullType_String4;
        Variant_NullType_SubscriptionProductReplacementParamsAndroid variant_NullType_SubscriptionProductReplacementParamsAndroid2 = variant_NullType_SubscriptionProductReplacementParamsAndroid;
        Variant_NullType_Array_AndroidSubscriptionOfferInput_ variant_NullType_Array_AndroidSubscriptionOfferInput_2 = variant_NullType_Array_AndroidSubscriptionOfferInput_;
        Variant_NullType_Double variant_NullType_Double2 = variant_NullType_Double;
        Variant_NullType_String variant_NullType_String6 = variant_NullType_String3;
        Variant_NullType_String variant_NullType_String7 = variant_NullType_String2;
        return nitroRequestPurchaseAndroid.copy(strArr, variant_NullType_String, variant_NullType_String7, variant_NullType_Boolean, variant_NullType_String6, variant_NullType_Array_AndroidSubscriptionOfferInput_2, variant_NullType_Double2, variant_NullType_String5, variant_NullType_SubscriptionProductReplacementParamsAndroid2);
    }

    @JvmStatic
    private static final NitroRequestPurchaseAndroid fromCpp(String[] strArr, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_Array_AndroidSubscriptionOfferInput_ variant_NullType_Array_AndroidSubscriptionOfferInput_, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String4, Variant_NullType_SubscriptionProductReplacementParamsAndroid variant_NullType_SubscriptionProductReplacementParamsAndroid) {
        return INSTANCE.fromCpp(strArr, variant_NullType_String, variant_NullType_String2, variant_NullType_Boolean, variant_NullType_String3, variant_NullType_Array_AndroidSubscriptionOfferInput_, variant_NullType_Double, variant_NullType_String4, variant_NullType_SubscriptionProductReplacementParamsAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getSkus() {
        return this.skus;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Boolean getIsOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_Array_AndroidSubscriptionOfferInput_ getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_Double getReplacementMode() {
        return this.replacementMode;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    public final NitroRequestPurchaseAndroid copy(String[] skus, Variant_NullType_String obfuscatedAccountId, Variant_NullType_String obfuscatedProfileId, Variant_NullType_Boolean isOfferPersonalized, Variant_NullType_String offerToken, Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers, Variant_NullType_Double replacementMode, Variant_NullType_String purchaseToken, Variant_NullType_SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new NitroRequestPurchaseAndroid(skus, obfuscatedAccountId, obfuscatedProfileId, isOfferPersonalized, offerToken, subscriptionOffers, replacementMode, purchaseToken, subscriptionProductReplacementParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroRequestPurchaseAndroid)) {
            return false;
        }
        NitroRequestPurchaseAndroid nitroRequestPurchaseAndroid = (NitroRequestPurchaseAndroid) other;
        return Intrinsics.areEqual(this.skus, nitroRequestPurchaseAndroid.skus) && Intrinsics.areEqual(this.obfuscatedAccountId, nitroRequestPurchaseAndroid.obfuscatedAccountId) && Intrinsics.areEqual(this.obfuscatedProfileId, nitroRequestPurchaseAndroid.obfuscatedProfileId) && Intrinsics.areEqual(this.isOfferPersonalized, nitroRequestPurchaseAndroid.isOfferPersonalized) && Intrinsics.areEqual(this.offerToken, nitroRequestPurchaseAndroid.offerToken) && Intrinsics.areEqual(this.subscriptionOffers, nitroRequestPurchaseAndroid.subscriptionOffers) && Intrinsics.areEqual(this.replacementMode, nitroRequestPurchaseAndroid.replacementMode) && Intrinsics.areEqual(this.purchaseToken, nitroRequestPurchaseAndroid.purchaseToken) && Intrinsics.areEqual(this.subscriptionProductReplacementParams, nitroRequestPurchaseAndroid.subscriptionProductReplacementParams);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.skus) * 31;
        Variant_NullType_String variant_NullType_String = this.obfuscatedAccountId;
        int hashCode2 = (hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.obfuscatedProfileId;
        int hashCode3 = (hashCode2 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isOfferPersonalized;
        int hashCode4 = (hashCode3 + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String3 = this.offerToken;
        int hashCode5 = (hashCode4 + (variant_NullType_String3 == null ? 0 : variant_NullType_String3.hashCode())) * 31;
        Variant_NullType_Array_AndroidSubscriptionOfferInput_ variant_NullType_Array_AndroidSubscriptionOfferInput_ = this.subscriptionOffers;
        int hashCode6 = (hashCode5 + (variant_NullType_Array_AndroidSubscriptionOfferInput_ == null ? 0 : variant_NullType_Array_AndroidSubscriptionOfferInput_.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.replacementMode;
        int hashCode7 = (hashCode6 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String4 = this.purchaseToken;
        int hashCode8 = (hashCode7 + (variant_NullType_String4 == null ? 0 : variant_NullType_String4.hashCode())) * 31;
        Variant_NullType_SubscriptionProductReplacementParamsAndroid variant_NullType_SubscriptionProductReplacementParamsAndroid = this.subscriptionProductReplacementParams;
        return hashCode8 + (variant_NullType_SubscriptionProductReplacementParamsAndroid != null ? variant_NullType_SubscriptionProductReplacementParamsAndroid.hashCode() : 0);
    }

    public String toString() {
        return "NitroRequestPurchaseAndroid(skus=" + Arrays.toString(this.skus) + ", obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ", isOfferPersonalized=" + this.isOfferPersonalized + ", offerToken=" + this.offerToken + ", subscriptionOffers=" + this.subscriptionOffers + ", replacementMode=" + this.replacementMode + ", purchaseToken=" + this.purchaseToken + ", subscriptionProductReplacementParams=" + this.subscriptionProductReplacementParams + ")";
    }

    public NitroRequestPurchaseAndroid(String[] skus, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String3, Variant_NullType_Array_AndroidSubscriptionOfferInput_ variant_NullType_Array_AndroidSubscriptionOfferInput_, Variant_NullType_Double variant_NullType_Double, Variant_NullType_String variant_NullType_String4, Variant_NullType_SubscriptionProductReplacementParamsAndroid variant_NullType_SubscriptionProductReplacementParamsAndroid) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.skus = skus;
        this.obfuscatedAccountId = variant_NullType_String;
        this.obfuscatedProfileId = variant_NullType_String2;
        this.isOfferPersonalized = variant_NullType_Boolean;
        this.offerToken = variant_NullType_String3;
        this.subscriptionOffers = variant_NullType_Array_AndroidSubscriptionOfferInput_;
        this.replacementMode = variant_NullType_Double;
        this.purchaseToken = variant_NullType_String4;
        this.subscriptionProductReplacementParams = variant_NullType_SubscriptionProductReplacementParamsAndroid;
    }

    public final String[] getSkus() {
        return this.skus;
    }

    public final Variant_NullType_String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    public final Variant_NullType_String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final Variant_NullType_Boolean isOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    public final Variant_NullType_String getOfferToken() {
        return this.offerToken;
    }

    public final Variant_NullType_Array_AndroidSubscriptionOfferInput_ getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    public final Variant_NullType_Double getReplacementMode() {
        return this.replacementMode;
    }

    public final Variant_NullType_String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Variant_NullType_SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    /* compiled from: NitroRequestPurchaseAndroid.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroRequestPurchaseAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroRequestPurchaseAndroid;", "skus", "", "", "obfuscatedAccountId", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "obfuscatedProfileId", "isOfferPersonalized", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "offerToken", "subscriptionOffers", "Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;", "replacementMode", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "purchaseToken", "subscriptionProductReplacementParams", "Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;", "([Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Array_AndroidSubscriptionOfferInput_;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_SubscriptionProductReplacementParamsAndroid;)Lcom/margelo/nitro/iap/NitroRequestPurchaseAndroid;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroRequestPurchaseAndroid fromCpp(String[] skus, Variant_NullType_String obfuscatedAccountId, Variant_NullType_String obfuscatedProfileId, Variant_NullType_Boolean isOfferPersonalized, Variant_NullType_String offerToken, Variant_NullType_Array_AndroidSubscriptionOfferInput_ subscriptionOffers, Variant_NullType_Double replacementMode, Variant_NullType_String purchaseToken, Variant_NullType_SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams) {
            return new NitroRequestPurchaseAndroid(skus, obfuscatedAccountId, obfuscatedProfileId, isOfferPersonalized, offerToken, subscriptionOffers, replacementMode, purchaseToken, subscriptionProductReplacementParams);
        }
    }
}
