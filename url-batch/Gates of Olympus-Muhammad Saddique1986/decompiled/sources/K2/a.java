package K2;

import E.F;
import G2.o;
import G2.r;
import G2.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3262a = new a();

    @Override // G2.o
    public final u a(L2.g gVar) {
        g gVar2 = gVar.f3412a;
        gVar2.getClass();
        synchronized (gVar2) {
            try {
                if (!gVar2.f3298o) {
                    throw new IllegalStateException("released");
                }
                if (gVar2.f3297n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (gVar2.f3296m) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = gVar2.f3293j;
        f2.j.c(dVar);
        r rVar = gVar2.f3287d;
        f2.j.f(rVar, "client");
        try {
            L2.e j3 = dVar.a(gVar.f3417f, gVar.f3418g, gVar.f3419h, rVar.f2255i, !f2.j.a((String) gVar.f3416e.f631d, "GET")).j(rVar, gVar);
            f2.j.f(gVar2, "call");
            f2.j.f(dVar, "finder");
            F f3 = new F();
            f3.f923b = gVar2;
            f3.f924c = dVar;
            f3.f925d = j3;
            f3.f926e = j3.h();
            gVar2.f3295l = f3;
            gVar2.f3300q = f3;
            synchronized (gVar2) {
                gVar2.f3296m = true;
                gVar2.f3297n = true;
            }
            if (gVar2.f3299p) {
                throw new IOException("Canceled");
            }
            return L2.g.a(gVar, 0, f3, null, 61).b(gVar.f3416e);
        } catch (l e3) {
            dVar.c(e3.f3328e);
            throw e3;
        } catch (IOException e4) {
            dVar.c(e4);
            throw new l(e4);
        }
    }
}
