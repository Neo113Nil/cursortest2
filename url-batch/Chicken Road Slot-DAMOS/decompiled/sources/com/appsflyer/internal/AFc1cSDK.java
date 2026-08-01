package com.appsflyer.internal;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface AFc1cSDK {
    String AFAdRevenueData(Throwable th, String str);

    void getCurrencyIso4217Code(int i3, int i10);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(String... strArr);

    List<AFc1aSDK> getRevenue();
}
