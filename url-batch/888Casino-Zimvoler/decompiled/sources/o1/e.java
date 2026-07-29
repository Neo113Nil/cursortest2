package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3352a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3354c;

    public e(p pVar) {
        this.f3354c = pVar;
        this.f3352a = new j(((n) pVar.f3243e).f4065a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3352a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3353b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4052b;
        byte[] bArr = j1.b.f2582a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((n) this.f3354c.f3243e).c(fVar, j2);
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3353b) {
            return;
        }
        this.f3353b = true;
        p pVar = this.f3354c;
        pVar.getClass();
        j jVar = this.f3352a;
        w wVar = jVar.f4056e;
        jVar.f4056e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3240a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f3353b) {
            return;
        }
        ((n) this.f3354c.f3243e).flush();
    }
}
