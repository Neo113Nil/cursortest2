package G2;

import E2.o;
import N2.C0150f;
import N2.D;
import N2.H;
import N2.n;
import N2.x;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f1585d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1587f;

    public c(o oVar) {
        this.f1587f = oVar;
        this.f1585d = new n(((x) oVar.f849e).f2969d.c());
    }

    @Override // N2.D
    public final H c() {
        return this.f1585d;
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1586e) {
            return;
        }
        this.f1586e = true;
        ((x) this.f1587f.f849e).F("0\r\n\r\n");
        o oVar = this.f1587f;
        n nVar = this.f1585d;
        oVar.getClass();
        H h3 = nVar.f2948e;
        nVar.f2948e = H.f2905d;
        h3.a();
        h3.b();
        this.f1587f.f845a = 3;
    }

    @Override // N2.D, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1586e) {
            return;
        }
        ((x) this.f1587f.f849e).flush();
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        if (this.f1586e) {
            throw new IllegalStateException("closed");
        }
        if (j3 == 0) {
            return;
        }
        o oVar = this.f1587f;
        x xVar = (x) oVar.f849e;
        if (xVar.f2971f) {
            throw new IllegalStateException("closed");
        }
        xVar.f2970e.R(j3);
        xVar.a();
        x xVar2 = (x) oVar.f849e;
        xVar2.F("\r\n");
        xVar2.g(c0150f, j3);
        xVar2.F("\r\n");
    }
}
