package M2;

import T2.C0231f;
import f2.j;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f3497g;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3483e) {
            return;
        }
        if (!this.f3497g) {
            a();
        }
        this.f3483e = true;
    }

    @Override // M2.b, T2.F
    public final long f(C0231f c0231f, long j3) {
        j.f(c0231f, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f3483e) {
            throw new IllegalStateException("closed");
        }
        if (this.f3497g) {
            return -1L;
        }
        long f3 = super.f(c0231f, j3);
        if (f3 != -1) {
            return f3;
        }
        this.f3497g = true;
        a();
        return -1L;
    }
}
