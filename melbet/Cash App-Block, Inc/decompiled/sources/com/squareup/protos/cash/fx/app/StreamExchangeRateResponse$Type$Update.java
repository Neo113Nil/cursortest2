package com.squareup.protos.cash.fx.app;

import coil3.network.CacheNetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StreamExchangeRateResponse$Type$Update extends CacheNetworkResponse {
    public final StreamExchangeRateUpdate value;

    public StreamExchangeRateResponse$Type$Update(StreamExchangeRateUpdate streamExchangeRateUpdate) {
        streamExchangeRateUpdate.getClass();
        this.value = streamExchangeRateUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamExchangeRateResponse$Type$Update) && Intrinsics.areEqual(this.value, ((StreamExchangeRateResponse$Type$Update) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Update(value=" + this.value + ")";
    }
}
