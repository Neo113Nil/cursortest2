package p;

import i1.r;

/* loaded from: classes.dex */
public final class e extends r {
    @Override // i1.r
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3753b;
        synchronized (gVar) {
            try {
                if (gVar.f3767b != cVar) {
                    return false;
                }
                gVar.f3767b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3766a != obj) {
                    return false;
                }
                gVar.f3766a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3768c != fVar) {
                    return false;
                }
                gVar.f3768c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.r
    public final void o(f fVar, f fVar2) {
        fVar.f3761b = fVar2;
    }

    @Override // i1.r
    public final void p(f fVar, Thread thread) {
        fVar.f3760a = thread;
    }
}
