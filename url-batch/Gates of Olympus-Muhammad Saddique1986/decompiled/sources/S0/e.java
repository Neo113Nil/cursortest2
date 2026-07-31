package S0;

import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class e extends AbstractC0508a {
    @Override // h2.AbstractC0508a
    public final void M(f fVar, f fVar2) {
        fVar.f4298b = fVar2;
    }

    @Override // h2.AbstractC0508a
    public final void N(f fVar, Thread thread) {
        fVar.f4297a = thread;
    }

    @Override // h2.AbstractC0508a
    public final boolean r(g gVar, c cVar) {
        c cVar2 = c.f4289b;
        synchronized (gVar) {
            try {
                if (gVar.f4304b != cVar) {
                    return false;
                }
                gVar.f4304b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h2.AbstractC0508a
    public final boolean s(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f4303a != obj) {
                    return false;
                }
                gVar.f4303a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h2.AbstractC0508a
    public final boolean t(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f4305c != fVar) {
                    return false;
                }
                gVar.f4305c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
