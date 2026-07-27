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
public final class AFg1lSDK extends AFf1nSDK<Map<String, Object>> {
    private static final List<String> unregisterClient = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private Map<String, Object> afInfoLog;
    private String afWarnLog;
    private final AFh1wSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1qSDK f5946i;

    /* renamed from: v, reason: collision with root package name */
    private final AFd1sSDK f5947v;

    /* renamed from: w, reason: collision with root package name */
    private final AFe1ySDK f5948w;

    public AFg1lSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.f5948w = aFd1kSDK.AFInAppEventParameterName();
        this.f5946i = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.AFLogger();
        this.f5947v = aFd1kSDK.AFInAppEventType();
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
        } else if (str == null || str.isEmpty()) {
            AFg1kSDK.AFKeystoreWrapper("Unknown error");
        } else {
            AFg1kSDK.AFKeystoreWrapper(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str) {
        String str2;
        String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(this.f5946i, this.f5947v.d());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!unregisterClient.contains(AFKeystoreWrapper.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFKeystoreWrapper);
                AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = this.f5948w.AFKeystoreWrapper(str2, str);
                StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
                sb.append(AFKeystoreWrapper2.AFInAppEventParameterName.values);
                AFb1mSDK.AFKeystoreWrapper(sb.toString());
                return AFKeystoreWrapper2;
            }
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + AFKeystoreWrapper + ". Using without channel postfix.");
        }
        str2 = "";
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper22 = this.f5948w.AFKeystoreWrapper(str2, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(AFKeystoreWrapper22.AFInAppEventParameterName.values);
        AFb1mSDK.AFKeystoreWrapper(sb2.toString());
        return AFKeystoreWrapper22;
    }

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

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFe1bSDK aFe1bSDK;
        AFe1bSDK aFe1bSDK2;
        if (!((AFf1nSDK) this).f5911d.AFKeystoreWrapper()) {
            AFe1bSDK aFe1bSDK3 = AFe1bSDK.FAILURE;
            int i2 = 0;
            while (i2 <= 2) {
                boolean z4 = true;
                boolean z5 = i2 >= 2;
                this.force.f5955i = System.currentTimeMillis();
                try {
                    try {
                        aFe1bSDK = super.AFKeystoreWrapper();
                        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            if (statusCode != 403 && statusCode < 500) {
                                z4 = false;
                            }
                            if (!responseNetwork.isSuccessful() && statusCode != 404) {
                                if (!z5) {
                                    if (!z4) {
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
                                this.f5946i.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
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
                            this.f5946i.AFInAppEventParameterName("attributionId", new JSONObject(map).toString());
                            if (!this.f5946i.AFInAppEventType("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afInfoLog = map;
                            aFe1bSDK2 = AFe1bSDK.SUCCESS;
                            return aFe1bSDK2;
                        }
                    } catch (AFe1aSDK e4) {
                        AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                        this.afWarnLog = "AppsFlyer dev key is missing";
                        throw e4;
                    } catch (Exception e5) {
                        StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                        sb2.append(e5.getMessage());
                        AFLogger.afErrorLog(sb2.toString(), e5, false, false);
                        aFe1bSDK = AFe1bSDK.FAILURE;
                        if (z5) {
                            this.afWarnLog = e5.getMessage();
                            throw e5;
                        }
                    }
                    aFe1bSDK3 = aFe1bSDK;
                    i2++;
                } finally {
                    this.force.valueOf(i2);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                }
            }
            return aFe1bSDK3;
        }
        AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
        this.afWarnLog = "'isStopTracking' enabled";
        throw new AFf1wSDK();
    }
}
