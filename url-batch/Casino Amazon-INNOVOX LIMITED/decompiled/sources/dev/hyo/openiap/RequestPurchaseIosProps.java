package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003JT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseIosProps;", "", "advancedCommerceData", "", "andDangerouslyFinishTransactionAutomatically", "", "appAccountToken", "quantity", "", "sku", "withOffer", "Ldev/hyo/openiap/DiscountOfferInputIOS;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ldev/hyo/openiap/DiscountOfferInputIOS;)V", "getAdvancedCommerceData", "()Ljava/lang/String;", "getAndDangerouslyFinishTransactionAutomatically", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppAccountToken", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSku", "getWithOffer", "()Ldev/hyo/openiap/DiscountOfferInputIOS;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ldev/hyo/openiap/DiscountOfferInputIOS;)Ldev/hyo/openiap/RequestPurchaseIosProps;", "equals", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchaseIosProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String advancedCommerceData;
    private final Boolean andDangerouslyFinishTransactionAutomatically;
    private final String appAccountToken;
    private final Integer quantity;
    private final String sku;
    private final DiscountOfferInputIOS withOffer;

    public static /* synthetic */ RequestPurchaseIosProps copy$default(RequestPurchaseIosProps requestPurchaseIosProps, String str, Boolean bool, String str2, Integer num, String str3, DiscountOfferInputIOS discountOfferInputIOS, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestPurchaseIosProps.advancedCommerceData;
        }
        if ((i & 2) != 0) {
            bool = requestPurchaseIosProps.andDangerouslyFinishTransactionAutomatically;
        }
        if ((i & 4) != 0) {
            str2 = requestPurchaseIosProps.appAccountToken;
        }
        if ((i & 8) != 0) {
            num = requestPurchaseIosProps.quantity;
        }
        if ((i & 16) != 0) {
            str3 = requestPurchaseIosProps.sku;
        }
        if ((i & 32) != 0) {
            discountOfferInputIOS = requestPurchaseIosProps.withOffer;
        }
        String str4 = str3;
        DiscountOfferInputIOS discountOfferInputIOS2 = discountOfferInputIOS;
        return requestPurchaseIosProps.copy(str, bool, str2, num, str4, discountOfferInputIOS2);
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
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component6, reason: from getter */
    public final DiscountOfferInputIOS getWithOffer() {
        return this.withOffer;
    }

    public final RequestPurchaseIosProps copy(String advancedCommerceData, Boolean andDangerouslyFinishTransactionAutomatically, String appAccountToken, Integer quantity, String sku, DiscountOfferInputIOS withOffer) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new RequestPurchaseIosProps(advancedCommerceData, andDangerouslyFinishTransactionAutomatically, appAccountToken, quantity, sku, withOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPurchaseIosProps)) {
            return false;
        }
        RequestPurchaseIosProps requestPurchaseIosProps = (RequestPurchaseIosProps) other;
        return Intrinsics.areEqual(this.advancedCommerceData, requestPurchaseIosProps.advancedCommerceData) && Intrinsics.areEqual(this.andDangerouslyFinishTransactionAutomatically, requestPurchaseIosProps.andDangerouslyFinishTransactionAutomatically) && Intrinsics.areEqual(this.appAccountToken, requestPurchaseIosProps.appAccountToken) && Intrinsics.areEqual(this.quantity, requestPurchaseIosProps.quantity) && Intrinsics.areEqual(this.sku, requestPurchaseIosProps.sku) && Intrinsics.areEqual(this.withOffer, requestPurchaseIosProps.withOffer);
    }

    public int hashCode() {
        String str = this.advancedCommerceData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.andDangerouslyFinishTransactionAutomatically;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.appAccountToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode4 = (((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.sku.hashCode()) * 31;
        DiscountOfferInputIOS discountOfferInputIOS = this.withOffer;
        return hashCode4 + (discountOfferInputIOS != null ? discountOfferInputIOS.hashCode() : 0);
    }

    public String toString() {
        return "RequestPurchaseIosProps(advancedCommerceData=" + this.advancedCommerceData + ", andDangerouslyFinishTransactionAutomatically=" + this.andDangerouslyFinishTransactionAutomatically + ", appAccountToken=" + this.appAccountToken + ", quantity=" + this.quantity + ", sku=" + this.sku + ", withOffer=" + this.withOffer + ")";
    }

    public RequestPurchaseIosProps(String str, Boolean bool, String str2, Integer num, String sku, DiscountOfferInputIOS discountOfferInputIOS) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.advancedCommerceData = str;
        this.andDangerouslyFinishTransactionAutomatically = bool;
        this.appAccountToken = str2;
        this.quantity = num;
        this.sku = sku;
        this.withOffer = discountOfferInputIOS;
    }

    public /* synthetic */ RequestPurchaseIosProps(String str, Boolean bool, String str2, Integer num, String str3, DiscountOfferInputIOS discountOfferInputIOS, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, str3, (i & 32) != 0 ? null : discountOfferInputIOS);
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

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public final DiscountOfferInputIOS getWithOffer() {
        return this.withOffer;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseIosProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestPurchaseIosProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestPurchaseIosProps fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("advancedCommerceData");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("andDangerouslyFinishTransactionAutomatically");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("appAccountToken");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("quantity");
            Number number = obj4 instanceof Number ? (Number) obj4 : null;
            Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            Object obj5 = json.get("sku");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            Object obj6 = json.get("withOffer");
            Map<String, ? extends Object> map = obj6 instanceof Map ? (Map) obj6 : null;
            DiscountOfferInputIOS fromJson = map != null ? DiscountOfferInputIOS.INSTANCE.fromJson(map) : null;
            if (str3 == null) {
                return null;
            }
            return new RequestPurchaseIosProps(str, bool, str2, valueOf, str3, fromJson);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("advancedCommerceData", this.advancedCommerceData);
        pairArr[1] = TuplesKt.to("andDangerouslyFinishTransactionAutomatically", this.andDangerouslyFinishTransactionAutomatically);
        pairArr[2] = TuplesKt.to("appAccountToken", this.appAccountToken);
        pairArr[3] = TuplesKt.to("quantity", this.quantity);
        pairArr[4] = TuplesKt.to("sku", this.sku);
        DiscountOfferInputIOS discountOfferInputIOS = this.withOffer;
        pairArr[5] = TuplesKt.to("withOffer", discountOfferInputIOS != null ? discountOfferInputIOS.toJson() : null);
        return MapsKt.mapOf(pairArr);
    }
}
