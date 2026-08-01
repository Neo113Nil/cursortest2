package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3362a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3364c;

    public b(p pVar) {
        this.f3364c = pVar;
        this.f3362a = new j(((n) pVar.f3260e).f4082a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3362a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3363b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        p pVar = this.f3364c;
        n nVar = (n) pVar.f3260e;
        if (nVar.f4084c) {
            throw new IllegalStateException("closed");
        }
        nVar.f4083b.t(j2);
        nVar.e();
        n nVar2 = (n) pVar.f3260e;
        nVar2.d("\r\n");
        nVar2.c(fVar, j2);
        nVar2.d("\r\n");
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3363b) {
            return;
        }
        this.f3363b = true;
        ((n) this.f3364c.f3260e).d("0\r\n\r\n");
        p pVar = this.f3364c;
        j jVar = this.f3362a;
        pVar.getClass();
        w wVar = jVar.f4073e;
        jVar.f4073e = w.d;
        wVar.a();
        wVar.b();
        this.f3364c.f3257a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3363b) {
            return;
        }
        ((n) this.f3364c.f3260e).flush();
    }
}
