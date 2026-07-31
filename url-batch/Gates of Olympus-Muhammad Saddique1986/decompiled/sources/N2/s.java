package N2;

import T2.C0231f;
import T2.C0234i;
import T2.F;
import T2.H;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s implements F {

    /* renamed from: d, reason: collision with root package name */
    public final T2.z f3671d;

    /* renamed from: e, reason: collision with root package name */
    public int f3672e;

    /* renamed from: f, reason: collision with root package name */
    public int f3673f;

    /* renamed from: g, reason: collision with root package name */
    public int f3674g;

    /* renamed from: h, reason: collision with root package name */
    public int f3675h;

    /* renamed from: i, reason: collision with root package name */
    public int f3676i;

    public s(T2.z zVar) {
        f2.j.f(zVar, "source");
        this.f3671d = zVar;
    }

    @Override // T2.F
    public final H c() {
        return this.f3671d.f4453d.c();
    }

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        int i3;
        int h3;
        f2.j.f(c0231f, "sink");
        do {
            int i4 = this.f3675h;
            T2.z zVar = this.f3671d;
            if (i4 != 0) {
                long f3 = zVar.f(c0231f, Math.min(j3, i4));
                if (f3 == -1) {
                    return -1L;
                }
                this.f3675h -= (int) f3;
                return f3;
            }
            zVar.x(this.f3676i);
            this.f3676i = 0;
            if ((this.f3673f & 4) != 0) {
                return -1L;
            }
            i3 = this.f3674g;
            int s3 = H2.b.s(zVar);
            this.f3675h = s3;
            this.f3672e = s3;
            int d3 = zVar.d() & 255;
            this.f3673f = zVar.d() & 255;
            Logger logger = t.f3677g;
            if (logger.isLoggable(Level.FINE)) {
                C0234i c0234i = f.f3607a;
                logger.fine(f.a(true, this.f3674g, this.f3672e, d3, this.f3673f));
            }
            h3 = zVar.h() & Integer.MAX_VALUE;
            this.f3674g = h3;
            if (d3 != 9) {
                throw new IOException(d3 + " != TYPE_CONTINUATION");
            }
        } while (h3 == i3);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
