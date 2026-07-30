package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.in1;
import defpackage.k3;
import defpackage.lh;
import defpackage.ok0;
import defpackage.q1;
import defpackage.qv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FetchedAppSettingsManager {
    private static final String ANDROID_DEDUPE_KEY = "FBAndroidSDK";
    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_APP_EVENTS_CONFIG = "app_events_config";
    private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
    private static final String BLOCKLIST_EVENTS_KEY = "blocklist_events";
    private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
    private static final String DEDUPE_KEY = "iap_manual_and_auto_log_dedup_keys";
    private static final String DEDUPE_WINDOW = "iap_manual_and_auto_log_dedup_window_millis";
    private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
    private static final String KEY = "key";
    private static final String MACA_RULES_KEY = "maca_rules";
    private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;
    private static final String PROD_DEDUPE_KEY = "prod_keys";
    private static final String REDACTED_EVENTS_KEY = "redacted_events";
    private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
    private static final String SENSITIVE_PARAMS_KEY = "sensitive_params";
    private static final String STANDARD_PARAMS_KEY = "standard_params";
    private static final String STD_PARAMS_BLOCKED_KEY = "standard_params_blocked";
    private static final String STD_PARAMS_SCHEMA_KEY = "standard_params_schema";
    private static final String TEST_DEDUPE_KEY = "test_keys";
    private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
    private static final String VALUE = "value";
    private static final String VVP_CONFIG_KEY = "vvp_config";
    private static volatile boolean isUnityInit;
    private static volatile boolean printedSDKUpdatedMessage;
    private static volatile JSONArray unityEventBindings;
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();
    private static final String TAG = "FetchedAppSettingsManager";
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
    private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
    private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
    private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
    private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
    private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
    private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";
    private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";
    private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";
    private static final String PROTECTED_MODE_RULES = "protected_mode_rules";
    public static final String AUTO_LOG_APP_EVENTS_DEFAULT_FIELD = "auto_log_app_events_default";
    public static final String AUTO_LOG_APP_EVENT_ENABLED_FIELD = "auto_log_app_events_enabled";
    private static final List<String> APP_SETTING_FIELDS = qv.g(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, APP_SETTING_NUX_CONTENT, APP_SETTING_NUX_ENABLED, APP_SETTING_DIALOG_CONFIGS, APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES, APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, APP_SETTING_APP_EVENTS_FEATURE_BITMASK, APP_SETTING_APP_EVENTS_EVENT_BINDINGS, APP_SETTING_SMART_LOGIN_OPTIONS, SMART_LOGIN_BOOKMARK_ICON_URL, SMART_LOGIN_MENU_ICON_URL, APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD, APP_SETTING_APP_EVENTS_AAM_RULE, SUGGESTED_EVENTS_SETTING, PROTECTED_MODE_RULES, AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, AUTO_LOG_APP_EVENT_ENABLED_FIELD, in1.m(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));
    private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();
    private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);
    private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface FetchedAppSettingsCallback {
        void onError();

        void onSuccess(FetchedAppSettings fetchedAppSettings);
    }

    private FetchedAppSettingsManager() {
    }

    public static final void getAppSettingsAsync(FetchedAppSettingsCallback fetchedAppSettingsCallback) {
        fetchedAppSettingsCallback.getClass();
        fetchedAppSettingsCallbacks.add(fetchedAppSettingsCallback);
        loadAppSettingsAsync();
    }

    private final JSONObject getAppSettingsQueryResponse(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app", null);
        newGraphPathRequest.setForceApplicationRequest(true);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public static final FetchedAppSettings getAppSettingsWithoutQuery(String str) {
        if (str != null) {
            return fetchedAppSettings.get(str);
        }
        return null;
    }

    public static final Map<String, Boolean> getCachedMigratedAutoLogValuesInAppSettings() {
        JSONObject jSONObject;
        String string = FacebookSdk.getApplicationContext().getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0).getString(String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1)), null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Utility.logd(Utility.LOG_TAG, e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return INSTANCE.parseMigratedAutoLogValues(jSONObject);
                }
            } else {
                lh.g("Required value was null.");
            }
        }
        return null;
    }

    public static final void loadAppSettingsAsync() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (Utility.isNullOrEmpty(applicationId)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.pollCallbacks();
            return;
        }
        if (fetchedAppSettings.containsKey(applicationId)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.pollCallbacks();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState2)) {
                break;
            }
            if (atomicReference.get() != fetchAppSettingState) {
                AtomicReference<FetchAppSettingState> atomicReference2 = loadingState;
                FetchAppSettingState fetchAppSettingState3 = FetchAppSettingState.ERROR;
                FetchAppSettingState fetchAppSettingState4 = FetchAppSettingState.LOADING;
                while (!atomicReference2.compareAndSet(fetchAppSettingState3, fetchAppSettingState4)) {
                    if (atomicReference2.get() != fetchAppSettingState3) {
                        INSTANCE.pollCallbacks();
                        return;
                    }
                }
            }
        }
        FacebookSdk.getExecutor().execute(new ok0(applicationContext, String.format(APP_SETTINGS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1)), applicationId, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppSettingsAsync$lambda$0(Context context, String str, String str2) {
        JSONObject jSONObject;
        context.getClass();
        str.getClass();
        str2.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(APP_SETTINGS_PREFS_STORE, 0);
        FetchedAppSettings fetchedAppSettings2 = null;
        String string = sharedPreferences.getString(str, null);
        if (!Utility.isNullOrEmpty(string)) {
            if (string == null) {
                lh.g("Required value was null.");
                return;
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                fetchedAppSettings2 = INSTANCE.parseAppSettingsFromJSON$facebook_core_release(str2, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject appSettingsQueryResponse = fetchedAppSettingsManager.getAppSettingsQueryResponse(str2);
        if (appSettingsQueryResponse != null) {
            fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(str2, appSettingsQueryResponse);
            sharedPreferences.edit().putString(str, appSettingsQueryResponse.toString()).apply();
        }
        if (fetchedAppSettings2 != null) {
            String sdkUpdateMessage = fetchedAppSettings2.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && sdkUpdateMessage != null && sdkUpdateMessage.length() > 0) {
                printedSDKUpdatedMessage = true;
                Log.w(TAG, sdkUpdateMessage);
            }
        }
        FetchedAppGateKeepersManager.queryAppGateKeepers(str2, true);
        AutomaticAnalyticsLogger.logActivateAppEvent();
        loadingState.set(fetchedAppSettings.containsKey(str2) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.pollCallbacks();
    }

    private final List<String> parseCurrencyAndValueDedupeParameters(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray(DEDUPE_KEY);
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (Intrinsics.b(jSONObject2.getString("key"), PROD_DEDUPE_KEY)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    if (Intrinsics.b(jSONObject3.getString("key"), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    private final ArrayList<Pair<String, List<String>>> parseDedupeParameters(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        ArrayList<Pair<String, List<String>>> arrayList;
        ArrayList<Pair<String, List<String>>> arrayList2 = null;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray(DEDUPE_KEY);
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<Pair<String, List<String>>> arrayList3 = null;
        int i = 0;
        while (i < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("key");
            if ((!Intrinsics.b(string, PROD_DEDUPE_KEY) || !z) && (!Intrinsics.b(string, TEST_DEDUPE_KEY) || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i2 = 0;
                while (i2 < length2) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString("key");
                    if (Intrinsics.b(string2, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM) || Intrinsics.b(string2, AppEventsConstants.EVENT_PARAM_CURRENCY)) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i3 = 0;
                        while (i3 < length3) {
                            ArrayList<Pair<String, List<String>>> arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i3).getString("value"));
                                i3++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList3.add(new Pair<>(string2, arrayList4));
                    }
                    i2++;
                    arrayList2 = arrayList;
                }
            }
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    public static /* synthetic */ ArrayList parseDedupeParameters$default(FetchedAppSettingsManager fetchedAppSettingsManager, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fetchedAppSettingsManager.parseDedupeParameters(jSONObject, z);
    }

    private final Long parseDedupeWindow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.optLong(DEDUPE_WINDOW));
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                FetchedAppSettings.DialogFeatureConfig.Companion companion = FetchedAppSettings.DialogFeatureConfig.Companion;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                optJSONObject.getClass();
                FetchedAppSettings.DialogFeatureConfig parseDialogConfig = companion.parseDialogConfig(optJSONObject);
                if (parseDialogConfig != null) {
                    String dialogName = parseDialogConfig.getDialogName();
                    Map map = (Map) hashMap.get(dialogName);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(dialogName, map);
                    }
                    map.put(parseDialogConfig.getFeatureName(), parseDialogConfig);
                }
            }
        }
        return hashMap;
    }

    private final Map<String, Boolean> parseMigratedAutoLogValues(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD, Boolean.valueOf(jSONObject.getBoolean(AUTO_LOG_APP_EVENTS_DEFAULT_FIELD)));
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
            }
        }
        if (!jSONObject.isNull(AUTO_LOG_APP_EVENT_ENABLED_FIELD)) {
            try {
                hashMap.put(AUTO_LOG_APP_EVENT_ENABLED_FIELD, Boolean.valueOf(jSONObject.getBoolean(AUTO_LOG_APP_EVENT_ENABLED_FIELD)));
            } catch (JSONException e2) {
                Utility.logd(Utility.LOG_TAG, e2);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private final JSONArray parseProtectedModeRules(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    private final String parseVVPConfig(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isNull(VVP_CONFIG_KEY)) {
            return null;
        }
        return jSONObject.optString(VVP_CONFIG_KEY, null);
    }

    private final synchronized void pollCallbacks() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            FetchedAppSettings fetchedAppSettings2 = fetchedAppSettings.get(FacebookSdk.getApplicationId());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    handler.post(new k3(14, concurrentLinkedQueue.poll()));
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<FetchedAppSettingsCallback> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    handler.post(new q1(9, concurrentLinkedQueue2.poll(), fetchedAppSettings2));
                }
            }
        }
    }

    public static final FetchedAppSettings queryAppSettings(String str, boolean z) {
        str.getClass();
        if (!z) {
            Map<String, FetchedAppSettings> map = fetchedAppSettings;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release = fetchedAppSettingsManager.parseAppSettingsFromJSON$facebook_core_release(str, fetchedAppSettingsManager.getAppSettingsQueryResponse(str));
        if (Intrinsics.b(str, FacebookSdk.getApplicationId())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.pollCallbacks();
        }
        return parseAppSettingsFromJSON$facebook_core_release;
    }

    public static final void setIsUnityInit(boolean z) {
        isUnityInit = z;
        if (unityEventBindings == null || !isUnityInit) {
            return;
        }
        UnityReflection.sendEventMapping(String.valueOf(unityEventBindings));
    }

    public final FetchedAppSettings parseAppSettingsFromJSON$facebook_core_release(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray(APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES);
        FacebookRequestErrorClassification.Companion companion = FacebookRequestErrorClassification.Companion;
        FacebookRequestErrorClassification createFromJSON = companion.createFromJSON(optJSONArray);
        if (createFromJSON == null) {
            createFromJSON = companion.getDefaultErrorClassification();
        }
        FacebookRequestErrorClassification facebookRequestErrorClassification = createFromJSON;
        int optInt = jSONObject.optInt(APP_SETTING_APP_EVENTS_FEATURE_BITMASK, 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & CODELESS_EVENTS_ENABLED_BITMASK_FIELD) != 0;
        boolean z4 = (optInt & TRACK_UNINSTALL_ENABLED_BITMASK_FIELD) != 0;
        boolean z5 = (optInt & MONITOR_ENABLED_BITMASK_FIELD) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(APP_SETTING_APP_EVENTS_EVENT_BINDINGS);
        unityEventBindings = optJSONArray2;
        if (unityEventBindings != null && InternalSettings.isUnityApp()) {
            UnityReflection.sendEventMapping(optJSONArray2 != null ? optJSONArray2.toString() : null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(APP_SETTING_APP_EVENTS_CONFIG);
        boolean optBoolean = jSONObject.optBoolean(APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING, false);
        String optString = jSONObject.optString(APP_SETTING_NUX_CONTENT, BuildConfig.FLAVOR);
        optString.getClass();
        boolean optBoolean2 = jSONObject.optBoolean(APP_SETTING_NUX_ENABLED, false);
        int optInt2 = jSONObject.optInt(APP_SETTING_APP_EVENTS_SESSION_TIMEOUT, Constants.getDefaultAppEventsSessionTimeoutInSeconds());
        EnumSet<SmartLoginOption> parseOptions = SmartLoginOption.Companion.parseOptions(jSONObject.optLong(APP_SETTING_SMART_LOGIN_OPTIONS));
        Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations = parseDialogConfigurations(jSONObject.optJSONObject(APP_SETTING_DIALOG_CONFIGS));
        String optString2 = jSONObject.optString(SMART_LOGIN_BOOKMARK_ICON_URL);
        optString2.getClass();
        String optString3 = jSONObject.optString(SMART_LOGIN_MENU_ICON_URL);
        optString3.getClass();
        String optString4 = jSONObject.optString(SDK_UPDATE_MESSAGE);
        optString4.getClass();
        FetchedAppSettings fetchedAppSettings2 = new FetchedAppSettings(optBoolean, optString, optBoolean2, optInt2, parseOptions, parseDialogConfigurations, z, facebookRequestErrorClassification, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject.optString(APP_SETTING_APP_EVENTS_AAM_RULE), jSONObject.optString(SUGGESTED_EVENTS_SETTING), jSONObject.optString(APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), STANDARD_PARAMS_KEY), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), MACA_RULES_KEY), parseMigratedAutoLogValues(jSONObject), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), BLOCKLIST_EVENTS_KEY), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), REDACTED_EVENTS_KEY), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), SENSITIVE_PARAMS_KEY), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), STD_PARAMS_SCHEMA_KEY), parseProtectedModeRules(jSONObject.optJSONObject(PROTECTED_MODE_RULES), STD_PARAMS_BLOCKED_KEY), parseVVPConfig(jSONObject.optJSONObject(PROTECTED_MODE_RULES)), parseCurrencyAndValueDedupeParameters(optJSONObject, AppEventsConstants.EVENT_PARAM_CURRENCY), parseCurrencyAndValueDedupeParameters(optJSONObject, AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM), parseDedupeParameters$default(this, optJSONObject, false, 2, null), parseDedupeParameters(optJSONObject, true), parseDedupeWindow(jSONObject.optJSONObject(APP_SETTING_APP_EVENTS_CONFIG)));
        fetchedAppSettings.put(str, fetchedAppSettings2);
        return fetchedAppSettings2;
    }
}
