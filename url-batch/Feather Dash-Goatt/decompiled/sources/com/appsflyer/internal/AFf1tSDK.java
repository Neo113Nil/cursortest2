package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFf1tSDK extends AFf1rSDK {
    private final AFa1gSDK AFInAppEventParameterName;
    private final AFf1mSDK AFKeystoreWrapper;
    private final AFh1wSDK AFLogger;
    public Map<String, Object> copy;
    private final AFh1uSDK copydefault;
    private final AFj1rSDK hashCode;
    private final AppsFlyerProperties registerClient;
    private final AFc1jSDK toString;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    /* renamed from: com.appsflyer.internal.AFf1tSDK$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.AFa1ySDK.values().length];
            getRevenue = iArr;
            try {
                iArr[AFj1zSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AFj1zSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1tSDK(AFh1sSDK aFh1sSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1sSDK, aFd1zSDK);
        this.hashCode = aFd1zSDK.copydefault();
        this.toString = aFd1zSDK.getMediationNetwork();
        this.copydefault = aFd1zSDK.component2();
        this.AFKeystoreWrapper = aFd1zSDK.component3();
        this.registerClient = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFd1zSDK.afErrorLog();
        this.AFLogger = aFd1zSDK.afErrorLogForExcManagerOnly();
        this.getMediationNetwork.add(AFe1lSDK.RESOLVE_ESP);
        this.getMediationNetwork.add(AFe1lSDK.DLSDK);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        boolean z = this.AFAdRevenueData == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        return z && (aFe1lSDK == AFe1lSDK.CONVERSION || aFe1lSDK == AFe1lSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        AFh1wSDK aFh1wSDK;
        AFh1wSDK aFh1wSDK2;
        super.AFAdRevenueData(aFh1sSDK);
        int i = aFh1sSDK.component1;
        AFh1uSDK aFh1uSDK = this.copydefault;
        if (aFh1uSDK.getCurrencyIso4217Code()) {
            long currentTimeMillis = System.currentTimeMillis();
            aFh1uSDK.hashCode = currentTimeMillis;
            long j = aFh1uSDK.component1;
            if (j != 0) {
                aFh1uSDK.getCurrencyIso4217Code.put("from_fg", Long.valueOf(currentTimeMillis - j));
                aFh1uSDK.AFAdRevenueData.getMediationNetwork("first_launch", new JSONObject(aFh1uSDK.getCurrencyIso4217Code).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1sSDK.AFAdRevenueData.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1sSDK.AFAdRevenueData.put("meta", map);
        }
        if (!aFh1sSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1sSDK.getCurrencyIso4217Code(this.AFInAppEventParameterName.getMediationNetwork());
        }
        AFi1vSDK AFAdRevenueData = this.AFKeystoreWrapper.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFAdRevenueData.getMonetizationNetwork);
            String str = AFAdRevenueData.AFAdRevenueData;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j2 = AFAdRevenueData.getCurrencyIso4217Code;
            if (j2 > 0) {
                hashMap.put("latency", Long.valueOf(j2));
            }
            long j3 = AFAdRevenueData.getMediationNetwork;
            if (j3 > 0) {
                hashMap.put("delay", Long.valueOf(j3));
            }
            int i2 = AFAdRevenueData.getRevenue;
            if (i2 > 0) {
                hashMap.put("res_code", Integer.valueOf(i2));
            }
            if (AFAdRevenueData.component3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFAdRevenueData.component3.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFAdRevenueData.component3.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFi1ySDK aFi1ySDK = AFAdRevenueData.component1;
            if (aFi1ySDK != null) {
                hashMap.put("sig", aFi1ySDK.toString());
            }
            String str2 = AFAdRevenueData.component4;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        this.equals.getMediationNetwork(aFh1sSDK.AFAdRevenueData);
        if (i == 1) {
            if (this.registerClient.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1sSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            AFh1uSDK aFh1uSDK2 = this.copydefault;
            HashMap hashMap2 = new HashMap(aFh1uSDK2.getMonetizationNetwork);
            aFh1uSDK2.getMonetizationNetwork.clear();
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.copydefault.getCurrencyIso4217Code);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
            AFh1wSDK aFh1wSDK3 = this.AFLogger;
            if (aFh1wSDK3 != null) {
                aFh1wSDK3.getMonetizationNetwork(aFh1sSDK);
            }
        } else if (i == 2) {
            AFh1uSDK aFh1uSDK3 = this.copydefault;
            aFh1uSDK3.AFAdRevenueData.getCurrencyIso4217Code("first_launch");
            HashMap hashMap4 = new HashMap(aFh1uSDK3.getCurrencyIso4217Code);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            if ((aFh1sSDK instanceof AFh1pSDK) && (aFh1wSDK2 = this.AFLogger) != null && !aFh1wSDK2.AFAdRevenueData()) {
                this.AFLogger.getCurrencyIso4217Code(aFh1sSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1sSDK.AFAdRevenueData.remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1zSDK aFj1zSDK : (AFj1zSDK[]) this.hashCode.AFAdRevenueData.toArray(new AFj1zSDK[0])) {
                boolean z = aFj1zSDK instanceof AFi1aSDK;
                int i3 = AnonymousClass2.getRevenue[aFj1zSDK.component2.ordinal()];
                if (i3 == 1) {
                    if (z) {
                        aFh1sSDK.getMonetizationNetwork("rfr", ((AFi1aSDK) aFj1zSDK).getMediationNetwork);
                        this.toString.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1zSDK.getCurrencyIso4217Code);
                } else if (i3 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1zSDK.AFAdRevenueData);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1zSDK.component4);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1sSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.copy;
            if (obj != null) {
                aFh1sSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1sSDK.getRevenue() == AFe1lSDK.LAUNCH && (aFh1wSDK = this.AFLogger) != null && aFh1wSDK.getMediationNetwork()) {
            this.AFLogger.getMediationNetwork(aFh1sSDK);
        }
        this.equals.AFAdRevenueData(aFh1sSDK);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFh1uSDK aFh1uSDK = this.copydefault;
        if (aFh1uSDK.getCurrencyIso4217Code()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = aFh1uSDK.hashCode;
            if (j == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1uSDK.getCurrencyIso4217Code.put("net", Long.valueOf(currentTimeMillis - j));
            aFh1uSDK.AFAdRevenueData.getMediationNetwork("first_launch", new JSONObject(aFh1uSDK.getCurrencyIso4217Code).toString());
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || equals();
    }
}
