package r;

/* loaded from: classes.dex */
public final class f extends A3.c {
    @Override // A3.c
    public final boolean A(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5838g != dVar) {
                    return false;
                }
                hVar.f5838g = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A3.c
    public final boolean B(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f5837f != obj) {
                    return false;
                }
                hVar.f5837f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A3.c
    public final boolean C(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f5839h != gVar) {
                    return false;
                }
                hVar.f5839h = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A3.c
    public final void V(g gVar, g gVar2) {
        gVar.f5832b = gVar2;
    }

    @Override // A3.c
    public final void W(g gVar, Thread thread) {
        gVar.f5831a = thread;
    }
}
