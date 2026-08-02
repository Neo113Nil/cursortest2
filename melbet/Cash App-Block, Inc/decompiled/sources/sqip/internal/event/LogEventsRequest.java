package sqip.internal.event;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lsqip/internal/event/LogEventsRequest;", "", "events", "", "Lsqip/internal/event/JsonDataEventWrapper;", "sync", "", "(Ljava/util/List;Z)V", "getEvents", "()Ljava/util/List;", "getSync", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LogEventsRequest {
    private final List<JsonDataEventWrapper> events;
    private final boolean sync;

    public LogEventsRequest(List<JsonDataEventWrapper> list, boolean z) {
        list.getClass();
        this.events = list;
        this.sync = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogEventsRequest copy$default(LogEventsRequest logEventsRequest, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = logEventsRequest.events;
        }
        if ((i & 2) != 0) {
            z = logEventsRequest.sync;
        }
        return logEventsRequest.copy(list, z);
    }

    public final List<JsonDataEventWrapper> component1() {
        return this.events;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSync() {
        return this.sync;
    }

    public final LogEventsRequest copy(List<JsonDataEventWrapper> events, boolean sync) {
        events.getClass();
        return new LogEventsRequest(events, sync);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogEventsRequest)) {
            return false;
        }
        LogEventsRequest logEventsRequest = (LogEventsRequest) other;
        return Intrinsics.areEqual(this.events, logEventsRequest.events) && this.sync == logEventsRequest.sync;
    }

    public final List<JsonDataEventWrapper> getEvents() {
        return this.events;
    }

    public final boolean getSync() {
        return this.sync;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sync) + (this.events.hashCode() * 31);
    }

    public String toString() {
        return "LogEventsRequest(events=" + this.events + ", sync=" + this.sync + ")";
    }

    public /* synthetic */ LogEventsRequest(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
