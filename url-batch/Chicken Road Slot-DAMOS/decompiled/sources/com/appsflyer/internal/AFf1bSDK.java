package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1bSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final String getMonetizationNetwork;
    final int getRevenue;

    public AFf1bSDK(int i3, int i10, int i11, int i12, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i3;
        this.getMediationNetwork = i10;
        this.AFAdRevenueData = i11;
        this.getRevenue = i12;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.a(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + v4.a.x(this.getRevenue, v4.a.x(this.AFAdRevenueData, v4.a.x(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i3 = this.getCurrencyIso4217Code;
        int i10 = this.getMediationNetwork;
        int i11 = this.AFAdRevenueData;
        int i12 = this.getRevenue;
        String str = this.getMonetizationNetwork;
        StringBuilder sb2 = new StringBuilder("CmpTcfData(policyVersion=");
        sb2.append(i3);
        sb2.append(", gdprApplies=");
        sb2.append(i10);
        sb2.append(", cmpSdkId=");
        sb2.append(i11);
        sb2.append(", cmpSdkVersion=");
        sb2.append(i12);
        sb2.append(", tcString=");
        return v4.a.o(sb2, str, ")");
    }
}
