package s3;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z3.C1448f;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: j, reason: collision with root package name */
    public boolean f10608j;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10594e) {
            return;
        }
        if (!this.f10608j) {
            a();
        }
        this.f10594e = true;
    }

    @Override // s3.a, z3.F
    public final long l(C1448f sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        if (this.f10594e) {
            throw new IllegalStateException("closed");
        }
        if (this.f10608j) {
            return -1L;
        }
        long l4 = super.l(sink, j4);
        if (l4 != -1) {
            return l4;
        }
        this.f10608j = true;
        a();
        return -1L;
    }
}
