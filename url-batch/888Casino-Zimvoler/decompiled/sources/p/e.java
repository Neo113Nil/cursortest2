package p;

import i1.r;

/* loaded from: classes.dex */
public final class e extends r {
    @Override // i1.r
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f3364b;
        synchronized (gVar) {
            try {
                if (gVar.f3376b != cVar) {
                    return false;
                }
                gVar.f3376b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3375a != obj) {
                    return false;
                }
                gVar.f3375a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3377c != fVar) {
                    return false;
                }
                gVar.f3377c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final void p(f fVar, f fVar2) {
        fVar.f3371b = fVar2;
    }

    @Override // i1.r
    public final void q(f fVar, Thread thread) {
        fVar.f3370a = thread;
    }
}
