package co.touchlab.kermit;

import java.util.List;
import kotlin.Metadata;

/* compiled from: MutableLoggerConfig.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/touchlab/kermit/MutableLoggerConfig;", "Lco/touchlab/kermit/LoggerConfig;", "logWriterList", "", "Lco/touchlab/kermit/LogWriter;", "getLogWriterList", "()Ljava/util/List;", "setLogWriterList", "(Ljava/util/List;)V", "minSeverity", "Lco/touchlab/kermit/Severity;", "getMinSeverity", "()Lco/touchlab/kermit/Severity;", "setMinSeverity", "(Lco/touchlab/kermit/Severity;)V", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MutableLoggerConfig extends LoggerConfig {
    @Override // co.touchlab.kermit.LoggerConfig
    List<LogWriter> getLogWriterList();

    @Override // co.touchlab.kermit.LoggerConfig
    Severity getMinSeverity();

    void setLogWriterList(List<? extends LogWriter> list);

    void setMinSeverity(Severity severity);
}
