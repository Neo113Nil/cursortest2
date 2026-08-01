package p;

import k0.AbstractC0180a;

/* loaded from: classes.dex */
public final class e extends AbstractC0180a {
    @Override // k0.AbstractC0180a
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3307b;
        synchronized (gVar) {
            try {
                if (gVar.f3319b != cVar) {
                    return false;
                }
                gVar.f3319b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.AbstractC0180a
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3318a != obj) {
                    return false;
                }
                gVar.f3318a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.AbstractC0180a
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3320c != fVar) {
                    return false;
                }
                gVar.f3320c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.AbstractC0180a
    public final void p(f fVar, f fVar2) {
        fVar.f3314b = fVar2;
    }

    @Override // k0.AbstractC0180a
    public final void q(f fVar, Thread thread) {
        fVar.f3313a = thread;
    }
}
