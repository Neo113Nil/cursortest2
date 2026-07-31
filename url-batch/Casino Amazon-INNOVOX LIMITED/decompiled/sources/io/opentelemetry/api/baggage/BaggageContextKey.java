package io.opentelemetry.api.baggage;

import io.opentelemetry.context.ContextKey;

/* loaded from: classes3.dex */
class BaggageContextKey {
    static final ContextKey<Baggage> KEY = ContextKey.named("opentelemetry-baggage-key");

    private BaggageContextKey() {
    }
}
