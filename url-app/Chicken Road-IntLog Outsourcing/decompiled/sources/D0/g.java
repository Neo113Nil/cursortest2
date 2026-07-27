package D0;

/* loaded from: classes.dex */
public final class g extends K1.b {
    @Override // K1.b
    public final boolean E(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f429b != dVar) {
                    return false;
                }
                iVar.f429b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final boolean G(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f428a != obj) {
                    return false;
                }
                iVar.f428a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final boolean I(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f430c != hVar) {
                    return false;
                }
                iVar.f430c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final void b0(h hVar, h hVar2) {
        hVar.f423b = hVar2;
    }

    @Override // K1.b
    public final void d0(h hVar, Thread thread) {
        hVar.f422a = thread;
    }
}
