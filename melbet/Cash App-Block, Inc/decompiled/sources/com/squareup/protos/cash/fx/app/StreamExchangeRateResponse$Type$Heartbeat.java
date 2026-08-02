package com.squareup.protos.cash.fx.app;

import coil3.network.CacheNetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StreamExchangeRateResponse$Type$Heartbeat extends CacheNetworkResponse {
    public final StreamExchangeRateHeartbeat value;

    public StreamExchangeRateResponse$Type$Heartbeat(StreamExchangeRateHeartbeat streamExchangeRateHeartbeat) {
        streamExchangeRateHeartbeat.getClass();
        this.value = streamExchangeRateHeartbeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamExchangeRateResponse$Type$Heartbeat) && Intrinsics.areEqual(this.value, ((StreamExchangeRateResponse$Type$Heartbeat) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Heartbeat(value=" + this.value + ")";
    }
}
