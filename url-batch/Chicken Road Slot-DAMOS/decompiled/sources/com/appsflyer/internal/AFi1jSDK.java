package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFi1jSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getRevenue;

    public AFi1jSDK(long j, long j3, String str, String str2) {
        this.getMediationNetwork = j;
        this.getCurrencyIso4217Code = j3;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1jSDK)) {
            return false;
        }
        AFi1jSDK aFi1jSDK = (AFi1jSDK) obj;
        return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.a(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.a(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        int c10 = n0.l.c(Long.hashCode(this.getMediationNetwork) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.getRevenue;
        int hashCode = (c10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.getMediationNetwork;
        long j3 = this.getCurrencyIso4217Code;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder sb2 = new StringBuilder("PlayIntegrityApiData(piaTimestamp=");
        sb2.append(j);
        sb2.append(", ttrMillis=");
        sb2.append(j3);
        sb2.append(", piaToken=");
        sb2.append(str);
        return v4.a.p(sb2, ", errorCode=", str2, ")");
    }
}
