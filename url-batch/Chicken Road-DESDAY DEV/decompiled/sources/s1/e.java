package s1;

import q1.p;
import z1.j;
import z1.o;
import z1.t;
import z1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3699a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3701c;

    public e(p pVar) {
        this.f3701c = pVar;
        this.f3699a = new j(((o) pVar.f3509e).f4283a.a());
    }

    @Override // z1.t
    public final x a() {
        return this.f3699a;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        if (this.f3700b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4268b;
        byte[] bArr = n1.b.f3286a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3701c.f3509e).c(fVar, j2);
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3700b) {
            return;
        }
        this.f3700b = true;
        p pVar = this.f3701c;
        pVar.getClass();
        j jVar = this.f3699a;
        x xVar = jVar.f4272e;
        jVar.f4272e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3506a = 3;
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        if (this.f3700b) {
            return;
        }
        ((o) this.f3701c.f3509e).flush();
    }
}
