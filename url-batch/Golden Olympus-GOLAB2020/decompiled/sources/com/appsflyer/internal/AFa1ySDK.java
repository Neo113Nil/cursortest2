package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1ySDK implements Runnable {
    private final String AFAdRevenueData;
    private final String areAllFieldsValid;
    private final Map<String, String> component1;
    private final String component3;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    private final WeakReference<Context> getMonetizationNetwork;
    final String getRevenue;

    AFa1ySDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getMonetizationNetwork = new WeakReference<>(context);
        this.AFAdRevenueData = str;
        this.component3 = str2;
        this.getMediationNetwork = str4;
        this.getCurrencyIso4217Code = str5;
        this.getRevenue = str6;
        this.component1 = map;
        this.areAllFieldsValid = str3;
    }

    static void getMediationNetwork(boolean z4, String str, String str2, String str3, String str4) {
        if (AFa1tSDK.AFAdRevenueData != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z4) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1tSDK.AFAdRevenueData.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1tSDK.AFAdRevenueData;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFf1rSDK getRevenue(Context context, AFh1hSDK aFh1hSDK) {
        ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getMediationNetwork(context);
        AFc1dSDK AFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
        aFh1hSDK.AFAdRevenueData(AFAdRevenueData.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        AFf1rSDK aFf1rSDK = new AFf1rSDK(aFh1hSDK, AFAdRevenueData);
        AFe1lSDK copydefault = AFAdRevenueData.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFf1rSDK));
        return aFf1rSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getMonetizationNetwork.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.component3);
            hashMap.put("sig-data", this.getMediationNetwork);
            hashMap.put("signature", this.areAllFieldsValid);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.component1;
            String AFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().component2().AFAdRevenueData("referrer", "");
            AFi1zSDK aFi1zSDK = new AFi1zSDK();
            aFi1zSDK.component3 = AFAdRevenueData;
            AFa1tSDK aFa1tSDK = (AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
            Map<String, Object> mediationNetwork = aFa1tSDK.getMediationNetwork(aFi1zSDK);
            mediationNetwork.put("price", this.getCurrencyIso4217Code);
            mediationNetwork.put("currency", this.getRevenue);
            mediationNetwork.put("receipt_data", hashMap2);
            if (obj != null) {
                mediationNetwork.put("extra_prms", obj);
            }
            mediationNetwork.putAll(aFa1tSDK.AFAdRevenueData().registerClient().getCurrencyIso4217Code());
            aFi1zSDK.getMediationNetwork(mediationNetwork);
            getRevenue(context, aFi1zSDK);
            hashMap.put("dev_key", this.AFAdRevenueData);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1oSDK aFh1oSDK = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData().getRevenue().getCurrencyIso4217Code.component3;
            AFb1mSDK aFb1mSDK = aFh1oSDK != null ? new AFb1mSDK(aFh1oSDK.AFAdRevenueData, aFh1oSDK.getRevenue) : null;
            String str2 = aFb1mSDK != null ? aFb1mSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1gSDK aFh1gSDK = (AFh1gSDK) new AFh1gSDK().getMediationNetwork(hashMap);
            final AFf1rSDK revenue = getRevenue(context, aFh1gSDK);
            aFh1gSDK.getCurrencyIso4217Code = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1ySDK.5
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i4, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i4 == 50 && (responseNetwork = ((AFe1dSDK) revenue).component1) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                    AFa1ySDK.getMediationNetwork(false, aFa1ySDK.getMediationNetwork, aFa1ySDK.getCurrencyIso4217Code, aFa1ySDK.getRevenue, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1dSDK) revenue).component1.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean optBoolean = jSONObject.optBoolean("result");
                        AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                        AFa1ySDK.getMediationNetwork(optBoolean, aFa1ySDK.getMediationNetwork, aFa1ySDK.getCurrencyIso4217Code, aFa1ySDK.getRevenue, jSONObject.toString());
                    } catch (Exception e4) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e4)), e4);
                        AFa1ySDK aFa1ySDK2 = AFa1ySDK.this;
                        AFa1ySDK.getMediationNetwork(false, aFa1ySDK2.getMediationNetwork, aFa1ySDK2.getCurrencyIso4217Code, aFa1ySDK2.getRevenue, e4.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1tSDK.AFAdRevenueData != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getMediationNetwork(false, this.getMediationNetwork, this.getCurrencyIso4217Code, this.getRevenue, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
