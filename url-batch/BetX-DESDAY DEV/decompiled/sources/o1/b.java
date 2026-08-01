package o1;

import m1.p;
import v1.k;
import v1.u;
import v1.y;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3730a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3732c;

    public b(p pVar) {
        this.f3732c = pVar;
        this.f3730a = new k(((v1.p) pVar.f3614e).f4506a.a());
    }

    @Override // v1.u
    public final y a() {
        return this.f3730a;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3731b) {
            return;
        }
        this.f3731b = true;
        ((v1.p) this.f3732c.f3614e).e("0\r\n\r\n");
        p pVar = this.f3732c;
        k kVar = this.f3730a;
        pVar.getClass();
        y yVar = kVar.f4493e;
        kVar.f4493e = y.f4525d;
        yVar.a();
        yVar.b();
        this.f3732c.f3610a = 3;
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        if (this.f3731b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3732c;
        v1.p pVar2 = (v1.p) pVar.f3614e;
        if (pVar2.f4508c) {
            throw new IllegalStateException("closed");
        }
        pVar2.f4507b.v(j2);
        pVar2.g();
        v1.p pVar3 = (v1.p) pVar.f3614e;
        pVar3.e("\r\n");
        pVar3.d(fVar, j2);
        pVar3.e("\r\n");
    }

    @Override // v1.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3731b) {
            return;
        }
        ((v1.p) this.f3732c.f3614e).flush();
    }
}
