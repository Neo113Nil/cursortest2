package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformPricingPhase {
    public static final Companion Companion = new Companion(null);
    private final long billingCycleCount;
    private final String billingPeriod;
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final PlatformRecurrenceMode recurrenceMode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformPricingPhase fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformRecurrenceMode");
            PlatformRecurrenceMode platformRecurrenceMode = (PlatformRecurrenceMode) obj;
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue2 = ((Long) obj2).longValue();
            Object obj3 = list.get(3);
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(4);
            i.c(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(5);
            i.c(obj5, "null cannot be cast to non-null type kotlin.String");
            return new PlatformPricingPhase(longValue, platformRecurrenceMode, longValue2, str, (String) obj4, (String) obj5);
        }

        private Companion() {
        }
    }

    public PlatformPricingPhase(long j4, PlatformRecurrenceMode recurrenceMode, long j5, String billingPeriod, String formattedPrice, String priceCurrencyCode) {
        i.e(recurrenceMode, "recurrenceMode");
        i.e(billingPeriod, "billingPeriod");
        i.e(formattedPrice, "formattedPrice");
        i.e(priceCurrencyCode, "priceCurrencyCode");
        this.billingCycleCount = j4;
        this.recurrenceMode = recurrenceMode;
        this.priceAmountMicros = j5;
        this.billingPeriod = billingPeriod;
        this.formattedPrice = formattedPrice;
        this.priceCurrencyCode = priceCurrencyCode;
    }

    public static /* synthetic */ PlatformPricingPhase copy$default(PlatformPricingPhase platformPricingPhase, long j4, PlatformRecurrenceMode platformRecurrenceMode, long j5, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = platformPricingPhase.billingCycleCount;
        }
        long j6 = j4;
        if ((i4 & 2) != 0) {
            platformRecurrenceMode = platformPricingPhase.recurrenceMode;
        }
        PlatformRecurrenceMode platformRecurrenceMode2 = platformRecurrenceMode;
        if ((i4 & 4) != 0) {
            j5 = platformPricingPhase.priceAmountMicros;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            str = platformPricingPhase.billingPeriod;
        }
        return platformPricingPhase.copy(j6, platformRecurrenceMode2, j7, str, (i4 & 16) != 0 ? platformPricingPhase.formattedPrice : str2, (i4 & 32) != 0 ? platformPricingPhase.priceCurrencyCode : str3);
    }

    public final long component1() {
        return this.billingCycleCount;
    }

    public final PlatformRecurrenceMode component2() {
        return this.recurrenceMode;
    }

    public final long component3() {
        return this.priceAmountMicros;
    }

    public final String component4() {
        return this.billingPeriod;
    }

    public final String component5() {
        return this.formattedPrice;
    }

    public final String component6() {
        return this.priceCurrencyCode;
    }

    public final PlatformPricingPhase copy(long j4, PlatformRecurrenceMode recurrenceMode, long j5, String billingPeriod, String formattedPrice, String priceCurrencyCode) {
        i.e(recurrenceMode, "recurrenceMode");
        i.e(billingPeriod, "billingPeriod");
        i.e(formattedPrice, "formattedPrice");
        i.e(priceCurrencyCode, "priceCurrencyCode");
        return new PlatformPricingPhase(j4, recurrenceMode, j5, billingPeriod, formattedPrice, priceCurrencyCode);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformPricingPhase.class)) {
            if (this == obj) {
                return true;
            }
            PlatformPricingPhase platformPricingPhase = (PlatformPricingPhase) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(Long.valueOf(this.billingCycleCount), Long.valueOf(platformPricingPhase.billingCycleCount)) && messagesPigeonUtils.deepEquals(this.recurrenceMode, platformPricingPhase.recurrenceMode) && messagesPigeonUtils.deepEquals(Long.valueOf(this.priceAmountMicros), Long.valueOf(platformPricingPhase.priceAmountMicros)) && messagesPigeonUtils.deepEquals(this.billingPeriod, platformPricingPhase.billingPeriod) && messagesPigeonUtils.deepEquals(this.formattedPrice, platformPricingPhase.formattedPrice) && messagesPigeonUtils.deepEquals(this.priceCurrencyCode, platformPricingPhase.priceCurrencyCode)) {
                return true;
            }
        }
        return false;
    }

    public final long getBillingCycleCount() {
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

    public final PlatformRecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int hashCode = PlatformPricingPhase.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((((((((hashCode + messagesPigeonUtils.deepHash(Long.valueOf(this.billingCycleCount))) * 31) + messagesPigeonUtils.deepHash(this.recurrenceMode)) * 31) + messagesPigeonUtils.deepHash(Long.valueOf(this.priceAmountMicros))) * 31) + messagesPigeonUtils.deepHash(this.billingPeriod)) * 31) + messagesPigeonUtils.deepHash(this.formattedPrice)) * 31) + messagesPigeonUtils.deepHash(this.priceCurrencyCode);
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.billingCycleCount), this.recurrenceMode, Long.valueOf(this.priceAmountMicros), this.billingPeriod, this.formattedPrice, this.priceCurrencyCode);
    }

    public String toString() {
        long j4 = this.billingCycleCount;
        PlatformRecurrenceMode platformRecurrenceMode = this.recurrenceMode;
        long j5 = this.priceAmountMicros;
        String str = this.billingPeriod;
        String str2 = this.formattedPrice;
        String str3 = this.priceCurrencyCode;
        StringBuilder sb = new StringBuilder("PlatformPricingPhase(billingCycleCount=");
        sb.append(j4);
        sb.append(", recurrenceMode=");
        sb.append(platformRecurrenceMode);
        sb.append(", priceAmountMicros=");
        sb.append(j5);
        sb.append(", billingPeriod=");
        sb.append(str);
        sb.append(", formattedPrice=");
        sb.append(str2);
        sb.append(", priceCurrencyCode=");
        return AbstractC0005f.q(sb, str3, ")");
    }
}
