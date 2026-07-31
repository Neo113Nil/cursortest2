package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1rSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    private final boolean getMonetizationNetwork;
    public final String getRevenue;

    public AFi1rSDK(String str, String str2, String str3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = str2;
        this.AFAdRevenueData = str3;
        this.getMonetizationNetwork = z4;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork;
    }
}
