package p;

import i1.s;

/* loaded from: classes.dex */
public final class e extends s {
    @Override // i1.s
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f3385b;
        synchronized (gVar) {
            try {
                if (gVar.f3397b != cVar) {
                    return false;
                }
                gVar.f3397b = cVar2;
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
                if (gVar.f3396a != obj) {
                    return false;
                }
                gVar.f3396a = obj2;
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
                if (gVar.f3398c != fVar) {
                    return false;
                }
                gVar.f3398c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.s
    public final void p(f fVar, f fVar2) {
        fVar.f3392b = fVar2;
    }

    @Override // i1.s
    public final void q(f fVar, Thread thread) {
        fVar.f3391a = thread;
    }
}
