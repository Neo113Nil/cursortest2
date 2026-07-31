package dev.hyo.openiap;

import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0084\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0004\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionAndroidProps;", "", "developerBillingOption", "Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "isOfferPersonalized", "", "obfuscatedAccountId", "", "obfuscatedProfileId", "purchaseToken", "replacementMode", "", "skus", "", "subscriptionOffers", "Ldev/hyo/openiap/AndroidSubscriptionOfferInput;", "subscriptionProductReplacementParams", "Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "<init>", "(Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;)V", "getDeveloperBillingOption", "()Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObfuscatedAccountId", "()Ljava/lang/String;", "getObfuscatedProfileId", "getPurchaseToken", "getReplacementMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSkus", "()Ljava/util/List;", "getSubscriptionOffers", "getSubscriptionProductReplacementParams", "()Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ldev/hyo/openiap/SubscriptionProductReplacementParamsAndroid;)Ldev/hyo/openiap/RequestSubscriptionAndroidProps;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestSubscriptionAndroidProps {
    private final DeveloperBillingOptionParamsAndroid developerBillingOption;
    private final Boolean isOfferPersonalized;
    private final String obfuscatedAccountId;
    private final String obfuscatedProfileId;
    private final String purchaseToken;
    private final Integer replacementMode;
    private final List<String> skus;
    private final List<AndroidSubscriptionOfferInput> subscriptionOffers;
    private final SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RequestSubscriptionAndroidProps copy$default(RequestSubscriptionAndroidProps requestSubscriptionAndroidProps, DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, Integer num, List list, List list2, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            developerBillingOptionParamsAndroid = requestSubscriptionAndroidProps.developerBillingOption;
        }
        if ((i & 2) != 0) {
            bool = requestSubscriptionAndroidProps.isOfferPersonalized;
        }
        if ((i & 4) != 0) {
            str = requestSubscriptionAndroidProps.obfuscatedAccountId;
        }
        if ((i & 8) != 0) {
            str2 = requestSubscriptionAndroidProps.obfuscatedProfileId;
        }
        if ((i & 16) != 0) {
            str3 = requestSubscriptionAndroidProps.purchaseToken;
        }
        if ((i & 32) != 0) {
            num = requestSubscriptionAndroidProps.replacementMode;
        }
        if ((i & 64) != 0) {
            list = requestSubscriptionAndroidProps.skus;
        }
        if ((i & 128) != 0) {
            list2 = requestSubscriptionAndroidProps.subscriptionOffers;
        }
        if ((i & 256) != 0) {
            subscriptionProductReplacementParamsAndroid = requestSubscriptionAndroidProps.subscriptionProductReplacementParams;
        }
        List list3 = list2;
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid2 = subscriptionProductReplacementParamsAndroid;
        Integer num2 = num;
        List list4 = list;
        String str4 = str3;
        String str5 = str;
        return requestSubscriptionAndroidProps.copy(developerBillingOptionParamsAndroid, bool, str5, str2, str4, num2, list4, list3, subscriptionProductReplacementParamsAndroid2);
    }

    /* renamed from: component1, reason: from getter */
    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
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
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getReplacementMode() {
        return this.replacementMode;
    }

    public final List<String> component7() {
        return this.skus;
    }

    public final List<AndroidSubscriptionOfferInput> component8() {
        return this.subscriptionOffers;
    }

    /* renamed from: component9, reason: from getter */
    public final SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    public final RequestSubscriptionAndroidProps copy(DeveloperBillingOptionParamsAndroid developerBillingOption, Boolean isOfferPersonalized, String obfuscatedAccountId, String obfuscatedProfileId, String purchaseToken, Integer replacementMode, List<String> skus, List<AndroidSubscriptionOfferInput> subscriptionOffers, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParams) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new RequestSubscriptionAndroidProps(developerBillingOption, isOfferPersonalized, obfuscatedAccountId, obfuscatedProfileId, purchaseToken, replacementMode, skus, subscriptionOffers, subscriptionProductReplacementParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSubscriptionAndroidProps)) {
            return false;
        }
        RequestSubscriptionAndroidProps requestSubscriptionAndroidProps = (RequestSubscriptionAndroidProps) other;
        return Intrinsics.areEqual(this.developerBillingOption, requestSubscriptionAndroidProps.developerBillingOption) && Intrinsics.areEqual(this.isOfferPersonalized, requestSubscriptionAndroidProps.isOfferPersonalized) && Intrinsics.areEqual(this.obfuscatedAccountId, requestSubscriptionAndroidProps.obfuscatedAccountId) && Intrinsics.areEqual(this.obfuscatedProfileId, requestSubscriptionAndroidProps.obfuscatedProfileId) && Intrinsics.areEqual(this.purchaseToken, requestSubscriptionAndroidProps.purchaseToken) && Intrinsics.areEqual(this.replacementMode, requestSubscriptionAndroidProps.replacementMode) && Intrinsics.areEqual(this.skus, requestSubscriptionAndroidProps.skus) && Intrinsics.areEqual(this.subscriptionOffers, requestSubscriptionAndroidProps.subscriptionOffers) && Intrinsics.areEqual(this.subscriptionProductReplacementParams, requestSubscriptionAndroidProps.subscriptionProductReplacementParams);
    }

    public int hashCode() {
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = this.developerBillingOption;
        int hashCode = (developerBillingOptionParamsAndroid == null ? 0 : developerBillingOptionParamsAndroid.hashCode()) * 31;
        Boolean bool = this.isOfferPersonalized;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.obfuscatedAccountId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.obfuscatedProfileId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchaseToken;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.replacementMode;
        int hashCode6 = (((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.skus.hashCode()) * 31;
        List<AndroidSubscriptionOfferInput> list = this.subscriptionOffers;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid = this.subscriptionProductReplacementParams;
        return hashCode7 + (subscriptionProductReplacementParamsAndroid != null ? subscriptionProductReplacementParamsAndroid.hashCode() : 0);
    }

    public String toString() {
        return "RequestSubscriptionAndroidProps(developerBillingOption=" + this.developerBillingOption + ", isOfferPersonalized=" + this.isOfferPersonalized + ", obfuscatedAccountId=" + this.obfuscatedAccountId + ", obfuscatedProfileId=" + this.obfuscatedProfileId + ", purchaseToken=" + this.purchaseToken + ", replacementMode=" + this.replacementMode + ", skus=" + this.skus + ", subscriptionOffers=" + this.subscriptionOffers + ", subscriptionProductReplacementParams=" + this.subscriptionProductReplacementParams + ")";
    }

    public RequestSubscriptionAndroidProps(DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, Integer num, List<String> skus, List<AndroidSubscriptionOfferInput> list, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.developerBillingOption = developerBillingOptionParamsAndroid;
        this.isOfferPersonalized = bool;
        this.obfuscatedAccountId = str;
        this.obfuscatedProfileId = str2;
        this.purchaseToken = str3;
        this.replacementMode = num;
        this.skus = skus;
        this.subscriptionOffers = list;
        this.subscriptionProductReplacementParams = subscriptionProductReplacementParamsAndroid;
    }

    public /* synthetic */ RequestSubscriptionAndroidProps(DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, Boolean bool, String str, String str2, String str3, Integer num, List list, List list2, SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : developerBillingOptionParamsAndroid, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : subscriptionProductReplacementParamsAndroid);
    }

    public final DeveloperBillingOptionParamsAndroid getDeveloperBillingOption() {
        return this.developerBillingOption;
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

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Integer getReplacementMode() {
        return this.replacementMode;
    }

    public final List<String> getSkus() {
        return this.skus;
    }

    public final List<AndroidSubscriptionOfferInput> getSubscriptionOffers() {
        return this.subscriptionOffers;
    }

    public final SubscriptionProductReplacementParamsAndroid getSubscriptionProductReplacementParams() {
        return this.subscriptionProductReplacementParams;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionAndroidProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestSubscriptionAndroidProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestSubscriptionAndroidProps fromJson(Map<String, ? extends Object> json) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("developerBillingOption");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            DeveloperBillingOptionParamsAndroid fromJson = map != null ? DeveloperBillingOptionParamsAndroid.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("isOfferPersonalized");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("obfuscatedAccountId");
            String str = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("obfuscatedProfileId");
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("purchaseToken");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("replacementMode");
            Number number = obj6 instanceof Number ? (Number) obj6 : null;
            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            Object obj7 = json.get("skus");
            List list = obj7 instanceof List ? (List) obj7 : null;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list) {
                    String str4 = obj8 instanceof String ? (String) obj8 : null;
                    if (str4 != null) {
                        arrayList3.add(str4);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Object obj9 = json.get("subscriptionOffers");
            List list2 = obj9 instanceof List ? (List) obj9 : null;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj10 : list2) {
                    Map<String, ? extends Object> map2 = obj10 instanceof Map ? (Map) obj10 : null;
                    AndroidSubscriptionOfferInput fromJson2 = map2 != null ? AndroidSubscriptionOfferInput.INSTANCE.fromJson(map2) : null;
                    if (fromJson2 != null) {
                        arrayList4.add(fromJson2);
                    }
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            Object obj11 = json.get("subscriptionProductReplacementParams");
            Map<String, ? extends Object> map3 = obj11 instanceof Map ? (Map) obj11 : null;
            SubscriptionProductReplacementParamsAndroid fromJson3 = map3 != null ? SubscriptionProductReplacementParamsAndroid.INSTANCE.fromJson(map3) : null;
            if (arrayList == null) {
                return null;
            }
            return new RequestSubscriptionAndroidProps(fromJson, bool, str, str2, str3, valueOf, arrayList, arrayList2, fromJson3);
        }
    }

    public final Map<String, Object> toJson() {
        ArrayList arrayList;
        Pair[] pairArr = new Pair[9];
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = this.developerBillingOption;
        pairArr[0] = TuplesKt.to("developerBillingOption", developerBillingOptionParamsAndroid != null ? developerBillingOptionParamsAndroid.toJson() : null);
        pairArr[1] = TuplesKt.to("isOfferPersonalized", this.isOfferPersonalized);
        pairArr[2] = TuplesKt.to("obfuscatedAccountId", this.obfuscatedAccountId);
        pairArr[3] = TuplesKt.to("obfuscatedProfileId", this.obfuscatedProfileId);
        pairArr[4] = TuplesKt.to("purchaseToken", this.purchaseToken);
        pairArr[5] = TuplesKt.to("replacementMode", this.replacementMode);
        pairArr[6] = TuplesKt.to("skus", this.skus);
        List<AndroidSubscriptionOfferInput> list = this.subscriptionOffers;
        if (list != null) {
            List<AndroidSubscriptionOfferInput> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AndroidSubscriptionOfferInput) it.next()).toJson());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        pairArr[7] = TuplesKt.to("subscriptionOffers", arrayList);
        SubscriptionProductReplacementParamsAndroid subscriptionProductReplacementParamsAndroid = this.subscriptionProductReplacementParams;
        pairArr[8] = TuplesKt.to("subscriptionProductReplacementParams", subscriptionProductReplacementParamsAndroid != null ? subscriptionProductReplacementParamsAndroid.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
