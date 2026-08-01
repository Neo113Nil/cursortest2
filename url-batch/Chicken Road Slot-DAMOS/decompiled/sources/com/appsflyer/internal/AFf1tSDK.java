package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1tSDK extends AFf1sSDK {
    private final AFh1lSDK copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(AFh1lSDK aFh1lSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1lSDK, aFd1zSDK);
        aFh1lSDK.getClass();
        aFd1zSDK.getClass();
        this.copydefault = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        aFh1mSDK.getClass();
        super.AFAdRevenueData(aFh1mSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copydefault.toString;
        aFAdRevenueData.getClass();
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copydefault.equals;
        if (map != null && !map.isEmpty()) {
            List f3 = y.f(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (f3.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        map2.getClass();
        map2.put("ad_network", linkedHashMap3);
    }
}
