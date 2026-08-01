package c3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends k7.e {
    @Override // k7.e
    public final void H(g gVar, g gVar2) {
        gVar.f1728b = gVar2;
    }

    @Override // k7.e
    public final void I(g gVar, Thread thread) {
        gVar.f1727a = thread;
    }

    @Override // k7.e
    public final boolean f(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f1734e != dVar) {
                    return false;
                }
                hVar.f1734e = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k7.e
    public final boolean g(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f1733d != obj) {
                    return false;
                }
                hVar.f1733d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k7.e
    public final boolean h(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f1735i != gVar) {
                    return false;
                }
                hVar.f1735i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
