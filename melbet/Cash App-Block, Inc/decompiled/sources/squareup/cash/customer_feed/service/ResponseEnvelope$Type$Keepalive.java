package squareup.cash.customer_feed.service;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* loaded from: classes10.dex */
public final class ResponseEnvelope$Type$Keepalive extends Cache.Companion {
    public final KeepAlive value;

    public ResponseEnvelope$Type$Keepalive(KeepAlive keepAlive) {
        keepAlive.getClass();
        this.value = keepAlive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseEnvelope$Type$Keepalive) && Intrinsics.areEqual(this.value, ((ResponseEnvelope$Type$Keepalive) obj).value);
    }

    public final KeepAlive getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Keepalive(value=" + this.value + ")";
    }
}
