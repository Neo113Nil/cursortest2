package com.appsflyer.appsflyersdk;

import D6.z;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.MediationNetwork;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o4.c;
import org.json.JSONException;
import org.json.JSONObject;
import p4.InterfaceC0828a;
import s4.f;
import s4.i;
import s4.n;
import s4.o;
import s4.p;
import s4.q;
import s4.t;

/* loaded from: classes.dex */
public class AppsflyerSdkPlugin implements o, c, InterfaceC0828a {
    private static DeepLinkResult cachedDeepLinkResult;
    private static Map<String, String> cachedOnAppOpenAttribution;
    private static String cachedOnAttributionFailure;
    private static String cachedOnConversionDataFail;
    private static Map<String, Object> cachedOnConversionDataSuccess;
    private static boolean saveCallbacks;
    private Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final o callbacksHandler;
    private Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    private q mCallbackChannel;
    private Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private i mEventChannel;
    private q mMethodChannel;
    private Boolean oaoaCallback;
    t onNewIntentListener;
    private Boolean udlCallback;
    final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    private Boolean validatePurchaseCallback;

    /* renamed from: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin$5, reason: invalid class name */
    public class AnonymousClass5 implements AppsFlyerRequestListener {
        public AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onError$1(int i2, String str) {
            if (AppsflyerSdkPlugin.this.mMethodChannel == null) {
                Log.e("AppsFlyer_FlutterPlugin", "mMethodChannel is null, cannot invoke the callback - SDK failed to start: " + str);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", Integer.valueOf(i2));
                hashMap.put("errorMessage", str);
                AppsflyerSdkPlugin.this.mMethodChannel.a("onError", hashMap, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onSuccess$0() {
            if (AppsflyerSdkPlugin.this.mMethodChannel != null) {
                AppsflyerSdkPlugin.this.mMethodChannel.a("onSuccess", null, null);
            } else {
                Log.e("AppsFlyer_FlutterPlugin", "mMethodChannel is null, cannot invoke the callback - SDK started successfully but callback `onSuccess` failed");
            }
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onError(final int i2, final String str) {
            AppsflyerSdkPlugin.this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.b
                @Override // java.lang.Runnable
                public final void run() {
                    AppsflyerSdkPlugin.AnonymousClass5.this.lambda$onError$1(i2, str);
                }
            });
        }

        @Override // com.appsflyer.attribution.AppsFlyerRequestListener
        public void onSuccess() {
            AppsflyerSdkPlugin.this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.a
                @Override // java.lang.Runnable
                public final void run() {
                    AppsflyerSdkPlugin.AnonymousClass5.this.lambda$onSuccess$0();
                }
            });
        }
    }

    public AppsflyerSdkPlugin() {
        Boolean bool = Boolean.FALSE;
        this.gcdCallback = bool;
        this.oaoaCallback = bool;
        this.udlCallback = bool;
        this.validatePurchaseCallback = bool;
        this.isFacebookDeferredApplinksEnabled = bool;
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new t() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.1
            @Override // s4.t
            public boolean onNewIntent(Intent intent) {
                if (AppsflyerSdkPlugin.this.activity != null) {
                    AppsflyerSdkPlugin.this.activity.setIntent(intent);
                }
                if (AppsflyerSdkPlugin.this.mApplication == null) {
                    return false;
                }
                AppsFlyerLib.getInstance().performOnDeepLinking(intent, AppsflyerSdkPlugin.this.mApplication);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnAppOpenAttribution = map;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnAttributionFailure = str;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.j(AppsflyerSdkPlugin.this, str), "onAppOpenAttribution", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnConversionDataFail = str;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.j(AppsflyerSdkPlugin.this, str), "onInstallConversionData", "failure");
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedOnConversionDataSuccess = map;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", "success");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.3
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    AppsflyerSdkPlugin.cachedDeepLinkResult = deepLinkResult;
                } else if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new o() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.4
            @Override // s4.o
            public void onMethodCall(n nVar, p pVar) {
                if ("startListening".equals(nVar.f7767a)) {
                    AppsflyerSdkPlugin.this.startListening(nVar.f7768b, pVar);
                } else {
                    pVar.notImplemented();
                }
            }
        };
    }

    private void addPushNotificationDeepLinkPath(n nVar, p pVar) {
        Object obj = nVar.f7768b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        pVar.success(null);
    }

    private void anonymizeUser(n nVar, p pVar) {
        AppsFlyerLib.getInstance().anonymizeUser(((Boolean) nVar.a("shouldAnonymize")).booleanValue());
        pVar.success(null);
    }

    private JSONObject buildJsonResponse(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("data", obj.toString());
            return jSONObject;
        } catch (JSONException e7) {
            e7.printStackTrace();
            return jSONObject;
        }
    }

    private void disableAppSetId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().disableAppSetId();
        pVar.success(null);
    }

    private void enableFacebookDeferredApplinks(n nVar, p pVar) {
        Boolean bool = (Boolean) nVar.a("isFacebookDeferredApplinksEnabled");
        bool.booleanValue();
        this.isFacebookDeferredApplinksEnabled = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(true);
        } else {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(false);
        }
        pVar.success(null);
    }

    private void enableTCFDataCollection(n nVar, p pVar) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(((Boolean) nVar.a("shouldCollect")).booleanValue());
        pVar.success(null);
    }

    private void generateInviteLink(n nVar, p pVar) {
        String str = (String) nVar.a(AppsFlyerProperties.CHANNEL);
        String str2 = (String) nVar.a("customerID");
        String str3 = (String) nVar.a("campaign");
        String str4 = (String) nVar.a("referrerName");
        String str5 = (String) nVar.a("referrerImageUrl");
        String str6 = (String) nVar.a("baseDeeplink");
        String str7 = (String) nVar.a("brandDomain");
        Map<String, String> map = (Map) nVar.a("customParams");
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (str != null && !str.equals("")) {
            generateInviteUrl.setChannel(str);
        }
        if (str3 != null && !str3.equals("")) {
            generateInviteUrl.setCampaign(str3);
        }
        if (str4 != null && !str4.equals("")) {
            generateInviteUrl.setReferrerName(str4);
        }
        if (str5 != null && !str5.equals("")) {
            generateInviteUrl.setReferrerImageURL(str5);
        }
        if (str2 != null && !str2.equals("")) {
            generateInviteUrl.setReferrerCustomerId(str2);
        }
        if (str6 != null && !str6.equals("")) {
            generateInviteUrl.setBaseDeeplink(str6);
        }
        if (str7 != null && !str7.equals("")) {
            generateInviteUrl.setBrandDomain(str7);
        }
        if (map != null && !map.equals("")) {
            generateInviteUrl.addParameters(map);
        }
        generateInviteUrl.generateLink(this.mContext, new LinkGenerator.ResponseListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.6
            final JSONObject obj = new JSONObject();

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponse(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", "success");
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                }
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public void onResponseError(String str8) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", str8);
                        AppsflyerSdkPlugin.this.runOnUIThread(str8, "generateInviteLinkFailure", "failure");
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                }
            }
        });
        pVar.success(null);
    }

    private AppsFlyerConsent getAppsFlyerConsentFromCall(n nVar) {
        Map map = (Map) nVar.f7768b;
        return new AppsFlyerConsent((Boolean) map.get("isUserSubjectToGDPR"), (Boolean) map.get("consentForDataUsage"), (Boolean) map.get("consentForAdsPersonalization"), (Boolean) map.get("hasConsentForAdStorage"));
    }

    private void getAppsFlyerUID(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void getHostName(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getHostName());
    }

    private void getHostPrefix(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getOutOfStore(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void getSdkVersion(p pVar) {
        pVar.success(AppsFlyerLib.getInstance().getSdkVersion());
    }

    private void initSdk(n nVar, p pVar) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        boolean booleanValue = ((Boolean) nVar.a("manualStart")).booleanValue();
        String str = (String) nVar.a("afDevKey");
        if (str == null || str.equals("")) {
            Log.e("AppsFlyer_FlutterPlugin", LogMessages.AF_DEV_KEY_IS_EMPTY);
            pVar.error("INIT_ERROR", LogMessages.AF_DEV_KEY_IS_EMPTY, null);
            return;
        }
        if (((Boolean) nVar.a("disableAdvertisingIdentifier")).booleanValue()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((Boolean) nVar.a("GCD")).booleanValue() ? this.afConversionListener : null;
        if (((Boolean) nVar.a("UDL")).booleanValue()) {
            appsFlyerLib.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean) nVar.a("isDebug")).booleanValue()) {
            appsFlyerLib.setLogLevel(AFLogger.LogLevel.DEBUG);
            appsFlyerLib.setDebugLog(true);
        } else {
            appsFlyerLib.setDebugLog(false);
        }
        appsFlyerLib.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.18.0"));
        appsFlyerLib.init(str, appsFlyerConversionListener, this.mContext);
        String str2 = (String) nVar.a("appInviteOneLink");
        if (str2 != null) {
            appsFlyerLib.setAppInviteOneLink(str2);
        }
        if (!booleanValue) {
            appsFlyerLib.start(this.activity);
        }
        if (saveCallbacks) {
            saveCallbacks = false;
            sendCachedCallbacksToDart();
        }
        pVar.success("success");
    }

    public static /* bridge */ /* synthetic */ JSONObject j(AppsflyerSdkPlugin appsflyerSdkPlugin, String str) {
        return appsflyerSdkPlugin.buildJsonResponse(str, "failure");
    }

    private static Bundle jsonToBundle(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            bundle.putString(next, jSONObject.getString(next));
        }
        return bundle;
    }

    private void logAdRevenue(n nVar, p pVar) {
        try {
            String str = (String) requireNonNullArgument(nVar, "monetizationNetwork");
            String str2 = (String) requireNonNullArgument(nVar, "currencyIso4217Code");
            double doubleValue = ((Double) requireNonNullArgument(nVar, "revenue")).doubleValue();
            MediationNetwork valueOf = MediationNetwork.valueOf(((String) requireNonNullArgument(nVar, "mediationNetwork")).toUpperCase(Locale.ENGLISH));
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(str, valueOf, str2, doubleValue), (Map) nVar.a("additionalParameters"));
            pVar.success(Boolean.TRUE);
        } catch (IllegalArgumentException e7) {
            pVar.error("INVALID_ARGUMENT_PROVIDED", e7.getMessage(), null);
        } catch (Throwable th) {
            pVar.error("UNEXPECTED_ERROR", "[logAdRevenue]: An unexpected error occurred: " + th.getMessage(), null);
            Log.e("AppsFlyer_FlutterPlugin", "Unexpected exception occurred: [logAdRevenue]", th);
        }
    }

    private void logCrossPromotionAndOpenStore(n nVar, p pVar) {
        String str = (String) nVar.a("appId");
        String str2 = (String) nVar.a("campaign");
        Map map = (Map) nVar.a("params");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, str, str2, map);
        }
        pVar.success(null);
    }

    private void logCrossPromotionImpression(n nVar, p pVar) {
        String str = (String) nVar.a("appId");
        String str2 = (String) nVar.a("campaign");
        Map map = (Map) nVar.a("data");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, str, str2, map);
        }
        pVar.success(null);
    }

    private void logEvent(n nVar, p pVar) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String) nVar.a("eventName"), (Map) nVar.a("eventValues"));
        pVar.success(Boolean.TRUE);
    }

    private AFPurchaseType mapPurchaseType(String str) {
        str.getClass();
        if (str.equals("one_time_purchase")) {
            return AFPurchaseType.ONE_TIME_PURCHASE;
        }
        if (str.equals("subscription")) {
            return AFPurchaseType.SUBSCRIPTION;
        }
        return null;
    }

    private void performOnDeepLinking(n nVar, p pVar) {
        Activity activity = this.activity;
        if (activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: activity is null!");
            pVar.error("NO_ACTIVITY", "The current activity is null", null);
            return;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.mApplication);
            pVar.success(null);
        } else {
            Log.d("AppsFlyer_FlutterPlugin", "performOnDeepLinking: intent is null!");
            pVar.error("NO_INTENT", "The intent is null", null);
        }
    }

    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.9
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", "success");
                }
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jSONObject, "validatePurchase", "failure");
                    }
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> replaceNullValues(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            hashMap.put(next.getKey(), next.getValue() == null ? JSONObject.NULL : next.getValue());
            it.remove();
        }
        return hashMap;
    }

    private <T> T requireNonNullArgument(n nVar, String str) {
        T t6 = (T) nVar.a(str);
        String str2 = nVar.f7767a;
        if (t6 != null) {
            return t6;
        }
        Log.e("AppsFlyer_FlutterPlugin", "Exception occurred when trying to: " + str2 + "->" + str + " must not be null");
        throw new IllegalArgumentException("[" + str2 + "]: " + str + " must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(final Object obj, final String str, final String str2) {
        this.uiThreadHandler.post(new Runnable() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.7
            @Override // java.lang.Runnable
            public void run() {
                if (AppsflyerSdkPlugin.this.mCallbackChannel == null) {
                    C4.p.p(new StringBuilder("CallbackChannel is null, cannot invoke method: "), str, "AppsFlyer_FlutterPlugin");
                    return;
                }
                Log.d("AppsFlyer_FlutterPlugin", "Calling invokeMethod with: " + obj);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    if (str.equals("onDeepLinking")) {
                        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
                        jSONObject.put("deepLinkStatus", deepLinkResult.getStatus().toString());
                        if (deepLinkResult.getError() != null) {
                            jSONObject.put("deepLinkError", deepLinkResult.getError().toString());
                        }
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("deepLinkObj", deepLinkResult.getDeepLink().getClickEvent());
                        }
                    } else {
                        jSONObject.put("status", str2);
                        jSONObject.put("data", obj.toString());
                    }
                } catch (JSONException e7) {
                    e7.printStackTrace();
                }
                AppsflyerSdkPlugin.this.mCallbackChannel.a("callListener", jSONObject.toString(), null);
            }
        });
    }

    private void sendCachedCallbacksToDart() {
        DeepLinkResult deepLinkResult = cachedDeepLinkResult;
        if (deepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(deepLinkResult);
            cachedDeepLinkResult = null;
        }
        Map<String, Object> map = cachedOnConversionDataSuccess;
        if (map != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        Map<String, String> map2 = cachedOnAppOpenAttribution;
        if (map2 != null) {
            this.afConversionListener.onAppOpenAttribution(map2);
            cachedOnAppOpenAttribution = null;
        }
        String str = cachedOnAttributionFailure;
        if (str != null) {
            this.afConversionListener.onAttributionFailure(str);
            cachedOnAttributionFailure = null;
        }
        String str2 = cachedOnConversionDataFail;
        if (str2 != null) {
            this.afConversionListener.onConversionDataFail(str2);
            cachedOnConversionDataFail = null;
        }
    }

    private void sendPushNotificationData(n nVar, p pVar) {
        String str;
        Map map = (Map) nVar.f7768b;
        if (map == null) {
            Log.d("AppsFlyer_FlutterPlugin", "Push payload is null");
            return;
        }
        try {
            Bundle jsonToBundle = jsonToBundle(new JSONObject(map));
            Activity activity = this.activity;
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    intent.putExtras(jsonToBundle);
                    this.activity.setIntent(intent);
                    AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
                    str = null;
                } else {
                    str = "The intent is null. Push payload has not been sent!";
                }
            } else {
                str = "The activity is null. Push payload has not been sent!";
            }
            if (str != null) {
                Log.d("AppsFlyer_FlutterPlugin", str);
            } else {
                pVar.success(null);
            }
        } catch (JSONException unused) {
            Log.d("AppsFlyer_FlutterPlugin", "Can't parse pushPayload to bundle");
        }
    }

    private void setAdditionalData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setAdditionalData((HashMap) nVar.a("customData"));
        pVar.success(null);
    }

    private void setAndroidIdData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setAndroidIdData((String) nVar.a("androidId"));
        pVar.success(null);
    }

    private void setAppInivteOneLinkID(n nVar, p pVar) {
        String str = (String) nVar.a("oneLinkID");
        if (str == null || str.length() == 0) {
            pVar.success(null);
            return;
        }
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
            runOnUIThread(buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
        }
    }

    private void setCollectAndroidId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCollectAndroidID(((Boolean) nVar.a("isCollect")).booleanValue());
        pVar.success(null);
    }

    private void setCollectIMEI(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCollectIMEI(((Boolean) nVar.a("isCollect")).booleanValue());
        pVar.success(null);
    }

    private void setCurrencyCode(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCurrencyCode((String) nVar.a(AppsFlyerProperties.CURRENCY_CODE));
        pVar.success(null);
    }

    private void setCustomerIdAndLogSession(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String) nVar.a("id"), this.mContext);
        pVar.success(null);
    }

    private void setCustomerUserId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setCustomerUserId((String) nVar.a("id"));
        pVar.success(null);
    }

    private void setDisableAdvertisingIdentifiers(n nVar, p pVar) {
        Boolean bool = (Boolean) nVar.f7768b;
        bool.booleanValue();
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        if (bool.booleanValue()) {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
        } else {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
        }
        pVar.success(null);
    }

    private void setDisableNetworkData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setDisableNetworkData(((Boolean) nVar.f7768b).booleanValue());
        pVar.success(null);
    }

    private void setHost(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setHost((String) nVar.a("hostPrefix"), (String) nVar.a("hostName"));
    }

    private void setImeiData(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setImeiData((String) nVar.a("imei"));
        pVar.success(null);
    }

    private void setIsUpdate(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setIsUpdate(((Boolean) nVar.a("isUpdate")).booleanValue());
        pVar.success(null);
    }

    private void setMinTimeBetweenSessions(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(((Integer) nVar.a("seconds")).intValue());
        pVar.success(null);
    }

    private void setOneLinkCustomDomain(n nVar, p pVar) {
        ArrayList arrayList = (ArrayList) nVar.f7768b;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) arrayList.toArray(new String[arrayList.size()]));
        pVar.success(null);
    }

    private void setOutOfStore(n nVar, p pVar) {
        String str = (String) nVar.f7768b;
        if (str != null) {
            AppsFlyerLib.getInstance().setOutOfStore(str);
        }
        pVar.success(null);
    }

    private void setPartnerData(n nVar, p pVar) {
        String str = (String) nVar.a("partnerId");
        HashMap hashMap = (HashMap) nVar.a("partnersData");
        if (hashMap != null) {
            AppsFlyerLib.getInstance().setPartnerData(str, hashMap);
        }
        pVar.success(null);
    }

    private void setPushNotification(n nVar, p pVar) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        pVar.success(null);
    }

    private void setResolveDeepLinkURLs(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) ((ArrayList) nVar.f7768b).toArray(new String[0]));
        pVar.success(null);
    }

    private void setSharingFilter(n nVar, p pVar) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        pVar.success(null);
    }

    private void setSharingFilterForAllPartners(p pVar) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        pVar.success(null);
    }

    private void setSharingFilterForPartners(n nVar, p pVar) {
        Object obj = nVar.f7768b;
        if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        pVar.success(null);
    }

    private void setUserEmails(n nVar, p pVar) {
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        List list = (List) nVar.a("emails");
        int intValue = ((Integer) nVar.a("cryptType")).intValue();
        if (intValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        } else {
            if (intValue != 1) {
                throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
            }
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[]) list.toArray(new String[0]));
        }
        pVar.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startListening(Object obj, p pVar) {
        String str = (String) obj;
        if (str.equals("onInstallConversionData")) {
            this.gcdCallback = Boolean.TRUE;
        }
        if (str.equals("onAppOpenAttribution")) {
            this.oaoaCallback = Boolean.TRUE;
        }
        if (str.equals("onDeepLinking")) {
            this.udlCallback = Boolean.TRUE;
        }
        if (str.equals("validatePurchase")) {
            this.validatePurchaseCallback = Boolean.TRUE;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        this.mCallbacks.put(str, hashMap);
        pVar.success(null);
    }

    private void startSDK(n nVar, p pVar) {
        AppsFlyerLib.getInstance().start(this.activity);
        pVar.success(null);
    }

    private void startSDKwithHandler(n nVar, p pVar) {
        try {
            AppsFlyerLib.getInstance().start(this.activity, null, new AnonymousClass5());
            pVar.success(null);
        } catch (Throwable th) {
            pVar.error("UNEXPECTED_ERROR", th.getMessage(), null);
        }
    }

    private void stop(n nVar, p pVar) {
        AppsFlyerLib.getInstance().stop(((Boolean) nVar.a("isStopped")).booleanValue(), this.mContext);
        pVar.success(null);
    }

    private void updateServerUninstallToken(n nVar, p pVar) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String) nVar.a("token"));
        pVar.success(null);
    }

    private void validateAndLogInAppPurchase(n nVar, p pVar) {
        registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String) nVar.a("publicKey"), (String) nVar.a("signature"), (String) nVar.a("purchaseData"), (String) nVar.a("price"), (String) nVar.a("currency"), (Map) nVar.a("additionalParameters"));
        pVar.success(null);
    }

    private void validateAndLogInAppPurchaseV2(n nVar, final p pVar) {
        try {
            Map map = (Map) nVar.a("purchaseDetails");
            Map<String, String> map2 = (Map) nVar.a("additionalParameters");
            if (map == null) {
                pVar.error("INVALID_ARGUMENTS", "Purchase details cannot be null", null);
                return;
            }
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            String str = (String) map.get("purchaseType");
            String str2 = (String) map.get("purchaseToken");
            String str3 = (String) map.get("productId");
            if (str != null && str2 != null && str3 != null) {
                AFPurchaseType mapPurchaseType = mapPurchaseType(str);
                if (mapPurchaseType == null) {
                    pVar.error("INVALID_PURCHASE_TYPE", "Invalid purchase type: " + str + ". Expected: 'subscription' or 'one_time_purchase'", null);
                    return;
                }
                AFPurchaseDetails aFPurchaseDetails = new AFPurchaseDetails(mapPurchaseType, str2, str3);
                Log.d("AppsFlyer_FlutterPlugin", "validateAndLogInAppPurchaseV2 called with " + map);
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(aFPurchaseDetails, map2, new AppsFlyerInAppPurchaseValidationCallback() { // from class: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.8
                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationError(Map<String, ?> map3) {
                        Log.d("AppsFlyer_FlutterPlugin", "Purchase validation V2 returned error");
                        String str4 = map3.containsKey("error_message") ? (String) map3.get("error_message") : "Purchase validation failed";
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, ?> entry : map3.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                        pVar.error("VALIDATION_ERROR", str4, hashMap);
                    }

                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationFinished(Map<String, ?> map3) {
                        Log.d("AppsFlyer_FlutterPlugin", "Purchase validation V2 response arrived");
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, ?> entry : map3.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                        pVar.success(hashMap);
                    }
                });
                return;
            }
            pVar.error("INVALID_ARGUMENTS", "Purchase details must contain purchaseType, purchaseToken, and productId", null);
        } catch (Exception e7) {
            Log.e("AppsFlyer_FlutterPlugin", "Error in validateAndLogInAppPurchaseV2: " + e7.getMessage(), e7);
            pVar.error("VALIDATION_ERROR", "Purchase validation failed: " + e7.getMessage(), null);
        }
    }

    private void waitForCustomerUserId(n nVar, p pVar) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(((Boolean) nVar.a("wait")).booleanValue());
        pVar.success(null);
    }

    @Override // p4.InterfaceC0828a
    public void onAttachedToActivity(p4.b bVar) {
        z zVar = (z) bVar;
        Activity activity = (Activity) zVar.f640c;
        this.activity = activity;
        this.mApplication = activity.getApplication();
        ((HashSet) zVar.f642e).add(this.onNewIntentListener);
    }

    @Override // o4.c
    public void onAttachedToEngine(o4.b bVar) {
        onAttachedToEngine(bVar.f7120a, bVar.f7122c);
        AppsFlyerPurchaseConnector.INSTANCE.onAttachedToEngine(bVar);
    }

    @Override // p4.InterfaceC0828a
    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
        AppsFlyerLib.getInstance().unregisterConversionListener();
    }

    @Override // p4.InterfaceC0828a
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
    }

    @Override // o4.c
    public void onDetachedFromEngine(o4.b bVar) {
        this.mMethodChannel.b(null);
        this.mMethodChannel = null;
        this.mEventChannel.a(null);
        this.mEventChannel = null;
        AppsFlyerPurchaseConnector.INSTANCE.onDetachedFromEngine(bVar);
        this.mContext = null;
        this.mApplication = null;
    }

    @Override // s4.o
    public void onMethodCall(n nVar, p pVar) {
        if (this.activity == null) {
            Log.d("AppsFlyer_FlutterPlugin", LogMessages.ACTIVITY_NOT_ATTACHED_TO_ENGINE);
            pVar.error("NO_ACTIVITY", "The current activity is null", null);
        }
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "setAppInviteOneLinkID":
                setAppInivteOneLinkID(nVar, pVar);
                break;
            case "validateAndLogInAppAndroidPurchase":
                validateAndLogInAppPurchase(nVar, pVar);
                break;
            case "setSharingFilterForPartners":
                setSharingFilterForPartners(nVar, pVar);
                break;
            case "setPushNotification":
                setPushNotification(nVar, pVar);
                break;
            case "disableAppSetId":
                disableAppSetId(nVar, pVar);
                break;
            case "getHostPrefix":
                getHostPrefix(pVar);
                break;
            case "setPartnerData":
                setPartnerData(nVar, pVar);
                break;
            case "setOneLinkCustomDomain":
                setOneLinkCustomDomain(nVar, pVar);
                break;
            case "getOutOfStore":
                getOutOfStore(pVar);
                break;
            case "enableFacebookDeferredApplinks":
                enableFacebookDeferredApplinks(nVar, pVar);
                break;
            case "setCurrencyCode":
                setCurrencyCode(nVar, pVar);
                break;
            case "sendPushNotificationData":
                sendPushNotificationData(nVar, pVar);
                break;
            case "setCollectIMEI":
                setCollectIMEI(nVar, pVar);
                break;
            case "logCrossPromotionAndOpenStore":
                logCrossPromotionAndOpenStore(nVar, pVar);
                break;
            case "setOutOfStore":
                setOutOfStore(nVar, pVar);
                break;
            case "setConsentData":
                setConsentData(nVar, pVar);
                break;
            case "getSDKVersion":
                getSdkVersion(pVar);
                break;
            case "logAdRevenue":
                logAdRevenue(nVar, pVar);
                break;
            case "logCrossPromotionImpression":
                logCrossPromotionImpression(nVar, pVar);
                break;
            case "setDisableNetworkData":
                setDisableNetworkData(nVar, pVar);
                break;
            case "stop":
                stop(nVar, pVar);
                break;
            case "setDisableAdvertisingIdentifiers":
                setDisableAdvertisingIdentifiers(nVar, pVar);
                break;
            case "setAndroidIdData":
                setAndroidIdData(nVar, pVar);
                break;
            case "setSharingFilter":
                setSharingFilter(nVar, pVar);
                break;
            case "anonymizeUser":
                anonymizeUser(nVar, pVar);
                break;
            case "updateServerUninstallToken":
                updateServerUninstallToken(nVar, pVar);
                break;
            case "setMinTimeBetweenSessions":
                setMinTimeBetweenSessions(nVar, pVar);
                break;
            case "waitForCustomerUserId":
                waitForCustomerUserId(nVar, pVar);
                break;
            case "setSharingFilterForAllPartners":
                setSharingFilterForAllPartners(pVar);
                break;
            case "setCustomerIdAndLogSession":
                setCustomerIdAndLogSession(nVar, pVar);
                break;
            case "setCustomerUserId":
                setCustomerUserId(nVar, pVar);
                break;
            case "setConsentDataV2":
                setConsentDataV2(nVar, pVar);
                break;
            case "generateInviteLink":
                generateInviteLink(nVar, pVar);
                break;
            case "enableTCFDataCollection":
                enableTCFDataCollection(nVar, pVar);
                break;
            case "setResolveDeepLinkURLs":
                setResolveDeepLinkURLs(nVar, pVar);
                break;
            case "setImeiData":
                setImeiData(nVar, pVar);
                break;
            case "startSDK":
                startSDK(nVar, pVar);
                break;
            case "performOnDeepLinking":
                performOnDeepLinking(nVar, pVar);
                break;
            case "startSDKwithHandler":
                startSDKwithHandler(nVar, pVar);
                break;
            case "setUserEmails":
                setUserEmails(nVar, pVar);
                break;
            case "getHostName":
                getHostName(pVar);
                break;
            case "addPushNotificationDeepLinkPath":
                addPushNotificationDeepLinkPath(nVar, pVar);
                break;
            case "setIsUpdate":
                setIsUpdate(nVar, pVar);
                break;
            case "setCollectAndroidId":
                setCollectAndroidId(nVar, pVar);
                break;
            case "initSdk":
                initSdk(nVar, pVar);
                break;
            case "setHost":
                setHost(nVar, pVar);
                break;
            case "logEvent":
                logEvent(nVar, pVar);
                break;
            case "getAppsFlyerUID":
                getAppsFlyerUID(pVar);
                break;
            case "validateAndLogInAppPurchaseV2":
                validateAndLogInAppPurchaseV2(nVar, pVar);
                break;
            case "setAdditionalData":
                setAdditionalData(nVar, pVar);
                break;
            default:
                pVar.notImplemented();
                break;
        }
    }

    @Override // p4.InterfaceC0828a
    public void onReattachedToActivityForConfigChanges(p4.b bVar) {
        sendCachedCallbacksToDart();
        z zVar = (z) bVar;
        ((HashSet) zVar.f642e).add(this.onNewIntentListener);
        this.activity = (Activity) zVar.f640c;
    }

    @Deprecated
    public void setConsentData(n nVar, p pVar) {
        Map map = (Map) ((Map) nVar.f7768b).get("consentData");
        boolean booleanValue = ((Boolean) map.get("isUserSubjectToGDPR")).booleanValue();
        Boolean bool = (Boolean) map.get("hasConsentForDataUsage");
        Boolean bool2 = (Boolean) map.get("hasConsentForAdsPersonalization");
        AppsFlyerLib.getInstance().setConsentData((!booleanValue || bool == null || bool2 == null) ? AppsFlyerConsent.forNonGDPRUser() : AppsFlyerConsent.forGDPRUser(bool.booleanValue(), bool2.booleanValue()));
        pVar.success(null);
    }

    public void setConsentDataV2(n nVar, p pVar) {
        try {
            AppsFlyerLib.getInstance().setConsentData(getAppsFlyerConsentFromCall(nVar));
            pVar.success(null);
        } catch (Exception e7) {
            Log.e("AppsFlyer_FlutterPlugin", LogMessages.ERROR_WHILE_SETTING_CONSENT + e7.getMessage(), e7);
            pVar.error("CONSENT_ERROR", LogMessages.ERROR_WHILE_SETTING_CONSENT + e7.getMessage(), null);
        }
    }

    private void onAttachedToEngine(Context context, f fVar) {
        this.mContext = context;
        this.mEventChannel = new i(fVar, "af-events");
        q qVar = new q(fVar, "af-api");
        this.mMethodChannel = qVar;
        qVar.b(this);
        q qVar2 = new q(fVar, "callbacks");
        this.mCallbackChannel = qVar2;
        qVar2.b(this.callbacksHandler);
    }
}
