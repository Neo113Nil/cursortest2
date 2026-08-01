package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.v {

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f3456a;

    /* renamed from: b, reason: collision with root package name */
    public int f3457b;

    /* renamed from: c, reason: collision with root package name */
    public int f3458c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3459e;

    /* renamed from: f, reason: collision with root package name */
    public int f3460f;

    public r(v1.p pVar) {
        X0.d.e(pVar, "source");
        this.f3456a = pVar;
    }

    @Override // v1.v
    public final v1.x a() {
        return this.f3456a.f4074a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        int i;
        int j3;
        X0.d.e(fVar, "sink");
        do {
            int i2 = this.f3459e;
            v1.p pVar = this.f3456a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3459e -= (int) b2;
                return b2;
            }
            pVar.p(this.f3460f);
            this.f3460f = 0;
            if ((this.f3458c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int q2 = j1.b.q(pVar);
            this.f3459e = q2;
            this.f3457b = q2;
            int g2 = pVar.g() & 255;
            this.f3458c = pVar.g() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                v1.i iVar = f.f3406a;
                logger.fine(f.a(true, this.d, this.f3457b, g2, this.f3458c));
            }
            j3 = pVar.j() & Integer.MAX_VALUE;
            this.d = j3;
            if (g2 != 9) {
                throw new IOException(g2 + " != TYPE_CONTINUATION");
            }
        } while (j3 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
