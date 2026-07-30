package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1lSDK {
    public final Map<String, Object> AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final AFb1fSDK AFKeystoreWrapper;
    public long AFLogger;
    public long afDebugLog;
    public final long[] afErrorLog;
    public long afErrorLogForExcManagerOnly;
    public final long[] afInfoLog;
    public final long[] afRDLog;
    public long getLevel;
    public long valueOf;
    public final Map<String, Object> values;

    public AFe1lSDK(AFb1fSDK aFb1fSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.values = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap3;
        this.valueOf = 0L;
        this.afDebugLog = 0L;
        this.afErrorLog = new long[2];
        this.afInfoLog = new long[2];
        this.afRDLog = new long[2];
        this.AFLogger = 0L;
        this.getLevel = 0L;
        this.AFKeystoreWrapper = aFb1fSDK;
        concurrentHashMap.putAll(AFInAppEventType("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventType("ddl"));
        concurrentHashMap3.putAll(AFInAppEventType("gcd"));
        this.afErrorLogForExcManagerOnly = aFb1fSDK.values("prev_session_dur", 0L);
    }

    public final void AFInAppEventParameterName() {
        this.afDebugLog = System.currentTimeMillis();
        if (values()) {
            long j = this.valueOf;
            if (j != 0) {
                this.values.put("init_to_fg", Long.valueOf(this.afDebugLog - j));
                this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void values(AFe1oSDK aFe1oSDK) {
        if (values()) {
            this.values.put("start_with", aFe1oSDK.toString());
            this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
        }
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.AFLogger = currentTimeMillis;
        if (i == 1) {
            long j = this.afDebugLog;
            if (j != 0) {
                this.values.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFKeystoreWrapper.values("first_launch", new JSONObject(this.values).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void values(DeepLinkResult deepLinkResult, long j) {
        this.AFInAppEventType.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.AFInAppEventType.put("timeout_value", Long.valueOf(j));
        this.AFKeystoreWrapper.values("ddl", new JSONObject(this.AFInAppEventType).toString());
    }

    public final void values(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.getLevel;
        if (j != 0) {
            this.AFInAppEventParameterName.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventParameterName.put("retries", Integer.valueOf(i));
        this.AFKeystoreWrapper.values("gcd", new JSONObject(this.AFInAppEventParameterName).toString());
    }

    private Map<String, Object> AFInAppEventType(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String valueOf = this.AFKeystoreWrapper.valueOf(str, (String) null);
        if (valueOf != null) {
            try {
                return AFa1rSDK.values(new JSONObject(valueOf));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return emptyMap;
    }

    public final boolean values() {
        return this.AFKeystoreWrapper.AFInAppEventType("appsFlyerCount", 0) == 0;
    }
}
