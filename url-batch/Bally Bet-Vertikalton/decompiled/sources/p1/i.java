package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3410e = i;
        this.f3411f = obj;
        this.f3412g = obj2;
    }

    @Override // l1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3410e) {
            case 0:
                o oVar = (o) this.f3411f;
                oVar.f3428a.a(oVar, (H.j) ((X0.g) this.f3412g).f1020b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3411f).f3428a.b((w) this.f3412g);
                    return -1L;
                } catch (IOException e2) {
                    q1.n nVar = q1.n.f3555a;
                    q1.n nVar2 = q1.n.f3555a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3411f).f3430c;
                    nVar2.getClass();
                    q1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3412g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3411f;
                H.j jVar = (H.j) this.f3412g;
                kVar.getClass();
                X0.g gVar = new X0.g(0);
                o oVar2 = kVar.f3417b;
                synchronized (oVar2.f3447w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3441q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f1020b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f3429b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3429b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f1020b;
                                X0.d.e(jVar4, "<set-?>");
                                oVar2.f3441q = jVar4;
                                oVar2.f3434j.c(new i(oVar2.f3430c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f1020b;
                            X0.d.e(jVar42, "<set-?>");
                            oVar2.f3441q = jVar42;
                            oVar2.f3434j.c(new i(oVar2.f3430c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3447w.e((H.j) gVar.f1020b);
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
                        wVar.f3477f += c2;
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
