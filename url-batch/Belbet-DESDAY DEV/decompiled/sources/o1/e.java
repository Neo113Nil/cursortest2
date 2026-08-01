package o1;

import m1.p;
import v1.j;
import v1.o;
import v1.t;
import v1.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f3374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3376c;

    public e(p pVar) {
        this.f3376c = pVar;
        this.f3374a = new j(((o) pVar.f3265e).f4088a.a());
    }

    @Override // v1.t
    public final x a() {
        return this.f3374a;
    }

    @Override // v1.t
    public final void c(v1.f fVar, long j2) {
        if (this.f3375b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4074b;
        byte[] bArr = j1.b.f2604a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f3376c.f3265e).c(fVar, j2);
    }

    @Override // v1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3375b) {
            return;
        }
        this.f3375b = true;
        p pVar = this.f3376c;
        pVar.getClass();
        j jVar = this.f3374a;
        x xVar = jVar.f4078e;
        jVar.f4078e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3262a = 3;
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
        if (this.f3375b) {
            return;
        }
        ((o) this.f3376c.f3265e).flush();
    }
}
