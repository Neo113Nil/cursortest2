package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* loaded from: classes3.dex */
public interface WriteableMetricStorage {
    boolean isEnabled();

    void recordDouble(double d, Attributes attributes, Context context);

    void recordLong(long j, Attributes attributes, Context context);
}
