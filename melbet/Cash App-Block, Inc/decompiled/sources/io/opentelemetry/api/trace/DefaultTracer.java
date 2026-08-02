package io.opentelemetry.api.trace;

import dev.chrisbanes.haze.Pool;

/* loaded from: classes9.dex */
public final class DefaultTracer implements Tracer {
    public static final DefaultTracer INSTANCE = new DefaultTracer();

    @Override // io.opentelemetry.api.trace.Tracer
    public final SpanBuilder spanBuilder(String str) {
        return new Pool();
    }
}
