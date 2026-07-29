package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.u {

    /* renamed from: a, reason: collision with root package name */
    public final v1.o f3451a;

    /* renamed from: b, reason: collision with root package name */
    public int f3452b;

    /* renamed from: c, reason: collision with root package name */
    public int f3453c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3454e;

    /* renamed from: f, reason: collision with root package name */
    public int f3455f;

    public r(v1.o oVar) {
        X0.e.e(oVar, "source");
        this.f3451a = oVar;
    }

    @Override // v1.u
    public final v1.w a() {
        return this.f3451a.f4068a.a();
    }

    @Override // v1.u
    public final long b(v1.f fVar, long j2) {
        int i;
        int j3;
        X0.e.e(fVar, "sink");
        do {
            int i2 = this.f3454e;
            v1.o oVar = this.f3451a;
            if (i2 != 0) {
                long b2 = oVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3454e -= (int) b2;
                return b2;
            }
            oVar.p(this.f3455f);
            this.f3455f = 0;
            if ((this.f3453c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int q2 = j1.b.q(oVar);
            this.f3454e = q2;
            this.f3452b = q2;
            int g2 = oVar.g() & 255;
            this.f3453c = oVar.g() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                v1.i iVar = f.f3401a;
                logger.fine(f.a(true, this.d, this.f3452b, g2, this.f3453c));
            }
            j3 = oVar.j() & Integer.MAX_VALUE;
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
