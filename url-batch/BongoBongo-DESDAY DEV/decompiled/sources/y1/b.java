package y1;

import F1.j;
import F1.o;
import F1.t;
import F1.x;
import w1.p;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4347c;

    public b(p pVar) {
        this.f4347c = pVar;
        this.f4345a = new j(((o) pVar.f4275e).f262a.a());
    }

    @Override // F1.t
    public final x a() {
        return this.f4345a;
    }

    @Override // F1.t
    public final void b(F1.f fVar, long j2) {
        if (this.f4346b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f4347c;
        o oVar = (o) pVar.f4275e;
        if (oVar.f264c) {
            throw new IllegalStateException("closed");
        }
        oVar.f263b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f4275e;
        oVar2.e("\r\n");
        oVar2.b(fVar, j2);
        oVar2.e("\r\n");
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4346b) {
            return;
        }
        this.f4346b = true;
        ((o) this.f4347c.f4275e).e("0\r\n\r\n");
        p pVar = this.f4347c;
        j jVar = this.f4345a;
        pVar.getClass();
        x xVar = jVar.f251e;
        jVar.f251e = x.d;
        xVar.a();
        xVar.b();
        this.f4347c.f4272a = 3;
    }

    @Override // F1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4346b) {
            return;
        }
        ((o) this.f4347c.f4275e).flush();
    }
}
