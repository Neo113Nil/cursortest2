package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.exporter.internal.ExporterBuilderUtil;
import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporter;
import io.opentelemetry.exporter.otlp.http.metrics.OtlpHttpMetricExporterBuilder;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporter;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigurationException;
import io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener;
import io.opentelemetry.sdk.autoconfigure.spi.metrics.ConfigurableMetricExporterProvider;
import io.opentelemetry.sdk.metrics.export.MetricExporter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public class OtlpMetricExporterProvider implements ConfigurableMetricExporterProvider, AutoConfigureListener {
    private final AtomicReference<MeterProvider> meterProviderRef = new AtomicReference<>(MeterProvider.noop());

    @Override // io.opentelemetry.sdk.autoconfigure.spi.metrics.ConfigurableMetricExporterProvider
    public MetricExporter createExporter(ConfigProperties configProperties) {
        String otlpProtocol = OtlpConfigUtil.getOtlpProtocol(OtlpConfigUtil.DATA_TYPE_METRICS, configProperties);
        if (otlpProtocol.equals(OtlpConfigUtil.PROTOCOL_HTTP_PROTOBUF)) {
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_METRICS, configProperties, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda0, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda3, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda4, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda5, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda6, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda7, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda8, otlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda9, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda10(httpBuilder));
            Objects.requireNonNull(httpBuilder);
            ExporterBuilderUtil.configureOtlpAggregationTemporality(configProperties, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda1(httpBuilder));
            Objects.requireNonNull(httpBuilder);
            ExporterBuilderUtil.configureOtlpHistogramDefaultAggregation(configProperties, new OtlpHttpMetricExporterComponentProvider$$ExternalSyntheticLambda2(httpBuilder));
            final AtomicReference<MeterProvider> atomicReference = this.meterProviderRef;
            Objects.requireNonNull(atomicReference);
            httpBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpMetricExporterProvider$$ExternalSyntheticLambda0
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
            OtlpConfigUtil.configureOtlpExporterBuilder(OtlpConfigUtil.DATA_TYPE_METRICS, configProperties, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda0, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda3, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda4, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda5, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda6, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda7, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda8, otlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda9, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda10(grpcBuilder));
            Objects.requireNonNull(grpcBuilder);
            ExporterBuilderUtil.configureOtlpAggregationTemporality(configProperties, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda1(grpcBuilder));
            Objects.requireNonNull(grpcBuilder);
            ExporterBuilderUtil.configureOtlpHistogramDefaultAggregation(configProperties, new OtlpGrpcMetricExporterComponentProvider$$ExternalSyntheticLambda2(grpcBuilder));
            final AtomicReference<MeterProvider> atomicReference2 = this.meterProviderRef;
            Objects.requireNonNull(atomicReference2);
            grpcBuilder.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.internal.OtlpMetricExporterProvider$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    Object obj;
                    obj = atomicReference2.get();
                    return (MeterProvider) obj;
                }
            });
            return grpcBuilder.build();
        }
        throw new ConfigurationException("Unsupported OTLP metrics protocol: " + otlpProtocol);
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.metrics.ConfigurableMetricExporterProvider
    public String getName() {
        return "otlp";
    }

    OtlpHttpMetricExporterBuilder httpBuilder() {
        return OtlpHttpMetricExporter.builder();
    }

    OtlpGrpcMetricExporterBuilder grpcBuilder() {
        return OtlpGrpcMetricExporter.builder();
    }

    @Override // io.opentelemetry.sdk.autoconfigure.spi.internal.AutoConfigureListener
    public void afterAutoConfigure(OpenTelemetrySdk openTelemetrySdk) {
        this.meterProviderRef.set(openTelemetrySdk.getMeterProvider());
    }
}
