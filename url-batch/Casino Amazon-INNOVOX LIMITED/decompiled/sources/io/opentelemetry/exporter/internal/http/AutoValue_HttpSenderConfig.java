package io.opentelemetry.exporter.internal.http;

import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.sdk.common.export.ProxyOptions;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
final class AutoValue_HttpSenderConfig extends HttpSenderConfig {

    @Nullable
    private final Compressor compressor;
    private final long connectTimeoutNanos;
    private final String contentType;
    private final String endpoint;

    @Nullable
    private final ExecutorService executorService;
    private final boolean exportAsJson;
    private final Supplier<Map<String, List<String>>> headersSupplier;

    @Nullable
    private final ProxyOptions proxyOptions;

    @Nullable
    private final RetryPolicy retryPolicy;

    @Nullable
    private final SSLContext sslContext;
    private final long timeoutNanos;

    @Nullable
    private final X509TrustManager trustManager;

    AutoValue_HttpSenderConfig(String str, @Nullable Compressor compressor, boolean z, String str2, long j, long j2, Supplier<Map<String, List<String>>> supplier, @Nullable ProxyOptions proxyOptions, @Nullable RetryPolicy retryPolicy, @Nullable SSLContext sSLContext, @Nullable X509TrustManager x509TrustManager, @Nullable ExecutorService executorService) {
        if (str == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.endpoint = str;
        this.compressor = compressor;
        this.exportAsJson = z;
        if (str2 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str2;
        this.timeoutNanos = j;
        this.connectTimeoutNanos = j2;
        if (supplier == null) {
            throw new NullPointerException("Null headersSupplier");
        }
        this.headersSupplier = supplier;
        this.proxyOptions = proxyOptions;
        this.retryPolicy = retryPolicy;
        this.sslContext = sSLContext;
        this.trustManager = x509TrustManager;
        this.executorService = executorService;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public String getEndpoint() {
        return this.endpoint;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public Compressor getCompressor() {
        return this.compressor;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public boolean getExportAsJson() {
        return this.exportAsJson;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public String getContentType() {
        return this.contentType;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public long getConnectTimeoutNanos() {
        return this.connectTimeoutNanos;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    public Supplier<Map<String, List<String>>> getHeadersSupplier() {
        return this.headersSupplier;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public ProxyOptions getProxyOptions() {
        return this.proxyOptions;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public SSLContext getSslContext() {
        return this.sslContext;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSenderConfig
    @Nullable
    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public String toString() {
        return "HttpSenderConfig{endpoint=" + this.endpoint + ", compressor=" + this.compressor + ", exportAsJson=" + this.exportAsJson + ", contentType=" + this.contentType + ", timeoutNanos=" + this.timeoutNanos + ", connectTimeoutNanos=" + this.connectTimeoutNanos + ", headersSupplier=" + this.headersSupplier + ", proxyOptions=" + this.proxyOptions + ", retryPolicy=" + this.retryPolicy + ", sslContext=" + this.sslContext + ", trustManager=" + this.trustManager + ", executorService=" + this.executorService + "}";
    }

    public boolean equals(Object obj) {
        Compressor compressor;
        ProxyOptions proxyOptions;
        RetryPolicy retryPolicy;
        SSLContext sSLContext;
        X509TrustManager x509TrustManager;
        ExecutorService executorService;
        if (obj == this) {
            return true;
        }
        if (obj instanceof HttpSenderConfig) {
            HttpSenderConfig httpSenderConfig = (HttpSenderConfig) obj;
            if (this.endpoint.equals(httpSenderConfig.getEndpoint()) && ((compressor = this.compressor) != null ? compressor.equals(httpSenderConfig.getCompressor()) : httpSenderConfig.getCompressor() == null) && this.exportAsJson == httpSenderConfig.getExportAsJson() && this.contentType.equals(httpSenderConfig.getContentType()) && this.timeoutNanos == httpSenderConfig.getTimeoutNanos() && this.connectTimeoutNanos == httpSenderConfig.getConnectTimeoutNanos() && this.headersSupplier.equals(httpSenderConfig.getHeadersSupplier()) && ((proxyOptions = this.proxyOptions) != null ? proxyOptions.equals(httpSenderConfig.getProxyOptions()) : httpSenderConfig.getProxyOptions() == null) && ((retryPolicy = this.retryPolicy) != null ? retryPolicy.equals(httpSenderConfig.getRetryPolicy()) : httpSenderConfig.getRetryPolicy() == null) && ((sSLContext = this.sslContext) != null ? sSLContext.equals(httpSenderConfig.getSslContext()) : httpSenderConfig.getSslContext() == null) && ((x509TrustManager = this.trustManager) != null ? x509TrustManager.equals(httpSenderConfig.getTrustManager()) : httpSenderConfig.getTrustManager() == null) && ((executorService = this.executorService) != null ? executorService.equals(httpSenderConfig.getExecutorService()) : httpSenderConfig.getExecutorService() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.endpoint.hashCode() ^ 1000003) * 1000003;
        Compressor compressor = this.compressor;
        int hashCode2 = (((((hashCode ^ (compressor == null ? 0 : compressor.hashCode())) * 1000003) ^ (this.exportAsJson ? 1231 : 1237)) * 1000003) ^ this.contentType.hashCode()) * 1000003;
        long j = this.timeoutNanos;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.connectTimeoutNanos;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.headersSupplier.hashCode()) * 1000003;
        ProxyOptions proxyOptions = this.proxyOptions;
        int hashCode4 = (hashCode3 ^ (proxyOptions == null ? 0 : proxyOptions.hashCode())) * 1000003;
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
