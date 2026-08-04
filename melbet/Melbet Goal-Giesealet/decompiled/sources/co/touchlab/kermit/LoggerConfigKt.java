package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggerConfig.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"loggerConfigInit", "Lco/touchlab/kermit/LoggerConfig;", "logWriters", "", "Lco/touchlab/kermit/LogWriter;", "minSeverity", "Lco/touchlab/kermit/Severity;", "([Lco/touchlab/kermit/LogWriter;Lco/touchlab/kermit/Severity;)Lco/touchlab/kermit/LoggerConfig;", "kermit-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggerConfigKt {
    public static /* synthetic */ LoggerConfig loggerConfigInit$default(LogWriter[] logWriterArr, Severity severity, int i, Object obj) {
        if ((i & 2) != 0) {
            severity = BaseLoggerKt.getDEFAULT_MIN_SEVERITY();
        }
        return loggerConfigInit(logWriterArr, severity);
    }

    public static final LoggerConfig loggerConfigInit(LogWriter[] logWriters, Severity minSeverity) {
        Intrinsics.checkNotNullParameter(logWriters, "logWriters");
        Intrinsics.checkNotNullParameter(minSeverity, "minSeverity");
        return new StaticConfig(minSeverity, ArraysKt.toList(logWriters));
    }
}
