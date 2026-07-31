package Q0;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class e extends AbstractC0157a {
    @Override // a.AbstractC0157a
    public final void Q(f fVar, f fVar2) {
        fVar.f3105b = fVar2;
    }

    @Override // a.AbstractC0157a
    public final void R(f fVar, Thread thread) {
        fVar.f3104a = thread;
    }

    @Override // a.AbstractC0157a
    public final boolean m(g gVar, c cVar) {
        c cVar2 = c.f3096b;
        synchronized (gVar) {
            try {
                if (gVar.f3111b != cVar) {
                    return false;
                }
                gVar.f3111b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0157a
    public final boolean n(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3110a != obj) {
                    return false;
                }
                gVar.f3110a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0157a
    public final boolean o(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3112c != fVar) {
                    return false;
                }
                gVar.f3112c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
