package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface AFg1vSDK {
    void AFAdRevenueData(AFh1sSDK aFh1sSDK);

    void AFAdRevenueData(Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK);

    void getCurrencyIso4217Code(Map<String, Object> map);

    void getMediationNetwork(AFh1sSDK aFh1sSDK);

    void getMediationNetwork(Map<String, Object> map);

    void getMonetizationNetwork(AFh1sSDK aFh1sSDK);

    void getMonetizationNetwork(Map<String, Object> map, int i, int i2);

    void getRevenue(AFh1sSDK aFh1sSDK);

    void getRevenue(Map<String, Object> map);

    void getRevenue(Map<String, Object> map, AFe1lSDK aFe1lSDK);
}
