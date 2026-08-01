package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3800e = i;
        this.f3801f = obj;
        this.f3802g = obj2;
    }

    @Override // l1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3800e) {
            case 0:
                o oVar = (o) this.f3801f;
                oVar.f3818a.a(oVar, (H.j) ((X0.i) this.f3802g).f875b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3801f).f3818a.b((w) this.f3802g);
                    return -1L;
                } catch (IOException e2) {
                    q1.n nVar = q1.n.f3964a;
                    q1.n nVar2 = q1.n.f3964a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3801f).f3820c;
                    nVar2.getClass();
                    q1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3802g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3801f;
                H.j jVar = (H.j) this.f3802g;
                kVar.getClass();
                X0.i iVar = new X0.i(0);
                o oVar2 = kVar.f3807b;
                synchronized (oVar2.f3838w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3832q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            iVar.f875b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f3819b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3819b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) iVar.f875b;
                                X0.f.e(jVar4, "<set-?>");
                                oVar2.f3832q = jVar4;
                                oVar2.f3825j.c(new i(oVar2.f3820c + " onSettings", oVar2, iVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) iVar.f875b;
                            X0.f.e(jVar42, "<set-?>");
                            oVar2.f3832q = jVar42;
                            oVar2.f3825j.c(new i(oVar2.f3820c + " onSettings", oVar2, iVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3838w.g((H.j) iVar.f875b);
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
                        wVar.f3874f += c2;
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
