package m1;

import i1.t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements i1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3182a = new a();

    @Override // i1.n
    public final t a(n1.f fVar) {
        j jVar = fVar.f3292a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3220l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3219k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3218j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3217g;
        X0.d.b(fVar2);
        i1.o oVar = jVar.f3212a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3296f, fVar.f3297g, fVar.h, oVar.f2467f, !X0.d.a((String) fVar.f3295e.f212b, "GET")).j(oVar, fVar));
            jVar.i = eVar;
            jVar.f3222n = eVar;
            synchronized (jVar) {
                jVar.f3218j = true;
                jVar.f3219k = true;
            }
            if (jVar.f3221m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3295e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3244b);
            throw e3;
        }
    }
}
