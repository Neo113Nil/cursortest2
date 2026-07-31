package io.opentelemetry.api.incubator.trace;

import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerBuilder;
import io.opentelemetry.api.trace.TracerProvider;

/* loaded from: classes3.dex */
public class ExtendedDefaultTracerProvider implements TracerProvider {
    private static final TracerProvider INSTANCE = new ExtendedDefaultTracerProvider();

    public static TracerProvider getNoop() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public Tracer get(String str) {
        return ExtendedDefaultTracer.getNoop();
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public Tracer get(String str, String str2) {
        return ExtendedDefaultTracer.getNoop();
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public TracerBuilder tracerBuilder(String str) {
        return ExtendedDefaultTracerBuilder.getInstance();
    }

    private ExtendedDefaultTracerProvider() {
    }
}
