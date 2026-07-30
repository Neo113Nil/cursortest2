package com.appsflyer.internal;

import defpackage.qy0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final String getRevenue;

    public AFf1fSDK(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i;
        this.getMediationNetwork = i2;
        this.getMonetizationNetwork = i3;
        this.AFAdRevenueData = i4;
        this.getRevenue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        return this.getCurrencyIso4217Code == aFf1fSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && Intrinsics.a(this.getRevenue, aFf1fSDK.getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + qy0.c(this.AFAdRevenueData, qy0.c(this.getMonetizationNetwork, qy0.c(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getCurrencyIso4217Code + ", gdprApplies=" + this.getMediationNetwork + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.AFAdRevenueData + ", tcString=" + this.getRevenue + ")";
    }
}
