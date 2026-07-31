package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.internal.IncubatingExporterBuilderUtil;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporter;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.metrics.export.MetricExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpGrpcMetricExporterComponentProvider implements ComponentProvider<MetricExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<MetricExporter> getType() {
        return MetricExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_grpc";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public MetricExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpGrpcMetricExporterBuilder grpcBuilder = grpcBuilder();
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda0 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda0(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda3 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda3(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda4 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda4(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda6 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda6(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda7 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda7(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda9 otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda9 = new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda9(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_METRICS, declarativeConfigProperties, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda7, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda9, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda10(grpcBuilder), false);
        Objects.requireNonNull(grpcBuilder);
        IncubatingExporterBuilderUtil.configureOtlpAggregationTemporality(declarativeConfigProperties, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda1(grpcBuilder));
        Objects.requireNonNull(grpcBuilder);
        IncubatingExporterBuilderUtil.configureOtlpHistogramDefaultAggregation(declarativeConfigProperties, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda2(grpcBuilder));
        return grpcBuilder.build();
    }

    OtlpGrpcMetricExporterBuilder grpcBuilder() {
        return OtlpGrpcMetricExporter.builder();
    }
}
