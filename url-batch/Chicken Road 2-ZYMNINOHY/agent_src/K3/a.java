package K3;

import G3.q;
import G3.s;
import G3.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1527a = new a();

    @Override // G3.q
    public final y a(L3.g gVar) {
        i iVar = gVar.f1670a;
        synchronized (iVar) {
            try {
                if (!iVar.f1572l) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f1571k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f1570j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = iVar.f1567g;
        kotlin.jvm.internal.i.b(fVar);
        s client = iVar.f1561a;
        kotlin.jvm.internal.i.e(client, "client");
        try {
            e eVar = new e(iVar, fVar, fVar.c(gVar.f1675f, gVar.f1676g, gVar.f1677h, client.f982f, !kotlin.jvm.internal.i.a(gVar.f1674e.f1013b, "GET")).j(client, gVar));
            iVar.f1569i = eVar;
            iVar.n = eVar;
            synchronized (iVar) {
                iVar.f1570j = true;
                iVar.f1571k = true;
            }
            if (iVar.f1573m) {
                throw new IOException("Canceled");
            }
            return L3.g.a(gVar, 0, eVar, null, 61).b(gVar.f1674e);
        } catch (m e4) {
            fVar.e(e4.f1594b);
            throw e4;
        } catch (IOException e5) {
            fVar.e(e5);
            throw new m(e5);
        }
    }
}
