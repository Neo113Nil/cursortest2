package co.touchlab.kermit;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JvmMutableLoggerConfig.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lco/touchlab/kermit/JvmMutableLoggerConfig;", "Lco/touchlab/kermit/MutableLoggerConfig;", "logWriters", "", "Lco/touchlab/kermit/LogWriter;", "(Ljava/util/List;)V", "_loggerList", "_minSeverity", "Lco/touchlab/kermit/Severity;", "value", "logWriterList", "getLogWriterList", "()Ljava/util/List;", "setLogWriterList", "minSeverity", "getMinSeverity", "()Lco/touchlab/kermit/Severity;", "setMinSeverity", "(Lco/touchlab/kermit/Severity;)V", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JvmMutableLoggerConfig implements MutableLoggerConfig {
    private volatile List<? extends LogWriter> _loggerList;
    private volatile Severity _minSeverity;

    public JvmMutableLoggerConfig(List<? extends LogWriter> logWriters) {
        Intrinsics.checkNotNullParameter(logWriters, "logWriters");
        this._minSeverity = BaseLoggerKt.getDEFAULT_MIN_SEVERITY();
        this._loggerList = logWriters;
    }

    @Override // co.touchlab.kermit.MutableLoggerConfig, co.touchlab.kermit.LoggerConfig
    /* renamed from: getMinSeverity, reason: from getter */
    public Severity get_minSeverity() {
        return this._minSeverity;
    }

    @Override // co.touchlab.kermit.MutableLoggerConfig
    public void setMinSeverity(Severity value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this) {
            this._minSeverity = value;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // co.touchlab.kermit.MutableLoggerConfig, co.touchlab.kermit.LoggerConfig
    public List<LogWriter> getLogWriterList() {
        return this._loggerList;
    }

    @Override // co.touchlab.kermit.MutableLoggerConfig
    public void setLogWriterList(List<? extends LogWriter> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this) {
            this._loggerList = value;
            Unit unit = Unit.INSTANCE;
        }
    }
}
