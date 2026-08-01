package t1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements z1.v {

    /* renamed from: a, reason: collision with root package name */
    public final z1.p f3821a;

    /* renamed from: b, reason: collision with root package name */
    public int f3822b;

    /* renamed from: c, reason: collision with root package name */
    public int f3823c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3824e;

    /* renamed from: f, reason: collision with root package name */
    public int f3825f;

    public r(z1.p pVar) {
        b1.d.e(pVar, "source");
        this.f3821a = pVar;
    }

    @Override // z1.v
    public final z1.x a() {
        return this.f3821a.f4286a.a();
    }

    @Override // z1.v
    public final long b(z1.f fVar, long j2) {
        int i;
        int l2;
        b1.d.e(fVar, "sink");
        do {
            int i2 = this.f3824e;
            z1.p pVar = this.f3821a;
            if (i2 != 0) {
                long b2 = pVar.b(fVar, Math.min(8192L, i2));
                if (b2 == -1) {
                    return -1L;
                }
                this.f3824e -= (int) b2;
                return b2;
            }
            pVar.r(this.f3825f);
            this.f3825f = 0;
            if ((this.f3823c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = n1.b.r(pVar);
            this.f3824e = r2;
            this.f3822b = r2;
            int i3 = pVar.i() & 255;
            this.f3823c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                z1.i iVar = f.f3771a;
                logger.fine(f.a(true, this.d, this.f3822b, i3, this.f3823c));
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
