package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.AFa1dSDK;
import com.facebook.internal.AnalyticsEvents;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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

    public static void AFInAppEventParameterName(String str) {
        if (!valueOf()) {
            Log.d("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("F", str);
    }

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("W", AFKeystoreWrapper(str, true));
    }

    private static String AFKeystoreWrapper(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFInAppEventParameterName);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void afDebugLog(String str) {
        if (AFKeystoreWrapper(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("D", AFKeystoreWrapper(str, true));
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2, boolean z3) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getSimpleName());
            sb.append(" at ");
            sb.append(th.getStackTrace()[0].toString());
            str = sb.toString();
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

    public static void afErrorLogForExcManagerOnly(String str, Throwable th, boolean z) {
        afErrorLog(str, th, false, false, !z);
    }

    public static void afInfoLog(String str, boolean z) {
        if (AFKeystoreWrapper(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        if (z) {
            AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("I", AFKeystoreWrapper(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFKeystoreWrapper(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("V", AFKeystoreWrapper(str, true));
    }

    public static void afWarnLog(String str) {
        AFInAppEventType(str);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th) {
        afErrorLogForExcManagerOnly(str, th, false);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    private static boolean AFKeystoreWrapper(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void afErrorLog(String str, Throwable th) {
        afErrorLog(str, th, true, false, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        afErrorLog(str, th, true, z, true);
    }

    public static void afErrorLog(String str, Throwable th, boolean z, boolean z2) {
        afErrorLog(str, th, true, z, z2);
    }

    @Deprecated
    public static void afErrorLog(Throwable th) {
        afErrorLogForExcManagerOnly(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, th);
    }
}
