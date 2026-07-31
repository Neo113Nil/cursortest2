package io.opentelemetry.sdk.trace.export;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class SimpleSpanProcessorBuilder {
    private boolean exportUnsampledSpans = false;
    private final SpanExporter spanExporter;

    SimpleSpanProcessorBuilder(SpanExporter spanExporter) {
        this.spanExporter = (SpanExporter) Objects.requireNonNull(spanExporter, "spanExporter");
    }

    public SimpleSpanProcessorBuilder setExportUnsampledSpans(boolean z) {
        this.exportUnsampledSpans = z;
        return this;
    }

    public SimpleSpanProcessor build() {
        return new SimpleSpanProcessor(this.spanExporter, this.exportUnsampledSpans);
    }
}
