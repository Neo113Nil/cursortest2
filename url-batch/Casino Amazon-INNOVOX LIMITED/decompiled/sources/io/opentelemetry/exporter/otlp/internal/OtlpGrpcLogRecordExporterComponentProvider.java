package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.incubator.config.DeclarativeConfigProperties;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporter;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder;
import io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Objects;

/* loaded from: classes3.dex */
public class OtlpGrpcLogRecordExporterComponentProvider implements ComponentProvider<LogRecordExporter> {
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public Class<LogRecordExporter> getType() {
        return LogRecordExporter.class;
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public String getName() {
        return "otlp_grpc";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.ComponentProvider
    public LogRecordExporter create(DeclarativeConfigProperties declarativeConfigProperties) {
        OtlpGrpcLogRecordExporterBuilder grpcBuilder = grpcBuilder();
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda0 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda0 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda0(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda1 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda1 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda1(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda3 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda3 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda3(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda4 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda4 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda4(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda5 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda5 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda5(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda6 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda6 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda6(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda7 otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda7 = new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda7(grpcBuilder);
        Objects.requireNonNull(grpcBuilder);
        OtlpDeclarativeConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_LOGS, declarativeConfigProperties, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda1, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda8(grpcBuilder), false);
        return grpcBuilder.build();
    }

    OtlpGrpcLogRecordExporterBuilder grpcBuilder() {
        return OtlpGrpcLogRecordExporter.builder();
    }
}
