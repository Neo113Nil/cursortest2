package okio;

/* loaded from: classes3.dex */
public abstract class ForwardingSink implements Sink {
    public final Sink delegate;

    public ForwardingSink(Sink sink) {
        sink.getClass();
        this.delegate = sink;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.delegate.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) {
        buffer.getClass();
        this.delegate.write(buffer, j);
    }
}
