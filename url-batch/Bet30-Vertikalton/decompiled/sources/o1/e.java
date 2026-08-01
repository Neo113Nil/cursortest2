package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3373a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3375c;

    public e(p pVar) {
        this.f3375c = pVar;
        this.f3373a = new j(((o) pVar.f3264e).f4087a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3373a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3374b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4073b;
        byte[] bArr = j1.b.f2603a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3375c.f3264e).c(fVar, j2);
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3374b) {
            return;
        }
        this.f3374b = true;
        p pVar = this.f3375c;
        pVar.getClass();
        j jVar = this.f3373a;
        x xVar = jVar.f4077e;
        jVar.f4077e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3261a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f3374b) {
            return;
        }
        ((o) this.f3375c.f3264e).flush();
    }
}
