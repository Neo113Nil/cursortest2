package squareup.cash.customer_feed.service;

import com.squareup.protos.cash.instantpay.api.serverpush.InstantPayoutAttempt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* loaded from: classes7.dex */
public final class ResponseEnvelope$Type$InstantPayoutAttempt extends Cache.Companion {
    public final InstantPayoutAttempt value;

    public ResponseEnvelope$Type$InstantPayoutAttempt(InstantPayoutAttempt instantPayoutAttempt) {
        instantPayoutAttempt.getClass();
        this.value = instantPayoutAttempt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResponseEnvelope$Type$InstantPayoutAttempt) && Intrinsics.areEqual(this.value, ((ResponseEnvelope$Type$InstantPayoutAttempt) obj).value);
    }

    public final InstantPayoutAttempt getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InstantPayoutAttempt(value=" + this.value + ")";
    }
}
