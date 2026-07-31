package M2;

import T2.C0231f;
import T2.D;
import T2.H;
import T2.n;
import T2.x;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f3485d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K2.n f3487f;

    public c(K2.n nVar) {
        this.f3487f = nVar;
        this.f3485d = new n(((x) nVar.f3336e).f4449d.c());
    }

    @Override // T2.D
    public final H c() {
        return this.f3485d;
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3486e) {
            return;
        }
        this.f3486e = true;
        ((x) this.f3487f.f3336e).o("0\r\n\r\n");
        K2.n nVar = this.f3487f;
        n nVar2 = this.f3485d;
        nVar.getClass();
        H h3 = nVar2.f4428e;
        nVar2.f4428e = H.f4385d;
        h3.a();
        h3.b();
        this.f3487f.f3332a = 3;
    }

    @Override // T2.D, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3486e) {
            return;
        }
        ((x) this.f3487f.f3336e).flush();
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        if (this.f3486e) {
            throw new IllegalStateException("closed");
        }
        if (j3 == 0) {
            return;
        }
        K2.n nVar = this.f3487f;
        x xVar = (x) nVar.f3336e;
        if (xVar.f4451f) {
            throw new IllegalStateException("closed");
        }
        xVar.f4450e.F(j3);
        xVar.a();
        x xVar2 = (x) nVar.f3336e;
        xVar2.o("\r\n");
        xVar2.p(c0231f, j3);
        xVar2.o("\r\n");
    }
}
