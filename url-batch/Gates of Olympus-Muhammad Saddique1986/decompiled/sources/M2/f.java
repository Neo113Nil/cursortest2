package M2;

import T2.C0231f;
import T2.D;
import T2.H;
import T2.n;
import T2.x;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: d, reason: collision with root package name */
    public final n f3494d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K2.n f3496f;

    public f(K2.n nVar) {
        this.f3496f = nVar;
        this.f3494d = new n(((x) nVar.f3336e).f4449d.c());
    }

    @Override // T2.D
    public final H c() {
        return this.f3494d;
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3495e) {
            return;
        }
        this.f3495e = true;
        K2.n nVar = this.f3496f;
        nVar.getClass();
        n nVar2 = this.f3494d;
        H h3 = nVar2.f4428e;
        nVar2.f4428e = H.f4385d;
        h3.a();
        h3.b();
        nVar.f3332a = 3;
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        if (this.f3495e) {
            return;
        }
        ((x) this.f3496f.f3336e).flush();
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        if (this.f3495e) {
            throw new IllegalStateException("closed");
        }
        long j4 = c0231f.f4409e;
        byte[] bArr = H2.b.f2632a;
        if (j3 < 0 || 0 > j4 || j4 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((x) this.f3496f.f3336e).p(c0231f, j3);
    }
}
