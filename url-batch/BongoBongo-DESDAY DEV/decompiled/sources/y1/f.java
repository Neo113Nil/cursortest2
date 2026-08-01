package y1;

/* loaded from: classes.dex */
public final class f extends a {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4343b) {
            return;
        }
        if (!this.d) {
            g();
        }
        this.f4343b = true;
    }

    @Override // y1.a, F1.v
    public final long d(F1.f fVar, long j2) {
        h1.d.e(fVar, "sink");
        if (this.f4343b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long d = super.d(fVar, 8192L);
        if (d != -1) {
            return d;
        }
        this.d = true;
        g();
        return -1L;
    }
}
