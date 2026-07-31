package io.opentelemetry.sdk.autoconfigure.spi.logs;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;

/* loaded from: classes3.dex */
public interface ConfigurableLogRecordExporterProvider {
    LogRecordExporter createExporter(ConfigProperties configProperties);

    String getName();
}
