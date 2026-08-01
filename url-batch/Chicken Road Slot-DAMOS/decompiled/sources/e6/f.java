package e6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends c6.f {
    @Override // c6.f
    public final void T(g gVar, g gVar2) {
        gVar.f3943b = gVar2;
    }

    @Override // c6.f
    public final void U(g gVar, Thread thread) {
        gVar.f3942a = thread;
    }

    @Override // c6.f
    public final boolean h(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3949e != cVar) {
                    return false;
                }
                hVar.f3949e = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.f
    public final boolean i(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f3948d != obj) {
                    return false;
                }
                hVar.f3948d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.f
    public final boolean j(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f3950i != gVar) {
                    return false;
                }
                hVar.f3950i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
