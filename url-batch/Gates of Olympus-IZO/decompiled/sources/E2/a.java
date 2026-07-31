package E2;

import A2.r;
import A2.u;
import A2.y;
import E.G;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f773a = new a();

    @Override // A2.r
    public final y a(F2.g gVar) {
        h hVar = gVar.f1492a;
        hVar.getClass();
        synchronized (hVar) {
            try {
                if (!hVar.f813o) {
                    throw new IllegalStateException("released");
                }
                if (hVar.f812n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (hVar.f811m) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = hVar.f808j;
        Z1.i.c(eVar);
        u uVar = hVar.f802d;
        Z1.i.f(uVar, "client");
        try {
            F2.e j3 = eVar.a(gVar.f1497f, gVar.f1498g, gVar.f1499h, uVar.f167i, !Z1.i.a((String) gVar.f1496e.f194c, "GET")).j(uVar, gVar);
            Z1.i.f(hVar, "call");
            Z1.i.f(eVar, "finder");
            G g3 = new G();
            g3.f622b = hVar;
            g3.f623c = eVar;
            g3.f624d = j3;
            g3.f625e = j3.h();
            hVar.f810l = g3;
            hVar.f814q = g3;
            synchronized (hVar) {
                hVar.f811m = true;
                hVar.f812n = true;
            }
            if (hVar.p) {
                throw new IOException("Canceled");
            }
            return F2.g.a(gVar, 0, g3, null, 61).b(gVar.f1496e);
        } catch (m e3) {
            eVar.c(e3.f841e);
            throw e3;
        } catch (IOException e4) {
            eVar.c(e4);
            throw new m(e4);
        }
    }
}
