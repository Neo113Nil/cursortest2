package com.appsflyer.internal;

import defpackage.qy0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFi1mSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFi1mSDK(long j, long j2, String str, String str2) {
        this.getMonetizationNetwork = j;
        this.getCurrencyIso4217Code = j2;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1mSDK)) {
            return false;
        }
        AFi1mSDK aFi1mSDK = (AFi1mSDK) obj;
        return this.getMonetizationNetwork == aFi1mSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1mSDK.getCurrencyIso4217Code && Intrinsics.a(this.AFAdRevenueData, aFi1mSDK.AFAdRevenueData) && Intrinsics.a(this.getMediationNetwork, aFi1mSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int e = qy0.e(this.getCurrencyIso4217Code, Long.hashCode(this.getMonetizationNetwork) * 31, 31);
        String str = this.AFAdRevenueData;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getCurrencyIso4217Code + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getMediationNetwork + ")";
    }
}
