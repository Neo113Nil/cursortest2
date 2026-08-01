package m1;

import i1.q;
import i1.u;
import i1.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3538a = new a();

    @Override // i1.q
    public final y a(n1.f fVar) {
        j jVar = fVar.f3661a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3582l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3581k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3580j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3579g;
        X0.f.b(fVar2);
        u uVar = jVar.f3573a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3666f, fVar.f3667g, fVar.h, uVar.f2755f, !X0.f.a(fVar.f3665e.f2781b, "GET")).j(uVar, fVar));
            jVar.i = eVar;
            jVar.f3584n = eVar;
            synchronized (jVar) {
                jVar.f3580j = true;
                jVar.f3581k = true;
            }
            if (jVar.f3583m) {
                throw new IOException("Canceled");
            }
            return n1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3665e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3609b);
            throw e3;
        }
    }
}
