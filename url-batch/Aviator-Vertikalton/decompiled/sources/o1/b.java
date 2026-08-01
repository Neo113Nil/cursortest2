package o1;

import m1.p;
import v1.k;
import v1.u;
import v1.y;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f3726a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3728c;

    public b(p pVar) {
        this.f3728c = pVar;
        this.f3726a = new k(((v1.p) pVar.f3610e).f4502a.a());
    }

    @Override // v1.u
    public final y a() {
        return this.f3726a;
    }

    @Override // v1.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3727b) {
            return;
        }
        this.f3727b = true;
        ((v1.p) this.f3728c.f3610e).e("0\r\n\r\n");
        p pVar = this.f3728c;
        k kVar = this.f3726a;
        pVar.getClass();
        y yVar = kVar.f4489e;
        kVar.f4489e = y.f4521d;
        yVar.a();
        yVar.b();
        this.f3728c.f3606a = 3;
    }

    @Override // v1.u
    public final void d(v1.f fVar, long j2) {
        if (this.f3727b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3728c;
        v1.p pVar2 = (v1.p) pVar.f3610e;
        if (pVar2.f4504c) {
            throw new IllegalStateException("closed");
        }
        pVar2.f4503b.v(j2);
        pVar2.g();
        v1.p pVar3 = (v1.p) pVar.f3610e;
        pVar3.e("\r\n");
        pVar3.d(fVar, j2);
        pVar3.e("\r\n");
    }

    @Override // v1.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3727b) {
            return;
        }
        ((v1.p) this.f3728c.f3610e).flush();
    }
}
