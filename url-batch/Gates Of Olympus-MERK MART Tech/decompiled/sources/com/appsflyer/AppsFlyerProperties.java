package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
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
    public static final String USER_EMAILS = "userEmails";
    public static AppsFlyerProperties instance;
    public String AFKeystoreWrapper;
    public boolean valueOf;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private boolean values = false;

    public static AppsFlyerProperties getInstance() {
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        return instance;
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

    public int getLogLevel() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String());
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        return string == null ? i : Integer.parseInt(string);
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        return string == null ? j : Long.parseLong(string);
    }

    public final boolean valueOf() {
        return this.valueOf;
    }

    public String getReferrer(AFd1xSDK aFd1xSDK) {
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        return aFd1xSDK.AFInAppEventType("referrer", (String) null);
    }

    public boolean isEnableLog() {
        return getLogLevel() > AFLogger.LogLevel.NONE.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String();
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void saveProperties(AFd1xSDK aFd1xSDK) {
        this.AFInAppEventType.remove("AppsFlyerKey");
        aFd1xSDK.valueOf("savedProperties", new JSONObject(this.AFInAppEventType).toString());
    }

    public synchronized void loadProperties(AFd1xSDK aFd1xSDK) {
        if (values()) {
            return;
        }
        String AFInAppEventType = aFd1xSDK.AFInAppEventType("savedProperties", (String) null);
        if (AFInAppEventType != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(AFInAppEventType);
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
                saveProperties(aFd1xSDK);
                this.values = true;
            } catch (JSONException e) {
                AFLogger.afErrorLog("Failed loading properties", e);
            }
            AFLogger.afDebugLog(new StringBuilder("Done loading properties: ").append(this.values).toString());
        }
    }

    private boolean values() {
        return this.values;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int AFInAppEventType;

        EmailsCryptType(int i) {
            this.AFInAppEventType = i;
        }

        public final int getValue() {
            return this.AFInAppEventType;
        }
    }
}
