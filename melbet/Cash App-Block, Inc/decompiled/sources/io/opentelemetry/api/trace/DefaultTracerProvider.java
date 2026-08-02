package io.opentelemetry.api.trace;

/* loaded from: classes9.dex */
public final class DefaultTracerProvider implements TracerProvider {
    public static final DefaultTracerProvider INSTANCE = new DefaultTracerProvider();

    @Override // io.opentelemetry.api.trace.TracerProvider
    public final Tracer get() {
        return DefaultTracer.INSTANCE;
    }
}
