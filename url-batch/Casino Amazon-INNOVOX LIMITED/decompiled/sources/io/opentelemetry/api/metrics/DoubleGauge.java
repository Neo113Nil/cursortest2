package io.opentelemetry.api.metrics;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* loaded from: classes3.dex */
public interface DoubleGauge {
    void set(double d);

    void set(double d, Attributes attributes);

    void set(double d, Attributes attributes, Context context);
}
