package d6;

import n6.j;
import n6.p;
import n6.u;
import n6.y;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: f, reason: collision with root package name */
    public final j f3984f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f3986h;

    public f(h hVar) {
        this.f3986h = hVar;
        this.f3984f = new j(((p) hVar.f3991c.f71g).f5544f.b());
    }

    @Override // n6.u
    public final y b() {
        return this.f3984f;
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3985g) {
            return;
        }
        this.f3985g = true;
        j jVar = this.f3984f;
        y yVar = jVar.f5529e;
        jVar.f5529e = y.f5562d;
        yVar.a();
        yVar.b();
        this.f3986h.f3992d = 3;
    }

    @Override // n6.u, java.io.Flushable
    public final void flush() {
        if (this.f3985g) {
            return;
        }
        ((p) this.f3986h.f3991c.f71g).flush();
    }

    @Override // n6.u
    public final void l(long j4, n6.f fVar) {
        if (this.f3985g) {
            throw new IllegalStateException("closed");
        }
        long j7 = fVar.f5524g;
        byte[] bArr = Y5.c.f3099a;
        if (j4 >= 0 && 0 <= j7 && j7 >= j4) {
            ((p) this.f3986h.f3991c.f71g).l(j4, fVar);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j7 + ", offset=0, count=0");
    }
}
