package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3353c;

    public e(p pVar) {
        this.f3353c = pVar;
        this.f3351a = new j(((n) pVar.f3242e).f4064a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3351a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3352b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4051b;
        byte[] bArr = j1.b.f2581a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((n) this.f3353c.f3242e).c(fVar, j2);
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3352b) {
            return;
        }
        this.f3352b = true;
        p pVar = this.f3353c;
        pVar.getClass();
        j jVar = this.f3351a;
        w wVar = jVar.f4055e;
        jVar.f4055e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3239a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f3352b) {
            return;
        }
        ((n) this.f3353c.f3242e).flush();
    }
}
