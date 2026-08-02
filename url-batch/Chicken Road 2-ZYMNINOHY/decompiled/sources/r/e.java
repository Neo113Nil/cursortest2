package r;

/* loaded from: classes.dex */
public final class e extends V3.b {
    @Override // V3.b
    public final boolean g(g gVar, C1389c c1389c, C1389c c1389c2) {
        synchronized (gVar) {
            try {
                if (gVar.f15111b != c1389c) {
                    return false;
                }
                gVar.f15111b = c1389c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V3.b
    public final boolean h(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f15110a != obj) {
                    return false;
                }
                gVar.f15110a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V3.b
    public final boolean i(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15112c != fVar) {
                    return false;
                }
                gVar.f15112c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V3.b
    public final void v(f fVar, f fVar2) {
        fVar.f15105b = fVar2;
    }

    @Override // V3.b
    public final void w(f fVar, Thread thread) {
        fVar.f15104a = thread;
    }
}
