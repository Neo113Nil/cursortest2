package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.internal.IncubatingExporterBuilderUtil;
import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporter;
import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.metrics.export.MetricExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpHttpMetricExporterComponentProvider implements ComponentProvider<MetricExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<MetricExporter> getType() {
        return MetricExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_http";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public MetricExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpHttpMetricExporterBuilder httpBuilder = httpBuilder();
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda0 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda0(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda3 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda3(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda4 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda4(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda5 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda5(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda6 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda6(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda7 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda7(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda9 otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda9 = new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda9(httpBuilder);
        Objects.requireNonNull(httpBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_METRICS, declarativeConfigProperties, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda7, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda9, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda10(httpBuilder), true);
        Objects.requireNonNull(httpBuilder);
        IncubatingExporterBuilderUtil.configureOtlpAggregationTemporality(declarativeConfigProperties, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda1(httpBuilder));
        Objects.requireNonNull(httpBuilder);
        IncubatingExporterBuilderUtil.configureOtlpHistogramDefaultAggregation(declarativeConfigProperties, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda2(httpBuilder));
        return httpBuilder.build();
    }

    OtlpHttpMetricExporterBuilder httpBuilder() {
        return OtlpHttpMetricExporter.builder();
    }
}
