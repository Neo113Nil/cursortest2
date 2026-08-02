package M3;

import T3.h;
import T3.k;
import T3.t;
import T3.x;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k f1764a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1766c;

    public b(g gVar) {
        this.f1766c = gVar;
        this.f1764a = new k(gVar.f1780d.d());
    }

    @Override // T3.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1765b) {
            return;
        }
        this.f1765b = true;
        this.f1766c.f1780d.h("0\r\n\r\n");
        k kVar = this.f1764a;
        x xVar = kVar.f2980e;
        kVar.f2980e = x.f3010d;
        xVar.a();
        xVar.b();
        this.f1766c.f1781e = 3;
    }

    @Override // T3.t
    public final x d() {
        return this.f1764a;
    }

    @Override // T3.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1765b) {
            return;
        }
        this.f1766c.f1780d.flush();
    }

    @Override // T3.t
    public final void o(T3.g gVar, long j4) {
        h hVar = this.f1766c.f1780d;
        if (this.f1765b) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return;
        }
        hVar.i(j4);
        hVar.h(IOUtils.LINE_SEPARATOR_WINDOWS);
        hVar.o(gVar, j4);
        hVar.h(IOUtils.LINE_SEPARATOR_WINDOWS);
    }
}
