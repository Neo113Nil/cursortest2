package okio;

/* loaded from: classes5.dex */
public abstract class l implements v0 {
    private final v0 delegate;

    public l(v0 delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final v0 m1455deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final v0 delegate() {
        return this.delegate;
    }

    @Override // okio.v0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.v0
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

    @Override // okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        this.delegate.write(source, j8);
    }
}
