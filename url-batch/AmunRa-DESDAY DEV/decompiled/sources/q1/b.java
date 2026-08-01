package q1;

import o1.p;
import x1.j;
import x1.o;
import x1.t;
import x1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3514a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3516c;

    public b(p pVar) {
        this.f3516c = pVar;
        this.f3514a = new j(((o) pVar.f3428e).f4251a.a());
    }

    @Override // x1.t
    public final x a() {
        return this.f3514a;
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3515b) {
            return;
        }
        this.f3515b = true;
        ((o) this.f3516c.f3428e).c("0\r\n\r\n");
        p pVar = this.f3516c;
        j jVar = this.f3514a;
        pVar.getClass();
        x xVar = jVar.f4240e;
        jVar.f4240e = x.d;
        xVar.a();
        xVar.b();
        this.f3516c.f3425a = 3;
    }

    @Override // x1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3515b) {
            return;
        }
        ((o) this.f3516c.f3428e).flush();
    }

    @Override // x1.t
    public final void g(x1.f fVar, long j2) {
        if (this.f3515b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3516c;
        o oVar = (o) pVar.f3428e;
        if (oVar.f4253c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4252b.v(j2);
        oVar.f();
        o oVar2 = (o) pVar.f3428e;
        oVar2.c("\r\n");
        oVar2.g(fVar, j2);
        oVar2.c("\r\n");
    }
}
