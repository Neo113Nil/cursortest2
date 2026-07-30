package q0;

import g0.v0;
import k.a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(int i7, l lVar) {
        super(i7, lVar, null, r2);
        q6.c cVar;
        synchronized (n.f7427b) {
            ?? r12 = n.f7433h;
            r6.k.f(r12, "<this>");
            cVar = (q6.c) (r12.size() == 1 ? r12.get(0) : null);
            cVar = cVar == null ? new g4.p(4, r12) : cVar;
        }
    }

    @Override // q0.c
    public final c B(q6.c cVar, q6.c cVar2) {
        return (c) ((g) n.f(new v0(new a(cVar, cVar2, 0), 3)));
    }

    @Override // q0.c, q0.g
    public final void c() {
        synchronized (n.f7427b) {
            int i7 = this.f7405d;
            if (i7 >= 0) {
                n.u(i7);
                this.f7405d = -1;
            }
        }
    }

    @Override // q0.c, q0.g
    public final void k() {
        r.g();
        throw null;
    }

    @Override // q0.c, q0.g
    public final void l() {
        r.g();
        throw null;
    }

    @Override // q0.c, q0.g
    public final void m() {
        n.a();
    }

    @Override // q0.c, q0.g
    public final g t(q6.c cVar) {
        return (g) n.f(new v0(new a0(cVar, 2), 3));
    }

    @Override // q0.c
    public final r v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
