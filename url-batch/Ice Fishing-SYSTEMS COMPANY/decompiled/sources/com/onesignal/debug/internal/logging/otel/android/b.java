package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public static final a Companion = new a(null);
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG = "e1100000-0000-4000-a000-000000000001";
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE = "e1100000-0000-4000-a000-000000000003";
    private static final String ERROR_APP_ID_PREFIX_NO_CONFIG_STORE = "e1100000-0000-4000-a000-000000000002";
    private static final String ERROR_APP_ID_PREFIX_NO_CONTEXT = "e1100000-0000-4000-a000-000000000004";
    private static final String ERROR_APP_ID_PREFIX_UNKNOWN = "e1100000-0000-4000-a000-000000000000";
    private static final String ERROR_APP_ID_RESOLVE = "00000000-0000-4000-a000-000000000000";
    private final Context context;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        this.context = context;
    }

    private final String extractAppIdFromConfig(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C0197b c0197b = new k() { // from class: com.onesignal.debug.internal.logging.otel.android.b.b
            @Override // K7.k
            public Object get(Object obj) {
                return ((com.onesignal.core.internal.config.b) obj).getAppId();
            }

            public void set(Object obj, Object obj2) {
                ((com.onesignal.core.internal.config.b) obj).setAppId((String) obj2);
            }
        };
        if (!jSONObject.has(c0197b.getName())) {
            return null;
        }
        String string = jSONObject.getString(c0197b.getName());
        if (string.length() == 0) {
            return null;
        }
        return string;
    }

    private final I4.c extractLogLevelFromParams(JSONObject jSONObject) {
        return I4.c.Companion.fromString(jSONObject.has("logLevel") ? jSONObject.getString("logLevel") : null);
    }

    private final String extractOnesignalIdFromJson(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject.has("onesignal_id")) {
                String string = jSONObject.getString("onesignal_id");
                h.b(string);
                if (string.length() > 0 && !com.onesignal.common.d.INSTANCE.isLocalId(string)) {
                    return string;
                }
            }
        }
        return null;
    }

    private final SharedPreferences getSharedPreferences() {
        Context context = this.context;
        if (context != null) {
            return context.getSharedPreferences(com.onesignal.common.threading.b.BASE_THREAD_NAME, 0);
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
            if (sharedPreferences != null && (string = sharedPreferences.getString("GT_APP_ID", null)) != null) {
                if (string.length() > 0) {
                    str = string;
                }
            }
        } catch (Exception unused) {
        }
        return str == null ? this.context == null ? ERROR_APP_ID_PREFIX_NO_CONTEXT : hasEmptyConfigStore() ? ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE : jSONObject == null ? ERROR_APP_ID_PREFIX_NO_CONFIG_STORE : !jSONObject.has(com.anythink.expressad.videocommon.e.b.f22565u) ? ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG : ERROR_APP_ID_PREFIX_UNKNOWN : str;
    }

    public final String resolveAppId() {
        try {
            JSONObject readConfigModel = readConfigModel();
            String extractAppIdFromConfig = extractAppIdFromConfig(readConfigModel);
            return extractAppIdFromConfig == null ? resolveAppIdFromLegacy(readConfigModel) : extractAppIdFromConfig;
        } catch (Exception e6) {
            com.onesignal.debug.internal.logging.b.error$default("Trying resolve the app Id" + e6.getMessage(), null, 2, null);
            return ERROR_APP_ID_RESOLVE;
        }
    }

    public final String resolveInstallId() {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String string = sharedPreferences != null ? sharedPreferences.getString("PREFS_OS_INSTALL_ID", "InstallId-Null") : null;
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
            c cVar = new k() { // from class: com.onesignal.debug.internal.logging.otel.android.b.c
                @Override // K7.k
                public Object get(Object obj) {
                    return ((com.onesignal.core.internal.config.b) obj).getPushSubscriptionId();
                }

                public void set(Object obj, Object obj2) {
                    ((com.onesignal.core.internal.config.b) obj).setPushSubscriptionId((String) obj2);
                }
            };
            if (readConfigModel != null && readConfigModel.has(cVar.getName())) {
                String string = readConfigModel.getString(cVar.getName());
                h.b(string);
                if (string.length() > 0) {
                    if (!com.onesignal.common.d.INSTANCE.isLocalId(string)) {
                        return string;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final I4.c resolveRemoteLogLevel() {
        try {
            JSONObject readConfigModel = readConfigModel();
            d dVar = new n() { // from class: com.onesignal.debug.internal.logging.otel.android.b.d
                {
                    Object obj = kotlin.jvm.internal.b.NO_RECEIVER;
                }

                @Override // K7.k
                public Object get(Object obj) {
                    return ((com.onesignal.core.internal.config.b) obj).getRemoteLoggingParams();
                }
            };
            if (readConfigModel == null || !readConfigModel.has(dVar.getName())) {
                return null;
            }
            JSONObject jSONObject = readConfigModel.getJSONObject(dVar.getName());
            h.d(jSONObject, "getJSONObject(...)");
            return extractLogLevelFromParams(jSONObject);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean resolveRemoteLoggingEnabled() {
        try {
            I4.c resolveRemoteLogLevel = resolveRemoteLogLevel();
            if (resolveRemoteLogLevel != null) {
                return resolveRemoteLogLevel != I4.c.NONE;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
