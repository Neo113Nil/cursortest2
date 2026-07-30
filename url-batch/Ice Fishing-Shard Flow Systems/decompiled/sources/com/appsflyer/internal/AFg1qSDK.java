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
public final class AFg1qSDK extends AFe1bSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFh1uSDK copy;
    private Map<String, Object> copydefault;
    private final AFd1mSDK equals;
    private final AFc1jSDK hashCode;
    private String registerClient;
    private final AFc1kSDK toString;

    public AFg1qSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.GCDSDK, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, aFd1zSDK, "GCD-FETCH");
        this.equals = aFd1zSDK.getRevenue();
        this.hashCode = aFd1zSDK.getMediationNetwork();
        this.copy = aFd1zSDK.component2();
        this.toString = aFd1zSDK.AFAdRevenueData();
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
        this.getMediationNetwork.add(AFe1lSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final AFe1rSDK getMediationNetwork() {
        AFe1rSDK aFe1rSDK;
        AFe1rSDK aFe1rSDK2;
        if (((AFe1bSDK) this).component1.getRevenue()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.registerClient = "'isStopTracking' enabled";
            throw new AFe1nSDK();
        }
        AFe1rSDK aFe1rSDK3 = AFe1rSDK.FAILURE;
        int i2 = 0;
        while (i2 <= 2) {
            boolean z7 = true;
            boolean z8 = i2 >= 2;
            this.copy.copydefault = System.currentTimeMillis();
            try {
                try {
                    aFe1rSDK = super.getMediationNetwork();
                    ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z7 = false;
                        }
                        if (!responseNetwork.isSuccessful() && statusCode != 404) {
                            if (!z8) {
                                if (!z7) {
                                }
                            }
                            this.registerClient = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1rSDK2 = AFe1rSDK.FAILURE;
                            return aFe1rSDK2;
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
                            this.hashCode.getRevenue("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                AFLogger.afDebugLog(sb.toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.hashCode.getMediationNetwork("attributionId", new JSONObject(map).toString());
                        if (!this.hashCode.getRevenue("sixtyDayConversionData")) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.copydefault = map;
                        aFe1rSDK2 = AFe1rSDK.SUCCESS;
                        return aFe1rSDK2;
                    }
                } catch (AFe1pSDK e7) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.registerClient = "AppsFlyer dev key is missing";
                    throw e7;
                } catch (Exception e8) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e8.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e8, false, false);
                    aFe1rSDK = AFe1rSDK.FAILURE;
                    if (z8) {
                        this.registerClient = e8.getMessage();
                        throw e8;
                    }
                }
                aFe1rSDK3 = aFe1rSDK;
                i2++;
            } finally {
                this.copy.getRevenue(i2);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1rSDK3;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        Map<String, Object> map = this.copydefault;
        String str = this.registerClient;
        if (map != null) {
            AFg1oSDK.getMonetizationNetwork(map);
        } else if (str == null || str.isEmpty()) {
            AFg1oSDK.AFAdRevenueData("Unknown error");
        } else {
            AFg1oSDK.AFAdRevenueData(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<Map<String, Object>> getRevenue(String str) {
        String str2;
        String str3 = (String) AFa1tSDK.getMonetizationNetwork(new Object[]{this.hashCode, this.toString.component1()}, -195097357, 195097363, (int) System.currentTimeMillis());
        if (str3 != null && !str3.trim().isEmpty()) {
            if (!component2.contains(str3.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(str3);
                AFd1fSDK<Map<String, Object>> revenue = this.equals.getRevenue(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(revenue.getMediationNetwork.AFAdRevenueData);
                AFLogger.afInfoLog(sb.toString());
                return revenue;
            }
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + str3 + ". Using without channel postfix.");
        }
        str2 = "";
        AFd1fSDK<Map<String, Object>> revenue2 = this.equals.getRevenue(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(revenue2.getMediationNetwork.AFAdRevenueData);
        AFLogger.afInfoLog(sb2.toString());
        return revenue2;
    }
}
