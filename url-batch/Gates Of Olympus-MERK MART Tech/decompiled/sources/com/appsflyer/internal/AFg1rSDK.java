package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class AFg1rSDK extends AFe1dSDK<Void> {
    private final Throwable d;
    private final AFe1pSDK<String> registerClient;
    private final AFd1xSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    public AFg1rSDK(AFf1iSDK aFf1iSDK, AFd1xSDK aFd1xSDK) {
        super(AFe1eSDK.GCDSDK, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, "GCD-CHECK");
        this.d = aFf1iSDK.AFLogger();
        this.registerClient = ((AFf1rSDK) aFf1iSDK).d;
        this.unregisterClient = aFd1xSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.unregisterClient.AFKeystoreWrapper("appsFlyerCount", 0))));
        long AFInAppEventType = this.unregisterClient.AFInAppEventType("appsflyerConversionDataCacheExpiration", 0L);
        if (AFInAppEventType != 0 && System.currentTimeMillis() - AFInAppEventType > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.unregisterClient.AFInAppEventParameterName("sixtyDayConversionData", true);
            this.unregisterClient.valueOf("attributionId", null);
            this.unregisterClient.AFInAppEventParameterName("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> unregisterClient = unregisterClient();
        if (unregisterClient != null) {
            try {
                if (!unregisterClient.containsKey("is_first_launch")) {
                    unregisterClient.put("is_first_launch", Boolean.FALSE);
                }
                AFg1vSDK.AFInAppEventParameterName(unregisterClient);
            } catch (Exception e) {
                AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e.getLocalizedMessage()).toString(), e);
            }
            return AFe1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e2.getLocalizedMessage()).toString(), e2);
        }
        if (this.d != null) {
            AFg1vSDK.AFInAppEventParameterName(new StringBuilder("Launch exception: ").append(this.d.getMessage()).toString());
            return AFe1bSDK.SUCCESS;
        }
        AFe1pSDK<String> aFe1pSDK = this.registerClient;
        if (aFe1pSDK != null && !aFe1pSDK.isSuccessful()) {
            AFg1vSDK.AFInAppEventParameterName(new StringBuilder("Launch status code: ").append(this.registerClient.getStatusCode()).toString());
            return AFe1bSDK.SUCCESS;
        }
        return AFe1bSDK.FAILURE;
    }

    private Map<String, Object> unregisterClient() {
        String AFInAppEventType = this.unregisterClient.AFInAppEventType("attributionId", (String) null);
        if (AFInAppEventType == null) {
            return null;
        }
        try {
            new AFe1qSDK();
            return AFe1qSDK.AFInAppEventParameterName(AFInAppEventType);
        } catch (JSONException e) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Failed to parse GCD response: ").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
