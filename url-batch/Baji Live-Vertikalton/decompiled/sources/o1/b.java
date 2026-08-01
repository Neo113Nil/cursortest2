package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3346c;

    public b(p pVar) {
        this.f3346c = pVar;
        this.f3344a = new j(((n) pVar.f3242e).f4064a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3344a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3345b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3346c;
        n nVar = (n) pVar.f3242e;
        if (nVar.f4066c) {
            throw new IllegalStateException("closed");
        }
        nVar.f4065b.t(j2);
        nVar.e();
        n nVar2 = (n) pVar.f3242e;
        nVar2.d("\r\n");
        nVar2.c(fVar, j2);
        nVar2.d("\r\n");
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3345b) {
            return;
        }
        this.f3345b = true;
        ((n) this.f3346c.f3242e).d("0\r\n\r\n");
        p pVar = this.f3346c;
        j jVar = this.f3344a;
        pVar.getClass();
        w wVar = jVar.f4055e;
        jVar.f4055e = w.d;
        wVar.a();
        wVar.b();
        this.f3346c.f3239a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3345b) {
            return;
        }
        ((n) this.f3346c.f3242e).flush();
    }
}
