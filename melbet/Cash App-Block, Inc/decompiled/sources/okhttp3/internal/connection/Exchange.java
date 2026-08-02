package okhttp3.internal.connection;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;

/* loaded from: classes3.dex */
public final class Exchange {
    public final Object call;
    public final Object codec;
    public final Object finder;
    public boolean hasFailure;
    public boolean isDuplex;

    public final class RequestBodySink extends ForwardingSink {
        public long bytesReceived;
        public boolean closed;
        public boolean completed;
        public final long contentLength;
        public boolean invokeStartEvent;
        public final boolean isSocket;
        public final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink sink, long j, boolean z) {
            super(sink);
            sink.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = z;
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete$1(null);
            } catch (IOException e) {
                IOException complete$1 = complete$1(e);
                complete$1.getClass();
                throw complete$1;
            }
        }

        public final IOException complete$1(IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, iOException, 4);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                IOException complete$1 = complete$1(e);
                complete$1.getClass();
                throw complete$1;
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public final void write(Buffer buffer, long j) {
            buffer.getClass();
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return;
            }
            long j2 = this.contentLength;
            if (j2 != -1 && this.bytesReceived + j > j2) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j));
            }
            try {
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    ((RealCall) this.this$0.call).eventListener.requestBodyStart((RealCall) this.this$0.call);
                }
                this.delegate.write(buffer, j);
                this.bytesReceived += j;
            } catch (IOException e) {
                IOException complete$1 = complete$1(e);
                complete$1.getClass();
                throw complete$1;
            }
        }
    }

    public final class ResponseBodySource extends ForwardingSource {
        public long bytesReceived;
        public boolean closed;
        public boolean completed;
        public final long contentLength;
        public boolean invokeStartEvent;
        public final boolean isSocket;
        public final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source source, long j, boolean z) {
            super(source);
            source.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        public final IOException complete(IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            if (iOException == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                ((RealCall) this.this$0.call).eventListener.responseBodyStart((RealCall) this.this$0.call);
            }
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, iOException, 8);
        }

        @Override // okio.ForwardingSource, okio.Source
        public final long read(Buffer buffer, long j) {
            buffer.getClass();
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return 0L;
            }
            try {
                long read = this.delegate.read(buffer, j);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    ((RealCall) this.this$0.call).eventListener.responseBodyStart((RealCall) this.this$0.call);
                }
                if (read == -1) {
                    complete(null);
                    return -1L;
                }
                long j2 = this.bytesReceived + read;
                long j3 = this.contentLength;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j2);
                }
                this.bytesReceived = j2;
                if (((ExchangeCodec) this.this$0.codec).isResponseComplete()) {
                    complete(null);
                }
                return read;
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }
    }

    public Exchange(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        context.getClass();
        callback.getClass();
        this.call = context;
        this.finder = str;
        this.codec = callback;
        this.isDuplex = z;
        this.hasFailure = z2;
    }

    public static IOException bodyComplete$default(Exchange exchange, long j, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            exchange.trackFailure(iOException);
        }
        if (z3) {
            EventListener eventListener = ((RealCall) exchange.call).eventListener;
            if (iOException != null) {
                eventListener.requestFailed((RealCall) exchange.call, iOException);
            } else {
                eventListener.requestBodyEnd((RealCall) exchange.call, j);
            }
        }
        if (z2) {
            EventListener eventListener2 = ((RealCall) exchange.call).eventListener;
            if (iOException != null) {
                eventListener2.responseFailed((RealCall) exchange.call, iOException);
            } else {
                eventListener2.responseBodyEnd((RealCall) exchange.call, j);
            }
        }
        return ((RealCall) exchange.call).messageDone$okhttp(exchange, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public RequestBodySink createRequestBody(Request request, boolean z) {
        request.getClass();
        this.isDuplex = z;
        RequestBody requestBody = request.body;
        requestBody.getClass();
        long contentLength = requestBody.contentLength();
        ((RealCall) this.call).eventListener.requestBodyStart((RealCall) this.call);
        return new RequestBodySink(this, ((ExchangeCodec) this.codec).createRequestBody(request, contentLength), contentLength, false);
    }

    public RealConnection getConnection$okhttp() {
        ExchangeCodec.Carrier carrier = ((ExchangeCodec) this.codec).getCarrier();
        RealConnection realConnection = carrier instanceof RealConnection ? (RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        a$$ExternalSyntheticBUOutline0.m$1("no connection for CONNECT tunnels");
        return null;
    }

    public RealResponseBody openResponseBody(Response response) {
        Exchange exchange;
        String str;
        long reportedContentLength;
        try {
            str = response.headers.get("Content-Type");
            if (str == null) {
                str = null;
            }
            reportedContentLength = ((ExchangeCodec) this.codec).reportedContentLength(response);
            exchange = this;
        } catch (IOException e) {
            e = e;
            exchange = this;
        }
        try {
            return new RealResponseBody(str, reportedContentLength, new RealBufferedSource(new ResponseBodySource(exchange, ((ExchangeCodec) this.codec).openResponseBodySource(response), reportedContentLength, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((RealCall) exchange.call).eventListener.responseFailed((RealCall) exchange.call, iOException);
            exchange.trackFailure(iOException);
            throw iOException;
        }
    }

    public Response.Builder readResponseHeaders(boolean z) {
        try {
            Response.Builder readResponseHeaders = ((ExchangeCodec) this.codec).readResponseHeaders(z);
            if (readResponseHeaders == null) {
                return readResponseHeaders;
            }
            readResponseHeaders.exchange = this;
            return readResponseHeaders;
        } catch (IOException e) {
            ((RealCall) this.call).eventListener.responseFailed((RealCall) this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public void trackFailure(IOException iOException) {
        this.hasFailure = true;
        ((ExchangeCodec) this.codec).getCarrier().trackFailure((RealCall) this.call, iOException);
    }

    public MarkwonImpl upgradeToSocket() {
        RealCall realCall = (RealCall) this.call;
        if (realCall.timeoutEarlyExit) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        realCall.timeoutEarlyExit = true;
        realCall.timeout.exit();
        synchronized (realCall) {
            if (realCall.exchange == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.socketSinkOpen || realCall.socketSourceOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (!realCall.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            realCall.responseBodyOpen = false;
            realCall.socketSinkOpen = true;
            realCall.socketSourceOpen = true;
        }
        ExchangeCodec.Carrier carrier = ((ExchangeCodec) this.codec).getCarrier();
        carrier.getClass();
        RealConnection realConnection = (RealConnection) carrier;
        realConnection.javaNetSocket.setSoTimeout(0);
        realConnection.noNewExchanges();
        return new MarkwonImpl(this);
    }

    public void writeRequestHeaders(Request request) {
        request.getClass();
        try {
            ((RealCall) this.call).eventListener.requestHeadersStart((RealCall) this.call);
            ((ExchangeCodec) this.codec).writeRequestHeaders(request);
            ((RealCall) this.call).eventListener.requestHeadersEnd((RealCall) this.call, request);
        } catch (IOException e) {
            ((RealCall) this.call).eventListener.requestFailed((RealCall) this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public Exchange(RealCall realCall, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        exchangeFinder.getClass();
        this.call = realCall;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }
}
