package io.opentelemetry.exporter.internal.http;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.internal.ConfigUtil;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.common.ComponentLoader;
import io.opentelemetry.exporter.internal.ExporterBuilderUtil;
import io.opentelemetry.exporter.internal.TlsConfigHelper;
import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.compression.CompressorUtil;
import io.opentelemetry.exporter.internal.grpc.GrpcExporterBuilder$$ExternalSyntheticLambda3;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.InternalTelemetryVersion;
import io.opentelemetry.sdk.common.export.ProxyOptions;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import io.opentelemetry.sdk.internal.ComponentId;
import io.opentelemetry.sdk.internal.StandardComponentId;
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
public final class HttpExporterBuilder<T extends Marshaler> {
    public static final long DEFAULT_CONNECT_TIMEOUT_SECS = 10;
    public static final long DEFAULT_TIMEOUT_SECS = 10;
    private static final Logger LOGGER = Logger.getLogger(HttpExporterBuilder.class.getName());

    @Nullable
    private Compressor compressor;
    private String endpoint;

    @Nullable
    private ExecutorService executorService;
    private StandardComponentId.ExporterType exporterType;

    @Nullable
    private ProxyOptions proxyOptions;
    private long timeoutNanos = TimeUnit.SECONDS.toNanos(10);
    private long connectTimeoutNanos = TimeUnit.SECONDS.toNanos(10);
    private boolean exportAsJson = false;
    private final Map<String, String> constantHeaders = new HashMap();
    private Supplier<Map<String, String>> headerSupplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda3
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
    private Supplier<MeterProvider> meterProviderSupplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda4
        @Override // java.util.function.Supplier
        public final Object get() {
            MeterProvider meterProvider;
            meterProvider = GlobalOpenTelemetry.getMeterProvider();
            return meterProvider;
        }
    };
    private InternalTelemetryVersion internalTelemetryVersion = InternalTelemetryVersion.LEGACY;
    private ComponentLoader componentLoader = ComponentLoader.forClassLoader(HttpExporterBuilder.class.getClassLoader());

    public HttpExporterBuilder(StandardComponentId.ExporterType exporterType, String str) {
        this.exporterType = exporterType;
        this.endpoint = str;
    }

    public HttpExporterBuilder<T> setTimeout(long j, TimeUnit timeUnit) {
        this.timeoutNanos = j == 0 ? Long.MAX_VALUE : timeUnit.toNanos(j);
        return this;
    }

    public HttpExporterBuilder<T> setConnectTimeout(long j, TimeUnit timeUnit) {
        this.connectTimeoutNanos = j == 0 ? Long.MAX_VALUE : timeUnit.toNanos(j);
        return this;
    }

    public HttpExporterBuilder<T> setEndpoint(String str) {
        this.endpoint = ExporterBuilderUtil.validateEndpoint(str).toString();
        return this;
    }

    public HttpExporterBuilder<T> setCompression(@Nullable Compressor compressor) {
        this.compressor = compressor;
        return this;
    }

    public HttpExporterBuilder<T> setCompression(String str) {
        return setCompression(CompressorUtil.validateAndResolveCompressor(str, this.componentLoader));
    }

    public HttpExporterBuilder<T> addConstantHeaders(String str, String str2) {
        this.constantHeaders.put(str, str2);
        return this;
    }

    public HttpExporterBuilder<T> setHeadersSupplier(Supplier<Map<String, String>> supplier) {
        this.headerSupplier = supplier;
        return this;
    }

    public HttpExporterBuilder<T> setTrustManagerFromCerts(byte[] bArr) {
        this.tlsConfigHelper.setTrustManagerFromCerts(bArr);
        return this;
    }

    public HttpExporterBuilder<T> setKeyManagerFromCerts(byte[] bArr, byte[] bArr2) {
        this.tlsConfigHelper.setKeyManagerFromCerts(bArr, bArr2);
        return this;
    }

    public HttpExporterBuilder<T> setSslContext(SSLContext sSLContext, X509TrustManager x509TrustManager) {
        this.tlsConfigHelper.setSslContext(sSLContext, x509TrustManager);
        return this;
    }

    public HttpExporterBuilder<T> setMeterProvider(Supplier<MeterProvider> supplier) {
        this.meterProviderSupplier = supplier;
        return this;
    }

    public HttpExporterBuilder<T> setInternalTelemetryVersion(InternalTelemetryVersion internalTelemetryVersion) {
        this.internalTelemetryVersion = internalTelemetryVersion;
        return this;
    }

    public HttpExporterBuilder<T> setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    public HttpExporterBuilder<T> setProxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    public HttpExporterBuilder<T> setComponentLoader(ComponentLoader componentLoader) {
        this.componentLoader = componentLoader;
        return this;
    }

    public HttpExporterBuilder<T> setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public HttpExporterBuilder<T> exportAsJson() {
        this.exportAsJson = true;
        this.exporterType = mapToJsonTypeIfPossible(this.exporterType);
        return this;
    }

    /* renamed from: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType;

        static {
            int[] iArr = new int[StandardComponentId.ExporterType.values().length];
            $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType = iArr;
            try {
                iArr[StandardComponentId.ExporterType.OTLP_HTTP_SPAN_EXPORTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_LOG_EXPORTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[StandardComponentId.ExporterType.OTLP_HTTP_METRIC_EXPORTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static StandardComponentId.ExporterType mapToJsonTypeIfPossible(StandardComponentId.ExporterType exporterType) {
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$internal$StandardComponentId$ExporterType[exporterType.ordinal()];
        if (i == 1) {
            return StandardComponentId.ExporterType.OTLP_HTTP_JSON_SPAN_EXPORTER;
        }
        if (i != 2) {
            return i != 3 ? exporterType : StandardComponentId.ExporterType.OTLP_HTTP_JSON_METRIC_EXPORTER;
        }
        return StandardComponentId.ExporterType.OTLP_HTTP_JSON_LOG_EXPORTER;
    }

    public HttpExporterBuilder<T> copy() {
        HttpExporterBuilder<T> httpExporterBuilder = new HttpExporterBuilder<>(this.exporterType, this.endpoint);
        httpExporterBuilder.endpoint = this.endpoint;
        httpExporterBuilder.timeoutNanos = this.timeoutNanos;
        httpExporterBuilder.connectTimeoutNanos = this.connectTimeoutNanos;
        httpExporterBuilder.exportAsJson = this.exportAsJson;
        httpExporterBuilder.compressor = this.compressor;
        httpExporterBuilder.constantHeaders.putAll(this.constantHeaders);
        httpExporterBuilder.headerSupplier = this.headerSupplier;
        httpExporterBuilder.tlsConfigHelper = this.tlsConfigHelper.copy();
        RetryPolicy retryPolicy = this.retryPolicy;
        if (retryPolicy != null) {
            httpExporterBuilder.retryPolicy = retryPolicy.toBuilder().build();
        }
        httpExporterBuilder.meterProviderSupplier = this.meterProviderSupplier;
        httpExporterBuilder.internalTelemetryVersion = this.internalTelemetryVersion;
        httpExporterBuilder.proxyOptions = this.proxyOptions;
        httpExporterBuilder.componentLoader = this.componentLoader;
        return httpExporterBuilder;
    }

    public HttpExporter<T> build() {
        Supplier supplier = new Supplier() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda7
            @Override // java.util.function.Supplier
            public final Object get() {
                return HttpExporterBuilder.this.m3925xad48c7b2();
            }
        };
        boolean startsWith = this.endpoint.startsWith("http://");
        HttpSenderProvider resolveHttpSenderProvider = resolveHttpSenderProvider();
        String str = this.endpoint;
        Compressor compressor = this.compressor;
        boolean z = this.exportAsJson;
        HttpSender createSender = resolveHttpSenderProvider.createSender(HttpSenderConfig.create(str, compressor, z, z ? "application/json" : "application/x-protobuf", this.timeoutNanos, this.connectTimeoutNanos, supplier, this.proxyOptions, this.retryPolicy, startsWith ? null : this.tlsConfigHelper.getSslContext(), startsWith ? null : this.tlsConfigHelper.getTrustManager(), this.executorService));
        LOGGER.log(Level.FINE, "Using HttpSender: " + createSender.getClass().getName());
        return new HttpExporter<>(ComponentId.generateLazy(this.exporterType), createSender, this.meterProviderSupplier, this.internalTelemetryVersion, this.endpoint);
    }

    /* renamed from: lambda$build$3$io-opentelemetry-exporter-internal-http-HttpExporterBuilder, reason: not valid java name */
    /* synthetic */ Map m3925xad48c7b2() {
        final HashMap hashMap = new HashMap();
        Map<String, String> map = this.headerSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda5
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    hashMap.put((String) obj, Collections.singletonList((String) obj2));
                }
            });
        }
        this.constantHeaders.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                hashMap.merge((String) obj, Collections.singletonList((String) obj2), new BiFunction() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return HttpExporterBuilder.lambda$build$1((List) obj3, (List) obj4);
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
            stringJoiner = new StringJoiner(", ", "HttpExporterBuilder{", "}");
        } else {
            stringJoiner = new StringJoiner(", ");
        }
        stringJoiner.add("endpoint=" + this.endpoint);
        stringJoiner.add("timeoutNanos=" + this.timeoutNanos);
        stringJoiner.add("proxyOptions=" + this.proxyOptions);
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(this.compressor).map(new GrpcExporterBuilder$$ExternalSyntheticLambda3()).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.connectTimeoutNanos);
        stringJoiner.add("exportAsJson=" + this.exportAsJson);
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        this.constantHeaders.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                stringJoiner2.add(((String) obj) + "=OBFUSCATED");
            }
        });
        Map<String, String> map = this.headerSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.http.HttpExporterBuilder$$ExternalSyntheticLambda2
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
        stringJoiner.add("componentLoader=" + this.componentLoader);
        if (this.executorService != null) {
            stringJoiner.add("executorService=" + this.executorService);
        }
        stringJoiner.add("exporterType=" + this.exporterType);
        stringJoiner.add("internalTelemetrySchemaVersion=" + this.internalTelemetryVersion);
        return stringJoiner.toString();
    }

    public String toString() {
        return toString(true);
    }

    private HttpSenderProvider resolveHttpSenderProvider() {
        HashMap hashMap = new HashMap();
        for (HttpSenderProvider httpSenderProvider : this.componentLoader.load(HttpSenderProvider.class)) {
            hashMap.put(httpSenderProvider.getClass().getName(), httpSenderProvider);
        }
        if (hashMap.isEmpty()) {
            throw new IllegalStateException("No HttpSenderProvider found on classpath. Please add dependency on opentelemetry-exporter-sender-okhttp or opentelemetry-exporter-sender-jdk");
        }
        if (hashMap.size() == 1) {
            return (HttpSenderProvider) hashMap.values().stream().findFirst().get();
        }
        String string = ConfigUtil.getString("io.opentelemetry.exporter.internal.http.HttpSenderProvider", "");
        if (string.isEmpty()) {
            LOGGER.log(Level.WARNING, "Multiple HttpSenderProvider found. Please include only one, or specify preference setting io.opentelemetry.exporter.internal.http.HttpSenderProvider to the FQCN of the preferred provider.");
            return (HttpSenderProvider) hashMap.values().stream().findFirst().get();
        }
        if (hashMap.containsKey(string)) {
            return (HttpSenderProvider) hashMap.get(string);
        }
        throw new IllegalStateException("No HttpSenderProvider matched configured io.opentelemetry.exporter.internal.http.HttpSenderProvider: " + string);
    }
}
