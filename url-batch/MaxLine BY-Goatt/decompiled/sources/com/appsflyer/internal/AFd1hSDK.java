package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1jSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFd1hSDK extends AFd1eSDK {
    private final AFe1lSDK AFVersionDeclaration;
    private final AFb1fSDK afErrorLogForExcManagerOnly;
    private final AFf1kSDK afWarnLog;
    public Map<String, Object> getLevel;
    private final AFc1tSDK onAppOpenAttributionNative;
    private final AppsFlyerProperties onInstallConversionDataLoadedNative;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFd1hSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFf1jSDK.AFa1vSDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFf1jSDK.AFa1vSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AFf1jSDK.AFa1vSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFd1hSDK(AFa1qSDK aFa1qSDK, AFc1zSDK aFc1zSDK) {
        super(aFa1qSDK, aFc1zSDK);
        this.afWarnLog = aFc1zSDK.AFLogger$LogLevel();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFKeystoreWrapper();
        this.AFVersionDeclaration = aFc1zSDK.AFLogger();
        this.onAppOpenAttributionNative = aFc1zSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = AppsFlyerProperties.getInstance();
        this.valueOf.add(AFd1vSDK.RESOLVE_ESP);
        this.valueOf.add(AFd1vSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        AFe1lSDK aFe1lSDK = this.AFVersionDeclaration;
        int i = ((AFd1eSDK) this).afInfoLog.afErrorLog;
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFe1lSDK.AFLogger;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFe1lSDK.values.put("net", Long.valueOf(currentTimeMillis - j));
            aFe1lSDK.AFKeystoreWrapper.values("first_launch", new JSONObject(aFe1lSDK.values).toString());
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        super.values(aFa1qSDK);
        int i = aFa1qSDK.afErrorLog;
        this.AFVersionDeclaration.AFKeystoreWrapper(i);
        Map map = (Map) aFa1qSDK.AFInAppEventType().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.AFInAppEventType().put("meta", map);
        }
        AFf1uSDK AFInAppEventParameterName = this.onAppOpenAttributionNative.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFInAppEventParameterName.AFInAppEventType);
            String str = AFInAppEventParameterName.AFKeystoreWrapper;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j = AFInAppEventParameterName.values;
            if (j > 0) {
                hashMap.put("latency", Long.valueOf(j));
            }
            long j2 = AFInAppEventParameterName.valueOf;
            if (j2 > 0) {
                hashMap.put("delay", Long.valueOf(j2));
            }
            int i2 = AFInAppEventParameterName.AFInAppEventParameterName;
            if (i2 > 0) {
                hashMap.put("res_code", Integer.valueOf(i2));
            }
            if (AFInAppEventParameterName.afDebugLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFInAppEventParameterName.afDebugLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFInAppEventParameterName.afDebugLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFf1sSDK aFf1sSDK = AFInAppEventParameterName.afInfoLog;
            if (aFf1sSDK != null) {
                hashMap.put("sig", aFf1sSDK.toString());
            }
            String str2 = AFInAppEventParameterName.afRDLog;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        if (i == 1) {
            if (this.onInstallConversionDataLoadedNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1qSDK.AFInAppEventType().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.AFVersionDeclaration.AFInAppEventType);
            this.AFVersionDeclaration.AFKeystoreWrapper.AFInAppEventType("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.AFVersionDeclaration.values);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.AFVersionDeclaration.values);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.AFVersionDeclaration.AFKeystoreWrapper.AFInAppEventType("first_launch");
        }
        if (map.isEmpty()) {
            aFa1qSDK.AFInAppEventType().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFf1jSDK aFf1jSDK : this.afWarnLog.AFInAppEventType()) {
                boolean z = aFf1jSDK instanceof AFf1pSDK;
                int i3 = AnonymousClass2.AFKeystoreWrapper[aFf1jSDK.afRDLog.ordinal()];
                if (i3 == 1) {
                    if (z) {
                        aFa1qSDK.AFInAppEventParameterName("rfr", ((AFf1pSDK) aFf1jSDK).values);
                        this.afErrorLogForExcManagerOnly.valueOf(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFf1jSDK.AFKeystoreWrapper);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFf1jSDK.AFInAppEventParameterName);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFf1jSDK.afInfoLog);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.AFInAppEventParameterName("referrers", arrayList);
            }
            Object obj = this.getLevel;
            if (obj != null) {
                aFa1qSDK.AFInAppEventParameterName("fb_ddl", obj);
            }
        }
    }
}
