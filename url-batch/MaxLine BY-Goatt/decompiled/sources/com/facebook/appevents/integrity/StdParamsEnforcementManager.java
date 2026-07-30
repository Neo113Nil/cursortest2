package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class StdParamsEnforcementManager {
    private static boolean enabled;
    public static final StdParamsEnforcementManager INSTANCE = new StdParamsEnforcementManager();
    private static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();
    private static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();

    private StdParamsEnforcementManager() {
    }

    private final void configureSchemaRestrictions(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet<String> loadSet = loadSet(jSONArray2.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                Map<String, HashSet<String>> map = enumRestrictionsConfig;
                                string.getClass();
                                HashSet<String> hashSet = enumRestrictionsConfig.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(loadSet);
                                    loadSet = hashSet;
                                }
                                map.put(string, loadSet);
                            } else {
                                Map<String, HashSet<String>> map2 = regexRestrictionsConfig;
                                string.getClass();
                                HashSet<String> hashSet2 = regexRestrictionsConfig.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(loadSet);
                                    loadSet = hashSet2;
                                }
                                map2.put(string, loadSet);
                            }
                        }
                    } catch (Exception unused) {
                        enumRestrictionsConfig.remove(string);
                        regexRestrictionsConfig.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            enabled = false;
            regexRestrictionsConfig = new HashMap();
            enumRestrictionsConfig = new HashMap();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }

    public static final void enable() {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            if (regexRestrictionsConfig.isEmpty() && enumRestrictionsConfig.isEmpty()) {
                z = false;
                enabled = z;
            }
            z = true;
            enabled = z;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }

    private final boolean isAnyEnumMatched(String str, Set<String> set) {
        if (!CrashShieldHandler.isObjectCrashing(this) && set != null) {
            try {
                Set<String> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                for (String str2 : set2) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = str.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (Intrinsics.b(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return false;
    }

    private final boolean isAnyRegexMatched(String str, Set<String> set) {
        if (!CrashShieldHandler.isObjectCrashing(this) && set != null) {
            try {
                Set<String> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return false;
                }
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (new Regex((String) it.next()).a(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return false;
    }

    private final void loadConfigs() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            configureSchemaRestrictions(queryAppSettings.getSchemaRestrictions());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final HashSet<String> loadSet(JSONArray jSONArray) {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                HashSet<String> convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray);
                return convertJSONArrayToHashSet == null ? new HashSet<>() : convertJSONArrayToHashSet;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final void processFilterParamSchemaBlocking(Bundle bundle) {
        int i;
        if (CrashShieldHandler.isObjectCrashing(StdParamsEnforcementManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    String valueOf = String.valueOf(bundle.get(next));
                    boolean z = regexRestrictionsConfig.get(next) != null;
                    i = enumRestrictionsConfig.get(next) != null ? 1 : 0;
                    if (z || i != 0) {
                        StdParamsEnforcementManager stdParamsEnforcementManager = INSTANCE;
                        boolean isAnyRegexMatched = stdParamsEnforcementManager.isAnyRegexMatched(valueOf, regexRestrictionsConfig.get(next));
                        boolean isAnyEnumMatched = stdParamsEnforcementManager.isAnyEnumMatched(valueOf, enumRestrictionsConfig.get(next));
                        if (!isAnyRegexMatched && !isAnyEnumMatched) {
                            next.getClass();
                            arrayList.add(next);
                        }
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bundle.remove((String) obj);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, StdParamsEnforcementManager.class);
        }
    }
}
