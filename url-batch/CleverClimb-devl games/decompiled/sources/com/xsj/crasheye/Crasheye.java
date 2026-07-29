package com.xsj.crasheye;

import android.content.Context;
import com.tapjoy.TapjoyConstants;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.exception.ExceptionHandler;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.pushstrategy.DateRefreshStrategy;
import com.xsj.crasheye.util.Utils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Crasheye {
    public static boolean DEBUG = true;
    public static CrasheyeCallback crasheyeCallback;
    private static boolean initialize;
    private static boolean isSessionActive;

    public interface NDKExceptionCallback {
        void execute();
    }

    public static String getSDKVersion() {
        return "2.2.3";
    }

    public static void init(Context context, String str) {
        if (context == null) {
            Logger.logWarning("Context is null!");
        } else if (str == null) {
            Logger.logWarning("appKey is null!");
        } else if (init(context, str, null)) {
        }
    }

    public static void initWithNativeHandle(Context context, String str) {
        if (context == null) {
            Logger.logWarning("Context is null!");
        } else if (str == null) {
            Logger.logWarning("appKey is null!");
        } else if (init(context, str, null)) {
            NativeExceptionHandler.getInstance().init();
        }
    }

    public static void initWithMonoNativeHandle(Context context, String str) {
        if (context == null) {
            Logger.logWarning("Context is null!");
            return;
        }
        if (str == null) {
            Logger.logWarning("appKey is null!");
        } else if (init(context, str, null)) {
            NativeExceptionHandler.getInstance().initWithMono();
            Properties.crasheyeInitType = TapjoyConstants.TJC_PLUGIN_UNITY;
        }
    }

    public static void initWithNativeHandleUserspaceSig(Context context, String str) {
        if (context == null) {
            Logger.logWarning("Context is null!");
            return;
        }
        if (str == null) {
            Logger.logWarning("appKey is null!");
        } else if (init(context, str, null)) {
            NativeExceptionHandler.getInstance().initWithHandleUserspaceSig();
            Properties.crasheyeInitType = TapjoyConstants.TJC_PLUGIN_UNITY;
        }
    }

    private static boolean init(final Context context, String str, String str2) {
        if (context == null) {
            Logger.logWarning("Context is null!");
            return false;
        }
        if (str == null || str.length() != 8 || str.length() > 14) {
            throw new IllegalArgumentException("Your  API Key is invalid!");
        }
        if (initialize) {
            Logger.logWarning("crasheye is init...");
            return true;
        }
        Properties.APP_KEY = str;
        Properties.TIMESTAMP = System.currentTimeMillis();
        if (!Properties.initialize(context)) {
            Logger.logError("Crasheye initialize fail, Could not initialize Crasheye!");
            return false;
        }
        installExceptionHandler();
        new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.Crasheye.1
            @Override // java.lang.Runnable
            public void run() {
                Crasheye.startSession(context);
                Crasheye.flush();
            }
        }).start();
        Logger.logInfo("init success! sdk version: 2.2.3");
        initialize = true;
        return true;
    }

    public static void setChannelID(String str) {
        if (str == null) {
            Logger.logError("Set channel id is null!");
        } else {
            Properties.APP_CHANNELID = str;
        }
    }

    public static void setAppVersion(String str) {
        if (str == null) {
            Properties.APP_VERSIONNAME = "NA";
        } else {
            Properties.APP_VERSIONNAME = str;
        }
    }

    public static void setIsBetaVersion(boolean z) {
        Properties.APP_ISBETAVERSION = z;
    }

    public static void startSession(Context context) {
        if (context == null) {
            Logger.logWarning("Context is null!");
            return;
        }
        if (!isSessionActive) {
            isSessionActive = true;
            Properties.initialize(context);
        }
        if (Utils.shouldSendPing(context)) {
            if (!Utils.isRunningService(context)) {
                Logger.logInfo("is running in service, don't send session to server.");
                return;
            }
            DateRefreshStrategy.getInstance().load(context);
            ActionEvent createPing = ActionEvent.createPing();
            if (DateRefreshStrategy.getInstance().checkCanRefresh()) {
                createPing.send(context, new NetSender(), true);
            } else {
                new AsyncDataSaver().save(createPing.toJsonLine(), CrasheyeFileFilter.createSessionNewFile());
            }
        }
    }

    public static void closeSession(Context context) {
        if (context == null) {
            Logger.logWarning("Context is null!");
        } else if (Properties.isPluginInitialized() && isSessionActive) {
            isSessionActive = false;
            ActionEvent.createGnip().save(new AsyncDataSaver());
        }
    }

    public static void flush() {
        if (Properties.isPluginInitialized()) {
            if (!Utils.isRunningService(Properties.AppContent)) {
                Logger.logInfo("is running in service, don't start data flusher send.");
            } else {
                new DataFlusher().send();
            }
        }
    }

    public static final void setCrasheyeCallback(CrasheyeCallback crasheyeCallback2) {
        if (crasheyeCallback2 == null) {
            Logger.logWarning("CrasheyeCallback is null!");
        } else {
            crasheyeCallback = crasheyeCallback2;
        }
    }

    public static final void setNDKExceptionCallback(NDKExceptionCallback nDKExceptionCallback) {
        if (nDKExceptionCallback == null) {
            Logger.logWarning("NDKExceptionCallback is null!");
        } else {
            NativeExceptionHandler.ndkExceptionCallback = nDKExceptionCallback;
        }
    }

    public static void leaveBreadcrumb(String str) {
        if (!Properties.isPluginInitialized() || str == null) {
            return;
        }
        Properties.breadcrumbs.addToList(str);
    }

    public static void logView(String str) {
        if (!Properties.isPluginInitialized() || str == null) {
            return;
        }
        ActionView.logView(str).save(new AsyncDataSaver());
    }

    public static void logEvent(String str) {
        if (!Properties.isPluginInitialized() || str == null) {
            return;
        }
        ActionEvent.createEvent(str).save(new AsyncDataSaver());
    }

    public static void logEvent(String str, CrasheyeLogLevel crasheyeLogLevel) {
        if (!Properties.isPluginInitialized() || str == null || crasheyeLogLevel == null) {
            return;
        }
        ActionEvent.createEvent(str, crasheyeLogLevel, null).save(new AsyncDataSaver());
    }

    public static void logEvent(String str, CrasheyeLogLevel crasheyeLogLevel, HashMap<String, Object> hashMap) {
        if (str == null) {
            Logger.logWarning("eventName is null!");
            return;
        }
        if (crasheyeLogLevel == null) {
            Logger.logWarning("logLevel is null!");
        } else if (hashMap == null) {
            Logger.logWarning("customData is null!");
        } else if (Properties.isPluginInitialized()) {
            ActionEvent.createEvent(str, crasheyeLogLevel, hashMap).save(new AsyncDataSaver());
        }
    }

    public static void logEvent(String str, CrasheyeLogLevel crasheyeLogLevel, String str2, String str3) {
        if (str == null) {
            Logger.logWarning("eventName is null!");
            return;
        }
        if (crasheyeLogLevel == null) {
            Logger.logWarning("logLevel is null!");
            return;
        }
        if (str2 == null) {
            Logger.logWarning("keyName is null!");
            return;
        }
        if (str3 == null) {
            Logger.logWarning("keyValue is null!");
        } else if (Properties.isPluginInitialized()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str2, str3);
            logEvent(str, crasheyeLogLevel, hashMap);
        }
    }

    public static void setUserIdentifier(String str) {
        if (str == null) {
            Properties.userIdentifier = "NA";
        } else {
            Properties.userIdentifier = str;
        }
    }

    public static void enableDebug() {
        DEBUG = true;
    }

    public static void setFlushOnlyOverWiFi(boolean z) {
        Properties.flushOnlyOverWiFi = z;
    }

    public static HashMap<String, Object> getExtraData() {
        if (Properties.extraData == null) {
            return null;
        }
        return Properties.extraData.getExtraData();
    }

    public static void addExtraData(String str, String str2) {
        if (Properties.extraData == null) {
            Properties.extraData = new ExtraData();
        }
        if (str != null) {
            if (str2 == null) {
                str2 = "null";
            }
            Properties.extraData.addExtraData(str, str2);
        }
    }

    public static void addExtraDataMap(HashMap<String, Object> hashMap) {
        if (Properties.extraData == null) {
            Properties.extraData = new ExtraData();
        }
        if (hashMap != null) {
            Properties.extraData.addExtraDataMap(hashMap);
        }
    }

    public static void removeExtraData(String str) {
        if (Properties.extraData == null || str == null) {
            return;
        }
        Properties.extraData.removeKey(str);
    }

    public static void clearExtraData() {
        if (Properties.extraData == null) {
            return;
        }
        Properties.extraData.clearData();
    }

    public static void logException(Exception exc) {
        if (exc == null) {
            Logger.logWarning("Exception is null!");
        } else {
            logExceptionMap(new HashMap(0), exc);
        }
    }

    public static void logExceptionMap(HashMap<String, Object> hashMap, Exception exc) {
        if (Properties.isPluginInitialized()) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            new ActionError(EnumActionType.error, stringWriter.toString(), EnumExceptionType.HANDLED, hashMap).send(new NetSender(), true);
        }
    }

    public static void sendScriptException(String str, String str2) {
        if (Properties.isPluginInitialized()) {
            sendScriptException(str, str2, "NA");
        }
    }

    public static void sendScriptException(String str, String str2, String str3) {
        if (Properties.isPluginInitialized()) {
            if (str == null) {
                Logger.logWarning("errorTitle is null!");
            } else {
                if (str2 == null) {
                    Logger.logWarning("stacktrace is null!");
                    return;
                }
                if (str3 == null) {
                    str3 = "NA";
                }
                ScriptExceptionHanler.logScriptException(str, str2, str3);
            }
        }
    }

    public static void logExceptionMessage(String str, String str2, Exception exc) {
        if (Properties.isPluginInitialized()) {
            if (exc == null) {
                Logger.logWarning("exception is null!");
                return;
            }
            HashMap hashMap = new HashMap(1);
            if (str != null && str2 != null) {
                hashMap.put(str, str2);
            }
            logExceptionMap(hashMap, exc);
        }
    }

    public static void enableLogging(boolean z) {
        Logger.logInfo("enableLogging: " + z);
        Properties.SEND_LOG = z;
        NativeExceptionHandler.getInstance().updateSystemLogConfigs();
    }

    public static void setLogging(int i) {
        Logger.logInfo("setLogging: lines=" + i);
        if (i <= 0) {
            return;
        }
        if (i > 1000) {
            i = 1000;
        }
        Properties.SEND_LOG = true;
        Properties.LOG_LINES = i;
        NativeExceptionHandler.getInstance().updateSystemLogConfigs();
    }

    public static void setLogging(String str) {
        Logger.logInfo("setLogging: filter=" + str);
        if (str == null) {
            return;
        }
        Properties.SEND_LOG = true;
        Properties.LOG_FILTER = str;
        NativeExceptionHandler.getInstance().updateSystemLogConfigs();
    }

    public static void setLogging(int i, String str) {
        Logger.logInfo("setLogging: filter=" + str + " lines=" + i);
        if (str == null || i < 0) {
            return;
        }
        if (i > 1000) {
            i = 1000;
        }
        Properties.SEND_LOG = true;
        Properties.LOG_LINES = i;
        Properties.LOG_FILTER = str;
        NativeExceptionHandler.getInstance().updateSystemLogConfigs();
    }

    public static JSONObject getDevSettings() {
        return Properties.RemoteSettingsProps.devSettings;
    }

    private static void installExceptionHandler() {
        Logger.logInfo("Registering the exception handler");
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof ExceptionHandler) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(defaultUncaughtExceptionHandler));
    }

    public static final String getSessionId() {
        return (ActionEvent.savedSessionID != null || ActionEvent.savedSessionID.length() > 0) ? ActionEvent.savedSessionID : "NA";
    }

    public static final String getCrasheyeUUID() {
        return (Properties.UID != null || Properties.UID.length() > 0) ? Properties.UID : "NA";
    }

    public static void setLocalStackAnalyze(boolean z) {
        Properties.libcrasheye_stack_analyze = z;
    }
}
