package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1hSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1hSDK(long j4, long j5, String str, String str2) {
        this.AFAdRevenueData = j4;
        this.getRevenue = j5;
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1hSDK)) {
            return false;
        }
        AFi1hSDK aFi1hSDK = (AFi1hSDK) obj;
        return this.AFAdRevenueData == aFi1hSDK.AFAdRevenueData && this.getRevenue == aFi1hSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1hSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1hSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        int hashCode = ((Long.hashCode(this.AFAdRevenueData) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.getCurrencyIso4217Code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMonetizationNetwork;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.AFAdRevenueData + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.getCurrencyIso4217Code + ", errorCode=" + this.getMonetizationNetwork + ")";
    }
}
