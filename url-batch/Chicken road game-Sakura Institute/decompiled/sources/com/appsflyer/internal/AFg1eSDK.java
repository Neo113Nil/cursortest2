package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class AFg1eSDK extends AFe1dSDK<Void> {
    private final Throwable d;
    private final AFe1jSDK<String> e;
    private final AFd1qSDK unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public AFg1eSDK(AFf1cSDK aFf1cSDK, AFd1qSDK aFd1qSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.d = aFf1cSDK.unregisterClient();
        this.e = ((AFf1nSDK) aFf1cSDK).registerClient;
        this.unregisterClient = aFd1qSDK;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.unregisterClient.valueOf("appsFlyerCount", 0))));
        long values = this.unregisterClient.values("appsflyerConversionDataCacheExpiration", 0L);
        if (values != 0 && System.currentTimeMillis() - values > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.unregisterClient.valueOf("sixtyDayConversionData", true);
            this.unregisterClient.AFInAppEventParameterName("attributionId", (String) null);
            this.unregisterClient.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> e = e();
        if (e != null) {
            try {
                if (!e.containsKey("is_first_launch")) {
                    e.put("is_first_launch", Boolean.FALSE);
                }
                AFg1kSDK.valueOf(e);
            } catch (Exception e2) {
                AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e2.getLocalizedMessage()).toString(), e2);
            }
            return AFe1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e3) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e3.getLocalizedMessage()).toString(), e3);
        }
        if (this.d != null) {
            AFg1kSDK.AFKeystoreWrapper(new StringBuilder("Launch exception: ").append(this.d.getMessage()).toString());
            return AFe1bSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.e;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            AFg1kSDK.AFKeystoreWrapper(new StringBuilder("Launch status code: ").append(this.e.getStatusCode()).toString());
            return AFe1bSDK.SUCCESS;
        }
        return AFe1bSDK.FAILURE;
    }

    private Map<String, Object> e() {
        String AFKeystoreWrapper = this.unregisterClient.AFKeystoreWrapper("attributionId", (String) null);
        if (AFKeystoreWrapper == null) {
            return null;
        }
        try {
            new AFe1tSDK();
            return AFe1tSDK.values(AFKeystoreWrapper);
        } catch (JSONException e) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Failed to parse GCD response: ").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
