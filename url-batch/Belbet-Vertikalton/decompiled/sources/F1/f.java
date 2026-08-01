package F1;

import D1.q;
import M1.j;
import M1.o;
import M1.t;
import M1.x;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f329a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f331c;

    public f(q qVar) {
        this.f331c = qVar;
        this.f329a = new j(((o) qVar.e).f843a.b());
    }

    @Override // M1.t
    public final x b() {
        return this.f329a;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f330b) {
            return;
        }
        this.f330b = true;
        q qVar = this.f331c;
        qVar.getClass();
        j jVar = this.f329a;
        x xVar = jVar.e;
        jVar.e = x.f860d;
        xVar.a();
        xVar.b();
        qVar.f272a = 3;
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        if (this.f330b) {
            return;
        }
        ((o) this.f331c.e).flush();
    }

    @Override // M1.t
    public final void n(M1.f fVar, long j) {
        if (this.f330b) {
            throw new IllegalStateException("closed");
        }
        long j2 = fVar.f827b;
        byte[] bArr = A1.c.f19a;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f331c.e).n(fVar, j);
    }
}
