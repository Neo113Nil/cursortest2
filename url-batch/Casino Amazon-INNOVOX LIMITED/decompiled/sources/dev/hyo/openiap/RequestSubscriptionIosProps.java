package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jx\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionIosProps;", "", "advancedCommerceData", "", "andDangerouslyFinishTransactionAutomatically", "", "appAccountToken", "introductoryOfferEligibility", "promotionalOfferJWS", "Ldev/hyo/openiap/PromotionalOfferJWSInputIOS;", "quantity", "", "sku", "winBackOffer", "Ldev/hyo/openiap/WinBackOfferInputIOS;", "withOffer", "Ldev/hyo/openiap/DiscountOfferInputIOS;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ldev/hyo/openiap/PromotionalOfferJWSInputIOS;Ljava/lang/Integer;Ljava/lang/String;Ldev/hyo/openiap/WinBackOfferInputIOS;Ldev/hyo/openiap/DiscountOfferInputIOS;)V", "getAdvancedCommerceData", "()Ljava/lang/String;", "getAndDangerouslyFinishTransactionAutomatically", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppAccountToken", "getIntroductoryOfferEligibility", "getPromotionalOfferJWS", "()Ldev/hyo/openiap/PromotionalOfferJWSInputIOS;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSku", "getWinBackOffer", "()Ldev/hyo/openiap/WinBackOfferInputIOS;", "getWithOffer", "()Ldev/hyo/openiap/DiscountOfferInputIOS;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ldev/hyo/openiap/PromotionalOfferJWSInputIOS;Ljava/lang/Integer;Ljava/lang/String;Ldev/hyo/openiap/WinBackOfferInputIOS;Ldev/hyo/openiap/DiscountOfferInputIOS;)Ldev/hyo/openiap/RequestSubscriptionIosProps;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestSubscriptionIosProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String advancedCommerceData;
    private final Boolean andDangerouslyFinishTransactionAutomatically;
    private final String appAccountToken;
    private final Boolean introductoryOfferEligibility;
    private final PromotionalOfferJWSInputIOS promotionalOfferJWS;
    private final Integer quantity;
    private final String sku;
    private final WinBackOfferInputIOS winBackOffer;
    private final DiscountOfferInputIOS withOffer;

    public static /* synthetic */ RequestSubscriptionIosProps copy$default(RequestSubscriptionIosProps requestSubscriptionIosProps, String str, Boolean bool, String str2, Boolean bool2, PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS, Integer num, String str3, WinBackOfferInputIOS winBackOfferInputIOS, DiscountOfferInputIOS discountOfferInputIOS, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestSubscriptionIosProps.advancedCommerceData;
        }
        if ((i & 2) != 0) {
            bool = requestSubscriptionIosProps.andDangerouslyFinishTransactionAutomatically;
        }
        if ((i & 4) != 0) {
            str2 = requestSubscriptionIosProps.appAccountToken;
        }
        if ((i & 8) != 0) {
            bool2 = requestSubscriptionIosProps.introductoryOfferEligibility;
        }
        if ((i & 16) != 0) {
            promotionalOfferJWSInputIOS = requestSubscriptionIosProps.promotionalOfferJWS;
        }
        if ((i & 32) != 0) {
            num = requestSubscriptionIosProps.quantity;
        }
        if ((i & 64) != 0) {
            str3 = requestSubscriptionIosProps.sku;
        }
        if ((i & 128) != 0) {
            winBackOfferInputIOS = requestSubscriptionIosProps.winBackOffer;
        }
        if ((i & 256) != 0) {
            discountOfferInputIOS = requestSubscriptionIosProps.withOffer;
        }
        WinBackOfferInputIOS winBackOfferInputIOS2 = winBackOfferInputIOS;
        DiscountOfferInputIOS discountOfferInputIOS2 = discountOfferInputIOS;
        Integer num2 = num;
        String str4 = str3;
        PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS2 = promotionalOfferJWSInputIOS;
        String str5 = str2;
        return requestSubscriptionIosProps.copy(str, bool, str5, bool2, promotionalOfferJWSInputIOS2, num2, str4, winBackOfferInputIOS2, discountOfferInputIOS2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdvancedCommerceData() {
        return this.advancedCommerceData;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAndDangerouslyFinishTransactionAutomatically() {
        return this.andDangerouslyFinishTransactionAutomatically;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppAccountToken() {
        return this.appAccountToken;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIntroductoryOfferEligibility() {
        return this.introductoryOfferEligibility;
    }

    /* renamed from: component5, reason: from getter */
    public final PromotionalOfferJWSInputIOS getPromotionalOfferJWS() {
        return this.promotionalOfferJWS;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component8, reason: from getter */
    public final WinBackOfferInputIOS getWinBackOffer() {
        return this.winBackOffer;
    }

    /* renamed from: component9, reason: from getter */
    public final DiscountOfferInputIOS getWithOffer() {
        return this.withOffer;
    }

    public final RequestSubscriptionIosProps copy(String advancedCommerceData, Boolean andDangerouslyFinishTransactionAutomatically, String appAccountToken, Boolean introductoryOfferEligibility, PromotionalOfferJWSInputIOS promotionalOfferJWS, Integer quantity, String sku, WinBackOfferInputIOS winBackOffer, DiscountOfferInputIOS withOffer) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new RequestSubscriptionIosProps(advancedCommerceData, andDangerouslyFinishTransactionAutomatically, appAccountToken, introductoryOfferEligibility, promotionalOfferJWS, quantity, sku, winBackOffer, withOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSubscriptionIosProps)) {
            return false;
        }
        RequestSubscriptionIosProps requestSubscriptionIosProps = (RequestSubscriptionIosProps) other;
        return Intrinsics.areEqual(this.advancedCommerceData, requestSubscriptionIosProps.advancedCommerceData) && Intrinsics.areEqual(this.andDangerouslyFinishTransactionAutomatically, requestSubscriptionIosProps.andDangerouslyFinishTransactionAutomatically) && Intrinsics.areEqual(this.appAccountToken, requestSubscriptionIosProps.appAccountToken) && Intrinsics.areEqual(this.introductoryOfferEligibility, requestSubscriptionIosProps.introductoryOfferEligibility) && Intrinsics.areEqual(this.promotionalOfferJWS, requestSubscriptionIosProps.promotionalOfferJWS) && Intrinsics.areEqual(this.quantity, requestSubscriptionIosProps.quantity) && Intrinsics.areEqual(this.sku, requestSubscriptionIosProps.sku) && Intrinsics.areEqual(this.winBackOffer, requestSubscriptionIosProps.winBackOffer) && Intrinsics.areEqual(this.withOffer, requestSubscriptionIosProps.withOffer);
    }

    public int hashCode() {
        String str = this.advancedCommerceData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.andDangerouslyFinishTransactionAutomatically;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.appAccountToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.introductoryOfferEligibility;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS = this.promotionalOfferJWS;
        int hashCode5 = (hashCode4 + (promotionalOfferJWSInputIOS == null ? 0 : promotionalOfferJWSInputIOS.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode6 = (((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.sku.hashCode()) * 31;
        WinBackOfferInputIOS winBackOfferInputIOS = this.winBackOffer;
        int hashCode7 = (hashCode6 + (winBackOfferInputIOS == null ? 0 : winBackOfferInputIOS.hashCode())) * 31;
        DiscountOfferInputIOS discountOfferInputIOS = this.withOffer;
        return hashCode7 + (discountOfferInputIOS != null ? discountOfferInputIOS.hashCode() : 0);
    }

    public String toString() {
        return "RequestSubscriptionIosProps(advancedCommerceData=" + this.advancedCommerceData + ", andDangerouslyFinishTransactionAutomatically=" + this.andDangerouslyFinishTransactionAutomatically + ", appAccountToken=" + this.appAccountToken + ", introductoryOfferEligibility=" + this.introductoryOfferEligibility + ", promotionalOfferJWS=" + this.promotionalOfferJWS + ", quantity=" + this.quantity + ", sku=" + this.sku + ", winBackOffer=" + this.winBackOffer + ", withOffer=" + this.withOffer + ")";
    }

    public RequestSubscriptionIosProps(String str, Boolean bool, String str2, Boolean bool2, PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS, Integer num, String sku, WinBackOfferInputIOS winBackOfferInputIOS, DiscountOfferInputIOS discountOfferInputIOS) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.advancedCommerceData = str;
        this.andDangerouslyFinishTransactionAutomatically = bool;
        this.appAccountToken = str2;
        this.introductoryOfferEligibility = bool2;
        this.promotionalOfferJWS = promotionalOfferJWSInputIOS;
        this.quantity = num;
        this.sku = sku;
        this.winBackOffer = winBackOfferInputIOS;
        this.withOffer = discountOfferInputIOS;
    }

    public /* synthetic */ RequestSubscriptionIosProps(String str, Boolean bool, String str2, Boolean bool2, PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS, Integer num, String str3, WinBackOfferInputIOS winBackOfferInputIOS, DiscountOfferInputIOS discountOfferInputIOS, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : promotionalOfferJWSInputIOS, (i & 32) != 0 ? null : num, str3, (i & 128) != 0 ? null : winBackOfferInputIOS, (i & 256) != 0 ? null : discountOfferInputIOS);
    }

    public final String getAdvancedCommerceData() {
        return this.advancedCommerceData;
    }

    public final Boolean getAndDangerouslyFinishTransactionAutomatically() {
        return this.andDangerouslyFinishTransactionAutomatically;
    }

    public final String getAppAccountToken() {
        return this.appAccountToken;
    }

    public final Boolean getIntroductoryOfferEligibility() {
        return this.introductoryOfferEligibility;
    }

    public final PromotionalOfferJWSInputIOS getPromotionalOfferJWS() {
        return this.promotionalOfferJWS;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public final WinBackOfferInputIOS getWinBackOffer() {
        return this.winBackOffer;
    }

    public final DiscountOfferInputIOS getWithOffer() {
        return this.withOffer;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestSubscriptionIosProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestSubscriptionIosProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestSubscriptionIosProps fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("advancedCommerceData");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("andDangerouslyFinishTransactionAutomatically");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("appAccountToken");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("introductoryOfferEligibility");
            Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
            Object obj5 = json.get("promotionalOfferJWS");
            Map<String, ? extends Object> map = obj5 instanceof Map ? (Map) obj5 : null;
            PromotionalOfferJWSInputIOS fromJson = map != null ? PromotionalOfferJWSInputIOS.INSTANCE.fromJson(map) : null;
            Object obj6 = json.get("quantity");
            Number number = obj6 instanceof Number ? (Number) obj6 : null;
            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            Object obj7 = json.get("sku");
            String str3 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = json.get("winBackOffer");
            Map<String, ? extends Object> map2 = obj8 instanceof Map ? (Map) obj8 : null;
            WinBackOfferInputIOS fromJson2 = map2 != null ? WinBackOfferInputIOS.INSTANCE.fromJson(map2) : null;
            Object obj9 = json.get("withOffer");
            Map<String, ? extends Object> map3 = obj9 instanceof Map ? (Map) obj9 : null;
            DiscountOfferInputIOS fromJson3 = map3 != null ? DiscountOfferInputIOS.INSTANCE.fromJson(map3) : null;
            if (str3 == null) {
                return null;
            }
            return new RequestSubscriptionIosProps(str, bool, str2, bool2, fromJson, valueOf, str3, fromJson2, fromJson3);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("advancedCommerceData", this.advancedCommerceData);
        pairArr[1] = TuplesKt.to("andDangerouslyFinishTransactionAutomatically", this.andDangerouslyFinishTransactionAutomatically);
        pairArr[2] = TuplesKt.to("appAccountToken", this.appAccountToken);
        pairArr[3] = TuplesKt.to("introductoryOfferEligibility", this.introductoryOfferEligibility);
        PromotionalOfferJWSInputIOS promotionalOfferJWSInputIOS = this.promotionalOfferJWS;
        pairArr[4] = TuplesKt.to("promotionalOfferJWS", promotionalOfferJWSInputIOS != null ? promotionalOfferJWSInputIOS.toJson() : null);
        pairArr[5] = TuplesKt.to("quantity", this.quantity);
        pairArr[6] = TuplesKt.to("sku", this.sku);
        WinBackOfferInputIOS winBackOfferInputIOS = this.winBackOffer;
        pairArr[7] = TuplesKt.to("winBackOffer", winBackOfferInputIOS != null ? winBackOfferInputIOS.toJson() : null);
        DiscountOfferInputIOS discountOfferInputIOS = this.withOffer;
        pairArr[8] = TuplesKt.to("withOffer", discountOfferInputIOS != null ? discountOfferInputIOS.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
