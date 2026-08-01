package v1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements B1.v {

    /* renamed from: a, reason: collision with root package name */
    public final B1.p f4123a;

    /* renamed from: b, reason: collision with root package name */
    public int f4124b;

    /* renamed from: c, reason: collision with root package name */
    public int f4125c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f4126e;

    /* renamed from: f, reason: collision with root package name */
    public int f4127f;

    public r(B1.p pVar) {
        d1.d.e(pVar, "source");
        this.f4123a = pVar;
    }

    @Override // B1.v
    public final B1.x a() {
        return this.f4123a.f87a.a();
    }

    @Override // B1.v
    public final long c(B1.f fVar, long j2) {
        int i;
        int l2;
        d1.d.e(fVar, "sink");
        do {
            int i2 = this.f4126e;
            B1.p pVar = this.f4123a;
            if (i2 != 0) {
                long c2 = pVar.c(fVar, Math.min(8192L, i2));
                if (c2 == -1) {
                    return -1L;
                }
                this.f4126e -= (int) c2;
                return c2;
            }
            pVar.r(this.f4127f);
            this.f4127f = 0;
            if ((this.f4125c & 4) != 0) {
                return -1L;
            }
            i = this.d;
            int r2 = p1.b.r(pVar);
            this.f4126e = r2;
            this.f4124b = r2;
            int i3 = pVar.i() & 255;
            this.f4125c = pVar.i() & 255;
            Logger logger = s.d;
            if (logger.isLoggable(Level.FINE)) {
                B1.i iVar = f.f4073a;
                logger.fine(f.a(true, this.d, this.f4124b, i3, this.f4125c));
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
