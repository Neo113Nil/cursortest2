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
public abstract class HttpSenderConfig {
    @Nullable
    public abstract Compressor getCompressor();

    public abstract long getConnectTimeoutNanos();

    public abstract String getContentType();

    public abstract String getEndpoint();

    @Nullable
    public abstract ExecutorService getExecutorService();

    public abstract boolean getExportAsJson();

    public abstract Supplier<Map<String, List<String>>> getHeadersSupplier();

    @Nullable
    public abstract ProxyOptions getProxyOptions();

    @Nullable
    public abstract RetryPolicy getRetryPolicy();

    @Nullable
    public abstract SSLContext getSslContext();

    public abstract long getTimeoutNanos();

    @Nullable
    public abstract X509TrustManager getTrustManager();

    public static HttpSenderConfig create(String str, @Nullable Compressor compressor, boolean z, String str2, long j, long j2, Supplier<Map<String, List<String>>> supplier, @Nullable ProxyOptions proxyOptions, @Nullable RetryPolicy retryPolicy, @Nullable SSLContext sSLContext, @Nullable X509TrustManager x509TrustManager, @Nullable ExecutorService executorService) {
        return new AutoValue_HttpSenderConfig(str, compressor, z, str2, j, j2, supplier, proxyOptions, retryPolicy, sSLContext, x509TrustManager, executorService);
    }
}
