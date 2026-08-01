package s1;

import java.io.IOException;
import o1.s;

/* loaded from: classes.dex */
public final class a implements o1.m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3690a = new a();

    @Override // o1.m
    public final s a(t1.f fVar) {
        j jVar = fVar.f3806a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (!jVar.f3728l) {
                    throw new IllegalStateException("released");
                }
                if (jVar.f3727k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jVar.f3726j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = jVar.f3725g;
        d1.d.b(fVar2);
        o1.p pVar = jVar.f3720a;
        try {
            e eVar = new e(jVar, fVar2, fVar2.a(fVar.f3810f, fVar.f3811g, fVar.h, pVar.f3349f, !d1.d.a((String) fVar.f3809e.f260b, "GET")).j(pVar, fVar));
            jVar.i = eVar;
            jVar.f3730n = eVar;
            synchronized (jVar) {
                jVar.f3726j = true;
                jVar.f3727k = true;
            }
            if (jVar.f3729m) {
                throw new IOException("Canceled");
            }
            return t1.f.a(fVar, 0, eVar, null, 61).b(fVar.f3809e);
        } catch (IOException e2) {
            fVar2.c(e2);
            throw new o(e2);
        } catch (o e3) {
            fVar2.c(e3.f3752b);
            throw e3;
        }
    }
}
