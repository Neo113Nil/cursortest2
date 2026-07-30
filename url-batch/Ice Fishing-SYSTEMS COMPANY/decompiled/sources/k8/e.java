package k8;

import u8.i;
import u8.p;
import u8.v;
import u8.z;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: n, reason: collision with root package name */
    public final i f38842n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38843u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f38844v;

    public e(g gVar) {
        this.f38844v = gVar;
        this.f38842n = new i(((p) gVar.f38849c.f3965w).f41304n.L());
    }

    @Override // u8.v
    public final z L() {
        return this.f38842n;
    }

    @Override // u8.v
    public final void N(long j9, u8.e eVar) {
        if (this.f38843u) {
            throw new IllegalStateException("closed");
        }
        long j10 = eVar.f41277u;
        byte[] bArr = f8.c.f37814a;
        if (j9 >= 0 && 0 <= j10 && j10 >= j9) {
            ((p) this.f38844v.f38849c.f3965w).N(j9, eVar);
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=0, count=0");
    }

    @Override // u8.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38843u) {
            return;
        }
        this.f38843u = true;
        g gVar = this.f38844v;
        gVar.getClass();
        i iVar = this.f38842n;
        z zVar = iVar.f41282e;
        iVar.f41282e = z.f41323d;
        zVar.a();
        zVar.b();
        gVar.f38850d = 3;
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
        if (this.f38843u) {
            return;
        }
        ((p) this.f38844v.f38849c.f3965w).flush();
    }
}
