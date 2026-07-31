package io.opentelemetry.exporter.sender.okhttp.internal;

import androidx.collection.SieveCacheKt;
import io.opentelemetry.api.internal.InstrumentationUtil;
import io.opentelemetry.exporter.internal.RetryUtil;
import io.opentelemetry.exporter.internal.compression.Compressor;
import io.opentelemetry.exporter.internal.grpc.GrpcResponse;
import io.opentelemetry.exporter.internal.grpc.GrpcSender;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
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
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class OkHttpGrpcSender<T extends Marshaler> implements GrpcSender<T> {
    private static final String GRPC_MESSAGE = "grpc-message";
    private static final String GRPC_STATUS = "grpc-status";
    private final OkHttpClient client;

    @Nullable
    private final Compressor compressor;
    private final Supplier<Map<String, List<String>>> headersSupplier;
    private final boolean managedExecutor;
    private final HttpUrl url;

    public OkHttpGrpcSender(String str, @Nullable Compressor compressor, long j, long j2, Supplier<Map<String, List<String>>> supplier, @Nullable RetryPolicy retryPolicy, @Nullable SSLContext sSLContext, @Nullable X509TrustManager x509TrustManager, @Nullable ExecutorService executorService) {
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
        OkHttpClient.Builder connectTimeout = new OkHttpClient.Builder().dispatcher(dispatcher).callTimeout(Duration.ofMillis(min)).connectTimeout(Duration.ofMillis(min2));
        if (retryPolicy != null) {
            connectTimeout.addInterceptor(new RetryInterceptor(retryPolicy, new Function() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpGrpcSender$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(OkHttpGrpcSender.isRetryable((Response) obj));
                }
            }));
        }
        if (str.startsWith("http://")) {
            connectTimeout.connectionSpecs(Collections.singletonList(ConnectionSpec.CLEARTEXT));
            connectTimeout.protocols(Collections.singletonList(Protocol.H2_PRIOR_KNOWLEDGE));
        } else {
            connectTimeout.protocols(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1));
            if (sSLContext != null && x509TrustManager != null) {
                connectTimeout.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
            }
        }
        this.client = connectTimeout.build();
        this.headersSupplier = supplier;
        this.url = HttpUrl.get(str);
        this.compressor = compressor;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSender
    public void send(T t, final Consumer<GrpcResponse> consumer, final Consumer<Throwable> consumer2) {
        final Request.Builder url = new Request.Builder().url(this.url);
        Map<String, List<String>> map = this.headersSupplier.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpGrpcSender$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((List) obj2).forEach(new Consumer() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpGrpcSender$$ExternalSyntheticLambda3
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj3) {
                            Request.Builder.this.addHeader(r2, (String) obj3);
                        }
                    });
                }
            });
        }
        url.addHeader("te", "trailers");
        Compressor compressor = this.compressor;
        if (compressor != null) {
            url.addHeader("grpc-encoding", compressor.getEncoding());
        }
        url.post(new GrpcRequestBody(t, this.compressor));
        InstrumentationUtil.suppressInstrumentation(new Runnable() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpGrpcSender$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OkHttpGrpcSender.this.m3939xa9903ede(url, consumer2, consumer);
            }
        });
    }

    /* renamed from: lambda$send$2$io-opentelemetry-exporter-sender-okhttp-internal-OkHttpGrpcSender, reason: not valid java name */
    /* synthetic */ void m3939xa9903ede(Request.Builder builder, final Consumer consumer, final Consumer consumer2) {
        this.client.newCall(builder.build()).enqueue(new Callback() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpGrpcSender.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                consumer.accept(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                int i;
                try {
                    response.body().bytes();
                    String grpcStatus = OkHttpGrpcSender.grpcStatus(response);
                    String grpcMessage = OkHttpGrpcSender.grpcMessage(response);
                    try {
                        i = Integer.parseInt(grpcStatus);
                    } catch (NumberFormatException unused) {
                        i = 2;
                    }
                    consumer2.accept(GrpcResponse.create(i, grpcMessage));
                } catch (IOException e) {
                    consumer.accept(new RuntimeException("Could not consume server response", e));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String grpcStatus(Response response) {
        String header = response.header(GRPC_STATUS);
        if (header != null) {
            return header;
        }
        try {
            return response.trailers().get(GRPC_STATUS);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String grpcMessage(Response response) {
        String header = response.header(GRPC_MESSAGE);
        if (header == null) {
            try {
                header = response.trailers().get(GRPC_MESSAGE);
            } catch (IOException unused) {
            }
        }
        if (header != null) {
            return unescape(header);
        }
        return response.message();
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcSender
    public CompletableResultCode shutdown() {
        this.client.dispatcher().cancelAll();
        if (this.managedExecutor) {
            this.client.dispatcher().executorService().shutdownNow();
        }
        this.client.connectionPool().evictAll();
        return CompletableResultCode.ofSuccess();
    }

    public static boolean isRetryable(Response response) {
        String header = response.header(GRPC_STATUS);
        if (header == null) {
            return false;
        }
        return RetryUtil.retryableGrpcStatusCodes().contains(header);
    }

    private static String unescape(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt >= '~' || (charAt == '%' && i + 2 < str.length())) {
                return doUnescape(str.getBytes(StandardCharsets.US_ASCII));
            }
        }
        return str;
    }

    private static String doUnescape(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] == 37 && i + 2 < bArr.length) {
                try {
                    allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, StandardCharsets.UTF_8), 16));
                    i += 3;
                } catch (NumberFormatException unused) {
                }
            }
            allocate.put(bArr[i]);
            i++;
        }
        return new String(allocate.array(), 0, allocate.position(), StandardCharsets.UTF_8);
    }
}
