package p;

import k0.k;

/* loaded from: classes.dex */
public final class e extends k {
    @Override // k0.k
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3366b;
        synchronized (gVar) {
            try {
                if (gVar.f3378b != cVar) {
                    return false;
                }
                gVar.f3378b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3377a != obj) {
                    return false;
                }
                gVar.f3377a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3379c != fVar) {
                    return false;
                }
                gVar.f3379c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final void q(f fVar, f fVar2) {
        fVar.f3373b = fVar2;
    }

    @Override // k0.k
    public final void r(f fVar, Thread thread) {
        fVar.f3372a = thread;
    }
}
