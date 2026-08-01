package p;

import i1.s;

/* loaded from: classes.dex */
public final class e extends s {
    @Override // i1.s
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f3386b;
        synchronized (gVar) {
            try {
                if (gVar.f3398b != cVar) {
                    return false;
                }
                gVar.f3398b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3397a != obj) {
                    return false;
                }
                gVar.f3397a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3399c != fVar) {
                    return false;
                }
                gVar.f3399c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final void p(f fVar, f fVar2) {
        fVar.f3393b = fVar2;
    }

    @Override // i1.s
    public final void q(f fVar, Thread thread) {
        fVar.f3392a = thread;
    }
}
