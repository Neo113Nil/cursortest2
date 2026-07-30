package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SessionLogger {
    public static final SessionLogger INSTANCE = new SessionLogger();
    private static final String TAG = SessionLogger.class.getCanonicalName();
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    public static final int getQuantaIndex(long j) {
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, SessionLogger.class);
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0009, B:6:0x0011, B:9:0x001c, B:11:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void logActivateApp(String str, SourceApplicationInfo sourceApplicationInfo, String str2, Context context) {
        String str3;
        InternalAppEventsLogger.Companion companion;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            str.getClass();
            context.getClass();
            if (sourceApplicationInfo != null) {
                str3 = sourceApplicationInfo.toString();
                if (str3 == null) {
                }
                Bundle bundle = new Bundle();
                bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str3);
                companion = InternalAppEventsLogger.Companion;
                InternalAppEventsLogger createInstance = companion.createInstance(str, str2, null);
                createInstance.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
                if (companion.getFlushBehavior() == AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    createInstance.flush();
                    return;
                }
                return;
            }
            str3 = "Unclassified";
            Bundle bundle2 = new Bundle();
            bundle2.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str3);
            companion = InternalAppEventsLogger.Companion;
            InternalAppEventsLogger createInstance2 = companion.createInstance(str, str2, null);
            createInstance2.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle2);
            if (companion.getFlushBehavior() == AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }

    private final void logClockSkewEvent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.log(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void logDeactivateApp(String str, SessionInfo sessionInfo, String str2) {
        long longValue;
        String str3;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        try {
            str.getClass();
            if (sessionInfo == null) {
                return;
            }
            Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
            if (diskRestoreTime != null) {
                longValue = diskRestoreTime.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                longValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (longValue < 0) {
                INSTANCE.logClockSkewEvent();
                longValue = 0;
            }
            long sessionLength = sessionInfo.getSessionLength();
            if (sessionLength < 0) {
                INSTANCE.logClockSkewEvent();
                sessionLength = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
            bundle.putString(AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(getQuantaIndex(longValue))}, 1)));
            SourceApplicationInfo sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (str3 = sourceApplicationInfo.toString()) == null) {
                str3 = "Unclassified";
            }
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str3);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong(Constants.LOG_TIME_APP_EVENT_KEY, (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / 1000);
            InternalAppEventsLogger.Companion.createInstance(str, str2, null).logEvent(AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, sessionLength / 1000.0d, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }
}
