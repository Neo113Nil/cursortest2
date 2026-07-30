package com.facebook.internal;

import android.net.Uri;
import defpackage.up2;
import defpackage.zv;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FetchedAppSettings {
    public static final Companion Companion = new Companion(null);
    private final JSONArray MACARuleMatchingSetting;
    private final boolean automaticLoggingEnabled;
    private final JSONArray bannedParams;
    private final JSONArray blocklistEvents;
    private final boolean codelessEventsEnabled;
    private final List<String> currencyDedupeParameters;
    private final Long dedupeWindow;
    private final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;
    private final FacebookRequestErrorClassification errorClassification;
    private final JSONArray eventBindings;
    private final boolean iAPAutomaticLoggingEnabled;
    private final Map<String, Boolean> migratedAutoLogValues;
    private final boolean monitorViaDialogEnabled;
    private final String nuxContent;
    private final boolean nuxEnabled;
    private final List<Pair<String, List<String>>> prodDedupeParameters;
    private final JSONArray protectedModeStandardParamsSetting;
    private final List<String> purchaseValueDedupeParameters;
    private final String rawAamRules;
    private final JSONArray redactedEvents;
    private final String restrictiveDataSetting;
    private final JSONArray schemaRestrictions;
    private final String sdkUpdateMessage;
    private final JSONArray sensitiveParams;
    private final int sessionTimeoutInSeconds;
    private final String smartLoginBookmarkIconURL;
    private final String smartLoginMenuIconURL;
    private final EnumSet<SmartLoginOption> smartLoginOptions;
    private final String suggestedEventsSetting;
    private final boolean supportsImplicitLogging;
    private final List<Pair<String, List<String>>> testDedupeParameters;
    private final boolean trackUninstallEnabled;
    private final String vvpConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z, String str, boolean z2, int i, EnumSet<SmartLoginOption> enumSet, Map<String, ? extends Map<String, DialogFeatureConfig>> map, boolean z3, FacebookRequestErrorClassification facebookRequestErrorClassification, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7, JSONArray jSONArray2, JSONArray jSONArray3, Map<String, Boolean> map2, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, String str8, List<String> list, List<String> list2, List<? extends Pair<String, ? extends List<String>>> list3, List<? extends Pair<String, ? extends List<String>>> list4, Long l) {
        str.getClass();
        enumSet.getClass();
        map.getClass();
        facebookRequestErrorClassification.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.supportsImplicitLogging = z;
        this.nuxContent = str;
        this.nuxEnabled = z2;
        this.sessionTimeoutInSeconds = i;
        this.smartLoginOptions = enumSet;
        this.dialogConfigurations = map;
        this.automaticLoggingEnabled = z3;
        this.errorClassification = facebookRequestErrorClassification;
        this.smartLoginBookmarkIconURL = str2;
        this.smartLoginMenuIconURL = str3;
        this.iAPAutomaticLoggingEnabled = z4;
        this.codelessEventsEnabled = z5;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = str4;
        this.trackUninstallEnabled = z6;
        this.monitorViaDialogEnabled = z7;
        this.rawAamRules = str5;
        this.suggestedEventsSetting = str6;
        this.restrictiveDataSetting = str7;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map2;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
        this.schemaRestrictions = jSONArray7;
        this.bannedParams = jSONArray8;
        this.vvpConfig = str8;
        this.currencyDedupeParameters = list;
        this.purchaseValueDedupeParameters = list2;
        this.prodDedupeParameters = list3;
        this.testDedupeParameters = list4;
        this.dedupeWindow = l;
    }

    public static final DialogFeatureConfig getDialogFeatureConfig(String str, String str2, String str3) {
        return Companion.getDialogFeatureConfig(str, str2, str3);
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    public final JSONArray getBannedParams() {
        return this.bannedParams;
    }

    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    public final List<String> getCurrencyDedupeParameters() {
        return this.currencyDedupeParameters;
    }

    public final Long getDedupeWindow() {
        return this.dedupeWindow;
    }

    public final Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    public final Map<String, Boolean> getMigratedAutoLogValues() {
        return this.migratedAutoLogValues;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    public final String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    public final List<Pair<String, List<String>>> getProdDedupeParameters() {
        return this.prodDedupeParameters;
    }

    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    public final List<String> getPurchaseValueDedupeParameters() {
        return this.purchaseValueDedupeParameters;
    }

    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    public final JSONArray getSchemaRestrictions() {
        return this.schemaRestrictions;
    }

    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    public final String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    public final String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    public final EnumSet<SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    public final List<Pair<String, List<String>>> getTestDedupeParameters() {
        return this.testDedupeParameters;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    public final String getVvpConfig() {
        return this.vvpConfig;
    }

    public final boolean supportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class DialogFeatureConfig {
        public static final Companion Companion = new Companion(null);
        private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "|";
        private static final String DIALOG_CONFIG_NAME_KEY = "name";
        private static final String DIALOG_CONFIG_URL_KEY = "url";
        private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
        private final String dialogName;
        private final Uri fallbackUrl;
        private final String featureName;
        private final int[] versionSpec;

        private DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        public final String getDialogName() {
            return this.dialogName;
        }

        public final Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final String getFeatureName() {
            return this.featureName;
        }

        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final int[] parseVersionSpec(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int optInt = jSONArray.optInt(i, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i);
                        if (!Utility.isNullOrEmpty(optString)) {
                            try {
                                optString.getClass();
                                i2 = Integer.parseInt(optString);
                            } catch (NumberFormatException e) {
                                Utility.logd(Utility.LOG_TAG, e);
                            }
                            optInt = i2;
                        }
                    }
                    iArr[i] = optInt;
                }
                return iArr;
            }

            public final DialogFeatureConfig parseDialogConfig(JSONObject jSONObject) {
                jSONObject.getClass();
                String optString = jSONObject.optString("name");
                if (!Utility.isNullOrEmpty(optString)) {
                    optString.getClass();
                    List F = up2.F(0, 6, optString, new String[]{DialogFeatureConfig.DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR});
                    if (F.size() == 2) {
                        String str = (String) zv.u(F);
                        String str2 = (String) zv.B(F);
                        if (!Utility.isNullOrEmpty(str) && !Utility.isNullOrEmpty(str2)) {
                            String optString2 = jSONObject.optString("url");
                            return new DialogFeatureConfig(str, str2, Utility.isNullOrEmpty(optString2) ? null : Uri.parse(optString2), parseVersionSpec(jSONObject.optJSONArray(DialogFeatureConfig.DIALOG_CONFIG_VERSIONS_KEY)), null);
                        }
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DialogFeatureConfig getDialogFeatureConfig(String str, String str2, String str3) {
            Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;
            str.getClass();
            str2.getClass();
            str3.getClass();
            if (str2.length() == 0 || str3.length() == 0) {
                return null;
            }
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(str);
            Map<String, DialogFeatureConfig> map = (appSettingsWithoutQuery == null || (dialogConfigurations = appSettingsWithoutQuery.getDialogConfigurations()) == null) ? null : dialogConfigurations.get(str2);
            if (map != null) {
                return map.get(str3);
            }
            return null;
        }

        private Companion() {
        }
    }
}
