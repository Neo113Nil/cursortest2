package o1;

/* loaded from: classes.dex */
public final class f extends a {
    public boolean d;

    @Override // o1.a, v1.u
    public final long b(v1.f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (this.f3343b) {
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
        e();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3343b) {
            return;
        }
        if (!this.d) {
            e();
        }
        this.f3343b = true;
    }
}
