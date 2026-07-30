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
public final class AFe1rSDK extends AFd1nSDK<Map<String, Object>> {
    private static final List<String> afInfoLog = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFe1lSDK AFLogger$LogLevel;
    private final AFb1fSDK AFVersionDeclaration;
    private Map<String, Object> afErrorLogForExcManagerOnly;
    private final AFc1qSDK afWarnLog;
    private final AFb1cSDK getLevel;
    private String init;

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }

    public AFe1rSDK(AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, "GCD-FETCH");
        this.afWarnLog = aFc1zSDK.AFInAppEventType();
        this.AFVersionDeclaration = aFc1zSDK.AFKeystoreWrapper();
        this.AFLogger$LogLevel = aFc1zSDK.AFLogger();
        this.getLevel = aFc1zSDK.AFInAppEventParameterName();
        this.valueOf.add(AFd1vSDK.CONVERSION);
        this.valueOf.add(AFd1vSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        Map<String, Object> map = this.afErrorLogForExcManagerOnly;
        String str = this.init;
        if (map != null) {
            AFe1pSDK.AFInAppEventType(map);
        } else if (str != null && !str.isEmpty()) {
            AFe1pSDK.AFInAppEventType(str);
        } else {
            AFe1pSDK.AFInAppEventType("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<Map<String, Object>> AFKeystoreWrapper(String str) {
        String str2;
        String values = AFa1dSDK.values(this.AFVersionDeclaration, this.getLevel.AFKeystoreWrapper());
        if (values != null && !values.trim().isEmpty()) {
            if (!afInfoLog.contains(values.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(values));
                AFc1nSDK<Map<String, Object>> AFInAppEventType = this.afWarnLog.AFInAppEventType(str2, str);
                AFc1pSDK.AFKeystoreWrapper(new StringBuilder("[GCD-B01] URL: ").append(AFInAppEventType.valueOf.AFInAppEventParameterName).toString());
                return AFInAppEventType;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", values));
        }
        str2 = "";
        AFc1nSDK<Map<String, Object>> AFInAppEventType2 = this.afWarnLog.AFInAppEventType(str2, str);
        AFc1pSDK.AFKeystoreWrapper(new StringBuilder("[GCD-B01] URL: ").append(AFInAppEventType2.valueOf.AFInAppEventParameterName).toString());
        return AFInAppEventType2;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() throws Exception {
        AFd1ySDK aFd1ySDK;
        AFd1ySDK aFd1ySDK2;
        if (((AFd1nSDK) this).afRDLog.values()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.init = "'isStopTracking' enabled";
            throw new AFd1rSDK();
        }
        AFd1ySDK aFd1ySDK3 = AFd1ySDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.AFLogger$LogLevel.getLevel = System.currentTimeMillis();
            try {
                try {
                    aFd1ySDK = super.values();
                    ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
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
                            this.init = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFd1ySDK2 = AFd1ySDK.FAILURE;
                            return aFd1ySDK2;
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
                            this.AFVersionDeclaration.AFInAppEventType("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                        }
                        if (map.containsKey("af_siteid")) {
                            if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                            } else {
                                AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                            }
                        }
                        map.put("is_first_launch", Boolean.FALSE);
                        this.AFVersionDeclaration.values("attributionId", new JSONObject(map).toString());
                        if (!this.AFVersionDeclaration.AFKeystoreWrapper("sixtyDayConversionData")) {
                            map.put("is_first_launch", Boolean.TRUE);
                        }
                        this.afErrorLogForExcManagerOnly = map;
                        aFd1ySDK2 = AFd1ySDK.SUCCESS;
                        return aFd1ySDK2;
                    }
                } catch (AFd1wSDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.init = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e2.getMessage()).toString(), e2);
                    aFd1ySDK = AFd1ySDK.FAILURE;
                    if (z2) {
                        this.init = e2.getMessage();
                        throw e2;
                    }
                }
                aFd1ySDK3 = aFd1ySDK;
                i++;
            } finally {
                this.AFLogger$LogLevel.values(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFd1ySDK3;
    }
}
