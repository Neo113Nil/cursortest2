package v1;

import java.io.IOException;
import r1.q;
import r1.t;

/* loaded from: classes.dex */
public final class a implements r1.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4016a = new a();

    @Override // r1.n
    public final t a(w1.f fVar) {
        j jVar = fVar.f4098a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f4054l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f4053k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f4052j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f4051g;
        g1.d.b(fVar2);
        q qVar = jVar.f4046a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f4102f, fVar.f4103g, fVar.h, qVar.f3495f, !g1.d.a((String) fVar.f4101e.f277b, "GET")).j(qVar, fVar));
            jVar.i = eVar;
            jVar.f4056n = eVar;
            synchronized (jVar) {
                jVar.f4052j = true;
                jVar.f4053k = true;
            }
            if (jVar.f4055m) {
                throw new IOException("Canceled");
            }
            return w1.f.a(fVar, 0, eVar, null, 61).b(fVar.f4101e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f4078b);
            throw e3;
        }
    }
}
