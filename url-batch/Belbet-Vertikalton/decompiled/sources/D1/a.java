package D1;

import java.io.IOException;
import z1.s;
import z1.v;

/* loaded from: classes.dex */
public final class a implements z1.p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f203a = new a();

    @Override // z1.p
    public final v a(E1.g gVar) {
        j jVar = gVar.f305a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f243l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f242k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = jVar.f240g;
        j1.h.b(fVar);
        s sVar = jVar.f235a;
        try {
            e eVar = new e(jVar, fVar, fVar.a(gVar.f309f, gVar.f310g, gVar.f311h, sVar.f4909f, !j1.h.a((String) gVar.e.f625b, "GET")).j(sVar, gVar));
            jVar.i = eVar;
            jVar.f245n = eVar;
            synchronized (jVar) {
                jVar.j = true;
                jVar.f242k = true;
            }
            if (jVar.f244m) {
                throw new IOException("Canceled");
            }
            return E1.g.a(gVar, 0, eVar, null, 61).b(gVar.e);
        } catch (o e) {
            fVar.c(e.f269b);
            throw e;
        } catch (IOException e2) {
            fVar.c(e2);
            throw new o(e2);
        }
    }
}
