package w0;

import b6.f0;
import m0.s0;
import r.x0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends b {
    @Override // w0.b
    public final b C(p6.c cVar, p6.c cVar2) {
        return (b) ((f) m.f(new x0(new s0(1, cVar, cVar2), 1)));
    }

    @Override // w0.b, w0.f
    public final void c() {
        synchronized (m.f7537c) {
            o();
        }
    }

    @Override // w0.b, w0.f
    public final void k() {
        q.l();
        throw null;
    }

    @Override // w0.b, w0.f
    public final void l() {
        q.l();
        throw null;
    }

    @Override // w0.b, w0.f
    public final void m() {
        m.a();
    }

    @Override // w0.b, w0.f
    public final f u(p6.c cVar) {
        return (e) ((f) m.f(new x0(new f0(3, cVar), 1)));
    }

    @Override // w0.b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
