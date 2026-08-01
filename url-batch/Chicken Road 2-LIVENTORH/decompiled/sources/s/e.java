package s;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends h.a {
    @Override // h.a
    public final void X(f fVar, f fVar2) {
        fVar.f3167b = fVar2;
    }

    @Override // h.a
    public final void Y(f fVar, Thread thread) {
        fVar.f3166a = thread;
    }

    @Override // h.a
    public final boolean h(g gVar, c cVar) {
        c cVar2 = c.f3158b;
        synchronized (gVar) {
            try {
                if (gVar.f3172g != cVar) {
                    return false;
                }
                gVar.f3172g = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h.a
    public final boolean i(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3171f != obj) {
                    return false;
                }
                gVar.f3171f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h.a
    public final boolean j(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3173h != fVar) {
                    return false;
                }
                gVar.f3173h = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
