package p1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements v1.v {

    /* renamed from: a, reason: collision with root package name */
    public final v1.p f3472a;

    /* renamed from: b, reason: collision with root package name */
    public int f3473b;

    /* renamed from: c, reason: collision with root package name */
    public int f3474c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3475e;

    /* renamed from: f, reason: collision with root package name */
    public int f3476f;

    public r(v1.p pVar) {
        X0.d.e(pVar, "source");
        this.f3472a = pVar;
    }

    @Override // v1.v
    public final v1.x a() {
        return this.f3472a.f4090a.a();
    }

    @Override // v1.v
    public final long b(v1.f fVar, long j2) {
        int i;
        int j3;
        X0.d.e(fVar, "sink");
        do {
            int i2 = this.f3475e;
            v1.p pVar = this.f3472a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3475e -= (int) b2;
                return b2;
            }
            pVar.p(this.f3476f);
            this.f3476f = 0;
            if ((this.f3474c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int q2 = j1.b.q(pVar);
            this.f3475e = q2;
            this.f3473b = q2;
            int g2 = pVar.g() & 255;
            this.f3474c = pVar.g() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                v1.i iVar = f.f3422a;
                logger.fine(f.a(true, this.d, this.f3473b, g2, this.f3474c));
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
