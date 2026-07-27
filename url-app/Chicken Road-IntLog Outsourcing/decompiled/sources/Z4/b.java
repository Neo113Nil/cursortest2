package Z4;

import j5.j;
import j5.p;
import j5.u;
import j5.y;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j f3796a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3798c;

    public b(g gVar) {
        this.f3798c = gVar;
        this.f3796a = new j(((p) gVar.f3811c.f313d).f10515a.d());
    }

    @Override // j5.u
    public final void B(j5.f fVar, long j2) {
        if (this.f3797b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = (p) this.f3798c.f3811c.f313d;
        if (pVar.f10517c) {
            throw new IllegalStateException("closed");
        }
        pVar.f10516b.L(j2);
        pVar.a();
        pVar.x("\r\n");
        pVar.B(fVar, j2);
        pVar.x("\r\n");
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3797b) {
            return;
        }
        this.f3797b = true;
        ((p) this.f3798c.f3811c.f313d).x("0\r\n\r\n");
        g gVar = this.f3798c;
        j jVar = this.f3796a;
        gVar.getClass();
        y yVar = jVar.f10500e;
        jVar.f10500e = y.f10533d;
        yVar.a();
        yVar.b();
        this.f3798c.f3812d = 3;
    }

    @Override // j5.u
    public final y d() {
        return this.f3796a;
    }

    @Override // j5.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3797b) {
            return;
        }
        ((p) this.f3798c.f3811c.f313d).flush();
    }
}
