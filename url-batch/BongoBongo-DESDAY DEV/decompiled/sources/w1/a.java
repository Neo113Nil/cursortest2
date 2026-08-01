package w1;

import java.io.IOException;
import s1.r;

/* loaded from: classes.dex */
public final class a implements s1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4206a = new a();

    @Override // s1.m
    public final r a(x1.f fVar) {
        j jVar = fVar.f4291a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f4246l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f4245k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f4244j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f4242g;
        h1.d.b(fVar2);
        s1.o oVar = jVar.f4237a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f4295f, fVar.f4296g, fVar.f4297h, oVar.f3665f, !h1.d.a((String) fVar.f4294e.f320b, "GET")).j(oVar, fVar));
            jVar.i = eVar;
            jVar.f4248n = eVar;
            synchronized (jVar) {
                jVar.f4244j = true;
                jVar.f4245k = true;
            }
            if (jVar.f4247m) {
                throw new IOException("Canceled");
            }
            return x1.f.a(fVar, 0, eVar, null, 61).b(fVar.f4294e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f4271b);
            throw e3;
        }
    }
}
