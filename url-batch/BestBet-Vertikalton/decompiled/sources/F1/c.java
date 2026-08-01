package F1;

import D1.p;
import M1.j;
import M1.o;
import M1.t;
import M1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f274a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f276c;

    public c(p pVar) {
        this.f276c = pVar;
        this.f274a = new j(((o) pVar.f214e).f814a.b());
    }

    @Override // M1.t
    public final x b() {
        return this.f274a;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f275b) {
            return;
        }
        this.f275b = true;
        ((o) this.f276c.f214e).l("0\r\n\r\n");
        p pVar = this.f276c;
        j jVar = this.f274a;
        pVar.getClass();
        x xVar = jVar.f803e;
        jVar.f803e = x.d;
        xVar.a();
        xVar.b();
        this.f276c.f211a = 3;
    }

    @Override // M1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f275b) {
            return;
        }
        ((o) this.f276c.f214e).flush();
    }

    @Override // M1.t
    public final void i(M1.f fVar, long j2) {
        if (this.f275b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f276c;
        o oVar = (o) pVar.f214e;
        if (oVar.f816c) {
            throw new IllegalStateException("closed");
        }
        oVar.f815b.B(j2);
        oVar.a();
        o oVar2 = (o) pVar.f214e;
        oVar2.l("\r\n");
        oVar2.i(fVar, j2);
        oVar2.l("\r\n");
    }
}
