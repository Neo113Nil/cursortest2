package f;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class e extends a.a {
    @Override // a.a
    public final boolean d(g gVar, c cVar) {
        c cVar2 = c.f248b;
        synchronized (gVar) {
            try {
                if (gVar.f263c != cVar) {
                    return false;
                }
                gVar.f263c = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f262b != obj) {
                    return false;
                }
                gVar.f262b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f264d != fVar) {
                    return false;
                }
                gVar.f264d = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.a
    public final void t(f fVar, f fVar2) {
        fVar.f257b = fVar2;
    }

    @Override // a.a
    public final void u(f fVar, Thread thread) {
        fVar.f256a = thread;
    }
}
