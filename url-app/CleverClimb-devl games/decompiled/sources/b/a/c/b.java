package b.a.c;

import b.aa;
import b.ac;
import b.u;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: CallServerInterceptor.java */
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1860a;

    public b(boolean z) {
        this.f1860a = z;
    }

    @Override // b.u
    public ac intercept(u.a aVar) throws IOException {
        ac a2;
        g gVar = (g) aVar;
        c d2 = gVar.d();
        b.a.b.g c2 = gVar.c();
        b.a.b.c cVar = (b.a.b.c) gVar.b();
        aa a3 = gVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        d2.a(a3);
        ac.a aVar2 = null;
        if (f.c(a3.b()) && a3.d() != null) {
            if ("100-continue".equalsIgnoreCase(a3.a("Expect"))) {
                d2.a();
                aVar2 = d2.a(true);
            }
            if (aVar2 == null) {
                c.d a4 = c.k.a(d2.a(a3, a3.d().b()));
                a3.d().a(a4);
                a4.close();
            } else if (!cVar.e()) {
                c2.d();
            }
        }
        d2.b();
        if (aVar2 == null) {
            aVar2 = d2.a(false);
        }
        ac a5 = aVar2.a(a3).a(c2.b().d()).a(currentTimeMillis).b(System.currentTimeMillis()).a();
        int b2 = a5.b();
        if (this.f1860a && b2 == 101) {
            a2 = a5.g().a(b.a.c.f1855c).a();
        } else {
            a2 = a5.g().a(d2.a(a5)).a();
        }
        if ("close".equalsIgnoreCase(a2.a().a("Connection")) || "close".equalsIgnoreCase(a2.a("Connection"))) {
            c2.d();
        }
        if ((b2 != 204 && b2 != 205) || a2.f().b() <= 0) {
            return a2;
        }
        throw new ProtocolException("HTTP " + b2 + " had non-zero Content-Length: " + a2.f().b());
    }
}
