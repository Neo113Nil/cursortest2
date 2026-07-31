package com.appsflyer.api.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class SubscriptionOfferDetails implements AFPurchaseConnectorA1z {
    private final String basePlanId;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final List<PricingPhases> pricingPhases;

    public SubscriptionOfferDetails(String str, String str2, List<String> list, String str3, List<PricingPhases> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.basePlanId = str;
        this.offerId = str2;
        this.offerTags = list;
        this.offerToken = str3;
        this.pricingPhases = list2;
    }

    public static /* synthetic */ SubscriptionOfferDetails copy$default(SubscriptionOfferDetails subscriptionOfferDetails, String str, String str2, List list, String str3, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = subscriptionOfferDetails.basePlanId;
        }
        if ((i4 & 2) != 0) {
            str2 = subscriptionOfferDetails.offerId;
        }
        if ((i4 & 4) != 0) {
            list = subscriptionOfferDetails.offerTags;
        }
        if ((i4 & 8) != 0) {
            str3 = subscriptionOfferDetails.offerToken;
        }
        if ((i4 & 16) != 0) {
            list2 = subscriptionOfferDetails.pricingPhases;
        }
        List list3 = list2;
        List list4 = list;
        return subscriptionOfferDetails.copy(str, str2, list4, str3, list3);
    }

    public final String component1() {
        return this.basePlanId;
    }

    public final String component2() {
        return this.offerId;
    }

    public final List<String> component3() {
        return this.offerTags;
    }

    public final String component4() {
        return this.offerToken;
    }

    public final List<PricingPhases> component5() {
        return this.pricingPhases;
    }

    public final SubscriptionOfferDetails copy(String str, String str2, List<String> list, String str3, List<PricingPhases> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SubscriptionOfferDetails(str, str2, list, str3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionOfferDetails)) {
            return false;
        }
        SubscriptionOfferDetails subscriptionOfferDetails = (SubscriptionOfferDetails) obj;
        return Intrinsics.areEqual(this.basePlanId, subscriptionOfferDetails.basePlanId) && Intrinsics.areEqual(this.offerId, subscriptionOfferDetails.offerId) && Intrinsics.areEqual(this.offerTags, subscriptionOfferDetails.offerTags) && Intrinsics.areEqual(this.offerToken, subscriptionOfferDetails.offerToken) && Intrinsics.areEqual(this.pricingPhases, subscriptionOfferDetails.pricingPhases);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
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

    public final List<PricingPhases> getPricingPhases() {
        return this.pricingPhases;
    }

    public final int hashCode() {
        int hashCode = this.basePlanId.hashCode() * 31;
        String str = this.offerId;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + this.pricingPhases.hashCode();
    }

    public final Map<String, Object> toJsonMap() {
        Pair pair = TuplesKt.to("base_plan_id", this.basePlanId);
        Pair pair2 = TuplesKt.to("offer_tags", this.offerTags);
        Pair pair3 = TuplesKt.to("offer_token", this.offerToken);
        List<PricingPhases> list = this.pricingPhases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PricingPhases) it.next()).toJsonMap());
        }
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pair, pair2, pair3, TuplesKt.to("pricing_phases", arrayList));
        String str = this.offerId;
        if (str != null) {
            mutableMapOf.put("offer_id", str);
        }
        return mutableMapOf;
    }

    public final String toString() {
        return "SubscriptionOfferDetails(basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", pricingPhases=" + this.pricingPhases + ")";
    }
}
