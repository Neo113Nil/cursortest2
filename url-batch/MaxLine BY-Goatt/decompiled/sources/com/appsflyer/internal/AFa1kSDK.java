package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFa1kSDK implements Runnable {
    private static String AFKeystoreWrapper = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private final String AFInAppEventParameterName;
    private final Intent AFInAppEventType;
    private final String AFLogger;
    private final Map<String, String> AFLogger$LogLevel;
    private final String afDebugLog;
    private final String afErrorLog;
    private final String afInfoLog;
    private final String afRDLog;
    private final WeakReference<Context> values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AFa1dSDK.AFKeystoreWrapper);
        sb.append("/androidevent?buildnumber=6.12.1&app_id=");
        valueOf = sb.toString();
    }

    public AFa1kSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.values = new WeakReference<>(context);
        this.AFInAppEventParameterName = str;
        this.afDebugLog = str2;
        this.AFLogger = str4;
        this.afInfoLog = str5;
        this.afRDLog = str6;
        this.AFLogger$LogLevel = map;
        this.afErrorLog = str3;
        this.AFInAppEventType = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AFInAppEventParameterName(boolean z, String str, String str2, String str3, String str4) {
        if (AFa1dSDK.AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1dSDK.AFInAppEventParameterName.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1dSDK.AFInAppEventParameterName;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFd1eSDK AFInAppEventType(Context context, AFe1cSDK aFe1cSDK) {
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFc1zSDK AFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        aFe1cSDK.valueOf(AFInAppEventParameterName.AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0));
        AFd1eSDK aFd1eSDK = new AFd1eSDK(aFe1cSDK, AFInAppEventParameterName);
        AFd1tSDK level = AFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1eSDK));
        return aFd1eSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.values.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.afDebugLog);
            hashMap.put("sig-data", this.AFLogger);
            hashMap.put("signature", this.afErrorLog);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger$LogLevel;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(valueOf, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            sb.append(context.getPackageName());
            String obj2 = sb.toString();
            String valueOf2 = AFa1dSDK.valueOf().AFInAppEventParameterName().AFKeystoreWrapper().valueOf("referrer", BuildConfig.FLAVOR);
            AFa1qSDK aFf1zSDK = new AFf1zSDK();
            aFf1zSDK.AFLogger = valueOf2;
            AFa1dSDK valueOf3 = AFa1dSDK.valueOf();
            Map<String, Object> values = valueOf3.values(aFf1zSDK);
            values.put(FirebaseAnalytics.Param.PRICE, this.afInfoLog);
            values.put(FirebaseAnalytics.Param.CURRENCY, this.afRDLog);
            values.put("receipt_data", hashMap2);
            if (obj != null) {
                values.put("extra_prms", obj);
            }
            values.putAll(valueOf3.AFInAppEventParameterName().AFVersionDeclaration().AFKeystoreWrapper());
            AFInAppEventType(context, (AFf1zSDK) aFf1zSDK.AFInAppEventType(values).valueOf(obj2));
            hashMap.put("dev_key", this.AFInAppEventParameterName);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            AFe1dSDK aFe1dSDK = (AFe1dSDK) new AFe1dSDK().AFInAppEventType(hashMap).valueOf(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
            final AFd1eSDK AFInAppEventType = AFInAppEventType(context, aFe1dSDK);
            aFe1dSDK.AFInAppEventType = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1kSDK.1
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str2) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFd1nSDK) AFInAppEventType).AFLogger) != null) {
                        str2 = responseNetwork.toString();
                    }
                    AFa1kSDK.AFInAppEventParameterName(false, AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, str2);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFd1nSDK) AFInAppEventType).AFLogger.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1kSDK.AFInAppEventParameterName(jSONObject.optBoolean("result"), AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1kSDK.AFInAppEventParameterName(false, AFa1kSDK.this.AFLogger, AFa1kSDK.this.afInfoLog, AFa1kSDK.this.afRDLog, e.getMessage());
                    }
                }
            };
        } catch (Throwable th) {
            if (AFa1dSDK.AFInAppEventParameterName != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                AFInAppEventParameterName(false, this.AFLogger, this.afInfoLog, this.afRDLog, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }
}
