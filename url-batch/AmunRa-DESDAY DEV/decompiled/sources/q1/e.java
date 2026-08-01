package q1;

import o1.p;
import x1.j;
import x1.o;
import x1.t;
import x1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3521a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3523c;

    public e(p pVar) {
        this.f3523c = pVar;
        this.f3521a = new j(((o) pVar.f3428e).f4251a.a());
    }

    @Override // x1.t
    public final x a() {
        return this.f3521a;
    }

    @Override // x1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3522b) {
            return;
        }
        this.f3522b = true;
        p pVar = this.f3523c;
        pVar.getClass();
        j jVar = this.f3521a;
        x xVar = jVar.f4240e;
        jVar.f4240e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3425a = 3;
    }

    @Override // x1.t, java.io.Flushable
    public final void flush() {
        if (this.f3522b) {
            return;
        }
        ((o) this.f3523c.f3428e).flush();
    }

    @Override // x1.t
    public final void g(x1.f fVar, long j2) {
        if (this.f3522b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4236b;
        byte[] bArr = l1.b.f3252a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3523c.f3428e).g(fVar, j2);
    }
}
