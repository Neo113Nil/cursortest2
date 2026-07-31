package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpGrpcSpanExporterComponentProvider implements ComponentProvider<SpanExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<SpanExporter> getType() {
        return SpanExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_grpc";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public SpanExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpGrpcSpanExporterBuilder grpcBuilder = grpcBuilder();
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda0 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda0(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda1 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda1 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda1(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda3 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda3(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda4 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda4(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda5 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda5(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda6 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda6(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda7 otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda7(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_TRACES, declarativeConfigProperties, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda1, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda8(grpcBuilder), false);
        return grpcBuilder.build();
    }

    OtlpGrpcSpanExporterBuilder grpcBuilder() {
        return OtlpGrpcSpanExporter.builder();
    }
}
