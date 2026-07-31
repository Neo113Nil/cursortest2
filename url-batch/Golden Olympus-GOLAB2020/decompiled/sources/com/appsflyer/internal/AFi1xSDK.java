package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFi1xSDK {
    public final String AFAdRevenueData;
    public final String component2;
    public List<String> getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final int getMonetizationNetwork;
    public final float getRevenue;

    public AFi1xSDK(long j4, float f4, List<String> list, int i4, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMediationNetwork = j4;
        this.getRevenue = f4;
        this.getCurrencyIso4217Code = list;
        this.getMonetizationNetwork = i4;
        this.AFAdRevenueData = str;
        this.component2 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1xSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return this.getMediationNetwork == aFi1xSDK.getMediationNetwork && this.getRevenue == aFi1xSDK.getRevenue && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFi1xSDK.getMonetizationNetwork && Intrinsics.areEqual(this.AFAdRevenueData, aFi1xSDK.AFAdRevenueData) && Intrinsics.areEqual(this.component2, aFi1xSDK.component2);
    }

    public final boolean getCurrencyIso4217Code() {
        return TimeUnit.SECONDS.toMillis(this.getMediationNetwork) > ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().component3().AFAdRevenueData();
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.getMediationNetwork) * 31) + Float.hashCode(this.getRevenue)) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getMonetizationNetwork) * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.component2.hashCode();
    }
}
