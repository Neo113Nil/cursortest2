package R0;

/* loaded from: classes.dex */
public final class g extends P0.f {
    @Override // P0.f
    public final void B(h hVar, h hVar2) {
        hVar.f2390b = hVar2;
    }

    @Override // P0.f
    public final void D(h hVar, Thread thread) {
        hVar.f2389a = thread;
    }

    @Override // P0.f
    public final boolean f(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f2396e != dVar) {
                    return false;
                }
                iVar.f2396e = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P0.f
    public final boolean h(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f2395d != obj) {
                    return false;
                }
                iVar.f2395d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P0.f
    public final boolean j(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f2397i != hVar) {
                    return false;
                }
                iVar.f2397i = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
