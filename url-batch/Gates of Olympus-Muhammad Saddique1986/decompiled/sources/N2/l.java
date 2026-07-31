package N2;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import e2.InterfaceC0422a;
import java.io.IOException;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class l implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3625d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3627f;

    public /* synthetic */ l(V v3, Object obj, int i3) {
        this.f3625d = i3;
        this.f3626e = v3;
        this.f3627f = obj;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f3625d) {
            case 0:
                p pVar = (p) this.f3627f;
                t tVar = (t) this.f3626e;
                try {
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                } catch (Throwable th) {
                    pVar.a(3, 3, null);
                    H2.b.c(tVar);
                    throw th;
                }
                if (!tVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (tVar.a(false, this)) {
                }
                pVar.a(1, 9, null);
                H2.b.c(tVar);
                return R1.y.f4171a;
            case 1:
                J1.a aVar = ((J1.b) this.f3627f).f3164a;
                Q1.c cVar = (Q1.c) this.f3626e;
                AbstractC0837y.r(P.j(cVar), null, null, new Q1.a(cVar, aVar, null), 3);
                return R1.y.f4171a;
            default:
                Q1.j jVar = (Q1.j) this.f3626e;
                J1.d dVar = (J1.d) this.f3627f;
                f2.j.f(dVar, "haircut");
                AbstractC0837y.r(P.j(jVar), null, null, new Q1.i(jVar, dVar, null), 3);
                return R1.y.f4171a;
        }
    }

    public l(p pVar, t tVar) {
        this.f3625d = 0;
        this.f3627f = pVar;
        this.f3626e = tVar;
    }
}
