package okio;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class s implements x0 {
    private final InputStream input;
    private final y0 timeout;

    public s(InputStream input, y0 timeout) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    @Override // okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (j8 == 0) {
            return 0L;
        }
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        try {
            this.timeout.throwIfReached();
            t0 writableSegment$okio = sink.writableSegment$okio(1);
            int read = this.input.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j8, 8192 - writableSegment$okio.limit));
            if (read != -1) {
                writableSegment$okio.limit += read;
                long j9 = read;
                sink.setSize$okio(sink.size() + j9);
                return j9;
            }
            if (writableSegment$okio.pos != writableSegment$okio.limit) {
                return -1L;
            }
            sink.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
            return -1L;
        } catch (AssertionError e8) {
            if (j0.isAndroidGetsocknameError(e8)) {
                throw new IOException(e8);
            }
            throw e8;
        }
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
