package k8;

import e8.m;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: x, reason: collision with root package name */
    public boolean f38845x;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38832v) {
            return;
        }
        if (!this.f38845x) {
            a(g.f38846f);
        }
        this.f38832v = true;
    }

    @Override // k8.a, u8.x
    public final long f(long j9, u8.e sink) {
        h.e(sink, "sink");
        if (this.f38832v) {
            throw new IllegalStateException("closed");
        }
        if (this.f38845x) {
            return -1L;
        }
        long f6 = super.f(8192L, sink);
        if (f6 != -1) {
            return f6;
        }
        this.f38845x = true;
        a(m.f37427u);
        return -1L;
    }
}
