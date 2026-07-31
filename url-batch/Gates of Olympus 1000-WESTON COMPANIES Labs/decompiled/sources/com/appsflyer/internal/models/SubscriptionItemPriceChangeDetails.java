package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "", "expectedNewPriceChargeTime", "", "newPrice", "Lcom/appsflyer/internal/models/Money;", "priceChangeMode", "priceChangeState", "(Ljava/lang/String;Lcom/appsflyer/internal/models/Money;Ljava/lang/String;Ljava/lang/String;)V", "getExpectedNewPriceChargeTime", "()Ljava/lang/String;", "getNewPrice", "()Lcom/appsflyer/internal/models/Money;", "getPriceChangeMode", "getPriceChangeState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionItemPriceChangeDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String expectedNewPriceChargeTime;
    private final Money newPrice;
    private final String priceChangeMode;
    private final String priceChangeState;

    public static /* synthetic */ SubscriptionItemPriceChangeDetails copy$default(SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, String str, Money money, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime;
        }
        if ((i & 2) != 0) {
            money = subscriptionItemPriceChangeDetails.newPrice;
        }
        if ((i & 4) != 0) {
            str2 = subscriptionItemPriceChangeDetails.priceChangeMode;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionItemPriceChangeDetails.priceChangeState;
        }
        return subscriptionItemPriceChangeDetails.copy(str, money, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getNewPrice() {
        return this.newPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    public final SubscriptionItemPriceChangeDetails copy(String expectedNewPriceChargeTime, Money newPrice, String priceChangeMode, String priceChangeState) {
        Intrinsics.checkNotNullParameter(expectedNewPriceChargeTime, "expectedNewPriceChargeTime");
        Intrinsics.checkNotNullParameter(priceChangeMode, "priceChangeMode");
        Intrinsics.checkNotNullParameter(priceChangeState, "priceChangeState");
        return new SubscriptionItemPriceChangeDetails(expectedNewPriceChargeTime, newPrice, priceChangeMode, priceChangeState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionItemPriceChangeDetails)) {
            return false;
        }
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = (SubscriptionItemPriceChangeDetails) other;
        return Intrinsics.areEqual(this.expectedNewPriceChargeTime, subscriptionItemPriceChangeDetails.expectedNewPriceChargeTime) && Intrinsics.areEqual(this.newPrice, subscriptionItemPriceChangeDetails.newPrice) && Intrinsics.areEqual(this.priceChangeMode, subscriptionItemPriceChangeDetails.priceChangeMode) && Intrinsics.areEqual(this.priceChangeState, subscriptionItemPriceChangeDetails.priceChangeState);
    }

    public int hashCode() {
        int hashCode = this.expectedNewPriceChargeTime.hashCode() * 31;
        Money money = this.newPrice;
        return ((((hashCode + (money == null ? 0 : money.hashCode())) * 31) + this.priceChangeMode.hashCode()) * 31) + this.priceChangeState.hashCode();
    }

    public String toString() {
        return "SubscriptionItemPriceChangeDetails(expectedNewPriceChargeTime=" + this.expectedNewPriceChargeTime + ", newPrice=" + this.newPrice + ", priceChangeMode=" + this.priceChangeMode + ", priceChangeState=" + this.priceChangeState + ")";
    }

    public SubscriptionItemPriceChangeDetails(String expectedNewPriceChargeTime, Money money, String priceChangeMode, String priceChangeState) {
        Intrinsics.checkNotNullParameter(expectedNewPriceChargeTime, "expectedNewPriceChargeTime");
        Intrinsics.checkNotNullParameter(priceChangeMode, "priceChangeMode");
        Intrinsics.checkNotNullParameter(priceChangeState, "priceChangeState");
        this.expectedNewPriceChargeTime = expectedNewPriceChargeTime;
        this.newPrice = money;
        this.priceChangeMode = priceChangeMode;
        this.priceChangeState = priceChangeState;
    }

    public final String getExpectedNewPriceChargeTime() {
        return this.expectedNewPriceChargeTime;
    }

    public final Money getNewPrice() {
        return this.newPrice;
    }

    public final String getPriceChangeMode() {
        return this.priceChangeMode;
    }

    public final String getPriceChangeState() {
        return this.priceChangeState;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionItemPriceChangeDetails;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<SubscriptionItemPriceChangeDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public SubscriptionItemPriceChangeDetails fromJson(JSONObject json) {
            Money money;
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("expectedNewPriceChargeTime");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"expectedNewPriceChargeTime\")");
            JSONObject optJSONObject = json.optJSONObject("newPrice");
            if (optJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "optJSONObject(\"newPrice\")");
                money = Money.INSTANCE.fromJson(optJSONObject);
            } else {
                money = null;
            }
            String optString2 = json.optString("priceChangeMode");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(\"priceChangeMode\")");
            String optString3 = json.optString("priceChangeState");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(\"priceChangeState\")");
            return new SubscriptionItemPriceChangeDetails(optString, money, optString2, optString3);
        }
    }
}
