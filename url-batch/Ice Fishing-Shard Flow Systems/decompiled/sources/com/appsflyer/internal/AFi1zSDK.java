package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final String AFAdRevenueData;
    public final String component3;
    public final float getCurrencyIso4217Code;
    public List<String> getMediationNetwork;
    public long getMonetizationNetwork;
    public final int getRevenue;

    public AFi1zSDK(long j, float f7, List<String> list, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMonetizationNetwork = j;
        this.getCurrencyIso4217Code = f7;
        this.getMediationNetwork = list;
        this.getRevenue = i2;
        this.AFAdRevenueData = str;
        this.component3 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFi1zSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return this.getMonetizationNetwork == aFi1zSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1zSDK.getCurrencyIso4217Code && Intrinsics.a(this.getMediationNetwork, aFi1zSDK.getMediationNetwork) && this.getRevenue == aFi1zSDK.getRevenue && Intrinsics.a(this.AFAdRevenueData, aFi1zSDK.AFAdRevenueData) && Intrinsics.a(this.component3, aFi1zSDK.component3);
    }

    public final boolean getMonetizationNetwork() {
        return TimeUnit.SECONDS.toMillis(this.getMonetizationNetwork) > AFa1tSDK.getMediationNetwork().getRevenue().areAllFieldsValid().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return this.component3.hashCode() + ((this.AFAdRevenueData.hashCode() + ((((this.getMediationNetwork.hashCode() + ((Float.hashCode(this.getCurrencyIso4217Code) + (Long.hashCode(this.getMonetizationNetwork) * 31)) * 31)) * 31) + this.getRevenue) * 31)) * 31);
    }
}
