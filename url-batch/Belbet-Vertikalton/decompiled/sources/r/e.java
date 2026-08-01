package r;

import a.AbstractC0058a;

/* loaded from: classes.dex */
public final class e extends AbstractC0058a {
    @Override // a.AbstractC0058a
    public final void S(f fVar, f fVar2) {
        fVar.f4021b = fVar2;
    }

    @Override // a.AbstractC0058a
    public final void T(f fVar, Thread thread) {
        fVar.f4020a = thread;
    }

    @Override // a.AbstractC0058a
    public final boolean g(g gVar, c cVar) {
        c cVar2 = c.f4014b;
        synchronized (gVar) {
            try {
                if (gVar.f4026b != cVar) {
                    return false;
                }
                gVar.f4026b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0058a
    public final boolean h(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f4025a != obj) {
                    return false;
                }
                gVar.f4025a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0058a
    public final boolean i(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f4027c != fVar) {
                    return false;
                }
                gVar.f4027c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
