package com.appsflyer.api.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.api.AFSerializable;
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

/* compiled from: SubscriptionOfferDetails.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006!"}, d2 = {"Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "Lcom/appsflyer/api/AFSerializable;", "basePlanId", "", "offerId", "offerTags", "", "offerToken", "pricingPhases", "Lcom/appsflyer/api/models/PricingPhases;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getOfferTags", "()Ljava/util/List;", "getOfferToken", "getPricingPhases", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toJsonMap", "", "toString", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionOfferDetails implements AFSerializable {
    private final String basePlanId;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final List<PricingPhases> pricingPhases;

    public static /* synthetic */ SubscriptionOfferDetails copy$default(SubscriptionOfferDetails subscriptionOfferDetails, String str, String str2, List list, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionOfferDetails.basePlanId;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionOfferDetails.offerId;
        }
        if ((i & 4) != 0) {
            list = subscriptionOfferDetails.offerTags;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionOfferDetails.offerToken;
        }
        if ((i & 16) != 0) {
            list2 = subscriptionOfferDetails.pricingPhases;
        }
        List list3 = list2;
        List list4 = list;
        return subscriptionOfferDetails.copy(str, str2, list4, str3, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> component3() {
        return this.offerTags;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<PricingPhases> component5() {
        return this.pricingPhases;
    }

    public final SubscriptionOfferDetails copy(String basePlanId, String offerId, List<String> offerTags, String offerToken, List<PricingPhases> pricingPhases) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        return new SubscriptionOfferDetails(basePlanId, offerId, offerTags, offerToken, pricingPhases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionOfferDetails)) {
            return false;
        }
        SubscriptionOfferDetails subscriptionOfferDetails = (SubscriptionOfferDetails) other;
        return Intrinsics.areEqual(this.basePlanId, subscriptionOfferDetails.basePlanId) && Intrinsics.areEqual(this.offerId, subscriptionOfferDetails.offerId) && Intrinsics.areEqual(this.offerTags, subscriptionOfferDetails.offerTags) && Intrinsics.areEqual(this.offerToken, subscriptionOfferDetails.offerToken) && Intrinsics.areEqual(this.pricingPhases, subscriptionOfferDetails.pricingPhases);
    }

    public int hashCode() {
        int hashCode = this.basePlanId.hashCode() * 31;
        String str = this.offerId;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + this.pricingPhases.hashCode();
    }

    public String toString() {
        return "SubscriptionOfferDetails(basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", pricingPhases=" + this.pricingPhases + ")";
    }

    public SubscriptionOfferDetails(String basePlanId, String str, List<String> offerTags, String offerToken, List<PricingPhases> pricingPhases) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.offerTags = offerTags;
        this.offerToken = offerToken;
        this.pricingPhases = pricingPhases;
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

    @Override // com.appsflyer.api.AFSerializable
    public Map<String, Object> toJsonMap() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("base_plan_id", this.basePlanId);
        pairArr[1] = TuplesKt.to("offer_tags", this.offerTags);
        pairArr[2] = TuplesKt.to("offer_token", this.offerToken);
        List<PricingPhases> list = this.pricingPhases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PricingPhases) it.next()).toJsonMap());
        }
        pairArr[3] = TuplesKt.to("pricing_phases", arrayList);
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        String str = this.offerId;
        if (str != null) {
            mutableMapOf.put("offer_id", str);
        }
        return mutableMapOf;
    }
}
