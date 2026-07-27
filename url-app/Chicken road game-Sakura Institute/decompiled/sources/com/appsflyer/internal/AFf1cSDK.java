package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1hSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1cSDK extends AFf1lSDK {
    private final AppsFlyerProperties afErrorLog;
    private final AFi1aSDK afInfoLog;
    private final AFc1kSDK afRDLog;
    private final AFh1wSDK afVerboseLog;
    private final AFf1bSDK afWarnLog;
    private final AFd1qSDK force;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, Object> f5893i;

    /* renamed from: com.appsflyer.internal.AFf1cSDK$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFi1hSDK.AFa1ySDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFi1hSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFi1hSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1cSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK) {
        super(aFa1qSDK, aFd1kSDK);
        this.afInfoLog = aFd1kSDK.force();
        this.force = aFd1kSDK.valueOf();
        this.afVerboseLog = aFd1kSDK.AFLogger();
        this.afWarnLog = aFd1kSDK.registerClient();
        this.afErrorLog = AppsFlyerProperties.getInstance();
        this.afRDLog = aFd1kSDK.getPurchaseToken();
        this.AFInAppEventParameterName.add(AFf1zSDK.RESOLVE_ESP);
        this.AFInAppEventParameterName.add(AFf1zSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFh1wSDK aFh1wSDK = this.afVerboseLog;
        int i2 = ((AFf1lSDK) this).unregisterClient.AFLogger;
        long currentTimeMillis = System.currentTimeMillis();
        if (i2 == 1) {
            long j4 = aFh1wSDK.registerClient;
            if (j4 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1wSDK.AFKeystoreWrapper.put("net", Long.valueOf(currentTimeMillis - j4));
            aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", new JSONObject(aFh1wSDK.AFKeystoreWrapper).toString());
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        int i2 = aFa1qSDK.AFLogger;
        this.afVerboseLog.values(i2);
        Map map = (Map) aFa1qSDK.AFInAppEventParameterName().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.AFInAppEventParameterName().put("meta", map);
        }
        if (!aFa1qSDK.AFInAppEventParameterName().containsKey("af_deeplink")) {
            aFa1qSDK.valueOf(this.afRDLog.AFInAppEventParameterName());
        }
        AFh1aSDK values = this.afWarnLog.values();
        if (values != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", values.valueOf);
            String str = values.AFInAppEventType;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j4 = values.values;
            if (j4 > 0) {
                hashMap.put("latency", Long.valueOf(j4));
            }
            long j5 = values.AFKeystoreWrapper;
            if (j5 > 0) {
                hashMap.put("delay", Long.valueOf(j5));
            }
            int i4 = values.AFInAppEventParameterName;
            if (i4 > 0) {
                hashMap.put("res_code", Integer.valueOf(i4));
            }
            if (values.unregisterClient != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(values.unregisterClient.getClass().getSimpleName());
                sb.append(": ");
                sb.append(values.unregisterClient.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFh1bSDK aFh1bSDK = values.f5949e;
            if (aFh1bSDK != null) {
                hashMap.put("sig", aFh1bSDK.toString());
            }
            String str2 = values.registerClient;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        ((AFf1lSDK) this).f5909v.valueOf(aFa1qSDK.AFInAppEventParameterName());
        if (i2 == 1) {
            if (this.afErrorLog.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1qSDK.AFInAppEventParameterName().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afVerboseLog.valueOf);
            this.afVerboseLog.AFInAppEventParameterName.AFKeystoreWrapper("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i2 == 2) {
            HashMap hashMap4 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afVerboseLog.AFInAppEventParameterName.AFKeystoreWrapper("first_launch");
        }
        if (map.isEmpty()) {
            aFa1qSDK.AFInAppEventParameterName().remove("meta");
        }
        if (i2 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFi1hSDK aFi1hSDK : this.afInfoLog.AFKeystoreWrapper()) {
                boolean z4 = aFi1hSDK instanceof AFi1lSDK;
                int i5 = AnonymousClass1.AFKeystoreWrapper[aFi1hSDK.unregisterClient.ordinal()];
                if (i5 == 1) {
                    if (z4) {
                        aFa1qSDK.AFKeystoreWrapper("rfr", ((AFi1lSDK) aFi1hSDK).valueOf);
                        this.force.valueOf(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFi1hSDK.AFInAppEventParameterName);
                } else if (i5 == 2 && i2 == 2 && !z4) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFi1hSDK.values);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFi1hSDK.f5959d);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.AFKeystoreWrapper("referrers", arrayList);
            }
            Object obj = this.f5893i;
            if (obj != null) {
                aFa1qSDK.AFKeystoreWrapper("fb_ddl", obj);
            }
        }
        ((AFf1lSDK) this).f5909v.valueOf(aFa1qSDK);
    }
}
