package w1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements C1.v {

    /* renamed from: a, reason: collision with root package name */
    public final C1.p f4151a;

    /* renamed from: b, reason: collision with root package name */
    public int f4152b;

    /* renamed from: c, reason: collision with root package name */
    public int f4153c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4154e;

    /* renamed from: f, reason: collision with root package name */
    public int f4155f;

    public r(C1.p pVar) {
        e1.d.e(pVar, "source");
        this.f4151a = pVar;
    }

    @Override // C1.v
    public final C1.x a() {
        return this.f4151a.f200a.a();
    }

    @Override // C1.v
    public final long b(C1.f fVar, long j2) {
        int i;
        int l2;
        e1.d.e(fVar, "sink");
        do {
            int i2 = this.f4154e;
            C1.p pVar = this.f4151a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f4154e -= (int) b2;
                return b2;
            }
            pVar.r(this.f4155f);
            this.f4155f = 0;
            if ((this.f4153c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = q1.b.r(pVar);
            this.f4154e = r2;
            this.f4152b = r2;
            int i3 = pVar.i() & 255;
            this.f4153c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                C1.i iVar = f.f4101a;
                logger.fine(f.a(true, this.d, this.f4152b, i3, this.f4153c));
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
