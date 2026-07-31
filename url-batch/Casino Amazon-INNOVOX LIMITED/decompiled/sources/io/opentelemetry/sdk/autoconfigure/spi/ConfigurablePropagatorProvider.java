package io.opentelemetry.sdk.autoconfigure.spi;

import io.opentelemetry.context.propagation.TextMapPropagator;

/* loaded from: classes3.dex */
public interface ConfigurablePropagatorProvider {
    String getName();

    TextMapPropagator getPropagator(ConfigProperties configProperties);
}
