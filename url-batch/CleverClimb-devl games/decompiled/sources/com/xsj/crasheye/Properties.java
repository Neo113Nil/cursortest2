package com.xsj.crasheye;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.util.EnumStateStatus;
import com.xsj.crasheye.util.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Properties {
    protected static final String API_VERSION = "1";
    static String APP_CHANNELID = "NA";
    public static boolean APP_ISBETAVERSION = false;
    static String APP_KEY = "NA";
    public static String APP_PACKAGE = "NA";
    static String APP_VERSIONCODE = "NA";
    public static String APP_VERSIONNAME = "NA";
    public static Context AppContent = null;
    static String CARRIER = "NA";
    public static String CONNECTION = "NA";
    public static String FILES_PATH = null;
    static boolean HAS_ROOT = false;
    static String LIB_MONOPATH = null;
    static String LOCALE = "NA";
    static String OS_VERSION = "NA";
    static String PHONE_BRAND = null;
    static String PHONE_MODEL = "NA";
    static final String REMOTEIP_PLACEHOLDER = "{%#@@#%}";
    public static final String REST_VERSION = "1.0";
    static String SCREEN_ORIENTATION = "NA";
    static String SCREEN_SIZE = "NA";
    protected static final String SDK_PLATFORM = "Android";
    protected static final String SDK_VERSION = "2.2.3";
    static String STATE = "NA";
    static final String TAG = "Crasheye";
    static String UID = "";
    private static boolean initialized;
    static BreadcrumbsLimited breadcrumbs = new BreadcrumbsLimited();
    static ExtraData extraData = new ExtraData();
    static boolean SEND_LOG = false;
    public static String LOG_FILTER = "";
    public static int LOG_LINES = 1000;
    public static long TIMESTAMP = 0;
    static boolean proxyEnabled = false;
    static EnumStateStatus IS_GPS_ON = EnumStateStatus.NA;
    static boolean sendOnlyWiFi = false;
    static String userIdentifier = "NA";
    public static volatile TransactionsDatabase transactionsDatabase = new TransactionsDatabase();
    public static long lastPingTime = 0;
    public static boolean isKitKat = false;
    public static ArrayList<String> transactions = new ArrayList<>(2);
    public static boolean flushOnlyOverWiFi = false;
    public static final Pattern actionTypeRegx = Pattern.compile("\\{\\^1\\^([a-z]+?)\\^[0-9]+?\\}$");
    public static String crasheyeInitType = "NA";
    public static int sessionCount = -1;
    public static boolean libcrasheye_stack_analyze = false;

    public static boolean isPluginInitialized() {
        if (!initialized) {
            Logger.logWarning("Crasheye SDK is not initialized!");
        }
        return initialized;
    }

    protected static boolean initialize(Context context) {
        if (!initialized) {
            AppContent = context.getApplicationContext();
            UID = UidManager.getUid(context);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (APP_VERSIONNAME.equals("NA") || APP_VERSIONNAME.isEmpty()) {
                    APP_VERSIONNAME = packageInfo.versionName;
                }
                APP_VERSIONCODE = String.valueOf(packageInfo.versionCode);
                APP_PACKAGE = packageInfo.packageName;
            } catch (Exception e) {
                Logger.logError("Error collecting information about the package!");
                if (Crasheye.DEBUG) {
                    e.printStackTrace();
                }
            }
            PHONE_MODEL = Build.MODEL;
            PHONE_BRAND = Build.MANUFACTURER;
            OS_VERSION = Build.VERSION.RELEASE;
            HAS_ROOT = Utils.checkForRoot();
            if (breadcrumbs == null) {
                breadcrumbs = new BreadcrumbsLimited();
            }
            if (extraData == null) {
                extraData = new ExtraData();
            }
            if (transactionsDatabase == null) {
                transactionsDatabase = new TransactionsDatabase();
            }
            FILES_PATH = Utils.getAbsolutePath(context);
            if (FILES_PATH == null) {
                return false;
            }
            LIB_MONOPATH = Utils.getParentFilePath(context);
            RemoteSettingsData loadRemoteSettings = RemoteSettings.loadRemoteSettings(context);
            if (loadRemoteSettings != null) {
                RemoteSettingsProps.logLevel = loadRemoteSettings.logLevel;
                RemoteSettingsProps.eventLevel = loadRemoteSettings.eventLevel;
                RemoteSettingsProps.actionSpan = loadRemoteSettings.actionSpan;
                RemoteSettingsProps.actionCounts = loadRemoteSettings.actionCounts;
                RemoteSettingsProps.actionHost = loadRemoteSettings.actionHost;
                RemoteSettingsProps.netMonitoringEnabled = loadRemoteSettings.netMonitoring;
                RemoteSettingsProps.sessionTime = loadRemoteSettings.sessionTime;
                RemoteSettingsProps.hashCode = loadRemoteSettings.hashCode;
                try {
                    RemoteSettingsProps.devSettings = new JSONObject(loadRemoteSettings.devSettings);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            initialized = true;
        }
        IS_GPS_ON = Utils.isGPSOn(context);
        LOCALE = Locale.getDefault().getCountry();
        if (LOCALE == null || LOCALE.length() == 0) {
            LOCALE = "NA";
        }
        CARRIER = Utils.getCarrier(context);
        SCREEN_ORIENTATION = Utils.getScreenOrientation(context);
        SCREEN_SIZE = Utils.getScreenSize(context);
        HashMap<String, String> connectionInfo = Utils.getConnectionInfo(context);
        CONNECTION = connectionInfo.get("connection");
        STATE = connectionInfo.get("state");
        APP_CHANNELID = Utils.getChannelIdByConfig(context, APP_CHANNELID);
        sessionCount = 1;
        return true;
    }

    public static class RemoteSettingsProps {
        static Integer logLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(CrasheyeLogLevel.Verbose));
        static Integer eventLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(CrasheyeLogLevel.Verbose));
        public static Integer actionSpan = -1;
        public static Integer actionCounts = -1;
        public static Integer actionHost = -1;
        static Boolean netMonitoringEnabled = true;
        public static Integer sessionTime = 5;
        static JSONObject devSettings = new JSONObject();
        static String hashCode = "none";

        public static String toReadableFormat() {
            return "loglevel: " + String.valueOf(logLevel) + " eventLevel: " + String.valueOf(eventLevel) + " actionSpan: " + String.valueOf(actionSpan) + " actionCounts: " + String.valueOf(actionCounts) + " actionHost: " + String.valueOf(actionHost) + " netMonitoring: " + String.valueOf(netMonitoringEnabled) + " sessionTime: " + String.valueOf(sessionTime) + " devSettings: " + devSettings.toString() + " hashCode: " + hashCode;
        }
    }

    protected static final String getSeparator(EnumActionType enumActionType) {
        return "{^1^" + enumActionType.toString() + "^" + Utils.getTime() + "}";
    }

    protected static final EnumActionType findActionType(String str) {
        Matcher matcher = actionTypeRegx.matcher(str);
        if (matcher.find()) {
            return EnumActionType.valueOf(matcher.group(1));
        }
        return EnumActionType.invalid;
    }
}
