package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFa1aSDK implements Runnable {
    final String AFInAppEventParameterName;
    private final String AFInAppEventType;
    private final WeakReference<Context> AFKeystoreWrapper;
    private final Map<String, String> AFLogger;
    private final String d;
    private final AFd1sSDK e;
    private final String unregisterClient;
    final String valueOf;
    final String values;

    AFa1aSDK(Context context, String str, AFd1sSDK aFd1sSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.d = str2;
        this.valueOf = str4;
        this.AFInAppEventParameterName = str5;
        this.values = str6;
        this.AFLogger = map;
        this.unregisterClient = str3;
        this.e = aFd1sSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFKeystoreWrapper.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.d);
            hashMap.put("sig-data", this.valueOf);
            hashMap.put("signature", this.unregisterClient);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger;
            String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().valueOf().AFKeystoreWrapper("referrer", "");
            AFh1lSDK aFh1lSDK = new AFh1lSDK();
            aFh1lSDK.unregisterClient = AFKeystoreWrapper;
            AFh1lSDK aFh1lSDK2 = aFh1lSDK;
            AFb1vSDK AFKeystoreWrapper2 = AFb1vSDK.AFKeystoreWrapper();
            Map<String, Object> AFKeystoreWrapper3 = AFKeystoreWrapper2.AFKeystoreWrapper(aFh1lSDK);
            AFKeystoreWrapper3.put("price", this.AFInAppEventParameterName);
            AFKeystoreWrapper3.put("currency", this.values);
            AFKeystoreWrapper3.put("receipt_data", hashMap2);
            if (obj != null) {
                AFKeystoreWrapper3.put("extra_prms", obj);
            }
            AFKeystoreWrapper3.putAll(AFKeystoreWrapper2.AFInAppEventParameterName().i().AFInAppEventParameterName());
            aFh1lSDK.valueOf((Map<String, ?>) AFKeystoreWrapper3);
            aFh1lSDK.valueOf(new AFj1xSDK(this.e).AFInAppEventParameterName(aFh1lSDK));
            values(context, aFh1lSDK);
            hashMap.put("dev_key", this.AFInAppEventType);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
            AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null;
            String str2 = aFb1zSDK != null ? aFb1zSDK.AFInAppEventParameterName : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1nSDK aFh1nSDK = (AFh1nSDK) new AFh1nSDK().valueOf(hashMap);
            aFh1nSDK.valueOf(new AFj1xSDK(this.e).AFInAppEventParameterName(aFh1nSDK));
            final AFf1lSDK values = values(context, aFh1nSDK);
            aFh1nSDK.values = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1aSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1nSDK) values).registerClient.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1aSDK.AFInAppEventParameterName(jSONObject.optBoolean("result"), AFa1aSDK.this.valueOf, AFa1aSDK.this.AFInAppEventParameterName, AFa1aSDK.this.values, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1aSDK.AFInAppEventParameterName(false, AFa1aSDK.this.valueOf, AFa1aSDK.this.AFInAppEventParameterName, AFa1aSDK.this.values, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1nSDK) values).registerClient) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1aSDK.AFInAppEventParameterName(false, AFa1aSDK.this.valueOf, AFa1aSDK.this.AFInAppEventParameterName, AFa1aSDK.this.values, str3);
                }
            };
        } catch (Throwable th) {
            if (AFb1vSDK.AFKeystoreWrapper != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                AFInAppEventParameterName(false, this.valueOf, this.AFInAppEventParameterName, this.values, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1lSDK values(Context context, AFh1kSDK aFh1kSDK) {
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK AFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        aFh1kSDK.AFInAppEventType(AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        AFf1lSDK aFf1lSDK = new AFf1lSDK(aFh1kSDK, AFInAppEventParameterName);
        AFe1cSDK afInfoLog = AFInAppEventParameterName.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFf1lSDK));
        return aFf1lSDK;
    }

    static void AFInAppEventParameterName(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1vSDK.AFKeystoreWrapper != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1vSDK.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1vSDK.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
