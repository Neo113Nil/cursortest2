package p;

import c1.AbstractC0091d;

/* loaded from: classes.dex */
public final class e extends AbstractC0091d {
    @Override // c1.AbstractC0091d
    public final boolean b(g gVar, C0297c c0297c) {
        C0297c c0297c2 = C0297c.f3610b;
        synchronized (gVar) {
            try {
                if (gVar.f3622b != c0297c) {
                    return false;
                }
                gVar.f3622b = c0297c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0091d
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3621a != obj) {
                    return false;
                }
                gVar.f3621a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0091d
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3623c != fVar) {
                    return false;
                }
                gVar.f3623c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.AbstractC0091d
    public final void p(f fVar, f fVar2) {
        fVar.f3617b = fVar2;
    }

    @Override // c1.AbstractC0091d
    public final void q(f fVar, Thread thread) {
        fVar.f3616a = thread;
    }
}
