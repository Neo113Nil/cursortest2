package u1;

import B1.j;
import B1.o;
import B1.t;
import B1.x;
import s1.p;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3827a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3829c;

    public e(p pVar) {
        this.f3829c = pVar;
        this.f3827a = new j(((o) pVar.f3756e).f84a.a());
    }

    @Override // B1.t
    public final x a() {
        return this.f3827a;
    }

    @Override // B1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3828b) {
            return;
        }
        this.f3828b = true;
        p pVar = this.f3829c;
        pVar.getClass();
        j jVar = this.f3827a;
        x xVar = jVar.f73e;
        jVar.f73e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3753a = 3;
    }

    @Override // B1.t
    public final void e(B1.f fVar, long j2) {
        if (this.f3828b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f69b;
        byte[] bArr = p1.b.f3455a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3829c.f3756e).e(fVar, j2);
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
        if (this.f3828b) {
            return;
        }
        ((o) this.f3829c.f3756e).flush();
    }
}
