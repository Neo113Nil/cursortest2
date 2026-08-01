package s1;

import q1.p;
import z1.j;
import z1.o;
import z1.t;
import z1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3692a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3694c;

    public b(p pVar) {
        this.f3694c = pVar;
        this.f3692a = new j(((o) pVar.f3509e).f4283a.a());
    }

    @Override // z1.t
    public final x a() {
        return this.f3692a;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        if (this.f3693b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3694c;
        o oVar = (o) pVar.f3509e;
        if (oVar.f4285c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4284b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f3509e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3693b) {
            return;
        }
        this.f3693b = true;
        ((o) this.f3694c.f3509e).d("0\r\n\r\n");
        p pVar = this.f3694c;
        j jVar = this.f3692a;
        pVar.getClass();
        x xVar = jVar.f4272e;
        jVar.f4272e = x.d;
        xVar.a();
        xVar.b();
        this.f3694c.f3506a = 3;
    }

    @Override // z1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3693b) {
            return;
        }
        ((o) this.f3694c.f3509e).flush();
    }
}
