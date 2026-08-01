package s;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends a {
    @Override // s.a
    public final boolean f(h hVar, d dVar) {
        d dVar2 = d.f3220b;
        synchronized (hVar) {
            try {
                if (hVar.f3233g != dVar) {
                    return false;
                }
                hVar.f3233g = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s.a
    public final boolean g(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f3232f != obj) {
                    return false;
                }
                hVar.f3232f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s.a
    public final boolean h(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.h != gVar) {
                    return false;
                }
                hVar.h = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s.a
    public final void x(g gVar, g gVar2) {
        gVar.f3228b = gVar2;
    }

    @Override // s.a
    public final void y(g gVar, Thread thread) {
        gVar.f3227a = thread;
    }
}
