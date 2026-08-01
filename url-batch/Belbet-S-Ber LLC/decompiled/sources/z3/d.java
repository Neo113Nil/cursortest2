package z3;

import g4.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends a {
    public boolean i;

    @Override // z3.a, g4.v
    public final long c(long j2, f fVar) {
        if (this.f4151g) {
            throw new IllegalStateException("closed");
        }
        if (this.i) {
            return -1L;
        }
        long c5 = super.c(8192L, fVar);
        if (c5 != -1) {
            return c5;
        }
        this.i = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4151g) {
            return;
        }
        if (!this.i) {
            m();
        }
        this.f4151g = true;
    }
}
