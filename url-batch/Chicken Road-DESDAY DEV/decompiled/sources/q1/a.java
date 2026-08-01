package q1;

import java.io.IOException;
import m1.s;

/* loaded from: classes.dex */
public final class a implements m1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3443a = new a();

    @Override // m1.m
    public final s a(r1.f fVar) {
        j jVar = fVar.f3519a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3481l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3480k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3479j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3478g;
        b1.d.b(fVar2);
        m1.p pVar = jVar.f3473a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3523f, fVar.f3524g, fVar.h, pVar.f3215f, !b1.d.a((String) fVar.f3522e.f205b, "GET")).j(pVar, fVar));
            jVar.i = eVar;
            jVar.f3483n = eVar;
            synchronized (jVar) {
                jVar.f3479j = true;
                jVar.f3480k = true;
            }
            if (jVar.f3482m) {
                throw new IOException("Canceled");
            }
            return r1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3522e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3505b);
            throw e3;
        }
    }
}
