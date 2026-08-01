package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.w {

    /* renamed from: a, reason: collision with root package name */
    public final v1.q f3844a;

    /* renamed from: b, reason: collision with root package name */
    public int f3845b;

    /* renamed from: c, reason: collision with root package name */
    public int f3846c;

    /* renamed from: d, reason: collision with root package name */
    public int f3847d;

    /* renamed from: e, reason: collision with root package name */
    public int f3848e;

    /* renamed from: f, reason: collision with root package name */
    public int f3849f;

    public r(v1.q qVar) {
        X0.f.e(qVar, "source");
        this.f3844a = qVar;
    }

    @Override // v1.w
    public final v1.y a() {
        return this.f3844a.f4505a.a();
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        int i;
        int l2;
        X0.f.e(fVar, "sink");
        do {
            int i2 = this.f3848e;
            v1.q qVar = this.f3844a;
            if (i2 != 0) {
                long c2 = qVar.c(fVar, Math.min(8192L, i2));
                if (c2 == -1) {
                    return -1L;
                }
                this.f3848e -= (int) c2;
                return c2;
            }
            qVar.r(this.f3849f);
            this.f3849f = 0;
            if ((this.f3846c & 4) != 0) {
                return -1L;
            }
            i = this.f3847d;
            int r2 = j1.b.r(qVar);
            this.f3848e = r2;
            this.f3845b = r2;
            int i3 = qVar.i() & 255;
            this.f3846c = qVar.i() & 255;
            Logger logger = s.f3850d;
            if (logger.isLoggable(Level.FINE)) {
                v1.j jVar = f.f3791a;
                logger.fine(f.a(true, this.f3847d, this.f3845b, i3, this.f3846c));
            }
            l2 = qVar.l() & Integer.MAX_VALUE;
            this.f3847d = l2;
            if (i3 != 9) {
                throw new IOException(i3 + " != TYPE_CONTINUATION");
            }
        } while (l2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
