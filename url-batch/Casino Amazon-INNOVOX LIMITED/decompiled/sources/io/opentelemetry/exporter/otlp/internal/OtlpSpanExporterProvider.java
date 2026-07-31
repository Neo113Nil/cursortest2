package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener;
import io.opentelemetry.sdk.autoconfigure.spi.traces.ConfigurableSpanExporterProvider;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public class OtlpSpanExporterProvider implements ConfigurableSpanExporterProvider, AutoConfigureListener {
    private final AtomicReference<MeterProvider> meterProviderRef = new AtomicReference<>(MeterProvider.noop());

    @Override // io.opentelemetry.sdk.autoconfigure.spi.traces.ConfigurableSpanExporterProvider
    public SpanExporter createExporter(ConfigProperties configProperties) {
        String otlpProtocol = OtlpConfigUtil.getOtlpProtocol(OtlpConfigUtil.DATA_TYPE_TRACES, configProperties);
        if (otlpProtocol.equals(OtlpConfigUtil.PROTOCOL_HTTP_PROTOBUF)) {
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_TRACES, configProperties, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda1, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda2, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpHttpSpanExporterComponentProvider$$ExternalSyntheticLambda8(httpBuilder));
            final AtomicReference<MeterProvider> atomicReference = this.meterProviderRef;
            Objects.requireNonNull(atomicReference);
            httpBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpSpanExporterProvider$$ExternalSyntheticLambda0
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_TRACES, configProperties, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda1, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda2, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda7, new OtlpGrpcSpanExporterComponentProvider$$ExternalSyntheticLambda8(grpcBuilder));
            final AtomicReference<MeterProvider> atomicReference2 = this.meterProviderRef;
            Objects.requireNonNull(atomicReference2);
            grpcBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpSpanExporterProvider$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    Object obj;
                    obj = atomicReference2.get();
                    return (MeterProvider) obj;
                }
            });
            return grpcBuilder.build();
        }
        throw new ConfigurationException("Unsupported OTLP traces protocol: " + otlpProtocol);
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.traces.ConfigurableSpanExporterProvider
    public String getName() {
        return "otlp";
    }

    OtlpHttpSpanExporterBuilder httpBuilder() {
        return OtlpHttpSpanExporter.builder();
    }

    OtlpGrpcSpanExporterBuilder grpcBuilder() {
        return OtlpGrpcSpanExporter.builder();
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener
    public void afterAutoConfigure(OpenTelemetrySdk openTelemetrySdk) {
        this.meterProviderRef.set(openTelemetrySdk.getMeterProvider());
    }
}
