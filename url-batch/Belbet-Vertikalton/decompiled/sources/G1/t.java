package G1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements M1.v {

    /* renamed from: a, reason: collision with root package name */
    public final M1.p f424a;

    /* renamed from: b, reason: collision with root package name */
    public int f425b;

    /* renamed from: c, reason: collision with root package name */
    public int f426c;

    /* renamed from: d, reason: collision with root package name */
    public int f427d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f428f;

    public t(M1.p pVar) {
        j1.h.e(pVar, "source");
        this.f424a = pVar;
    }

    @Override // M1.v
    public final M1.x b() {
        return this.f424a.f846a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // M1.v
    public final long h(M1.f fVar, long j) {
        int i;
        int D2;
        j1.h.e(fVar, "sink");
        do {
            int i2 = this.e;
            M1.p pVar = this.f424a;
            if (i2 != 0) {
                long h2 = pVar.h(fVar, Math.min(8192L, i2));
                if (h2 == -1) {
                    return -1L;
                }
                this.e -= (int) h2;
                return h2;
            }
            pVar.J(this.f428f);
            this.f428f = 0;
            if ((this.f426c & 4) != 0) {
                return -1L;
            }
            i = this.f427d;
            int r2 = A1.c.r(pVar);
            this.e = r2;
            this.f425b = r2;
            int q2 = pVar.q() & 255;
            this.f426c = pVar.q() & 255;
            Logger logger = u.f429d;
            if (logger.isLoggable(Level.FINE)) {
                M1.i iVar = g.f370a;
                logger.fine(g.a(true, this.f427d, this.f425b, q2, this.f426c));
            }
            D2 = pVar.D() & Integer.MAX_VALUE;
            this.f427d = D2;
            if (q2 != 9) {
                throw new IOException(q2 + " != TYPE_CONTINUATION");
            }
        } while (D2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
