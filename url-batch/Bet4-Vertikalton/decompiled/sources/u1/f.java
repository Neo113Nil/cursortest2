package u1;

/* loaded from: classes.dex */
public final class f extends a {
    public boolean d;

    @Override // u1.a, B1.v
    public final long c(B1.f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (this.f3818b) {
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
        g();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3818b) {
            return;
        }
        if (!this.d) {
            g();
        }
        this.f3818b = true;
    }
}
