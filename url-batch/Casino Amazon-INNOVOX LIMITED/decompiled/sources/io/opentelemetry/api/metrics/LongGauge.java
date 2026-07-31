package io.opentelemetry.api.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* loaded from: classes3.dex */
public interface LongGauge {
    void set(long j);

    void set(long j, Attributes attributes);

    void set(long j, Attributes attributes, Context context);
}
