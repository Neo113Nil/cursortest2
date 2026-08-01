package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r extends l70 {
    @Override // defpackage.l70
    public final void J(s sVar, s sVar2) {
        sVar.b = sVar2;
    }

    @Override // defpackage.l70
    public final void K(s sVar, Thread thread) {
        sVar.a = thread;
    }

    @Override // defpackage.l70
    public final boolean c(t tVar, p pVar) {
        p pVar2 = p.b;
        synchronized (tVar) {
            try {
                if (tVar.g != pVar) {
                    return false;
                }
                tVar.g = pVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l70
    public final boolean d(t tVar, Object obj, Object obj2) {
        synchronized (tVar) {
            try {
                if (tVar.f != obj) {
                    return false;
                }
                tVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l70
    public final boolean e(t tVar, s sVar, s sVar2) {
        synchronized (tVar) {
            try {
                if (tVar.h != sVar) {
                    return false;
                }
                tVar.h = sVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
