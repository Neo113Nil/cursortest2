package r1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements x1.v {

    /* renamed from: a, reason: collision with root package name */
    public final x1.p f3600a;

    /* renamed from: b, reason: collision with root package name */
    public int f3601b;

    /* renamed from: c, reason: collision with root package name */
    public int f3602c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3603e;

    /* renamed from: f, reason: collision with root package name */
    public int f3604f;

    public r(x1.p pVar) {
        Z0.d.e(pVar, "source");
        this.f3600a = pVar;
    }

    @Override // x1.v
    public final x1.x a() {
        return this.f3600a.f4254a.a();
    }

    @Override // x1.v
    public final long b(x1.f fVar, long j2) {
        int i;
        int l2;
        Z0.d.e(fVar, "sink");
        do {
            int i2 = this.f3603e;
            x1.p pVar = this.f3600a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3603e -= (int) b2;
                return b2;
            }
            pVar.r(this.f3604f);
            this.f3604f = 0;
            if ((this.f3602c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = l1.b.r(pVar);
            this.f3603e = r2;
            this.f3601b = r2;
            int i3 = pVar.i() & 255;
            this.f3602c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                x1.i iVar = f.f3550a;
                logger.fine(f.a(true, this.d, this.f3601b, i3, this.f3602c));
            }
            l2 = pVar.l() & Integer.MAX_VALUE;
            this.d = l2;
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
