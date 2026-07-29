package b.a.b;

import b.aa;
import b.ac;
import b.u;
import b.x;
import java.io.IOException;

/* compiled from: ConnectInterceptor.java */
/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final x f1832a;

    public a(x xVar) {
        this.f1832a = xVar;
    }

    @Override // b.u
    public ac intercept(u.a aVar) throws IOException {
        b.a.c.g gVar = (b.a.c.g) aVar;
        aa a2 = gVar.a();
        g c2 = gVar.c();
        return gVar.a(a2, c2, c2.a(this.f1832a, !a2.b().equals("GET")), c2.b());
    }
}
