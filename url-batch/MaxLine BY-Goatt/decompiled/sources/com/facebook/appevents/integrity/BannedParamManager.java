package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import org.json.JSONArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class BannedParamManager {
    private static final String BANNED_PARAMS_KEY = "_bannedParams";
    public static final BannedParamManager INSTANCE = new BannedParamManager();
    private static HashSet<String> bannedParamsConfig = new HashSet<>();
    private static boolean enabled;

    private BannedParamManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            enabled = false;
            bannedParamsConfig = new HashSet<>();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.loadConfigs();
            enabled = !bannedParamsConfig.isEmpty();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
        }
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
            bannedParamsConfig = loadSet(queryAppSettings.getBannedParams());
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

    public static final void processFilterBannedParams(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(BannedParamManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : bannedParamsConfig) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString(BANNED_PARAMS_KEY, jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BannedParamManager.class);
        }
    }
}
