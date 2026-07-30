package com.appsflyer.internal;

/* loaded from: classes.dex */
public interface AFd1xSDK {

    public interface AFa1tSDK {
        void onConfigurationChanged(boolean z7);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(Throwable th, String str);

    void getMonetizationNetwork(AFa1tSDK aFa1tSDK);

    void getRevenue();
}
