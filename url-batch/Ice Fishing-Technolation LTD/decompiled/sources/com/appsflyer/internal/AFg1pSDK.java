package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1pSDK extends AFe1fSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFInAppEventType;
    private Map<String, Object> copy;
    private final AFd1nSDK copydefault;
    private final AFc1oSDK equals;
    private final AFc1qSDK hashCode;
    private final AFh1xSDK toString;

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    public AFg1pSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.GCDSDK, new AFe1pSDK[]{AFe1pSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.copydefault = aFd1zSDK.getRevenue();
        this.hashCode = aFd1zSDK.component4();
        this.toString = aFd1zSDK.areAllFieldsValid();
        this.equals = aFd1zSDK.AFAdRevenueData();
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFe1pSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.copy;
        String str = this.AFInAppEventType;
        if (map != null) {
            AFg1oSDK.getCurrencyIso4217Code(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1oSDK.getRevenue(str);
        } else {
            AFg1oSDK.getRevenue("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK
    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(String str) {
        String str2;
        String AFAdRevenueData = AFa1ySDK.AFAdRevenueData(this.hashCode, this.equals.component3());
        if (AFAdRevenueData != null && !AFAdRevenueData.trim().isEmpty()) {
            if (!component2.contains(AFAdRevenueData.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(AFAdRevenueData));
                AFd1hSDK<Map<String, Object>> monetizationNetwork = this.copydefault.getMonetizationNetwork(str2, str);
                AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(monetizationNetwork.getMonetizationNetwork.getMediationNetwork).toString());
                return monetizationNetwork;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFAdRevenueData));
        }
        str2 = "";
        AFd1hSDK<Map<String, Object>> monetizationNetwork2 = this.copydefault.getMonetizationNetwork(str2, str);
        AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(monetizationNetwork2.getMonetizationNetwork.getMediationNetwork).toString());
        return monetizationNetwork2;
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        AFe1uSDK aFe1uSDK;
        AFe1uSDK aFe1uSDK2;
        if (((AFe1fSDK) this).component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFInAppEventType = "'isStopTracking' enabled";
            throw new AFe1iSDK();
        }
        AFe1uSDK aFe1uSDK3 = AFe1uSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.toString.toString = System.currentTimeMillis();
            try {
                try {
                    try {
                        aFe1uSDK = super.getRevenue();
                        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            if (statusCode != 403 && statusCode < 500) {
                                z = false;
                            }
                            if (!responseNetwork.isSuccessful() && statusCode != 404) {
                                if (!z2) {
                                    if (!z) {
                                    }
                                }
                                this.AFInAppEventType = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFe1uSDK2 = AFe1uSDK.FAILURE;
                                return aFe1uSDK2;
                            }
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.hashCode.AFAdRevenueData("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.hashCode.getRevenue("attributionId", new JSONObject(map).toString());
                            if (!this.hashCode.getMediationNetwork("sixtyDayConversionData", false)) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.copy = map;
                            aFe1uSDK2 = AFe1uSDK.SUCCESS;
                            return aFe1uSDK2;
                        }
                    } catch (Exception e) {
                        AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e.getMessage()).toString(), e, false, false);
                        aFe1uSDK = AFe1uSDK.FAILURE;
                        if (z2) {
                            this.AFInAppEventType = e.getMessage();
                            throw e;
                        }
                    }
                    aFe1uSDK3 = aFe1uSDK;
                    i++;
                } catch (AFe1nSDK e2) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFInAppEventType = "AppsFlyer dev key is missing";
                    throw e2;
                }
            } finally {
                this.toString.getMonetizationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1uSDK3;
    }
}
