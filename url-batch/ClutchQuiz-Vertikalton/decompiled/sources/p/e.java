package p;

/* loaded from: classes.dex */
public final class e extends h0.g {
    @Override // h0.g
    public final boolean a(g gVar, C0309c c0309c) {
        C0309c c0309c2 = C0309c.f3374b;
        synchronized (gVar) {
            try {
                if (gVar.f3386b != c0309c) {
                    return false;
                }
                gVar.f3386b = c0309c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.g
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f3385a != obj) {
                    return false;
                }
                gVar.f3385a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.g
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f3387c != fVar) {
                    return false;
                }
                gVar.f3387c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.g
    public final void i(f fVar, f fVar2) {
        fVar.f3381b = fVar2;
    }

    @Override // h0.g
    public final void j(f fVar, Thread thread) {
        fVar.f3380a = thread;
    }
}
