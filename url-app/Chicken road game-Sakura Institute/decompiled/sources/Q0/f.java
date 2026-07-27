package Q0;

/* loaded from: classes.dex */
public final class f extends j0.c {
    @Override // j0.c
    public final void G(g gVar, g gVar2) {
        gVar.f3931b = gVar2;
    }

    @Override // j0.c
    public final void H(g gVar, Thread thread) {
        gVar.f3930a = thread;
    }

    @Override // j0.c
    public final boolean o(h hVar, d dVar) {
        d dVar2 = d.f3922b;
        synchronized (hVar) {
            try {
                if (hVar.f3937e != dVar) {
                    return false;
                }
                hVar.f3937e = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.c
    public final boolean p(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f3936d != obj) {
                    return false;
                }
                hVar.f3936d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j0.c
    public final boolean q(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3938i != gVar) {
                    return false;
                }
                hVar.f3938i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
