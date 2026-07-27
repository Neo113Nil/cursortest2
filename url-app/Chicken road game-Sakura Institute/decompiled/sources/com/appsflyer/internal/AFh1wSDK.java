package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1wSDK {
    public final AFd1qSDK AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f5953d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f5954e;

    /* renamed from: i, reason: collision with root package name */
    public long f5955i;
    public long registerClient;
    public long unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    public long f5956v;
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
        this.f5954e = new long[2];
        this.AFLogger = new long[2];
        this.f5953d = new long[2];
        this.registerClient = 0L;
        this.f5955i = 0L;
        this.AFInAppEventParameterName = aFd1qSDK;
        concurrentHashMap.putAll(AFKeystoreWrapper("first_launch"));
        concurrentHashMap2.putAll(AFKeystoreWrapper("ddl"));
        concurrentHashMap3.putAll(AFKeystoreWrapper("gcd"));
        this.f5956v = aFd1qSDK.values("prev_session_dur", 0L);
    }

    private Map<String, Object> AFKeystoreWrapper(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String AFKeystoreWrapper = this.AFInAppEventParameterName.AFKeystoreWrapper(str, (String) null);
        if (AFKeystoreWrapper == null) {
            return emptyMap;
        }
        try {
            return AFa1oSDK.AFInAppEventType(new JSONObject(AFKeystoreWrapper));
        } catch (Exception e4) {
            AFLogger.afErrorLog("Error while parsing cached json data", e4, true);
            return emptyMap;
        }
    }

    public final void AFInAppEventParameterName(AFg1cSDK aFg1cSDK) {
        if (values()) {
            this.AFKeystoreWrapper.put("start_with", aFg1cSDK.toString());
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFInAppEventType() {
        this.unregisterClient = System.currentTimeMillis();
        if (values()) {
            long j4 = this.values;
            if (j4 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(this.unregisterClient - j4));
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void valueOf(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.f5955i;
        if (j4 != 0) {
            this.AFInAppEventType.put("net", Long.valueOf(currentTimeMillis - j4));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFInAppEventType.put("retries", Integer.valueOf(i2));
        this.AFInAppEventParameterName.AFInAppEventParameterName("gcd", new JSONObject(this.AFInAppEventType).toString());
    }

    public final void values(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.registerClient = currentTimeMillis;
        if (i2 == 1) {
            long j4 = this.unregisterClient;
            if (j4 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.AFKeystoreWrapper.put("from_fg", Long.valueOf(currentTimeMillis - j4));
            this.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(this.AFKeystoreWrapper).toString());
        }
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult, long j4) {
        this.valueOf.put("status", deepLinkResult.getStatus().toString());
        this.valueOf.put("timeout_value", Long.valueOf(j4));
        this.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(this.valueOf).toString());
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.valueOf("appsFlyerCount", 0) == 0;
    }
}
