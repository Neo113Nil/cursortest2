package F1;

import j1.h;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f332d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f320b) {
            return;
        }
        if (!this.f332d) {
            a();
        }
        this.f320b = true;
    }

    @Override // F1.b, M1.v
    public final long h(M1.f fVar, long j) {
        h.e(fVar, "sink");
        if (this.f320b) {
            throw new IllegalStateException("closed");
        }
        if (this.f332d) {
            return -1L;
        }
        long h2 = super.h(fVar, 8192L);
        if (h2 != -1) {
            return h2;
        }
        this.f332d = true;
        a();
        return -1L;
    }
}
