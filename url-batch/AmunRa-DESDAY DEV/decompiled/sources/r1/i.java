package r1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends n1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3554e = i;
        this.f3555f = obj;
        this.f3556g = obj2;
    }

    @Override // n1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3554e) {
            case 0:
                o oVar = (o) this.f3555f;
                oVar.f3572a.a(oVar, (H.j) ((Z0.g) this.f3556g).f1067b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3555f).f3572a.b((w) this.f3556g);
                    return -1L;
                } catch (IOException e2) {
                    s1.n nVar = s1.n.f3825a;
                    s1.n nVar2 = s1.n.f3825a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3555f).f3574c;
                    nVar2.getClass();
                    s1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3556g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3555f;
                H.j jVar = (H.j) this.f3556g;
                kVar.getClass();
                Z0.g gVar = new Z0.g(0);
                o oVar2 = kVar.f3561b;
                synchronized (oVar2.f3591w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3585q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f1067b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f3573b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3573b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f1067b;
                                Z0.d.e(jVar4, "<set-?>");
                                oVar2.f3585q = jVar4;
                                oVar2.f3578j.c(new i(oVar2.f3574c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f1067b;
                            Z0.d.e(jVar42, "<set-?>");
                            oVar2.f3585q = jVar42;
                            oVar2.f3578j.c(new i(oVar2.f3574c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3591w.f((H.j) gVar.f1067b);
                    } catch (IOException e3) {
                        oVar2.f(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f3621f += c2;
                        if (c2 > 0) {
                            wVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
