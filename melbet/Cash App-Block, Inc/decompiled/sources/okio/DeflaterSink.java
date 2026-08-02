package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.time.DurationKt;
import okio.internal._ZlibJvmKt;

/* loaded from: classes3.dex */
public final class DeflaterSink implements Sink {
    public boolean closed;
    public final Deflater deflater;
    public final RealBufferedSink sink;

    public DeflaterSink(RealBufferedSink realBufferedSink, Deflater deflater) {
        this.sink = realBufferedSink;
        this.deflater = deflater;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.deflater;
        if (this.closed) {
            return;
        }
        try {
            deflater.finish();
            deflate(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void deflate(boolean z) {
        Segment writableSegment$okio;
        int deflate;
        RealBufferedSink realBufferedSink = this.sink;
        Buffer buffer = realBufferedSink.bufferField;
        while (true) {
            writableSegment$okio = buffer.writableSegment$okio(1);
            byte[] bArr = writableSegment$okio.data;
            int i = writableSegment$okio.limit;
            Deflater deflater = this.deflater;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                writableSegment$okio.limit += deflate;
                buffer.size += deflate;
                realBufferedSink.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.sink.sink.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        DurationKt.checkOffsetAndCount(buffer.size, 0L, j);
        while (true) {
            Deflater deflater = this.deflater;
            if (j <= 0) {
                deflater.setInput(_ZlibJvmKt.EMPTY_BYTE_ARRAY, 0, 0);
                return;
            }
            Segment segment = buffer.head;
            segment.getClass();
            int min = (int) Math.min(j, segment.limit - segment.pos);
            deflater.setInput(segment.data, segment.pos, min);
            deflate(false);
            long j2 = min;
            buffer.size -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j -= j2;
        }
    }
}
