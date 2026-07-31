package G2;

import N2.C0150f;
import Z1.i;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f1597g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1583e) {
            return;
        }
        if (!this.f1597g) {
            a();
        }
        this.f1583e = true;
    }

    @Override // G2.b, N2.F
    public final long l(C0150f c0150f, long j3) {
        i.f(c0150f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f1583e) {
            throw new IllegalStateException("closed");
        }
        if (this.f1597g) {
            return -1L;
        }
        long l3 = super.l(c0150f, j3);
        if (l3 != -1) {
            return l3;
        }
        this.f1597g = true;
        a();
        return -1L;
    }
}
