package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails;", "", "offerTags", "", "", "basePlanId", "offerId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getBasePlanId", "()Ljava/lang/String;", "getOfferId", "getOfferTags", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class OfferDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String basePlanId;
    private final String offerId;
    private final List<String> offerTags;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerDetails.offerTags;
        }
        if ((i & 2) != 0) {
            str = offerDetails.basePlanId;
        }
        if ((i & 4) != 0) {
            str2 = offerDetails.offerId;
        }
        return offerDetails.copy(list, str, str2);
    }

    public final List<String> component1() {
        return this.offerTags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final OfferDetails copy(List<String> offerTags, String basePlanId, String offerId) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        return new OfferDetails(offerTags, basePlanId, offerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferDetails)) {
            return false;
        }
        OfferDetails offerDetails = (OfferDetails) other;
        return Intrinsics.areEqual(this.offerTags, offerDetails.offerTags) && Intrinsics.areEqual(this.basePlanId, offerDetails.basePlanId) && Intrinsics.areEqual(this.offerId, offerDetails.offerId);
    }

    public int hashCode() {
        List<String> list = this.offerTags;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OfferDetails(offerTags=" + this.offerTags + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ")";
    }

    public OfferDetails(List<String> list, String basePlanId, String str) {
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        this.offerTags = list;
        this.basePlanId = basePlanId;
        this.offerId = str;
    }

    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/OfferDetails$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/OfferDetails;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<OfferDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public OfferDetails fromJson(JSONObject json) {
            List list;
            Object nullable;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONArray optJSONArray = json.optJSONArray("offerTags");
            if (optJSONArray != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "optJSONArray(\"offerTags\")");
                list = SubscriptionPurchaseKt.toList(optJSONArray);
            } else {
                list = null;
            }
            String optString = json.optString("basePlanId");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"basePlanId\")");
            nullable = SubscriptionPurchaseKt.getNullable(json, "offerId");
            return new OfferDetails(list, optString, (String) nullable);
        }
    }
}
