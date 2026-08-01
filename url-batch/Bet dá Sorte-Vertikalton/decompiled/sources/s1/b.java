package s1;

import q1.p;
import z1.j;
import z1.o;
import z1.t;
import z1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3769a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3771c;

    public b(p pVar) {
        this.f3771c = pVar;
        this.f3769a = new j(((o) pVar.f3562e).f4284a.a());
    }

    @Override // z1.t
    public final x a() {
        return this.f3769a;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        if (this.f3770b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3771c;
        o oVar = (o) pVar.f3562e;
        if (oVar.f4286c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4285b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f3562e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3770b) {
            return;
        }
        this.f3770b = true;
        ((o) this.f3771c.f3562e).d("0\r\n\r\n");
        p pVar = this.f3771c;
        j jVar = this.f3769a;
        pVar.getClass();
        x xVar = jVar.f4273e;
        jVar.f4273e = x.d;
        xVar.a();
        xVar.b();
        this.f3771c.f3559a = 3;
    }

    @Override // z1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3770b) {
            return;
        }
        ((o) this.f3771c.f3562e).flush();
    }
}
