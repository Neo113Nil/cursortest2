package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import defpackage.hk0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFf1eSDK implements AFf1gSDK {
    private final AFc1gSDK AFAdRevenueData;
    private final AFf1cSDK getCurrencyIso4217Code;
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFf1eSDK(AFf1cSDK aFf1cSDK, AFc1gSDK aFc1gSDK, AppsFlyerProperties appsFlyerProperties) {
        aFf1cSDK.getClass();
        aFc1gSDK.getClass();
        appsFlyerProperties.getClass();
        this.getCurrencyIso4217Code = aFf1cSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, AFe1lSDK aFe1lSDK) {
        map.getClass();
        aFe1lSDK.getClass();
        AFf1fSDK mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.AFAdRevenueData.areAllFieldsValid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean isUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (isUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", isUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (mediationNetwork != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.AFAdRevenueData));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", mediationNetwork.getRevenue);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1lSDK != AFe1lSDK.CONVERSION || this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(map);
        monetizationNetwork.getClass();
        monetizationNetwork.put("api", hk0.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
