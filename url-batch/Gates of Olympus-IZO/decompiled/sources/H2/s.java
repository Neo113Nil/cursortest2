package H2;

import N2.C0150f;
import N2.C0153i;
import N2.F;
import N2.H;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s implements F {

    /* renamed from: d, reason: collision with root package name */
    public final N2.z f2014d;

    /* renamed from: e, reason: collision with root package name */
    public int f2015e;

    /* renamed from: f, reason: collision with root package name */
    public int f2016f;

    /* renamed from: g, reason: collision with root package name */
    public int f2017g;

    /* renamed from: h, reason: collision with root package name */
    public int f2018h;

    /* renamed from: i, reason: collision with root package name */
    public int f2019i;

    public s(N2.z zVar) {
        Z1.i.f(zVar, "source");
        this.f2014d = zVar;
    }

    @Override // N2.F
    public final H c() {
        return this.f2014d.f2973d.c();
    }

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        int i3;
        int j4;
        Z1.i.f(c0150f, "sink");
        do {
            int i4 = this.f2018h;
            N2.z zVar = this.f2014d;
            if (i4 != 0) {
                long l3 = zVar.l(c0150f, Math.min(j3, i4));
                if (l3 == -1) {
                    return -1L;
                }
                this.f2018h -= (int) l3;
                return l3;
            }
            zVar.D(this.f2019i);
            this.f2019i = 0;
            if ((this.f2016f & 4) != 0) {
                return -1L;
            }
            i3 = this.f2017g;
            int s3 = B2.c.s(zVar);
            this.f2018h = s3;
            this.f2015e = s3;
            int e3 = zVar.e() & 255;
            this.f2016f = zVar.e() & 255;
            Logger logger = t.f2020g;
            if (logger.isLoggable(Level.FINE)) {
                C0153i c0153i = g.f1955a;
                logger.fine(g.a(true, this.f2017g, this.f2015e, e3, this.f2016f));
            }
            j4 = zVar.j() & Integer.MAX_VALUE;
            this.f2017g = j4;
            if (e3 != 9) {
                throw new IOException(e3 + " != TYPE_CONTINUATION");
            }
        } while (j4 == i3);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
