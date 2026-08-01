package x1;

/* loaded from: classes.dex */
public final class f extends a {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4147b) {
            return;
        }
        if (!this.d) {
            g();
        }
        this.f4147b = true;
    }

    @Override // x1.a, E1.v
    public final long d(E1.f fVar, long j2) {
        g1.d.e(fVar, "sink");
        if (this.f4147b) {
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
