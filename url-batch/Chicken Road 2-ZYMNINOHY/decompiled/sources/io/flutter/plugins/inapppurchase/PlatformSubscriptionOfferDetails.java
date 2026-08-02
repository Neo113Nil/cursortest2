package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformSubscriptionOfferDetails {
    public static final Companion Companion = new Companion(null);
    private final String basePlanId;
    private final PlatformInstallmentPlanDetails installmentPlanDetails;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final List<PlatformPricingPhase> pricingPhases;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformSubscriptionOfferDetails fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) list.get(1);
            Object obj = list.get(2);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj;
            Object obj2 = list.get(3);
            i.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list2 = (List) obj2;
            Object obj3 = list.get(4);
            i.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformPricingPhase>");
            return new PlatformSubscriptionOfferDetails(str, str2, str3, list2, (List) obj3, (PlatformInstallmentPlanDetails) list.get(5));
        }

        private Companion() {
        }
    }

    public PlatformSubscriptionOfferDetails(String basePlanId, String str, String offerToken, List<String> offerTags, List<PlatformPricingPhase> pricingPhases, PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
        i.e(basePlanId, "basePlanId");
        i.e(offerToken, "offerToken");
        i.e(offerTags, "offerTags");
        i.e(pricingPhases, "pricingPhases");
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.offerToken = offerToken;
        this.offerTags = offerTags;
        this.pricingPhases = pricingPhases;
        this.installmentPlanDetails = platformInstallmentPlanDetails;
    }

    public static /* synthetic */ PlatformSubscriptionOfferDetails copy$default(PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails, String str, String str2, String str3, List list, List list2, PlatformInstallmentPlanDetails platformInstallmentPlanDetails, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformSubscriptionOfferDetails.basePlanId;
        }
        if ((i4 & 2) != 0) {
            str2 = platformSubscriptionOfferDetails.offerId;
        }
        if ((i4 & 4) != 0) {
            str3 = platformSubscriptionOfferDetails.offerToken;
        }
        if ((i4 & 8) != 0) {
            list = platformSubscriptionOfferDetails.offerTags;
        }
        if ((i4 & 16) != 0) {
            list2 = platformSubscriptionOfferDetails.pricingPhases;
        }
        if ((i4 & 32) != 0) {
            platformInstallmentPlanDetails = platformSubscriptionOfferDetails.installmentPlanDetails;
        }
        List list3 = list2;
        PlatformInstallmentPlanDetails platformInstallmentPlanDetails2 = platformInstallmentPlanDetails;
        return platformSubscriptionOfferDetails.copy(str, str2, str3, list, list3, platformInstallmentPlanDetails2);
    }

    public final String component1() {
        return this.basePlanId;
    }

    public final String component2() {
        return this.offerId;
    }

    public final String component3() {
        return this.offerToken;
    }

    public final List<String> component4() {
        return this.offerTags;
    }

    public final List<PlatformPricingPhase> component5() {
        return this.pricingPhases;
    }

    public final PlatformInstallmentPlanDetails component6() {
        return this.installmentPlanDetails;
    }

    public final PlatformSubscriptionOfferDetails copy(String basePlanId, String str, String offerToken, List<String> offerTags, List<PlatformPricingPhase> pricingPhases, PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
        i.e(basePlanId, "basePlanId");
        i.e(offerToken, "offerToken");
        i.e(offerTags, "offerTags");
        i.e(pricingPhases, "pricingPhases");
        return new PlatformSubscriptionOfferDetails(basePlanId, str, offerToken, offerTags, pricingPhases, platformInstallmentPlanDetails);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformSubscriptionOfferDetails.class)) {
            if (this == obj) {
                return true;
            }
            PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = (PlatformSubscriptionOfferDetails) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.basePlanId, platformSubscriptionOfferDetails.basePlanId) && messagesPigeonUtils.deepEquals(this.offerId, platformSubscriptionOfferDetails.offerId) && messagesPigeonUtils.deepEquals(this.offerToken, platformSubscriptionOfferDetails.offerToken) && messagesPigeonUtils.deepEquals(this.offerTags, platformSubscriptionOfferDetails.offerTags) && messagesPigeonUtils.deepEquals(this.pricingPhases, platformSubscriptionOfferDetails.pricingPhases) && messagesPigeonUtils.deepEquals(this.installmentPlanDetails, platformSubscriptionOfferDetails.installmentPlanDetails)) {
                return true;
            }
        }
        return false;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final PlatformInstallmentPlanDetails getInstallmentPlanDetails() {
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

    public final List<PlatformPricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public int hashCode() {
        int hashCode = PlatformSubscriptionOfferDetails.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((hashCode + messagesPigeonUtils.deepHash(this.basePlanId)) * 31) + messagesPigeonUtils.deepHash(this.offerId)) * 31) + messagesPigeonUtils.deepHash(this.offerToken)) * 31) + messagesPigeonUtils.deepHash(this.offerTags)) * 31) + messagesPigeonUtils.deepHash(this.pricingPhases)) * 31) + messagesPigeonUtils.deepHash(this.installmentPlanDetails);
    }

    public final List<Object> toList() {
        return j.W(this.basePlanId, this.offerId, this.offerToken, this.offerTags, this.pricingPhases, this.installmentPlanDetails);
    }

    public String toString() {
        return "PlatformSubscriptionOfferDetails(basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerToken=" + this.offerToken + ", offerTags=" + this.offerTags + ", pricingPhases=" + this.pricingPhases + ", installmentPlanDetails=" + this.installmentPlanDetails + ")";
    }

    public /* synthetic */ PlatformSubscriptionOfferDetails(String str, String str2, String str3, List list, List list2, PlatformInstallmentPlanDetails platformInstallmentPlanDetails, int i4, kotlin.jvm.internal.e eVar) {
        this(str, (i4 & 2) != 0 ? null : str2, str3, list, list2, (i4 & 32) != 0 ? null : platformInstallmentPlanDetails);
    }
}
