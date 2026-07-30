package com.facebook.appevents.restrictivedatafilter;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class RestrictiveDataManager {
    private static final String PROCESS_EVENT_NAME = "process_event_name";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String RESTRICTIVE_PARAM = "restrictive_param";
    private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static boolean enabled;
    public static final RestrictiveDataManager INSTANCE = new RestrictiveDataManager();
    private static final String TAG = RestrictiveDataManager.class.getCanonicalName();
    private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();
    private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class RestrictiveParamFilter {
        private String eventName;
        private Map<String, String> restrictiveParams;

        public RestrictiveParamFilter(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.eventName = str;
            this.restrictiveParams = map;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final Map<String, String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setEventName(String str) {
            str.getClass();
            this.eventName = str;
        }

        public final void setRestrictiveParams(Map<String, String> map) {
            map.getClass();
            this.restrictiveParams = map;
        }
    }

    private RestrictiveDataManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }

    private final String getMatchedRuleType(String str, String str2) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList(restrictiveParamFilters);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RestrictiveParamFilter restrictiveParamFilter = (RestrictiveParamFilter) obj;
                    if (restrictiveParamFilter != null && Intrinsics.b(str, restrictiveParamFilter.getEventName())) {
                        for (String str3 : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (Intrinsics.b(str2, str3)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "getMatchedRuleType failed", e);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void initialize() {
        String restrictiveDataSetting;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null || (restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting()) == null || restrictiveDataSetting.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            restrictiveParamFilters.clear();
            restrictedEvents.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                    next.getClass();
                    RestrictiveParamFilter restrictiveParamFilter = new RestrictiveParamFilter(next, new HashMap());
                    if (optJSONObject != null) {
                        restrictiveParamFilter.setRestrictiveParams(Utility.convertJSONObjectToStringMap(optJSONObject));
                        restrictiveParamFilters.add(restrictiveParamFilter);
                    }
                    if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                        restrictedEvents.add(restrictiveParamFilter.getEventName());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isRestrictedEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String processEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return null;
        }
        try {
            str.getClass();
            if (enabled) {
                if (INSTANCE.isRestrictedEvent(str)) {
                    return REPLACEMENT_STRING;
                }
            }
            return str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
            return null;
        }
    }

    public static final void processParameters(Map<String, String> map, String str) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            map.getClass();
            str.getClass();
            if (enabled) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList(map.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = (String) obj;
                    String matchedRuleType = INSTANCE.getMatchedRuleType(str, str2);
                    if (matchedRuleType != null) {
                        hashMap.put(str2, matchedRuleType);
                        map.remove(str2);
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    map.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }
}
