package o;

import a.AbstractC0132a;

/* loaded from: classes.dex */
public final class e extends AbstractC0132a {
    @Override // a.AbstractC0132a
    public final void A(f fVar, f fVar2) {
        fVar.f3317b = fVar2;
    }

    @Override // a.AbstractC0132a
    public final void B(f fVar, Thread thread) {
        fVar.f3316a = thread;
    }

    @Override // a.AbstractC0132a
    public final boolean h(g gVar, c cVar) {
        c cVar2 = c.f3308b;
        synchronized (gVar) {
            try {
                if (gVar.f3323b != cVar) {
                    return false;
                }
                gVar.f3323b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0132a
    public final boolean i(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3322a != obj) {
                    return false;
                }
                gVar.f3322a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0132a
    public final boolean j(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3324c != fVar) {
                    return false;
                }
                gVar.f3324c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
