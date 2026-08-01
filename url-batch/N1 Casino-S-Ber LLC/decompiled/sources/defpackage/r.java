package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class r extends jw {
    @Override // defpackage.jw
    public final void T(s sVar, s sVar2) {
        sVar.b = sVar2;
    }

    @Override // defpackage.jw
    public final void U(s sVar, Thread thread) {
        sVar.a = thread;
    }

    @Override // defpackage.jw
    public final boolean m(t tVar, p pVar) {
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

    @Override // defpackage.jw
    public final boolean n(t tVar, Object obj, Object obj2) {
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

    @Override // defpackage.jw
    public final boolean o(t tVar, s sVar, s sVar2) {
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
