package M3;

import T3.k;
import T3.t;
import T3.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k f1773a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1775c;

    public e(g gVar) {
        this.f1775c = gVar;
        this.f1773a = new k(gVar.f1780d.d());
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1774b) {
            return;
        }
        this.f1774b = true;
        k kVar = this.f1773a;
        x xVar = kVar.f2980e;
        kVar.f2980e = x.f3010d;
        xVar.a();
        xVar.b();
        this.f1775c.f1781e = 3;
    }

    @Override // T3.t
    public final x d() {
        return this.f1773a;
    }

    @Override // T3.t, java.io.Flushable
    public final void flush() {
        if (this.f1774b) {
            return;
        }
        this.f1775c.f1780d.flush();
    }

    @Override // T3.t
    public final void o(T3.g gVar, long j4) {
        if (this.f1774b) {
            throw new IllegalStateException("closed");
        }
        long j5 = gVar.f2975b;
        byte[] bArr = H3.b.f1103a;
        if (j4 < 0 || 0 > j5 || j5 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1775c.f1780d.o(gVar, j4);
    }
}
