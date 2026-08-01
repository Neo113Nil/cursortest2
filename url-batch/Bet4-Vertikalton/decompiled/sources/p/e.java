package p;

/* loaded from: classes.dex */
public final class e extends h1.d {
    @Override // h1.d
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f3414b;
        synchronized (gVar) {
            try {
                if (gVar.f3426b != cVar) {
                    return false;
                }
                gVar.f3426b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h1.d
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3425a != obj) {
                    return false;
                }
                gVar.f3425a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h1.d
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3427c != fVar) {
                    return false;
                }
                gVar.f3427c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h1.d
    public final void n(f fVar, f fVar2) {
        fVar.f3421b = fVar2;
    }

    @Override // h1.d
    public final void o(f fVar, Thread thread) {
        fVar.f3420a = thread;
    }
}
