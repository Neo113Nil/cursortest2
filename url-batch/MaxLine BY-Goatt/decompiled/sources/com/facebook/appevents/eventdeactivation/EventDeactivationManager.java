package com.facebook.appevents.eventdeactivation;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class EventDeactivationManager {
    private static boolean enabled;
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();
    private static final Set<String> deprecatedEvents = new HashSet();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class DeprecatedParamFilter {
        private List<String> deprecateParams;
        private String eventName;

        public DeprecatedParamFilter(String str, List<String> list) {
            str.getClass();
            list.getClass();
            this.eventName = str;
            this.deprecateParams = list;
        }

        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(List<String> list) {
            list.getClass();
            this.deprecateParams = list;
        }

        public final void setEventName(String str) {
            str.getClass();
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    private final synchronized void initialize() {
        FetchedAppSettings queryAppSettings;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return;
        }
        if (queryAppSettings == null) {
            return;
        }
        String restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting();
        if (restrictiveDataSetting != null && restrictiveDataSetting.length() > 0) {
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            deprecatedParamFilters.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set<String> set = deprecatedEvents;
                        next.getClass();
                        set.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        next.getClass();
                        DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(next, new ArrayList());
                        if (optJSONArray != null) {
                            deprecatedParamFilter.setDeprecateParams(Utility.convertJSONArrayToList(optJSONArray));
                        }
                        deprecatedParamFilters.add(deprecatedParamFilter);
                    }
                }
            }
        }
    }

    public static final void processDeprecatedParameters(Map<String, String> map, String str) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            map.getClass();
            str.getClass();
            if (enabled) {
                ArrayList arrayList = new ArrayList(map.keySet());
                ArrayList arrayList2 = new ArrayList(deprecatedParamFilters);
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    DeprecatedParamFilter deprecatedParamFilter = (DeprecatedParamFilter) obj;
                    if (Intrinsics.b(deprecatedParamFilter.getEventName(), str)) {
                        int size2 = arrayList.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            String str2 = (String) obj2;
                            if (deprecatedParamFilter.getDeprecateParams().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    public static final void processEvents(List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            list.getClass();
            if (enabled) {
                Iterator<AppEvent> it = list.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }
}
