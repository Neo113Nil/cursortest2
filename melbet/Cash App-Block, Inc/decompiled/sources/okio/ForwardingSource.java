package okio;

/* loaded from: classes3.dex */
public abstract class ForwardingSource implements Source {
    public final Source delegate;

    public ForwardingSource(Source source) {
        source.getClass();
        this.delegate = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j) {
        buffer.getClass();
        return this.delegate.read(buffer, j);
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.delegate.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
