package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFg1zSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1zSDK(int i4, int i5, int i6, int i7, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i4;
        this.getCurrencyIso4217Code = i5;
        this.getRevenue = i6;
        this.AFAdRevenueData = i7;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1zSDK)) {
            return false;
        }
        AFg1zSDK aFg1zSDK = (AFg1zSDK) obj;
        return this.getMonetizationNetwork == aFg1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1zSDK.getCurrencyIso4217Code && this.getRevenue == aFg1zSDK.getRevenue && this.AFAdRevenueData == aFg1zSDK.AFAdRevenueData && Intrinsics.areEqual(this.getMediationNetwork, aFg1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getMonetizationNetwork) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getMonetizationNetwork + ", gdprApplies=" + this.getCurrencyIso4217Code + ", cmpSdkId=" + this.getRevenue + ", cmpSdkVersion=" + this.AFAdRevenueData + ", tcString=" + this.getMediationNetwork + ")";
    }
}
