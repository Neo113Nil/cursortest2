package p;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends m0.a {
    @Override // m0.a
    public final boolean d(g gVar, c cVar) {
        c cVar2 = c.f3003b;
        synchronized (gVar) {
            try {
                if (gVar.g != cVar) {
                    return false;
                }
                gVar.g = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3015f != obj) {
                    return false;
                }
                gVar.f3015f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.h != fVar) {
                    return false;
                }
                gVar.h = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.a
    public final void v(f fVar, f fVar2) {
        fVar.f3010b = fVar2;
    }

    @Override // m0.a
    public final void w(f fVar, Thread thread) {
        fVar.f3009a = thread;
    }
}
