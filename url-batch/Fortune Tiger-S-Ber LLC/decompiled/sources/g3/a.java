package g3;

import c3.q;
import c3.u;
import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements c3.n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1921a = new a();

    @Override // c3.n
    public final u a(h3.g gVar) {
        i iVar = gVar.f2021a;
        synchronized (iVar) {
            try {
                if (!iVar.f1952q) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f1951p) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f1950o) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f1947l;
        u2.c.b(eVar);
        q qVar = iVar.f1943f;
        try {
            d dVar = new d(iVar, eVar, eVar.a(gVar.f2025f, gVar.g, gVar.h, qVar.f1105k, !u2.c.a(gVar.f2024e.f1128b, "GET")).j(qVar, gVar));
            iVar.f1949n = dVar;
            iVar.f1954s = dVar;
            synchronized (iVar) {
                iVar.f1950o = true;
                iVar.f1951p = true;
            }
            if (iVar.f1953r) {
                throw new IOException("Canceled");
            }
            return h3.g.a(gVar, 0, dVar, null, 61).b(gVar.f2024e);
        } catch (n e4) {
            eVar.c(e4.g);
            throw e4;
        } catch (IOException e5) {
            eVar.c(e5);
            throw new n(e5);
        }
    }
}
