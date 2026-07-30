package okio;

/* loaded from: classes5.dex */
final class b implements v0 {
    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.v0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.v0
    public y0 timeout() {
        return y0.NONE;
    }

    @Override // okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        source.skip(j8);
    }
}
