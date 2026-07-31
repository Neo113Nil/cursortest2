package co.touchlab.kermit;

import com.onesignal.core.internal.config.ConfigModelStoreKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseLogger.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J+\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0086\bJ8\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00100\u0015j\u0002`\u0016H\u0086\bø\u0001\u0000J(\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lco/touchlab/kermit/BaseLogger;", "", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Lco/touchlab/kermit/LoggerConfig;", "(Lco/touchlab/kermit/LoggerConfig;)V", "getConfig", "()Lco/touchlab/kermit/LoggerConfig;", "mutableConfig", "Lco/touchlab/kermit/MutableLoggerConfig;", "getMutableConfig", "()Lco/touchlab/kermit/MutableLoggerConfig;", "log", "", "severity", "Lco/touchlab/kermit/Severity;", "tag", "", "throwable", "", "message", "logBlock", "Lkotlin/Function0;", "Lco/touchlab/kermit/MessageBlock;", "processLog", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseLogger {
    private final LoggerConfig config;

    public BaseLogger(LoggerConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public LoggerConfig getConfig() {
        return this.config;
    }

    public final MutableLoggerConfig getMutableConfig() {
        LoggerConfig config = getConfig();
        if (!(config instanceof MutableLoggerConfig)) {
            throw new IllegalStateException("Logger config is not mutable");
        }
        return (MutableLoggerConfig) config;
    }

    public final void logBlock(Severity severity, String tag, Throwable throwable, Function0<String> message) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (getConfig().get_minSeverity().compareTo(severity) <= 0) {
            processLog(severity, tag, throwable, message.invoke());
        }
    }

    public final void log(Severity severity, String tag, Throwable throwable, String message) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (getConfig().get_minSeverity().compareTo(severity) <= 0) {
            processLog(severity, tag, throwable, message);
        }
    }

    public final void processLog(Severity severity, String tag, Throwable throwable, String message) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        for (LogWriter logWriter : getConfig().getLogWriterList()) {
            if (logWriter.isLoggable(tag, severity)) {
                logWriter.log(severity, message, tag, throwable);
            }
        }
    }
}
