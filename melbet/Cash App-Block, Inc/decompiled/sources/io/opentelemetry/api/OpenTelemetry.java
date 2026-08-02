package io.opentelemetry.api;

import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;

/* loaded from: classes9.dex */
public interface OpenTelemetry {
    default Tracer getTracer() {
        return getTracerProvider().get();
    }

    TracerProvider getTracerProvider();
}
