package v1;

import C1.j;
import C1.o;
import C1.t;
import C1.x;
import t1.p;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4043a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4045c;

    public b(p pVar) {
        this.f4045c = pVar;
        this.f4043a = new j(((o) pVar.f3795e).f197a.a());
    }

    @Override // C1.t
    public final x a() {
        return this.f4043a;
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4044b) {
            return;
        }
        this.f4044b = true;
        ((o) this.f4045c.f3795e).c("0\r\n\r\n");
        p pVar = this.f4045c;
        j jVar = this.f4043a;
        pVar.getClass();
        x xVar = jVar.f186e;
        jVar.f186e = x.d;
        xVar.a();
        xVar.b();
        this.f4045c.f3792a = 3;
    }

    @Override // C1.t
    public final void f(C1.f fVar, long j2) {
        if (this.f4044b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f4045c;
        o oVar = (o) pVar.f3795e;
        if (oVar.f199c) {
            throw new IllegalStateException("closed");
        }
        oVar.f198b.v(j2);
        oVar.g();
        o oVar2 = (o) pVar.f3795e;
        oVar2.c("\r\n");
        oVar2.f(fVar, j2);
        oVar2.c("\r\n");
    }

    @Override // C1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4044b) {
            return;
        }
        ((o) this.f4045c.f3795e).flush();
    }
}
