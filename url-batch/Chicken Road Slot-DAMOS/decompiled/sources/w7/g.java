package w7;

import c7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f10117a = new n();

    public final void a(Object obj) {
        this.f10117a.l(obj);
    }

    public final boolean b(Exception exc) {
        n nVar = this.f10117a;
        nVar.getClass();
        c0.h(exc, "Exception must not be null");
        synchronized (nVar.f10132a) {
            try {
                if (nVar.f10134c) {
                    return false;
                }
                nVar.f10134c = true;
                nVar.f10137f = exc;
                nVar.f10133b.c(nVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        n nVar = this.f10117a;
        synchronized (nVar.f10132a) {
            try {
                if (nVar.f10134c) {
                    return;
                }
                nVar.f10134c = true;
                nVar.f10136e = obj;
                nVar.f10133b.c(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
