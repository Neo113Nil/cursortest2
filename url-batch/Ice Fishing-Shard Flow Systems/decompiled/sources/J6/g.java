package J6;

import D6.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f1409m;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1396i) {
            return;
        }
        if (!this.f1409m) {
            a(h.f1410f);
        }
        this.f1396i = true;
    }

    @Override // J6.b, T6.w
    public final long o(long j, T6.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f1396i) {
            throw new IllegalStateException("closed");
        }
        if (this.f1409m) {
            return -1L;
        }
        long o7 = super.o(8192L, sink);
        if (o7 != -1) {
            return o7;
        }
        this.f1409m = true;
        a(q.f552e);
        return -1L;
    }
}
