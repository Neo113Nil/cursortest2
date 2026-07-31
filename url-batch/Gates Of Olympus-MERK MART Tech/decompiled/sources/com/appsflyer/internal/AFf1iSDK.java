package com.appsflyer.internal;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1pSDK;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFf1iSDK extends AFf1nSDK {
    private final AFc1qSDK afDebugLog;
    private final AFf1eSDK afErrorLog;
    private final AFd1xSDK afInfoLog;
    private final AppsFlyerProperties afRDLog;
    private final AFg1gSDK afVerboseLog;
    private final AFi1rSDK i;
    public Map<String, Object> v;

    public AFf1iSDK(AFa1rSDK aFa1rSDK, AFd1mSDK aFd1mSDK) {
        super(aFa1rSDK, aFd1mSDK);
        this.i = aFd1mSDK.w();
        this.afInfoLog = aFd1mSDK.valueOf();
        this.afVerboseLog = aFd1mSDK.d();
        this.afErrorLog = aFd1mSDK.registerClient();
        this.afRDLog = AppsFlyerProperties.getInstance();
        this.afDebugLog = aFd1mSDK.init();
        this.valueOf.add(AFe1eSDK.RESOLVE_ESP);
        this.valueOf.add(AFe1eSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFg1gSDK aFg1gSDK = this.afVerboseLog;
        int i = ((AFf1nSDK) this).e.AFLogger;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            if (aFg1gSDK.d != 0) {
                aFg1gSDK.AFKeystoreWrapper.put("net", Long.valueOf(currentTimeMillis - aFg1gSDK.d));
                aFg1gSDK.valueOf.valueOf("first_launch", new JSONObject(aFg1gSDK.AFKeystoreWrapper).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final void AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        super.AFKeystoreWrapper(aFa1rSDK);
        int i = aFa1rSDK.AFLogger;
        this.afVerboseLog.AFKeystoreWrapper(i);
        Map map = (Map) aFa1rSDK.AFKeystoreWrapper().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1rSDK.AFKeystoreWrapper().put("meta", map);
        }
        if (!aFa1rSDK.AFKeystoreWrapper().containsKey("af_deeplink")) {
            aFa1rSDK.values(this.afDebugLog.AFInAppEventParameterName());
        }
        AFh1jSDK AFKeystoreWrapper = this.afErrorLog.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFKeystoreWrapper.AFKeystoreWrapper);
            if (AFKeystoreWrapper.AFInAppEventType != null) {
                hashMap.put("c_ver", AFKeystoreWrapper.AFInAppEventType);
            }
            if (AFKeystoreWrapper.AFInAppEventParameterName > 0) {
                hashMap.put("latency", Long.valueOf(AFKeystoreWrapper.AFInAppEventParameterName));
            }
            if (AFKeystoreWrapper.valueOf > 0) {
                hashMap.put("delay", Long.valueOf(AFKeystoreWrapper.valueOf));
            }
            if (AFKeystoreWrapper.values > 0) {
                hashMap.put("res_code", Integer.valueOf(AFKeystoreWrapper.values));
            }
            if (AFKeystoreWrapper.registerClient != null) {
                hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new StringBuilder().append(AFKeystoreWrapper.registerClient.getClass().getSimpleName()).append(": ").append(AFKeystoreWrapper.registerClient.getMessage()).toString());
            }
            if (AFKeystoreWrapper.e != null) {
                hashMap.put("sig", AFKeystoreWrapper.e.toString());
            }
            if (AFKeystoreWrapper.AFLogger != null) {
                hashMap.put("cdn_cache_status", AFKeystoreWrapper.AFLogger);
            }
            map.put("rc", hashMap);
        }
        if (i == 1) {
            if (this.afRDLog.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1rSDK.AFKeystoreWrapper().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afVerboseLog.values);
            this.afVerboseLog.valueOf.AFKeystoreWrapper("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afVerboseLog.valueOf.AFKeystoreWrapper("first_launch");
        }
        if (map.isEmpty()) {
            aFa1rSDK.AFKeystoreWrapper().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFi1pSDK aFi1pSDK : this.i.AFKeystoreWrapper()) {
                boolean z = aFi1pSDK instanceof AFi1xSDK;
                int i2 = AnonymousClass2.AFInAppEventParameterName[aFi1pSDK.registerClient.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFa1rSDK.valueOf("rfr", ((AFi1xSDK) aFi1pSDK).AFKeystoreWrapper);
                        this.afInfoLog.AFInAppEventParameterName(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFi1pSDK.values);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFi1pSDK.AFInAppEventType);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, aFi1pSDK.unregisterClient);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1rSDK.valueOf("referrers", arrayList);
            }
            Object obj = this.v;
            if (obj != null) {
                aFa1rSDK.valueOf("fb_ddl", obj);
            }
        }
        this.force.values(aFa1rSDK);
    }

    /* renamed from: com.appsflyer.internal.AFf1iSDK$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFi1pSDK.AFa1tSDK.values().length];
            AFInAppEventParameterName = iArr;
            try {
                iArr[AFi1pSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFInAppEventParameterName[AFi1pSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
