package s1;

/* loaded from: classes.dex */
public final class f extends a {
    public boolean d;

    @Override // s1.a, z1.v
    public final long b(z1.f fVar, long j2) {
        b1.d.e(fVar, "sink");
        if (this.f3767b) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        long b2 = super.b(fVar, 8192L);
        if (b2 != -1) {
            return b2;
        }
        this.d = true;
        g();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3767b) {
            return;
        }
        if (!this.d) {
            g();
        }
        this.f3767b = true;
    }
}
