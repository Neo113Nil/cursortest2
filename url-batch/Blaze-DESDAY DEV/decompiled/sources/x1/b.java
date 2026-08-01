package x1;

import E1.j;
import E1.o;
import E1.t;
import E1.x;
import v1.p;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4149a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4151c;

    public b(p pVar) {
        this.f4151c = pVar;
        this.f4149a = new j(((o) pVar.f4082e).f218a.a());
    }

    @Override // E1.t
    public final x a() {
        return this.f4149a;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f4150b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f4151c;
        o oVar = (o) pVar.f4082e;
        if (oVar.f220c) {
            throw new IllegalStateException("closed");
        }
        oVar.f219b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f4082e;
        oVar2.c("\r\n");
        oVar2.b(fVar, j2);
        oVar2.c("\r\n");
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4150b) {
            return;
        }
        this.f4150b = true;
        ((o) this.f4151c.f4082e).c("0\r\n\r\n");
        p pVar = this.f4151c;
        j jVar = this.f4149a;
        pVar.getClass();
        x xVar = jVar.f207e;
        jVar.f207e = x.d;
        xVar.a();
        xVar.b();
        this.f4151c.f4079a = 3;
    }

    @Override // E1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4150b) {
            return;
        }
        ((o) this.f4151c.f4082e).flush();
    }
}
