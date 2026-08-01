package F1;

import D1.p;
import M1.j;
import M1.o;
import M1.t;
import M1.x;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final j f281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f283c;

    public f(p pVar) {
        this.f283c = pVar;
        this.f281a = new j(((o) pVar.f214e).f814a.b());
    }

    @Override // M1.t
    public final x b() {
        return this.f281a;
    }

    @Override // M1.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f282b) {
            return;
        }
        this.f282b = true;
        p pVar = this.f283c;
        pVar.getClass();
        j jVar = this.f281a;
        x xVar = jVar.f803e;
        jVar.f803e = x.d;
        xVar.a();
        xVar.b();
        pVar.f211a = 3;
    }

    @Override // M1.t, java.io.Flushable
    public final void flush() {
        if (this.f282b) {
            return;
        }
        ((o) this.f283c.f214e).flush();
    }

    @Override // M1.t
    public final void i(M1.f fVar, long j2) {
        if (this.f282b) {
            throw new IllegalStateException("closed");
        }
        long j3 = fVar.f799b;
        byte[] bArr = A1.c.f13a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((o) this.f283c.f214e).i(fVar, j2);
    }
}
