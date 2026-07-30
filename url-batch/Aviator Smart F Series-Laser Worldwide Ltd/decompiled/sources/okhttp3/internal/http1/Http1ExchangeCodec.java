package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.c;
import okio.d;
import okio.e;
import okio.n;
import okio.v0;
import okio.x0;
import okio.y0;

/* loaded from: classes5.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final d sink;
    private final e source;
    private int state;
    private Headers trailers;

    private abstract class AbstractSource implements x0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public AbstractSource(Http1ExchangeCodec this$0) {
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new n(this$0.source.timeout());
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final n getTimeout() {
            return this.timeout;
        }

        @Override // okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            try {
                return this.this$0.source.read(sink, j8);
            } catch (IOException e8) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e8;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state == 6) {
                return;
            }
            if (this.this$0.state != 5) {
                throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(this.this$0.state)));
            }
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 6;
        }

        protected final void setClosed(boolean z7) {
            this.closed = z7;
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.timeout;
        }
    }

    private final class ChunkedSink implements v0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public ChunkedSink(Http1ExchangeCodec this$0) {
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new n(this$0.sink.timeout());
        }

        @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.sink.writeUtf8("0\r\n\r\n");
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // okio.v0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // okio.v0
        public y0 timeout() {
            return this.timeout;
        }

        @Override // okio.v0
        public void write(c source, long j8) {
            s.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j8 == 0) {
                return;
            }
            this.this$0.sink.writeHexadecimalUnsignedLong(j8);
            this.this$0.sink.writeUtf8("\r\n");
            this.this$0.sink.write(source, j8);
            this.this$0.sink.writeUtf8("\r\n");
        }
    }

    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec this$0, HttpUrl url) {
            super(this$0);
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(url, "url");
            this.this$0 = this$0;
            this.url = url;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.readUtf8LineStrict();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.readHexadecimalUnsignedLong();
                String obj = StringsKt__StringsKt.trim((CharSequence) this.this$0.source.readUtf8LineStrict()).toString();
                if (this.bytesRemainingInChunk < 0 || (obj.length() > 0 && !t.startsWith$default(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    s.checkNotNull(okHttpClient);
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    s.checkNotNull(headers);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j9 = this.bytesRemainingInChunk;
            if (j9 == 0 || j9 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long read = super.read(sink, Math.min(j8, this.bytesRemainingInChunk));
            if (read != -1) {
                this.bytesRemainingInChunk -= read;
                return read;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec this$0, long j8) {
            super(this$0);
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.bytesRemaining = j8;
            if (j8 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            long j9 = this.bytesRemaining;
            if (j9 == 0) {
                return -1L;
            }
            long read = super.read(sink, Math.min(j9, j8));
            if (read == -1) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j10 = this.bytesRemaining - read;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
            return read;
        }
    }

    private final class KnownLengthSink implements v0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final n timeout;

        public KnownLengthSink(Http1ExchangeCodec this$0) {
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.timeout = new n(this$0.sink.timeout());
        }

        @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override // okio.v0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override // okio.v0
        public y0 timeout() {
            return this.timeout;
        }

        @Override // okio.v0
        public void write(c source, long j8) {
            s.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            Util.checkOffsetAndCount(source.size(), 0L, j8);
            this.this$0.sink.write(source, j8);
        }
    }

    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec this$0) {
            super(this$0);
            s.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
            }
            if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = super.read(sink, j8);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection connection, e source, d sink) {
        s.checkNotNullParameter(connection, "connection");
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(sink, "sink");
        this.client = okHttpClient;
        this.connection = connection;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(n nVar) {
        y0 delegate = nVar.delegate();
        nVar.setDelegate(y0.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return t.equals("chunked", Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true);
    }

    private final v0 newChunkedSink() {
        int i8 = this.state;
        if (i8 != 1) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.state = 2;
        return new ChunkedSink(this);
    }

    private final x0 newChunkedSource(HttpUrl httpUrl) {
        int i8 = this.state;
        if (i8 != 4) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.state = 5;
        return new ChunkedSource(this, httpUrl);
    }

    private final x0 newFixedLengthSource(long j8) {
        int i8 = this.state;
        if (i8 != 4) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.state = 5;
        return new FixedLengthSource(this, j8);
    }

    private final v0 newKnownLengthSink() {
        int i8 = this.state;
        if (i8 != 1) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.state = 2;
        return new KnownLengthSink(this);
    }

    private final x0 newUnknownLengthSource() {
        int i8 = this.state;
        if (i8 != 4) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.state = 5;
        getConnection().noNewExchanges$okhttp();
        return new UnknownLengthSource(this);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public v0 createRequestBody(Request request, long j8) {
        s.checkNotNullParameter(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j8 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public x0 openResponseBodySource(Response response) {
        s.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        return headersContentLength != -1 ? newFixedLengthSource(headersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z7) {
        int i8 = this.state;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        try {
            StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (z7 && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e8) {
            throw new IOException(s.stringPlus("unexpected end of stream on ", getConnection().route().address().url().redact()), e8);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        s.checkNotNullParameter(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        s.checkNotNullParameter(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        x0 newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String requestLine) {
        s.checkNotNullParameter(headers, "headers");
        s.checkNotNullParameter(requestLine, "requestLine");
        int i8 = this.state;
        if (i8 != 0) {
            throw new IllegalStateException(s.stringPlus("state: ", Integer.valueOf(i8)).toString());
        }
        this.sink.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.sink.writeUtf8(headers.name(i9)).writeUtf8(": ").writeUtf8(headers.value(i9)).writeUtf8("\r\n");
        }
        this.sink.writeUtf8("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        s.checkNotNullParameter(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        s.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return t.equals("chunked", request.header(com.google.common.net.HttpHeaders.TRANSFER_ENCODING), true);
    }
}
