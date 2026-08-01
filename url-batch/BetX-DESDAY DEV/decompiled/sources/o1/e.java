package o1;

import m1.p;
import v1.k;
import v1.u;
import v1.y;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3739a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3741c;

    public e(p pVar) {
        this.f3741c = pVar;
        this.f3739a = new k(((v1.p) pVar.f3614e).f4506a.a());
    }

    @Override // v1.u
    public final y a() {
        return this.f3739a;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3740b) {
            return;
        }
        this.f3740b = true;
        p pVar = this.f3741c;
        pVar.getClass();
        k kVar = this.f3739a;
        y yVar = kVar.f4493e;
        kVar.f4493e = y.f4525d;
        yVar.a();
        yVar.b();
        pVar.f3610a = 3;
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        if (this.f3740b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4488b;
        byte[] bArr = j1.b.f2971a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((v1.p) this.f3741c.f3614e).d(fVar, j2);
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        if (this.f3740b) {
            return;
        }
        ((v1.p) this.f3741c.f3614e).flush();
    }
}
