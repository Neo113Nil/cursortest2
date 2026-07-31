package io.opentelemetry.exporter.otlp.http.trace;

import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.http.HttpExporterBuilder;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.otlp.internal.OtlpUserAgent;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.common.export.ProxyOptions;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import io.opentelemetry.sdk.internal.StandardComponentId;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class OtlpHttpSpanExporterBuilder {
    private static final String DEFAULT_ENDPOINT = "http://localhost:4318/v1/traces";
    private static final MemoryMode DEFAULT_MEMORY_MODE = MemoryMode.REUSABLE_DATA;
    private final HttpExporterBuilder<Marshaler> delegate;
    private MemoryMode memoryMode;

    static /* synthetic */ MeterProvider lambda$setMeterProvider$0(MeterProvider meterProvider) {
        return meterProvider;
    }

    OtlpHttpSpanExporterBuilder(final HttpExporterBuilder<Marshaler> httpExporterBuilder, MemoryMode memoryMode) {
        this.delegate = httpExporterBuilder;
        this.memoryMode = memoryMode;
        Objects.requireNonNull(httpExporterBuilder);
        OtlpUserAgent.addUserAgentHeader(new BiConsumer() { // from class: io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                HttpExporterBuilder.this.addConstantHeaders((String) obj, (String) obj2);
            }
        });
    }

    OtlpHttpSpanExporterBuilder() {
        this(new HttpExporterBuilder(StandardComponentId.ExporterType.OTLP_HTTP_SPAN_EXPORTER, DEFAULT_ENDPOINT), DEFAULT_MEMORY_MODE);
    }

    public OtlpHttpSpanExporterBuilder setTimeout(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "timeout must be non-negative");
        this.delegate.setTimeout(j, timeUnit);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setTimeout(Duration duration) {
        Objects.requireNonNull(duration, "timeout");
        return setTimeout(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    public OtlpHttpSpanExporterBuilder setConnectTimeout(long j, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit");
        Utils.checkArgument(j >= 0, "timeout must be non-negative");
        this.delegate.setConnectTimeout(j, timeUnit);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setConnectTimeout(Duration duration) {
        Objects.requireNonNull(duration, "timeout");
        return setConnectTimeout(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    public OtlpHttpSpanExporterBuilder setEndpoint(String str) {
        Objects.requireNonNull(str, "endpoint");
        this.delegate.setEndpoint(str);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setCompression(String str) {
        Objects.requireNonNull(str, "compressionMethod");
        this.delegate.setCompression(str);
        return this;
    }

    public OtlpHttpSpanExporterBuilder addHeader(String str, String str2) {
        this.delegate.addConstantHeaders(str, str2);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setHeaders(Supplier<Map<String, String>> supplier) {
        this.delegate.setHeadersSupplier(supplier);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setTrustedCertificates(byte[] bArr) {
        this.delegate.setTrustManagerFromCerts(bArr);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setClientTls(byte[] bArr, byte[] bArr2) {
        this.delegate.setKeyManagerFromCerts(bArr, bArr2);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setSslContext(SSLContext sSLContext, X509TrustManager x509TrustManager) {
        this.delegate.setSslContext(sSLContext, x509TrustManager);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        this.delegate.setRetryPolicy(retryPolicy);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setProxy(ProxyOptions proxyOptions) {
        Objects.requireNonNull(proxyOptions, "proxyOptions");
        this.delegate.setProxyOptions(proxyOptions);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setMeterProvider(final MeterProvider meterProvider) {
        Objects.requireNonNull(meterProvider, "meterProvider");
        setMeterProvider(new Supplier() { // from class: io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return OtlpHttpSpanExporterBuilder.lambda$setMeterProvider$0(MeterProvider.this);
            }
        });
        return this;
    }

    public OtlpHttpSpanExporterBuilder setMeterProvider(Supplier<MeterProvider> supplier) {
        Objects.requireNonNull(supplier, "meterProviderSupplier");
        this.delegate.setMeterProvider(supplier);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setInternalTelemetryVersion(InternalTelemetryVersion internalTelemetryVersion) {
        Objects.requireNonNull(internalTelemetryVersion, "schemaVersion");
        this.delegate.setInternalTelemetryVersion(internalTelemetryVersion);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setMemoryMode(MemoryMode memoryMode) {
        Objects.requireNonNull(memoryMode, "memoryMode");
        this.memoryMode = memoryMode;
        return this;
    }

    public OtlpHttpSpanExporterBuilder setServiceClassLoader(ClassLoader classLoader) {
        Objects.requireNonNull(classLoader, "serviceClassLoader");
        return setComponentLoader(ComponentLoader.forClassLoader(classLoader));
    }

    public OtlpHttpSpanExporterBuilder setComponentLoader(ComponentLoader componentLoader) {
        Objects.requireNonNull(componentLoader, "componentLoader");
        this.delegate.setComponentLoader(componentLoader);
        return this;
    }

    public OtlpHttpSpanExporterBuilder setExecutorService(ExecutorService executorService) {
        Objects.requireNonNull(executorService, "executorService");
        this.delegate.setExecutorService(executorService);
        return this;
    }

    public OtlpHttpSpanExporter build() {
        HttpExporterBuilder<Marshaler> httpExporterBuilder = this.delegate;
        return new OtlpHttpSpanExporter(httpExporterBuilder, httpExporterBuilder.build(), this.memoryMode);
    }
}
