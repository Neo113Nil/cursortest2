package v1;

import C1.j;
import C1.o;
import C1.t;
import C1.x;
import t1.p;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4052c;

    public e(p pVar) {
        this.f4052c = pVar;
        this.f4050a = new j(((o) pVar.f3795e).f197a.a());
    }

    @Override // C1.t
    public final x a() {
        return this.f4050a;
    }

    @Override // C1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4051b) {
            return;
        }
        this.f4051b = true;
        p pVar = this.f4052c;
        pVar.getClass();
        j jVar = this.f4050a;
        x xVar = jVar.f186e;
        jVar.f186e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3792a = 3;
    }

    @Override // C1.t
    public final void f(C1.f fVar, long j2) {
        if (this.f4051b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f182b;
        byte[] bArr = q1.b.f3491a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f4052c.f3795e).f(fVar, j2);
    }

    @Override // C1.t, java.io.Flushable
    public final void flush() {
        if (this.f4051b) {
            return;
        }
        ((o) this.f4052c.f3795e).flush();
    }
}
