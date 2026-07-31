package com.appsflyer.internal;

import java.util.List;

/* loaded from: classes.dex */
public interface AFc1aSDK {
    String AFAdRevenueData(Throwable th, String str);

    void AFAdRevenueData(int i4, int i5);

    int getCurrencyIso4217Code();

    List<AFc1cSDK> getMediationNetwork();

    boolean getMonetizationNetwork();

    boolean getRevenue(String... strArr);
}
