package squareup.cash.customer_feed.service;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class RequestEnvelope$Type$Subscribe {
    public final SubscribeRequest value;

    public RequestEnvelope$Type$Subscribe(SubscribeRequest subscribeRequest) {
        subscribeRequest.getClass();
        this.value = subscribeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestEnvelope$Type$Subscribe) && Intrinsics.areEqual(this.value, ((RequestEnvelope$Type$Subscribe) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Subscribe(value=" + this.value + ")";
    }
}
