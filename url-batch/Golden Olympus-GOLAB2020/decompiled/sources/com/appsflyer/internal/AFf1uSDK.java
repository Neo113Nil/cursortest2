package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.ironsource.ms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1uSDK extends AFf1rSDK {
    private final AFa1gSDK AFInAppEventParameterName;
    private final AFh1vSDK AFInAppEventType;
    private final AFh1uSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    public Map<String, Object> copydefault;
    private final AFj1sSDK equals;
    private final AFc1qSDK hashCode;
    private final AFf1oSDK registerClient;

    /* renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFj1qSDK.AFa1ySDK.values().length];
            AFAdRevenueData = iArr;
            try {
                iArr[AFj1qSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFAdRevenueData[AFj1qSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1uSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK) {
        super(aFh1rSDK, aFc1dSDK);
        this.equals = aFc1dSDK.AFLogger();
        this.hashCode = aFc1dSDK.component2();
        this.AFInAppEventType = aFc1dSDK.areAllFieldsValid();
        this.registerClient = aFc1dSDK.component1();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFc1dSDK.afVerboseLog();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLogForExcManagerOnly();
        this.AFAdRevenueData.add(AFe1mSDK.RESOLVE_ESP);
        this.AFAdRevenueData.add(AFe1mSDK.DLSDK);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        boolean z4 = this.getMediationNetwork == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1mSDK aFe1mSDK = this.getMonetizationNetwork;
        return z4 && (aFe1mSDK == AFe1mSDK.CONVERSION || aFe1mSDK == AFe1mSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        AFh1uSDK aFh1uSDK;
        AFh1uSDK aFh1uSDK2;
        super.AFAdRevenueData(aFh1rSDK);
        int i4 = aFh1rSDK.component2;
        AFAdRevenueData(i4);
        Map map = (Map) aFh1rSDK.AFAdRevenueData.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1rSDK.AFAdRevenueData.put("meta", map);
        }
        if (!aFh1rSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1rSDK.getMediationNetwork(this.AFInAppEventParameterName.getCurrencyIso4217Code());
        }
        AFi1vSDK AFAdRevenueData = this.registerClient.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFAdRevenueData.AFAdRevenueData);
            String str = AFAdRevenueData.getCurrencyIso4217Code;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j4 = AFAdRevenueData.getRevenue;
            if (j4 > 0) {
                hashMap.put("latency", Long.valueOf(j4));
            }
            long j5 = AFAdRevenueData.getMediationNetwork;
            if (j5 > 0) {
                hashMap.put("delay", Long.valueOf(j5));
            }
            int i5 = AFAdRevenueData.getMonetizationNetwork;
            if (i5 > 0) {
                hashMap.put("res_code", Integer.valueOf(i5));
            }
            if (AFAdRevenueData.component1 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFAdRevenueData.component1.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFAdRevenueData.component1.getMessage());
                hashMap.put("error", sb.toString());
            }
            AFi1ySDK aFi1ySDK = AFAdRevenueData.component4;
            if (aFi1ySDK != null) {
                hashMap.put("sig", aFi1ySDK.toString());
            }
            String str2 = AFAdRevenueData.component3;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK.AFAdRevenueData);
        if (i4 == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1rSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.AFInAppEventType.getMonetizationNetwork);
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
            AFh1uSDK aFh1uSDK3 = this.AFKeystoreWrapper;
            if (aFh1uSDK3 != null) {
                aFh1uSDK3.getCurrencyIso4217Code(aFh1rSDK);
            }
        } else if (i4 == 2) {
            HashMap hashMap4 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("first_launch");
            if ((aFh1rSDK instanceof AFh1kSDK) && (aFh1uSDK2 = this.AFKeystoreWrapper) != null && !aFh1uSDK2.getMonetizationNetwork()) {
                this.AFKeystoreWrapper.getMediationNetwork(aFh1rSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1rSDK.AFAdRevenueData.remove("meta");
        }
        if (i4 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1qSDK aFj1qSDK : this.equals.getRevenue()) {
                boolean z4 = aFj1qSDK instanceof AFi1aSDK;
                int i6 = AnonymousClass1.AFAdRevenueData[aFj1qSDK.component4.ordinal()];
                if (i6 == 1) {
                    if (z4) {
                        aFh1rSDK.getMediationNetwork("rfr", ((AFi1aSDK) aFj1qSDK).getCurrencyIso4217Code);
                        this.hashCode.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1qSDK.AFAdRevenueData);
                } else if (i6 == 2 && i4 == 2 && !z4) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1qSDK.component2);
                    hashMap5.put(ms.f18193n, "TIMEOUT");
                    hashMap5.put("type", aFj1qSDK.areAllFieldsValid);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1rSDK.getMediationNetwork("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFh1rSDK.getMediationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.LAUNCH && (aFh1uSDK = this.AFKeystoreWrapper) != null && aFh1uSDK.getRevenue()) {
            this.AFKeystoreWrapper.getMonetizationNetwork(aFh1rSDK);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK);
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() {
        return super.getMediationNetwork() || equals();
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1vSDK aFh1vSDK = this.AFInAppEventType;
        int i4 = ((AFf1rSDK) this).component2.component2;
        long currentTimeMillis = System.currentTimeMillis();
        if (i4 == 1) {
            long j4 = aFh1vSDK.areAllFieldsValid;
            if (j4 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1vSDK.AFAdRevenueData.put("net", Long.valueOf(currentTimeMillis - j4));
            aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("first_launch", new JSONObject(aFh1vSDK.AFAdRevenueData).toString());
        }
    }

    protected void AFAdRevenueData(int i4) {
        this.AFInAppEventType.getCurrencyIso4217Code(i4);
    }
}
