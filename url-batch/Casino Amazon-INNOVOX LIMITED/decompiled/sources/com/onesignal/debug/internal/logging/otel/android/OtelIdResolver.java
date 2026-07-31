package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.onesignal.common.IDManager;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OtelIdResolver.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\u0013\u001a\u00020\u0006J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0019\u001a\u00020\u0011R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/onesignal/debug/internal/logging/otel/android/OtelIdResolver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "extractAppIdFromConfig", "", "configModel", "Lorg/json/JSONObject;", "extractLogLevelFromParams", "Lcom/onesignal/debug/LogLevel;", "remoteLoggingParams", "extractOnesignalIdFromJson", "identityStoreJson", "getSharedPreferences", "Landroid/content/SharedPreferences;", "hasEmptyConfigStore", "", "readConfigModel", "resolveAppId", "resolveAppIdFromLegacy", "resolveInstallId", "resolveOnesignalId", "resolvePushSubscriptionId", "resolveRemoteLogLevel", "resolveRemoteLoggingEnabled", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelIdResolver {
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG = "e1100000-0000-4000-a000-000000000001";
    private static final String ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE = "e1100000-0000-4000-a000-000000000003";
    private static final String ERROR_APP_ID_PREFIX_NO_CONFIG_STORE = "e1100000-0000-4000-a000-000000000002";
    private static final String ERROR_APP_ID_PREFIX_NO_CONTEXT = "e1100000-0000-4000-a000-000000000004";
    private static final String ERROR_APP_ID_PREFIX_UNKNOWN = "e1100000-0000-4000-a000-000000000000";
    private static final String ERROR_APP_ID_RESOLVE = "00000000-0000-4000-a000-000000000000";
    private final Context context;

    public OtelIdResolver(Context context) {
        this.context = context;
    }

    private final SharedPreferences getSharedPreferences() {
        Context context = this.context;
        if (context != null) {
            return context.getSharedPreferences("OneSignal", 0);
        }
        return null;
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

    public final String resolveAppId() {
        try {
            JSONObject readConfigModel = readConfigModel();
            String extractAppIdFromConfig = extractAppIdFromConfig(readConfigModel);
            return extractAppIdFromConfig == null ? resolveAppIdFromLegacy(readConfigModel) : extractAppIdFromConfig;
        } catch (Exception e) {
            Logging.error$default("Trying resolve the app Id" + e.getMessage(), null, 2, null);
            return ERROR_APP_ID_RESOLVE;
        }
    }

    private final String extractAppIdFromConfig(JSONObject configModel) {
        if (configModel == null) {
            return null;
        }
        OtelIdResolver$extractAppIdFromConfig$appIdProperty$1 otelIdResolver$extractAppIdFromConfig$appIdProperty$1 = new MutablePropertyReference1Impl() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$extractAppIdFromConfig$appIdProperty$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ConfigModel) obj).getAppId();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((ConfigModel) obj).setAppId((String) obj2);
            }
        };
        if (!configModel.has(otelIdResolver$extractAppIdFromConfig$appIdProperty$1.getName())) {
            return null;
        }
        String string = configModel.getString(otelIdResolver$extractAppIdFromConfig$appIdProperty$1.getName());
        return string.length() != 0 ? string : null;
    }

    private final String resolveAppIdFromLegacy(JSONObject configModel) {
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
        if (str != null) {
            return str;
        }
        if (this.context == null) {
            return ERROR_APP_ID_PREFIX_NO_CONTEXT;
        }
        if (hasEmptyConfigStore()) {
            return ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG_STORE;
        }
        if (configModel == null) {
            return ERROR_APP_ID_PREFIX_NO_CONFIG_STORE;
        }
        return !configModel.has("appId") ? ERROR_APP_ID_PREFIX_NO_APPID_IN_CONFIG : ERROR_APP_ID_PREFIX_UNKNOWN;
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

    private final String extractOnesignalIdFromJson(String identityStoreJson) {
        JSONArray jSONArray = new JSONArray(identityStoreJson);
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject.has(IdentityConstants.ONESIGNAL_ID)) {
                String string = jSONObject.getString(IdentityConstants.ONESIGNAL_ID);
                Intrinsics.checkNotNull(string);
                if (string.length() > 0 && !IDManager.INSTANCE.isLocalId(string)) {
                    return string;
                }
            }
        }
        return null;
    }

    public final String resolvePushSubscriptionId() {
        try {
            JSONObject readConfigModel = readConfigModel();
            OtelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1 otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1 = new MutablePropertyReference1Impl() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((ConfigModel) obj).getPushSubscriptionId();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(Object obj, Object obj2) {
                    ((ConfigModel) obj).setPushSubscriptionId((String) obj2);
                }
            };
            if (readConfigModel != null && readConfigModel.has(otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1.getName())) {
                String string = readConfigModel.getString(otelIdResolver$resolvePushSubscriptionId$pushSubscriptionIdProperty$1.getName());
                Intrinsics.checkNotNull(string);
                if (string.length() > 0) {
                    IDManager iDManager = IDManager.INSTANCE;
                    Intrinsics.checkNotNull(string);
                    if (!iDManager.isLocalId(string)) {
                        return string;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
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

    public final LogLevel resolveRemoteLogLevel() {
        try {
            JSONObject readConfigModel = readConfigModel();
            OtelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1 otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1 = new PropertyReference1Impl() { // from class: com.onesignal.debug.internal.logging.otel.android.OtelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((ConfigModel) obj).getRemoteLoggingParams();
                }
            };
            if (readConfigModel == null || !readConfigModel.has(otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1.getName())) {
                return null;
            }
            JSONObject jSONObject = readConfigModel.getJSONObject(otelIdResolver$resolveRemoteLogLevel$remoteLoggingParamsProperty$1.getName());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            return extractLogLevelFromParams(jSONObject);
        } catch (Exception unused) {
            return null;
        }
    }

    private final LogLevel extractLogLevelFromParams(JSONObject remoteLoggingParams) {
        return LogLevel.INSTANCE.fromString(remoteLoggingParams.has("logLevel") ? remoteLoggingParams.getString("logLevel") : null);
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
}
