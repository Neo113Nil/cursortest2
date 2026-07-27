package I1;

import o1.u;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final o f1248a = new o();

    public final void a(Exception exc) {
        this.f1248a.j(exc);
    }

    public final void b(Object obj) {
        this.f1248a.k(obj);
    }

    public final boolean c(Exception exc) {
        o oVar = this.f1248a;
        oVar.getClass();
        u.h(exc, "Exception must not be null");
        synchronized (oVar.f1263a) {
            try {
                if (oVar.f1265c) {
                    return false;
                }
                oVar.f1265c = true;
                oVar.f1268f = exc;
                oVar.f1264b.c(oVar);
                return true;
            } finally {
            }
        }
    }

    public final void d(Object obj) {
        o oVar = this.f1248a;
        synchronized (oVar.f1263a) {
            try {
                if (oVar.f1265c) {
                    return;
                }
                oVar.f1265c = true;
                oVar.f1267e = obj;
                oVar.f1264b.c(oVar);
            } finally {
            }
        }
    }
}
