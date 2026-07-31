package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.models.SubscriptionPurchase;
import com.appsflyer.internal.models.ValidationFailureData;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionValidationResult.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "", FirebaseAnalytics.Param.SUCCESS, "", "subscriptionPurchase", "Lcom/appsflyer/internal/models/SubscriptionPurchase;", "failureData", "Lcom/appsflyer/internal/models/ValidationFailureData;", "(ZLcom/appsflyer/internal/models/SubscriptionPurchase;Lcom/appsflyer/internal/models/ValidationFailureData;)V", "getFailureData", "()Lcom/appsflyer/internal/models/ValidationFailureData;", "getSubscriptionPurchase", "()Lcom/appsflyer/internal/models/SubscriptionPurchase;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SubscriptionValidationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ValidationFailureData failureData;
    private final SubscriptionPurchase subscriptionPurchase;
    private final boolean success;

    public static /* synthetic */ SubscriptionValidationResult copy$default(SubscriptionValidationResult subscriptionValidationResult, boolean z, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = subscriptionValidationResult.success;
        }
        if ((i & 2) != 0) {
            subscriptionPurchase = subscriptionValidationResult.subscriptionPurchase;
        }
        if ((i & 4) != 0) {
            validationFailureData = subscriptionValidationResult.failureData;
        }
        return subscriptionValidationResult.copy(z, subscriptionPurchase, validationFailureData);
    }

    @JvmStatic
    public static SubscriptionValidationResult fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    /* renamed from: component3, reason: from getter */
    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    public final SubscriptionValidationResult copy(boolean success, SubscriptionPurchase subscriptionPurchase, ValidationFailureData failureData) {
        return new SubscriptionValidationResult(success, subscriptionPurchase, failureData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionValidationResult)) {
            return false;
        }
        SubscriptionValidationResult subscriptionValidationResult = (SubscriptionValidationResult) other;
        return this.success == subscriptionValidationResult.success && Intrinsics.areEqual(this.subscriptionPurchase, subscriptionValidationResult.subscriptionPurchase) && Intrinsics.areEqual(this.failureData, subscriptionValidationResult.failureData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        SubscriptionPurchase subscriptionPurchase = this.subscriptionPurchase;
        int hashCode = (i + (subscriptionPurchase == null ? 0 : subscriptionPurchase.hashCode())) * 31;
        ValidationFailureData validationFailureData = this.failureData;
        return hashCode + (validationFailureData != null ? validationFailureData.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionValidationResult(success=" + this.success + ", subscriptionPurchase=" + this.subscriptionPurchase + ", failureData=" + this.failureData + ")";
    }

    public SubscriptionValidationResult(boolean z, SubscriptionPurchase subscriptionPurchase, ValidationFailureData validationFailureData) {
        this.success = z;
        this.subscriptionPurchase = subscriptionPurchase;
        this.failureData = validationFailureData;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final SubscriptionPurchase getSubscriptionPurchase() {
        return this.subscriptionPurchase;
    }

    public final ValidationFailureData getFailureData() {
        return this.failureData;
    }

    /* compiled from: SubscriptionValidationResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscriptionValidationResult$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<SubscriptionValidationResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @JvmStatic
        public SubscriptionValidationResult fromJson(JSONObject json) {
            SubscriptionPurchase subscriptionPurchase;
            Intrinsics.checkNotNullParameter(json, "json");
            boolean optBoolean = json.optBoolean("result");
            ValidationFailureData validationFailureData = null;
            if (json.has("subscription_purchase")) {
                SubscriptionPurchase.Companion companion = SubscriptionPurchase.INSTANCE;
                JSONObject jSONObject = json.getJSONObject("subscription_purchase");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(\"subscription_purchase\")");
                subscriptionPurchase = companion.fromJson(jSONObject);
            } else {
                subscriptionPurchase = null;
            }
            if (json.has("failure_data")) {
                ValidationFailureData.Companion companion2 = ValidationFailureData.INSTANCE;
                JSONObject jSONObject2 = json.getJSONObject("failure_data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(\"failure_data\")");
                validationFailureData = companion2.fromJson(jSONObject2);
            }
            return new SubscriptionValidationResult(optBoolean, subscriptionPurchase, validationFailureData);
        }
    }
}
