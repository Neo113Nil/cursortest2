package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3426e = i;
        this.f3427f = obj;
        this.f3428g = obj2;
    }

    @Override // l1.a
    public final long a() {
        long b2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3426e) {
            case 0:
                o oVar = (o) this.f3427f;
                oVar.f3444a.a(oVar, (H.j) ((X0.g) this.f3428g).f1017b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3427f).f3444a.b((w) this.f3428g);
                    return -1L;
                } catch (IOException e2) {
                    q1.n nVar = q1.n.f3571a;
                    q1.n nVar2 = q1.n.f3571a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3427f).f3446c;
                    nVar2.getClass();
                    q1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3428g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3427f;
                H.j jVar = (H.j) this.f3428g;
                kVar.getClass();
                X0.g gVar = new X0.g(0);
                o oVar2 = kVar.f3433b;
                synchronized (oVar2.f3463w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3457q;
                            H.j jVar3 = new H.j();
                            jVar3.d(jVar2);
                            jVar3.d(jVar);
                            gVar.f1017b = jVar3;
                            b2 = jVar3.b() - jVar2.b();
                            if (b2 != 0 && !oVar2.f3445b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3445b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f1017b;
                                X0.d.e(jVar4, "<set-?>");
                                oVar2.f3457q = jVar4;
                                oVar2.f3450j.c(new i(oVar2.f3446c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f1017b;
                            X0.d.e(jVar42, "<set-?>");
                            oVar2.f3457q = jVar42;
                            oVar2.f3450j.c(new i(oVar2.f3446c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3463w.e((H.j) gVar.f1017b);
                    } catch (IOException e3) {
                        oVar2.e(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f3493f += b2;
                        if (b2 > 0) {
                            wVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
