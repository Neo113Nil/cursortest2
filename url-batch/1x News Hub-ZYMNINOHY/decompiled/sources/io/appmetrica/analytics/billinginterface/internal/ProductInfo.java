package io.appmetrica.analytics.billinginterface.internal;

import E1.AbstractC0033i;

/* loaded from: classes.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final Period introductoryPricePeriod;
    public final String priceCurrency;
    public final long priceMicros;
    public final String purchaseOriginalJson;
    public final long purchaseTime;
    public final String purchaseToken;
    public final int quantity;
    public final String signature;
    public final String sku;
    public final Period subscriptionPeriod;
    public final ProductType type;

    public ProductInfo(ProductType productType, String str, int i3, long j3, String str2, long j4, Period period, int i4, Period period2, String str3, String str4, long j5, boolean z, String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i3;
        this.priceMicros = j3;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j4;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i4;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j5;
        this.autoRenewing = z;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.sku.hashCode() + (this.type.hashCode() * 31)) * 31) + this.quantity) * 31;
        long j3 = this.priceMicros;
        int hashCode2 = (this.priceCurrency.hashCode() + ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        long j4 = this.introductoryPriceMicros;
        int i3 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int hashCode3 = (((i3 + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        int hashCode4 = (this.purchaseToken.hashCode() + ((this.signature.hashCode() + ((hashCode3 + (period2 != null ? period2.hashCode() : 0)) * 31)) * 31)) * 31;
        long j5 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((hashCode4 + ((int) ((j5 >>> 32) ^ j5))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductInfo{type=");
        sb.append(this.type);
        sb.append(", sku='");
        sb.append(this.sku);
        sb.append("', quantity=");
        sb.append(this.quantity);
        sb.append(", priceMicros=");
        sb.append(this.priceMicros);
        sb.append(", priceCurrency='");
        sb.append(this.priceCurrency);
        sb.append("', introductoryPriceMicros=");
        sb.append(this.introductoryPriceMicros);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.introductoryPricePeriod);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.introductoryPriceCycles);
        sb.append(", subscriptionPeriod=");
        sb.append(this.subscriptionPeriod);
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append("', purchaseToken='");
        sb.append(this.purchaseToken);
        sb.append("', purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", autoRenewing=");
        sb.append(this.autoRenewing);
        sb.append(", purchaseOriginalJson='");
        return AbstractC0033i.m(sb, this.purchaseOriginalJson, "'}");
    }
}
