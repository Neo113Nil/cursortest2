package com.appsflyer.api.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.api.AFSerializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTimePurchaseOfferDetails.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "Lcom/appsflyer/api/AFSerializable;", "formattedPrice", "", "priceAmountMicros", "", "priceCurrencyCode", "(Ljava/lang/String;JLjava/lang/String;)V", "getFormattedPrice", "()Ljava/lang/String;", "getPriceAmountMicros", "()J", "getPriceCurrencyCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJsonMap", "", "toString", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class OneTimePurchaseOfferDetails implements AFSerializable {
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;

    public static /* synthetic */ OneTimePurchaseOfferDetails copy$default(OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimePurchaseOfferDetails.formattedPrice;
        }
        if ((i & 2) != 0) {
            j = oneTimePurchaseOfferDetails.priceAmountMicros;
        }
        if ((i & 4) != 0) {
            str2 = oneTimePurchaseOfferDetails.priceCurrencyCode;
        }
        return oneTimePurchaseOfferDetails.copy(str, j, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final OneTimePurchaseOfferDetails copy(String formattedPrice, long priceAmountMicros, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new OneTimePurchaseOfferDetails(formattedPrice, priceAmountMicros, priceCurrencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimePurchaseOfferDetails)) {
            return false;
        }
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) other;
        return Intrinsics.areEqual(this.formattedPrice, oneTimePurchaseOfferDetails.formattedPrice) && this.priceAmountMicros == oneTimePurchaseOfferDetails.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, oneTimePurchaseOfferDetails.priceCurrencyCode);
    }

    public int hashCode() {
        return (((this.formattedPrice.hashCode() * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode();
    }

    public String toString() {
        return "OneTimePurchaseOfferDetails(formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }

    public OneTimePurchaseOfferDetails(String formattedPrice, long j, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.formattedPrice = formattedPrice;
        this.priceAmountMicros = j;
        this.priceCurrencyCode = priceCurrencyCode;
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

    @Override // com.appsflyer.api.AFSerializable
    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode));
    }
}
