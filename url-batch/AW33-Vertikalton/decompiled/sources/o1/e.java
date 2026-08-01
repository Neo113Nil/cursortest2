package o1;

import m1.p;
import v1.j;
import v1.n;
import v1.s;
import v1.w;

/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final j f3369a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3371c;

    public e(p pVar) {
        this.f3371c = pVar;
        this.f3369a = new j(((n) pVar.f3260e).f4082a.a());
    }

    @Override // v1.s
    public final w a() {
        return this.f3369a;
    }

    @Override // v1.s
    public final void c(v1.f fVar, long j2) {
        if (this.f3370b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f4069b;
        byte[] bArr = j1.b.f2599a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((n) this.f3371c.f3260e).c(fVar, j2);
    }

    @Override // v1.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3370b) {
            return;
        }
        this.f3370b = true;
        p pVar = this.f3371c;
        pVar.getClass();
        j jVar = this.f3369a;
        w wVar = jVar.f4073e;
        jVar.f4073e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3257a = 3;
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
        if (this.f3370b) {
            return;
        }
        ((n) this.f3371c.f3260e).flush();
    }
}
