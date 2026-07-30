package com.appsflyer.reactnative;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.MediationNetwork;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RNAppsFlyerModule extends ReactContextBaseJavaModule {
    private Application application;
    private String personalDevKey;
    private ReactApplicationContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    private static class CallbackGuard {
        private static final String TAG = "AppsFlyer_6.17.9";
        private final WeakReference<Callback> callbackRef;
        private final AtomicBoolean invoked = new AtomicBoolean(false);

        public CallbackGuard(Callback callback) {
            this.callbackRef = new WeakReference<>(callback);
        }

        public void invoke(Object... objArr) {
            Callback callback;
            if (!this.invoked.compareAndSet(false, true) || (callback = this.callbackRef.get()) == null) {
                return;
            }
            try {
                callback.invoke(objArr);
            } catch (RuntimeException e) {
                Log.e(TAG, "Failed to invoke callback - bridge may be destroyed", e);
            } catch (Exception e2) {
                Log.e(TAG, "Unexpected error invoking callback", e2);
            }
        }
    }

    public RNAppsFlyerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        this.application = (Application) reactApplicationContext.getApplicationContext();
        this.personalDevKey = "";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppsFlyer";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ACHIEVEMENT_UNLOCKED", AFInAppEventType.ACHIEVEMENT_UNLOCKED);
        hashMap.put("ADD_PAYMENT_INFO", AFInAppEventType.ADD_PAYMENT_INFO);
        hashMap.put("ADD_TO_CART", AFInAppEventType.ADD_TO_CART);
        hashMap.put("ADD_TO_WISH_LIST", AFInAppEventType.ADD_TO_WISH_LIST);
        hashMap.put("COMPLETE_REGISTRATION", AFInAppEventType.COMPLETE_REGISTRATION);
        hashMap.put("CONTENT_VIEW", AFInAppEventType.CONTENT_VIEW);
        hashMap.put("INITIATED_CHECKOUT", AFInAppEventType.INITIATED_CHECKOUT);
        hashMap.put("INVITE", AFInAppEventType.INVITE);
        hashMap.put("LEVEL_ACHIEVED", AFInAppEventType.LEVEL_ACHIEVED);
        hashMap.put("LOCATION_CHANGED", AFInAppEventType.LOCATION_CHANGED);
        hashMap.put("LOCATION_COORDINATES", AFInAppEventType.LOCATION_COORDINATES);
        hashMap.put("LOGIN", AFInAppEventType.LOGIN);
        hashMap.put("OPENED_FROM_PUSH_NOTIFICATION", AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION);
        hashMap.put("ORDER_ID", "af_order_id");
        hashMap.put("PURCHASE", AFInAppEventType.PURCHASE);
        hashMap.put("RATE", AFInAppEventType.RATE);
        hashMap.put("RE_ENGAGE", AFInAppEventType.RE_ENGAGE);
        hashMap.put("SEARCH", AFInAppEventType.SEARCH);
        hashMap.put("SHARE", AFInAppEventType.SHARE);
        hashMap.put("SPENT_CREDIT", AFInAppEventType.SPENT_CREDIT);
        hashMap.put("TRAVEL_BOOKING", AFInAppEventType.TRAVEL_BOOKING);
        hashMap.put("TUTORIAL_COMPLETION", AFInAppEventType.TUTORIAL_COMPLETION);
        hashMap.put("UPDATE", AFInAppEventType.UPDATE);
        return hashMap;
    }

    @ReactMethod
    public void initSdkWithCallBack(ReadableMap readableMap, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        try {
            String callSdkInternal = callSdkInternal(readableMap);
            if (callSdkInternal == null) {
                callbackGuard.invoke("Success");
            } else {
                callbackGuard2.invoke(new Exception(callSdkInternal).getMessage());
            }
        } catch (Exception e) {
            callbackGuard2.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void initSdkWithPromise(ReadableMap readableMap, Promise promise) {
        try {
            String callSdkInternal = callSdkInternal(readableMap);
            if (callSdkInternal == null) {
                promise.resolve("Success");
            } else {
                promise.reject(callSdkInternal, new Exception(callSdkInternal).getMessage());
            }
        } catch (Exception e) {
            promise.reject("AF Unknown Error", e);
        }
    }

    private String callSdkInternal(ReadableMap readableMap) {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        String optString = readableMapToJson.optString("devKey", "");
        if (optString.trim().equals("")) {
            return "No 'devKey' found or its empty";
        }
        this.personalDevKey = optString;
        boolean optBoolean = readableMapToJson.optBoolean("isDebug", false);
        appsFlyerLib.setDebugLog(optBoolean);
        boolean optBoolean2 = readableMapToJson.optBoolean("onInstallConversionDataListener", true);
        if (optBoolean) {
            Log.d("AppsFlyer", "Starting SDK");
        }
        boolean optBoolean3 = readableMapToJson.optBoolean("onDeepLinkListener", false);
        boolean optBoolean4 = readableMapToJson.optBoolean("manualStart", false);
        appsFlyerLib.setPluginInfo(new PluginInfo(isExpoApp() ? Plugin.EXPO : Plugin.REACT_NATIVE, "6.17.9"));
        appsFlyerLib.init(optString, optBoolean2 ? registerConversionListener() : null, this.application.getApplicationContext());
        if (optBoolean3) {
            appsFlyerLib.subscribeForDeepLink(registerDeepLinkListener());
        }
        if (!optBoolean4) {
            startSdk();
        }
        return null;
    }

    private boolean isExpoApp() {
        try {
            Class.forName("expo.modules.devmenu.react.DevMenuAwareReactActivity");
            return true;
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }

    private DeepLinkListener registerDeepLinkListener() {
        return new DeepLinkListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.1
            /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:9:0x006e). Please report as a decompilation issue!!! */
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                JSONObject jSONObject;
                ?? jSONObject2 = new JSONObject();
                DeepLinkResult.Error error = deepLinkResult.getError();
                try {
                    jSONObject2.put("deepLinkStatus", deepLinkResult.getStatus());
                    jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "success");
                    jSONObject2.put("type", "onDeepLinking");
                    if (error != null && deepLinkResult.getStatus() == DeepLinkResult.Status.ERROR) {
                        jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "failure");
                        jSONObject2.put(UriUtil.DATA_SCHEME, error.toString());
                        jSONObject2.put("isDeferred", false);
                        jSONObject = jSONObject2;
                    } else if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                        jSONObject2.put(UriUtil.DATA_SCHEME, deepLinkResult.getDeepLink().getClickEvent());
                        jSONObject2.put("isDeferred", deepLinkResult.getDeepLink().isDeferred());
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject2.put(UriUtil.DATA_SCHEME, "deep link not found");
                        jSONObject2.put("isDeferred", false);
                        jSONObject = jSONObject2;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                }
                try {
                    RNAppsFlyerModule rNAppsFlyerModule = RNAppsFlyerModule.this;
                    ReactApplicationContext reactApplicationContext = rNAppsFlyerModule.reactContext;
                    jSONObject2 = jSONObject.toString();
                    rNAppsFlyerModule.sendEvent(reactApplicationContext, "onDeepLinking", jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    private AppsFlyerConversionListener registerConversionListener() {
        return new AppsFlyerConversionListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.2
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                RNAppsFlyerModule.this.handleSuccess("onAppOpenAttribution", null, map);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                RNAppsFlyerModule.this.handleError("onAttributionFailure", str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                RNAppsFlyerModule.this.handleSuccess("onInstallConversionDataLoaded", map, null);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                RNAppsFlyerModule.this.handleError("onInstallConversionFailure", str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSuccess(String str, Map<String, Object> map, Map<String, String> map2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (map == null) {
                map = map2;
            }
            JSONObject jSONObject2 = new JSONObject(map);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "success");
            jSONObject.put("type", str);
            jSONObject.put(UriUtil.DATA_SCHEME, jSONObject2);
            if (str.equals("onInstallConversionDataLoaded")) {
                sendEvent(this.reactContext, "onInstallConversionDataLoaded", jSONObject.toString());
            } else if (str.equals("onAppOpenAttribution")) {
                sendEvent(this.reactContext, "onAppOpenAttribution", jSONObject.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, "failure");
            jSONObject.put("type", str);
            jSONObject.put(UriUtil.DATA_SCHEME, str2);
            sendEvent(this.reactContext, "onInstallConversionDataLoaded", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void startSdk() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AppsFlyerLib.getInstance().start(currentActivity, this.personalDevKey);
        } else {
            AppsFlyerLib.getInstance().logEvent(this.application, null, null);
            AppsFlyerLib.getInstance().start(this.application, this.personalDevKey);
        }
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        final CallbackGuard callbackGuard = new CallbackGuard(callback);
        final CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        try {
            if (str.trim().equals("")) {
                callbackGuard2.invoke("No 'eventName' found or its empty");
                return;
            }
            Map<String, Object> map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap<>();
            }
            if (getCurrentActivity() != null) {
                AppsFlyerLib.getInstance().logEvent(getCurrentActivity(), str, map, new AppsFlyerRequestListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.3
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onSuccess() {
                        callbackGuard.invoke("Success");
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onError(int i, String str2) {
                        callbackGuard2.invoke(str2);
                    }
                });
            }
        } catch (Exception e) {
            callbackGuard2.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void logEventWithPromise(String str, ReadableMap readableMap, final Promise promise) {
        try {
            if (str.trim().equals("")) {
                promise.reject("No 'eventName' found or its empty", new Exception("No 'eventName' found or its empty").getMessage());
                return;
            }
            Map<String, Object> map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap<>();
            }
            if (getCurrentActivity() != null) {
                AppsFlyerLib.getInstance().logEvent(getCurrentActivity(), str, map, new AppsFlyerRequestListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.4
                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onSuccess() {
                        promise.resolve("Success");
                    }

                    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                    public void onError(int i, String str2) {
                        promise.reject(str2);
                    }
                });
            }
        } catch (Exception e) {
            promise.reject("AF Unknown Error", e);
        }
    }

    @ReactMethod
    public void logAdRevenue(ReadableMap readableMap) {
        if (readableMap == null || !readableMap.keySetIterator().hasNextKey()) {
            Log.d("AppsFlyer", "adRevenueData is missing, the data is mandatory to use this API.");
            return;
        }
        String string = readableMap.getString("monetizationNetwork");
        if (string == null) {
            Log.d("AppsFlyer", "monetizationNetwork is missing");
            return;
        }
        String string2 = readableMap.getString("currencyIso4217Code");
        if (string2 == null) {
            Log.d("AppsFlyer", "currencyIso4217Code is missing");
            return;
        }
        if (!readableMap.hasKey("revenue") || readableMap.getType("revenue") != ReadableType.Number) {
            Log.d("AppsFlyer", "revenue is missing or not a number");
            return;
        }
        double d = readableMap.getDouble("revenue");
        ReadableMap map = (readableMap.hasKey("additionalParameters") && readableMap.getType("additionalParameters") == ReadableType.Map) ? readableMap.getMap("additionalParameters") : null;
        String string3 = readableMap.getString("mediationNetwork");
        if (string3 == null || string3.isEmpty()) {
            Log.d("AppsFlyer", "mediationNetwork is missing");
            return;
        }
        try {
            MediationNetwork valueOf = MediationNetwork.valueOf(string3.toUpperCase(Locale.ENGLISH));
            if (valueOf == null) {
                Log.d("AppsFlyer", "Invalid mediation network");
            } else {
                AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData(string, valueOf, string2, d), RNUtil.toMap(map));
            }
        } catch (IllegalArgumentException unused) {
            Log.d("AppsFlyer", "Invalid mediation network: " + string3);
        }
    }

    @ReactMethod
    public void getAppsFlyerUID(Callback callback) {
        new CallbackGuard(callback).invoke(null, AppsFlyerLib.getInstance().getAppsFlyerUID(getReactApplicationContext()));
    }

    @ReactMethod
    public void updateServerUninstallToken(String str, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().updateServerUninstallToken(getReactApplicationContext(), str);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setCustomerUserId(String str, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setCustomerUserId(str);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setCollectIMEI(boolean z, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setCollectIMEI(z);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setCollectAndroidID(boolean z, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setCollectAndroidID(z);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void stop(boolean z, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().stop(z, getReactApplicationContext());
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setAdditionalData(ReadableMap readableMap, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        try {
            Map map = RNUtil.toMap(readableMap);
            if (map == null) {
                map = new HashMap();
            }
            AppsFlyerLib.getInstance().setAdditionalData(new HashMap(map));
            callbackGuard.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void setUserEmails(ReadableMap readableMap, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        int optInt = readableMapToJson.optInt("emailsCryptType", 0);
        JSONArray optJSONArray = readableMapToJson.optJSONArray("emails");
        if (optJSONArray.length() == 0) {
            callbackGuard2.invoke(new Exception("No arguments found or list is corrupted").getMessage());
            return;
        }
        AppsFlyerProperties.EmailsCryptType emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        AppsFlyerProperties.EmailsCryptType[] values = AppsFlyerProperties.EmailsCryptType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AppsFlyerProperties.EmailsCryptType emailsCryptType2 = values[i];
            if (emailsCryptType2.getValue() == optInt) {
                emailsCryptType = emailsCryptType2;
                break;
            }
            i++;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            try {
                strArr[i2] = optJSONArray.getString(i2);
            } catch (JSONException e) {
                e.printStackTrace();
                callbackGuard2.invoke(new Exception("No arguments found or list is corrupted").getMessage());
                return;
            }
        }
        AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, strArr);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setAppInviteOneLinkID(String str, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setCurrencyCode(String str, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setCurrencyCode(str);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void generateInviteLink(ReadableMap readableMap, Callback callback, Callback callback2) {
        final CallbackGuard callbackGuard = new CallbackGuard(callback);
        final CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(getReactApplicationContext());
        try {
            JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
            String optString = readableMapToJson.optString(AppsFlyerProperties.CHANNEL, "");
            String optString2 = readableMapToJson.optString("campaign", "");
            String optString3 = readableMapToJson.optString("referrerName", "");
            String optString4 = readableMapToJson.optString("referreImageURL", "");
            String optString5 = readableMapToJson.optString("customerID", "");
            String optString6 = readableMapToJson.optString("baseDeepLink", "");
            String optString7 = readableMapToJson.optString("brandDomain", "");
            if (optString != null && optString != "") {
                generateInviteUrl.setChannel(optString);
            }
            if (optString2 != null && optString2 != "") {
                generateInviteUrl.setCampaign(optString2);
            }
            if (optString3 != null && optString3 != "") {
                generateInviteUrl.setReferrerName(optString3);
            }
            if (optString4 != null && optString4 != "") {
                generateInviteUrl.setReferrerImageURL(optString4);
            }
            if (optString5 != null && optString5 != "") {
                generateInviteUrl.setReferrerCustomerId(optString5);
            }
            if (optString6 != null && optString6 != "") {
                generateInviteUrl.setBaseDeeplink(optString6);
            }
            if (optString7 != null && optString7 != "") {
                generateInviteUrl.setBrandDomain(optString7);
            }
            if (readableMapToJson.length() > 1 && !readableMapToJson.get("userParams").equals("")) {
                JSONObject jSONObject = readableMapToJson.getJSONObject("userParams");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    generateInviteUrl.addParameter(next, jSONObject.get(next).toString());
                }
            }
        } catch (JSONException unused) {
        }
        generateInviteUrl.generateLink(getReactApplicationContext(), new CreateOneLinkHttpTask.ResponseListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.5
            @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
            public void onResponse(String str) {
                callbackGuard.invoke(str);
            }

            @Override // com.appsflyer.CreateOneLinkHttpTask.ResponseListener
            public void onResponseError(String str) {
                callbackGuard2.invoke(str);
            }
        });
    }

    @ReactMethod
    public void logCrossPromotionImpression(String str, String str2, ReadableMap readableMap) {
        try {
            CrossPromotionHelper.logCrossPromoteImpression(getReactApplicationContext(), str, str2, RNUtil.toMap(readableMap));
        } catch (Exception unused) {
            CrossPromotionHelper.logCrossPromoteImpression(getReactApplicationContext(), str, str2);
        }
    }

    @ReactMethod
    public void logCrossPromotionAndOpenStore(String str, String str2, ReadableMap readableMap) {
        Map<String, Object> map;
        try {
            map = RNUtil.toMap(readableMap);
        } catch (Exception unused) {
            map = null;
        }
        CrossPromotionHelper.logAndOpenStore(getReactApplicationContext(), str, str2, map);
    }

    @ReactMethod
    public void anonymizeUser(boolean z, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().anonymizeUser(z);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void setOneLinkCustomDomains(ReadableArray readableArray, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        if (readableArray.size() <= 0) {
            callbackGuard2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) list.toArray(new String[list.size()]));
            callbackGuard.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callbackGuard2.invoke("No arguments found or list is corrupted");
        }
    }

    @ReactMethod
    public void setResolveDeepLinkURLs(ReadableArray readableArray, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        if (readableArray.size() <= 0) {
            callbackGuard2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) list.toArray(new String[list.size()]));
            callbackGuard.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callbackGuard2.invoke("No arguments found or list is corrupted");
        }
    }

    @ReactMethod
    public void performOnAppAttribution(String str, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        try {
            URI create = URI.create(str);
            AppsFlyerLib.getInstance().performOnAppAttribution(this.application.getApplicationContext(), create);
            callbackGuard.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callbackGuard2.invoke("Passed string is not a valid URI");
        }
    }

    @ReactMethod
    public void setSharingFilterForPartners(ReadableArray readableArray) {
        List<Object> list = RNUtil.toList(readableArray);
        if (list == null) {
            AppsFlyerLib.getInstance().setSharingFilterForPartners(null);
            return;
        }
        try {
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) list.toArray(new String[list.size()]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void logLocation(double d, double d2, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().logLocation(getReactApplicationContext(), d2, d);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void validateAndLogInAppPurchase(ReadableMap readableMap, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        try {
            readableMap.hasKey("additionalParameters");
            JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
            String optString = readableMapToJson.optString("publicKey", "");
            String optString2 = readableMapToJson.optString("signature", "");
            String optString3 = readableMapToJson.optString("purchaseData", "");
            String optString4 = readableMapToJson.optString("price", "");
            String optString5 = readableMapToJson.optString("currency", "");
            Map<String, String> jsonObjectToMap = readableMap.hasKey("additionalParameters") ? RNUtil.jsonObjectToMap(readableMapToJson.optJSONObject("additionalParameters")) : null;
            if (optString == "" || optString2 == "" || optString3 == "" || optString4 == "" || optString5 == "") {
                callbackGuard2.invoke("Please provide purchase parameters");
            } else {
                initInAppPurchaseValidatorListenerInternal(callbackGuard, callbackGuard2);
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.reactContext, optString, optString2, optString3, optString4, optString5, jsonObjectToMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
            callbackGuard2.invoke(e);
        }
    }

    private void initInAppPurchaseValidatorListenerInternal(final CallbackGuard callbackGuard, final CallbackGuard callbackGuard2) {
        AppsFlyerLib.getInstance().registerValidatorListener(this.reactContext, new AppsFlyerInAppPurchaseValidatorListener() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.6
            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInApp() {
                callbackGuard.invoke("In-App Purchase Validation success");
            }

            @Override // com.appsflyer.AppsFlyerInAppPurchaseValidatorListener
            public void onValidateInAppFailure(String str) {
                callbackGuard2.invoke("In-App Purchase Validation failed with error: " + str);
            }
        });
    }

    @ReactMethod
    public void initInAppPurchaseValidatorListener(Callback callback, Callback callback2) {
        initInAppPurchaseValidatorListenerInternal(new CallbackGuard(callback), new CallbackGuard(callback2));
    }

    @ReactMethod
    public void validateAndLogInAppPurchaseV2(ReadableMap readableMap, ReadableMap readableMap2) {
        AFPurchaseType aFPurchaseType;
        try {
            String string = readableMap.getString("purchaseType");
            String string2 = readableMap.getString("transactionId");
            String string3 = readableMap.getString("productId");
            if (string != null && string2 != null && string3 != null) {
                if ("subscription".equals(string)) {
                    aFPurchaseType = AFPurchaseType.SUBSCRIPTION;
                } else {
                    aFPurchaseType = AFPurchaseType.ONE_TIME_PURCHASE;
                }
                AppsFlyerLib.getInstance().validateAndLogInAppPurchase(new AFPurchaseDetails(aFPurchaseType, string2, string3), convertReadableMapToStringMap(readableMap2), new AppsFlyerInAppPurchaseValidationCallback() { // from class: com.appsflyer.reactnative.RNAppsFlyerModule.7
                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationFinished(Map<String, ?> map) {
                        RNAppsFlyerModule.this.sendValidationResult(map);
                    }

                    @Override // com.appsflyer.AppsFlyerInAppPurchaseValidationCallback
                    public void onInAppPurchaseValidationError(Map<String, ?> map) {
                        RNAppsFlyerModule.this.sendValidationResult(map);
                    }
                });
                return;
            }
            sendValidationError("Missing required fields: purchaseType, transactionId, or productId");
        } catch (Exception e) {
            sendValidationError("Validation failed: " + e.getMessage());
        }
    }

    private Map<String, String> convertReadableMapToStringMap(ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap == null) {
            return hashMap;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            hashMap.put(nextKey, dynamic != null ? dynamic.toString() : null);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendValidationResult(Map<String, ?> map) {
        try {
            sendEvent(this.reactContext, "onValidationResult", new JSONObject(map).toString());
        } catch (Exception unused) {
            sendEvent(this.reactContext, "onValidationResult", map.toString());
        }
    }

    private void sendValidationError(String str) {
        sendValidationResult(Collections.singletonMap("error", str));
    }

    @ReactMethod
    public void sendPushNotificationData(ReadableMap readableMap, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        if (readableMapToJson == null) {
            handleErrorMessage("PushNotification payload is null", callbackGuard);
            return;
        }
        try {
            Bundle jsonToBundle = RNUtil.jsonToBundle(readableMapToJson);
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                if (intent != null) {
                    intent.putExtras(jsonToBundle);
                    currentActivity.setIntent(intent);
                    AppsFlyerLib.getInstance().sendPushNotificationData(currentActivity);
                    return;
                }
                handleErrorMessage("The intent is null. Push payload has not been sent!", callbackGuard);
                return;
            }
            handleErrorMessage("The activity is null. Push payload has not been sent!", callbackGuard);
        } catch (JSONException e) {
            e.printStackTrace();
            handleErrorMessage("Can't parse pushPayload to bundle", callbackGuard);
        }
    }

    private void handleErrorMessage(String str, CallbackGuard callbackGuard) {
        Log.d("AppsFlyer", str);
        if (callbackGuard != null) {
            callbackGuard.invoke(str);
        }
    }

    @ReactMethod
    public void setHost(String str, String str2, Callback callback) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        AppsFlyerLib.getInstance().setHost(str, str2);
        callbackGuard.invoke("Success");
    }

    @ReactMethod
    public void addPushNotificationDeepLinkPath(ReadableArray readableArray, Callback callback, Callback callback2) {
        CallbackGuard callbackGuard = new CallbackGuard(callback);
        CallbackGuard callbackGuard2 = new CallbackGuard(callback2);
        if (readableArray.size() <= 0) {
            callbackGuard2.invoke("No arguments found or list is corrupted");
            return;
        }
        List<Object> list = RNUtil.toList(readableArray);
        try {
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) list.toArray(new String[list.size()]));
            callbackGuard.invoke("Success");
        } catch (Exception e) {
            e.printStackTrace();
            callbackGuard2.invoke(e);
        }
    }

    @ReactMethod
    public void disableAdvertisingIdentifier(Boolean bool) {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(bool.booleanValue());
    }

    @ReactMethod
    public void setPartnerData(String str, ReadableMap readableMap) {
        AppsFlyerLib.getInstance().setPartnerData(str, RNUtil.toMap(readableMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void appendParametersToDeepLinkingURL(String str, ReadableMap readableMap) {
        AppsFlyerLib.getInstance().appendParametersToDeepLinkingURL(str, RNUtil.toMap(readableMap));
    }

    @ReactMethod
    public void setDisableNetworkData(Boolean bool) {
        AppsFlyerLib.getInstance().setDisableNetworkData(bool.booleanValue());
    }

    @ReactMethod
    public void performOnDeepLinking() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("AppsFlyer", "performOnDeepLinking: activity is null!");
            return;
        }
        Intent intent = currentActivity.getIntent();
        if (intent == null) {
            Log.d("AppsFlyer", "performOnDeepLinking: intent is null!");
        } else {
            AppsFlyerLib.getInstance().performOnDeepLinking(intent, this.application);
        }
    }

    @ReactMethod
    public void disableAppSetId() {
        AppsFlyerLib.getInstance().disableAppSetId();
    }

    @ReactMethod
    public void enableTCFDataCollection(Boolean bool) {
        AppsFlyerLib.getInstance().enableTCFDataCollection(bool.booleanValue());
    }

    @ReactMethod
    public void setConsentData(ReadableMap readableMap) {
        if (readableMap == null) {
            Log.e("AppsFlyer", "consentData is null");
            return;
        }
        JSONObject readableMapToJson = RNUtil.readableMapToJson(readableMap);
        if (readableMapToJson == null) {
            Log.e("AppsFlyer", "Failed to convert consentData to JSON");
            return;
        }
        Boolean bool = null;
        Boolean valueOf = (!readableMapToJson.has("isUserSubjectToGDPR") || readableMapToJson.isNull("isUserSubjectToGDPR")) ? null : Boolean.valueOf(readableMapToJson.optBoolean("isUserSubjectToGDPR"));
        Boolean valueOf2 = (!readableMapToJson.has("hasConsentForDataUsage") || readableMapToJson.isNull("hasConsentForDataUsage")) ? null : Boolean.valueOf(readableMapToJson.optBoolean("hasConsentForDataUsage"));
        Boolean valueOf3 = (!readableMapToJson.has("hasConsentForAdsPersonalization") || readableMapToJson.isNull("hasConsentForAdsPersonalization")) ? null : Boolean.valueOf(readableMapToJson.optBoolean("hasConsentForAdsPersonalization"));
        if (readableMapToJson.has("hasConsentForAdStorage") && !readableMapToJson.isNull("hasConsentForAdStorage")) {
            bool = Boolean.valueOf(readableMapToJson.optBoolean("hasConsentForAdStorage"));
        }
        AppsFlyerLib.getInstance().setConsentData(new AppsFlyerConsent(valueOf, valueOf2, valueOf3, bool));
    }
}
