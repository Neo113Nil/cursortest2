package K1;

import t1.u;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f1428a = new p();

    public final void a(Exception exc) {
        this.f1428a.m(exc);
    }

    public final void b(Object obj) {
        this.f1428a.l(obj);
    }

    public final boolean c(Exception exc) {
        p pVar = this.f1428a;
        pVar.getClass();
        u.g(exc, "Exception must not be null");
        synchronized (pVar.f1447a) {
            try {
                if (pVar.f1449c) {
                    return false;
                }
                pVar.f1449c = true;
                pVar.f1452f = exc;
                pVar.f1448b.c(pVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        p pVar = this.f1428a;
        synchronized (pVar.f1447a) {
            try {
                if (pVar.f1449c) {
                    return;
                }
                pVar.f1449c = true;
                pVar.f1451e = obj;
                pVar.f1448b.c(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
