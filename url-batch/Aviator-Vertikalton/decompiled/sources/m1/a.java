package m1;

import i1.q;
import i1.u;
import i1.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3534a = new a();

    @Override // i1.q
    public final y a(n1.f fVar) {
        j jVar = fVar.f3657a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3578l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3577k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3576j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3575g;
        X0.f.b(fVar2);
        u uVar = jVar.f3569a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3662f, fVar.f3663g, fVar.h, uVar.f2751f, !X0.f.a(fVar.f3661e.f2777b, "GET")).j(uVar, fVar));
            jVar.i = eVar;
            jVar.f3580n = eVar;
            synchronized (jVar) {
                jVar.f3576j = true;
                jVar.f3577k = true;
            }
            if (jVar.f3579m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3661e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3605b);
            throw e3;
        }
    }
}
