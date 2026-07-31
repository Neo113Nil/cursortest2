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
public final class AFg1tSDK extends AFf1rSDK<Map<String, Object>> {
    private static final List<String> e = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String afDebugLog;
    private final AFe1wSDK afInfoLog;
    private final AFd1pSDK force;
    private final AFd1xSDK i;
    private Map<String, Object> v;
    private final AFg1gSDK w;

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final boolean unregisterClient() {
        return false;
    }

    public AFg1tSDK(AFd1mSDK aFd1mSDK) {
        super(AFe1eSDK.GCDSDK, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, "GCD-FETCH");
        this.afInfoLog = aFd1mSDK.AFKeystoreWrapper();
        this.i = aFd1mSDK.valueOf();
        this.w = aFd1mSDK.d();
        this.force = aFd1mSDK.values();
        this.valueOf.add(AFe1eSDK.CONVERSION);
        this.valueOf.add(AFe1eSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.v;
        String str = this.afDebugLog;
        if (map != null) {
            AFg1vSDK.AFInAppEventParameterName(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1vSDK.AFInAppEventParameterName(str);
        } else {
            AFg1vSDK.AFInAppEventParameterName("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final AFe1xSDK<Map<String, Object>> values(String str) {
        String str2;
        String AFInAppEventType = AFb1tSDK.AFInAppEventType(this.i, this.force.AFInAppEventParameterName());
        if (AFInAppEventType != null && !AFInAppEventType.trim().isEmpty()) {
            if (!e.contains(AFInAppEventType.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(AFInAppEventType));
                AFe1xSDK<Map<String, Object>> AFInAppEventParameterName = this.afInfoLog.AFInAppEventParameterName(str2, str);
                AFb1hSDK.AFInAppEventType(new StringBuilder("[GCD-B01] URL: ").append(AFInAppEventParameterName.values.valueOf).toString());
                return AFInAppEventParameterName;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFInAppEventType));
        }
        str2 = "";
        AFe1xSDK<Map<String, Object>> AFInAppEventParameterName2 = this.afInfoLog.AFInAppEventParameterName(str2, str);
        AFb1hSDK.AFInAppEventType(new StringBuilder("[GCD-B01] URL: ").append(AFInAppEventParameterName2.values.valueOf).toString());
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        AFe1bSDK aFe1bSDK;
        AFe1bSDK aFe1bSDK2;
        if (((AFf1rSDK) this).unregisterClient.AFInAppEventType()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.afDebugLog = "'isStopTracking' enabled";
            throw new AFf1xSDK();
        }
        AFe1bSDK aFe1bSDK3 = AFe1bSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.w.v = System.currentTimeMillis();
            try {
                try {
                    try {
                        aFe1bSDK = super.values();
                        ResponseNetwork responseNetwork = ((AFf1rSDK) this).d;
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
                                this.afDebugLog = "Error connection to server: ".concat(String.valueOf(statusCode));
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
                                this.i.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.i.valueOf("attributionId", new JSONObject(map).toString());
                            if (!this.i.values("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.v = map;
                            aFe1bSDK2 = AFe1bSDK.SUCCESS;
                            return aFe1bSDK2;
                        }
                    } catch (Exception e2) {
                        AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e2.getMessage()).toString(), e2, false, false);
                        aFe1bSDK = AFe1bSDK.FAILURE;
                        if (z2) {
                            this.afDebugLog = e2.getMessage();
                            throw e2;
                        }
                    }
                    aFe1bSDK3 = aFe1bSDK;
                    i++;
                } catch (AFf1wSDK e3) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.afDebugLog = "AppsFlyer dev key is missing";
                    throw e3;
                }
            } finally {
                this.w.AFInAppEventType(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1bSDK3;
    }
}
