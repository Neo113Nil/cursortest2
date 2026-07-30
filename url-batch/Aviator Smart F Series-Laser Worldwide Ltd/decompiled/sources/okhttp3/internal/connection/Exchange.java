package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.s;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.c;
import okio.j0;
import okio.l;
import okio.m;
import okio.v0;
import okio.x0;

/* loaded from: classes5.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;

    private final class RequestBodySink extends l {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange this$0, v0 delegate, long j8) {
            super(delegate);
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(delegate, "delegate");
            this.this$0 = this$0;
            this.contentLength = j8;
        }

        private final <E extends IOException> E complete(E e8) {
            if (this.completed) {
                return e8;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e8);
        }

        @Override // okio.l, okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j8 = this.contentLength;
            if (j8 != -1 && this.bytesReceived != j8) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e8) {
                throw complete(e8);
            }
        }

        @Override // okio.l, okio.v0, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e8) {
                throw complete(e8);
            }
        }

        @Override // okio.l, okio.v0
        public void write(c source, long j8) {
            s.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            long j9 = this.contentLength;
            if (j9 == -1 || this.bytesReceived + j8 <= j9) {
                try {
                    super.write(source, j8);
                    this.bytesReceived += j8;
                    return;
                } catch (IOException e8) {
                    throw complete(e8);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j8));
        }
    }

    public final class ResponseBodySource extends m {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange this$0, x0 delegate, long j8) {
            super(delegate);
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(delegate, "delegate");
            this.this$0 = this$0;
            this.contentLength = j8;
            this.invokeStartEvent = true;
            if (j8 == 0) {
                complete(null);
            }
        }

        @Override // okio.m, okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e8) {
                throw complete(e8);
            }
        }

        public final <E extends IOException> E complete(E e8) {
            if (this.completed) {
                return e8;
            }
            this.completed = true;
            if (e8 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e8);
        }

        @Override // okio.m, okio.x0
        public long read(c sink, long j8) {
            s.checkNotNullParameter(sink, "sink");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long read = delegate().read(sink, j8);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (read == -1) {
                    complete(null);
                    return -1L;
                }
                long j9 = this.bytesReceived + read;
                long j10 = this.contentLength;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j9);
                }
                this.bytesReceived = j9;
                if (j9 == j10) {
                    complete(null);
                }
                return read;
            } catch (IOException e8) {
                throw complete(e8);
            }
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(eventListener, "eventListener");
        s.checkNotNullParameter(finder, "finder");
        s.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j8, boolean z7, boolean z8, E e8) {
        if (e8 != null) {
            trackFailure(e8);
        }
        if (z8) {
            if (e8 != null) {
                this.eventListener.requestFailed(this.call, e8);
            } else {
                this.eventListener.requestBodyEnd(this.call, j8);
            }
        }
        if (z7) {
            if (e8 != null) {
                this.eventListener.responseFailed(this.call, e8);
            } else {
                this.eventListener.responseBodyEnd(this.call, j8);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z8, z7, e8);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final v0 createRequestBody(Request request, boolean z7) {
        s.checkNotNullParameter(request, "request");
        this.isDuplex = z7;
        RequestBody body = request.body();
        s.checkNotNull(body);
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() {
        try {
            this.codec.finishRequest();
        } catch (IOException e8) {
            this.eventListener.requestFailed(this.call, e8);
            trackFailure(e8);
            throw e8;
        }
    }

    public final void flushRequest() {
        try {
            this.codec.flushRequest();
        } catch (IOException e8) {
            this.eventListener.requestFailed(this.call, e8);
            trackFailure(e8);
            throw e8;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !s.areEqual(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response response) {
        s.checkNotNullParameter(response, "response");
        try {
            String header$default = Response.header$default(response, "Content-Type", null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(header$default, reportedContentLength, j0.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), reportedContentLength)));
        } catch (IOException e8) {
            this.eventListener.responseFailed(this.call, e8);
            trackFailure(e8);
            throw e8;
        }
    }

    public final Response.Builder readResponseHeaders(boolean z7) {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z7);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (IOException e8) {
            this.eventListener.responseFailed(this.call, e8);
            trackFailure(e8);
            throw e8;
        }
    }

    public final void responseHeadersEnd(Response response) {
        s.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) {
        s.checkNotNullParameter(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e8) {
            this.eventListener.requestFailed(this.call, e8);
            trackFailure(e8);
            throw e8;
        }
    }
}
