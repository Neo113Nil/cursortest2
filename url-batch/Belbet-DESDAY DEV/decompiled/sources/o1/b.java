package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3367a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3369c;

    public b(p pVar) {
        this.f3369c = pVar;
        this.f3367a = new j(((o) pVar.f3265e).f4088a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3367a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3368b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3369c;
        o oVar = (o) pVar.f3265e;
        if (oVar.f4090c) {
            throw new IllegalStateException("closed");
        }
        oVar.f4089b.t(j2);
        oVar.e();
        o oVar2 = (o) pVar.f3265e;
        oVar2.d("\r\n");
        oVar2.c(fVar, j2);
        oVar2.d("\r\n");
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3368b) {
            return;
        }
        this.f3368b = true;
        ((o) this.f3369c.f3265e).d("0\r\n\r\n");
        p pVar = this.f3369c;
        j jVar = this.f3367a;
        pVar.getClass();
        x xVar = jVar.f4078e;
        jVar.f4078e = x.d;
        xVar.a();
        xVar.b();
        this.f3369c.f3262a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3368b) {
            return;
        }
        ((o) this.f3369c.f3265e).flush();
    }
}
