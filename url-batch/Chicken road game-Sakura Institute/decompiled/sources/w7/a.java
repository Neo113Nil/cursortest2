package w7;

import c0.w;
import java.io.IOException;
import s7.m;
import s7.p;
import s7.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9529a = new a();

    @Override // s7.m
    public final s a(x7.f fVar) {
        g gVar = fVar.f9688a;
        synchronized (gVar) {
            try {
                if (!gVar.f9562q) {
                    throw new IllegalStateException("released");
                }
                if (gVar.f9561p) {
                    throw new IllegalStateException("Check failed.");
                }
                if (gVar.f9560o) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = gVar.f9557l;
        r6.k.c(dVar);
        p pVar = gVar.f9551f;
        r6.k.f(pVar, "client");
        try {
            x7.d j8 = dVar.a(fVar.f9693f, fVar.f9694g, fVar.f9695h, pVar.f8646k, !r6.k.a((String) fVar.f9692e.f437d, "GET")).j(pVar, fVar);
            r6.k.f(dVar, "finder");
            w wVar = new w();
            wVar.f1514b = gVar;
            wVar.f1515c = dVar;
            wVar.f1516d = j8;
            wVar.f1517e = j8.g();
            gVar.f9559n = wVar;
            gVar.f9564s = wVar;
            synchronized (gVar) {
                gVar.f9560o = true;
                gVar.f9561p = true;
            }
            if (gVar.f9563r) {
                throw new IOException("Canceled");
            }
            return x7.f.a(fVar, 0, wVar, null, 61).b(fVar.f9692e);
        } catch (IOException e9) {
            dVar.c(e9);
            throw new k(e9);
        } catch (k e10) {
            dVar.c(e10.f9588g);
            throw e10;
        }
    }
}
