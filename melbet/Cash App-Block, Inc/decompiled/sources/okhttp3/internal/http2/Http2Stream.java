package okhttp3.internal.http2;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes3.dex */
public final class Http2Stream implements Socket {
    public final Http2Connection connection;
    public ErrorCode errorCode;
    public IOException errorException;
    public boolean hasResponseHeaders;
    public final ArrayDeque headersQueue;
    public final int id;
    public final WindowCounter readBytes;
    public final StreamTimeout readTimeout;
    public final FramingSink sink;
    public final FramingSource source;
    public long writeBytesMaximum;
    public long writeBytesTotal;
    public final StreamTimeout writeTimeout;

    public final class FramingSink implements Sink {
        public boolean closed;
        public final boolean finished;
        public final Buffer sendBuffer = new Buffer();

        public FramingSink(boolean z) {
            this.finished = z;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.UTC;
            synchronized (http2Stream) {
                if (this.closed) {
                    return;
                }
                boolean z = http2Stream.getErrorCode$okhttp() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.sink.finished) {
                    if (this.sendBuffer.size > 0) {
                        while (this.sendBuffer.size > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        http2Stream2.connection.writeData(http2Stream2.id, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.connection.writer.flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void emitFrame(boolean z) {
            long min;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.writeTimeout.enter();
                while (http2Stream.writeBytesTotal >= http2Stream.writeBytesMaximum && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        try {
                            http2Stream.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        http2Stream.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.writeTimeout.exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.writeBytesMaximum - http2Stream.writeBytesTotal, this.sendBuffer.size);
                http2Stream.writeBytesTotal += min;
                z2 = z && min == this.sendBuffer.size;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.connection.writeData(http2Stream2.id, z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.UTC;
            synchronized (http2Stream) {
                http2Stream.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.size > 0) {
                emitFrame(false);
                Http2Stream.this.connection.writer.flush();
            }
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            buffer.getClass();
            TimeZone timeZone = _UtilJvmKt.UTC;
            Buffer buffer2 = this.sendBuffer;
            buffer2.write(buffer, j);
            while (buffer2.size >= 16384) {
                emitFrame(false);
            }
        }
    }

    public final class FramingSource implements Source {
        public boolean closed;
        public boolean finished;
        public final long maxByteCount;
        public Headers trailers;
        public final Buffer receiveBuffer = new Buffer();
        public final Buffer readBuffer = new Buffer();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                Buffer buffer = this.readBuffer;
                j = buffer.size;
                buffer.clear();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                TimeZone timeZone = _UtilJvmKt.UTC;
                http2Stream2.connection.updateConnectionFlowControl$okhttp(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:13:0x0027, B:33:0x00c5, B:64:0x00ee, B:65:0x00f3, B:15:0x0030, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:22:0x004f, B:24:0x0053, B:26:0x005d, B:28:0x007a, B:30:0x008b, B:47:0x00a4, B:51:0x00ae, B:54:0x00b4, B:55:0x00c0, B:58:0x00e3, B:59:0x00eb), top: B:5:0x0010, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:15:0x0030, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:22:0x004f, B:24:0x0053, B:26:0x005d, B:28:0x007a, B:30:0x008b, B:47:0x00a4, B:51:0x00ae, B:54:0x00b4, B:55:0x00c0, B:58:0x00e3, B:59:0x00eb), top: B:14:0x0030, outer: #2, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC] */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long read(Buffer buffer, long j) {
            boolean z;
            boolean z2;
            Throwable th;
            long j2;
            long j3;
            buffer.getClass();
            long j4 = 0;
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.connection.getClass();
                    FramingSink framingSink = http2Stream.sink;
                    z = true;
                    try {
                        if (!framingSink.closed && !framingSink.finished) {
                            z2 = false;
                            if (z2) {
                                http2Stream.readTimeout.enter();
                            }
                            if (http2Stream.getErrorCode$okhttp() != null || this.finished) {
                                th = null;
                            } else {
                                th = http2Stream.errorException;
                                if (th == null) {
                                    ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                    errorCode$okhttp.getClass();
                                    th = new StreamResetException(errorCode$okhttp);
                                }
                            }
                            if (!this.closed) {
                                throw new IOException("stream closed");
                            }
                            Buffer buffer2 = this.readBuffer;
                            long j5 = buffer2.size;
                            if (j5 > j4) {
                                j3 = buffer2.read(buffer, Math.min(j, j5));
                                WindowCounter.update$default(http2Stream.readBytes, j3, 0L, 2);
                                long unacknowledged = http2Stream.readBytes.getUnacknowledged();
                                if (th == null) {
                                    j2 = j4;
                                    if (unacknowledged >= http2Stream.connection.okHttpSettings.getInitialWindowSize() / 2) {
                                        http2Stream.connection.writeWindowUpdateLater$okhttp(http2Stream.id, unacknowledged);
                                        WindowCounter.update$default(http2Stream.readBytes, 0L, unacknowledged, 1);
                                    }
                                } else {
                                    j2 = j4;
                                }
                                z = false;
                            } else {
                                j2 = j4;
                                if (this.finished || th != null) {
                                    z = false;
                                } else {
                                    try {
                                        http2Stream.wait();
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                        throw new InterruptedIOException();
                                    }
                                }
                                j3 = -1;
                            }
                        }
                        if (http2Stream.getErrorCode$okhttp() != null) {
                        }
                        th = null;
                        if (!this.closed) {
                        }
                    } finally {
                        if (z2) {
                            http2Stream.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                Http2Stream.this.connection.flowControlListener.getClass();
                if (!z) {
                    if (j3 != -1) {
                        return j3;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j4 = j2;
            }
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public final IOException newTimeoutException(IOException iOException) {
            return new SocketTimeoutException("timeout");
        }

        @Override // okio.AsyncTimeout
        public final void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.connection;
            synchronized (http2Connection) {
                long j = http2Connection.degradedPongsReceived;
                long j2 = http2Connection.degradedPingsSent;
                if (j < j2) {
                    return;
                }
                http2Connection.degradedPingsSent = j2 + 1;
                http2Connection.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
                TaskQueue.execute$default(http2Connection.writerQueue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), http2Connection.connectionName, " ping"), 0L, new Choreographers$$ExternalSyntheticLambda1(http2Connection, 19), 6);
            }
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.id = i;
        this.connection = http2Connection;
        this.readBytes = new WindowCounter(i);
        this.writeBytesMaximum = http2Connection.peerSettings.getInitialWindowSize();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (isLocallyInitiated()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("remotely-initiated streams should have headers");
            throw null;
        }
        if (isLocallyInitiated()) {
            a$$ExternalSyntheticBUOutline0.m$1("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    @Override // okio.Socket
    public final void cancel() {
        closeLater(ErrorCode.CANCEL);
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z;
        boolean isOpen;
        TimeZone timeZone = _UtilJvmKt.UTC;
        synchronized (this) {
            try {
                FramingSource framingSource = this.source;
                if (!framingSource.finished && framingSource.closed) {
                    FramingSink framingSink = this.sink;
                    if (!framingSink.finished) {
                        if (framingSink.closed) {
                        }
                    }
                    z = true;
                    isOpen = isOpen();
                }
                z = false;
                isOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        FramingSink framingSink = this.sink;
        if (framingSink.closed) {
            a$$ExternalSyntheticBUOutline0.m$4("stream closed");
            return;
        }
        if (framingSink.finished) {
            a$$ExternalSyntheticBUOutline0.m$4("stream finished");
            return;
        }
        if (getErrorCode$okhttp() != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode$okhttp = getErrorCode$okhttp();
            errorCode$okhttp.getClass();
            throw new StreamResetException(errorCode$okhttp);
        }
    }

    public final void close(ErrorCode errorCode, IOException iOException) {
        if (closeInternal(errorCode, iOException)) {
            this.connection.writer.rstStream(this.id, errorCode);
        }
    }

    public final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.UTC;
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            if (this.source.finished) {
                if (this.sink.finished) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    @Override // okio.Socket
    public final Sink getSink() {
        return this.sink;
    }

    @Override // okio.Socket
    public final Source getSource() {
        return this.source;
    }

    public final boolean isLocallyInitiated() {
        boolean z = (this.id & 1) == 1;
        this.connection.getClass();
        return true == z;
    }

    public final boolean isOpen() {
        synchronized (this) {
            try {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                FramingSource framingSource = this.source;
                if (!framingSource.finished) {
                    if (framingSource.closed) {
                    }
                    return true;
                }
                FramingSink framingSink = this.sink;
                if (framingSink.finished || framingSink.closed) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:13:0x002c, B:14:0x0030, B:22:0x0023), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void receiveHeaders(Headers headers, boolean z) {
        boolean isOpen;
        headers.getClass();
        TimeZone timeZone = _UtilJvmKt.UTC;
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && headers.get(":status") == null && headers.get(":method") == null) {
                    this.source.trailers = headers;
                    if (z) {
                        this.source.finished = true;
                    }
                    isOpen = isOpen();
                    notifyAll();
                }
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
                if (z) {
                }
                isOpen = isOpen();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }
}
