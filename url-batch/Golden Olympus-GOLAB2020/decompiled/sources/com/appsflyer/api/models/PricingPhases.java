package com.appsflyer.api.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class PricingPhases implements AFPurchaseConnectorA1z {
    private final int billingCycleCount;
    private final String billingPeriod;
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final int recurrenceMode;

    public PricingPhases(int i4, String str, String str2, long j4, String str3, int i5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.billingCycleCount = i4;
        this.billingPeriod = str;
        this.formattedPrice = str2;
        this.priceAmountMicros = j4;
        this.priceCurrencyCode = str3;
        this.recurrenceMode = i5;
    }

    public static /* synthetic */ PricingPhases copy$default(PricingPhases pricingPhases, int i4, String str, String str2, long j4, String str3, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = pricingPhases.billingCycleCount;
        }
        if ((i6 & 2) != 0) {
            str = pricingPhases.billingPeriod;
        }
        if ((i6 & 4) != 0) {
            str2 = pricingPhases.formattedPrice;
        }
        if ((i6 & 8) != 0) {
            j4 = pricingPhases.priceAmountMicros;
        }
        if ((i6 & 16) != 0) {
            str3 = pricingPhases.priceCurrencyCode;
        }
        if ((i6 & 32) != 0) {
            i5 = pricingPhases.recurrenceMode;
        }
        long j5 = j4;
        String str4 = str2;
        return pricingPhases.copy(i4, str, str4, j5, str3, i5);
    }

    public final int component1() {
        return this.billingCycleCount;
    }

    public final String component2() {
        return this.billingPeriod;
    }

    public final String component3() {
        return this.formattedPrice;
    }

    public final long component4() {
        return this.priceAmountMicros;
    }

    public final String component5() {
        return this.priceCurrencyCode;
    }

    public final int component6() {
        return this.recurrenceMode;
    }

    public final PricingPhases copy(int i4, String str, String str2, long j4, String str3, int i5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PricingPhases(i4, str, str2, j4, str3, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhases)) {
            return false;
        }
        PricingPhases pricingPhases = (PricingPhases) obj;
        return this.billingCycleCount == pricingPhases.billingCycleCount && Intrinsics.areEqual(this.billingPeriod, pricingPhases.billingPeriod) && Intrinsics.areEqual(this.formattedPrice, pricingPhases.formattedPrice) && this.priceAmountMicros == pricingPhases.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, pricingPhases.priceCurrencyCode) && this.recurrenceMode == pricingPhases.recurrenceMode;
    }

    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public final int hashCode() {
        return (((((((((Integer.hashCode(this.billingCycleCount) * 31) + this.billingPeriod.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + Integer.hashCode(this.recurrenceMode);
    }

    public final Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("billing_cycle_count", Integer.valueOf(this.billingCycleCount)), TuplesKt.to("billing_period", this.billingPeriod), TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode), TuplesKt.to("recurrence_mode", Integer.valueOf(this.recurrenceMode)));
    }

    public final String toString() {
        return "PricingPhases(billingCycleCount=" + this.billingCycleCount + ", billingPeriod=" + this.billingPeriod + ", formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", recurrenceMode=" + this.recurrenceMode + ")";
    }
}
