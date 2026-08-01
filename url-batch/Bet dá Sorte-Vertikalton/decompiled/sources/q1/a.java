package q1;

import java.io.IOException;
import m1.q;
import m1.t;

/* loaded from: classes.dex */
public final class a implements m1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3496a = new a();

    @Override // m1.n
    public final t a(r1.f fVar) {
        j jVar = fVar.f3573a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3534l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3533k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3532j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3531g;
        b1.d.b(fVar2);
        q qVar = jVar.f3526a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3577f, fVar.f3578g, fVar.h, qVar.f3248f, !b1.d.a((String) fVar.f3576e.f274b, "GET")).j(qVar, fVar));
            jVar.i = eVar;
            jVar.f3536n = eVar;
            synchronized (jVar) {
                jVar.f3532j = true;
                jVar.f3533k = true;
            }
            if (jVar.f3535m) {
                throw new IOException("Canceled");
            }
            return r1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3576e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3558b);
            throw e3;
        }
    }
}
