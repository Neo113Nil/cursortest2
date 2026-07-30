package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final String getRevenue;

    public AFf1fSDK(int i2, int i5, int i7, int i8, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i2;
        this.getMediationNetwork = i5;
        this.getMonetizationNetwork = i7;
        this.AFAdRevenueData = i8;
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
        return this.getRevenue.hashCode() + ((Integer.hashCode(this.AFAdRevenueData) + ((Integer.hashCode(this.getMonetizationNetwork) + ((Integer.hashCode(this.getMediationNetwork) + (Integer.hashCode(this.getCurrencyIso4217Code) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i2 = this.getCurrencyIso4217Code;
        int i5 = this.getMediationNetwork;
        int i7 = this.getMonetizationNetwork;
        int i8 = this.AFAdRevenueData;
        String str = this.getRevenue;
        StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
        sb.append(i2);
        sb.append(", gdprApplies=");
        sb.append(i5);
        sb.append(", cmpSdkId=");
        sb.append(i7);
        sb.append(", cmpSdkVersion=");
        sb.append(i8);
        sb.append(", tcString=");
        return r4.f.f(sb, str, ")");
    }
}
