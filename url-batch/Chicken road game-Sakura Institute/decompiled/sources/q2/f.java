package q2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends a8.d {
    @Override // a8.d
    public final void R(g gVar, g gVar2) {
        gVar.f7503b = gVar2;
    }

    @Override // a8.d
    public final void S(g gVar, Thread thread) {
        gVar.f7502a = thread;
    }

    @Override // a8.d
    public final boolean q(h hVar, d dVar) {
        d dVar2 = d.f7494b;
        synchronized (hVar) {
            try {
                if (hVar.f7509g != dVar) {
                    return false;
                }
                hVar.f7509g = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a8.d
    public final boolean r(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f7508f != obj) {
                    return false;
                }
                hVar.f7508f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a8.d
    public final boolean s(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f7510h != gVar) {
                    return false;
                }
                hVar.f7510h = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
