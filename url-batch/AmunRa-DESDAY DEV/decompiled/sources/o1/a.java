package o1;

import java.io.IOException;
import k1.r;
import k1.u;

/* loaded from: classes.dex */
public final class a implements k1.o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3362a = new a();

    @Override // k1.o
    public final u a(p1.f fVar) {
        j jVar = fVar.f3467a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3400l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3399k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3398j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3397g;
        Z0.d.b(fVar2);
        r rVar = jVar.f3392a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3471f, fVar.f3472g, fVar.h, rVar.f2863f, !Z0.d.a((String) fVar.f3470e.f198b, "GET")).j(rVar, fVar));
            jVar.i = eVar;
            jVar.f3402n = eVar;
            synchronized (jVar) {
                jVar.f3398j = true;
                jVar.f3399k = true;
            }
            if (jVar.f3401m) {
                throw new IOException("Canceled");
            }
            return p1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3470e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3424b);
            throw e3;
        }
    }
}
