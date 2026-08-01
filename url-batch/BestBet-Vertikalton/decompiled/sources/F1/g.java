package F1;

/* loaded from: classes.dex */
public final class g extends b {
    public boolean d;

    @Override // F1.b, M1.v
    public final long c(M1.f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (this.f272b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long c2 = super.c(fVar, 8192L);
        if (c2 != -1) {
            return c2;
        }
        this.d = true;
        a();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f272b) {
            return;
        }
        if (!this.d) {
            a();
        }
        this.f272b = true;
    }
}
