package com.onesignal.debug.internal.logging;

import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.ILogListener;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.OneSignalLogEvent;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: Logging.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\fH\u0007J\"\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u001c\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u001c\u0010*\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u001c\u0010+\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u001c\u0010,\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u0018\u0010-\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0004H\u0007J\"\u0010-\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(H\u0007J\"\u0010.\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\"\u0010/\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u000e\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014J&\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001aJ\"\u00104\u001a\u00020!2\u0006\u0010$\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u001c\u00105\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u001c\u00106\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u00067"}, d2 = {"Lcom/onesignal/debug/internal/logging/Logging;", "", "()V", "TAG", "", "applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "getApplicationService", "()Lcom/onesignal/core/internal/application/IApplicationService;", "setApplicationService", "(Lcom/onesignal/core/internal/application/IApplicationService;)V", "logLevel", "Lcom/onesignal/debug/LogLevel;", "getLogLevel$annotations", "getLogLevel", "()Lcom/onesignal/debug/LogLevel;", "setLogLevel", "(Lcom/onesignal/debug/LogLevel;)V", "logListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/onesignal/debug/ILogListener;", "otelLoggingScope", "Lkotlinx/coroutines/CoroutineScope;", "otelRemoteTelemetry", "Lcom/onesignal/otel/IOtelOpenTelemetryRemote;", "shouldSendLogLevel", "Lkotlin/Function1;", "", "visualLogLevel", "getVisualLogLevel$annotations", "getVisualLogLevel", "setVisualLogLevel", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "atLogLevel", "level", "callLogListeners", "message", "throwable", "", "debug", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fatal", "info", "log", "logToLogcat", "logToOtel", "removeListener", "setOtelTelemetry", "telemetry", "shouldSend", "showVisualLogging", "verbose", "warn", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Logging {
    private static final String TAG = "OneSignal";
    private static IApplicationService applicationService;
    private static volatile IOtelOpenTelemetryRemote otelRemoteTelemetry;
    public static final Logging INSTANCE = new Logging();
    private static final CopyOnWriteArraySet<ILogListener> logListeners = new CopyOnWriteArraySet<>();
    private static volatile Function1<? super LogLevel, Boolean> shouldSendLogLevel = new Function1<LogLevel, Boolean>() { // from class: com.onesignal.debug.internal.logging.Logging$shouldSendLogLevel$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LogLevel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return false;
        }
    };
    private static final CoroutineScope otelLoggingScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
    private static LogLevel logLevel = LogLevel.WARN;
    private static LogLevel visualLogLevel = LogLevel.NONE;

    /* compiled from: Logging.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogLevel.FATAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static /* synthetic */ void getLogLevel$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    private Logging() {
    }

    public final IApplicationService getApplicationService() {
        return applicationService;
    }

    public final void setApplicationService(IApplicationService iApplicationService) {
        applicationService = iApplicationService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setOtelTelemetry$default(Logging logging, IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<LogLevel, Boolean>() { // from class: com.onesignal.debug.internal.logging.Logging$setOtelTelemetry$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LogLevel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return false;
                }
            };
        }
        logging.setOtelTelemetry(iOtelOpenTelemetryRemote, function1);
    }

    public final void setOtelTelemetry(IOtelOpenTelemetryRemote telemetry, Function1<? super LogLevel, Boolean> shouldSend) {
        Intrinsics.checkNotNullParameter(shouldSend, "shouldSend");
        otelRemoteTelemetry = telemetry;
        shouldSendLogLevel = shouldSend;
    }

    public static final LogLevel getLogLevel() {
        return logLevel;
    }

    public static final void setLogLevel(LogLevel logLevel2) {
        Intrinsics.checkNotNullParameter(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }

    public static final LogLevel getVisualLogLevel() {
        return visualLogLevel;
    }

    public static final void setVisualLogLevel(LogLevel logLevel2) {
        Intrinsics.checkNotNullParameter(logLevel2, "<set-?>");
        visualLogLevel = logLevel2;
    }

    @JvmStatic
    public static final boolean atLogLevel(LogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    @JvmStatic
    public static final void verbose(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.VERBOSE, message, throwable);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    @JvmStatic
    public static final void debug(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.DEBUG, message, throwable);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    @JvmStatic
    public static final void info(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.INFO, message, throwable);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    @JvmStatic
    public static final void warn(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.WARN, message, throwable);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    @JvmStatic
    public static final void error(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.ERROR, message, throwable);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    @JvmStatic
    public static final void fatal(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(LogLevel.FATAL, message, throwable);
    }

    @JvmStatic
    public static final void log(LogLevel level, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        log(level, message, null);
    }

    @JvmStatic
    public static final void log(LogLevel level, String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        Logging logging = INSTANCE;
        logging.logToLogcat(level, str, throwable);
        logging.showVisualLogging(level, str, throwable);
        logging.callLogListeners(level, str, throwable);
        logging.logToOtel(level, str, throwable);
    }

    private final void logToLogcat(LogLevel level, String message, Throwable throwable) {
        if (level.compareTo(logLevel) >= 1) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
                Log.v("OneSignal", message, throwable);
                break;
            case 2:
                Log.d("OneSignal", message, throwable);
                break;
            case 3:
                Log.i("OneSignal", message, throwable);
                break;
            case 4:
                Log.w("OneSignal", message, throwable);
                break;
            case 5:
            case 6:
                Log.e("OneSignal", message, throwable);
                break;
        }
    }

    private final void showVisualLogging(LogLevel level, String message, Throwable throwable) {
        if (level.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String trimIndent = StringsKt.trimIndent(message + '\n');
            if (throwable != null) {
                String str = trimIndent + throwable.getMessage();
                StringWriter stringWriter = new StringWriter();
                throwable.printStackTrace(new PrintWriter(stringWriter));
                trimIndent = str + stringWriter;
            }
            ThreadUtilsKt.suspendifyOnMain(new Logging$showVisualLogging$1(level, trimIndent, null));
        } catch (Throwable th) {
            Log.e("OneSignal", "Error showing logging message.", th);
        }
    }

    private final void callLogListeners(LogLevel level, String message, Throwable throwable) {
        CopyOnWriteArraySet<ILogListener> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (throwable != null) {
            message = message + '\n' + Log.getStackTraceString(throwable);
        }
        Iterator<ILogListener> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().onLogEvent(new OneSignalLogEvent(level, message));
        }
    }

    private final void logToOtel(LogLevel level, String message, Throwable throwable) {
        IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = otelRemoteTelemetry;
        if (iOtelOpenTelemetryRemote == null || level == LogLevel.NONE || !shouldSendLogLevel.invoke(level).booleanValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(otelLoggingScope, null, null, new Logging$logToOtel$1(iOtelOpenTelemetryRemote, level, message, throwable, null), 3, null);
    }

    public final void addListener(ILogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.add(listener);
    }

    public final void removeListener(ILogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        logListeners.remove(listener);
    }
}
