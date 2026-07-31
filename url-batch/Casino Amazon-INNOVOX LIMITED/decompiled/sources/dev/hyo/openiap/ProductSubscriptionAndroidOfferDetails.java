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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Ldev/hyo/openiap/ProductSubscriptionAndroidOfferDetails;", "", "basePlanId", "", "installmentPlanDetails", "Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;", "offerId", "offerTags", "", "offerToken", "pricingPhases", "Ldev/hyo/openiap/PricingPhasesAndroid;", "<init>", "(Ljava/lang/String;Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ldev/hyo/openiap/PricingPhasesAndroid;)V", "getBasePlanId", "()Ljava/lang/String;", "getInstallmentPlanDetails", "()Ldev/hyo/openiap/InstallmentPlanDetailsAndroid;", "getOfferId", "getOfferTags", "()Ljava/util/List;", "getOfferToken", "getPricingPhases", "()Ldev/hyo/openiap/PricingPhasesAndroid;", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductSubscriptionAndroidOfferDetails {
    private final String basePlanId;
    private final InstallmentPlanDetailsAndroid installmentPlanDetails;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final PricingPhasesAndroid pricingPhases;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ ProductSubscriptionAndroidOfferDetails copy$default(ProductSubscriptionAndroidOfferDetails productSubscriptionAndroidOfferDetails, String str, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str2, List list, String str3, PricingPhasesAndroid pricingPhasesAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSubscriptionAndroidOfferDetails.basePlanId;
        }
        if ((i & 2) != 0) {
            installmentPlanDetailsAndroid = productSubscriptionAndroidOfferDetails.installmentPlanDetails;
        }
        if ((i & 4) != 0) {
            str2 = productSubscriptionAndroidOfferDetails.offerId;
        }
        if ((i & 8) != 0) {
            list = productSubscriptionAndroidOfferDetails.offerTags;
        }
        if ((i & 16) != 0) {
            str3 = productSubscriptionAndroidOfferDetails.offerToken;
        }
        if ((i & 32) != 0) {
            pricingPhasesAndroid = productSubscriptionAndroidOfferDetails.pricingPhases;
        }
        String str4 = str3;
        PricingPhasesAndroid pricingPhasesAndroid2 = pricingPhasesAndroid;
        return productSubscriptionAndroidOfferDetails.copy(str, installmentPlanDetailsAndroid, str2, list, str4, pricingPhasesAndroid2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* renamed from: component2, reason: from getter */
    public final InstallmentPlanDetailsAndroid getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> component4() {
        return this.offerTags;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component6, reason: from getter */
    public final PricingPhasesAndroid getPricingPhases() {
        return this.pricingPhases;
    }

    public final ProductSubscriptionAndroidOfferDetails copy(String basePlanId, InstallmentPlanDetailsAndroid installmentPlanDetails, String offerId, List<String> offerTags, String offerToken, PricingPhasesAndroid pricingPhases) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        return new ProductSubscriptionAndroidOfferDetails(basePlanId, installmentPlanDetails, offerId, offerTags, offerToken, pricingPhases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSubscriptionAndroidOfferDetails)) {
            return false;
        }
        ProductSubscriptionAndroidOfferDetails productSubscriptionAndroidOfferDetails = (ProductSubscriptionAndroidOfferDetails) other;
        return Intrinsics.areEqual(this.basePlanId, productSubscriptionAndroidOfferDetails.basePlanId) && Intrinsics.areEqual(this.installmentPlanDetails, productSubscriptionAndroidOfferDetails.installmentPlanDetails) && Intrinsics.areEqual(this.offerId, productSubscriptionAndroidOfferDetails.offerId) && Intrinsics.areEqual(this.offerTags, productSubscriptionAndroidOfferDetails.offerTags) && Intrinsics.areEqual(this.offerToken, productSubscriptionAndroidOfferDetails.offerToken) && Intrinsics.areEqual(this.pricingPhases, productSubscriptionAndroidOfferDetails.pricingPhases);
    }

    public int hashCode() {
        int hashCode = this.basePlanId.hashCode() * 31;
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = this.installmentPlanDetails;
        int hashCode2 = (hashCode + (installmentPlanDetailsAndroid == null ? 0 : installmentPlanDetailsAndroid.hashCode())) * 31;
        String str = this.offerId;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + this.pricingPhases.hashCode();
    }

    public String toString() {
        return "ProductSubscriptionAndroidOfferDetails(basePlanId=" + this.basePlanId + ", installmentPlanDetails=" + this.installmentPlanDetails + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", pricingPhases=" + this.pricingPhases + ")";
    }

    public ProductSubscriptionAndroidOfferDetails(String basePlanId, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str, List<String> offerTags, String offerToken, PricingPhasesAndroid pricingPhases) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.basePlanId = basePlanId;
        this.installmentPlanDetails = installmentPlanDetailsAndroid;
        this.offerId = str;
        this.offerTags = offerTags;
        this.offerToken = offerToken;
        this.pricingPhases = pricingPhases;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProductSubscriptionAndroidOfferDetails(String str, InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid, String str2, List list, String str3, PricingPhasesAndroid pricingPhasesAndroid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, installmentPlanDetailsAndroid, r5, r6, r7, r8);
        PricingPhasesAndroid pricingPhasesAndroid2;
        String str4;
        List list2;
        String str5;
        installmentPlanDetailsAndroid = (i & 2) != 0 ? null : installmentPlanDetailsAndroid;
        if ((i & 4) != 0) {
            pricingPhasesAndroid2 = pricingPhasesAndroid;
            str4 = str3;
            list2 = list;
            str5 = null;
        } else {
            pricingPhasesAndroid2 = pricingPhasesAndroid;
            str4 = str3;
            list2 = list;
            str5 = str2;
        }
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final InstallmentPlanDetailsAndroid getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
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

    public final PricingPhasesAndroid getPricingPhases() {
        return this.pricingPhases;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ProductSubscriptionAndroidOfferDetails$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ProductSubscriptionAndroidOfferDetails;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductSubscriptionAndroidOfferDetails fromJson(Map<String, ? extends Object> json) {
            ArrayList emptyList;
            PricingPhasesAndroid fromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("basePlanId");
            String str = obj instanceof String ? (String) obj : null;
            String str2 = str == null ? "" : str;
            Object obj2 = json.get("installmentPlanDetails");
            Map<String, ? extends Object> map = obj2 instanceof Map ? (Map) obj2 : null;
            InstallmentPlanDetailsAndroid fromJson2 = map != null ? InstallmentPlanDetailsAndroid.INSTANCE.fromJson(map) : null;
            Object obj3 = json.get("offerId");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("offerTags");
            List list = obj4 instanceof List ? (List) obj4 : null;
            if (list == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                }
                emptyList = arrayList;
            }
            List list2 = emptyList;
            Object obj6 = json.get("offerToken");
            String str5 = obj6 instanceof String ? (String) obj6 : null;
            String str6 = str5 == null ? "" : str5;
            Object obj7 = json.get("pricingPhases");
            Map<String, ? extends Object> map2 = obj7 instanceof Map ? (Map) obj7 : null;
            if (map2 != null && (fromJson = PricingPhasesAndroid.INSTANCE.fromJson(map2)) != null) {
                return new ProductSubscriptionAndroidOfferDetails(str2, fromJson2, str3, list2, str6, fromJson);
            }
            throw new IllegalArgumentException("Missing required object for PricingPhasesAndroid");
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to("__typename", "ProductSubscriptionAndroidOfferDetails");
        pairArr[1] = TuplesKt.to("basePlanId", this.basePlanId);
        InstallmentPlanDetailsAndroid installmentPlanDetailsAndroid = this.installmentPlanDetails;
        pairArr[2] = TuplesKt.to("installmentPlanDetails", installmentPlanDetailsAndroid != null ? installmentPlanDetailsAndroid.toJson() : null);
        pairArr[3] = TuplesKt.to("offerId", this.offerId);
        pairArr[4] = TuplesKt.to("offerTags", this.offerTags);
        pairArr[5] = TuplesKt.to("offerToken", this.offerToken);
        pairArr[6] = TuplesKt.to("pricingPhases", this.pricingPhases.toJson());
        return MapsKt.mapOf(pairArr);
    }
}
