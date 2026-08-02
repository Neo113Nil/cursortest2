package r;

/* loaded from: classes.dex */
public final class e extends android.support.v4.media.session.a {
    @Override // android.support.v4.media.session.a
    public final void F(f fVar, f fVar2) {
        fVar.f10252b = fVar2;
    }

    @Override // android.support.v4.media.session.a
    public final void G(f fVar, Thread thread) {
        fVar.f10251a = thread;
    }

    @Override // android.support.v4.media.session.a
    public final boolean f(g gVar, c cVar) {
        c cVar2 = c.f10244b;
        synchronized (gVar) {
            try {
                if (gVar.f10257b != cVar) {
                    return false;
                }
                gVar.f10257b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f10256a != obj) {
                    return false;
                }
                gVar.f10256a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f10258c != fVar) {
                    return false;
                }
                gVar.f10258c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
