package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFg1gSDK {
    public long AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public long d;
    public long e;
    public long force;
    public final long[] registerClient;
    public final long[] unregisterClient;
    public long v;
    public final AFd1xSDK valueOf;
    public final Map<String, Object> values;

    public AFg1gSDK(AFd1xSDK aFd1xSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.values = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap3;
        this.AFInAppEventParameterName = 0L;
        this.e = 0L;
        this.registerClient = new long[2];
        this.AFLogger = new long[2];
        this.unregisterClient = new long[2];
        this.d = 0L;
        this.v = 0L;
        this.valueOf = aFd1xSDK;
        concurrentHashMap.putAll(AFInAppEventType("first_launch"));
        concurrentHashMap2.putAll(AFInAppEventType("ddl"));
        concurrentHashMap3.putAll(AFInAppEventType("gcd"));
        this.force = aFd1xSDK.AFInAppEventType("prev_session_dur", 0L);
    }

    public final void AFInAppEventParameterName() {
        this.e = System.currentTimeMillis();
        if (AFKeystoreWrapper()) {
            long j = this.AFInAppEventParameterName;
            if (j != 0) {
                this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.e - j));
                this.valueOf.valueOf("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFKeystoreWrapper(AFg1iSDK aFg1iSDK) {
        if (AFKeystoreWrapper()) {
            this.AFKeystoreWrapper.put("start_with", aFg1iSDK.toString());
            this.valueOf.valueOf("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFKeystoreWrapper(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.d = currentTimeMillis;
        if (i == 1) {
            long j = this.e;
            if (j != 0) {
                this.AFKeystoreWrapper.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.valueOf.valueOf("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFKeystoreWrapper(DeepLinkResult deepLinkResult, long j) {
        this.values.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.values.put("timeout_value", Long.valueOf(j));
        this.valueOf.valueOf("ddl", new JSONObject(this.values).toString());
    }

    public final void AFInAppEventType(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.v;
        if (j != 0) {
            this.AFInAppEventType.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventType.put("retries", Integer.valueOf(i));
        this.valueOf.valueOf("gcd", new JSONObject(this.AFInAppEventType).toString());
    }

    private Map<String, Object> AFInAppEventType(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFInAppEventType = this.valueOf.AFInAppEventType(str, (String) null);
        if (AFInAppEventType != null) {
            try {
                return AFa1oSDK.AFInAppEventParameterName(new JSONObject(AFInAppEventType));
            } catch (Exception e) {
                AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            }
        }
        return emptyMap;
    }

    public final boolean AFKeystoreWrapper() {
        return this.valueOf.AFKeystoreWrapper("appsFlyerCount", 0) == 0;
    }
}
