package r;

import h0.a0;

/* loaded from: classes.dex */
public final class e extends a0 {
    @Override // h0.a0
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3406b;
        synchronized (gVar) {
            try {
                if (gVar.f3418b != cVar) {
                    return false;
                }
                gVar.f3418b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.a0
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3417a != obj) {
                    return false;
                }
                gVar.f3417a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.a0
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3419c != fVar) {
                    return false;
                }
                gVar.f3419c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.a0
    public final void p(f fVar, f fVar2) {
        fVar.f3413b = fVar2;
    }

    @Override // h0.a0
    public final void q(f fVar, Thread thread) {
        fVar.f3412a = thread;
    }
}
