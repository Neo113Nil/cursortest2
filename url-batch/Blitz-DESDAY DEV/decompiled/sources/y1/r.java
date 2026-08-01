package y1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements E1.v {

    /* renamed from: a, reason: collision with root package name */
    public final E1.p f4266a;

    /* renamed from: b, reason: collision with root package name */
    public int f4267b;

    /* renamed from: c, reason: collision with root package name */
    public int f4268c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4269e;

    /* renamed from: f, reason: collision with root package name */
    public int f4270f;

    public r(E1.p pVar) {
        g1.d.e(pVar, "source");
        this.f4266a = pVar;
    }

    @Override // E1.v
    public final E1.x a() {
        return this.f4266a.f220a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // E1.v
    public final long d(E1.f fVar, long j2) {
        int i;
        int l2;
        g1.d.e(fVar, "sink");
        do {
            int i2 = this.f4269e;
            E1.p pVar = this.f4266a;
            if (i2 != 0) {
                long d = pVar.d(fVar, Math.min(8192L, i2));
                if (d == -1) {
                    return -1L;
                }
                this.f4269e -= (int) d;
                return d;
            }
            pVar.r(this.f4270f);
            this.f4270f = 0;
            if ((this.f4268c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = s1.b.r(pVar);
            this.f4269e = r2;
            this.f4267b = r2;
            int i3 = pVar.i() & 255;
            this.f4268c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                E1.i iVar = f.f4216a;
                logger.fine(f.a(true, this.d, this.f4267b, i3, this.f4268c));
            }
            l2 = pVar.l() & Integer.MAX_VALUE;
            this.d = l2;
            if (i3 != 9) {
                throw new IOException(i3 + " != TYPE_CONTINUATION");
            }
        } while (l2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
