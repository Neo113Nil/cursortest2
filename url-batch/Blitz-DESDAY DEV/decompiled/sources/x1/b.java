package x1;

import E1.j;
import E1.o;
import E1.t;
import E1.x;
import v1.p;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4175a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4177c;

    public b(p pVar) {
        this.f4177c = pVar;
        this.f4175a = new j(((o) pVar.f3912e).f217a.a());
    }

    @Override // E1.t
    public final x a() {
        return this.f4175a;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f4176b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f4177c;
        o oVar = (o) pVar.f3912e;
        if (oVar.f219c) {
            throw new IllegalStateException("closed");
        }
        oVar.f218b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f3912e;
        oVar2.c("\r\n");
        oVar2.b(fVar, j2);
        oVar2.c("\r\n");
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4176b) {
            return;
        }
        this.f4176b = true;
        ((o) this.f4177c.f3912e).c("0\r\n\r\n");
        p pVar = this.f4177c;
        j jVar = this.f4175a;
        pVar.getClass();
        x xVar = jVar.f206e;
        jVar.f206e = x.d;
        xVar.a();
        xVar.b();
        this.f4177c.f3909a = 3;
    }

    @Override // E1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4176b) {
            return;
        }
        ((o) this.f4177c.f3912e).flush();
    }
}
