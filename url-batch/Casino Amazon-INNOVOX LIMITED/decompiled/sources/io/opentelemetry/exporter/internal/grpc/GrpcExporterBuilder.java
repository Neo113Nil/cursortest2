package io.opentelemetry.exporter.internal.grpc;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.internal.ConfigUtil;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.ExporterBuilderUtil;
import io.opentelemetry.exporter.internal.TlsConfigHelper;
import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.compression.CompressorUtil;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import io.opentelemetry.sdk.internal.ComponentId;
import io.opentelemetry.sdk.internal.StandardComponentId;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class GrpcExporterBuilder<T extends Marshaler> {
    public static final long DEFAULT_CONNECT_TIMEOUT_SECS = 10;
    private static final Logger LOGGER = Logger.getLogger(GrpcExporterBuilder.class.getName());

    @Nullable
    private Compressor compressor;
    private URI endpoint;

    @Nullable
    private ExecutorService executorService;
    private final StandardComponentId.ExporterType exporterType;

    @Nullable
    private Object grpcChannel;
    private final String grpcEndpointPath;
    private final Supplier<BiFunction<Channel, String, MarshalerServiceStub<T, ?, ?>>> grpcStubFactory;
    private long timeoutNanos;
    private long connectTimeoutNanos = TimeUnit.SECONDS.toNanos(10);
    private final Map<String, String> constantHeaders = new HashMap();
    private Supplier<Map<String, String>> headerSupplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda1
        @Override // java.util.function.Supplier
        public final Object get() {
            Map emptyMap;
            emptyMap = Collections.emptyMap();
            return emptyMap;
        }
    };
    private TlsConfigHelper tlsConfigHelper = new TlsConfigHelper();

    @Nullable
    private RetryPolicy retryPolicy = RetryPolicy.getDefault();
    private Supplier<MeterProvider> meterProviderSupplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda2
        @Override // java.util.function.Supplier
        public final Object get() {
            MeterProvider meterProvider;
            meterProvider = GlobalOpenTelemetry.getMeterProvider();
            return meterProvider;
        }
    };
    private InternalTelemetryVersion internalTelemetryVersion = InternalTelemetryVersion.LEGACY;
    private ComponentLoader componentLoader = ComponentLoader.forClassLoader(GrpcExporterBuilder.class.getClassLoader());

    public GrpcExporterBuilder(StandardComponentId.ExporterType exporterType, long j, URI uri, Supplier<BiFunction<Channel, String, MarshalerServiceStub<T, ?, ?>>> supplier, String str) {
        this.exporterType = exporterType;
        this.grpcEndpointPath = str;
        this.timeoutNanos = TimeUnit.SECONDS.toNanos(j);
        this.endpoint = uri;
        this.grpcStubFactory = supplier;
    }

    public GrpcExporterBuilder<T> setChannel(ManagedChannel managedChannel) {
        this.grpcChannel = managedChannel;
        return this;
    }

    public GrpcExporterBuilder<T> setTimeout(long j, TimeUnit timeUnit) {
        this.timeoutNanos = j == 0 ? Long.MAX_VALUE : timeUnit.toNanos(j);
        return this;
    }

    public GrpcExporterBuilder<T> setTimeout(Duration duration) {
        return setTimeout(duration.toNanos(), TimeUnit.NANOSECONDS);
    }

    public GrpcExporterBuilder<T> setConnectTimeout(long j, TimeUnit timeUnit) {
        this.connectTimeoutNanos = j == 0 ? Long.MAX_VALUE : timeUnit.toNanos(j);
        return this;
    }

    public GrpcExporterBuilder<T> setEndpoint(String str) {
        this.endpoint = ExporterBuilderUtil.validateEndpoint(str);
        return this;
    }

    public GrpcExporterBuilder<T> setCompression(@Nullable Compressor compressor) {
        this.compressor = compressor;
        return this;
    }

    public GrpcExporterBuilder<T> setCompression(String str) {
        return setCompression(CompressorUtil.validateAndResolveCompressor(str, this.componentLoader));
    }

    public GrpcExporterBuilder<T> setTrustManagerFromCerts(byte[] bArr) {
        this.tlsConfigHelper.setTrustManagerFromCerts(bArr);
        return this;
    }

    public GrpcExporterBuilder<T> setKeyManagerFromCerts(byte[] bArr, byte[] bArr2) {
        this.tlsConfigHelper.setKeyManagerFromCerts(bArr, bArr2);
        return this;
    }

    public GrpcExporterBuilder<T> setSslContext(SSLContext sSLContext, X509TrustManager x509TrustManager) {
        this.tlsConfigHelper.setSslContext(sSLContext, x509TrustManager);
        return this;
    }

    public GrpcExporterBuilder<T> addConstantHeader(String str, String str2) {
        this.constantHeaders.put(str, str2);
        return this;
    }

    public GrpcExporterBuilder<T> setHeadersSupplier(Supplier<Map<String, String>> supplier) {
        this.headerSupplier = supplier;
        return this;
    }

    public GrpcExporterBuilder<T> setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    public GrpcExporterBuilder<T> setMeterProvider(Supplier<MeterProvider> supplier) {
        this.meterProviderSupplier = supplier;
        return this;
    }

    public GrpcExporterBuilder<T> setInternalTelemetryVersion(InternalTelemetryVersion internalTelemetryVersion) {
        this.internalTelemetryVersion = internalTelemetryVersion;
        return this;
    }

    public GrpcExporterBuilder<T> setComponentLoader(ComponentLoader componentLoader) {
        this.componentLoader = componentLoader;
        return this;
    }

    public GrpcExporterBuilder<T> setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public GrpcExporterBuilder<T> copy() {
        GrpcExporterBuilder<T> grpcExporterBuilder = new GrpcExporterBuilder<>(this.exporterType, TimeUnit.NANOSECONDS.toSeconds(this.timeoutNanos), this.endpoint, this.grpcStubFactory, this.grpcEndpointPath);
        grpcExporterBuilder.timeoutNanos = this.timeoutNanos;
        grpcExporterBuilder.connectTimeoutNanos = this.connectTimeoutNanos;
        grpcExporterBuilder.endpoint = this.endpoint;
        grpcExporterBuilder.compressor = this.compressor;
        grpcExporterBuilder.constantHeaders.putAll(this.constantHeaders);
        grpcExporterBuilder.headerSupplier = this.headerSupplier;
        grpcExporterBuilder.tlsConfigHelper = this.tlsConfigHelper.copy();
        RetryPolicy retryPolicy = this.retryPolicy;
        if (retryPolicy != null) {
            grpcExporterBuilder.retryPolicy = retryPolicy.toBuilder().build();
        }
        grpcExporterBuilder.meterProviderSupplier = this.meterProviderSupplier;
        grpcExporterBuilder.internalTelemetryVersion = this.internalTelemetryVersion;
        grpcExporterBuilder.grpcChannel = this.grpcChannel;
        grpcExporterBuilder.componentLoader = this.componentLoader;
        return grpcExporterBuilder;
    }

    public GrpcExporter<T> build() {
        Supplier supplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return GrpcExporterBuilder.this.m3921x512ac1f2();
            }
        };
        boolean equals = "http".equals(this.endpoint.getScheme());
        GrpcSender<T> createSender = resolveGrpcSenderProvider().createSender(GrpcSenderConfig.create(this.endpoint, this.grpcEndpointPath, this.compressor, this.timeoutNanos, this.connectTimeoutNanos, supplier, this.grpcChannel, this.grpcStubFactory, this.retryPolicy, equals ? null : this.tlsConfigHelper.getSslContext(), equals ? null : this.tlsConfigHelper.getTrustManager(), this.executorService));
        LOGGER.log(Level.FINE, "Using GrpcSender: " + createSender.getClass().getName());
        return new GrpcExporter<>(createSender, this.internalTelemetryVersion, ComponentId.generateLazy(this.exporterType), this.meterProviderSupplier, this.endpoint.toString());
    }

    /* renamed from: lambda$build$3$io-opentelemetry-exporter-internal-grpc-GrpcExporterBuilder, reason: not valid java name */
    /* synthetic */ Map m3921x512ac1f2() {
        final HashMap hashMap = new HashMap();
        Map<String, String> map = this.headerSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda7
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    hashMap.put((String) obj, Collections.singletonList((String) obj2));
                }
            });
        }
        this.constantHeaders.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                hashMap.merge((String) obj, Collections.singletonList((String) obj2), new BiFunction() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda6
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return GrpcExporterBuilder.lambda$build$1((List) obj3, (List) obj4);
                    }
                });
            }
        });
        return hashMap;
    }

    static /* synthetic */ List lambda$build$1(List list, List list2) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public String toString(boolean z) {
        StringJoiner stringJoiner;
        if (z) {
            stringJoiner = new StringJoiner(", ", "GrpcExporterBuilder{", "}");
        } else {
            stringJoiner = new StringJoiner(", ");
        }
        stringJoiner.add("endpoint=" + this.endpoint.toString());
        stringJoiner.add("endpointPath=" + this.grpcEndpointPath);
        stringJoiner.add("timeoutNanos=" + this.timeoutNanos);
        stringJoiner.add("connectTimeoutNanos=" + this.connectTimeoutNanos);
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(this.compressor).map(new GrpcExporterBuilder$$ExternalSyntheticLambda3()).orElse(null)));
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        this.constantHeaders.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda4
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                stringJoiner2.add(((String) obj) + "=OBFUSCATED");
            }
        });
        Map<String, String> map = this.headerSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda5
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    stringJoiner2.add(((String) obj) + "=OBFUSCATED");
                }
            });
        }
        stringJoiner.add("headers=" + stringJoiner2);
        if (this.retryPolicy != null) {
            stringJoiner.add("retryPolicy=" + this.retryPolicy);
        }
        if (this.grpcChannel != null) {
            stringJoiner.add("grpcChannel=" + this.grpcChannel);
        }
        stringJoiner.add("componentLoader=" + this.componentLoader);
        if (this.executorService != null) {
            stringJoiner.add("executorService=" + this.executorService);
        }
        stringJoiner.add("exporterType=" + this.exporterType.toString());
        stringJoiner.add("internalTelemetrySchemaVersion=" + this.internalTelemetryVersion);
        return stringJoiner.toString();
    }

    public String toString() {
        return toString(true);
    }

    private GrpcSenderProvider resolveGrpcSenderProvider() {
        HashMap hashMap = new HashMap();
        for (GrpcSenderProvider grpcSenderProvider : this.componentLoader.load(GrpcSenderProvider.class)) {
            hashMap.put(grpcSenderProvider.getClass().getName(), grpcSenderProvider);
        }
        if (hashMap.isEmpty()) {
            throw new IllegalStateException("No GrpcSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-grpc-upstream");
        }
        if (hashMap.size() == 1) {
            return (GrpcSenderProvider) hashMap.values().stream().findFirst().get();
        }
        String string = ConfigUtil.getString("io.opentelemetry.exporter.internal.grpc.GrpcSenderProvider", "");
        if (string.isEmpty()) {
            LOGGER.log(Level.WARNING, "Multiple GrpcSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.grpc.GrpcSenderProvider to the FQCN of the preferred provider.");
            return (GrpcSenderProvider) hashMap.values().stream().findFirst().get();
        }
        if (hashMap.containsKey(string)) {
            return (GrpcSenderProvider) hashMap.get(string);
        }
        throw new IllegalStateException("No GrpcSenderProvider matched configured io.opentelemetry.exporter.internal.grpc.GrpcSenderProvider: " + string);
    }
}
