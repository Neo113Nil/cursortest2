package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableValueAtQuantile;

/* loaded from: classes3.dex */
public interface ValueAtQuantile {
    double getQuantile();

    double getValue();

    static ValueAtQuantile create(double d, double d2) {
        return ImmutableValueAtQuantile.create(d, d2);
    }
}
