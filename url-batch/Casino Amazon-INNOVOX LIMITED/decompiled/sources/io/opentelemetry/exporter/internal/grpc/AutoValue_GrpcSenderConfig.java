package io.opentelemetry.exporter.internal.grpc;

import io.grpc.Channel;
import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
final class AutoValue_GrpcSenderConfig<T extends Marshaler> extends GrpcSenderConfig<T> {

    @Nullable
    private final Compressor compressor;
    private final long connectTimeoutNanos;
    private final URI endpoint;
    private final String endpointPath;

    @Nullable
    private final ExecutorService executorService;
    private final Supplier<Map<String, List<String>>> headersSupplier;

    @Nullable
    private final Object managedChannel;

    @Nullable
    private final RetryPolicy retryPolicy;

    @Nullable
    private final SSLContext sslContext;
    private final Supplier<BiFunction<Channel, String, MarshalerServiceStub<T, ?, ?>>> stubFactory;
    private final long timeoutNanos;

    @Nullable
    private final X509TrustManager trustManager;

    AutoValue_GrpcSenderConfig(URI uri, String str, @Nullable Compressor compressor, long j, long j2, Supplier<Map<String, List<String>>> supplier, @Nullable Object obj, Supplier<BiFunction<Channel, String, MarshalerServiceStub<T, ?, ?>>> supplier2, @Nullable RetryPolicy retryPolicy, @Nullable SSLContext sSLContext, @Nullable X509TrustManager x509TrustManager, @Nullable ExecutorService executorService) {
        if (uri == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.endpoint = uri;
        if (str == null) {
            throw new NullPointerException("Null endpointPath");
        }
        this.endpointPath = str;
        this.compressor = compressor;
        this.timeoutNanos = j;
        this.connectTimeoutNanos = j2;
        if (supplier == null) {
            throw new NullPointerException("Null headersSupplier");
        }
        this.headersSupplier = supplier;
        this.managedChannel = obj;
        if (supplier2 == null) {
            throw new NullPointerException("Null stubFactory");
        }
        this.stubFactory = supplier2;
        this.retryPolicy = retryPolicy;
        this.sslContext = sSLContext;
        this.trustManager = x509TrustManager;
        this.executorService = executorService;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public URI getEndpoint() {
        return this.endpoint;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public String getEndpointPath() {
        return this.endpointPath;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public Compressor getCompressor() {
        return this.compressor;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public long getConnectTimeoutNanos() {
        return this.connectTimeoutNanos;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public Supplier<Map<String, List<String>>> getHeadersSupplier() {
        return this.headersSupplier;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public Object getManagedChannel() {
        return this.managedChannel;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    public Supplier<BiFunction<Channel, String, MarshalerServiceStub<T, ?, ?>>> getStubFactory() {
        return this.stubFactory;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public SSLContext getSslContext() {
        return this.sslContext;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSenderConfig
    @Nullable
    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public String toString() {
        return "GrpcSenderConfig{endpoint=" + this.endpoint + ", endpointPath=" + this.endpointPath + ", compressor=" + this.compressor + ", timeoutNanos=" + this.timeoutNanos + ", connectTimeoutNanos=" + this.connectTimeoutNanos + ", headersSupplier=" + this.headersSupplier + ", managedChannel=" + this.managedChannel + ", stubFactory=" + this.stubFactory + ", retryPolicy=" + this.retryPolicy + ", sslContext=" + this.sslContext + ", trustManager=" + this.trustManager + ", executorService=" + this.executorService + "}";
    }

    public boolean equals(Object obj) {
        Compressor compressor;
        Object obj2;
        RetryPolicy retryPolicy;
        SSLContext sSLContext;
        X509TrustManager x509TrustManager;
        ExecutorService executorService;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GrpcSenderConfig) {
            GrpcSenderConfig grpcSenderConfig = (GrpcSenderConfig) obj;
            if (this.endpoint.equals(grpcSenderConfig.getEndpoint()) && this.endpointPath.equals(grpcSenderConfig.getEndpointPath()) && ((compressor = this.compressor) != null ? compressor.equals(grpcSenderConfig.getCompressor()) : grpcSenderConfig.getCompressor() == null) && this.timeoutNanos == grpcSenderConfig.getTimeoutNanos() && this.connectTimeoutNanos == grpcSenderConfig.getConnectTimeoutNanos() && this.headersSupplier.equals(grpcSenderConfig.getHeadersSupplier()) && ((obj2 = this.managedChannel) != null ? obj2.equals(grpcSenderConfig.getManagedChannel()) : grpcSenderConfig.getManagedChannel() == null) && this.stubFactory.equals(grpcSenderConfig.getStubFactory()) && ((retryPolicy = this.retryPolicy) != null ? retryPolicy.equals(grpcSenderConfig.getRetryPolicy()) : grpcSenderConfig.getRetryPolicy() == null) && ((sSLContext = this.sslContext) != null ? sSLContext.equals(grpcSenderConfig.getSslContext()) : grpcSenderConfig.getSslContext() == null) && ((x509TrustManager = this.trustManager) != null ? x509TrustManager.equals(grpcSenderConfig.getTrustManager()) : grpcSenderConfig.getTrustManager() == null) && ((executorService = this.executorService) != null ? executorService.equals(grpcSenderConfig.getExecutorService()) : grpcSenderConfig.getExecutorService() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.endpoint.hashCode() ^ 1000003) * 1000003) ^ this.endpointPath.hashCode()) * 1000003;
        Compressor compressor = this.compressor;
        int hashCode2 = compressor == null ? 0 : compressor.hashCode();
        long j = this.timeoutNanos;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.connectTimeoutNanos;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.headersSupplier.hashCode()) * 1000003;
        Object obj = this.managedChannel;
        int hashCode4 = (((hashCode3 ^ (obj == null ? 0 : obj.hashCode())) * 1000003) ^ this.stubFactory.hashCode()) * 1000003;
        RetryPolicy retryPolicy = this.retryPolicy;
        int hashCode5 = (hashCode4 ^ (retryPolicy == null ? 0 : retryPolicy.hashCode())) * 1000003;
        SSLContext sSLContext = this.sslContext;
        int hashCode6 = (hashCode5 ^ (sSLContext == null ? 0 : sSLContext.hashCode())) * 1000003;
        X509TrustManager x509TrustManager = this.trustManager;
        int hashCode7 = (hashCode6 ^ (x509TrustManager == null ? 0 : x509TrustManager.hashCode())) * 1000003;
        ExecutorService executorService = this.executorService;
        return hashCode7 ^ (executorService != null ? executorService.hashCode() : 0);
    }
}
