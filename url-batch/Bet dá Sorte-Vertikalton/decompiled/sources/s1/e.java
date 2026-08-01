package s1;

import q1.p;
import z1.j;
import z1.o;
import z1.t;
import z1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3776a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3778c;

    public e(p pVar) {
        this.f3778c = pVar;
        this.f3776a = new j(((o) pVar.f3562e).f4284a.a());
    }

    @Override // z1.t
    public final x a() {
        return this.f3776a;
    }

    @Override // z1.t
    public final void c(z1.f fVar, long j2) {
        if (this.f3777b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4269b;
        byte[] bArr = n1.b.f3319a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3778c.f3562e).c(fVar, j2);
    }

    @Override // z1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3777b) {
            return;
        }
        this.f3777b = true;
        p pVar = this.f3778c;
        pVar.getClass();
        j jVar = this.f3776a;
        x xVar = jVar.f4273e;
        jVar.f4273e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3559a = 3;
    }

    @Override // z1.t, java.io.Flushable
    public final void flush() {
        if (this.f3777b) {
            return;
        }
        ((o) this.f3778c.f3562e).flush();
    }
}
