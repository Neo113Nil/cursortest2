package y7;

import a0.m;
import f8.f;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: i, reason: collision with root package name */
    public boolean f9930i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9922g) {
            return;
        }
        if (!this.f9930i) {
            b();
        }
        this.f9922g = true;
    }

    @Override // y7.a, f8.g0
    public final long v(long j8, f fVar) {
        k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(m.h(j8, "byteCount < 0: ").toString());
        }
        if (this.f9922g) {
            throw new IllegalStateException("closed");
        }
        if (this.f9930i) {
            return -1L;
        }
        long v5 = super.v(j8, fVar);
        if (v5 != -1) {
            return v5;
        }
        this.f9930i = true;
        b();
        return -1L;
    }
}
