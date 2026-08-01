package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.w {

    /* renamed from: a, reason: collision with root package name */
    public final v1.q f3848a;

    /* renamed from: b, reason: collision with root package name */
    public int f3849b;

    /* renamed from: c, reason: collision with root package name */
    public int f3850c;

    /* renamed from: d, reason: collision with root package name */
    public int f3851d;

    /* renamed from: e, reason: collision with root package name */
    public int f3852e;

    /* renamed from: f, reason: collision with root package name */
    public int f3853f;

    public r(v1.q qVar) {
        X0.f.e(qVar, "source");
        this.f3848a = qVar;
    }

    @Override // v1.w
    public final v1.y a() {
        return this.f3848a.f4509a.a();
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        int i;
        int l2;
        X0.f.e(fVar, "sink");
        do {
            int i2 = this.f3852e;
            v1.q qVar = this.f3848a;
            if (i2 != 0) {
                long c2 = qVar.c(fVar, Math.min(8192L, i2));
                if (c2 == -1) {
                    return -1L;
                }
                this.f3852e -= (int) c2;
                return c2;
            }
            qVar.r(this.f3853f);
            this.f3853f = 0;
            if ((this.f3850c & 4) != 0) {
                return -1L;
            }
            i = this.f3851d;
            int r2 = j1.b.r(qVar);
            this.f3852e = r2;
            this.f3849b = r2;
            int i3 = qVar.i() & 255;
            this.f3850c = qVar.i() & 255;
            Logger logger = s.f3854d;
            if (logger.isLoggable(Level.FINE)) {
                v1.j jVar = f.f3795a;
                logger.fine(f.a(true, this.f3851d, this.f3849b, i3, this.f3850c));
            }
            l2 = qVar.l() & Integer.MAX_VALUE;
            this.f3851d = l2;
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
