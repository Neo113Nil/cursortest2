package G2;

import E2.o;
import N2.C0150f;
import N2.D;
import N2.H;
import N2.n;
import N2.x;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f1594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1596f;

    public f(o oVar) {
        this.f1596f = oVar;
        this.f1594d = new n(((x) oVar.f849e).f2969d.c());
    }

    @Override // N2.D
    public final H c() {
        return this.f1594d;
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1595e) {
            return;
        }
        this.f1595e = true;
        o oVar = this.f1596f;
        oVar.getClass();
        n nVar = this.f1594d;
        H h3 = nVar.f2948e;
        nVar.f2948e = H.f2905d;
        h3.a();
        h3.b();
        oVar.f845a = 3;
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        if (this.f1595e) {
            return;
        }
        ((x) this.f1596f.f849e).flush();
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        if (this.f1595e) {
            throw new IllegalStateException("closed");
        }
        long j4 = c0150f.f2929e;
        byte[] bArr = B2.c.f415a;
        if (j3 < 0 || 0 > j4 || j4 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((x) this.f1596f.f849e).g(c0150f, j3);
    }
}
