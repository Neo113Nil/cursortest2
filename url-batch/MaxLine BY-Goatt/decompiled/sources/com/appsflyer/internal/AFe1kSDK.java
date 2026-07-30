package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1kSDK extends AFd1uSDK<Void> {
    private final Throwable afDebugLog;
    private final AFc1gSDK<String> afInfoLog;
    private final AFb1fSDK afRDLog;

    public AFe1kSDK(AFd1hSDK aFd1hSDK, AFb1fSDK aFb1fSDK) {
        super(AFd1vSDK.GCDSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "GCD-CHECK");
        this.afDebugLog = aFd1hSDK.afInfoLog();
        this.afInfoLog = ((AFd1nSDK) aFd1hSDK).AFLogger;
        this.afRDLog = aFb1fSDK;
    }

    private Map<String, Object> afDebugLog() {
        String valueOf = this.afRDLog.valueOf("attributionId", (String) null);
        if (valueOf == null) {
            return null;
        }
        try {
            new AFc1iSDK();
            return AFc1iSDK.AFInAppEventType(valueOf);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.afRDLog.AFInAppEventType("appsFlyerCount", 0))));
        long values = this.afRDLog.values("appsflyerConversionDataCacheExpiration", 0L);
        if (values != 0 && System.currentTimeMillis() - values > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.afRDLog.valueOf("sixtyDayConversionData", true);
            this.afRDLog.values("attributionId", (String) null);
            this.afRDLog.AFInAppEventType("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> afDebugLog = afDebugLog();
        if (afDebugLog != null) {
            try {
                if (!afDebugLog.containsKey("is_first_launch")) {
                    afDebugLog.put("is_first_launch", Boolean.FALSE);
                }
                AFe1pSDK.AFInAppEventType(afDebugLog);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFd1ySDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb2.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb2.toString(), e2);
        }
        if (this.afDebugLog != null) {
            StringBuilder sb3 = new StringBuilder("Launch exception: ");
            sb3.append(this.afDebugLog.getMessage());
            AFe1pSDK.AFInAppEventType(sb3.toString());
            return AFd1ySDK.SUCCESS;
        }
        AFc1gSDK<String> aFc1gSDK = this.afInfoLog;
        if (aFc1gSDK != null && !aFc1gSDK.isSuccessful()) {
            StringBuilder sb4 = new StringBuilder("Launch status code: ");
            sb4.append(this.afInfoLog.getStatusCode());
            AFe1pSDK.AFInAppEventType(sb4.toString());
            return AFd1ySDK.SUCCESS;
        }
        return AFd1ySDK.FAILURE;
    }
}
