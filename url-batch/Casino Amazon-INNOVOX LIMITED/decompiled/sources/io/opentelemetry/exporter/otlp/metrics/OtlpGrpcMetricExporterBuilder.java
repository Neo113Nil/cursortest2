package io.opentelemetry.exporter.otlp.metrics;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.otlp.internal.OtlpUserAgent;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import io.opentelemetry.sdk.internal.StandardComponentId;
import io.opentelemetry.sdk.metrics.export.AggregationTemporalitySelector;
import io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector;
import java.net.URI;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class OtlpGrpcMetricExporterBuilder {
    private static final long DEFAULT_TIMEOUT_SECS = 10;
    static final String GRPC_ENDPOINT_PATH = "/opentelemetry.proto.collector.metrics.v1.MetricsService/Export";
    private static final String GRPC_SERVICE_NAME = "opentelemetry.proto.collector.metrics.v1.MetricsService";
    private AggregationTemporalitySelector aggregationTemporalitySelector;
    private DefaultAggregationSelector defaultAggregationSelector;
    final GrpcExporterBuilder<Marshaler> delegate;
    private MemoryMode memoryMode;
    private static final String DEFAULT_ENDPOINT_URL = "http://localhost:4317";
    private static final URI DEFAULT_ENDPOINT = URI.create(DEFAULT_ENDPOINT_URL);
    private static final AggregationTemporalitySelector DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR = AggregationTemporalitySelector.alwaysCumulative();
    private static final MemoryMode DEFAULT_MEMORY_MODE = MemoryMode.REUSABLE_DATA;

    static /* synthetic */ MeterProvider lambda$setMeterProvider$1(MeterProvider meterProvider) {
        return meterProvider;
    }

    OtlpGrpcMetricExporterBuilder(final GrpcExporterBuilder<Marshaler> grpcExporterBuilder, AggregationTemporalitySelector aggregationTemporalitySelector, DefaultAggregationSelector defaultAggregationSelector, MemoryMode memoryMode) {
        this.delegate = grpcExporterBuilder;
        this.aggregationTemporalitySelector = aggregationTemporalitySelector;
        this.defaultAggregationSelector = defaultAggregationSelector;
        this.memoryMode = memoryMode;
        Objects.requireNonNull(grpcExporterBuilder);
        OtlpUserAgent.addUserAgentHeader(new BiConsumer() { // from class: io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                GrpcExporterBuilder.this.addConstantHeader((String) obj, (String) obj2);
            }
        });
    }

    OtlpGrpcMetricExporterBuilder() {
        this(new GrpcExporterBuilder(StandardComponentId.ExporterType.OTLP_GRPC_METRIC_EXPORTER, 10L, DEFAULT_ENDPOINT, new Supplier() { // from class: io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return OtlpGrpcMetricExporterBuilder.lambda$new$0();
            }
        }, GRPC_ENDPOINT_PATH), DEFAULT_AGGREGATION_TEMPORALITY_SELECTOR, DefaultAggregationSelector.getDefault(), DEFAULT_MEMORY_MODE);
    }

    static /* synthetic */ BiFunction lambda$new$0() {
        return new BiFunction() { // from class: io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder$$ExternalSyntheticLambda3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MarshalerMetricsServiceGrpc.newFutureStub((Channel) obj, (String) obj2);
            }
        };
    }

    @Deprecated
    public OtlpGrpcMetricExporterBuilder setChannel(ManagedChannel managedChannel) {
        this.delegate.setChannel(managedChannel);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setTimeout(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "timeout must be non-negative");
        this.delegate.setTimeout(j, timeUnit);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setTimeout(Duration duration) {
        Objects.requireNonNull(duration, "timeout");
        this.delegate.setTimeout(duration);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setConnectTimeout(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "timeout must be non-negative");
        this.delegate.setConnectTimeout(j, timeUnit);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setConnectTimeout(Duration duration) {
        Objects.requireNonNull(duration, "timeout");
        return setConnectTimeout(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    public OtlpGrpcMetricExporterBuilder setEndpoint(String str) {
        Objects.requireNonNull(str, "endpoint");
        this.delegate.setEndpoint(str);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setCompression(String str) {
        Objects.requireNonNull(str, "compressionMethod");
        this.delegate.setCompression(str);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setTrustedCertificates(byte[] bArr) {
        this.delegate.setTrustManagerFromCerts(bArr);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setClientTls(byte[] bArr, byte[] bArr2) {
        this.delegate.setKeyManagerFromCerts(bArr, bArr2);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setSslContext(SSLContext sSLContext, X509TrustManager x509TrustManager) {
        this.delegate.setSslContext(sSLContext, x509TrustManager);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder addHeader(String str, String str2) {
        this.delegate.addConstantHeader(str, str2);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setHeaders(Supplier<Map<String, String>> supplier) {
        this.delegate.setHeadersSupplier(supplier);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setAggregationTemporalitySelector(AggregationTemporalitySelector aggregationTemporalitySelector) {
        Objects.requireNonNull(aggregationTemporalitySelector, "aggregationTemporalitySelector");
        this.aggregationTemporalitySelector = aggregationTemporalitySelector;
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setDefaultAggregationSelector(DefaultAggregationSelector defaultAggregationSelector) {
        Objects.requireNonNull(defaultAggregationSelector, "defaultAggregationSelector");
        this.defaultAggregationSelector = defaultAggregationSelector;
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        this.delegate.setRetryPolicy(retryPolicy);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setInternalTelemetryVersion(InternalTelemetryVersion internalTelemetryVersion) {
        Objects.requireNonNull(internalTelemetryVersion, "schemaVersion");
        this.delegate.setInternalTelemetryVersion(internalTelemetryVersion);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setMeterProvider(final MeterProvider meterProvider) {
        Objects.requireNonNull(meterProvider, "meterProvider");
        this.delegate.setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return OtlpGrpcMetricExporterBuilder.lambda$setMeterProvider$1(MeterProvider.this);
            }
        });
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setMeterProvider(Supplier<MeterProvider> supplier) {
        Objects.requireNonNull(supplier, "meterProvider");
        this.delegate.setMeterProvider(supplier);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setMemoryMode(MemoryMode memoryMode) {
        Objects.requireNonNull(memoryMode, "memoryMode");
        this.memoryMode = memoryMode;
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setServiceClassLoader(ClassLoader classLoader) {
        Objects.requireNonNull(classLoader, "serviceClassLoader");
        return setComponentLoader(ComponentLoader.forClassLoader(classLoader));
    }

    public OtlpGrpcMetricExporterBuilder setComponentLoader(ComponentLoader componentLoader) {
        Objects.requireNonNull(componentLoader, "componentLoader");
        this.delegate.setComponentLoader(componentLoader);
        return this;
    }

    public OtlpGrpcMetricExporterBuilder setExecutorService(ExecutorService executorService) {
        Objects.requireNonNull(executorService, "executorService");
        this.delegate.setExecutorService(executorService);
        return this;
    }

    public OtlpGrpcMetricExporter build() {
        GrpcExporterBuilder<Marshaler> grpcExporterBuilder = this.delegate;
        return new OtlpGrpcMetricExporter(grpcExporterBuilder, grpcExporterBuilder.build(), this.aggregationTemporalitySelector, this.defaultAggregationSelector, this.memoryMode);
    }
}
