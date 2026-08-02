package okio;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        sink.getClass();
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Sink sink = this.sink;
        if (this.closed) {
            return;
        }
        try {
            Buffer buffer = this.bufferField;
            long j = buffer.size;
            if (j > 0) {
                sink.write(buffer, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final BufferedSink emit() {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        Buffer buffer = this.bufferField;
        long j = buffer.size;
        if (j > 0) {
            this.sink.write(buffer, j);
        }
        return this;
    }

    public final BufferedSink emitCompleteSegments() {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        Buffer buffer = this.bufferField;
        long completeSegmentByteCount = buffer.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(buffer, completeSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        Buffer buffer = this.bufferField;
        long j = buffer.size;
        Sink sink = this.sink;
        if (j > 0) {
            sink.write(buffer, j);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.sink.timeout();
    }

    public final String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] bArr) {
        bArr.getClass();
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.write(bArr, 0, bArr.length);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final long writeAll(Source source) {
        source.getClass();
        long j = 0;
        while (true) {
            long read = source.read(this.bufferField, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.m4335writeByte(i);
        emitCompleteSegments();
        return this;
    }

    public final BufferedSink writeDecimalLong(long j) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.writeDecimalLong(j);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.m4336writeInt(i);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeIntLe(int i) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.m4336writeInt(DurationKt.reverseBytes(i));
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLongLe(long j) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.writeLong(DurationKt.reverseBytes(j));
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.m4337writeShort(i);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String str) {
        str.getClass();
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        this.bufferField.m4339writeUtf8(str);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(int i, int i2, String str) {
        str.getClass();
        if (!this.closed) {
            this.bufferField.m4338writeUtf8(i, i2, str);
            emitCompleteSegments();
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return null;
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        if (!this.closed) {
            this.bufferField.write(buffer, j);
            emitCompleteSegments();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(ByteString byteString) {
        byteString.getClass();
        if (!this.closed) {
            this.bufferField.m4333write(byteString);
            emitCompleteSegments();
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.closed) {
            int write = this.bufferField.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return 0;
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(int i, int i2, byte[] bArr) {
        bArr.getClass();
        if (!this.closed) {
            this.bufferField.write(bArr, i, i2);
            emitCompleteSegments();
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return null;
    }
}
