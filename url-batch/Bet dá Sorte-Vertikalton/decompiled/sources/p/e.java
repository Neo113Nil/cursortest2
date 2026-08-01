package p;

import k0.z;

/* loaded from: classes.dex */
public final class e extends z {
    @Override // k0.z
    public final boolean c(g gVar, C0265c c0265c) {
        C0265c c0265c2 = C0265c.f3402b;
        synchronized (gVar) {
            try {
                if (gVar.f3414b != c0265c) {
                    return false;
                }
                gVar.f3414b = c0265c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.z
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3413a != obj) {
                    return false;
                }
                gVar.f3413a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.z
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3415c != fVar) {
                    return false;
                }
                gVar.f3415c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k0.z
    public final void m(f fVar, f fVar2) {
        fVar.f3409b = fVar2;
    }

    @Override // k0.z
    public final void n(f fVar, Thread thread) {
        fVar.f3408a = thread;
    }
}
