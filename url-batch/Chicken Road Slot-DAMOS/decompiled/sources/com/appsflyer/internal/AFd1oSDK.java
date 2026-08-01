package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface AFd1oSDK {
    void AFAdRevenueData(String str, int i3, String str2);

    boolean AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(String str, String str2);

    void getRevenue();

    void getRevenue(String str, String str2);

    void getRevenue(String str, String... strArr);

    void getRevenue(Throwable th);

    void q_(String str, PackageManager packageManager);
}
