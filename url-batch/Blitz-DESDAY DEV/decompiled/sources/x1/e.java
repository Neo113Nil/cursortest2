package x1;

import E1.j;
import E1.o;
import E1.t;
import E1.x;
import v1.p;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f4182a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4184c;

    public e(p pVar) {
        this.f4184c = pVar;
        this.f4182a = new j(((o) pVar.f3912e).f217a.a());
    }

    @Override // E1.t
    public final x a() {
        return this.f4182a;
    }

    @Override // E1.t
    public final void b(E1.f fVar, long j2) {
        if (this.f4183b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f202b;
        byte[] bArr = s1.b.f3607a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f4184c.f3912e).b(fVar, j2);
    }

    @Override // E1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4183b) {
            return;
        }
        this.f4183b = true;
        p pVar = this.f4184c;
        pVar.getClass();
        j jVar = this.f4182a;
        x xVar = jVar.f206e;
        jVar.f206e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3909a = 3;
    }

    @Override // E1.t, java.io.Flushable
    public final void flush() {
        if (this.f4183b) {
            return;
        }
        ((o) this.f4184c.f3912e).flush();
    }
}
