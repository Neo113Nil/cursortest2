package squareup.cash.customer_feed.service;

import com.squareup.protos.cash.clientsync.serverpush.SyncEntitiesNudge;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public final class ResponseEnvelope$Type$Nudge extends Cache.Companion {
    public final SyncEntitiesNudge value;

    public ResponseEnvelope$Type$Nudge(SyncEntitiesNudge syncEntitiesNudge) {
        syncEntitiesNudge.getClass();
        this.value = syncEntitiesNudge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseEnvelope$Type$Nudge) && Intrinsics.areEqual(this.value, ((ResponseEnvelope$Type$Nudge) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Nudge(value=" + this.value + ")";
    }
}
