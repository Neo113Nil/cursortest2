package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFe1xSDK {
    public final AFe1wSDK AFAdRevenueData;
    public final String getMediationNetwork;
    public final String getRevenue;

    public AFe1xSDK(String str, String str2, AFe1wSDK aFe1wSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1wSDK, "");
        this.getMediationNetwork = str;
        this.getRevenue = str2;
        this.AFAdRevenueData = aFe1wSDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFe1xSDK.getMediationNetwork) && Intrinsics.areEqual(this.getRevenue, aFe1xSDK.getRevenue) && this.AFAdRevenueData == aFe1xSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        int hashCode = this.getMediationNetwork.hashCode() * 31;
        String str = this.getRevenue;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.AFAdRevenueData.hashCode();
    }

    public final String toString() {
        return "HostMeta(name=" + this.getMediationNetwork + ", prefix=" + this.getRevenue + ", method=" + this.AFAdRevenueData + ")";
    }
}
