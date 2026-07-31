package v2;

import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends o {
    @Override // r2.o
    public final void e0(f fVar, f fVar2) {
        fVar.f7471b = fVar2;
    }

    @Override // r2.o
    public final void i0(f fVar, Thread thread) {
        fVar.f7470a = thread;
    }

    @Override // r2.o
    public final boolean m(g gVar, c cVar) {
        c cVar2 = c.f7462b;
        synchronized (gVar) {
            try {
                if (gVar.f7476e != cVar) {
                    return false;
                }
                gVar.f7476e = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.o
    public final boolean n(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f7475d != obj) {
                    return false;
                }
                gVar.f7475d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.o
    public final boolean o(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f7477f != fVar) {
                    return false;
                }
                gVar.f7477f = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
