package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SensitiveParamsManager {
    private static final String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";
    private static final String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static boolean enabled;
    public static final SensitiveParamsManager INSTANCE = new SensitiveParamsManager();
    private static HashSet<String> defaultSensitiveParameters = new HashSet<>();
    private static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    private SensitiveParamsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            enabled = false;
            sensitiveParameters = new HashMap();
            defaultSensitiveParameters = new HashSet<>();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadSensitiveParameters();
            if (defaultSensitiveParameters.isEmpty() && sensitiveParameters.isEmpty()) {
                enabled = false;
            } else {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    private final void loadSensitiveParameters() {
        HashSet<String> convertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            try {
                defaultSensitiveParameters = new HashSet<>();
                sensitiveParameters = new HashMap();
                JSONArray sensitiveParams = queryAppSettings.getSensitiveParams();
                if (sensitiveParams == null || sensitiveParams.length() == 0) {
                    return;
                }
                int length = sensitiveParams.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = sensitiveParams.getJSONObject(i);
                    boolean has = jSONObject.has(SDKConstants.PARAM_KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (jSONArray != null && (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) != null) {
                            if (string.equals(DEFAULT_SENSITIVE_PARAMS_KEY)) {
                                defaultSensitiveParameters = convertJSONArrayToHashSet;
                            } else {
                                sensitiveParameters.put(string, convertJSONArrayToHashSet);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processFilterSensitiveParams(Bundle bundle, String str) {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            str.getClass();
            if (enabled && bundle != null) {
                if (!defaultSensitiveParameters.isEmpty() || sensitiveParameters.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet<String> hashSet = sensitiveParameters.get(str);
                        ArrayList arrayList = new ArrayList(bundle.keySet());
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str2 = (String) obj;
                            SensitiveParamsManager sensitiveParamsManager = INSTANCE;
                            str2.getClass();
                            if (sensitiveParamsManager.shouldFilterOut(str2, hashSet)) {
                                bundle.remove(str2);
                                jSONArray.put(str2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString(SENSITIVE_PARAMS_KEY, jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    private final boolean shouldFilterOut(String str, HashSet<String> hashSet) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (defaultSensitiveParameters.contains(str)) {
                return true;
            }
            if (hashSet != null && !hashSet.isEmpty()) {
                if (hashSet.contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
