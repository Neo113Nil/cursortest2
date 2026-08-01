package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v extends mv {
    @Override // defpackage.mv
    public final void J(w wVar, w wVar2) {
        wVar.b = wVar2;
    }

    @Override // defpackage.mv
    public final void K(w wVar, Thread thread) {
        wVar.a = thread;
    }

    @Override // defpackage.mv
    public final boolean d(x xVar, t tVar) {
        t tVar2 = t.b;
        synchronized (xVar) {
            try {
                if (xVar.g != tVar) {
                    return false;
                }
                xVar.g = tVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mv
    public final boolean e(x xVar, Object obj, Object obj2) {
        synchronized (xVar) {
            try {
                if (xVar.f != obj) {
                    return false;
                }
                xVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mv
    public final boolean f(x xVar, w wVar, w wVar2) {
        synchronized (xVar) {
            try {
                if (xVar.h != wVar) {
                    return false;
                }
                xVar.h = wVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
