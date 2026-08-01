package F1;

import D1.q;
import M1.j;
import M1.o;
import M1.t;
import M1.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f322a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f324c;

    public c(q qVar) {
        this.f324c = qVar;
        this.f322a = new j(((o) qVar.e).f843a.b());
    }

    @Override // M1.t
    public final x b() {
        return this.f322a;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f323b) {
            return;
        }
        this.f323b = true;
        ((o) this.f324c.e).p("0\r\n\r\n");
        q qVar = this.f324c;
        j jVar = this.f322a;
        qVar.getClass();
        x xVar = jVar.e;
        jVar.e = x.f860d;
        xVar.a();
        xVar.b();
        this.f324c.f272a = 3;
    }

    @Override // M1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f323b) {
            return;
        }
        ((o) this.f324c.e).flush();
    }

    @Override // M1.t
    public final void n(M1.f fVar, long j) {
        if (this.f323b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        q qVar = this.f324c;
        o oVar = (o) qVar.e;
        if (oVar.f845c) {
            throw new IllegalStateException("closed");
        }
        oVar.f844b.N(j);
        oVar.a();
        o oVar2 = (o) qVar.e;
        oVar2.p("\r\n");
        oVar2.n(fVar, j);
        oVar2.p("\r\n");
    }
}
