package com.appsflyer.internal;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface AFd1xSDK {

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public interface AFa1tSDK {
        void onConfigurationChanged(boolean z);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(Throwable th, String str);

    void getMonetizationNetwork(AFa1tSDK aFa1tSDK);

    void getRevenue();
}
