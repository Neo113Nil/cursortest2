package x1;

import E1.j;
import E1.o;
import E1.t;
import E1.x;
import v1.p;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4156a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4158c;

    public e(p pVar) {
        this.f4158c = pVar;
        this.f4156a = new j(((o) pVar.f4082e).f218a.a());
    }

    @Override // E1.t
    public final x a() {
        return this.f4156a;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f4157b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f203b;
        byte[] bArr = s1.b.f3721a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f4158c.f4082e).b(fVar, j2);
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4157b) {
            return;
        }
        this.f4157b = true;
        p pVar = this.f4158c;
        pVar.getClass();
        j jVar = this.f4156a;
        x xVar = jVar.f207e;
        jVar.f207e = x.d;
        xVar.a();
        xVar.b();
        pVar.f4079a = 3;
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        if (this.f4157b) {
            return;
        }
        ((o) this.f4158c.f4082e).flush();
    }
}
