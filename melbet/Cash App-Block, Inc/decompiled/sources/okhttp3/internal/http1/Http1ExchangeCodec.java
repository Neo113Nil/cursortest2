package okhttp3.internal.http1;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.FaultHidingSink;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;
import papa.internal.LaunchTracker;

/* loaded from: classes9.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers TRAILERS_RESPONSE_BODY_TRUNCATED;
    public final ExchangeCodec.Carrier carrier;
    public final OkHttpClient client;
    public final HeadersReader headersReader;
    public final LaunchTracker socket;
    public int state;
    public Headers trailers;

    public abstract class AbstractSource implements Source {
        public boolean closed;
        public final /* synthetic */ Http1ExchangeCodec this$0;
        public final ForwardingTimeout timeout;
        public final HttpUrl url;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.timeout = new ForwardingTimeout(((RealBufferedSource) http1ExchangeCodec.socket.lastAppBecameInvisibleRealtimeMillis).source.timeout());
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
            buffer.getClass();
            try {
                return ((RealBufferedSource) http1ExchangeCodec.socket.lastAppBecameInvisibleRealtimeMillis).read(buffer, j);
            } catch (IOException e) {
                http1ExchangeCodec.carrier.noNewExchanges();
                this.responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw e;
            }
        }

        public final void responseBodyComplete(Headers headers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            headers.getClass();
            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
            int i = http1ExchangeCodec.state;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                JWK$$ExternalSyntheticBUOutline0.m(http1ExchangeCodec.state, "state: ");
                return;
            }
            ForwardingTimeout forwardingTimeout = this.timeout;
            Timeout timeout = forwardingTimeout.delegate;
            forwardingTimeout.delegate = Timeout.NONE;
            timeout.clearDeadline();
            timeout.clearTimeout();
            http1ExchangeCodec.trailers = headers;
            http1ExchangeCodec.state = 6;
            if (headers.size() <= 0 || (okHttpClient = http1ExchangeCodec.client) == null || (cookieJar = okHttpClient.cookieJar) == null) {
                return;
            }
            HttpHeaders.receiveHeaders(cookieJar, this.url, headers);
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return this.timeout;
        }
    }

    public final class ChunkedSink implements Sink {
        public boolean closed;
        public final ForwardingTimeout timeout;

        public ChunkedSink() {
            this.timeout = new ForwardingTimeout(((RealBufferedSink) Http1ExchangeCodec.this.socket.launchInProgress).sink.timeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ((RealBufferedSink) Http1ExchangeCodec.this.socket.launchInProgress).writeUtf8("0\r\n\r\n");
            ForwardingTimeout forwardingTimeout = this.timeout;
            Timeout timeout = forwardingTimeout.delegate;
            forwardingTimeout.delegate = Timeout.NONE;
            timeout.clearDeadline();
            timeout.clearTimeout();
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public final synchronized void flush() {
            if (this.closed) {
                return;
            }
            ((RealBufferedSink) Http1ExchangeCodec.this.socket.launchInProgress).flush();
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return this.timeout;
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            buffer.getClass();
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return;
            }
            if (j == 0) {
                return;
            }
            RealBufferedSink realBufferedSink = (RealBufferedSink) Http1ExchangeCodec.this.socket.launchInProgress;
            if (realBufferedSink.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return;
            }
            realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
            realBufferedSink.emitCompleteSegments();
            realBufferedSink.writeUtf8("\r\n");
            realBufferedSink.write(buffer, j);
            realBufferedSink.writeUtf8("\r\n");
        }
    }

    public final class ChunkedSource extends AbstractSource {
        public long bytesRemainingInChunk;
        public boolean hasMoreChunks;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks) {
                TimeZone timeZone = _UtilJvmKt.UTC;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    z = _UtilJvmKt.skipAll(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    this.this$0.carrier.noNewExchanges();
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                }
            }
            this.closed = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
        
            if (r12.hasMoreChunks == false) goto L31;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(Buffer buffer, long j) {
            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
            LaunchTracker launchTracker = http1ExchangeCodec.socket;
            buffer.getClass();
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return 0L;
            }
            if (this.hasMoreChunks) {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        ((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis).readUtf8LineStrict(Long.MAX_VALUE);
                    }
                    try {
                        this.bytesRemainingInChunk = ((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis).readHexadecimalUnsignedLong();
                        String obj = StringsKt.trim(((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis).readUtf8LineStrict(Long.MAX_VALUE)).toString();
                        if (this.bytesRemainingInChunk < 0 || (obj.length() > 0 && !StringsKt__StringsJVMKt.startsWith(obj, ";", false))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
                        }
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            HeadersReader headersReader = http1ExchangeCodec.headersReader;
                            headersReader.getClass();
                            Headers.Builder builder = new Headers.Builder();
                            while (true) {
                                String readUtf8LineStrict = ((BufferedSource) headersReader.source).readUtf8LineStrict(headersReader.headerLimit);
                                headersReader.headerLimit -= readUtf8LineStrict.length();
                                if (readUtf8LineStrict.length() == 0) {
                                    break;
                                }
                                builder.addLenient$okhttp(readUtf8LineStrict);
                            }
                            responseBodyComplete(builder.build());
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(buffer, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                http1ExchangeCodec.carrier.noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw protocolException;
            }
            return -1L;
        }
    }

    public final class FixedLengthSource extends AbstractSource {
        public long bytesRemaining;
        public final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z;
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0) {
                TimeZone timeZone = _UtilJvmKt.UTC;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    z = _UtilJvmKt.skipAll(this, 100);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    this.this$0.carrier.noNewExchanges();
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                }
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long read(Buffer buffer, long j) {
            buffer.getClass();
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return 0L;
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(buffer, Math.min(j2, j));
            if (read == -1) {
                this.this$0.carrier.noNewExchanges();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw protocolException;
            }
            long j3 = this.bytesRemaining - read;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
            return read;
        }
    }

    public final class UnknownLengthSource extends AbstractSource {
        public boolean inputExhausted;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.Source
        public final long read(Buffer buffer, long j) {
            buffer.getClass();
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return 0L;
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = super.read(buffer, j);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            responseBodyComplete(Headers.EMPTY);
            return -1L;
        }
    }

    static {
        Headers headers = Headers.EMPTY;
        TRAILERS_RESPONSE_BODY_TRUNCATED = TuplesKt.of("OkHttp-Response-Body", "Truncated");
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, LaunchTracker launchTracker) {
        launchTracker.getClass();
        this.client = okHttpClient;
        this.carrier = carrier;
        this.socket = launchTracker;
        this.headersReader = new HeadersReader((RealBufferedSource) launchTracker.lastAppBecameInvisibleRealtimeMillis);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.carrier.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Sink createRequestBody(Request request, long j) {
        request.getClass();
        RequestBody requestBody = request.body;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.headers.get("Transfer-Encoding"))) {
            if (this.state == 1) {
                this.state = 2;
                return new ChunkedSink();
            }
            Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
            return null;
        }
        if (j == -1) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.state == 1) {
            this.state = 2;
            return new FaultHidingSink(this);
        }
        Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        ((RealBufferedSink) this.socket.launchInProgress).flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        ((RealBufferedSink) this.socket.launchInProgress).flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean isResponseComplete() {
        return this.state == 6;
    }

    public final FixedLengthSource newFixedLengthSource(HttpUrl httpUrl, long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Source openResponseBodySource(Response response) {
        boolean promisesBody = HttpHeaders.promisesBody(response);
        Request request = response.request;
        if (!promisesBody) {
            return newFixedLengthSource(request.url, 0L);
        }
        String str = response.headers.get("Transfer-Encoding");
        if (str == null) {
            str = null;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            HttpUrl httpUrl = request.url;
            if (this.state == 4) {
                this.state = 5;
                return new ChunkedSource(this, httpUrl);
            }
            Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
            return null;
        }
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(request.url, headersContentLength);
        }
        HttpUrl httpUrl2 = request.url;
        if (this.state != 4) {
            Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
            return null;
        }
        this.state = 5;
        this.carrier.noNewExchanges();
        httpUrl2.getClass();
        return new UnknownLengthSource(this, httpUrl2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Headers peekTrailers() {
        Headers headers = this.trailers;
        if (headers == TRAILERS_RESPONSE_BODY_TRUNCATED) {
            a$$ExternalSyntheticBUOutline0.m$4("Trailers cannot be read because the response body was truncated");
            return null;
        }
        int i = this.state;
        if (i == 5 || i == 6) {
            return headers;
        }
        Path$$ExternalSyntheticBUOutline0.m(this.state, "Trailers cannot be read because the state is ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder readResponseHeaders(boolean z) {
        HeadersReader headersReader = this.headersReader;
        int i = this.state;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
            return null;
        }
        try {
            String readUtf8LineStrict = ((BufferedSource) headersReader.source).readUtf8LineStrict(headersReader.headerLimit);
            headersReader.headerLimit -= readUtf8LineStrict.length();
            StatusLine parse = TuplesKt.parse(readUtf8LineStrict);
            int i2 = parse.code;
            Response.Builder builder = new Response.Builder();
            builder.protocol = (Protocol) parse.protocol;
            builder.code = i2;
            builder.message = (String) parse.message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String readUtf8LineStrict2 = ((BufferedSource) headersReader.source).readUtf8LineStrict(headersReader.headerLimit);
                headersReader.headerLimit -= readUtf8LineStrict2.length();
                if (readUtf8LineStrict2.length() == 0) {
                    break;
                }
                builder2.addLenient$okhttp(readUtf8LineStrict2);
            }
            builder.headers = builder2.build().newBuilder();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.state = 3;
                return builder;
            }
            if (102 > i2 || i2 >= 200) {
                this.state = 4;
                return builder;
            }
            this.state = 3;
            return builder;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.carrier.getRoute().address.url.redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(Response response) {
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        String str = response.headers.get("Transfer-Encoding");
        if (str == null) {
            str = null;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            return -1L;
        }
        return _UtilJvmKt.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        FixedLengthSource newFixedLengthSource = newFixedLengthSource(response.request.url, headersContentLength);
        _UtilJvmKt.skipAll(newFixedLengthSource, Integer.MAX_VALUE);
        newFixedLengthSource.close();
    }

    public final void writeRequest(Headers headers, String str) {
        headers.getClass();
        if (this.state != 0) {
            Path$$ExternalSyntheticBUOutline0.m(this.state, "state: ");
            return;
        }
        LaunchTracker launchTracker = this.socket;
        RealBufferedSink realBufferedSink = (RealBufferedSink) launchTracker.launchInProgress;
        realBufferedSink.writeUtf8(str);
        realBufferedSink.writeUtf8("\r\n");
        int size = headers.size();
        int i = 0;
        while (true) {
            RealBufferedSink realBufferedSink2 = (RealBufferedSink) launchTracker.launchInProgress;
            if (i >= size) {
                realBufferedSink2.writeUtf8("\r\n");
                this.state = 1;
                return;
            } else {
                realBufferedSink2.writeUtf8(headers.name(i));
                realBufferedSink2.writeUtf8(": ");
                realBufferedSink2.writeUtf8(headers.value(i));
                realBufferedSink2.writeUtf8("\r\n");
                i++;
            }
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(Request request) {
        request.getClass();
        Proxy.Type type2 = this.carrier.getRoute().proxy.type();
        type2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method);
        sb.append(' ');
        HttpUrl httpUrl = request.url;
        if (httpUrl.isHttps() || type2 != Proxy.Type.HTTP) {
            String encodedPath = httpUrl.encodedPath();
            String encodedQuery = httpUrl.encodedQuery();
            if (encodedQuery != null) {
                encodedPath = encodedPath + '?' + encodedQuery;
            }
            sb.append(encodedPath);
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        writeRequest(request.headers, sb.toString());
    }
}
