package co.touchlab.kermit;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggerConfig.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lco/touchlab/kermit/StaticConfig;", "Lco/touchlab/kermit/LoggerConfig;", "minSeverity", "Lco/touchlab/kermit/Severity;", "logWriterList", "", "Lco/touchlab/kermit/LogWriter;", "(Lco/touchlab/kermit/Severity;Ljava/util/List;)V", "getLogWriterList", "()Ljava/util/List;", "getMinSeverity", "()Lco/touchlab/kermit/Severity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kermit-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StaticConfig implements LoggerConfig {
    private final List<LogWriter> logWriterList;
    private final Severity minSeverity;

    /* JADX WARN: Multi-variable type inference failed */
    public StaticConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticConfig copy$default(StaticConfig staticConfig, Severity severity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            severity = staticConfig.minSeverity;
        }
        if ((i & 2) != 0) {
            list = staticConfig.logWriterList;
        }
        return staticConfig.copy(severity, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Severity getMinSeverity() {
        return this.minSeverity;
    }

    public final List<LogWriter> component2() {
        return this.logWriterList;
    }

    public final StaticConfig copy(Severity minSeverity, List<? extends LogWriter> logWriterList) {
        Intrinsics.checkNotNullParameter(minSeverity, "minSeverity");
        Intrinsics.checkNotNullParameter(logWriterList, "logWriterList");
        return new StaticConfig(minSeverity, logWriterList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticConfig)) {
            return false;
        }
        StaticConfig staticConfig = (StaticConfig) other;
        return this.minSeverity == staticConfig.minSeverity && Intrinsics.areEqual(this.logWriterList, staticConfig.logWriterList);
    }

    public int hashCode() {
        return (this.minSeverity.hashCode() * 31) + this.logWriterList.hashCode();
    }

    public String toString() {
        return "StaticConfig(minSeverity=" + this.minSeverity + ", logWriterList=" + this.logWriterList + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StaticConfig(Severity minSeverity, List<? extends LogWriter> logWriterList) {
        Intrinsics.checkNotNullParameter(minSeverity, "minSeverity");
        Intrinsics.checkNotNullParameter(logWriterList, "logWriterList");
        this.minSeverity = minSeverity;
        this.logWriterList = logWriterList;
    }

    public /* synthetic */ StaticConfig(Severity severity, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BaseLoggerKt.getDEFAULT_MIN_SEVERITY() : severity, (i & 2) != 0 ? CollectionsKt.listOf(new CommonWriter(null, 1, null)) : list);
    }

    @Override // co.touchlab.kermit.LoggerConfig
    /* renamed from: getMinSeverity */
    public Severity get_minSeverity() {
        return this.minSeverity;
    }

    @Override // co.touchlab.kermit.LoggerConfig
    public List<LogWriter> getLogWriterList() {
        return this.logWriterList;
    }
}
