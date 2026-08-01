package q;

import h0.d0;

/* loaded from: classes.dex */
public final class e extends d0 {
    @Override // h0.d0
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f3482b;
        synchronized (gVar) {
            try {
                if (gVar.f3495b != cVar) {
                    return false;
                }
                gVar.f3495b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.d0
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3494a != obj) {
                    return false;
                }
                gVar.f3494a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.d0
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3496c != fVar) {
                    return false;
                }
                gVar.f3496c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.d0
    public final void o(f fVar, f fVar2) {
        fVar.f3490b = fVar2;
    }

    @Override // h0.d0
    public final void p(f fVar, Thread thread) {
        fVar.f3489a = thread;
    }
}
