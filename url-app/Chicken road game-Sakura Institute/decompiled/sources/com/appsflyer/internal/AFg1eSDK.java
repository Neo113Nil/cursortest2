package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class AFg1eSDK extends AFe1dSDK<Void> {

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f5939d;

    /* renamed from: e, reason: collision with root package name */
    private final AFe1jSDK<String> f5940e;
    private final AFd1qSDK unregisterClient;

    public AFg1eSDK(AFf1cSDK aFf1cSDK, AFd1qSDK aFd1qSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.f5939d = aFf1cSDK.unregisterClient();
        this.f5940e = ((AFf1nSDK) aFf1cSDK).registerClient;
        this.unregisterClient = aFd1qSDK;
    }

    private Map<String, Object> e() {
        String AFKeystoreWrapper = this.unregisterClient.AFKeystoreWrapper("attributionId", (String) null);
        if (AFKeystoreWrapper == null) {
            return null;
        }
        try {
            new AFe1tSDK();
            return AFe1tSDK.values(AFKeystoreWrapper);
        } catch (JSONException e4) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e4.getMessage());
            AFLogger.afErrorLog(sb.toString(), e4);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.unregisterClient.valueOf("appsFlyerCount", 0))));
        long values = this.unregisterClient.values("appsflyerConversionDataCacheExpiration", 0L);
        if (values != 0 && System.currentTimeMillis() - values > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.unregisterClient.valueOf("sixtyDayConversionData", true);
            this.unregisterClient.AFInAppEventParameterName("attributionId", (String) null);
            this.unregisterClient.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> e4 = e();
        if (e4 != null) {
            try {
                if (!e4.containsKey("is_first_launch")) {
                    e4.put("is_first_launch", Boolean.FALSE);
                }
                AFg1kSDK.valueOf(e4);
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e5.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e5);
            }
            return AFe1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e6) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e6.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e6);
        }
        if (this.f5939d != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.f5939d.getMessage());
            AFg1kSDK.AFKeystoreWrapper(sb3.toString());
            return AFe1bSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.f5940e;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.f5940e.getStatusCode());
            AFg1kSDK.AFKeystoreWrapper(sb4.toString());
            return AFe1bSDK.SUCCESS;
        }
        return AFe1bSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }
}
