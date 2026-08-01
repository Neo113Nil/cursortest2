package i3;

import p3.f;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: i, reason: collision with root package name */
    public boolean f2113i;

    @Override // i3.a, p3.v
    public final long c(long j4, f fVar) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        if (this.f2113i) {
            return -1L;
        }
        long c = super.c(8192L, fVar);
        if (c != -1) {
            return c;
        }
        this.f2113i = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        if (!this.f2113i) {
            m();
        }
        this.g = true;
    }
}
