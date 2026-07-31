package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    public final Throwable component1;
    public final String component3;
    public final AFi1ySDK component4;
    public final String getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1vSDK(String str, String str2, long j4, long j5, int i4, AFi1ySDK aFi1ySDK, String str3, Throwable th) {
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j4;
        this.getMediationNetwork = j5;
        this.getMonetizationNetwork = i4;
        this.component4 = aFi1ySDK;
        this.component3 = str3;
        this.component1 = th;
    }
}
