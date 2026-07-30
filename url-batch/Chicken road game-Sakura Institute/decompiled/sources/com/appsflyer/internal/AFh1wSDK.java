package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFh1wSDK {
    public final AFd1qSDK AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;
    public final long[] d;
    public final long[] e;
    public long i;
    public long registerClient;
    public long unregisterClient;
    public long v;
    public final Map<String, Object> valueOf;
    public long values;

    public AFh1wSDK(AFd1qSDK aFd1qSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.valueOf = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap3;
        this.values = 0L;
        this.unregisterClient = 0L;
        this.e = new long[2];
        this.AFLogger = new long[2];
        this.d = new long[2];
        this.registerClient = 0L;
        this.i = 0L;
        this.AFInAppEventParameterName = aFd1qSDK;
        concurrentHashMap.putAll(AFKeystoreWrapper("first_launch"));
        concurrentHashMap2.putAll(AFKeystoreWrapper("ddl"));
        concurrentHashMap3.putAll(AFKeystoreWrapper("gcd"));
        this.v = aFd1qSDK.values("prev_session_dur", 0L);
    }

    public final void AFInAppEventType() {
        this.unregisterClient = System.currentTimeMillis();
        if (values()) {
            long j = this.values;
            if (j != 0) {
                this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.unregisterClient - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: init ts is missing");
        }
    }

    public final void AFInAppEventParameterName(AFg1cSDK aFg1cSDK) {
        if (values()) {
            this.AFKeystoreWrapper.put("start_with", aFg1cSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void values(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.registerClient = currentTimeMillis;
        if (i == 1) {
            long j = this.unregisterClient;
            if (j != 0) {
                this.AFKeystoreWrapper.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: fg ts is missing");
        }
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult, long j) {
        this.valueOf.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.valueOf.put("timeout_value", Long.valueOf(j));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.valueOf).toString());
    }

    public final void valueOf(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.i;
        if (j != 0) {
            this.AFInAppEventType.put("net", Long.valueOf(currentTimeMillis - j));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventType.put("retries", Integer.valueOf(i));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.AFInAppEventType).toString());
    }

    private Map<String, Object> AFKeystoreWrapper(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper(str, (String) null);
        if (AFKeystoreWrapper == null) {
            return emptyMap;
        }
        try {
            return AFa1oSDK.AFInAppEventType(new JSONObject(AFKeystoreWrapper));
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while parsing cached json data", e, true);
            return emptyMap;
        }
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.valueOf("appsFlyerCount", 0) == 0;
    }
}
