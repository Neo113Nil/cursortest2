package p;

import k0.k;

/* loaded from: classes.dex */
public final class e extends k {
    @Override // k0.k
    public final boolean a(g gVar, c cVar) {
        c cVar2 = c.f3272b;
        synchronized (gVar) {
            try {
                if (gVar.f3284b != cVar) {
                    return false;
                }
                gVar.f3284b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3283a != obj) {
                    return false;
                }
                gVar.f3283a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3285c != fVar) {
                    return false;
                }
                gVar.f3285c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.k
    public final void p(f fVar, f fVar2) {
        fVar.f3279b = fVar2;
    }

    @Override // k0.k
    public final void q(f fVar, Thread thread) {
        fVar.f3278a = thread;
    }
}
