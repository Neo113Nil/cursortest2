package g2;

import B1.C0097d;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f6702b;

    public /* synthetic */ g(h hVar, int i2) {
        this.f6701a = i2;
        this.f6702b = hVar;
    }

    private final void c(l2.i iVar) {
    }

    public final void a(l2.i iVar, t tVar, x xVar, x xVar2) {
        switch (this.f6701a) {
            case 0:
                this.f6702b.e(new f(this, iVar, xVar2));
                break;
            default:
                e2.n nVar = this.f6702b.f6705c;
                ArrayList e4 = iVar.f7984a.e();
                HashMap a4 = iVar.f7985b.a();
                Long valueOf = tVar != null ? Long.valueOf(tVar.f6759a) : null;
                y.t tVar2 = new y.t(21, this, xVar2, false);
                nVar.getClass();
                e2.m mVar = new e2.m(e4, a4);
                C0097d c0097d = nVar.f6235x;
                if (c0097d.y()) {
                    c0097d.d("Listening on " + mVar, null, new Object[0]);
                }
                HashMap hashMap = nVar.f6226o;
                M1.a.F(!hashMap.containsKey(mVar), "listen() called twice for same QuerySpec.", new Object[0]);
                if (c0097d.y()) {
                    c0097d.d("Adding listen query: " + mVar, null, new Object[0]);
                }
                e2.k kVar = new e2.k(tVar2, mVar, valueOf, xVar);
                hashMap.put(mVar, kVar);
                if (nVar.a()) {
                    nVar.j(kVar);
                }
                nVar.b();
                break;
        }
    }

    public final void b(l2.i iVar) {
        switch (this.f6701a) {
            case 0:
                break;
            default:
                e2.n nVar = this.f6702b.f6705c;
                ArrayList e4 = iVar.f7984a.e();
                HashMap a4 = iVar.f7985b.a();
                nVar.getClass();
                e2.m mVar = new e2.m(e4, a4);
                C0097d c0097d = nVar.f6235x;
                if (c0097d.y()) {
                    c0097d.d("unlistening on " + mVar, null, new Object[0]);
                }
                e2.k f4 = nVar.f(mVar);
                if (f4 != null && nVar.a()) {
                    HashMap hashMap = new HashMap();
                    e2.m mVar2 = f4.f6198b;
                    hashMap.put("p", M1.a.M(mVar2.f6205a));
                    Long l4 = f4.f6200d;
                    if (l4 != null) {
                        hashMap.put("q", mVar2.f6206b);
                        hashMap.put("t", l4);
                    }
                    nVar.l("n", false, hashMap, null);
                }
                nVar.b();
                break;
        }
    }
}
