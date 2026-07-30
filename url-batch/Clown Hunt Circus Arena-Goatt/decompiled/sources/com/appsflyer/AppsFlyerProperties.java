package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1fSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static final AppsFlyerProperties values = new AppsFlyerProperties();
    public String AFInAppEventParameterName;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean AFKeystoreWrapper = false;
    public boolean valueOf;

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return values;
    }

    public synchronized void remove(String str) {
        this.AFInAppEventType.remove(str);
    }

    public synchronized void set(String str, String str2) {
        this.AFInAppEventType.put(str, str2);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFInAppEventType.put(str, strArr);
    }

    public synchronized void set(String str, int i) {
        this.AFInAppEventType.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.AFInAppEventType.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.AFInAppEventType.put(str, Boolean.toString(z));
    }

    public synchronized void setCustomData(String str) {
        this.AFInAppEventType.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFInAppEventType.put(USER_EMAILS, str);
    }

    public synchronized String getString(String str) {
        return (String) this.AFInAppEventType.get(str);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        return string == null ? z : Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        return string == null ? i : Integer.parseInt(string);
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        return string == null ? j : Long.parseLong(string);
    }

    public synchronized Object getObject(String str) {
        return this.AFInAppEventType.get(str);
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    public String getReferrer(AFb1fSDK aFb1fSDK) {
        String str = this.AFInAppEventParameterName;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        return aFb1fSDK.valueOf("referrer", (String) null);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void saveProperties(AFb1fSDK aFb1fSDK) {
        this.AFInAppEventType.remove("AppsFlyerKey");
        aFb1fSDK.values("savedProperties", new JSONObject(this.AFInAppEventType).toString());
    }

    public synchronized void loadProperties(AFb1fSDK aFb1fSDK) {
        if (valueOf()) {
            return;
        }
        String valueOf = aFb1fSDK.valueOf("savedProperties", (String) null);
        if (valueOf != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(valueOf);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.AFInAppEventType.get(next) == null) {
                        this.AFInAppEventType.put(next, jSONObject.getString(next));
                    }
                }
                String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix"};
                for (int i = 0; i < 3; i++) {
                    this.AFInAppEventType.remove(strArr[i]);
                }
                saveProperties(aFb1fSDK);
                this.AFKeystoreWrapper = true;
            } catch (JSONException e) {
                AFLogger.afErrorLog("Failed loading properties", e);
            }
            AFLogger.afDebugLog(new StringBuilder("Done loading properties: ").append(this.AFKeystoreWrapper).toString());
        }
    }

    private boolean valueOf() {
        return this.AFKeystoreWrapper;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int AFInAppEventParameterName;

        EmailsCryptType(int i) {
            this.AFInAppEventParameterName = i;
        }

        public final int getValue() {
            return this.AFInAppEventParameterName;
        }
    }

    public boolean isEnableLog() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel()) > AFLogger.LogLevel.NONE.getLevel();
    }
}
