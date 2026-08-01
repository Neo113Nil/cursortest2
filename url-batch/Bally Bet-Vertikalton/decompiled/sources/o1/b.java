package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3350a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3352c;

    public b(p pVar) {
        this.f3352c = pVar;
        this.f3350a = new j(((o) pVar.f3248e).f4071a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3350a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3351b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3352c;
        o oVar = (o) pVar.f3248e;
        if (oVar.f4073c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4072b.t(j2);
        oVar.e();
        o oVar2 = (o) pVar.f3248e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3351b) {
            return;
        }
        this.f3351b = true;
        ((o) this.f3352c.f3248e).d("0\r\n\r\n");
        p pVar = this.f3352c;
        j jVar = this.f3350a;
        pVar.getClass();
        x xVar = jVar.f4061e;
        jVar.f4061e = x.d;
        xVar.a();
        xVar.b();
        this.f3352c.f3245a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3351b) {
            return;
        }
        ((o) this.f3352c.f3248e).flush();
    }
}
