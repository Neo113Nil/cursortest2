package m1;

import i1.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements i1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3198a = new a();

    @Override // i1.n
    public final u a(n1.f fVar) {
        j jVar = fVar.f3308a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3236l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3235k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3234j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3233g;
        X0.d.b(fVar2);
        i1.p pVar = jVar.f3228a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3312f, fVar.f3313g, fVar.h, pVar.f2483f, !X0.d.a((String) fVar.f3311e.f212b, "GET")).j(pVar, fVar));
            jVar.i = eVar;
            jVar.f3238n = eVar;
            synchronized (jVar) {
                jVar.f3234j = true;
                jVar.f3235k = true;
            }
            if (jVar.f3237m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3311e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3260b);
            throw e3;
        }
    }
}
