package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* loaded from: classes3.dex */
class NoopAttributesProcessor extends AttributesProcessor {
    static final NoopAttributesProcessor NOOP = new NoopAttributesProcessor();

    @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
    public Attributes process(Attributes attributes, Context context) {
        return attributes;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
    public boolean usesContext() {
        return false;
    }

    private NoopAttributesProcessor() {
    }

    public String toString() {
        return "NoopAttributesProcessor{}";
    }
}
