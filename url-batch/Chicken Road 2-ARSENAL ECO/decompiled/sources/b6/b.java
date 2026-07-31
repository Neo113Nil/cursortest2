package b6;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements X5.p {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3624a = new b();

    @Override // X5.p
    public final X5.w a(c6.h hVar) {
        c6.f hVar2;
        q qVar = hVar.f3826a;
        synchronized (qVar) {
            try {
                if (!qVar.f3692r) {
                    throw new IllegalStateException("released");
                }
                if (qVar.f3691q) {
                    throw new IllegalStateException("Check failed.");
                }
                if (qVar.f3690p) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = qVar.f3686l;
        kotlin.jvm.internal.i.b(iVar);
        r a7 = iVar.a();
        X5.s client = qVar.f3680f;
        a7.getClass();
        kotlin.jvm.internal.i.e(client, "client");
        int i7 = hVar.f3832g;
        B0.c cVar = a7.f3703i;
        e6.r rVar = a7.f3705k;
        if (rVar != null) {
            hVar2 = new e6.s(client, a7, hVar, rVar);
        } else {
            a7.f3700f.setSoTimeout(i7);
            n6.y b7 = ((n6.q) cVar.f73i).f5547f.b();
            long j4 = i7;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b7.g(j4);
            ((n6.p) cVar.f71g).f5544f.b().g(hVar.f3833h);
            hVar2 = new d6.h(client, a7, cVar);
        }
        U.a aVar = new U.a(qVar, iVar, hVar2);
        qVar.f3689o = aVar;
        qVar.f3694t = aVar;
        synchronized (qVar) {
            qVar.f3690p = true;
            qVar.f3691q = true;
        }
        if (qVar.f3693s) {
            throw new IOException("Canceled");
        }
        return c6.h.a(hVar, 0, aVar, null, 61).b(hVar.f3830e);
    }
}
