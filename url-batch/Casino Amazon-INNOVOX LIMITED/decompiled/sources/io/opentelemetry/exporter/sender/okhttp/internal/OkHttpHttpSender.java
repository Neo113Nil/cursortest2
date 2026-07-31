package io.opentelemetry.exporter.sender.okhttp.internal;

import androidx.collection.SieveCacheKt;
import io.opentelemetry.api.internal.InstrumentationUtil;
import io.opentelemetry.exporter.internal.RetryUtil;
import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.http.HttpSender;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.ProxyOptions;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.Okio;

/* loaded from: classes3.dex */
public final class OkHttpHttpSender implements HttpSender {
    private final OkHttpClient client;

    @Nullable
    private final Compressor compressor;
    private final boolean exportAsJson;
    private final Supplier<Map<String, List<String>>> headerSupplier;
    private final boolean managedExecutor;
    private final MediaType mediaType;
    private final HttpUrl url;

    public OkHttpHttpSender(String str, @Nullable Compressor compressor, boolean z, String str2, long j, long j2, Supplier<Map<String, List<String>>> supplier, @Nullable ProxyOptions proxyOptions, @Nullable RetryPolicy retryPolicy, @Nullable SSLContext sSLContext, @Nullable X509TrustManager x509TrustManager, @Nullable ExecutorService executorService) {
        Dispatcher dispatcher;
        int min = (int) Math.min(Duration.ofNanos(j).toMillis(), SieveCacheKt.NodeLinkMask);
        int min2 = (int) Math.min(Duration.ofNanos(j2).toMillis(), SieveCacheKt.NodeLinkMask);
        if (executorService == null) {
            dispatcher = OkHttpUtil.newDispatcher();
            this.managedExecutor = true;
        } else {
            Dispatcher dispatcher2 = new Dispatcher(executorService);
            this.managedExecutor = false;
            dispatcher = dispatcher2;
        }
        OkHttpClient.Builder callTimeout = new OkHttpClient.Builder().dispatcher(dispatcher).connectTimeout(Duration.ofMillis(min2)).callTimeout(Duration.ofMillis(min));
        if (proxyOptions != null) {
            callTimeout.proxySelector(proxyOptions.getProxySelector());
        }
        if (retryPolicy != null) {
            callTimeout.addInterceptor(new RetryInterceptor(retryPolicy, new Function() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(OkHttpHttpSender.isRetryable((Response) obj));
                }
            }));
        }
        if (str.startsWith("http://")) {
            callTimeout.connectionSpecs(Collections.singletonList(ConnectionSpec.CLEARTEXT));
        } else if (sSLContext != null && x509TrustManager != null) {
            callTimeout.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
        }
        this.client = callTimeout.build();
        this.url = HttpUrl.get(str);
        this.compressor = compressor;
        this.exportAsJson = z;
        this.mediaType = MediaType.parse(str2);
        this.headerSupplier = supplier;
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSender
    public void send(Marshaler marshaler, int i, final Consumer<HttpSender.Response> consumer, final Consumer<Throwable> consumer2) {
        final Request.Builder url = new Request.Builder().url(this.url);
        Map<String, List<String>> map = this.headerSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((List) obj2).forEach(new Consumer() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender$$ExternalSyntheticLambda3
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj3) {
                            Request.Builder.this.addHeader(r2, (String) obj3);
                        }
                    });
                }
            });
        }
        RawRequestBody rawRequestBody = new RawRequestBody(marshaler, this.exportAsJson, i, this.mediaType);
        Compressor compressor = this.compressor;
        if (compressor != null) {
            url.addHeader("Content-Encoding", compressor.getEncoding());
            url.post(new CompressedRequestBody(this.compressor, rawRequestBody));
        } else {
            url.post(rawRequestBody);
        }
        InstrumentationUtil.suppressInstrumentation(new Runnable() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OkHttpHttpSender.this.m3940x159843c8(url, consumer2, consumer);
            }
        });
    }

    /* renamed from: lambda$send$2$io-opentelemetry-exporter-sender-okhttp-internal-OkHttpHttpSender, reason: not valid java name */
    /* synthetic */ void m3940x159843c8(Request.Builder builder, final Consumer consumer, final Consumer consumer2) {
        this.client.newCall(builder.build()).enqueue(new Callback() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                consumer.accept(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, final Response response) {
                final ResponseBody body = response.body();
                try {
                    consumer2.accept(new HttpSender.Response() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpHttpSender.1.1

                        @Nullable
                        private byte[] bodyBytes;

                        @Override // io.opentelemetry.exporter.internal.http.HttpSender.Response
                        public int statusCode() {
                            return response.code();
                        }

                        @Override // io.opentelemetry.exporter.internal.http.HttpSender.Response
                        public String statusMessage() {
                            return response.message();
                        }

                        @Override // io.opentelemetry.exporter.internal.http.HttpSender.Response
                        public byte[] responseBody() throws IOException {
                            if (this.bodyBytes == null) {
                                this.bodyBytes = body.bytes();
                            }
                            return this.bodyBytes;
                        }
                    });
                    if (body != null) {
                        body.close();
                    }
                } catch (Throwable th) {
                    if (body != null) {
                        try {
                            body.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }

    @Override // io.opentelemetry.exporter.internal.http.HttpSender
    public CompletableResultCode shutdown() {
        this.client.dispatcher().cancelAll();
        if (this.managedExecutor) {
            this.client.dispatcher().executorService().shutdownNow();
        }
        this.client.connectionPool().evictAll();
        return CompletableResultCode.ofSuccess();
    }

    static boolean isRetryable(Response response) {
        return RetryUtil.retryableHttpResponseCodes().contains(Integer.valueOf(response.code()));
    }

    private static class RawRequestBody extends RequestBody {
        private final int contentLength;
        private final boolean exportAsJson;
        private final Marshaler marshaler;
        private final MediaType mediaType;

        private RawRequestBody(Marshaler marshaler, boolean z, int i, MediaType mediaType) {
            this.marshaler = marshaler;
            this.exportAsJson = z;
            this.contentLength = i;
            this.mediaType = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.mediaType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            if (this.exportAsJson) {
                this.marshaler.writeJsonTo(bufferedSink.outputStream());
            } else {
                this.marshaler.writeBinaryTo(bufferedSink.outputStream());
            }
        }
    }

    private static class CompressedRequestBody extends RequestBody {
        private final Compressor compressor;
        private final RequestBody requestBody;

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        private CompressedRequestBody(Compressor compressor, RequestBody requestBody) {
            this.compressor = compressor;
            this.requestBody = requestBody;
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.requestBody.get$contentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            BufferedSink buffer = Okio.buffer(Okio.sink(this.compressor.compress(bufferedSink.outputStream())));
            this.requestBody.writeTo(buffer);
            buffer.close();
        }
    }
}
