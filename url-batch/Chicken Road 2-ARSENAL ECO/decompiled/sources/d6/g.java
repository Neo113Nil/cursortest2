package d6;

import X5.n;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: j, reason: collision with root package name */
    public boolean f3987j;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3974h) {
            return;
        }
        if (!this.f3987j) {
            a(h.f3988f);
        }
        this.f3974h = true;
    }

    @Override // d6.b, n6.w
    public final long i(long j4, n6.f fVar) {
        if (this.f3974h) {
            throw new IllegalStateException("closed");
        }
        if (this.f3987j) {
            return -1L;
        }
        long i7 = super.i(8192L, fVar);
        if (i7 != -1) {
            return i7;
        }
        this.f3987j = true;
        a(n.f2972g);
        return -1L;
    }
}
