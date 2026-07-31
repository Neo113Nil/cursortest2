package io.opentelemetry.context.propagation;

import java.util.Objects;

/* loaded from: classes3.dex */
public interface ContextPropagators {
    TextMapPropagator getTextMapPropagator();

    static ContextPropagators create(TextMapPropagator textMapPropagator) {
        Objects.requireNonNull(textMapPropagator, "textPropagator");
        return new DefaultContextPropagators(textMapPropagator);
    }

    static ContextPropagators noop() {
        return DefaultContextPropagators.noop();
    }
}
