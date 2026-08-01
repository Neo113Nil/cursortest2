package z1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements F1.v {

    /* renamed from: a, reason: collision with root package name */
    public final F1.p f4496a;

    /* renamed from: b, reason: collision with root package name */
    public int f4497b;

    /* renamed from: c, reason: collision with root package name */
    public int f4498c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4499e;

    /* renamed from: f, reason: collision with root package name */
    public int f4500f;

    public r(F1.p pVar) {
        h1.d.e(pVar, "source");
        this.f4496a = pVar;
    }

    @Override // F1.v
    public final F1.x a() {
        return this.f4496a.f265a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // F1.v
    public final long d(F1.f fVar, long j2) {
        int i;
        int l2;
        h1.d.e(fVar, "sink");
        do {
            int i2 = this.f4499e;
            F1.p pVar = this.f4496a;
            if (i2 != 0) {
                long d = pVar.d(fVar, Math.min(8192L, i2));
                if (d == -1) {
                    return -1L;
                }
                this.f4499e -= (int) d;
                return d;
            }
            pVar.r(this.f4500f);
            this.f4500f = 0;
            if ((this.f4498c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = t1.b.r(pVar);
            this.f4499e = r2;
            this.f4497b = r2;
            int i3 = pVar.i() & 255;
            this.f4498c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                F1.i iVar = f.f4442a;
                logger.fine(f.a(true, this.d, this.f4497b, i3, this.f4498c));
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
