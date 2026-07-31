package io.opentelemetry.api.trace;

import io.opentelemetry.context.ContextKey;

/* loaded from: classes3.dex */
final class SpanContextKey {
    static final ContextKey<Span> KEY = ContextKey.named("opentelemetry-trace-span-key");

    private SpanContextKey() {
    }
}
