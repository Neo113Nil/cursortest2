package M3;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1776d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1762b) {
            return;
        }
        if (!this.f1776d) {
            a();
        }
        this.f1762b = true;
    }

    @Override // M3.a, T3.v
    public final long j(T3.g sink, long j4) {
        i.e(sink, "sink");
        if (this.f1762b) {
            throw new IllegalStateException("closed");
        }
        if (this.f1776d) {
            return -1L;
        }
        long j5 = super.j(sink, 8192L);
        if (j5 != -1) {
            return j5;
        }
        this.f1776d = true;
        a();
        return -1L;
    }
}
