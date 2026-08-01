package y1;

import F1.j;
import F1.o;
import F1.t;
import F1.x;
import w1.p;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4352a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4354c;

    public e(p pVar) {
        this.f4354c = pVar;
        this.f4352a = new j(((o) pVar.f4275e).f262a.a());
    }

    @Override // F1.t
    public final x a() {
        return this.f4352a;
    }

    @Override // F1.t
    public final void b(F1.f fVar, long j2) {
        if (this.f4353b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f247b;
        byte[] bArr = t1.b.f3898a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f4354c.f4275e).b(fVar, j2);
    }

    @Override // F1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4353b) {
            return;
        }
        this.f4353b = true;
        p pVar = this.f4354c;
        pVar.getClass();
        j jVar = this.f4352a;
        x xVar = jVar.f251e;
        jVar.f251e = x.d;
        xVar.a();
        xVar.b();
        pVar.f4272a = 3;
    }

    @Override // F1.t, java.io.Flushable
    public final void flush() {
        if (this.f4353b) {
            return;
        }
        ((o) this.f4354c.f4275e).flush();
    }
}
