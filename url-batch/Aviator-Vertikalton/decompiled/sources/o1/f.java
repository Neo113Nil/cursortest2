package o1;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3738d;

    @Override // o1.a, v1.w
    public final long c(v1.f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (this.f3724b) {
            throw new IllegalStateException("closed");
        }
        if (this.f3738d) {
            return -1L;
        }
        long c2 = super.c(fVar, 8192L);
        if (c2 != -1) {
            return c2;
        }
        this.f3738d = true;
        g();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3724b) {
            return;
        }
        if (!this.f3738d) {
            g();
        }
        this.f3724b = true;
    }
}
