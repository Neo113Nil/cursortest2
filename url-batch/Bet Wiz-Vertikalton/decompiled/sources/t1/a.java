package t1;

import java.io.IOException;
import p1.q;
import p1.t;

/* loaded from: classes.dex */
public final class a implements p1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3729a = new a();

    @Override // p1.n
    public final t a(u1.f fVar) {
        j jVar = fVar.f3825a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3767l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3766k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3765j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3764g;
        e1.d.b(fVar2);
        q qVar = jVar.f3759a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3829f, fVar.f3830g, fVar.h, qVar.f3395f, !e1.d.a((String) fVar.f3828e.f258b, "GET")).j(qVar, fVar));
            jVar.i = eVar;
            jVar.f3769n = eVar;
            synchronized (jVar) {
                jVar.f3765j = true;
                jVar.f3766k = true;
            }
            if (jVar.f3768m) {
                throw new IOException("Canceled");
            }
            return u1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3828e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3791b);
            throw e3;
        }
    }
}
