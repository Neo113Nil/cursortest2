package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/appsflyer/internal/models/Money;", "", AppsFlyerProperties.CURRENCY_CODE, "", "nanos", "", "units", "(Ljava/lang/String;JJ)V", "getCurrencyCode", "()Ljava/lang/String;", "getNanos", "()J", "getUnits", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class Money {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currencyCode;
    private final long nanos;
    private final long units;

    public static /* synthetic */ Money copy$default(Money money, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = money.currencyCode;
        }
        if ((i & 2) != 0) {
            j = money.nanos;
        }
        if ((i & 4) != 0) {
            j2 = money.units;
        }
        return money.copy(str, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNanos() {
        return this.nanos;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUnits() {
        return this.units;
    }

    public final Money copy(String currencyCode, long nanos, long units) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new Money(currencyCode, nanos, units);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return Intrinsics.areEqual(this.currencyCode, money.currencyCode) && this.nanos == money.nanos && this.units == money.units;
    }

    public int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + Long.hashCode(this.nanos)) * 31) + Long.hashCode(this.units);
    }

    public String toString() {
        return "Money(currencyCode=" + this.currencyCode + ", nanos=" + this.nanos + ", units=" + this.units + ")";
    }

    public Money(String currencyCode, long j, long j2) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.currencyCode = currencyCode;
        this.nanos = j;
        this.units = j2;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final long getNanos() {
        return this.nanos;
    }

    public final long getUnits() {
        return this.units;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/Money$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/Money;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<Money> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public Money fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString(AppsFlyerProperties.CURRENCY_CODE);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"currencyCode\")");
            return new Money(optString, json.getLong("nanos"), json.getLong("units"));
        }
    }
}
