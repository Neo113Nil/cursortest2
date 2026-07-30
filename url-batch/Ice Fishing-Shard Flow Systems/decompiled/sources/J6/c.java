package J6;

import T6.j;
import T6.p;
import T6.u;
import T6.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: d, reason: collision with root package name */
    public final j f1398d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1399e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f1400i;

    public c(h hVar) {
        this.f1400i = hVar;
        this.f1398d = new j(((p) hVar.f1413c.f332l).f2637d.b());
    }

    @Override // T6.u
    public final y b() {
        return this.f1398d;
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1399e) {
            return;
        }
        this.f1399e = true;
        ((p) this.f1400i.f1413c.f332l).A("0\r\n\r\n");
        h.k(this.f1400i, this.f1398d);
        this.f1400i.f1414d = 3;
    }

    @Override // T6.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1399e) {
            return;
        }
        ((p) this.f1400i.f1413c.f332l).flush();
    }

    @Override // T6.u
    public final void x(long j, T6.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f1399e) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        p pVar = (p) this.f1400i.f1413c.f332l;
        if (pVar.f2639i) {
            throw new IllegalStateException("closed");
        }
        pVar.f2638e.J(j);
        pVar.a();
        pVar.A("\r\n");
        pVar.x(j, source);
        pVar.A("\r\n");
    }
}
