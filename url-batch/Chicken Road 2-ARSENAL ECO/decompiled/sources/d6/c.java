package d6;

import n6.j;
import n6.p;
import n6.u;
import n6.y;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: f, reason: collision with root package name */
    public final j f3976f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f3978h;

    public c(h hVar) {
        this.f3978h = hVar;
        this.f3976f = new j(((p) hVar.f3991c.f71g).f5544f.b());
    }

    @Override // n6.u
    public final y b() {
        return this.f3976f;
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3977g) {
            return;
        }
        this.f3977g = true;
        ((p) this.f3978h.f3991c.f71g).D("0\r\n\r\n");
        j jVar = this.f3976f;
        y yVar = jVar.f5529e;
        jVar.f5529e = y.f5562d;
        yVar.a();
        yVar.b();
        this.f3978h.f3992d = 3;
    }

    @Override // n6.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3977g) {
            return;
        }
        ((p) this.f3978h.f3991c.f71g).flush();
    }

    @Override // n6.u
    public final void l(long j4, n6.f fVar) {
        if (this.f3977g) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return;
        }
        p pVar = (p) this.f3978h.f3991c.f71g;
        if (pVar.f5546h) {
            throw new IllegalStateException("closed");
        }
        pVar.f5545g.K(j4);
        pVar.a();
        pVar.D("\r\n");
        pVar.l(j4, fVar);
        pVar.D("\r\n");
    }
}
