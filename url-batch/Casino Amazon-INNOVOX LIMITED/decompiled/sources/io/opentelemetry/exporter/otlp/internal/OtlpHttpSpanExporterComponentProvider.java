package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpHttpSpanExporterComponentProvider implements ComponentProvider<SpanExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<SpanExporter> getType() {
        return SpanExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_http";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public SpanExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpHttpSpanExporterBuilder httpBuilder = httpBuilder();
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda0 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda0(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda1 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda1 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda1(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda4 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda4(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda5 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda5(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda6 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda6(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda7 otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda7(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_TRACES, declarativeConfigProperties, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda1, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda8(httpBuilder), true);
        return httpBuilder.build();
    }

    OtlpHttpSpanExporterBuilder httpBuilder() {
        return OtlpHttpSpanExporter.builder();
    }
}
