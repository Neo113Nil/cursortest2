package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import defpackage.kh;
import defpackage.up2;
import defpackage.wi0;
import defpackage.zv;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsCAPIManager {
    private static final String SETTINGS_PATH = "/cloudbridge_settings";
    private static boolean isEnabled;
    public static final AppEventsCAPIManager INSTANCE = new AppEventsCAPIManager();
    private static final String TAG = AppEventsCAPIManager.class.getCanonicalName();

    private AppEventsCAPIManager() {
    }

    public static final void enable() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, FacebookSdk.getApplicationId() + SETTINGS_PATH, null, HttpMethod.GET, new kh(0), null, 32, null);
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.log(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.executeAsync();
        } catch (JSONException e) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = TAG;
            str2.getClass();
            companion2.log(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", wi0.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0(GraphResponse graphResponse) {
        graphResponse.getClass();
        INSTANCE.getCAPIGSettingsFromGraphResponse$facebook_core_release(graphResponse);
    }

    public static final Map<String, Object> getSavedCloudBridgeCredentials$facebook_core_release() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsCAPIManager.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (string != null && !up2.y(string) && string2 != null && !up2.y(string2) && string3 != null && !up2.y(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsCAPIManager.class);
            return null;
        }
    }

    public final void getCAPIGSettingsFromGraphResponse$facebook_core_release(GraphResponse graphResponse) {
        Object obj;
        boolean z;
        graphResponse.getClass();
        if (graphResponse.getError() != null) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.log(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", graphResponse.getError().toString(), String.valueOf(graphResponse.getError().getException()));
            Map<String, Object> savedCloudBridgeCredentials$facebook_core_release = getSavedCloudBridgeCredentials$facebook_core_release();
            if (savedCloudBridgeCredentials$facebook_core_release != null) {
                URL url = new URL(String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests.configure(String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        Logger.Companion companion2 = Logger.Companion;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String str2 = TAG;
        str2.getClass();
        companion2.log(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", graphResponse);
        JSONObject jSONObject = graphResponse.getJSONObject();
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("data");
            } catch (NullPointerException e) {
                Logger.Companion companion3 = Logger.Companion;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                String str3 = TAG;
                str3.getClass();
                companion3.log(loggingBehavior3, str3, "CloudBridge Settings API response is not a valid json: \n%s ", wi0.b(e));
                return;
            } catch (JSONException e2) {
                Logger.Companion companion4 = Logger.Companion;
                LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
                String str4 = TAG;
                str4.getClass();
                companion4.log(loggingBehavior4, str4, "CloudBridge Settings API response is not a valid json: \n%s ", wi0.b(e2));
                return;
            }
        } else {
            obj = null;
        }
        obj.getClass();
        Map<String, ? extends Object> convertJSONObjectToHashMap = Utility.convertJSONObjectToHashMap(new JSONObject((String) zv.v(Utility.convertJSONArrayToList((JSONArray) obj))));
        String str5 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.URL.getRawValue());
        String str6 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.DATASETID.getRawValue());
        String str7 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.ACCESSKEY.getRawValue());
        if (str5 == null || str6 == null || str7 == null) {
            str2.getClass();
            companion2.log(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests.configure(str6, str5, str7);
            setSavedCloudBridgeCredentials$facebook_core_release(convertJSONObjectToHashMap);
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
            if (convertJSONObjectToHashMap.get(settingsAPIFields.getRawValue()) != null) {
                Object obj2 = convertJSONObjectToHashMap.get(settingsAPIFields.getRawValue());
                obj2.getClass();
                z = ((Boolean) obj2).booleanValue();
            } else {
                z = false;
            }
            isEnabled = z;
        } catch (MalformedURLException e3) {
            Logger.Companion companion5 = Logger.Companion;
            LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
            String str8 = TAG;
            str8.getClass();
            companion5.log(loggingBehavior5, str8, "CloudBridge Settings API response doesn't have valid url\n %s ", wi0.b(e3));
        }
    }

    public final boolean isEnabled$facebook_core_release() {
        return isEnabled;
    }

    public final void setEnabled$facebook_core_release(boolean z) {
        isEnabled = z;
    }

    public final void setSavedCloudBridgeCredentials$facebook_core_release(Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(settingsAPIFields.getRawValue(), obj.toString());
        edit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        edit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        edit2.apply();
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
