package okio;

/* loaded from: classes3.dex */
public final class BlackholeSink implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        buffer.skip(j);
    }
}
