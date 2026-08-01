package v1;

import java.io.IOException;
import r1.r;

/* loaded from: classes.dex */
public final class a implements r1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3846a = new a();

    @Override // r1.m
    public final r a(w1.f fVar) {
        j jVar = fVar.f3942a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3884l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3883k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3882j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3881g;
        g1.d.b(fVar2);
        r1.o oVar = jVar.f3876a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3946f, fVar.f3947g, fVar.h, oVar.f3511f, !g1.d.a((String) fVar.f3945e.f358b, "GET")).j(oVar, fVar));
            jVar.i = eVar;
            jVar.f3886n = eVar;
            synchronized (jVar) {
                jVar.f3882j = true;
                jVar.f3883k = true;
            }
            if (jVar.f3885m) {
                throw new IOException("Canceled");
            }
            return w1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3945e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3908b);
            throw e3;
        }
    }
}
