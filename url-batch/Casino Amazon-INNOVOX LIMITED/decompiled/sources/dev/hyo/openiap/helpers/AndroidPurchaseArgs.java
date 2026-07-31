package dev.hyo.openiap.helpers;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import dev.hyo.openiap.AndroidSubscriptionOfferInput;
import dev.hyo.openiap.DeveloperBillingOptionParamsAndroid;
import dev.hyo.openiap.ProductQueryType;
import dev.hyo.openiap.SubscriptionProductReplacementParamsAndroid;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Helpers.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ¦\u0001\u00108\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\fHÖ\u0001J\t\u0010=\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0005\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b+\u0010\u001a¨\u0006>"}, d2 = {"Ldev/hyo/openiap/helpers/AndroidPurchaseArgs;", "", "skus", "", "", "isOfferPersonalized", "", "obfuscatedAccountId", "obfuscatedProfileId", "offerToken", "purchaseToken", "replacementMode", "", "subscriptionOffers", "Ldev/hyo/openiap/AndroidSubscriptionOfferInput;", "subscriptionProductReplacementParams", "Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "developerBillingOption", "Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/ProductQueryType;", "useAlternativeBilling", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ldev/hyo/openiap/ProductQueryType;Ljava/lang/Boolean;)V", "getSkus", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObfuscatedAccountId", "()Ljava/lang/String;", "getObfuscatedProfileId", "getOfferToken", "getPurchaseToken", "getReplacementMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubscriptionOffers", "getSubscriptionProductReplacementParams", "()Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "getDeveloperBillingOption", "()Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "getType", "()Ldev/hyo/openiap/ProductQueryType;", "getUseAlternativeBilling", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ldev/hyo/openiap/ProductQueryType;Ljava/lang/Boolean;)Ldev/hyo/openiap/helpers/AndroidPurchaseArgs;", "equals", "other", "hashCode", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AndroidPurchaseArgs {
    public static final int $stable = 8;
    private final DeveloperBillingOptionParamsAndroid developerBillingOption;
    private final Boolean isOfferPersonalized;
    private final String obfuscatedAccountId;
    private final String obfuscatedProfileId;
    private final String offerToken;
    private final String purchaseToken;
    private final Integer replacementMode;
    private final List<String> skus;
    private final List<AndroidSubscriptionOfferInput> subscriptionOffers;
    private final SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams;
    private final ProductQueryType type;
    private final Boolean useAlternativeBilling;

    public static /* synthetic */ AndroidPurchaseArgs copy$default(AndroidPurchaseArgs androidPurchaseArgs, List list, Boolean bool, String str, String str2, String str3, String str4, Integer num, List list2, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, ProductQueryType productQueryType, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = androidPurchaseArgs.skus;
        }
        if ((i & 2) != 0) {
            bool = androidPurchaseArgs.isOfferPersonalized;
        }
        if ((i & 4) != 0) {
            str = androidPurchaseArgs.obfuscatedAccountId;
        }
        if ((i & 8) != 0) {
            str2 = androidPurchaseArgs.obfuscatedProfileId;
        }
        if ((i & 16) != 0) {
            str3 = androidPurchaseArgs.offerToken;
        }
        if ((i & 32) != 0) {
            str4 = androidPurchaseArgs.purchaseToken;
        }
        if ((i & 64) != 0) {
            num = androidPurchaseArgs.replacementMode;
        }
        if ((i & 128) != 0) {
            list2 = androidPurchaseArgs.subscriptionOffers;
        }
        if ((i & 256) != 0) {
            subscriptionProductReplacementParamsAndroid = androidPurchaseArgs.subscriptionProductReplacementParams;
        }
        if ((i & 512) != 0) {
            developerBillingOptionParamsAndroid = androidPurchaseArgs.developerBillingOption;
        }
        if ((i & 1024) != 0) {
            productQueryType = androidPurchaseArgs.type;
        }
        if ((i & 2048) != 0) {
            bool2 = androidPurchaseArgs.useAlternativeBilling;
        }
        ProductQueryType productQueryType2 = productQueryType;
        Boolean bool3 = bool2;
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid2 = subscriptionProductReplacementParamsAndroid;
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid2 = developerBillingOptionParamsAndroid;
        Integer num2 = num;
        List list3 = list2;
        String str5 = str3;
        String str6 = str4;
        return androidPurchaseArgs.copy(list, bool, str, str2, str5, str6, num2, list3, subscriptionProductReplacementParamsAndroid2, developerBillingOptionParamsAndroid2, productQueryType2, bool3);
    }

    public final List<String> component1() {
        return this.skus;
    }

    /* renamed from: component10, reason: from getter */
    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
    }

    /* renamed from: component11, reason: from getter */
    public final ProductQueryType getType() {
        return this.type;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getUseAlternativeBilling() {
        return this.useAlternativeBilling;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    /* renamed from: component3, reason: from getter */
    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getReplacementMode() {
        return this.replacementMode;
    }

    public final List<AndroidSubscriptionOfferInput> component8() {
        return this.subscriptionOffers;
    }

    /* renamed from: component9, reason: from getter */
    public final SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    public final AndroidPurchaseArgs copy(List<String> skus, Boolean isOfferPersonalized, String obfuscatedAccountId, String obfuscatedProfileId, String offerToken, String purchaseToken, Integer replacementMode, List<AndroidSubscriptionOfferInput> subscriptionOffers, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams, DeveloperBillingOptionParamsAndroid developerBillingOption, ProductQueryType type, Boolean useAlternativeBilling) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AndroidPurchaseArgs(skus, isOfferPersonalized, obfuscatedAccountId, obfuscatedProfileId, offerToken, purchaseToken, replacementMode, subscriptionOffers, subscriptionProductReplacementParams, developerBillingOption, type, useAlternativeBilling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidPurchaseArgs)) {
            return false;
        }
        AndroidPurchaseArgs androidPurchaseArgs = (AndroidPurchaseArgs) other;
        return Intrinsics.areEqual(this.skus, androidPurchaseArgs.skus) && Intrinsics.areEqual(this.isOfferPersonalized, androidPurchaseArgs.isOfferPersonalized) && Intrinsics.areEqual(this.obfuscatedAccountId, androidPurchaseArgs.obfuscatedAccountId) && Intrinsics.areEqual(this.obfuscatedProfileId, androidPurchaseArgs.obfuscatedProfileId) && Intrinsics.areEqual(this.offerToken, androidPurchaseArgs.offerToken) && Intrinsics.areEqual(this.purchaseToken, androidPurchaseArgs.purchaseToken) && Intrinsics.areEqual(this.replacementMode, androidPurchaseArgs.replacementMode) && Intrinsics.areEqual(this.subscriptionOffers, androidPurchaseArgs.subscriptionOffers) && Intrinsics.areEqual(this.subscriptionProductReplacementParams, androidPurchaseArgs.subscriptionProductReplacementParams) && Intrinsics.areEqual(this.developerBillingOption, androidPurchaseArgs.developerBillingOption) && this.type == androidPurchaseArgs.type && Intrinsics.areEqual(this.useAlternativeBilling, androidPurchaseArgs.useAlternativeBilling);
    }

    public int hashCode() {
        int hashCode = this.skus.hashCode() * 31;
        Boolean bool = this.isOfferPersonalized;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.obfuscatedAccountId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.obfuscatedProfileId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerToken;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchaseToken;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.replacementMode;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<AndroidSubscriptionOfferInput> list = this.subscriptionOffers;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid = this.subscriptionProductReplacementParams;
        int hashCode9 = (hashCode8 + (subscriptionProductReplacementParamsAndroid == null ? 0 : subscriptionProductReplacementParamsAndroid.hashCode())) * 31;
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = this.developerBillingOption;
        int hashCode10 = (((hashCode9 + (developerBillingOptionParamsAndroid == null ? 0 : developerBillingOptionParamsAndroid.hashCode())) * 31) + this.type.hashCode()) * 31;
        Boolean bool2 = this.useAlternativeBilling;
        return hashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "AndroidPurchaseArgs(skus=" + this.skus + ", isOfferPersonalized=" + this.isOfferPersonalized + ", obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ", offerToken=" + this.offerToken + ", purchaseToken=" + this.purchaseToken + ", replacementMode=" + this.replacementMode + ", subscriptionOffers=" + this.subscriptionOffers + ", subscriptionProductReplacementParams=" + this.subscriptionProductReplacementParams + ", developerBillingOption=" + this.developerBillingOption + ", type=" + this.type + ", useAlternativeBilling=" + this.useAlternativeBilling + ")";
    }

    public AndroidPurchaseArgs(List<String> skus, Boolean bool, String str, String str2, String str3, String str4, Integer num, List<AndroidSubscriptionOfferInput> list, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, ProductQueryType type, Boolean bool2) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        this.skus = skus;
        this.isOfferPersonalized = bool;
        this.obfuscatedAccountId = str;
        this.obfuscatedProfileId = str2;
        this.offerToken = str3;
        this.purchaseToken = str4;
        this.replacementMode = num;
        this.subscriptionOffers = list;
        this.subscriptionProductReplacementParams = subscriptionProductReplacementParamsAndroid;
        this.developerBillingOption = developerBillingOptionParamsAndroid;
        this.type = type;
        this.useAlternativeBilling = bool2;
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    public final Boolean isOfferPersonalized() {
        return this.isOfferPersonalized;
    }

    public final String getObfuscatedAccountId() {
        return this.obfuscatedAccountId;
    }

    public final String getObfuscatedProfileId() {
        return this.obfuscatedProfileId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Integer getReplacementMode() {
        return this.replacementMode;
    }

    public final List<AndroidSubscriptionOfferInput> getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    public final SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
    }

    public final ProductQueryType getType() {
        return this.type;
    }

    public final Boolean getUseAlternativeBilling() {
        return this.useAlternativeBilling;
    }
}
