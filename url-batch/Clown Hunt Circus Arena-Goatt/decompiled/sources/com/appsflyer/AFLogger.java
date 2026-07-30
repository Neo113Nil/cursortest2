package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.AFa1dSDK;

/* loaded from: classes.dex */
public class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    public static void afInfoLog(String str, boolean z) {
        if (AFKeystoreWrapper(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        if (z) {
            AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("I", AFKeystoreWrapper(str, true));
        }
    }

    private static String AFKeystoreWrapper(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        return (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) ? new StringBuilder("(").append(System.currentTimeMillis() - AFInAppEventParameterName).append(") [").append(Thread.currentThread().getName()).append("] ").append(str).toString() : str;
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        if (str == null) {
            str = new StringBuilder().append(th.getClass().getSimpleName()).append(" at ").append(th.getStackTrace()[0].toString()).toString();
        }
        if (AFKeystoreWrapper(LogLevel.ERROR)) {
            String AFKeystoreWrapper = AFKeystoreWrapper(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.12.1", AFKeystoreWrapper, th);
            } else if (z) {
                Log.d("AppsFlyer_6.12.1", AFKeystoreWrapper);
            }
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventParameterName(th);
        if (z3) {
            AFa1dSDK.valueOf().AFInAppEventParameterName().onResponseErrorNative().values(th, str);
        }
    }

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("W", AFKeystoreWrapper(str, true));
    }

    public static void afRDLog(String str) {
        if (AFKeystoreWrapper(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("V", AFKeystoreWrapper(str, true));
    }

    private static boolean AFKeystoreWrapper(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFInAppEventParameterName(String str) {
        if (!valueOf()) {
            Log.d("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("F", str);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afErrorLog(String str, Throwable th) {
        afErrorLog(str, th, true, false, true);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th) {
        afErrorLogForExcManagerOnly(str, th, false);
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        afErrorLog(str, th, false, false, !z);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        afErrorLog(str, th, true, z, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        afErrorLog(str, th, true, z, z2);
    }

    @Deprecated
    public static void afErrorLog(Throwable th) {
        afErrorLogForExcManagerOnly("Unknown", th);
    }

    public static void afWarnLog(String str) {
        AFInAppEventType(str);
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int values;

        LogLevel(int i) {
            this.values = i;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    public static void afDebugLog(String str) {
        if (AFKeystoreWrapper(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("D", AFKeystoreWrapper(str, true));
    }
}
