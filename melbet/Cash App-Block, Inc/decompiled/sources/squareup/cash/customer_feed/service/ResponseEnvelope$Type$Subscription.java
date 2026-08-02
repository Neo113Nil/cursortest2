package squareup.cash.customer_feed.service;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* loaded from: classes3.dex */
public final class ResponseEnvelope$Type$Subscription extends Cache.Companion {
    public final Subscription value;

    public ResponseEnvelope$Type$Subscription(Subscription subscription) {
        subscription.getClass();
        this.value = subscription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseEnvelope$Type$Subscription) && Intrinsics.areEqual(this.value, ((ResponseEnvelope$Type$Subscription) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Subscription(value=" + this.value + ")";
    }
}
