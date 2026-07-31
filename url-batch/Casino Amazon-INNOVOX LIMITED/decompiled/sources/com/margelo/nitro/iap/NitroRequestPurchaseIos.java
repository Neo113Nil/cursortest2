package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroRequestPurchaseIos.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Js\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/margelo/nitro/iap/NitroRequestPurchaseIos;", "", "sku", "", "andDangerouslyFinishTransactionAutomatically", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "appAccountToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "quantity", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "withOffer", "Lcom/margelo/nitro/iap/Variant_NullType_Map_String__String_;", "advancedCommerceData", "introductoryOfferEligibility", "promotionalOfferJWS", "Lcom/margelo/nitro/iap/Variant_NullType_PromotionalOfferJwsInputIOS;", "winBackOffer", "Lcom/margelo/nitro/iap/Variant_NullType_WinBackOfferInputIOS;", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Double;Lcom/margelo/nitro/iap/Variant_NullType_Map_String__String_;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_PromotionalOfferJwsInputIOS;Lcom/margelo/nitro/iap/Variant_NullType_WinBackOfferInputIOS;)V", "getSku", "()Ljava/lang/String;", "getAndDangerouslyFinishTransactionAutomatically", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getAppAccountToken", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getQuantity", "()Lcom/margelo/nitro/iap/Variant_NullType_Double;", "getWithOffer", "()Lcom/margelo/nitro/iap/Variant_NullType_Map_String__String_;", "getAdvancedCommerceData", "getIntroductoryOfferEligibility", "getPromotionalOfferJWS", "()Lcom/margelo/nitro/iap/Variant_NullType_PromotionalOfferJwsInputIOS;", "getWinBackOffer", "()Lcom/margelo/nitro/iap/Variant_NullType_WinBackOfferInputIOS;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroRequestPurchaseIos {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String advancedCommerceData;
    private final Variant_NullType_Boolean andDangerouslyFinishTransactionAutomatically;
    private final Variant_NullType_String appAccountToken;
    private final Variant_NullType_Boolean introductoryOfferEligibility;
    private final Variant_NullType_PromotionalOfferJwsInputIOS promotionalOfferJWS;
    private final Variant_NullType_Double quantity;
    private final String sku;
    private final Variant_NullType_WinBackOfferInputIOS winBackOffer;
    private final Variant_NullType_Map_String__String_ withOffer;

    public static /* synthetic */ NitroRequestPurchaseIos copy$default(NitroRequestPurchaseIos nitroRequestPurchaseIos, String str, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Map_String__String_ variant_NullType_Map_String__String_, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_PromotionalOfferJwsInputIOS variant_NullType_PromotionalOfferJwsInputIOS, Variant_NullType_WinBackOfferInputIOS variant_NullType_WinBackOfferInputIOS, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroRequestPurchaseIos.sku;
        }
        if ((i & 2) != 0) {
            variant_NullType_Boolean = nitroRequestPurchaseIos.andDangerouslyFinishTransactionAutomatically;
        }
        if ((i & 4) != 0) {
            variant_NullType_String = nitroRequestPurchaseIos.appAccountToken;
        }
        if ((i & 8) != 0) {
            variant_NullType_Double = nitroRequestPurchaseIos.quantity;
        }
        if ((i & 16) != 0) {
            variant_NullType_Map_String__String_ = nitroRequestPurchaseIos.withOffer;
        }
        if ((i & 32) != 0) {
            variant_NullType_String2 = nitroRequestPurchaseIos.advancedCommerceData;
        }
        if ((i & 64) != 0) {
            variant_NullType_Boolean2 = nitroRequestPurchaseIos.introductoryOfferEligibility;
        }
        if ((i & 128) != 0) {
            variant_NullType_PromotionalOfferJwsInputIOS = nitroRequestPurchaseIos.promotionalOfferJWS;
        }
        if ((i & 256) != 0) {
            variant_NullType_WinBackOfferInputIOS = nitroRequestPurchaseIos.winBackOffer;
        }
        Variant_NullType_PromotionalOfferJwsInputIOS variant_NullType_PromotionalOfferJwsInputIOS2 = variant_NullType_PromotionalOfferJwsInputIOS;
        Variant_NullType_WinBackOfferInputIOS variant_NullType_WinBackOfferInputIOS2 = variant_NullType_WinBackOfferInputIOS;
        Variant_NullType_String variant_NullType_String3 = variant_NullType_String2;
        Variant_NullType_Boolean variant_NullType_Boolean3 = variant_NullType_Boolean2;
        Variant_NullType_Map_String__String_ variant_NullType_Map_String__String_2 = variant_NullType_Map_String__String_;
        Variant_NullType_String variant_NullType_String4 = variant_NullType_String;
        return nitroRequestPurchaseIos.copy(str, variant_NullType_Boolean, variant_NullType_String4, variant_NullType_Double, variant_NullType_Map_String__String_2, variant_NullType_String3, variant_NullType_Boolean3, variant_NullType_PromotionalOfferJwsInputIOS2, variant_NullType_WinBackOfferInputIOS2);
    }

    @JvmStatic
    private static final NitroRequestPurchaseIos fromCpp(String str, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Map_String__String_ variant_NullType_Map_String__String_, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_PromotionalOfferJwsInputIOS variant_NullType_PromotionalOfferJwsInputIOS, Variant_NullType_WinBackOfferInputIOS variant_NullType_WinBackOfferInputIOS) {
        return INSTANCE.fromCpp(str, variant_NullType_Boolean, variant_NullType_String, variant_NullType_Double, variant_NullType_Map_String__String_, variant_NullType_String2, variant_NullType_Boolean2, variant_NullType_PromotionalOfferJwsInputIOS, variant_NullType_WinBackOfferInputIOS);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Boolean getAndDangerouslyFinishTransactionAutomatically() {
        return this.andDangerouslyFinishTransactionAutomatically;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_String getAppAccountToken() {
        return this.appAccountToken;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_Map_String__String_ getWithOffer() {
        return this.withOffer;
    }

    /* renamed from: component6, reason: from getter */
    public final Variant_NullType_String getAdvancedCommerceData() {
        return this.advancedCommerceData;
    }

    /* renamed from: component7, reason: from getter */
    public final Variant_NullType_Boolean getIntroductoryOfferEligibility() {
        return this.introductoryOfferEligibility;
    }

    /* renamed from: component8, reason: from getter */
    public final Variant_NullType_PromotionalOfferJwsInputIOS getPromotionalOfferJWS() {
        return this.promotionalOfferJWS;
    }

    /* renamed from: component9, reason: from getter */
    public final Variant_NullType_WinBackOfferInputIOS getWinBackOffer() {
        return this.winBackOffer;
    }

    public final NitroRequestPurchaseIos copy(String sku, Variant_NullType_Boolean andDangerouslyFinishTransactionAutomatically, Variant_NullType_String appAccountToken, Variant_NullType_Double quantity, Variant_NullType_Map_String__String_ withOffer, Variant_NullType_String advancedCommerceData, Variant_NullType_Boolean introductoryOfferEligibility, Variant_NullType_PromotionalOfferJwsInputIOS promotionalOfferJWS, Variant_NullType_WinBackOfferInputIOS winBackOffer) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new NitroRequestPurchaseIos(sku, andDangerouslyFinishTransactionAutomatically, appAccountToken, quantity, withOffer, advancedCommerceData, introductoryOfferEligibility, promotionalOfferJWS, winBackOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroRequestPurchaseIos)) {
            return false;
        }
        NitroRequestPurchaseIos nitroRequestPurchaseIos = (NitroRequestPurchaseIos) other;
        return Intrinsics.areEqual(this.sku, nitroRequestPurchaseIos.sku) && Intrinsics.areEqual(this.andDangerouslyFinishTransactionAutomatically, nitroRequestPurchaseIos.andDangerouslyFinishTransactionAutomatically) && Intrinsics.areEqual(this.appAccountToken, nitroRequestPurchaseIos.appAccountToken) && Intrinsics.areEqual(this.quantity, nitroRequestPurchaseIos.quantity) && Intrinsics.areEqual(this.withOffer, nitroRequestPurchaseIos.withOffer) && Intrinsics.areEqual(this.advancedCommerceData, nitroRequestPurchaseIos.advancedCommerceData) && Intrinsics.areEqual(this.introductoryOfferEligibility, nitroRequestPurchaseIos.introductoryOfferEligibility) && Intrinsics.areEqual(this.promotionalOfferJWS, nitroRequestPurchaseIos.promotionalOfferJWS) && Intrinsics.areEqual(this.winBackOffer, nitroRequestPurchaseIos.winBackOffer);
    }

    public int hashCode() {
        int hashCode = this.sku.hashCode() * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.andDangerouslyFinishTransactionAutomatically;
        int hashCode2 = (hashCode + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String = this.appAccountToken;
        int hashCode3 = (hashCode2 + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode())) * 31;
        Variant_NullType_Double variant_NullType_Double = this.quantity;
        int hashCode4 = (hashCode3 + (variant_NullType_Double == null ? 0 : variant_NullType_Double.hashCode())) * 31;
        Variant_NullType_Map_String__String_ variant_NullType_Map_String__String_ = this.withOffer;
        int hashCode5 = (hashCode4 + (variant_NullType_Map_String__String_ == null ? 0 : variant_NullType_Map_String__String_.hashCode())) * 31;
        Variant_NullType_String variant_NullType_String2 = this.advancedCommerceData;
        int hashCode6 = (hashCode5 + (variant_NullType_String2 == null ? 0 : variant_NullType_String2.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean2 = this.introductoryOfferEligibility;
        int hashCode7 = (hashCode6 + (variant_NullType_Boolean2 == null ? 0 : variant_NullType_Boolean2.hashCode())) * 31;
        Variant_NullType_PromotionalOfferJwsInputIOS variant_NullType_PromotionalOfferJwsInputIOS = this.promotionalOfferJWS;
        int hashCode8 = (hashCode7 + (variant_NullType_PromotionalOfferJwsInputIOS == null ? 0 : variant_NullType_PromotionalOfferJwsInputIOS.hashCode())) * 31;
        Variant_NullType_WinBackOfferInputIOS variant_NullType_WinBackOfferInputIOS = this.winBackOffer;
        return hashCode8 + (variant_NullType_WinBackOfferInputIOS != null ? variant_NullType_WinBackOfferInputIOS.hashCode() : 0);
    }

    public String toString() {
        return "NitroRequestPurchaseIos(sku=" + this.sku + ", andDangerouslyFinishTransactionAutomatically=" + this.andDangerouslyFinishTransactionAutomatically + ", appAccountToken=" + this.appAccountToken + ", quantity=" + this.quantity + ", withOffer=" + this.withOffer + ", advancedCommerceData=" + this.advancedCommerceData + ", introductoryOfferEligibility=" + this.introductoryOfferEligibility + ", promotionalOfferJWS=" + this.promotionalOfferJWS + ", winBackOffer=" + this.winBackOffer + ")";
    }

    public NitroRequestPurchaseIos(String sku, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_String variant_NullType_String, Variant_NullType_Double variant_NullType_Double, Variant_NullType_Map_String__String_ variant_NullType_Map_String__String_, Variant_NullType_String variant_NullType_String2, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_PromotionalOfferJwsInputIOS variant_NullType_PromotionalOfferJwsInputIOS, Variant_NullType_WinBackOfferInputIOS variant_NullType_WinBackOfferInputIOS) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
        this.andDangerouslyFinishTransactionAutomatically = variant_NullType_Boolean;
        this.appAccountToken = variant_NullType_String;
        this.quantity = variant_NullType_Double;
        this.withOffer = variant_NullType_Map_String__String_;
        this.advancedCommerceData = variant_NullType_String2;
        this.introductoryOfferEligibility = variant_NullType_Boolean2;
        this.promotionalOfferJWS = variant_NullType_PromotionalOfferJwsInputIOS;
        this.winBackOffer = variant_NullType_WinBackOfferInputIOS;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Variant_NullType_Boolean getAndDangerouslyFinishTransactionAutomatically() {
        return this.andDangerouslyFinishTransactionAutomatically;
    }

    public final Variant_NullType_String getAppAccountToken() {
        return this.appAccountToken;
    }

    public final Variant_NullType_Double getQuantity() {
        return this.quantity;
    }

    public final Variant_NullType_Map_String__String_ getWithOffer() {
        return this.withOffer;
    }

    public final Variant_NullType_String getAdvancedCommerceData() {
        return this.advancedCommerceData;
    }

    public final Variant_NullType_Boolean getIntroductoryOfferEligibility() {
        return this.introductoryOfferEligibility;
    }

    public final Variant_NullType_PromotionalOfferJwsInputIOS getPromotionalOfferJWS() {
        return this.promotionalOfferJWS;
    }

    public final Variant_NullType_WinBackOfferInputIOS getWinBackOffer() {
        return this.winBackOffer;
    }

    /* compiled from: NitroRequestPurchaseIos.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/NitroRequestPurchaseIos$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroRequestPurchaseIos;", "sku", "", "andDangerouslyFinishTransactionAutomatically", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "appAccountToken", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "quantity", "Lcom/margelo/nitro/iap/Variant_NullType_Double;", "withOffer", "Lcom/margelo/nitro/iap/Variant_NullType_Map_String__String_;", "advancedCommerceData", "introductoryOfferEligibility", "promotionalOfferJWS", "Lcom/margelo/nitro/iap/Variant_NullType_PromotionalOfferJwsInputIOS;", "winBackOffer", "Lcom/margelo/nitro/iap/Variant_NullType_WinBackOfferInputIOS;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroRequestPurchaseIos fromCpp(String sku, Variant_NullType_Boolean andDangerouslyFinishTransactionAutomatically, Variant_NullType_String appAccountToken, Variant_NullType_Double quantity, Variant_NullType_Map_String__String_ withOffer, Variant_NullType_String advancedCommerceData, Variant_NullType_Boolean introductoryOfferEligibility, Variant_NullType_PromotionalOfferJwsInputIOS promotionalOfferJWS, Variant_NullType_WinBackOfferInputIOS winBackOffer) {
            return new NitroRequestPurchaseIos(sku, andDangerouslyFinishTransactionAutomatically, appAccountToken, quantity, withOffer, advancedCommerceData, introductoryOfferEligibility, promotionalOfferJWS, winBackOffer);
        }
    }
}
