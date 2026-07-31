package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporter;
import io.opentelemetry.exporter.otlp.http.logs.OtlpHttpLogRecordExporterBuilder;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporter;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener;
import io.opentelemetry.sdk.autoconfigure.spi.logs.ConfigurableLogRecordExporterProvider;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public class OtlpLogRecordExporterProvider implements ConfigurableLogRecordExporterProvider, AutoConfigureListener {
    private final AtomicReference<MeterProvider> meterProviderRef = new AtomicReference<>(MeterProvider.noop());

    @Override // io.opentelemetry.sdk.autoconfigure.spi.logs.ConfigurableLogRecordExporterProvider
    public LogRecordExporter createExporter(ConfigProperties configProperties) {
        String otlpProtocol = OtlpConfigUtil.getOtlpProtocol(OtlpConfigUtil.DATA_TYPE_LOGS, configProperties);
        if (otlpProtocol.equals(OtlpConfigUtil.PROTOCOL_HTTP_PROTOBUF)) {
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_LOGS, configProperties, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda1, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda2, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpHttpLogRecordExporterComponentProvider$$ExternalSyntheticLambda8(httpBuilder));
            final AtomicReference<MeterProvider> atomicReference = this.meterProviderRef;
            Objects.requireNonNull(atomicReference);
            httpBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpLogRecordExporterProvider$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    Object obj;
                    obj = atomicReference.get();
                    return (MeterProvider) obj;
                }
            });
            return httpBuilder.build();
        }
        if (otlpProtocol.equals(OtlpConfigUtil.PROTOCOL_GRPC)) {
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_LOGS, configProperties, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda1, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda2, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpGrpcLogRecordExporterComponentProvider$$ExternalSyntheticLambda8(grpcBuilder));
            final AtomicReference<MeterProvider> atomicReference2 = this.meterProviderRef;
            Objects.requireNonNull(atomicReference2);
            grpcBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpLogRecordExporterProvider$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    Object obj;
                    obj = atomicReference2.get();
                    return (MeterProvider) obj;
                }
            });
            return grpcBuilder.build();
        }
        throw new ConfigurationException("Unsupported OTLP logs protocol: " + otlpProtocol);
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.logs.ConfigurableLogRecordExporterProvider
    public String getName() {
        return "otlp";
    }

    OtlpHttpLogRecordExporterBuilder httpBuilder() {
        return OtlpHttpLogRecordExporter.builder();
    }

    OtlpGrpcLogRecordExporterBuilder grpcBuilder() {
        return OtlpGrpcLogRecordExporter.builder();
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener
    public void afterAutoConfigure(OpenTelemetrySdk openTelemetrySdk) {
        this.meterProviderRef.set(openTelemetrySdk.getMeterProvider());
    }
}
