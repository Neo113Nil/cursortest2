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

/* loaded from: classes3.dex */
public final class AFg1lSDK extends AFf1nSDK<Map<String, Object>> {
    private static final List<String> unregisterClient = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private Map<String, Object> afInfoLog;
    private String afWarnLog;
    private final AFh1wSDK force;
    private final AFd1qSDK i;
    private final AFd1sSDK v;
    private final AFe1ySDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public AFg1lSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.w = aFd1kSDK.AFInAppEventParameterName();
        this.i = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.AFLogger();
        this.v = aFd1kSDK.AFInAppEventType();
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
        this.AFInAppEventParameterName.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.afInfoLog;
        String str = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.valueOf(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1kSDK.AFKeystoreWrapper(str);
        } else {
            AFg1kSDK.AFKeystoreWrapper("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str) {
        String str2;
        String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(this.i, this.v.d());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!unregisterClient.contains(AFKeystoreWrapper.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(AFKeystoreWrapper));
                AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = this.w.AFKeystoreWrapper(str2, str);
                AFb1mSDK.AFKeystoreWrapper(new StringBuilder("[GCD-B01] URL: ").append(AFKeystoreWrapper2.AFInAppEventParameterName.values).toString());
                return AFKeystoreWrapper2;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFKeystoreWrapper));
        }
        str2 = "";
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper22 = this.w.AFKeystoreWrapper(str2, str);
        AFb1mSDK.AFKeystoreWrapper(new StringBuilder("[GCD-B01] URL: ").append(AFKeystoreWrapper22.AFInAppEventParameterName.values).toString());
        return AFKeystoreWrapper22;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        AFe1bSDK aFe1bSDK;
        AFe1bSDK aFe1bSDK2;
        if (((AFf1nSDK) this).d.AFKeystoreWrapper()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.afWarnLog = "'isStopTracking' enabled";
            throw new AFf1wSDK();
        }
        AFe1bSDK aFe1bSDK3 = AFe1bSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.force.i = System.currentTimeMillis();
            try {
                try {
                    try {
                        aFe1bSDK = super.AFKeystoreWrapper();
                        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
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
                                this.afWarnLog = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFe1bSDK2 = AFe1bSDK.FAILURE;
                                return aFe1bSDK2;
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
                                this.i.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.i.AFInAppEventParameterName("attributionId", new JSONObject(map).toString());
                            if (!this.i.AFInAppEventType("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afInfoLog = map;
                            aFe1bSDK2 = AFe1bSDK.SUCCESS;
                            return aFe1bSDK2;
                        }
                    } catch (AFe1aSDK e) {
                        AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                        this.afWarnLog = "AppsFlyer dev key is missing";
                        throw e;
                    }
                } catch (Exception e2) {
                    AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e2.getMessage()).toString(), e2, false, false);
                    aFe1bSDK = AFe1bSDK.FAILURE;
                    if (z2) {
                        this.afWarnLog = e2.getMessage();
                        throw e2;
                    }
                }
                aFe1bSDK3 = aFe1bSDK;
                i++;
            } finally {
                this.force.valueOf(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1bSDK3;
    }
}
