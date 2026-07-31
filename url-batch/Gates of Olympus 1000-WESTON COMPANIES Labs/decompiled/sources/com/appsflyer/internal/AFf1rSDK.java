package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1rSDK extends AFf1sSDK {
    private final AFf1kSDK AFInAppEventType;
    private final AFa1lSDK AFKeystoreWrapper;
    private final AppsFlyerProperties AFLogger;
    private final AFc1qSDK copy;
    private final AFj1sSDK copydefault;
    private final AFh1xSDK equals;
    public Map<String, Object> hashCode;
    private final AFh1pSDK registerClient;

    public AFf1rSDK(AFh1mSDK aFh1mSDK, AFd1zSDK aFd1zSDK) {
        super(aFh1mSDK, aFd1zSDK);
        this.copydefault = aFd1zSDK.AFLogger();
        this.copy = aFd1zSDK.component4();
        this.equals = aFd1zSDK.areAllFieldsValid();
        this.AFInAppEventType = aFd1zSDK.component1();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFKeystoreWrapper = aFd1zSDK.afVerboseLog();
        this.registerClient = aFd1zSDK.afWarnLog();
        this.getCurrencyIso4217Code.add(AFe1pSDK.RESOLVE_ESP);
        this.getCurrencyIso4217Code.add(AFe1pSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFh1xSDK aFh1xSDK = this.equals;
        if (aFh1xSDK.getCurrencyIso4217Code()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aFh1xSDK.copy != 0) {
                aFh1xSDK.AFAdRevenueData.put("net", Long.valueOf(currentTimeMillis - aFh1xSDK.copy));
                aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
                return;
            }
            AFLogger.afInfoLog("Metrics: launch start ts is missing");
        }
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return super.getMonetizationNetwork() || copy();
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    protected final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        AFh1pSDK aFh1pSDK;
        AFh1pSDK aFh1pSDK2;
        super.AFAdRevenueData(aFh1mSDK);
        int i = aFh1mSDK.component4;
        AFh1xSDK aFh1xSDK = this.equals;
        if (aFh1xSDK.getCurrencyIso4217Code()) {
            aFh1xSDK.copy = System.currentTimeMillis();
            if (aFh1xSDK.component4 != 0) {
                aFh1xSDK.AFAdRevenueData.put("from_fg", Long.valueOf(aFh1xSDK.copy - aFh1xSDK.component4));
                aFh1xSDK.getMonetizationNetwork.getRevenue("first_launch", new JSONObject(aFh1xSDK.AFAdRevenueData).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1mSDK.AFAdRevenueData.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1mSDK.AFAdRevenueData.put("meta", map);
        }
        if (!aFh1mSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1mSDK.AFAdRevenueData(this.AFKeystoreWrapper.getRevenue());
        }
        AFi1wSDK currencyIso4217Code = this.AFInAppEventType.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", currencyIso4217Code.getMonetizationNetwork);
            if (currencyIso4217Code.AFAdRevenueData != null) {
                hashMap.put("c_ver", currencyIso4217Code.AFAdRevenueData);
            }
            if (currencyIso4217Code.getCurrencyIso4217Code > 0) {
                hashMap.put("latency", Long.valueOf(currencyIso4217Code.getCurrencyIso4217Code));
            }
            if (currencyIso4217Code.getRevenue > 0) {
                hashMap.put("delay", Long.valueOf(currencyIso4217Code.getRevenue));
            }
            if (currencyIso4217Code.getMediationNetwork > 0) {
                hashMap.put("res_code", Integer.valueOf(currencyIso4217Code.getMediationNetwork));
            }
            if (currencyIso4217Code.component1 != null) {
                hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new StringBuilder().append(currencyIso4217Code.component1.getClass().getSimpleName()).append(": ").append(currencyIso4217Code.component1.getMessage()).toString());
            }
            if (currencyIso4217Code.areAllFieldsValid != null) {
                hashMap.put("sig", currencyIso4217Code.areAllFieldsValid.toString());
            }
            if (currencyIso4217Code.component2 != null) {
                hashMap.put("cdn_cache_status", currencyIso4217Code.component2);
            }
            map.put("rc", hashMap);
        }
        this.toString.getCurrencyIso4217Code(aFh1mSDK.AFAdRevenueData);
        if (i == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1mSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            AFh1xSDK aFh1xSDK2 = this.equals;
            HashMap hashMap2 = new HashMap(aFh1xSDK2.getMediationNetwork);
            aFh1xSDK2.getMediationNetwork.clear();
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.equals.AFAdRevenueData);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
            AFh1pSDK aFh1pSDK3 = this.registerClient;
            if (aFh1pSDK3 != null) {
                aFh1pSDK3.getCurrencyIso4217Code(aFh1mSDK);
            }
        } else if (i == 2) {
            AFh1xSDK aFh1xSDK3 = this.equals;
            aFh1xSDK3.getMonetizationNetwork.AFAdRevenueData("first_launch");
            HashMap hashMap4 = new HashMap(aFh1xSDK3.AFAdRevenueData);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            if ((aFh1mSDK instanceof AFh1kSDK) && (aFh1pSDK2 = this.registerClient) != null && !aFh1pSDK2.getRevenue()) {
                this.registerClient.getMediationNetwork(aFh1mSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1mSDK.AFAdRevenueData.remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) this.copydefault.getRevenue.toArray(new AFj1tSDK[0])) {
                boolean z = aFj1tSDK instanceof AFi1aSDK;
                int i2 = AnonymousClass4.getMonetizationNetwork[aFj1tSDK.component4.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFh1mSDK.getMonetizationNetwork("rfr", ((AFi1aSDK) aFj1tSDK).getMonetizationNetwork);
                        this.copy.AFAdRevenueData(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1tSDK.getMediationNetwork);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1tSDK.component3);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1tSDK.areAllFieldsValid);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1mSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.hashCode;
            if (obj != null) {
                aFh1mSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.LAUNCH && (aFh1pSDK = this.registerClient) != null && aFh1pSDK.getMonetizationNetwork()) {
            this.registerClient.getMonetizationNetwork(aFh1mSDK);
        }
        this.toString.getMonetizationNetwork(aFh1mSDK);
    }

    /* renamed from: com.appsflyer.internal.AFf1rSDK$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFj1tSDK.AFa1tSDK.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AFj1tSDK.AFa1tSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AFj1tSDK.AFa1tSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean copy() {
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        return (this.getMonetizationNetwork == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1) && (this.getRevenue == AFe1pSDK.CONVERSION || this.getRevenue == AFe1pSDK.ATTR);
    }
}
