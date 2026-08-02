package io.opentelemetry.api;

import io.opentelemetry.api.trace.DefaultTracerProvider;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.propagation.NoopTextMapPropagator;

/* loaded from: classes9.dex */
public final class DefaultOpenTelemetry implements OpenTelemetry {
    public static final DefaultOpenTelemetry NO_OP = new DefaultOpenTelemetry();

    @Override // io.opentelemetry.api.OpenTelemetry
    public final TracerProvider getTracerProvider() {
        return DefaultTracerProvider.INSTANCE;
    }

    public final String toString() {
        return "DefaultOpenTelemetry{propagators=" + NoopTextMapPropagator.NOOP + "}";
    }
}
