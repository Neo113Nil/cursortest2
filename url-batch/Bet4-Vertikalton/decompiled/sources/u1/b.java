package u1;

import B1.j;
import B1.o;
import B1.t;
import B1.x;
import s1.p;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3820a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3822c;

    public b(p pVar) {
        this.f3822c = pVar;
        this.f3820a = new j(((o) pVar.f3756e).f84a.a());
    }

    @Override // B1.t
    public final x a() {
        return this.f3820a;
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3821b) {
            return;
        }
        this.f3821b = true;
        ((o) this.f3822c.f3756e).d("0\r\n\r\n");
        p pVar = this.f3822c;
        j jVar = this.f3820a;
        pVar.getClass();
        x xVar = jVar.f73e;
        jVar.f73e = x.d;
        xVar.a();
        xVar.b();
        this.f3822c.f3753a = 3;
    }

    @Override // B1.t
    public final void e(B1.f fVar, long j2) {
        if (this.f3821b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3822c;
        o oVar = (o) pVar.f3756e;
        if (oVar.f86c) {
            throw new IllegalStateException("closed");
        }
        oVar.f85b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f3756e;
        oVar2.d("\r\n");
        oVar2.e(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // B1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3821b) {
            return;
        }
        ((o) this.f3822c.f3756e).flush();
    }
}
