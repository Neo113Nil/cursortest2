package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformOneTimePurchaseOfferDetails {
    public static final Companion Companion = new Companion(null);
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformOneTimePurchaseOfferDetails fromList(List<? extends Object> list) {
            long longValue = ((Long) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.Long")).longValue();
            Object obj = list.get(1);
            i.c(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(2);
            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
            return new PlatformOneTimePurchaseOfferDetails(longValue, (String) obj, (String) obj2);
        }

        private Companion() {
        }
    }

    public PlatformOneTimePurchaseOfferDetails(long j4, String formattedPrice, String priceCurrencyCode) {
        i.e(formattedPrice, "formattedPrice");
        i.e(priceCurrencyCode, "priceCurrencyCode");
        this.priceAmountMicros = j4;
        this.formattedPrice = formattedPrice;
        this.priceCurrencyCode = priceCurrencyCode;
    }

    public static /* synthetic */ PlatformOneTimePurchaseOfferDetails copy$default(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails, long j4, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = platformOneTimePurchaseOfferDetails.priceAmountMicros;
        }
        if ((i4 & 2) != 0) {
            str = platformOneTimePurchaseOfferDetails.formattedPrice;
        }
        if ((i4 & 4) != 0) {
            str2 = platformOneTimePurchaseOfferDetails.priceCurrencyCode;
        }
        return platformOneTimePurchaseOfferDetails.copy(j4, str, str2);
    }

    public final long component1() {
        return this.priceAmountMicros;
    }

    public final String component2() {
        return this.formattedPrice;
    }

    public final String component3() {
        return this.priceCurrencyCode;
    }

    public final PlatformOneTimePurchaseOfferDetails copy(long j4, String formattedPrice, String priceCurrencyCode) {
        i.e(formattedPrice, "formattedPrice");
        i.e(priceCurrencyCode, "priceCurrencyCode");
        return new PlatformOneTimePurchaseOfferDetails(j4, formattedPrice, priceCurrencyCode);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformOneTimePurchaseOfferDetails.class)) {
            if (this == obj) {
                return true;
            }
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = (PlatformOneTimePurchaseOfferDetails) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(Long.valueOf(this.priceAmountMicros), Long.valueOf(platformOneTimePurchaseOfferDetails.priceAmountMicros)) && messagesPigeonUtils.deepEquals(this.formattedPrice, platformOneTimePurchaseOfferDetails.formattedPrice) && messagesPigeonUtils.deepEquals(this.priceCurrencyCode, platformOneTimePurchaseOfferDetails.priceCurrencyCode)) {
                return true;
            }
        }
        return false;
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

    public int hashCode() {
        int hashCode = PlatformOneTimePurchaseOfferDetails.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((hashCode + messagesPigeonUtils.deepHash(Long.valueOf(this.priceAmountMicros))) * 31) + messagesPigeonUtils.deepHash(this.formattedPrice)) * 31) + messagesPigeonUtils.deepHash(this.priceCurrencyCode);
    }

    public final List<Object> toList() {
        return j.W(Long.valueOf(this.priceAmountMicros), this.formattedPrice, this.priceCurrencyCode);
    }

    public String toString() {
        return "PlatformOneTimePurchaseOfferDetails(priceAmountMicros=" + this.priceAmountMicros + ", formattedPrice=" + this.formattedPrice + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }
}
