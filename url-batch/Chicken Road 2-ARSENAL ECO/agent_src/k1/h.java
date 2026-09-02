package k1;

import U0.t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n f5157a = new n();

    public final void a(Object obj) {
        this.f5157a.k(obj);
    }

    public final boolean b(Exception exc) {
        n nVar = this.f5157a;
        nVar.getClass();
        t.g(exc, "Exception must not be null");
        synchronized (nVar.f5169a) {
            try {
                if (nVar.f5171c) {
                    return false;
                }
                nVar.f5171c = true;
                nVar.f5174f = exc;
                nVar.f5170b.d(nVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        n nVar = this.f5157a;
        synchronized (nVar.f5169a) {
            try {
                if (nVar.f5171c) {
                    return;
                }
                nVar.f5171c = true;
                nVar.f5173e = obj;
                nVar.f5170b.d(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
