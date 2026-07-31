package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporter;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpHttpLogRecordExporterComponentProvider implements ComponentProvider<LogRecordExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<LogRecordExporter> getType() {
        return LogRecordExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_http";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public LogRecordExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpHttpLogRecordExporterBuilder httpBuilder = httpBuilder();
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda1 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda1 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda1(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda2 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda2 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda2(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda3 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda3(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda4 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda4(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda5 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda5(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda7 otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda7(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_LOGS, declarativeConfigProperties, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda1, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda2, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda8(httpBuilder), true);
        return httpBuilder.build();
    }

    OtlpHttpLogRecordExporterBuilder httpBuilder() {
        return OtlpHttpLogRecordExporter.builder();
    }
}
