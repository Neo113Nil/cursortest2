package t1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3857e = i;
        this.f3858f = obj;
        this.f3859g = obj2;
    }

    @Override // p1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3857e) {
            case 0:
                o oVar = (o) this.f3858f;
                oVar.f3875a.a(oVar, (H.j) ((b1.g) this.f3859g).f1587b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3858f).f3875a.b((w) this.f3859g);
                    return -1L;
                } catch (IOException e2) {
                    u1.n nVar = u1.n.f3966a;
                    u1.n nVar2 = u1.n.f3966a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3858f).f3877c;
                    nVar2.getClass();
                    u1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3859g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3858f;
                H.j jVar = (H.j) this.f3859g;
                kVar.getClass();
                b1.g gVar = new b1.g(0);
                o oVar2 = kVar.f3864b;
                synchronized (oVar2.f3894w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3888q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f1587b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f3876b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3876b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f1587b;
                                b1.d.e(jVar4, "<set-?>");
                                oVar2.f3888q = jVar4;
                                oVar2.f3881j.c(new i(oVar2.f3877c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f1587b;
                            b1.d.e(jVar42, "<set-?>");
                            oVar2.f3888q = jVar42;
                            oVar2.f3881j.c(new i(oVar2.f3877c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3894w.g((H.j) gVar.f1587b);
                    } catch (IOException e3) {
                        oVar2.g(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f3924f += c2;
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
