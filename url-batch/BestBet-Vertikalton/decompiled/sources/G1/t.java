package G1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements M1.v {

    /* renamed from: a, reason: collision with root package name */
    public final M1.p f441a;

    /* renamed from: b, reason: collision with root package name */
    public int f442b;

    /* renamed from: c, reason: collision with root package name */
    public int f443c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f444e;

    /* renamed from: f, reason: collision with root package name */
    public int f445f;

    public t(M1.p pVar) {
        k1.e.e(pVar, "source");
        this.f441a = pVar;
    }

    @Override // M1.v
    public final M1.x b() {
        return this.f441a.f817a.b();
    }

    @Override // M1.v
    public final long c(M1.f fVar, long j2) {
        int i;
        int r2;
        k1.e.e(fVar, "sink");
        do {
            int i2 = this.f444e;
            M1.p pVar = this.f441a;
            if (i2 != 0) {
                long c2 = pVar.c(fVar, Math.min(8192L, i2));
                if (c2 == -1) {
                    return -1L;
                }
                this.f444e -= (int) c2;
                return c2;
            }
            pVar.x(this.f445f);
            this.f445f = 0;
            if ((this.f443c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r3 = A1.c.r(pVar);
            this.f444e = r3;
            this.f442b = r3;
            int j3 = pVar.j() & 255;
            this.f443c = pVar.j() & 255;
            Logger logger = u.d;
            if (logger.isLoggable(Level.FINE)) {
                M1.i iVar = g.f386a;
                logger.fine(g.a(true, this.d, this.f442b, j3, this.f443c));
            }
            r2 = pVar.r() & Integer.MAX_VALUE;
            this.d = r2;
            if (j3 != 9) {
                throw new IOException(j3 + " != TYPE_CONTINUATION");
            }
        } while (r2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
