package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.onesignal.common.IDManager;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OtelIdResolver {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG = "e1100000-0000-4000-a000-000000000001";
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE = "e1100000-0000-4000-a000-000000000003";
    private static final String ERROR_APP_ID_PREFIX_NO_CONFIG_STORE = "e1100000-0000-4000-a000-000000000002";
    private static final String ERROR_APP_ID_PREFIX_NO_CONTEXT = "e1100000-0000-4000-a000-000000000004";
    private static final String ERROR_APP_ID_PREFIX_UNKNOWN = "e1100000-0000-4000-a000-000000000000";
    private static final String ERROR_APP_ID_RESOLVE = "00000000-0000-4000-a000-000000000000";
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public OtelIdResolver(Context context) {
        this.context = context;
    }

    private final String extractAppIdFromConfig(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        OtelIdResolver$extractAppIdFromConfig$appIdProperty$1 otelIdResolver$extractAppIdFromConfig$appIdProperty$1 = new l() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$extractAppIdFromConfig$appIdProperty$1
            @Override // z4.k
            public Object get(Object obj) {
                return ((ConfigModel) obj).getAppId();
            }

            public void set(Object obj, Object obj2) {
                ((ConfigModel) obj).setAppId((String) obj2);
            }
        };
        if (!jSONObject.has(otelIdResolver$extractAppIdFromConfig$appIdProperty$1.getName())) {
            return null;
        }
        String string = jSONObject.getString(otelIdResolver$extractAppIdFromConfig$appIdProperty$1.getName());
        if (string.length() == 0) {
            return null;
        }
        return string;
    }

    private final LogLevel extractLogLevelFromParams(JSONObject jSONObject) {
        return LogLevel.Companion.fromString(jSONObject.has("logLevel") ? jSONObject.getString("logLevel") : null);
    }

    private final String extractOnesignalIdFromJson(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (!jSONObject.has(IdentityConstants.ONESIGNAL_ID)) {
            return null;
        }
        String string = jSONObject.getString(IdentityConstants.ONESIGNAL_ID);
        i.b(string);
        if (string.length() <= 0 || IDManager.INSTANCE.isLocalId(string)) {
            return null;
        }
        return string;
    }

    private final SharedPreferences getSharedPreferences() {
        Context context = this.context;
        if (context != null) {
            return context.getSharedPreferences("OneSignal", 0);
        }
        return null;
    }

    private final boolean hasEmptyConfigStore() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString("MODEL_STORE_config", null) : null;
            if (string == null || string.length() <= 0) {
                return false;
            }
            return new JSONArray(string).length() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private final JSONObject readConfigModel() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString("MODEL_STORE_config", null) : null;
            if (string == null || string.length() <= 0) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String resolveAppIdFromLegacy(JSONObject jSONObject) {
        String string;
        String str = null;
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            if (sharedPreferences != null && (string = sharedPreferences.getString(PreferenceOneSignalKeys.PREFS_LEGACY_APP_ID, null)) != null) {
                if (string.length() > 0) {
                    str = string;
                }
            }
        } catch (Exception unused) {
        }
        return str == null ? this.context == null ? ERROR_APP_ID_PREFIX_NO_CONTEXT : hasEmptyConfigStore() ? ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE : jSONObject == null ? ERROR_APP_ID_PREFIX_NO_CONFIG_STORE : !jSONObject.has("appId") ? ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG : ERROR_APP_ID_PREFIX_UNKNOWN : str;
    }

    public final String resolveAppId() {
        try {
            JSONObject readConfigModel = readConfigModel();
            String extractAppIdFromConfig = extractAppIdFromConfig(readConfigModel);
            return extractAppIdFromConfig == null ? resolveAppIdFromLegacy(readConfigModel) : extractAppIdFromConfig;
        } catch (Exception e3) {
            Logging.error$default("Trying resolve the app Id" + e3.getMessage(), null, 2, null);
            return ERROR_APP_ID_RESOLVE;
        }
    }

    public final String resolveInstallId() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString(PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, "InstallId-Null") : null;
            return string == null ? "InstallId-Null" : string;
        } catch (Exception unused) {
            return "InstallId-NotFound";
        }
    }

    public final String resolveOnesignalId() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString("MODEL_STORE_identity", null) : null;
            if (string == null || string.length() <= 0) {
                return null;
            }
            return extractOnesignalIdFromJson(string);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String resolvePushSubscriptionId() {
        try {
            JSONObject readConfigModel = readConfigModel();
            OtelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1 otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1 = new l() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1
                @Override // z4.k
                public Object get(Object obj) {
                    return ((ConfigModel) obj).getPushSubscriptionId();
                }

                public void set(Object obj, Object obj2) {
                    ((ConfigModel) obj).setPushSubscriptionId((String) obj2);
                }
            };
            if (readConfigModel == null || !readConfigModel.has(otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1.getName())) {
                return null;
            }
            String string = readConfigModel.getString(otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1.getName());
            i.b(string);
            if (string.length() <= 0) {
                return null;
            }
            if (IDManager.INSTANCE.isLocalId(string)) {
                return null;
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public final LogLevel resolveRemoteLogLevel() {
        try {
            JSONObject readConfigModel = readConfigModel();
            OtelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1 otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1 = new o() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1
                @Override // kotlin.jvm.internal.o, z4.k
                public Object get(Object obj) {
                    return ((ConfigModel) obj).getRemoteLoggingParams();
                }
            };
            if (readConfigModel == null || !readConfigModel.has(otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1.getName())) {
                return null;
            }
            JSONObject jSONObject = readConfigModel.getJSONObject(otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1.getName());
            i.d(jSONObject, "getJSONObject(...)");
            return extractLogLevelFromParams(jSONObject);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean resolveRemoteLoggingEnabled() {
        try {
            LogLevel resolveRemoteLogLevel = resolveRemoteLogLevel();
            if (resolveRemoteLogLevel != null) {
                return resolveRemoteLogLevel != LogLevel.NONE;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
