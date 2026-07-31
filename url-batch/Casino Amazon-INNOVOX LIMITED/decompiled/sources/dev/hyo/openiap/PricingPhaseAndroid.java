package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Ldev/hyo/openiap/PricingPhaseAndroid;", "", "billingCycleCount", "", "billingPeriod", "", "formattedPrice", "priceAmountMicros", "priceCurrencyCode", "recurrenceMode", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBillingCycleCount", "()I", "getBillingPeriod", "()Ljava/lang/String;", "getFormattedPrice", "getPriceAmountMicros", "getPriceCurrencyCode", "getRecurrenceMode", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PricingPhaseAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int billingCycleCount;
    private final String billingPeriod;
    private final String formattedPrice;
    private final String priceAmountMicros;
    private final String priceCurrencyCode;
    private final int recurrenceMode;

    public static /* synthetic */ PricingPhaseAndroid copy$default(PricingPhaseAndroid pricingPhaseAndroid, int i, String str, String str2, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pricingPhaseAndroid.billingCycleCount;
        }
        if ((i3 & 2) != 0) {
            str = pricingPhaseAndroid.billingPeriod;
        }
        if ((i3 & 4) != 0) {
            str2 = pricingPhaseAndroid.formattedPrice;
        }
        if ((i3 & 8) != 0) {
            str3 = pricingPhaseAndroid.priceAmountMicros;
        }
        if ((i3 & 16) != 0) {
            str4 = pricingPhaseAndroid.priceCurrencyCode;
        }
        if ((i3 & 32) != 0) {
            i2 = pricingPhaseAndroid.recurrenceMode;
        }
        String str5 = str4;
        int i4 = i2;
        return pricingPhaseAndroid.copy(i, str, str2, str3, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public final PricingPhaseAndroid copy(int billingCycleCount, String billingPeriod, String formattedPrice, String priceAmountMicros, String priceCurrencyCode, int recurrenceMode) {
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhaseAndroid(billingCycleCount, billingPeriod, formattedPrice, priceAmountMicros, priceCurrencyCode, recurrenceMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricingPhaseAndroid)) {
            return false;
        }
        PricingPhaseAndroid pricingPhaseAndroid = (PricingPhaseAndroid) other;
        return this.billingCycleCount == pricingPhaseAndroid.billingCycleCount && Intrinsics.areEqual(this.billingPeriod, pricingPhaseAndroid.billingPeriod) && Intrinsics.areEqual(this.formattedPrice, pricingPhaseAndroid.formattedPrice) && Intrinsics.areEqual(this.priceAmountMicros, pricingPhaseAndroid.priceAmountMicros) && Intrinsics.areEqual(this.priceCurrencyCode, pricingPhaseAndroid.priceCurrencyCode) && this.recurrenceMode == pricingPhaseAndroid.recurrenceMode;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.billingCycleCount) * 31) + this.billingPeriod.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31) + this.priceAmountMicros.hashCode()) * 31) + this.priceCurrencyCode.hashCode()) * 31) + Integer.hashCode(this.recurrenceMode);
    }

    public String toString() {
        return "PricingPhaseAndroid(billingCycleCount=" + this.billingCycleCount + ", billingPeriod=" + this.billingPeriod + ", formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", recurrenceMode=" + this.recurrenceMode + ")";
    }

    public PricingPhaseAndroid(int i, String billingPeriod, String formattedPrice, String priceAmountMicros, String priceCurrencyCode, int i2) {
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceAmountMicros, "priceAmountMicros");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.billingCycleCount = i;
        this.billingPeriod = billingPeriod;
        this.formattedPrice = formattedPrice;
        this.priceAmountMicros = priceAmountMicros;
        this.priceCurrencyCode = priceCurrencyCode;
        this.recurrenceMode = i2;
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

    public final String getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PricingPhaseAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PricingPhaseAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PricingPhaseAndroid fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("billingCycleCount");
            Number number = obj instanceof Number ? (Number) obj : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj2 = json.get("billingPeriod");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                str = "";
            }
            Object obj3 = json.get("formattedPrice");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj4 = json.get("priceAmountMicros");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            if (str3 == null) {
                str3 = "";
            }
            Object obj5 = json.get("priceCurrencyCode");
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            String str5 = str4 != null ? str4 : "";
            Object obj6 = json.get("recurrenceMode");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            return new PricingPhaseAndroid(intValue, str, str2, str3, str5, number2 != null ? number2.intValue() : 0);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "PricingPhaseAndroid"), TuplesKt.to("billingCycleCount", Integer.valueOf(this.billingCycleCount)), TuplesKt.to("billingPeriod", this.billingPeriod), TuplesKt.to("formattedPrice", this.formattedPrice), TuplesKt.to("priceAmountMicros", this.priceAmountMicros), TuplesKt.to("priceCurrencyCode", this.priceCurrencyCode), TuplesKt.to("recurrenceMode", Integer.valueOf(this.recurrenceMode)));
    }
}
