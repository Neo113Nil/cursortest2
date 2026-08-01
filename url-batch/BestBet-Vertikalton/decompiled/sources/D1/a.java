package D1;

import java.io.IOException;
import z1.s;

/* loaded from: classes.dex */
public final class a implements z1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f148a = new a();

    @Override // z1.m
    public final s a(E1.g gVar) {
        j jVar = gVar.f233a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f186l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f185k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f184j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = jVar.f183g;
        k1.e.b(fVar);
        z1.p pVar = jVar.f178a;
        try {
            e eVar = new e(jVar, fVar, fVar.a(gVar.f237f, gVar.f238g, gVar.h, pVar.f4725f, !k1.e.a((String) gVar.f236e.f482b, "GET")).j(pVar, gVar));
            jVar.i = eVar;
            jVar.f188n = eVar;
            synchronized (jVar) {
                jVar.f184j = true;
                jVar.f185k = true;
            }
            if (jVar.f187m) {
                throw new IOException("Canceled");
            }
            return E1.g.a(gVar, 0, eVar, null, 61).b(gVar.f236e);
        } catch (o e2) {
            fVar.c(e2.f210b);
            throw e2;
        } catch (IOException e3) {
            fVar.c(e3);
            throw new o(e3);
        }
    }
}
