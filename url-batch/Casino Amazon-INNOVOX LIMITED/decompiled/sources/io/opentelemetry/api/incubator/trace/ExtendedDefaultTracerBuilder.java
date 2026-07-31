package io.opentelemetry.api.incubator.trace;

import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerBuilder;

/* loaded from: classes3.dex */
final class ExtendedDefaultTracerBuilder implements TracerBuilder {
    private static final ExtendedDefaultTracerBuilder INSTANCE = new ExtendedDefaultTracerBuilder();

    @Override // io.opentelemetry.api.trace.TracerBuilder
    public TracerBuilder setInstrumentationVersion(String str) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.TracerBuilder
    public TracerBuilder setSchemaUrl(String str) {
        return this;
    }

    ExtendedDefaultTracerBuilder() {
    }

    static TracerBuilder getInstance() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.api.trace.TracerBuilder
    public Tracer build() {
        return ExtendedDefaultTracer.getNoop();
    }
}
