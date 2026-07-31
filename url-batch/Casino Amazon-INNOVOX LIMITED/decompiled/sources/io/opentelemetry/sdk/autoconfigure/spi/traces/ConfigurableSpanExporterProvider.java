package io.opentelemetry.sdk.autoconfigure.spi.traces;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.trace.export.SpanExporter;

/* loaded from: classes3.dex */
public interface ConfigurableSpanExporterProvider {
    SpanExporter createExporter(ConfigProperties configProperties);

    String getName();
}
