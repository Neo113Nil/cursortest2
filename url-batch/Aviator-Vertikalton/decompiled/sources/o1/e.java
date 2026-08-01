package o1;

import m1.p;
import v1.k;
import v1.u;
import v1.y;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3735a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3737c;

    public e(p pVar) {
        this.f3737c = pVar;
        this.f3735a = new k(((v1.p) pVar.f3610e).f4502a.a());
    }

    @Override // v1.u
    public final y a() {
        return this.f3735a;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3736b) {
            return;
        }
        this.f3736b = true;
        p pVar = this.f3737c;
        pVar.getClass();
        k kVar = this.f3735a;
        y yVar = kVar.f4489e;
        kVar.f4489e = y.f4521d;
        yVar.a();
        yVar.b();
        pVar.f3606a = 3;
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        if (this.f3736b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4484b;
        byte[] bArr = j1.b.f2967a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((v1.p) this.f3737c.f3610e).d(fVar, j2);
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
        if (this.f3736b) {
            return;
        }
        ((v1.p) this.f3737c.f3610e).flush();
    }
}
