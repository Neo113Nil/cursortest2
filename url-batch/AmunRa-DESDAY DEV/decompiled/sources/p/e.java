package p;

/* loaded from: classes.dex */
public final class e extends k1.c {
    @Override // k1.c
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3440b;
        synchronized (gVar) {
            try {
                if (gVar.f3453b != cVar) {
                    return false;
                }
                gVar.f3453b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.c
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3452a != obj) {
                    return false;
                }
                gVar.f3452a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.c
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3454c != fVar) {
                    return false;
                }
                gVar.f3454c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.c
    public final void u(f fVar, f fVar2) {
        fVar.f3448b = fVar2;
    }

    @Override // k1.c
    public final void v(f fVar, Thread thread) {
        fVar.f3447a = thread;
    }
}
