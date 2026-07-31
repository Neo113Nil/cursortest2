package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFb1ySDK implements Runnable {
    final String AFInAppEventParameterName;
    final String AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final String AFLogger;
    private final AFd1pSDK d;
    private final Map<String, String> registerClient;
    private final String unregisterClient;
    final String valueOf;
    private final WeakReference<Context> values;

    AFb1ySDK(Context context, String str, AFd1pSDK aFd1pSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = new WeakReference<>(context);
        this.AFKeystoreWrapper = str;
        this.AFLogger = str2;
        this.AFInAppEventType = str4;
        this.valueOf = str5;
        this.AFInAppEventParameterName = str6;
        this.registerClient = map;
        this.unregisterClient = str3;
        this.d = aFd1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFKeystoreWrapper;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.AFLogger);
            hashMap.put("sig-data", this.AFInAppEventType);
            hashMap.put("signature", this.unregisterClient);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.registerClient;
            String AFInAppEventType = AFb1tSDK.AFInAppEventType().values().valueOf().AFInAppEventType("referrer", "");
            AFh1uSDK aFh1uSDK = new AFh1uSDK();
            aFh1uSDK.d = AFInAppEventType;
            AFh1uSDK aFh1uSDK2 = aFh1uSDK;
            AFb1tSDK AFInAppEventType2 = AFb1tSDK.AFInAppEventType();
            Map<String, Object> AFKeystoreWrapper = AFInAppEventType2.AFKeystoreWrapper(aFh1uSDK);
            AFKeystoreWrapper.put(FirebaseAnalytics.Param.PRICE, this.valueOf);
            AFKeystoreWrapper.put(FirebaseAnalytics.Param.CURRENCY, this.AFInAppEventParameterName);
            AFKeystoreWrapper.put("receipt_data", hashMap2);
            if (obj != null) {
                AFKeystoreWrapper.put("extra_prms", obj);
            }
            AFKeystoreWrapper.putAll(AFInAppEventType2.values().force().values());
            aFh1uSDK.values((Map<String, ?>) AFKeystoreWrapper);
            aFh1uSDK.values(new AFi1fSDK(this.d).valueOf(aFh1uSDK));
            AFInAppEventParameterName(context, aFh1uSDK);
            hashMap.put("dev_key", this.AFKeystoreWrapper);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            AFh1tSDK aFh1tSDK = (AFh1tSDK) new AFh1tSDK().values(hashMap);
            aFh1tSDK.values(new AFi1fSDK(this.d).valueOf(aFh1tSDK));
            final AFf1nSDK AFInAppEventParameterName = AFInAppEventParameterName(context, aFh1tSDK);
            aFh1tSDK.valueOf = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFb1ySDK.5
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1rSDK) AFInAppEventParameterName).d.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFb1ySDK.AFKeystoreWrapper(jSONObject.optBoolean("result"), AFb1ySDK.this.AFInAppEventType, AFb1ySDK.this.valueOf, AFb1ySDK.this.AFInAppEventParameterName, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFb1ySDK.AFKeystoreWrapper(false, AFb1ySDK.this.AFInAppEventType, AFb1ySDK.this.valueOf, AFb1ySDK.this.AFInAppEventParameterName, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str2) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1rSDK) AFInAppEventParameterName).d) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFb1ySDK.AFKeystoreWrapper(false, AFb1ySDK.this.AFInAppEventType, AFb1ySDK.this.valueOf, AFb1ySDK.this.AFInAppEventParameterName, str2);
                }
            };
        } catch (Throwable th) {
            if (AFb1tSDK.AFKeystoreWrapper != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                AFKeystoreWrapper(false, this.AFInAppEventType, this.valueOf, this.AFInAppEventParameterName, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1nSDK AFInAppEventParameterName(Context context, AFh1wSDK aFh1wSDK) {
        AFb1tSDK.AFInAppEventType().valueOf(context);
        AFd1mSDK values = AFb1tSDK.AFInAppEventType().values();
        aFh1wSDK.AFInAppEventParameterName(values.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0));
        AFf1nSDK aFf1nSDK = new AFf1nSDK(aFh1wSDK, values);
        AFe1cSDK i = values.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1nSDK));
        return aFf1nSDK;
    }

    static void AFKeystoreWrapper(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1tSDK.AFKeystoreWrapper != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1tSDK.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1tSDK.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
