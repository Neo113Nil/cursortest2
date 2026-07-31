package w0;

/* loaded from: classes.dex */
public final class f extends i6.g {
    @Override // i6.g
    public final boolean d(h hVar, C0711c c0711c, C0711c c0711c2) {
        synchronized (hVar) {
            try {
                if (hVar.f6174g != c0711c) {
                    return false;
                }
                hVar.f6174g = c0711c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i6.g
    public final boolean e(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f6173f != obj) {
                    return false;
                }
                hVar.f6173f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i6.g
    public final boolean f(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f6175h != gVar) {
                    return false;
                }
                hVar.f6175h = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i6.g
    public final void t(g gVar, g gVar2) {
        gVar.f6168b = gVar2;
    }

    @Override // i6.g
    public final void u(g gVar, Thread thread) {
        gVar.f6167a = thread;
    }
}
