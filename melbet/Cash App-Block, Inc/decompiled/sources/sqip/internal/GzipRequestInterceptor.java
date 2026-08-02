package sqip.internal;

import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.RealBufferedSink;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lsqip/internal/GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "()V", "gzip", "Lokhttp3/RequestBody;", "body", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GzipRequestInterceptor implements Interceptor {
    public static final String GZIP_BODY_ENABLED = "X-Square-Gzip: true";
    private static final String GZIP_BODY_HEADER = "X-Square-Gzip";

    private final RequestBody gzip(final RequestBody body) {
        return new RequestBody() { // from class: sqip.internal.GzipRequestInterceptor$gzip$1
            @Override // okhttp3.RequestBody
            public long contentLength() {
                return -1L;
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                RequestBody requestBody = RequestBody.this;
                requestBody.getClass();
                return requestBody.contentType();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                sink.getClass();
                RealBufferedSink realBufferedSink = new RealBufferedSink(new GzipSink(sink));
                RequestBody requestBody = RequestBody.this;
                requestBody.getClass();
                requestBody.writeTo(realBufferedSink);
                realBufferedSink.close();
            }
        };
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        RequestBody requestBody = request.body;
        Headers headers = request.headers;
        if (requestBody == null || headers.get("Content-Encoding") != null || !"true".equals(headers.get(GZIP_BODY_HEADER))) {
            return chain.proceed(request);
        }
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.header("Content-Encoding", "gzip");
        newBuilder.headers.removeAll(GZIP_BODY_HEADER);
        newBuilder.method(request.method, gzip(request.body));
        return chain.proceed(new Request(newBuilder));
    }
}
