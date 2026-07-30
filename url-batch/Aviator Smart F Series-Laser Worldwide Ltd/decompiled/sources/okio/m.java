package okio;

/* loaded from: classes5.dex */
public abstract class m implements x0 {
    private final x0 delegate;

    public m(x0 delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final x0 m1456deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final x0 delegate() {
        return this.delegate;
    }

    @Override // okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j8);
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }
}
